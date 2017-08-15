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
            InputStream oInStream = new FileInputStream("ARX/001.xls");
            OutputStream oOutStream = new FileOutputStream("ARX/ARX_Megrendelo_"+destFile+".xls");

            // Transfer bytes from in to out
            byte[] oBytes = new byte[1024];
            int nLength;
            BufferedInputStream oBuffInputStream = new BufferedInputStream( oInStream );
            while ((nLength = oBuffInputStream.read(oBytes)) > 0) 
            {
                oOutStream.write(oBytes, 0, nLength);
            }
            oInStream.close();
            oOutStream.close();
    }
}

