package adatb;
import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;

import java.io.File;

public class Db_keres {

	public static String[] db_read(String keresettName) {
		Node nNode = null;
		String[] talalat= new String[12];
		talalat[0]= null;
		Element eElement =null;
		try {	
	         File inputFile = new File("ARX/01.xml");
	         DocumentBuilderFactory dbFactory 
	            = DocumentBuilderFactory.newInstance();
	         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	         Document doc = dBuilder.parse(inputFile);
	         doc.getDocumentElement().normalize();
	         NodeList nList = doc.getElementsByTagName("iD");
	    //     NodeList nList = doc.getElementsByTagName("student");
	         for (int temp = 0; temp < nList.getLength(); temp++) {
	            nNode = nList.item(temp);
	           
	            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
	               eElement = (Element) nNode;
	              
	                  if(eElement.getElementsByTagName("name").item(0).getTextContent().equals(keresettName)) {
	               			
	               			talalat[0] = eElement.getAttribute("rollno");  //sorszám
	               			
	               			talalat[1] = eElement
	          	                  .getElementsByTagName("name")  //név
	        	                  .item(0)
	        	                  .getTextContent();
	        	            talalat[2] = eElement
	        		                  .getElementsByTagName("address") //cím
	        		                  .item(0)
	        		                  .getTextContent();
	        	            talalat[3] = eElement
	        		                  .getElementsByTagName("telephone") //telefon szam
	        		                  .item(0)
	        		                  .getTextContent();
	        	            talalat[4] = eElement
	        		                  .getElementsByTagName("idNo") //vevokod
	        		                  .item(0)
	        		                  .getTextContent();
	        	            talalat[5] = eElement
	        		                  .getElementsByTagName("rendszam")  //rendszam
	        		                  .item(0)
	        		                  .getTextContent();
	        	            talalat[6] = eElement
	        		                  .getElementsByTagName("type") //típus
	        		                  .item(0)
	        		                  .getTextContent();
	        	            talalat[7] = eElement
	        		                  .getElementsByTagName("evjar") //evjarat
	        		                  .item(0)
	        		                  .getTextContent();
	        	            talalat[8] = eElement
	        		                  .getElementsByTagName("enID") //motorkod
	        		                  .item(0)
	        		                  .getTextContent();
	        	            talalat[9] = eElement
	        		                  .getElementsByTagName("gkNo") //alvazszam
	        		                  .item(0)
	        		                  .getTextContent();
	        	            talalat[10] = eElement
	        		                  .getElementsByTagName("enH") //hengerurtartalom 
	        		                  .item(0)
	        		                  .getTextContent();
	        	           
	        	            
	                 }     
	            } 
	            
	            
	        } 
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
		
		return talalat;
	}

}
