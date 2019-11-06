package pl.bykowski.ksb2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component //CRUD
public class Start {

    private ToyRepo toyRepo;

    @Autowired
    public Start(ToyRepo toyRepo) {
        this.toyRepo = toyRepo;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void init() {
        Toy toyTeddy = new Toy("Miś uszatek", ToyType.TEDDY_BEAR);
        Toy toyDoll = new Toy("Lala", ToyType.DOLL);

//        toyRepo.save(toyTeddy);
//        toyRepo.save(toyDoll);


        Toy toy = toyRepo.findById("5dc32beaf6578532905c9890").get();
        toyRepo.delete(toy);

        toyRepo.deleteById("5dc32beaf6578532905c9891");


        toyRepo.findAll().forEach(System.out::println);


    }


}
