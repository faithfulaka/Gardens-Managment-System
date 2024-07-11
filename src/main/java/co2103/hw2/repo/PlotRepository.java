package co2103.hw2.repo;

import co2103.hw2.model.Plot;
import org.springframework.data.repository.CrudRepository;

public interface PlotRepository extends CrudRepository<Plot, String> {
    public Plot findByName(String name);
}
