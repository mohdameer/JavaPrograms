package javafirst;

public class program4 {

	public static void main(String[] args) 
	{
		
		String ipstr="this is java";
		String rstr="";
		char ch;
		for(int i=0;i<ipstr.length();i++)
		{
         
		ch=ipstr.charAt(i);
         rstr=ch+rstr;
	    }
		if(ipstr.equals(rstr))
			System.out.println("orig\n"+ipstr);
		else
			System.out.println("rev\n"+rstr);
     }
	    
}