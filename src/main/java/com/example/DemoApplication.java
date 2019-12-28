package com.example;

import com.example.application.EmailApplication;
import com.example.config.AppConfig;
import com.example.entity.Email;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class DemoApplication {

    private static Logger LOG = LoggerFactory.getLogger(DemoApplication.class);

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        EmailApplication emailApplication = context.getBean(EmailApplication.class);

        emailApplication.createAndSave();
        List<Email> latest = emailApplication.getAll();

        LOG.info(latest.get(0).toString());
    }
}
