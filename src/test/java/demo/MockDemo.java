package demo;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.mockito.Mockito.*;
import static org.powermock.api.mockito.PowerMockito.mockStatic;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@PrepareForTest(StaticClass.class)
@RunWith(PowerMockRunner.class)
public class MockDemo {

	@Test
	public void test() {
		mockStatic(StaticClass.class);
		when(StaticClass.count()).thenReturn(-255);
		assertEquals(-255, StaticClass.count());
	}

}
