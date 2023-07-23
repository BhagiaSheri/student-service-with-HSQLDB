package repositories;

import domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    Student findByPhone(String phone);

    Student findByName(String name);

    List<Student> findByNameOrPhone(String name, String phone);

    @Query("select s from Student s where s.email= :email")
    Student findStudentWithEmail(String email);

    @Query("select s from Student s where s.address.city= :city")
    List<Student> findStudentWithCity(String city);
}




