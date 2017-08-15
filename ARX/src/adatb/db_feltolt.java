package adatb;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
//import org.w3c.dom.NodeList;

public class db_feltolt {

	public static void ir(Object[][] data, int x) {
		try {
			
	/*		File inputFile = new File("c:/java_adatb/01.xml");
			DocumentBuilderFactory dbFactory =
			DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = 
			            dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(inputFile);
	*/     //   doc.getDocumentElement().normalize();
			
			
	//		 NodeList nList = doc.getElementsByTagName("iD");
	 //       int idno=nList.getLength(); 
	        // root element
			 DocumentBuilderFactory dbFactory =
			         DocumentBuilderFactory.newInstance();
			         DocumentBuilder dBuilder = 
			            dbFactory.newDocumentBuilder();
			         Document doc = dBuilder.newDocument();
			         // root element
			         Element rootElement = doc.createElement("consumer");
			         doc.appendChild(rootElement);
	 //       Element rootElement = doc.getDocumentElement();
			        
	        

	        //  supercars element
	       int idno =0;
	       for(int i=0; i<data.length; i++) {
	    	   for (int j=0; j<10; j++)
	    		   if(data[i][j] ==null)
	    			   data[i][j]="";
	       }
	    for(int n=0; n< AdatbGUI.dbhossz(); n++) {
	    	 Element id = doc.createElement("iD");
		     rootElement.appendChild(id);
	        // setting attribute to element
	        Attr attr = doc.createAttribute("rollno");
	        attr.setValue(Integer.toString(idno));
	        id.setAttributeNode(attr);

	 //       if(adat[n][0]==null) return;
	        // carname element
	        Element name = doc.createElement("name");
	        name.appendChild(doc.createTextNode((String) data[n][0]));
	        id.appendChild(name);
	        Element address = doc.createElement("address");
	        address.appendChild(
	        doc.createTextNode((String) data[n][1]));
	        id.appendChild(address);
	        
	        Element telephone = doc.createElement("telephone");
	        telephone.appendChild(
	        doc.createTextNode((String) data[n][2]));
	        id.appendChild(telephone);
	        
	        Element idNo = doc.createElement("idNo");
	        idNo.appendChild(
	        doc.createTextNode((String) data[n][9]));
	        id.appendChild(idNo);
	        
	        Element rendszam = doc.createElement("rendszam");
	        rendszam.appendChild(
	        doc.createTextNode((String) data[n][4]));
	        id.appendChild(rendszam);
	        
	        Element type = doc.createElement("type");
	        type.appendChild(
	        doc.createTextNode((String) data[n][3]));
	        id.appendChild(type);
	        
	        Element evjar = doc.createElement("evjar");
	        evjar.appendChild(
	        doc.createTextNode((String) data[n][5]));
	        id.appendChild(evjar);
	        
	        Element enID = doc.createElement("enID");
	        enID.appendChild(
	        doc.createTextNode((String) data[n][6]));
	        id.appendChild(enID);
	        
	        
	        Element gkNo = doc.createElement("gkNo");
	        gkNo.appendChild(
	        doc.createTextNode((String) data[n][7]));
	        id.appendChild(gkNo);
	        
	        Element enH = doc.createElement("enH");
	        	enH.appendChild(
	        	doc.createTextNode((String) data[n][8]));
	        	id.appendChild(enH);	
	        idno++;
	   }
	        
	        // write the content into xml file
	        TransformerFactory transformerFactory =
	        TransformerFactory.newInstance();
	        Transformer transformer =
	        transformerFactory.newTransformer();
	        DOMSource source = new DOMSource(doc);
	        StreamResult result =
	        new StreamResult(new File("ARX/01.xml"));
	        
	        transformer.transform(source, result);
	        // Output to console for testing
	        StreamResult consoleResult =
	        new StreamResult(System.out);
	       
	        transformer.transform(source, consoleResult);
	     } catch (Exception e) {
	        e.printStackTrace();
	     }
	}
}
