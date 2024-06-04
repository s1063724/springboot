package tw.com.lccnet.model.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity	//將此class作為實體類
@Table(name = "cus_customer") //資料庫table(table名稱)
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cus_id")
	private Long cusId;
	@Column(name = "cus_name")
	private String cusName;
	@Column(name = "cus_address")
	private String cusAddress;
	public Long getCusId() {
		return cusId;
	}
	public void setCusId(Long cusId) {
		this.cusId = cusId;
	}
	public String getCusName() {
		return cusName;
	}
	public void setCusName(String cusName) {
		this.cusName = cusName;
	}
	public String getCusAddress() {
		return cusAddress;
	}
	public void setCusAddress(String cusAddress) {
		this.cusAddress = cusAddress;
	}
	
}
