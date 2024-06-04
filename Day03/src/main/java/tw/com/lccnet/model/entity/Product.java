package tw.com.lccnet.model.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(name="pname",nullable=false)
	private String name;
	@Column(nullable=false)
	private String description;
	private boolean active;
	private String imageurl;
	@CreationTimestamp//資料建立時間
	private LocalDateTime dateCreate;
	@UpdateTimestamp//資料更新時間
	private LocalDateTime lastUpdate;
	public Product() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public String getImageurl() {
		return imageurl;
	}
	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}
	public LocalDateTime getDateCreate() {
		return dateCreate;
	}
	public void setDateCreate(LocalDateTime dateCreate) {
		this.dateCreate = dateCreate;
	}
	public LocalDateTime getLastUpdate() {
		return lastUpdate;
	}
	public void setLastUpdate(LocalDateTime lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", description=" + description + ", active=" + active
				+ ", imageurl=" + imageurl + ", dateCreate=" + dateCreate + ", lastUpdate=" + lastUpdate + "]";
	}
	
}
