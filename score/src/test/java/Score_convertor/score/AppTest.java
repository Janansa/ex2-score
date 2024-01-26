package Score_convertor.score;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class AppTest 
{
	ScoreConvertor score = new ScoreConvertor();


	@Test  
	public void fScoreTestPartition1(){
       
        ScoreConvertor.ConvertScore(1);
        String expected = Scores.F.toString();
        String result = ScoreConvertor.getScore().toString();
        assertEquals(expected, result);
    }
	
	@Test  
	public void fScoreTestPartition2(){
       
        ScoreConvertor.ConvertScore(2);
        String expected = Scores.F.toString();
        String result = ScoreConvertor.getScore().toString();
        assertEquals(expected, result);
    }
	
	@Test  
	public void fScoreTestPartition3(){
       
        ScoreConvertor.ConvertScore(25);
        String expected = Scores.F.toString();
        String result = ScoreConvertor.getScore().toString();
        assertEquals(expected, result);
    }
	
	@Test  
	public void fScoreTestPartition4(){
       
        ScoreConvertor.ConvertScore(48);
        String expected = Scores.F.toString();
        String result = ScoreConvertor.getScore().toString();
        assertEquals(expected, result);
    }
	
	@Test  
	public void fScoreTestPartition5(){
       
        ScoreConvertor.ConvertScore(49);
        String expected = Scores.F.toString();
        String result = ScoreConvertor.getScore().toString();
        assertEquals(expected, result);
    }
}
