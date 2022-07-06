package rword;

public class rword {

	public static void main(String[] args) 
	{
		
		String ipstr="this is java";
		String s1[]=ipstr.split(" ");
		String rstr="";
		char ch;
		for(int i=0;i<s1.length;i++)
		{
         
		ch=s1.charAt(i);
         rstr=ch+rstr;
	    }
		 System.out.println("output:"+rstr);
     }
	    
}