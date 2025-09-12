import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class SimplePdfReaderAnnotator {

    private JFrame frame;
    private JTextArea annotationArea;
    private PDDocument document;
    private int currentPageIndex = 0;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                SimplePdfReaderAnnotator window = new SimplePdfReaderAnnotator();
                window.frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public SimplePdfReaderAnnotator() {
        frame = new JFrame("Simple PDF Reader & Annotator");
        frame.setBounds(100, 100, 800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        annotationArea = new JTextArea();
        annotationArea.setEditable(true);
        frame.add(annotationArea, BorderLayout.EAST);

        JButton openButton = new JButton("Open PDF");
        openButton.addActionListener(this::openPdf);
        frame.add(openButton, BorderLayout.NORTH);

        JButton saveButton = new JButton("Save Annotation");
        saveButton.addActionListener(this::saveAnnotation);
        frame.add(saveButton, BorderLayout.SOUTH);
    }

    // Open PDF file and display it
    private void openPdf(ActionEvent e) {
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(frame);
        if (result == JFileChooser.APPROVE_OPTION) {
            File pdfFile = fileChooser.getSelectedFile();
            try {
                document = PDDocument.load(pdfFile);
                showPage(currentPageIndex);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    // Save annotation on the PDF
    private void saveAnnotation(ActionEvent e) {
        if (document == null) {
            return;
        }

        String annotation = annotationArea.getText();
        if (annotation.isEmpty()) {
            return;
        }

        try {
            PDPage page = document.getPage(currentPageIndex);
            PDPageContentStream contentStream = new PDPageContentStream(document, page, PDPageContentStream.AppendMode.APPEND, true);
            contentStream.beginText();
            contentStream.setFont(PDType1Font.HELVETICA_BOLD, 12);
            contentStream.newLineAtOffset(100, 500); // Position of the annotation
            contentStream.showText(annotation);
            contentStream.endText();
            contentStream.close();

            // Save the document with the annotation
            document.save("Annotated_" + System.currentTimeMillis() + ".pdf");
            JOptionPane.showMessageDialog(frame, "Annotation saved successfully!");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    // Show the page of the PDF (in a simplified way)
    private void showPage(int pageIndex) {
        if (document == null || pageIndex >= document.getNumberOfPages()) {
            return;
        }

        PDPage page = document.getPage(pageIndex);
        // Add the page rendering logic here if required.
        // This example doesn't render the PDF page visually (it's very simplified).
    }
}
