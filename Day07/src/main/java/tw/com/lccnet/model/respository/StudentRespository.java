package tw.com.lccnet.model.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import tw.com.lccnet.model.entity.Student;

public interface StudentRespository extends JpaRepository<Student, Long>{

}
