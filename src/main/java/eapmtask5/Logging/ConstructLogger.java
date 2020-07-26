package eapmtask5.Logging;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class ConstructLogger 
{
	private static final Logger LOGGER = Logger.getLogger(ConstructLogger.class.getName());
	class Construct
	{
		
		public double construct(double s,double arr)
		{
			double am=arr;
			if(s==2)
			{
				am=am*1200;
				LOGGER.info("Cost for constructing the house is:"+am);
			}
			else if(s==4)
			{
				am=am*1500;
				LOGGER.info("Cost for constructing the house is:"+am);
			}
			else if(s==6)
			{
				am=am*1800;
				LOGGER.info("Cost for constructing the house is:"+am);
			}
			else if(s==8)
			{
				am=am*2500;
				LOGGER.info("Cost for constructing the house is:"+am);
			}
			return am;
		}
	}
}
