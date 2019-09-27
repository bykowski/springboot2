package pl.bykowski.ksb2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class Main {

    @Value("${name}")
    private String name;

    @EventListener(ApplicationReadyEvent.class)
    public void get() {
        System.out.println(name);;
    }

}
