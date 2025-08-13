package thanvir.ahmed.app.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import thanvir.ahmed.app.model.Student;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepo {

    private JdbcTemplate jdbc;

    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    List<Student> students = new ArrayList<>();

    public void save(Student student) {
        String sql = "INSERT INTO STUDENT(rollno, name, marks) VALUES(?,?,?)";
        int rowCount = jdbc.update(sql, student.getRollno(), student.getName(), student.getMarks());
        System.out.println(rowCount + " row inserted");
    }

    public List<Student> findAll() {
//        RowMapper rowMapper = new RowMapper() {
//            @Override
//            public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
//                Student student = new Student();
//                student.setRollno(rs.getInt("rollno"));
//                student.setName(rs.getString("name"));
//                student.setMarks(rs.getInt("marks"));
//                return student;
//            }
//        };

        return jdbc.query("select * from student", (rs, rowNum) -> {
            Student student = new Student();
            student.setRollno(rs.getInt("rollno"));
            student.setName(rs.getString("name"));
            student.setMarks(rs.getInt("marks"));
            return student;
        });
    }
}
