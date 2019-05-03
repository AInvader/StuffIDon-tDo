class asciitest
{
	void main()
	{
		int c=0;
		for (int i=0;i<=10000;i++)
		{
			System.out.print((char)(i)+" ");
			c++;
			if (c==50)
			{
				System.out.println();
				c=0;
			}
		}
	}
}