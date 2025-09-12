import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class FileManager {

    // 1. Create a file
    public static void createFile(String path) throws IOException {
        File file = new File(path);
        if (file.createNewFile()) {
            System.out.println("File created: " + file.getName());
        } else {
            System.out.println("File already exists.");
        }
    }

    // 2. Create a folder
    public static void createFolder(String path) {
        File folder = new File(path);
        if (folder.mkdirs()) {
            System.out.println("Folder created: " + folder.getName());
        } else {
            System.out.println("Folder already exists.");
        }
    }

    // 3. Write content to a file
    public static void writeFile(String path, String content) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(path));
        writer.write(content);
        writer.close();
        System.out.println("Written to file: " + path);
    }

    // 4. Read content from a file
    public static void readFile(String path) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(path));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }

    // 5. Filter/search files in a directory by extension
    public static void searchFiles(String directory, String extension) {
        File dir = new File(directory);
        if (dir.isDirectory()) {
            File[] files = dir.listFiles((dir1, name) -> name.endsWith(extension));
            if (files != null) {
                for (File file : files) {
                    System.out.println(file.getName());
                }
            }
        }
    }

    // 6. Traverse directories recursively
    public static void traverseDirectory(File dir) {
        if (dir.isDirectory()) {
            File[] files = dir.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isDirectory()) {
                        System.out.println("Directory: " + file.getName());
                        traverseDirectory(file);
                    } else {
                        System.out.println("File: " + file.getName());
                    }
                }
            }
        }
    }

    // 7. Delete a file or folder
    public static void deleteFileOrFolder(String path) {
        File file = new File(path);
        if (file.exists()) {
            if (file.isDirectory()) {
                File[] files = file.listFiles();
                if (files != null) {
                    for (File f : files) {
                        deleteFileOrFolder(f.getAbsolutePath());
                    }
                }
            }
            if (file.delete()) {
                System.out.println("Deleted: " + file.getName());
            } else {
                System.out.println("Failed to delete: " + file.getName());
            }
        } else {
            System.out.println("File/Folder does not exist.");
        }
    }

    public static void main(String[] args) throws IOException {
        // Testing all functionalities

        // 1. Create folder and file
        createFolder("example_folder");
        createFile("example_folder/sample.txt");

        // 2. Write to the file
        writeFile("example_folder/sample.txt", "Hello, this is a test content.");

        // 3. Read the file content
        System.out.println("Reading file content:");
        readFile("example_folder/sample.txt");

        // 4. Search for files with .txt extension in the folder
        System.out.println("Searching for .txt files:");
        searchFiles("example_folder", ".txt");

        // 5. Traverse the directory
        System.out.println("Traversing directory:");
        File rootDir = new File("example_folder");
        traverseDirectory(rootDir);

        // 6. Delete the file and folder
        deleteFileOrFolder("example_folder/sample.txt");
        deleteFileOrFolder("example_folder");
    }
}
