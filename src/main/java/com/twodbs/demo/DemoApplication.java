package com.twodbs.demo;

import com.twodbs.demo.model.book.MyBook;
import com.twodbs.demo.model.user.User;
import com.twodbs.demo.repository.book.BookRepository;
import com.twodbs.demo.repository.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import javax.persistence.EntityManager;

@SpringBootApplication
//@ComponentScan({"com.twodb.demo.repository.user",
//        "com.twodb.demo.repository.book"})
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private BookRepository bookRepository;

    @Bean
    public CommandLineRunner demo() {
        return args -> {
            ProductInputDAta productInputDAta = new ProductInputDAta();
            User user = new User();
            user.setUserName("abhishek");
            user.setLastName("paithane");

            MyBook book = new MyBook();
            book.setBookName("book1");
            book.setAuthor("abhishek");

            userRepository.save(user);
            System.out.println("success22");
            bookRepository.save(book);
            System.out.println("success10");


        };
    }
}
