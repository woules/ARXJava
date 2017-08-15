package one;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Copy {
	public static  void copyFile(String destFile) throws IOException 
    {
			OutputStream oOutStream;
            InputStream oInStream = new FileInputStream("ARX/001.xls");
            try {
            	InputStream EInStream = new FileInputStream("ARX/ARX_Megrendelo_"+destFile+".xls");
            	EInStream.close();
            	
            }
            catch (IOException e)  {
            	oOutStream = new FileOutputStream("ARX/ARX_Megrendelo_"+destFile+".xls"); 
            	byte[] oBytes = new byte[1024];
                int nLength;
                BufferedInputStream oBuffInputStream = new BufferedInputStream( oInStream );
                while ((nLength = oBuffInputStream.read(oBytes)) > 0) 
                {
                    oOutStream.write(oBytes, 0, nLength);
                }
                oBuffInputStream.close();
                oOutStream.close();
            }
            
            
            // Transfer bytes from in to out
           
            
            oInStream.close();
            
    }
}

