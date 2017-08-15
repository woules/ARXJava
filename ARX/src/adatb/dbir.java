package adatb;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import java.io.File;

public class dbir {
	public static void db_ir(String[] iAdat) {
	try {
		
		File inputFile = new File("ARX/01.xml");
		DocumentBuilderFactory dbFactory =
		DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = 
		            dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(inputFile);
     //   doc.getDocumentElement().normalize();
		
		
		 NodeList nList = doc.getElementsByTagName("iD");
        int idno=nList.getLength();
        // root element
        Element rootElement = doc.getDocumentElement();
        
        

        //  supercars element
        Element id = doc.createElement("iD");
        rootElement.appendChild(id);

        // setting attribute to element
        Attr attr = doc.createAttribute("rollno");
        attr.setValue(Integer.toString(idno));
        id.setAttributeNode(attr);

        // carname element
        Element name = doc.createElement("name");
        name.appendChild(doc.createTextNode(iAdat[1]));
        id.appendChild(name);

        Element address = doc.createElement("address");
        address.appendChild(
        doc.createTextNode(iAdat[2]));
        id.appendChild(address);
        
        Element telephone = doc.createElement("telephone");
        telephone.appendChild(
        doc.createTextNode(iAdat[3]));
        id.appendChild(telephone);
        
        Element idNo = doc.createElement("idNo");
        idNo.appendChild(
        doc.createTextNode(iAdat[4]));
        id.appendChild(idNo);
        
        Element rendszam = doc.createElement("rendszam");
        rendszam.appendChild(
        doc.createTextNode(iAdat[5]));
        id.appendChild(rendszam);
        
        Element type = doc.createElement("type");
        type.appendChild(
        doc.createTextNode(iAdat[6]));
        id.appendChild(type);
        
        Element evjar = doc.createElement("evjar");
        evjar.appendChild(
        doc.createTextNode(iAdat[7]));
        id.appendChild(evjar);
        
        Element enID = doc.createElement("enID");
        enID.appendChild(
        doc.createTextNode(iAdat[8]));
        id.appendChild(enID);
        
        
        Element gkNo = doc.createElement("gkNo");
        gkNo.appendChild(
        doc.createTextNode(iAdat[9]));
        id.appendChild(gkNo);
        
        Element enH = doc.createElement("enH");
        enH.appendChild(
        doc.createTextNode(iAdat[10]));
        id.appendChild(enH);
        
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
