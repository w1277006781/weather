import com.utry.action.StudentAction;
import com.utry.entity.StudentEntity;
import com.utry.service.StudentService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by w1277006781 on 2018/7/22.
 */
public class StudentTest {
    public         ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

    @Test
    public void ss(){
        StudentService serviceImp =(StudentService) context.getBean("serviceImp");
        List<StudentEntity> studentEntities = serviceImp.queryAll();
        for (int i = 0; i < studentEntities.size(); i++) {
            System.out.println(studentEntities.get(i));
        }

    }
    @Test
    public void tt(){
        StudentAction studentAction =(StudentAction) context.getBean("studentAction");
        System.out.println(studentAction.queryAll());
    }
}
