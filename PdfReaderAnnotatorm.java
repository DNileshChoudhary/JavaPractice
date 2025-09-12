import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.rendering.PDFRenderer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class PdfReaderAnnotator {
    private JFrame frame;
    private JPanel panel;
    private JButton openButton;
    private JButton saveButton;
    private PDDocument document;
    private String currentPdfFile;
    private JTextArea annotationArea;
    private int currentPageIndex = 0;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                PdfReaderAnnotator window = new PdfReaderAnnotator();
                window.frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public PdfReaderAnnotator() {
        frame = new JFrame("PDF Reader & Annotator");
        frame.setBounds(100, 100, 800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new BorderLayout());

        panel = new JPanel();
        frame.getContentPane().add(panel, BorderLayout.CENTER);
        panel.setLayout(new BorderLayout());

        openButton = new JButton("Open PDF");
        openButton.addActionListener(e -> openPdf());
        frame.getContentPane().add(openButton, BorderLayout.NORTH);

        saveButton = new JButton("Save Annotation");
        saveButton.addActionListener(e -> saveAnnotation());
        frame.getContentPane().add(saveButton, BorderLayout.SOUTH);

        annotationArea = new JTextArea();
        annotationArea.setEditable(true);
        panel.add(annotationArea, BorderLayout.EAST);
    }

    private void openPdf() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Select PDF File");
        int result = fileChooser.showOpenDialog(frame);
        if (result == JFileChooser.APPROVE_OPTION) {
            currentPdfFile = fileChooser.getSelectedFile().getAbsolutePath();
            try {
                document = PDDocument.load(new File(currentPdfFile));
                showPage(currentPageIndex);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void showPage(int pageIndex) {
        if (document == null || pageIndex >= document.getNumberOfPages()) {
            return;
        }

        PDPage page = document.getPage(pageIndex);
        panel.removeAll();

        // Render the page
        PdfPagePanel pagePanel = new PdfPagePanel(page);
        panel.add(pagePanel, BorderLayout.CENTER);
        panel.revalidate();
        panel.repaint();
    }

    private void saveAnnotation() {
        if (document == null) {
            return;
        }

        String annotation = annotationArea.getText();
        if (annotation.isEmpty()) {
            return;
        }

        PDPage page = document.getPage(currentPageIndex);
        try {
            PDPageContentStream contentStream = new PDPageContentStream(document, page, PDPageContentStream.AppendMode.APPEND, true);
            contentStream.beginText();
            contentStream.setFont(PDType1Font.HELVETICA_BOLD, 12);
            contentStream.newLineAtOffset(100, 500); // Change position for annotation
            contentStream.showText(annotation);
            contentStream.endText();
            contentStream.close();
            JOptionPane.showMessageDialog(frame, "Annotation saved successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Custom JPanel to render PDF page using Graphics2D
    class PdfPagePanel extends JPanel {
        private PDPage page;

        public PdfPagePanel(PDPage page) {
            this.page = page;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;

            try {
                PDRectangle mediaBox = page.getMediaBox();
                int width = (int) mediaBox.getWidth();
                int height = (int) mediaBox.getHeight();

                // Create a PDF renderer to render the page content as an image
                PDFRenderer renderer = new PDFRenderer(document);
                renderer.renderPageToGraphics(currentPageIndex, g2d, width, height);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
