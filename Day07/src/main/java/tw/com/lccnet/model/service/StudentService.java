package tw.com.lccnet.model.service;

import java.util.List;

import tw.com.lccnet.model.entity.Student;

public interface StudentService {
	List<Student> getAllStudent();
	
	Student saveStudent(Student student);
	
	Student getStudentById(Long id);
	
	Student updateStudent(Student student);
	
	void deleteStudentById(Long id);
}
