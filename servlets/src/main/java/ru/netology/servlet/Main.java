package ru.netology.servlet;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.netology.repository.PostRepository;

public class Main {
    public static void main(String[] args) {
        final var context = new AnnotationConfigApplicationContext(JavaConfig.class);

        final var controller = context.getBean("postConroller");
    }

}
