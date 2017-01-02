package Scripts;

import com.itextpdf.text.Document;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import javax.swing.JOptionPane;


public class PDFMaker {

    public void genPdf(String nameDoc, String rutaConstancia) {
          float left = 0;
            float right = 0;
            float top = 0;
            float bottom = 0;
        Document pdfconstancia = new Document(PageSize.LETTER, left, right, top, bottom);

        try {
            PdfWriter.getInstance(pdfconstancia, new FileOutputStream("C:/izcaliCourses/Constances/" + nameDoc + ".pdf"));
            pdfconstancia.open();
           
           Image image1 = Image.getInstance(rutaConstancia);
           pdfconstancia.add(image1);
           pdfconstancia.add(new Paragraph("Hello World!"));
            pdfconstancia.close();
        } catch (Exception e) {
          JOptionPane.showMessageDialog(null, "ERROR in the PDF building Code 29");
        }
    }
}
