package co2103.hw2.repo;

import co2103.hw2.model.Flower;
import org.springframework.data.repository.CrudRepository;

public interface FlowerRepository extends CrudRepository<Flower, Integer> {
    public Flower findByHeight(int h);
}
