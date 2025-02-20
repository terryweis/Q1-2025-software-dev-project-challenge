package com.weist.Q1_2025_software_dev_project_challenge.data;

import com.weist.Q1_2025_software_dev_project_challenge.models.User;
import org.springframework.data.repository.CrudRepository;


public interface UserRepository  extends CrudRepository <User, Integer> {
    User findByUsername(String username);
}
