package EL.Exceptionloggers;
package interestCal.interestCal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

	class calculate {
		public static final Logger LOGGER = LogManager.getLogger(App1.class);

		calculate() throws IOException {
			LOGGER.info("class Calculate started");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

			LOGGER.info("Enter Principle amount");

			int Principal = Integer.parseInt(reader.readLine());
			LOGGER.info("enter Time period(in years)");

			int Time = Integer.parseInt(reader.readLine());
			LOGGER.info("enter the Rate of interest(in %)");

			double Rate = Integer.parseInt(reader.readLine());
			LOGGER.info("Choose \n1.Simple Interest\n2.Compound Interest");

			int sel = Integer.parseInt(reader.readLine());

			if (sel == 1) {
				double sI = (Principal * Time * Rate) / 100;

				LOGGER.info("\nThe Intrest amount is " + sI + " Rupees");
			} else if (sel == 2) {
				LOGGER.info("\nenter the no of times interest is compunded per year");

				int n = Integer.parseInt(reader.readLine());
				Rate = Rate / 100;
				double totalamountCi = Principal * Math.pow(1 + (Rate / n), n * Time);

				double cI = totalamountCi - Principal;
				LOGGER.info("The interest amount is " + cI + " Rupees");

			} else {
				LOGGER.error("*****INVALID SELECTION*****");

			}

		}
	}

	public class App1 {
		public static final Logger LOGGER = LogManager.getLogger(App1.class);
		public static void main(String[] args) throws IOException {
			LOGGER.info("Main App Execution Started");
			calculate c = new calculate();
		}
	}

}
