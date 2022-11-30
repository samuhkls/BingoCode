/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import static Controller.Def_DAO.numero;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfDocument;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdk.javadoc.internal.doclets.formats.html.Table;
import main.Main;


/**
 *
 * @author Alunos
 */
public class pdfCartela {

    public static void table() throws Exception{
        
        
        
        Document doc = new Document(PageSize.A4, 72,72,72,72);
        OutputStream os = new FileOutputStream("Primeiro Pdf feito por Rafinha Assis.pdf");
        com.itextpdf.text.pdf.PdfWriter.getInstance(doc , os);
        Random random = new Random();
        int s = 0;
        int u = 0;
        int z = 0;
        int c = 0;
        int v = 0;
        
    for(int i=1;i<=5;i++){
        for(int j=1; j<=5;j++){

        numero = random.nextInt(100);
        switch(j){
            case 1:
                s = numero;
                break;
            case 2:
                u = numero;
                break;
            case 3:
                z = numero;
                break;
            case 4:
                c = numero;
                break;
            case 5:
                v = numero;
                break;
        }
    }

        doc.open();
        
        Font f = new Font(Font.FontFamily.COURIER, 20, Font.BOLD);
        
        Paragraph p1 = new Paragraph("|"+s+" | "+u+" | "+z+" | "+c+" | "+v+"|", f);
        Paragraph p2 = new Paragraph("-----------------------", f);
        

        p1.setAlignment(Element.ALIGN_CENTER);
        p2.setAlignment(Element.ALIGN_CENTER);
        doc.add(p1);
        doc.add(p2);
    }
        doc.close();

    }
                
    }

