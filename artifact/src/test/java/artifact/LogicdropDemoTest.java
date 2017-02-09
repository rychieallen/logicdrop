package artifact;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class LogicdropDemoTest {
	private int number;
	private String expectedResult;
	private LogicdropDemo testedClass = new LogicdropDemo(); 

	public LogicdropDemoTest(int number, String expectedResult) {
		this.number = number;
		this.expectedResult = expectedResult;
	}

	@Parameters
	public static Collection<Object[]> data() {
		List<Object[]> l =Arrays.asList( new Object[][]{
			{ 3, "Logic" }, { 5, "drop" }, { 10, "drop" },{9,"Logic"},{30,"Logicdrop"},
			{ 15, "Logicdrop"}, { 21, "Logic"},{13,"13"}
		});
		return l;
	}

	@Test
	public void test() {
		assertThat(String.valueOf(this),testedClass.fun(this.number),equalTo(expectedResult));
	}
}
