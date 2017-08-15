package Earlier;

import one.*;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class JSon {

	public void JStore() throws JsonGenerationException, JsonMappingException, IOException {
		ObjectMapper JStorage = new ObjectMapper();
		
		String[] Data = new String[100];
		
		
		String i = index.getI();
		
				
	    JStorage.writeValue(new File(i+".json"), Data);
	    
	}
	
	public void JSead() throws JsonMappingException, IOException {
		
	}
}
