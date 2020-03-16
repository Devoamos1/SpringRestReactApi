package com.wiredbrain.friends.Repository;

import com.wiredbrain.friends.model.Child;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ChildRepository extends CrudRepository<Child, Long> {

    Child findById(long id);
    List<Child> findByLastName(String last_name);

}
