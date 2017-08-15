package one;
import java.io.*;

public class index {
	static String indeksz=new String("null");
	
	public static String getI() {
		int i=0;
		String si = new String("null");
		int x[] = new int[5] ;
		String str;
		try {
			BufferedReader bemenet = new BufferedReader(new FileReader("ARX/index"));
			str=bemenet.readLine();
			bemenet.close();
			x[0]=str.charAt(3)-'0'; 
			x[1]=str.charAt(2)-'0';
			x[2]=str.charAt(1)-'0';
			x[3]=str.charAt(0)-'0';
			indeksz=Character.toString(str.charAt(0))+Character.toString(str.charAt(1))+Character.toString(str.charAt(2))+Character.toString(str.charAt(3));
			i=Integer.parseInt(indeksz);
			
				
			str=Integer.toString(i);
			
			
			if (i <10){
				si = "000"+i;
			}
			else {
				if(i>9 && i <100)
					si = "00"+i;
				else {
					if(i>99 && i<1000)
						si = "0" + i;
					else
						si= Integer.toString(i);
				}
			}
			PrintWriter kimenet=new PrintWriter(new FileWriter("ARX/index"));
			
			kimenet.print(si);
			
			kimenet.close();
		}
		catch(IOException hibakod){ System.err.println("Hiba történt: "+hibakod); 
		}
		
		
		return si;
		
	}
	public static String getIndeksz() {
		return indeksz;
	}
}
