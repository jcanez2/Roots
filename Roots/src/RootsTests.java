import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RootsTests {

	@Test
	void RootsTestValidTwoRoots() {
		double a=2, b=-10, c=2;
		double expectedNummberRoots = 2.0;
		double expectedFirstRoot = 4.7912878474779195;
		double expectedSecondRoot = 0.20871215252208009;
	    Roots.calculate_roots(a,b,c);
	    
	    assertEquals(expectedNummberRoots, Roots.num_roots());
	    assertEquals(expectedFirstRoot, Roots.first_root(), 2);
	    assertEquals(expectedSecondRoot, Roots.second_root(), 2);
	}
	
	@Test
	void RootsTestValidOneRoots() {
		double a=3, b=6, c=3; // one root;
		double expectedNummberRoots = 1.0;
		double expectedFirstRoot = -1.0;
		double expectedSecondRoot = -1.0;
		
	    Roots.calculate_roots(a,b,c);
	    
	    assertEquals(expectedNummberRoots, Roots.num_roots());
	    assertEquals(expectedFirstRoot, Roots.first_root(), 2);
	    assertEquals(expectedSecondRoot, Roots.second_root(), 2);
	}

	@Test
	void RootsTestValidZeroRoots() {
		double a=3, b=-2, c=3; // no roots
		double expectedNummberRoots = 0.0;
		double expectedFirstRoot = -1.0;
		double expectedSecondRoot = -1.0;
		
	    Roots.calculate_roots(a,b,c);
	    
	    assertEquals(expectedNummberRoots, Roots.num_roots());
	    assertEquals(expectedFirstRoot, Roots.first_root(), 2);
	    assertEquals(expectedSecondRoot, Roots.second_root(), 2);
	}
	
	@Test
	void RootsTestValidZeroRootsNotAQuadradic() {
		double a=0, b = 2, c=3; // no roots
		double expectedNummberRoots = 0.0;
		double expectedFirstRoot = -1.0;
		double expectedSecondRoot = -1.0;
		
	    Roots.calculate_roots(a,b,c);
	    
	    assertEquals(expectedNummberRoots, Roots.num_roots());
	    assertEquals(expectedFirstRoot, Roots.first_root(), 2);
	    assertEquals(expectedSecondRoot, Roots.second_root(), 2);
	}
}
