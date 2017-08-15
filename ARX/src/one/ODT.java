package one;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ODT {
	private static String[] adatok=new String[150];
	public static int output(String sorszam) throws IOException, EncryptedDocumentException, InvalidFormatException {
		
		int r=-1;
		InputStream inp = new FileInputStream("ARX/ARX_Megrendelo_"+sorszam+".xls");
	    //InputStream inp = new FileInputStream("workbook.xlsx");
		adatok=GUI.getS();
	    Workbook wb = WorkbookFactory.create(inp);
	    Sheet sheet = wb.getSheetAt(0);
	    
	    CellStyle cellStyledate = wb.createCellStyle();
	    CreationHelper createHelper = wb.getCreationHelper();
	    cellStyledate.setDataFormat(
	        createHelper.createDataFormat().getFormat("m/d/yy h:mm"));
	    
	    //nyilvantart.szam
	    Row row = sheet.getRow(0);
	    Cell cell = row.getCell(9);
	    cell.setCellType(Cell.CELL_TYPE_STRING);
	    cell.setCellValue(sorszam);
	    
	    //nev
	    Row row11 = sheet.getRow(11);
	    Cell cell1 = row11.getCell(3);
	    cell1.setCellType(Cell.CELL_TYPE_STRING);
	    cell1.setCellValue(adatok[0]);
	    //megr. date
	    Cell cell25 = row11.getCell(7);
	    cell25.setCellValue(adatok[13]);
	    //forg. eng
	    Cell cell101 =row11.getCell(10);
	    if(adatok[22]=="1")
	    	cell101.setCellValue("X");
	    //csekkfuzet
	    Row row102 =sheet.getRow(12);
	    Cell cell102 = row102.getCell(10);
	    if(adatok[23]=="1")
	    	cell102.setCellValue("X");
	    //cim
	    Row row12 = sheet.getRow(13);
	    Cell cell2 = row12.getCell(2);
	    cell2.setCellType(Cell.CELL_TYPE_STRING);
	    cell2.setCellValue(adatok[1]);
	    //kezd. date
	    Cell cell26 = row12.getCell(7);
	    cell26.setCellValue(adatok[14]);
	    // radio
	    Cell cell103 = row12.getCell(10);
	    if(adatok[24]=="1")
	    	cell103.setCellValue("X");
	    
	    //potkerek
	    Row row104 = sheet.getRow(14);
	    Cell cell104=row104.getCell(10);
	    if(adatok[25]=="1")
	    	cell104.setCellValue("X");
	  //telefon
	    Row row13 = sheet.getRow(15);
	    Cell cell3 = row13.getCell(3);
	    cell3.setCellType(Cell.CELL_TYPE_STRING);
	    cell3.setCellValue(adatok[2]);
	    //szerszam
	    Cell cell105 = row13.getCell(10);
	    if(adatok[26]=="1")
	    	cell105.setCellValue("X");
	    //emelo
	    Row row106 = sheet.getRow(16);
	    Cell cell106 = row106.getCell(10);
	    if (adatok[27]=="1")
	    	cell106.setCellValue("X");
	    //ekjesz.date
	    Cell cell27 = row13.getCell(7);
	    cell27.setCellValue(adatok[15]);
	    //vevokod
	    Row row14 = sheet.getRow(17);
	    Cell cell4 = row14.getCell(3);
	    cell4.setCellType(Cell.CELL_TYPE_STRING);
	    cell4.setCellValue(adatok[3]);
	    //kezi legpumpa
	    Cell cell107 = row14.getCell(10);
	    if(adatok[28]=="1")
	    	cell107.setCellValue("X");
	    //jav kolt
	    Cell cell28 = row14.getCell(7);
	    cell28.setCellValue(adatok[16]);
	    //disztarcsa
	    Row row108 = sheet.getRow(18);
	    Cell cell108 = row108.getCell(10);
	    if(adatok[29]=="1")
	    	cell108.setCellValue("X");
	  //rendszm
	    Row row15 = sheet.getRow(19);
	    Cell cell5 = row15.getCell(3);
	    cell5.setCellType(Cell.CELL_TYPE_STRING);
	    cell5.setCellValue(adatok[4]);
	    Cell cell29 = row15.getCell(7);
	    cell29.setCellValue(adatok[17]);
	    //tukor
	    Cell cell109 = row15.getCell(10);
	    if(adatok[30]=="1")
	    	cell109.setCellValue("X");
	    //Biztonsagi ov
	    Row row110 = sheet.getRow(20);
	    Cell cell110 = row110.getCell(10);
	    if(adatok[31]=="1")
	    	cell110.setCellValue("X");
	    //tipus
	    Row row16 = sheet.getRow(21);
	    Cell cell6 = row16.getCell(3);
	    cell6.setCellType(Cell.CELL_TYPE_STRING);
	    cell6.setCellValue(adatok[5]);
	    Cell cell30= row16.getCell(7);
	    cell30.setCellValue(adatok[18]);
	    //elakadasjelzo
	    Cell cell111 = row16.getCell(10);
	    if(adatok[32]=="1")
	    	cell111.setCellValue("X");
	    //Eu doboz
	    Row row112 = sheet.getRow(22);
	    Cell cell112 = row112.getCell(10);
	    if(adatok[33]=="1")
	    	cell112.setCellValue("X");

	    //ejvarat
	    Row row17 = sheet.getRow(23);
	    Cell cell7 = row17.getCell(3);
	    cell7.setCellType(Cell.CELL_TYPE_STRING);
	    cell7.setCellValue(adatok[6]);
	    //izzokeszlet
	    Cell cell113 = row17.getCell(10);
	    if(adatok[34]=="1")
	    	cell113.setCellValue("X");
	    //biztositek
	    Row row114 = sheet.getRow(24);
	    Cell cell114 = row114.getCell(10);
	    if(adatok[35]=="1")
	    	cell114.setCellValue("X");
	    //motorsz
	    Row row18 = sheet.getRow(25);
	    Cell cell8 = row18.getCell(3);
	    cell8.setCellType(Cell.CELL_TYPE_STRING);
	    cell8.setCellValue(adatok[7]);
	    //uamenny
	    Cell cell115 = row18.getCell(10);
	    cell115.setCellValue(adatok[36]);
	    //hutofolyadek
	    Row row116 = sheet.getRow(26);
	    Cell cell116 = row116.getCell(10);
	    cell116.setCellValue(adatok[37]);
	    
	  //alvaz
	    Row row19 = sheet.getRow(27);
	    Cell cell9 = row19.getCell(3);
	    cell9.setCellType(Cell.CELL_TYPE_STRING);
	    cell9.setCellValue(adatok[88]);
	    
	    
	    //hengeru
	    Row row20 = sheet.getRow(28);
	    Cell cell20 = row20.getCell(3);
	    cell20.setCellType(Cell.CELL_TYPE_STRING);
	    cell20.setCellValue(adatok[8]+" ccm");
	    
	    //kmora
	    Row row21 = sheet.getRow(29);
	    Cell cell21 = row21.getCell(3);
	    cell21.setCellType(Cell.CELL_TYPE_STRING);
	    cell21.setCellValue(adatok[9]);
	    
	    //motorolaj
	    Row row22 = sheet.getRow(30);
	    Cell cell22 = row22.getCell(3);
	    cell22.setCellType(Cell.CELL_TYPE_STRING);
	    if(adatok[19]=="0")
	    	cell22.setCellValue(adatok[10]+"  csere: -");
	    else
	    	cell22.setCellValue(adatok[10]+"  csere: X");
	    
	  //holajcsere
	    Row row23 = sheet.getRow(31);
	    Cell cell23 = row23.getCell(3);
	    cell23.setCellType(Cell.CELL_TYPE_STRING);
	    if(adatok[20]=="0")
	    	cell23.setCellValue(adatok[11]+"  csere: -");
	    else
	    	cell23.setCellValue(adatok[11]+"  csere: X");
	    
	    //szurocsere
	    Row row24 = sheet.getRow(32);
	    Cell cell24 = row24.getCell(3);
	    cell24.setCellType(Cell.CELL_TYPE_STRING);
	    if(adatok[21]=="0")
	    	cell24.setCellValue(adatok[12]+"  csere: -");
	    else
	    	cell24.setCellValue(adatok[12]+"  csere: X");
	    
	    
	    // 2. oldal
	      //nyilvantart.szam
	    Row row201 = sheet.getRow(45);
	    Cell cell201 = row201.getCell(9);
	    cell201.setCellValue(sorszam);
	    
	    //nev
	    Row row211 = sheet.getRow(56);
	    Cell cell211 = row211.getCell(3);
	    cell211.setCellValue(adatok[0]);
	    //megr. date
	    Cell cell225 = row211.getCell(7);
	    cell225.setCellValue(adatok[13]);
	    //forg. eng
	    Cell cell2101 =row211.getCell(10);
	    if(adatok[22]=="1")
	    	cell2101.setCellValue("X");
	    //csekkfuzet
	    Row row2102 =sheet.getRow(57);
	    Cell cell2102 = row2102.getCell(10);
	    if(adatok[23]=="1")
	    	cell2102.setCellValue("X");
	    //cim
	    Row row212 = sheet.getRow(58);
	    Cell cell212 = row212.getCell(2);
	    cell212.setCellValue(adatok[1]);
	    //kezd. date
	    Cell cell226 = row212.getCell(7);
	    cell226.setCellValue(adatok[14]);
	    // radio
	    Cell cell2103 = row212.getCell(10);
	    if(adatok[24]=="1")
	    	cell2103.setCellValue("X");
	    
	    //potkerek
	    Row row2104 = sheet.getRow(59);
	    Cell cell2104=row2104.getCell(10);
	    if(adatok[25]=="1")
	    	cell2104.setCellValue("X");
	  //telefon
	    Row row213 = sheet.getRow(60);
	    Cell cell213 = row213.getCell(3);
	    cell213.setCellValue(adatok[2]);
	    //szerszam
	    Cell cell2105 = row213.getCell(10);
	    if(adatok[26]=="1")
	    	cell2105.setCellValue("X");
	    //emelo 
	    Row row2106 = sheet.getRow(61);
	    Cell cell2106 = row2106.getCell(10);
	    if (adatok[27]=="1")
	    	cell2106.setCellValue("X");
	    //ekjesz.date
	    Cell cell227 = row213.getCell(7);
	    cell227.setCellValue(adatok[15]);
	    //vevokod
	    Row row214 = sheet.getRow(62);
	    Cell cell214 = row214.getCell(3);
	    cell214.setCellValue(adatok[3]);
	    //kezi legpumpa
	    Cell cell2107 = row214.getCell(10);
	    if(adatok[28]=="1")
	    	cell2107.setCellValue("X");
	    //jav kolt
	    Cell cell228 = row214.getCell(7);
	    cell228.setCellValue(adatok[16]);
	    //disztarcsa
	    Row row2108 = sheet.getRow(63);
	    Cell cell2108 = row2108.getCell(10);
	    if(adatok[29]=="1")
	    	cell2108.setCellValue("X");
	  //rendszm
	    Row row215 = sheet.getRow(64);
	    Cell cell215 = row215.getCell(3);
	    cell215.setCellValue(adatok[4]);
	    Cell cell229 = row215.getCell(7);
	    cell229.setCellValue(adatok[17]);
	    //tukor
	    Cell cell2109 = row215.getCell(10);
	    if(adatok[30]=="1")
	    	cell2109.setCellValue("X");
	    //Biztonsagi ov
	    Row row2110 = sheet.getRow(65);
	    Cell cell2110 = row2110.getCell(10);
	    if(adatok[31]=="1")
	    	cell2110.setCellValue("X");
	    //tipus
	    Row row216 = sheet.getRow(66);
	    Cell cell216 = row216.getCell(3);
	    cell216.setCellValue(adatok[5]);
	    Cell cell230= row216.getCell(7);
	    cell230.setCellValue(adatok[18]);
	    //elakadasjelzo
	    Cell cell2111 = row216.getCell(10);
	    if(adatok[32]=="1")
	    	cell2111.setCellValue("X");
	    //Eu doboz
	    Row row2112 = sheet.getRow(67);
	    Cell cell2112 = row2112.getCell(10);
	    if(adatok[33]=="1")
	    	cell2112.setCellValue("X");

	    //ejvarat
	    Row row217 = sheet.getRow(68);
	    Cell cell217 = row217.getCell(3);
	    cell217.setCellValue(adatok[6]);
	    //izzokeszlet
	    Cell cell2113 = row217.getCell(10);
	    if(adatok[34]=="1")
	    	cell2113.setCellValue("X");
	    //biztositek
	    Row row2114 = sheet.getRow(69);
	    Cell cell2114 = row2114.getCell(10);
	    if(adatok[35]=="1")
	    	cell2114.setCellValue("X");
	    //motorsz
	    Row row218 = sheet.getRow(70);
	    Cell cell218 = row218.getCell(3);
	    cell218.setCellValue(adatok[7]);
	    //uamenny
	    Cell cell2115 = row218.getCell(10);
	    cell2115.setCellValue(adatok[36]);
	    //hutofolyadek
	    Row row2116 = sheet.getRow(71);
	    Cell cell2116 = row2116.getCell(10);
	    cell2116.setCellValue(adatok[37]);
	    
	  //alvaz
	    Row row219 = sheet.getRow(72);
	    Cell cell219 = row219.getCell(3);
	    cell219.setCellValue(adatok[88]);
	    
	    
	    //hengeru
	    Row row220 = sheet.getRow(73);
	    Cell cell220 = row220.getCell(3);
	    cell220.setCellValue(adatok[8]+" ccm");
	    
	    //kmora
	    Row row221 = sheet.getRow(74);
	    Cell cell221 = row221.getCell(3);
	    cell221.setCellValue(adatok[9]);
	    
	    //motorolaj
	    Row row222 = sheet.getRow(75);
	    Cell cell222 = row222.getCell(3);
	    if(adatok[19]=="0")
	    	cell222.setCellValue(adatok[10]+"  csere: -");
	    else
	    	cell222.setCellValue(adatok[10]+"  csere: X");
	    
	  //holajcsere
	    Row row223 = sheet.getRow(76);
	    Cell cell223 = row223.getCell(3);
	    if(adatok[20]=="0")
	    	cell223.setCellValue(adatok[11]+"  csere: -");
	    else
	    	cell223.setCellValue(adatok[11]+"  csere: X");
	    
	    //szurocsere
	    Row row224 = sheet.getRow(77);
	    Cell cell224 = row224.getCell(3);
	    if(adatok[21]=="0")
	    	cell224.setCellValue(adatok[12]+"  csere: -");
	    else
	    	cell224.setCellValue(adatok[12]+"  csere: X");
	    //megrendeles 1. sor
	    /*Row mr1 = sheet.getRow(35);
	    Cell o1 = mr1.getCell(1);
	    o1.setCellValue(adatok[38]);
	    Cell o2 = mr1.getCell(4);
	    if(adatok[48]=="true")
	    	o2.setCellValue("X");
	    Cell o3 = mr1.getCell(5);
	    if(adatok[58]=="true")
	    	o3.setCellValue("X");
	    Cell o4= mr1.getCell(6);
	    if(adatok[68]=="true")
	    	o4.setCellValue("X");
	    Cell o5 = mr1.getCell(7);
	    o5.setCellValue(adatok[78]);
	    */
	    Row[] mr = new Row[20];
	    Cell[][] o= new Cell[20][20];
	    
	    
	    for(int i4=0; i4<10; i4++) {
	    	mr[i4] = sheet.getRow(35+i4);
		    o[i4][0] = mr[i4].getCell(1);
		    o[i4][0].setCellValue(adatok[38+i4]);
		    o[i4][1] = mr[i4].getCell(4);
		    if(adatok[48+i4]=="true")
		    	o[i4][1].setCellValue("X");
		    o[i4][2] = mr[i4].getCell(5);
		    if(adatok[58+i4]=="true")
		    	o[i4][2].setCellValue("X");
		    o[i4][3]= mr[i4].getCell(6);
		    if(adatok[68+i4]=="true")
		    	o[i4][3].setCellValue("X");
		    o[i4][4] = mr[i4].getCell(7);
		    o[i4][4].setCellValue(adatok[78+i4]);
	    }
	    for(int i4=0; i4<10; i4++) {
	    	mr[i4] = sheet.getRow(80+i4);
		    o[i4][0] = mr[i4].getCell(1);
		    o[i4][0].setCellValue(adatok[38+i4]);
		    o[i4][1] = mr[i4].getCell(4);
		    if(adatok[48+i4]=="true")
		    	o[i4][1].setCellValue("X");
		    o[i4][2] = mr[i4].getCell(5);
		    if(adatok[58+i4]=="true")
		    	o[i4][2].setCellValue("X");
		    o[i4][3]= mr[i4].getCell(6);
		    if(adatok[68+i4]=="true")
		    	o[i4][3].setCellValue("X");
		    o[i4][4] = mr[i4].getCell(7);
		    o[i4][4].setCellValue(adatok[78+i4]);
	    }
	   /* 
	    Row mr21 = sheet.getRow(36);
	    Cell o21 = mr21.getCell(1);
	    o21.setCellValue(adatok[39]);
	    Cell o22 = mr21.getCell(4);
	    if(adatok[49]=="true")
	    	o22.setCellValue("X");
	    Cell o23 = mr21.getCell(5);
	    if(adatok[59]=="true")
	    	o23.setCellValue("X");
	    Cell o24= mr21.getCell(6);
	    if(adatok[69]=="true")
	    	o24.setCellValue("X");
	    Cell o25 = mr21.getCell(7);
	    o25.setCellValue(adatok[79]);
	    
	    Row mr31 = sheet.getRow(37);
	    Cell o31 = mr31.getCell(1);
	    o31.setCellValue(adatok[40]);
	    Cell o32 = mr31.getCell(4);
	    if(adatok[50]=="true")
	    	o32.setCellValue("X");
	    Cell o33 = mr31.getCell(5);
	    if(adatok[60]=="true")
	    	o33.setCellValue("X");
	    Cell o34= mr31.getCell(6);
	    if(adatok[70]=="true")
	    	o34.setCellValue("X");
	    Cell o35 = mr31.getCell(7);
	    o35.setCellValue(adatok[80]);
	    */
	    
	    // Write the output to a file
	    FileOutputStream fileOut = new FileOutputStream("ARX/ARX_Megrendelo_"+sorszam+".xls");
	    wb.write(fileOut);
	    fileOut.close();
	    r=1;
		return r;
		
		/*
		POIFSFileSystem fs = new POIFSFileSystem(new File("C:/workspace/ARX_Megrendelo_"+sorszam+".xls"));
		 HSSFWorkbook wb = new HSSFWorkbook(fs.getRoot(), true);
		//? Workbook wb = WorkbookFactory.create(new File("MyExcel.xls"));  // or new XSSFWorkbook();
		 Sheet sheet1 = wb.getSheet("ARX01"); //munkafüzetlap
		 CreationHelper createHelper = wb.getCreationHelper();  
		 
		 //cellák
		 // Create a row and put some cells in it. Rows are 0 based.
		 Row row = sheet1.getRow((short)1); //row = sor
		 // Create a cell and put a value in it.
		 Cell cell = row.getCell(3);
		 cell.setCellValue(1);
		 cell.setCellValue("1");
		 cell.setCellValue(new Date()); // dátum cella
		    // Or do it on one line.
		 CellStyle cellStyle = wb.createCellStyle();
		 cellStyle.setDataFormat(createHelper.createDataFormat().getFormat("m/d/yy h:mm"));
		 cell = row.createCell(1);
		 cell.setCellValue(new Date());
		 cell.setCellStyle(cellStyle);
		 // különbözõ típusú cellák
		 Row row1 = sheet1.createRow((short)2);
		 row1.createCell(0).setCellValue(1.1);
		 row1.createCell(1).setCellValue(new Date());
		 row1.createCell(2).setCellValue(Calendar.getInstance());
		 row1.createCell(3).setCellValue("a string");
		 row1.createCell(4).setCellValue(true);
		 row1.createCell(5).setCellType(Cell.CELL_TYPE_ERROR);
		    //you can also set date as java.util.Calendar
		 cell = row1.createCell(2);
		 cell.setCellValue(Calendar.getInstance());
		 cell.setCellStyle(cellStyle);
		 // cellaérték beállítás: row.createCell(1).setCellValue(1.2);
		// row.createCell(2).setCellValue(createHelper.createRichTextString("This is a string"));
		// row.createCell(3).setCellValue(true);

		// FileOutputStream fileOut = new FileOutputStream("C:/workspace/ARX_Megrendelo_"+sorszam+".xls");
		// wb.write(fs);*/
		// fs.close();
		 
		 
	
	}
}
