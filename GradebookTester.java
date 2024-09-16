import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradebookTester {
	
	GradeBook g1;
	GradeBook g2;

	@BeforeEach
	void setUp() throws Exception {
		
		g1 = new GradeBook(5);
		g2 = new GradeBook(5);
		
		g1.addScore(80);
		g1.addScore(78);
		
		g2.addScore(90);
		g2.addScore(71);
		
	}

	@AfterEach
	void tearDown() throws Exception {
		
		g1 = null;
		g2 = null;
	}

	@Test
	void testSum() {
		assertEquals(158, g1.sum(), .0001);
		assertEquals(161, g2.sum(), .0001);

	}
	
	@Test
	void testMinimum() {
		assertEquals(78, g1.minimum(), .001);
		assertEquals(71, g2.minimum(), .001);
	}
	
	@Test
	void addScoreTest() {
		
		assertTrue(g1.toString().equals("80.0 78.0 ") );
		assertTrue(g2.toString().equals("90.0 71.0 ") );

		assertEquals(2, g1.getScoreSize(), 0.001);
		assertEquals(2, g2.getScoreSize(), 0.001);
	}
	
	@Test
	void testFinalScore() {
		
		assertEquals(80, g1.finalScore(), .0001);
		assertEquals(90, g2.finalScore(), .0001);
	}
	
	

}
