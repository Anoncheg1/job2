package job2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

public class TestMain {
	
	@Test
	public void getNumberTest(){
		List<String> n = Main.getNumber("Иванов И.И.");
		assertTrue(n != null);
			assertEquals(n.get(0), "+8 800 2000 500");
			assertEquals(n.get(1), "+8 800 200 600");
	}

}
