package giuliasilvestrini.S4L2BE;

import giuliasilvestrini.S4L2BE.entities.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class S4L2BeApplication {

    public static void main(String[] args) {
        SpringApplication.run(S4L2BeApplication.class, args);

//        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(S4L2BeApplication.class);
//
//        Menu m = (Menu) ctx.getBean("menu");
//        Tavolo t = (Tavolo) ctx.getBean("tavolo1");
//        Tavolo tt = (Tavolo) ctx.getBean("tavolo2");
//
//        m.printMenu();
////        System.out.println(tt.toString() +" "+ t.toString());
//
//        List<MenuItem> prodottiOrdinati = new ArrayList<MenuItem>();
//        prodottiOrdinati.add(ctx.getBean("salami_pizza", Pizza.class));
//        prodottiOrdinati.add(ctx.getBean("hawaiian_pizza", Pizza.class));
//        prodottiOrdinati.add(ctx.getBean("wine", Drink.class));
//        prodottiOrdinati.add(ctx.getBean("water", Drink.class));
//
//        Order order1= new Order(4,tt,prodottiOrdinati);
//        System.out.println(order1);
//        ctx.close();
    }

}
