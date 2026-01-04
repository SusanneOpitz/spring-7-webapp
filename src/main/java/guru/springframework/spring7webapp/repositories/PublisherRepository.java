package guru.springframework.spring7webapp.repositories;

import guru.springframework.spring7webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by myself.
 */

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}