package pl.bykowski.ksb2;

import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class AnimalController {

    private AnimalFact getCatFact() {
        RestTemplate restTemplate = new RestTemplate();
        AnimalFact animalFact = restTemplate.getForObject("https://cat-fact.herokuapp.com/facts/random", AnimalFact.class);
        JsonNode image = restTemplate.getForObject("https://aws.random.cat/meow", JsonNode.class).get("file");
        animalFact.setSrc(image.asText());
        return animalFact;
    }

    @GetMapping("/animal-fact")
    public String get(Model model) {
        model.addAttribute("catFact", getCatFact());
        return "animalView";
    }




}
