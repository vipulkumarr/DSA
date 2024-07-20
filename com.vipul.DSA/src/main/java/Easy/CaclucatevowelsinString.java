package Easy;

public class CaclucatevowelsinString {
	
	public static void main(String [] args)
	{
	 String s = "vipul kumar";
	 char[] ch = s.toCharArray();
	 int count = 0;
	for(int i =0;i<ch.length;i++)
	{
		if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
		{
			count++;
		}
	}
	System.out.println("vowel count is "+count);
}
}
