package ocja8topics;

public class DataTypes {
/* boolean  true or false 
 * byte(1byte)-------->short(2 bytes)-------->int(4 bytes)-------->long(8 bytes)-------->float(4 bytes)-------->double(8bytes)   
 *                      char(2 bytes )--------> 
 *             
 */
	byte bt;
	short sh;
	int i;
	char ch;

	public void print(String s,int x)
	{
		System.out.println(s+" <--int---> "+x);
	}
	public void print(String s,byte x)
	{
		System.out.println(s+" <--byte---> "+x);
	}
	public void print(String s,short x)
	{
		System.out.println(s+" <--short---> "+x);
	}
	public void print(String s,char x)
	{
		System.out.println(s+" <--char---> "+x);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataTypes dt = new DataTypes();
		dt.bt = 127;  // -128 <-- 0--> 127 | Any Other values => Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
		dt.print("dt.bt", dt.bt);
		dt.bt = -128; // Type mismatch: cannot convert from int to byte
			          // at ocja8topics.DataTypes.main(DataTypes.java:#)
		dt.print("dt.bt", dt.bt);
		dt.sh=  32767; // -32768 <-- 0--> 32767 | Any Other values =>Type mismatch: cannot convert from int to short
		dt.print("dt.sh", dt.sh);
		dt.sh= -32768; 
		dt.i = 130;
		

	}

}
