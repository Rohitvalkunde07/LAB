class Exercise5
{
	public static void main(String[] args)
	{
		String str="Hello Everyone. My name is Rohit. I'm from mumbai.I did My graduation from APSIT.";
		int charcount=0;
		int linecount=0;
		int wordcount=1;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if( ch>='a' && ch<='z' || ch>='A' && ch<='z')
				charcount++;
			else if(ch=='.')
				linecount++;
			else if(ch==' ')
				wordcount++;
		}	
		System.out.println(charcount);
		System.out.println(linecount);
		System.out.println(wordcount);
	}
}