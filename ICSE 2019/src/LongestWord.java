class LongestWord
{
    public static void main(String[] args) 
    {
        String s="The quick brown fox jumped over the lazy dog ";
        String longest="";
        String word="";
        for (int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);            
            if (ch!=' ')
            {
                word=word+ch;
            }
            else 
            {
                if (word.length()>longest.length())
                    longest=word;

                word="";
            }

        }    
        System.out.println(longest);
    }
}