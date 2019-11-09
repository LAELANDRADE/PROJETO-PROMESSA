package br.com.lael.promiseproject;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Locale;

/**
 * Created by caioaraujo on 09/11/19.
 */
public class App {

    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));
        new ClassPathXmlApplicationContext("META-INF/spring-config.xml");
    }

}
