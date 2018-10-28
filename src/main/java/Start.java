import com.springcorestart.Impls.Robot.ModelT1000;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

        ModelT1000 t1000 = (ModelT1000) context.getBean("t1000");
        t1000.action();
        System.out.println(t1000);

        ModelT1000 t2000 = (ModelT1000) context.getBean("t2000");
        t2000.action();
        System.out.println(t2000);
    }

}