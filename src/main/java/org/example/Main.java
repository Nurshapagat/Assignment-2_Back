package org.example;

import org.example.config.AppConfig;
import org.example.entity.Member;
import org.example.service.MembersService;
import org.example.beans.LazyBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        MembersService gymService = context.getBean(MembersService.class);
        gymService.registerMember(new Member (1, "Aibek", "Gym", 50000.0));

        MembersService yogaService = context.getBean("yogaMembersService", MembersService.class);
        yogaService.registerMember(new Member(2, "Shapi", "Yoga", 30000.0));

        context.getBean(LazyBean.class);
        context.close();
    }
}