package Earlier;

import one.*;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
//import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;


public class JSon {

	String[] e = new String[89];
	boolean isChangable = true;
	
	
	public void setChangable(boolean isChangable) {
		this.isChangable = isChangable;
	}

	public JSon(String[] exec) {
		this.e=exec;
		
	}

	public void JStore() throws JsonGenerationException, JsonMappingException, IOException {
		ObjectMapper JStorage = new ObjectMapper();
		
		
		String i = index.getI();
		
		String isCh = Boolean.toString(isChangable);
		e[89]=isCh;
		File st= new File(i+".json");
	    JStorage.writeValue(st, e);
	    
	}
	
	public void JSRead() throws JsonMappingException, IOException {
		
	}
}
