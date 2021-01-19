package com.app.easyselling.repo;

import com.app.easyselling.Model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository< User,Integer> {
}
