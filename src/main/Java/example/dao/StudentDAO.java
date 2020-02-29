package example.dao;

import example.bean.Student;

import javax.sql.DataSource;
import java.util.List;

public interface StudentDAO {

    public void setDataSource(DataSource ds);

    public void create(String name, Integer age);

    //带有事务的创建
    //编程式事务管理
    public void createWithWork_0(String name, Integer age, Integer marks, Integer year);

    //带有事务的创建
    //编程式事务管理
    public void createWithWork_1(String name, Integer age, Integer marks, Integer year);


    public Student getStudent(Integer id);

    public List<Student> listStudents();

    public void delete(Integer id);

    public void update(Integer id, Integer age);
}
