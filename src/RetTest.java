class RetTest
{
	public static void main(String[] args) 
	{
		boolean b=false;
		int ans =function(b);	
	}
	public static int function(boolean b)
	{
		if (b==true)
			return 1;
		else 
		{
			b=true;
			function(b);
		}
		return 0;
	}
}