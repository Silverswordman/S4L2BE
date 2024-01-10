package giuliasilvestrini.S4L2BE;

import giuliasilvestrini.S4L2BE.entities.Menu;
import giuliasilvestrini.S4L2BE.entities.Tavolo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class S4L2BeApplication {

    public static void main(String[] args) {
        SpringApplication.run(S4L2BeApplication.class, args);

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(S4L2BeApplication.class);

        Menu m = (Menu) ctx.getBean("menu");
        Tavolo t = (Tavolo) ctx.getBean("tavolo1");
        Tavolo tt = (Tavolo) ctx.getBean("tavolo2");

        m.printMenu();
        System.out.println(tt.toString() +" "+ t.toString());

//
        ctx.close();
    }

}
