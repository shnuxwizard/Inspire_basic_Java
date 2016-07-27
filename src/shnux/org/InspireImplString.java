package shnux.org;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

/*
 * This Class is for 100 quotes that are stored in string  set
 */
public class InspireImplString implements Inspire {

	// private Set<String> quotesRepo = new TreeSet<>();
	private List<String> quotesRepo = new ArrayList<>();
	// ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);

	public InspireImplString() {
		createQuotes();
	}

	@Override
	public void createQuotes() {
		// TODO Auto-generated method stub
		quotesRepo.add("You Can Do It");
		quotesRepo.add("Dream is what ? It wakes you up! - shnux");
		quotesRepo.add("Dream a Dream, Then live it, sleep with it, read it, eat it - Swami VivekAnanda");
		quotesRepo.add("Together you can Achieve - Proverb ");
		quotesRepo.add("Do Or Die - Mahatma Ghandi");
		quotesRepo.add("Believe in THE INNER YOU! it knows everthing, and Will direct you to the RIGHT path! - Shnux");
		quotesRepo.add("Ask not for prosparity, ASK FOR Knowledge - Shnux");
		quotesRepo.add("Passion meets Knowledge --> To Realise the Dream - Shnux");
		quotesRepo.add("Work Hard / Smart , Just work to live the Dream you Dreamt of ! - Shnux");
		quotesRepo.add("All work No Play , Makes Jack a Dull boy - Proverb");
		quotesRepo.add("Try to make something happen , everthing else will follow - Modi");

		// Runnable helloRunnable = new Runnable() {
		// public void run() {
		// System.out.println("Hey Shnux");
		// }
		// };
		//
		// executor.scheduleAtFixedRate(helloRunnable, 0, 10, TimeUnit.SECONDS);
	}

	@Override
	public void readQuotes() {
		// TODO Auto-generated method stub

	}

	@Override
	public void displayQuotes() {
		Random rand = new Random();
		String quoteNow = quotesRepo.get(Math.abs(rand.nextInt() * 10) % quotesRepo.size());
		// System.out.println(quoteNow);
		// JOptionPane j = JOptionPane("Eggs are not supposed to be green.");
		// JOptionPane.showMessageDialog(null, quoteNow);
		// JOptionPane.showOptionDialog(null, quoteNow, null, 0, 0, null, null,
		// null);

		JOptionPane pane = new JOptionPane(quoteNow, JOptionPane.INFORMATION_MESSAGE);
		JDialog dialog = pane.createDialog(null, quoteNow);
		new Thread(new Runnable() {
			public void run() {
				try {
					Thread.sleep(5000);
					dialog.dispose();
				} catch (Throwable th) {
					//tracea("setValidComboIndex(): error :\n" + cThrowable.getStackTrace(th));
				}
			}
		}).start();
		dialog.setVisible(true);

	}

	// @Override
	// public void run() {
	// // System.out.println("Hello World!");
	// displayQuotes();
	// }

}
