import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Structure;
import javax.swing.JOptionPane;
import java.util.Arrays;
import java.util.List;

public class BatteryNotifier {
    
    public interface Kernel32 extends Library {
        Kernel32 INSTANCE = Native.load("kernel32", Kernel32.class);

        class SYSTEM_POWER_STATUS extends Structure {
            public byte ACLineStatus;
            public byte BatteryFlag;
            public byte BatteryLifePercent;
            public byte Reserved1;
            public int BatteryLifeTime;
            public int BatteryFullLifeTime;

            @Override
            protected List<String> getFieldOrder() {
                return Arrays.asList("ACLineStatus", "BatteryFlag", "BatteryLifePercent", "Reserved1", "BatteryLifeTime", "BatteryFullLifeTime");
            }
        }

        boolean GetSystemPowerStatus(SYSTEM_POWER_STATUS result);
    }

    public static void main(String[] args) {
        while (true) {
            Kernel32.SYSTEM_POWER_STATUS batteryStatus = new Kernel32.SYSTEM_POWER_STATUS();
            if (Kernel32.INSTANCE.GetSystemPowerStatus(batteryStatus)) {
                int batteryPercentage = batteryStatus.BatteryLifePercent;

                if (batteryPercentage > 0 && batteryPercentage <= 20) {  // Low battery threshold
                    JOptionPane.showMessageDialog(null, "⚠ Battery Low! (" + batteryPercentage + "%) Please plug in your charger.", "Battery Warning", JOptionPane.WARNING_MESSAGE);
                    break;  // Stop checking after notification
                }
            }

            try {
                Thread.sleep(60000); // Check battery every 60 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
