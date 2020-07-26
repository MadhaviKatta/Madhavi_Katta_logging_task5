package eapmtask5.Logging;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class SimComlogger
{
	//private static final Logger LOGGER = Logger.getLogger(Log_Simple.class);
	private static final Logger LOGGER = Logger.getLogger(SimComlogger.class.getName());
	public void sim_interest(double p,double t,double r)
	{
		double siin;
		siin=(p*t*r)/100.0;
		LOGGER.info("The Simple Interest: "+siin);
	}
	public void com_interest(double p,double t,double r)
	{
		double ciin;
		ciin=p*Math.pow(1.0+r/100.0,t)-p;
		LOGGER.info("The Compound Interest: "+ciin);
	}
}


