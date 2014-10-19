package org.jorge.twitterpromoter;

import org.jorge.twitterpromoter.io.TickerManager;

public class Main {

    /**
     * @param args The args to the main method
     */
    public static void main(String[] args) throws Exception {

        Thread dummyThreadThatWillNeverStart = new Thread();

        System.out.println("Before initing");
        TickerManager.getInstance().init();
        System.out.println("After initing");

        dummyThreadThatWillNeverStart.join();
    }
}
