package adatb;

public class DB_Feltolt_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] data = new String[20][10];
		for(int i=0; i<20; i++) {
			for (int j=0; j<10; j++){
				data[i][j]= Integer.toString(i+j) ;
			}
		}
		db_feltolt.ir(data, 20);
	}

}
