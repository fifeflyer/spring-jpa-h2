package com.example.application;

import com.example.config.PersistenceTestConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasSize;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {PersistenceTestConfig.class})
@Transactional
public class EmailApplicationTest {

    @Resource
    private EmailApplication emailApplication;

    @Test
    public void createAndSave() {
        emailApplication.createAndSave();
        assertThat(emailApplication.getAll(), hasSize(1));
    }
}