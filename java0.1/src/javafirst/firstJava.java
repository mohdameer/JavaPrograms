package javafirst;

public class firstJava {

	public static void main(String[] args) 
	{
		
		String ipstr="ATTA";
		String rstr="";
		char ch;
		for(int i=0;i<ipstr.length();i++)
		{
         
		ch=ipstr.charAt(i);
         rstr=ch+rstr;
	    }
		if(ipstr==rstr)
			System.out.println("true");
		else
			System.out.println("false");
     }
	    
}