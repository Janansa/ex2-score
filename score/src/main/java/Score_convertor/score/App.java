package Score_convertor.score;



/*public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}*/

enum Scores {
	  A,
	  B,
	  C,
	  D,
	  E,
	  F,
	  ERROR

	} 

class ScoreConvertor
{
	
	private static Scores score;
	
	
	public static Scores getScore() {
  	return score;
  }
	
	public static void ConvertScore(int s) {

		if(s>=1 && s <= 49)
		{
			score = Scores.F;
		}
		else if(s>=50 && s <= 59)
		{
			score = Scores.E;
		}
		else if(s>=60 && s <= 69)
		{
			score = Scores.D;
		}
		else if(s>=70 && s <= 79)
		{
			score = Scores.C;
		}
		else if(s>=80 && s <= 89)
		{
			score = Scores.B;
		}
		else if(s>=90 && s <= 100)
		{
			score = Scores.A;
		}
		else 
		{
			score = Scores.ERROR;
		}
		
      

     
  }
}