package pl.bykowski.ksb2;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class Hello {

    @EventListener(ApplicationReadyEvent.class)
    public String sayHello() {
        System.out.println("Hello");
        return "Hello!";
    }

}
