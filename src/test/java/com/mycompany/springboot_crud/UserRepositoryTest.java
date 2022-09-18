package com.mycompany.springboot_crud;

import com.mycompany.springboot_crud.user.User;
import com.mycompany.springboot_crud.user.UserRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import java.util.Optional;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class UserRepositoryTest {

    @Autowired
    private UserRepository repo;

    @Test
    public void testAddNew() { // for testing the adding of new user

        User user = new User();
        user.setEmail("nityaagarwal@gmail.com");
        user.setPassword("Nitya@2411");
        user.setFirstName("Nitya");
        user.setLastName("Agarwal");

        User savedUser = repo.save(user); // to save the object in the database

        Assertions.assertThat(savedUser).isNotNull();//for fluent testing of the api already have a library that check some conditions
        Assertions.assertThat(savedUser.getId()).isGreaterThan(0);


    }

    @Test
    public void testListAll() { // gives all the data
        Iterable<User> users = repo.findAll();
        Assertions.assertThat(users).hasSizeGreaterThan(0);

        for (User user : users
        ) {
            System.out.println(user);

        }
    }

    @Test
    public void testUpdate() { // update the user
        Integer userId = 1;
        Optional<User> optionalUser = repo.findById(userId);// to find the user by id and then update that user
        User user = optionalUser.get();
        user.setPassword("changedPassword");
        repo.save(user);

        User updatedUser = repo.findById(userId).get();
        Assertions.assertThat(updatedUser.getPassword()).isEqualTo("changedPassword"); // check wether updated or not


    }

    @Test
    public void testGet() {
        Integer userId = 2;
        Optional<User> optionalUser = repo.findById(userId);
        Assertions.assertThat(optionalUser).isPresent();

        System.out.println(optionalUser.get());
    }

    @Test
    public void testDelete() {
        Integer userId = 2;
        repo.deleteById(userId);

        Optional<User> deletedUser = repo.findById(userId);
        Assertions.assertThat(deletedUser).isNotPresent();
    }

}
