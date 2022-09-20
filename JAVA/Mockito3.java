package testing.ust;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.Spy;

public class Mockito3 {
	@Test
	public void text() {
		List s=Mockito.spy(new ArrayList());
		s.add("Lisna");
		Mockito.verify(s).add("Lisna");
		
	}
}
