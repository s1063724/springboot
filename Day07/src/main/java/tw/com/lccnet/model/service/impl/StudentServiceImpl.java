package tw.com.lccnet.model.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import tw.com.lccnet.model.entity.Student;
import tw.com.lccnet.model.respository.StudentRespository;
import tw.com.lccnet.model.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService{

	private StudentRespository studentRespository;
	
	public StudentServiceImpl(StudentRespository studentRespository) {
		super();
		this.studentRespository = studentRespository;
	}


	@Override
	public List<Student> getAllStudent() {
		
		
		return studentRespository.findAll();//根據實例查詢
	}


	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRespository.save(student);
	}


	@Override
	public Student getStudentById(Long id) {
		
		return studentRespository.findById(id).get();
	}


	@Override
	public Student updateStudent(Student student) {		
		return studentRespository.save(student);
	}


	@Override
	public void deleteStudentById(Long id) {
		studentRespository.deleteById(id);		
	}

}
