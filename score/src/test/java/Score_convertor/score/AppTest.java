package Score_convertor.score;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;



/**
 * Unit test for simple App.
 */
/*public class AppTest 
{

    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
}*/

public class AppTest 
{
	ScoreConvertor score = new ScoreConvertor();


	@Test  
	public void fScoreTestPartition1(){
       
		int s = 1;

        ScoreConvertor.ConvertScore(s);
        String expected = Scores.F.toString();
        String result = ScoreConvertor.getScore().toString();
        assertEquals(expected, result);
    }
	
	@Test  
	public void fScoreTestPartition2(){
       
		int s = 2;

        ScoreConvertor.ConvertScore(s);
        String expected = Scores.F.toString();
        String result = ScoreConvertor.getScore().toString();
        assertEquals(expected, result);
    }
	
	@Test  
	public void fScoreTestPartition3(){
       
		int s = 25;

        ScoreConvertor.ConvertScore(s);
        String expected = Scores.F.toString();
        String result = ScoreConvertor.getScore().toString();
        assertEquals(expected, result);
    }
	
	@Test  
	public void fScoreTestPartition4(){
       
		int s = 48;

        ScoreConvertor.ConvertScore(s);
        String expected = Scores.F.toString();
        String result = ScoreConvertor.getScore().toString();
        assertEquals(expected, result);
    }
	
	@Test  
	public void fScoreTestPartition5(){
       
		int s = 49;

        ScoreConvertor.ConvertScore(s);
        String expected = Scores.F.toString();
        String result = ScoreConvertor.getScore().toString();
        assertEquals(expected, result);
    }
}
