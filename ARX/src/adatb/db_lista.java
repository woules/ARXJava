package adatb;

import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;

import java.io.File;

public class db_lista {
	
		public static String[][] db_list() {
			Node nNode = null;
			String[][] talalat= new String[1000][10];
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
		              
		               			
		               			 //sorsz�m
		               			
		               			talalat[temp][0] = eElement
		          	                  .getElementsByTagName("name")  //n�v
		        	                  .item(0)
		        	                  .getTextContent();
		        	            talalat[temp][1] = eElement
		        		                  .getElementsByTagName("address") //c�m
		        		                  .item(0)
		        		                  .getTextContent();
		        	            talalat[temp][2] = eElement
		        		                  .getElementsByTagName("telephone") //telefon szam
		        		                  .item(0)
		        		                  .getTextContent();
		        	            talalat[temp][9] = eElement
		        		                  .getElementsByTagName("idNo") //vevokod
		        		                  .item(0)
		        		                  .getTextContent();
		        	            talalat[temp][4] = eElement
		        		                  .getElementsByTagName("rendszam")  //rendszam
		        		                  .item(0)
		        		                  .getTextContent();
		        	            talalat[temp][3] = eElement
		        		                  .getElementsByTagName("type") //t�pus
		        		                  .item(0)
		        		                  .getTextContent();
		        	            talalat[temp][5] = eElement
		        		                  .getElementsByTagName("evjar") //evjarat
		        		                  .item(0)
		        		                  .getTextContent();
		        	            talalat[temp][6] = eElement
		        		                  .getElementsByTagName("enID") //motorkod
		        		                  .item(0)
		        		                  .getTextContent();
		        	            talalat[temp][7] = eElement
		        		                  .getElementsByTagName("gkNo") //alvazszam
		        		                  .item(0)
		        		                  .getTextContent();
		        	            talalat[temp][8]= eElement
		        		                  .getElementsByTagName("enH") //hengerurtartalom 
		        		                  .item(0)
		        		                  .getTextContent();
		        	           
		        	            
		                      
		            } 
		            
		            
		        } 
		      } catch (Exception e) {
		         e.printStackTrace();
		      }
			
			return talalat;
		}

	}


