package sba2.ust;




import java.lang.System.Logger;
public class Sba {
	static Logger log = Logger.getLogger(Sba.class);
	public static void main(String[] args) {
		BasicConfigurator.configure();
		log.info("Print info");
		log.debug("Debug message");
		log.trace("trace message");
		log.warn("Warning message");
		log.error("Error message");
		log.fatal("fatal message");

	}

}



