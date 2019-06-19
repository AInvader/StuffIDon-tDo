class RetTest
{
	public static void main(String[] args) 
	{
		boolean b=false;
		int ans =function(false);
	}
	private static int function(boolean b)
	{
		if (b)
			return 1;
		else 
		{
			function(true);
		}
		return 0;
	}
}