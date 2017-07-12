package cz.vutbr.feec;
import org.junit.Test;
import static org.junit.Assert.*;

public class StromTest {
	@Test
	public void testNeceho(){
		Strom strom = new Strom();
		assertTrue(strom.jePrazdny());
		strom.pridej(5);
		strom.pridej(7);
		strom.pridej(2);
		strom.pridej(1);
		assertFalse(strom.jePrazdny());
		assertTrue(strom.obsahuje(1));
		assertTrue(strom.obsahuje(2));
		assertTrue(strom.obsahuje(8));
		
	}
}
