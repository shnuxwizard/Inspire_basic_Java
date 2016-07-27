package shnux.org.test;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.junit.Test;

import shnux.org.InspireImplString;

public class InspireStringTest {
	@Test
	public void printTheQuotes(){
		InspireImplString iIstr = new InspireImplString();
		//ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
		//executor.scheduleAtFixedRate(iIstr, 0, 1, TimeUnit.SECONDS);
		//iIstr.createQuotes();
	}
}
