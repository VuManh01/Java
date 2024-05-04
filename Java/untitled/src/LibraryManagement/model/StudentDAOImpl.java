package LibraryManagement.model;

import LibraryManagement.entity.Student;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class StudentDAOImpl implements StudentDAO{
    public static Connection connection;
    public static Connection openConnection() throws SQLException{
        connection = MySqlConnect.getMySQLConnection();
        return connection;
    }
    public static PreparedStatement pstm;
    public static PreparedStatement openPrepareStatement(String query) throws SQLException{
        pstm = openConnection().prepareStatement(query);
        return pstm;
    }
    public static void exUpdate() throws SQLException{
        pstm.executeUpdate();
    }
    public static ResultSet exQuery()throws SQLException{
        ResultSet rs = pstm.executeQuery();
        return rs;
    }
    private final String GET_ALL_STUDENT  = "SELECT * FROM student";
    public static final String GET_STUDENT_BY_ID = "SELECT * FROM student WHERE student_id = ?";
    private final String CREATE_STUDENT = "INSERT INTO student VALUES(?,?,?)";
    private final String UPDATE_STUDENT_BY_ID = "UPDATE student SET student_name = ?, student_class = ? WHERE student_id = ?";
    private final String DELETE_STUDENT = "DELETE FROM student WHERE student_id = ?";
    @Override
    public void createStudent(Student student) throws SQLException {
        openPrepareStatement(CREATE_STUDENT);
        pstm.setInt(1,student.getStudent_id());
        pstm.setString(2,student.getStudent_name());
        pstm.setString(3,student.getStudent_class());
        exUpdate();
    }

    @Override
    public ArrayList<Student> getAllStudent() throws SQLException {
        ArrayList<Student> listStudent = new ArrayList<>();
        openPrepareStatement(GET_ALL_STUDENT);
        ResultSet rs = exQuery();
        while (rs.next()){
            Student student = new Student();
            student.setStudent_id(rs.getInt(1));
            student.setStudent_name(rs.getString(2));
            student.setStudent_class(rs.getString(3));
            listStudent.add(student);
        }
        return listStudent;

    }

    @Override
    public Student getStudentById(int studentId) throws SQLException {
        Student student = new Student();
        PreparedStatement pstm = openPrepareStatement(GET_STUDENT_BY_ID);
        pstm.setInt(1,studentId);

        ResultSet rs = exQuery();
        while (rs.next()){
            System.out.println("session2.Student id: " + rs.getInt(1));
            System.out.println("session2.Student name: " +rs.getString(2));
            System.out.println("session2.Student class: " + rs.getString(3));
        }
        return student;
    }

    @Override
    public void updateStudent(Student student) throws SQLException {
        PreparedStatement pstm = openPrepareStatement(UPDATE_STUDENT_BY_ID);
        pstm.setInt(3,student.getStudent_id());
        pstm.setString(1,student.getStudent_name());
        pstm.setString(2,student.getStudent_class());
        exUpdate();
    }

    @Override
    public boolean deleteStudent(int studentId) throws SQLException {
        PreparedStatement pstm = openPrepareStatement(DELETE_STUDENT);
        pstm.setInt(1,studentId);
        int check = pstm.executeUpdate();
        if (check>0){
            System.out.println("Delete success!");
            return true;

        }else {
            System.out.println("Delete Failure!");
            return false;
        }
    }
}
