package pl.bykowski.ksb2;

import org.springframework.stereotype.Component;

@Component
public class Observer implements Observable {


    public Observer() throws InterruptedException {
        new Task(this);
    }

    @Override
    public void notify(String result) {
        System.out.println(result);
    }
}
