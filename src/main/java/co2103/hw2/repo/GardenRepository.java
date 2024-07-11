package co2103.hw2.repo;

import co2103.hw2.model.Garden;
import co2103.hw2.model.Plot;
import org.springframework.data.repository.CrudRepository;

public interface GardenRepository extends CrudRepository<Garden, Integer> {
    public Garden findByLocation(String location);
    public Garden findByPatioName(Plot name);
    public Garden deleteById(Garden id);
}
