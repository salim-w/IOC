package presentation;
import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.ConfigurableEnvironment;
@Configuration
@ComponentScan(basePackages = {"dao", "metier"})
public class Presentation2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Presentation2.class);
        ConfigurableEnvironment environment = context.getEnvironment();
        environment.setActiveProfiles("dev");  
        IMetier metier = context.getBean(IMetier.class);
        System.out.println("Résultat avec le profil actif = " + metier.calcul());
        context.close();
    }
}

