package com.sanaTF.servlet;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import com.itextpdf.text.List;
import com.itextpdf.text.ListItem;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

@WebServlet("/DownloadPDF")
public class DownloadPDF extends HttpServlet {
	
	protected void doGet(HttpServletRequest request,
		HttpServletResponse response) throws ServletException, IOException {
		
		String nombreFoto = request.getParameter("nombreFoto");

        try {

              OutputStream file = response.getOutputStream();//new FileOutputStream(new File("C:\\PDF_Java4s.pdf"));
	          Document document = new Document();
	          PdfWriter.getInstance(document, file);

			//Inserting Image in PDF
			     //Image image = Image.getInstance ("C:/Users/dds/Downloads/"+nombreFoto);
	             Image image = Image.getInstance ("/home/sanatf/imagenes/"+nombreFoto);
			     
			     image.scaleAbsolute(500f, 600f);//image width,height	

			
			 //Now Insert Every Thing Into PDF Document
		         document.open();//PDF document opened........			       

					document.add(image);

					document.add(Chunk.NEWLINE);   //Something like in HTML :-)

					document.add(new Paragraph("Foto : " + nombreFoto));
	                document.add(new Paragraph("Documento Generado el - "+new Date().toString()));	

			        document.close();

			             file.close();

            System.out.println("Pdf created successfully..");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
