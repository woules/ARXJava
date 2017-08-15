package one;

import java.awt.Desktop;
import java.io.File;
/*import java.io.FileInputStream;
import java.io.FileNotFoundException;*/
import java.io.IOException;
/*
import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintException;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;*/

public class Print {

	public static void p(String sorszam) throws IOException {

		
		Desktop.getDesktop().print(new File("ARX/ARX_Megrendelo_"+sorszam+".xls"));
	/*	// Input the file
		FileInputStream textStream=new FileInputStream("C:/Users/Benjámin/Desktop/d.rtf");
		
		
		// Set the document type
		PrintRequestAttributeSet aset = new HashPrintRequestAttributeSet(); 
		DocFlavor myFormat = DocFlavor.INPUT_STREAM.AUTOSENSE;
		PrintService printService[] = PrintServiceLookup.lookupPrintServices(myFormat, aset);
		// Create a Doc
		Doc myDoc = new SimpleDoc(textStream, myFormat, null); 
		// Build a set of attributes
		
		
		// discover the printers that can print the format according to the
		// instructions in the attribute set
		
		// Create a print job from one of the print services
		
			System.out.println("asd");
			DocPrintJob job = printService[3].createPrintJob(); 
		//	try { 
			//	job.print(myDoc, aset); 
		//	} catch (PrintException pe) {} */
		} 
}
