package one;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import one.datum;
public class errors {
	public static void error(IOException e) throws IOException {
		File errors = new File("C:/ARX/errors.txt");
		
		FileWriter fw = new FileWriter(errors.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(datum.date()+"hibakód:"+e);
		bw.close();
	}
}
