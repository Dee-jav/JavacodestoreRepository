package Assign;

public class TwoStringcompare 
{
	public static void main(String[] args) 
	{
		String a= "Kv no2 bangalore";
		String b= "karnataka";
		
		char c[]=a.toCharArray();
		char d[]=b.toCharArray();
		
		if(c.equals(d))
		{
			System.out.println("Both are same");
			
		}
		else
		{
			System.out.println("Both are not same");
		}
		
		
	}

}
