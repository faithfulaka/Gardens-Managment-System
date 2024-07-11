package co2103.hw2.controller;

import co2103.hw2.repo.GardenRepository;
import co2103.hw2.repo.FlowerRepository;
import co2103.hw2.repo.PlotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
@Controller
public class ListController {
    @Autowired
    private GardenRepository repo1;
    @Autowired
    private FlowerRepository repo2;
    @Autowired
    private PlotRepository repo3;


    @GetMapping("/listPlot")
    public String Plot(Model model) {
        model.addAttribute("data", repo3.findAll());
        return "list";
    }

    @GetMapping("/listGarden")
    public String Garden(Model model) {
        model.addAttribute("data", repo1.findAll());
        return "list";
    }
    @GetMapping("/listFlower")
    public String Flower(Model model) {
        model.addAttribute("data", repo2.findAll());
        return "list";
    }
}
