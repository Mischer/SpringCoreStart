import com.springcorestart.impls.robot.ModelT1000;
import com.springcorestart.interfaces.Robot;
import com.springcorestart.interfaces.RobotConveyor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

        ModelT1000 t1000 = (ModelT1000) context.getBean("t1000");
        t1000.action();
        t1000.dance();
        System.out.println(t1000);

        ModelT1000 t2000 = (ModelT1000) context.getBean("t2000");
        t2000.action();
        System.out.println(t2000);

        ModelT1000 t3000 = (ModelT1000) context.getBean("t3000");
        t3000.action();
        System.out.println(t3000);

        // Один singleton bean создаёт prototype bean
        RobotConveyor t1000CConveyor = (RobotConveyor) context.getBean("t1000Conveyor");
        Robot t1 = t1000CConveyor.createRobot();
        Robot t2 = t1000CConveyor.createRobot();
        Robot t3 = t1000CConveyor.createRobot();

        System.out.println("terminator1 " + t1);
        System.out.println("terminator2 " + t2);
        System.out.println("terminator3 " + t3);

    }

}