package org.sid.dao;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.sid.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@DataJpaTest
class UserRepoTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private UserRepo userRepository;


    @Test
    void whenFindByEmail_thenReturnUser() {
        // given
        User usertest = new User("test@gmail.com","","");
        entityManager.persist(usertest);
        entityManager.flush();

        // when
        User found = userRepository.findByEmail(usertest.getEmail());

        // then
        assertThat(found.getEmail())
                .isEqualTo(usertest.getEmail());
    }

    @Test
    void whenFindByCin_thenReturnUser() {
        // given
        User usertest = new User("","BC4568","");
        entityManager.persist(usertest);
        entityManager.flush();

        // when
        User found = userRepository.findByCin(usertest.getCin());

        // then
        assertThat(found.getCin())
                .isEqualTo(usertest.getCin());
    }

    @Test
    void whenFindByIdU_thenReturnUser() {
        // given
        User usertest = new User(5445L);
        entityManager.persist(usertest);
        entityManager.flush();

        // when
        User found = userRepository.findByIdU(usertest.getIdU());

        // then
        assertThat(found.getIdU())
                .isEqualTo(usertest.getIdU());
    }

    @Test
    void whenFindByToken_thenReturnUser() {
        // given
        User usertest = new User("","","25");
        entityManager.persist(usertest);
        entityManager.flush();

        // when
        User found = userRepository.findByToken(usertest.getToken());

        // then
        assertThat(found.getToken())
                .isEqualTo(usertest.getToken());
    }
}