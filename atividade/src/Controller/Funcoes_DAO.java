
package Controller;

import java.io.FileOutputStream;
import java.io.OutputStream;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import static com.itextpdf.text.Font.BOLD;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Funcoes_DAO {
   
   public static Font ti1 = new Font (FontFamily.HELVETICA ,25, Font.BOLD );
   public static Font ti2 = new Font (FontFamily.HELVETICA ,17, Font.BOLD );
   public static Font te1 = new Font (FontFamily.COURIER ,15 );
   
    public static void Atestado()throws Exception{
        
         
        Document doc = null;
        OutputStream os = null;
        String nome = JOptionPane.showInputDialog(null, " Digite o nome:");
        String cpf = JOptionPane.showInputDialog(null, " Digite o CPF:");
        LocalDate dataHoje = java.time.LocalDate.now();
        String recebe = dataHoje.format(DateTimeFormatter.ISO_DATE);
        String dataInicio = JOptionPane.showInputDialog(null, " Digite a data do inicio do afastamento:");
        String dataFinal = JOptionPane.showInputDialog(null, " Digite a data final:");
        String mot = JOptionPane.showInputDialog(null, " Digite o motivo");
        String local = JOptionPane.showInputDialog(null, " Digite o endereço");
        

        
        
        try {
           
            doc = new Document(PageSize.A4, 72, 72, 72, 72);
            os = new FileOutputStream("Relatorio1.pdf");
            PdfWriter.getInstance(doc, os);
            doc.open();
            Paragraph par = new Paragraph("ATESTADO MÉDICO ", ti1 );
            par.setAlignment (Element.ALIGN_CENTER);
            doc.add(par);
            
            Paragraph espc = new Paragraph("\n\n\n\n\n\n" );
            doc.add(espc);
            
            Paragraph par1 = new Paragraph("Atesto para os fins de que o(a) Sr(a). " 
                    + nome + " portador da Carteira de identidade nº "
                    + cpf +" esteve sob cuidados médicos no dia: "
                    + dataHoje +" e deverá se afastar de suas atividades pelo período de: "
                    + dataInicio + " até "
                    + dataFinal +" por motivos de "
                    + mot + ".", te1 );
            doc.add(par1);
            
            Paragraph espc1 = new Paragraph("\n\n\n\n " );
            doc.add(espc1);
            
            Paragraph par2 = new Paragraph(" Informações adicionais ", ti2 );
            par2.setAlignment (Element.ALIGN_CENTER);
            doc.add(par2);
            
            Paragraph espc2 = new Paragraph("\n\n\n\n\n\n\n\n " );
            doc.add(espc2);
            
            Paragraph par3 = new Paragraph(" Local " + local + "  " + "Data: " + dataHoje , te1);
            par3.setAlignment (Element.ALIGN_CENTER);
            doc.add(par3);
            
            Paragraph espc3 = new Paragraph("\n\n" );
            doc.add(espc3);
            
            Paragraph par4 = new Paragraph("___________________\n Carimbo/Assinatura ", te1);
            par4.setAlignment (Element.ALIGN_CENTER);
            doc.add(par4);
            
            
            
        } finally {
 
            if (doc != null) {
 
                //fechamento do documento
                doc.close();
            }
 
            if (os != null) {
                //fechamento da stream de saída
                os.close();
            }
        }
        Desktop.getDesktop().open(new File("Relatorio1.pdf"));
        
        
    }
    
    public static void Receita()throws Exception{
        String nomeMed = JOptionPane.showInputDialog(null, " Digite o nome do medico examinador:");
        String crm = JOptionPane.showInputDialog(null, " Digite o CRM:");
        String nomePac = JOptionPane.showInputDialog(null, " Digite o nome do paciente:");
        String dia = JOptionPane.showInputDialog(null, " Digite o dia do exame:");
        String mes = JOptionPane.showInputDialog(null, " Digite o mês:");
        String ano = JOptionPane.showInputDialog(null, " Digite o ano:");
        
    
    }
    
    public static void Declaracao()throws Exception{
    
    }
    
}
