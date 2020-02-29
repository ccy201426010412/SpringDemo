package example.service;


import example.bean.Student;
import example.dao.StudentDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.List;

public class StudySever {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("file:D:\\IDEA_WorkSpace\\SpringDemo\\Demo\\src\\main\\resources\\Beans.xml");
        StudentDAO studentJDBCTemplate =
                (StudentDAO)context.getBean("studentDAOImpl");
        System.out.println("------Records Creation--------" );
//        studentJDBCTemplate.createWithWork_0("Ayan", 15,100,111);
        studentJDBCTemplate.createWithWork_1("ccy", 15,100,111);
        System.out.println("------Listing Multiple Records--------" );
        List<Student> students = studentJDBCTemplate.listStudents();
        for (Student record : students) {
            System.out.print("ID : " + record.getId() );
            System.out.print(", Name : " + record.getName() );
            System.out.println(", Age : " + record.getAge());
        }
        System.out.println("----Updating Record with ID = 2 -----" );
        studentJDBCTemplate.update(2, 20);

    }
}
