package eapmtask5.Logging;

import org.junit.Test;

public class SimComloggertest {

@Test
public void test1() {
	SimComlogger intr = new SimComlogger();
	intr.sim_interest(5000,3,2);
    intr.com_interest(5000,3,2);
}
@Test
public void test2() {
	SimComlogger intr = new SimComlogger();
	intr.sim_interest(15000,4,4);
	intr.com_interest(15000,4,4);
}
@Test
public void test3() {
	SimComlogger intr = new SimComlogger();
	intr.sim_interest(1000,9,8);
	intr.com_interest(1000,9,8);
}
@Test
public void test4() {
	SimComlogger intr = new SimComlogger();
	intr.sim_interest(4000,5,3);
	intr.com_interest(4000,5,3);
}
}