package co2103.hw2;

import co2103.hw2.model.Garden;
import co2103.hw2.model.Flower;
import co2103.hw2.model.Plot;
import co2103.hw2.repo.GardenRepository;
import co2103.hw2.repo.FlowerRepository;
import co2103.hw2.repo.PlotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Hw2Application implements CommandLineRunner {
    @Autowired
    private GardenRepository repo1;
    @Autowired
    private FlowerRepository repo2;
    @Autowired
    private PlotRepository repo3;


    public static void main(String[] args) {
        SpringApplication.run(Hw2Application.class, args);
    }
    @Override
    public void run(String... args) throws Exception {
        Flower flower1 = new Flower();
        flower1.setHeight(10);

        Plot plot1 = new Plot();
        plot1.setName("PlotOne");
        plot1.setSeasonal(flower1);
        plot1.setFlowers(List.of(flower1));
//        repo3.save(plot1);

        Garden garden1 = new Garden();
        garden1.setLocation("3 Calderon street");
        garden1.setPatio(plot1);
        plot1.setGardens(List.of(garden1));
        garden1.setPlots(List.of(plot1));

        repo2.save(flower1);
        repo1.save(garden1);
    }
}