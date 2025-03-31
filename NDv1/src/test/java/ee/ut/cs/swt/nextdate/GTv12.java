package ee.ut.cs.swt.nextdate;

import org.junit.Test;
import static org.junit.Assert.*;

public class GTv12 {

	@Test(timeout = 4000)
	public void testRunWithPositive9() throws Throwable {
	    NextDate nextDate0 = new NextDate(1802, 1802, 1802);
	    String string0 = nextDate0.run(2, 29, 1802);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive8() throws Throwable {
	    NextDate nextDate0 = new NextDate(1801, 1801, 1801);
	    String string0 = nextDate0.run(2, 28, 1801);
	    assertEquals("3/1/1801", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithZero() throws Throwable {
	    NextDate nextDate0 = new NextDate((-1), 0, (-1));
	    String string0 = nextDate0.run(0, (-428), 0);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive19() throws Throwable {
	    NextDate nextDate0 = new NextDate((-1), 0, (-1));
	    String string0 = nextDate0.run(2, 2, 2021);
	    assertEquals("2/3/2021", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDateAndCallsRun() throws Throwable {
	    NextDate nextDate0 = new NextDate(1801, 1801, 1801);
	    String string0 = nextDate0.run(12, 6, 1801);
	    assertEquals("12/7/1801", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive10() throws Throwable {
	    NextDate nextDate0 = new NextDate((-17), 1801, (-17));
	    String string0 = nextDate0.run(7, 7, 1801);
	    assertEquals("7/7/1801", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive13() throws Throwable {
	    NextDate nextDate0 = new NextDate(1801, 1801, 1801);
	    String string0 = nextDate0.run(6, 31, 1801);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive14() throws Throwable {
	    NextDate nextDate0 = new NextDate(1807, 1807, 1807);
	    String string0 = nextDate0.run(4, 30, 1807);
	    assertEquals("5/1/1807", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive11() throws Throwable {
	    NextDate nextDate0 = new NextDate(1807, 1807, 1807);
	    String string0 = nextDate0.run(12, 31, 1807);
	    assertEquals("1/1/1808", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive12() throws Throwable {
	    NextDate nextDate0 = new NextDate(2021, 2021, 2021);
	    String string0 = nextDate0.run(12, 31, 2021);
	    assertEquals("Invalid Next Year", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithNegativeAndNegative() throws Throwable {
	    NextDate nextDate0 = new NextDate(2, 1801, 2);
	    String string0 = nextDate0.run((-903), 29, (-903));
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive17() throws Throwable {
	    NextDate nextDate0 = new NextDate(2010, 2, 2010);
	    String string0 = nextDate0.run(2, 2010, 2010);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive18() throws Throwable {
	    NextDate nextDate0 = new NextDate(2239, 2239, 2239);
	    String string0 = nextDate0.run(11, 11, 2239);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive15() throws Throwable {
	    NextDate nextDate0 = new NextDate(1804, 1804, 1804);
	    String string0 = nextDate0.run(10, 31, 1804);
	    assertEquals("11/1/1804", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive16() throws Throwable {
	    NextDate nextDate0 = new NextDate(1807, 1807, 1807);
	    String string0 = nextDate0.run(5, 5, 1807);
	    assertEquals("5/6/1807", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive1() throws Throwable {
	    NextDate nextDate0 = new NextDate(18, 1801, 18);
	    String string0 = nextDate0.run(6, 18, 1801);
	    assertEquals("6/19/1801", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive0() throws Throwable {
	    NextDate nextDate0 = new NextDate(1801, 1801, 1801);
	    String string0 = nextDate0.run(12, 6, 1801);
	    assertEquals("12/7/1801", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive3() throws Throwable {
	    NextDate nextDate0 = new NextDate(2, 1801, 2);
	    String string0 = nextDate0.run(9, 9, 1801);
	    assertEquals("9/10/1801", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive2() throws Throwable {
	    NextDate nextDate0 = new NextDate(1807, 1807, 1807);
	    String string0 = nextDate0.run(11, 11, 1807);
	    assertEquals("11/12/1807", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive5() throws Throwable {
	    NextDate nextDate0 = new NextDate(1868, 1868, 1868);
	    String string0 = nextDate0.run(3, 3, 1868);
	    assertEquals("3/4/1868", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive4() throws Throwable {
	    NextDate nextDate0 = new NextDate(1805, 1805, 1805);
	    String string0 = nextDate0.run(8, 8, 1805);
	    assertEquals("8/9/1805", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive7() throws Throwable {
	    NextDate nextDate0 = new NextDate(482, 1801, 482);
	    String string0 = nextDate0.run(2, 31, 1801);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive6() throws Throwable {
	    NextDate nextDate0 = new NextDate(2, 1801, 2);
	    String string0 = nextDate0.run(1, 29, 1801);
	    assertEquals("1/30/1801", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithNegative1() throws Throwable {
	    NextDate nextDate0 = new NextDate((-1), 0, (-1));
	    String string0 = nextDate0.run(1229, 2021, (-428));
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithNegative0() throws Throwable {
	    NextDate nextDate0 = new NextDate(2, 1801, 2);
	    String string0 = nextDate0.run(1, 2, (-903));
	    assertEquals("invalid Input Date", string0);
	}

}