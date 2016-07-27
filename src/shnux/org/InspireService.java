package shnux.org;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class InspireService {

	public static void main(String[] args) {

		Runnable inspireRun = new Runnable() {
		    public void run() {
		        //System.out.println("Hello Shnux");
		    	InspireImplString i = new InspireImplString();
		    	i.displayQuotes();
		    }
		};
		
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
		executor.scheduleAtFixedRate(inspireRun, 0, 10, TimeUnit.SECONDS);
	}

}
