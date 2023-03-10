import com.itextpdf.kernel.color.Color;
//import com.itextpdf.kernel.color.ColorConstants;
import com.itextpdf.kernel.color.DeviceRgb;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.border.Border;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;

import java.io.FileNotFoundException;

public class hii {
    public static void main(String[] args) throws FileNotFoundException {
//            Generate_Pdf("Ankith","M S","abc","Tiptur","Karnataka",572201,"9380029903","akihthshadakshari","java","c++","Python","cpp","gfd","english","kannada","hindi","marati","konkani","senior executive","wipro","bengaluru","karnataka","2019","present","i'm very good at working","Tagore","Tiptur","Engineering","math","2015","2019");
    }

    static Cell getheadertextvalue(String val){
        return new Cell().add(val).setBorder(Border.NO_BORDER).setFontColor(Color.WHITE).setFontSize(10f);
    }

    static Cell getheaderbold(String val){
        return new Cell().add(val).setBold().setBorder(Border.NO_BORDER).setFontColor(Color.WHITE).setFontSize(10f);
    }
    public static void Generate_Pdf(String fname,String lname,String prof,String city,String state,String zipcode,String phoneno,String email,String skill1,String skill2,String skill3,String skill4,String skill5,String lang1,String lang2,String lang3,String lang4,String lang5,String job,String employer,String jcity,String jstate,String jstart,String jend,String workdes,String sname,String sloc,String degree,String fos,String sstart,String send) throws FileNotFoundException {
        String path ="anki.pdf";
        PdfWriter pdfWriter=new PdfWriter(path);
        PdfDocument pdfDocument=new PdfDocument(pdfWriter);
        pdfDocument.setDefaultPageSize(PageSize.A4);
        Document document=new Document(pdfDocument);
        float twocol=150f;
        float twocol150=twocol+285f;
        float twocolumnWidth[]={twocol,twocol150};
        Paragraph onesp=new Paragraph("\n").setBorder(Border.NO_BORDER);
        Table table=new Table(twocolumnWidth);

        Table nestedtable=new Table(new float[]{twocol});


        nestedtable.setBackgroundColor(new DeviceRgb(0,61,116)).setBorder(Border.NO_BORDER);


        nestedtable.addCell(getheaderbold(fname+" "+lname).setFontSize(25f));
        nestedtable.addCell(getheadertextvalue(job).setFontSize(12f));
        nestedtable.addCell(new Cell().add(onesp).setBorder(Border.NO_BORDER));
        nestedtable.addCell(getheaderbold("Personal Info").setFontSize(15f).setBackgroundColor(new DeviceRgb(0,46,88)));
        nestedtable.addCell(getheaderbold("Address"));
        nestedtable.addCell(getheadertextvalue(city+"\n"+state+"-"+zipcode));
        nestedtable.addCell(getheaderbold("Phone"));
        nestedtable.addCell(getheadertextvalue(phoneno));
        nestedtable.addCell(getheaderbold("E-mail"));
        nestedtable.addCell(getheadertextvalue(email));
        //nestedtable.addCell(getheaderbold("LinkedIn"));
        //nestedtable.addCell(getheadertextvalue("ebeduvchbcu"));
        nestedtable.addCell(new Cell().add(onesp).setBorder(Border.NO_BORDER));
        nestedtable.addCell(getheaderbold("Skills").setFontSize(15f).setBackgroundColor(new DeviceRgb(0,46,88)));
        nestedtable.addCell(getheadertextvalue(skill1));
        nestedtable.addCell(getheadertextvalue(skill2));
        nestedtable.addCell(getheadertextvalue(skill3));
        nestedtable.addCell(getheadertextvalue(skill4));
        nestedtable.addCell(getheadertextvalue(skill5));
        nestedtable.addCell(new Cell().add(onesp).setBorder(Border.NO_BORDER));
        nestedtable.addCell(getheaderbold("Languages").setFontSize(15f).setBackgroundColor(new DeviceRgb(0,46,88)));
        nestedtable.addCell(getheadertextvalue(lang1));
        nestedtable.addCell(getheadertextvalue(lang2));
        nestedtable.addCell(getheadertextvalue(lang3));
        nestedtable.addCell(getheadertextvalue(lang4));
        nestedtable.addCell(getheadertextvalue(lang5));
        nestedtable.addCell(new Cell().add(onesp).setBorder(Border.NO_BORDER));
        table.addCell(new Cell().add(nestedtable));


        Table nt=new Table(new float[]{twocol150});
        nt.addCell(new Cell().add("IT Professional with over 10 years of experience specializing in IT Department management for international logistic companies. I can implement effective It strategies at local and global levels. My greatest strength is business awareness, which enables me to permanently streamline infrastructure and applications. Striving to leverage my IT management skills at SanCorp Inc.").setBorder(Border.NO_BORDER));

        nt.addCell(new Cell().add(onesp).setBorder(Border.NO_BORDER));
        nt.addCell(new Cell().add("Experience").setFontSize(15f).setBold().setFontColor(new DeviceRgb(31,77,120)).setBorder(Border.NO_BORDER));
        nt.addCell(new Cell().add(job).setBorder(Border.NO_BORDER).setBold().setFontSize(13f));
        nt.addCell(new Cell().add(employer).setBorder(Border.NO_BORDER).setFontSize(11f));
        nt.addCell(new Cell().add(jcity+", "+jstate).setBorder(Border.NO_BORDER).setFontSize(11f));
        nt.addCell(new Cell().add(jstart+"-"+jend).setBorder(Border.NO_BORDER).setFontSize(11f));
        nt.addCell(new Cell().add(workdes).setBorder(Border.NO_BORDER).setFontSize(11f));

        nt.addCell(new Cell().add(onesp).setBorder(Border.NO_BORDER));
        nt.addCell(new Cell().add("Education").setFontSize(15f).setFontColor(new DeviceRgb(31,77,120)).setBold().setBorder(Border.NO_BORDER));
        nt.addCell(new Cell().add(degree).setFontSize(13f).setBorder(Border.NO_BORDER).setBold());
        nt.addCell(new Cell().add("Studied at"+sname+"\n"+sloc).setFontSize(11f).setBorder(Border.NO_BORDER));
        nt.addCell(new Cell().add("Field of study"+fos).setFontSize(11f).setBorder(Border.NO_BORDER));
        nt.addCell(new Cell().add("graduated on "+send).setFontSize(11f).setBorder(Border.NO_BORDER));
        table.addCell(new Cell().add(nt));
        document.add(table);


        document.close();
        System.out.println("pdf generated");
    }
}



