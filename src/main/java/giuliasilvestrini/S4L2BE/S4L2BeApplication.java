package giuliasilvestrini.S4L2BE;

import giuliasilvestrini.S4L2BE.entities.Menu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class S4L2BeApplication {

	public static void main(String[] args) {
		SpringApplication.run(S4L2BeApplication.class, args);

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(S4L2BeApplication.class);

		Menu m = (Menu) ctx.getBean("menu");

		m.printMenu();
		ctx.close();
	}

}
