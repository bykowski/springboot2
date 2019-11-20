package pl.bykowski.ksb2;

import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class Ksb2Application {

    public static void main(String[] args) {
        SpringApplication.run(Ksb2Application.class, args);
    }

    @Bean
    public ModelMapper getModelMapper() {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.addMappings(new PropertyMap<Order, OrderDTO>() {
            @Override
            protected void configure() {
                map().setCity(source.getShippingAddress().getCity());
                map().setStreet(source.getShippingAddress().getStreet());
                map().setName(source.getCustomer().getName());
                map().setLocalDate(LocalDate.now());
            }
        });

        return modelMapper;
    }
}
