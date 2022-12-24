/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import Data.Consultation;
import Data.LigneOrdonannce;
import Data.Patient;
import Data.User;
import java.io.FileOutputStream;
import java.util.Date;

import com.itextpdf.text.Anchor;
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chapter;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.List;
import com.itextpdf.text.ListItem;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Section;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.ColumnText;
import com.itextpdf.text.pdf.PdfContentByte;
import static com.itextpdf.text.pdf.PdfContentByte.ALIGN_CENTER;
import com.itextpdf.text.pdf.PdfDocument;
import com.itextpdf.text.pdf.PdfGState;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.draw.LineSeparator;
import com.itextpdf.text.pdf.draw.VerticalPositionMark;
import static com.mindfusion.common.Vector.left;
import static com.mindfusion.common.Vector.right;
import static com.mindfusion.drawing.ImageAlignment.Left;
import com.mindfusion.drawing.TextAlignment;
import java.awt.Color;
import java.awt.Desktop;
import java.io.File;

public class OrdonnancePDF {

    private static String FILE = "ordonnance";

    private static Font catFont = new Font(Font.FontFamily.TIMES_ROMAN, 25, Font.BOLD);
    private static Font redFont = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.NORMAL, BaseColor.RED);
    private static Font subFont = new Font(Font.FontFamily.TIMES_ROMAN, 16,
            Font.BOLD);
    private static Font smallBold = new Font(Font.FontFamily.TIMES_ROMAN, 12,
            Font.BOLD);

    private static OrdonnancePDF singleton = null;

    private User doctor;
    private Consultation consultation;
    private Patient patient;
    private java.util.List<LigneOrdonannce> lignesOrdonnances;

    public static OrdonnancePDF getSingleton() {
        if (singleton == null) {
            singleton = new OrdonnancePDF();
        }

        return singleton;
    }

    public static void main(String[] args) {
        getSingleton();

        User doctor = User.getById(1);
        Consultation consultation = Consultation.getById(3);
        Patient patient = Patient.getById(consultation.getIdPatient());
        java.util.List<LigneOrdonannce> lignesOrdonnance = LigneOrdonannce.rechercher(" idConsultation = '" + consultation.getId() + "' ");

        singleton.setDoctor(doctor);
        singleton.setConsultation(consultation);
        singleton.setPatient(patient);
        singleton.setLignesOrdonnances(lignesOrdonnance);

        singleton.generatePDF();
    }

    public void setDoctor(User doctor) {
        this.doctor = doctor;
    }

    public void setLignesOrdonnances(java.util.List<LigneOrdonannce> lignesOrdonnances) {
        this.lignesOrdonnances = lignesOrdonnances;
    }

    public void setConsultation(Consultation consultation) {
        this.consultation = consultation;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public void generatePDF() {
        try {
            String fileName = FILE + utils.DateUtil.getCurrentDateTime().replaceAll(":", "__").replaceAll(" ", "_") + ".pdf";
            Document document = new Document();
            PdfWriter pdfWriter = PdfWriter.getInstance(document, new FileOutputStream(fileName));

            document.open();
            document.newPage();
            
            //Meta Data ...
            document.addTitle("ORDONANCE");
            document.addSubject("ordonnance");
            document.addKeywords(" GASTRO ... ");
            document.addAuthor("Lars Vogel");
            document.addCreator("Lars Vogel");

            //Add content ...
            Paragraph preface = new Paragraph();
            // We add one empty line
            addEmptyLine(preface, 1);
            // Lets write a big header
           

             Chunk admin = new Chunk(" CHU BEN BADIS- CONSTANTINE", catFont);
              Paragraph p33 = new Paragraph("");
             
            p33.add(admin);
              p33.setAlignment(ALIGN_CENTER);
            addEmptyLine(p33, 1);
            document.add(p33);
            

            Chunk dateChunk = new Chunk(
                    "Consultation N° : " + consultation.getNumConsultation() + "  -  Le " + consultation.getDate(),
                    smallBold
            );
           Paragraph  p22 = new Paragraph("");
            p22.add(dateChunk);
            p22.setAlignment(ALIGN_CENTER);
            addEmptyLine(p22, 1);
            document.add(p22);
          

            document.add(new LineSeparator());

            Paragraph ghrib = new Paragraph("Docteur : " + doctor.getNom().toUpperCase()
                    + " " + doctor.getPrenom(), smallBold);
            document.add(ghrib);

            Paragraph p2 = new Paragraph("Specialite: GASTRO", smallBold);

            Chunk nom = new Chunk(new VerticalPositionMark());
            p2.add(new Chunk(nom));
            p2.add("Nom:    " + patient.getNom());

            document.add(p2);
            Chunk prenom = new Chunk(new VerticalPositionMark());
//  Paragraph p3 = new Paragraph("Adresse : " + patient.getAdresse(), smallBold);
            Paragraph p3 = new Paragraph("Adresse :Constantine ", smallBold);
            p3.add(new Chunk(prenom));
            p3.add("Prenom:    " + patient.getPrenom());

            document.add(p3);
            Chunk age = new Chunk(new VerticalPositionMark());
//            Paragraph p5 = new Paragraph("N Tel : " + patient.getTel(), smallBold);

            Paragraph p4 = new Paragraph("N Tel :0561055117 "  , smallBold);

            p4.add(new Chunk(age));

            p4.add("Age : " + patient.getAge()+" ans");

            addEmptyLine(p4, 1);
            document.add(p4);
            
            Chunk underlined = new Chunk("Ordonnance", catFont);
            underlined.setUnderline(0.2f, -2f);
            Paragraph p = new Paragraph("");
            p.add(underlined);
            p.setAlignment(ALIGN_CENTER);
            addEmptyLine(p, 2);
            document.add(p);
              underlined.setUnderline(0.2f, -2f);
            

//            document.add(new LineSeparator());
//
//            //Ajouter les lignes d'ordonnance
//            preface.add(new Paragraph(
//                    "         Medicament                         Qte                  Jours                      P/J                         Observation",
//                    smallBold));
//            addEmptyLine(preface, 1);
//
//            document.add(preface);

           

            PdfPTable table = new PdfPTable(5);
            table.setWidthPercentage(100);
            table.setWidths(new int[]{300,50, 50, 50, 300});

            
            // t.setBorderColor(BaseColor.GRAY);
            // t.setPadding(4);
            // t.setSpacing(4);
            // t.setBorderWidth(1);

            PdfPCell c1 = new PdfPCell(new Phrase("Médicament"));
            c1.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(c1);

            c1 = new PdfPCell(new Phrase("Qte"));
            c1.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(c1);

            c1 = new PdfPCell(new Phrase("Jours"));
            c1.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(c1);

            c1 = new PdfPCell(new Phrase("P/J"));
            c1.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(c1);

            c1 = new PdfPCell(new Phrase("Observation"));
            c1.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(c1);

            table.setHeaderRows(1);

            for (LigneOrdonannce lo : lignesOrdonnances) {  
                table.addCell(lo.getMedicament());
                table.addCell(lo.getQte()+"");
                table.addCell(lo.getNbJours()+"");
                table.addCell(lo.getNbPriseJour()+"");
                table.addCell(lo.getObservation());
            }

            document.add(table);

            // Start a new page
            document.close();

            Desktop.getDesktop().open(new File(fileName));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void addEmptyLine(Paragraph paragraph, int number) {
        for (int i = 0; i < number; i++) {
            paragraph.add(new Paragraph(" "));
        }
    }
}
