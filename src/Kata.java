public class Kata 
{
  public static String high(String s) 
  {
      int score=0;      
      int spaces=0;
      for (int i=0;i<s.length();i++)
      {
          if (s.charAt(i)==' ') 
              spaces++;
      }
	  int[] scores = new int[spaces + 1];
	  String[] words = new String[spaces + 1];
        int c=0;
        String word="";
        for (int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if (ch!=' ')
            {
              word=word+ch;
              int value=(int)Character.toLowerCase(ch)-96;
              score=score+value;
            }                
            else 
            {
              scores[c]=score;
              words[c]=word;
              score=0;
              word="";
              c++;              
            }
        }
        int max=scores[0];
        int index=0;
        for (int i=0;i<scores.length;i++)
        {
          if(scores[i]>max)
            {
              max=scores[i];
              index=i;
            }
        }              
        return words[index];
      }
      
  }
//https://www.codewars.com/kata/highest-scoring-word/train/java