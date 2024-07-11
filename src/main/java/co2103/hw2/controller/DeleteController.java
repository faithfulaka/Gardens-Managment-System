package co2103.hw2.controller;
import co2103.hw2.model.Flower;
import co2103.hw2.model.Garden;
import co2103.hw2.model.Plot;
import co2103.hw2.repo.FlowerRepository;
import co2103.hw2.repo.GardenRepository;
import co2103.hw2.repo.PlotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DeleteController {
    @Autowired
    private GardenRepository repo1;
    @Autowired
    private FlowerRepository repo2;
    @Autowired
    private PlotRepository repo3;

    @RequestMapping("/deleteGarden")
    public String deleteGarden(@RequestParam int id) {
        repo1.deleteById(id);
        return "redirect:/";
    }

    @RequestMapping("/deletePlot")
    public String deletePlot(@RequestParam String name) {
        for (Garden garden: repo1.findAll()) {
            if (garden.getPlots().contains(repo3.findByName(name))) {
                garden.getPlots().remove(repo3.findByName(name));
                if (garden.getPatio().equals(repo3.findByName(name))) {
                    garden.setPatio(null);
                }
                repo1.save(garden);
            }
        }
        repo3.delete(repo3.findByName(name));
        return "redirect:/";
    }

    @RequestMapping("/deleteFlower")
    public String deleteFlower(@RequestParam int identifier) {

        if (repo2.existsById(identifier)){
            Flower flower = repo2.findById(identifier).get();
            for (Plot p: repo3.findAll()){
                if(p.getFlowers().contains(flower)){
                    p.getFlowers().remove(flower);
                    if (p.getSeasonal() != null && p.getSeasonal().getIdentifier()==identifier){
                        p.setSeasonal(null);
                    }
                    repo3.save(p);
                }
            }
            repo2.deleteById(identifier);
        }
        return "redirect:/";
    }
}

