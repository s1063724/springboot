package tw.com.lccnet.model.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import tw.com.lccnet.model.entity.Student;
import tw.com.lccnet.model.service.StudentService;

@Controller
public class StudentController {

	private StudentService studentService;

	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	//輸出全部Student
	@GetMapping("/students")
	public String listStudents(Model model) {
		model.addAttribute("students",studentService.getAllStudent());
		return "students";
	}
	//跳至新增Student頁面
	@GetMapping("/students/new")
	public String createSudentForm(Model model) {
		Student student=new Student();
		model.addAttribute("student",student);
		
		return "create_student";//跳到view頁面
	}
	//新增輸入內容
	//@ModelAttribute("student")指定傳入的意思
	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student") Student student) {
		
		studentService.saveStudent(student);
		return "redirect:/students";
	}
	
	//更新的控制
	@GetMapping("/students/edit/{id}")
	public String editStudentForm(@PathVariable Long id, Model model) {
		model.addAttribute("student",studentService.getStudentById(id));
		return "edit_student";
	}
	
	//更新的存檔
	@PostMapping("/students/{id}")
	public String updateStudent(@PathVariable Long id,@ModelAttribute("student") Student student,Model model) {
		
		Student existingStudent=studentService.getStudentById(id);
		existingStudent.setId(id);
		existingStudent.setFirstName(student.getFirstName());
		existingStudent.setLastName(student.getLastName());
		existingStudent.setEmail(student.getEmail());
		//save update
		studentService.updateStudent(existingStudent);
		return "redirect:/students";
	}
	//刪除
	@GetMapping("/students/{id}")
	public String deleteStudent(@PathVariable Long id) {
		studentService.deleteStudentById(id);
		return "redirect:/students";
	}
}
