package pl.bykowski.ksb2;

import java.util.Random;

public class Task {

    public Task(Observable observable) throws InterruptedException {
        while (true) {
            int timeToSleep = new Random().nextInt(5000) + 1000;
            Thread.sleep(timeToSleep);
            observable.notify("Sleeping time:" + timeToSleep);
        }
    }
}
