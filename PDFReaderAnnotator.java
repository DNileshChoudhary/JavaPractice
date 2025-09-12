import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.PDAnnotationTextMarkup;
import org.apache.pdfbox.pdmodel.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.PDAnnotation;

import java.io.File;
import java.io.IOException;

public class PDFReaderAnnotator {

    public static void main(String[] args) {
        try {
            // Load an existing PDF document
            File file = new File("input.pdf");
            PDDocument document = PDDocument.load(file);

            // Read the first page of the PDF
            PDPage page = document.getPage(0);

            // Add annotation (highlighting text as an example)
            addTextAnnotation(page, "This is an annotation example", 100, 500);

            // Save the annotated document
            document.save("annotated_output.pdf");

            // Close the document
            document.close();

            System.out.println("PDF annotated successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to add a text annotation to a specific page
    public static void addTextAnnotation(PDPage page, String text, float x, float y) throws IOException {
        // Create annotation text markup
        PDAnnotationTextMarkup highlight = new PDAnnotationTextMarkup(PDAnnotationTextMarkup.SUB_TYPE_HIGHLIGHT);

        // Set the position and size of the annotation
        float width = 200;
        float height = 20;
        highlight.setRectangle(new PDRectangle(x, y, width, height));

        // Add the annotation to the page
        page.getAnnotations().add(highlight);

        // Create content stream for adding text to the page (not a traditional annotation)
        PDPageContentStream contentStream = new PDPageContentStream(
                page.getDocument(), page, PDPageContentStream.AppendMode.APPEND, true);

        // Add some text to the page at the desired location
        contentStream.setFont(PDType1Font.HELVETICA_BOLD, 12);
        contentStream.beginText();
        contentStream.newLineAtOffset(x, y + height); // Adjust Y offset to avoid overlap
        contentStream.showText(text);
        contentStream.endText();
        contentStream.close();
    }
}