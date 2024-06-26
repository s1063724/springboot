package tw.com.lccnet.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="stu_table")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="stu_id",nullable=false)//nullable，欄位不能為空
	private int stuId;
	@Column(name="stu_name",nullable=false)
	private String stuName;
	@Column(nullable=false)
	private float stuAge;
	@Column(name="stu_branch")
	private String stuBranch;
	//空參數建構子
	public Student() {
		super();
	}
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public float getStuAge() {
		return stuAge;
	}
	public void setStuAge(float stuAge) {
		this.stuAge = stuAge;
	}
	public String getStuBranch() {
		return stuBranch;
	}
	public void setStuBranch(String stuBranch) {
		this.stuBranch = stuBranch;
	}
	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuName=" + stuName + ", stuAge=" + stuAge + ", stuBranch=" + stuBranch
				+ "]";
	}
	
}
