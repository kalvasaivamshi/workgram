package com.example.demo.entity;



import lombok.Data;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Data

@Entity
@Table(name="user")
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "user_name", nullable = false, length = 100,unique=true)
	private String userName;
	
    @Column(name = "mobile_number", length = 13,unique=true)
	private String mobileNumber;
	
	@Column(name = "email", unique = true, nullable = false)
	private String emailId;
	
    @Column(name = "password", nullable = false)
	private String password;
    
    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)
	@JoinColumn(name="id", referencedColumnName = "id")
	List<com.example.demo.entity.Appoinment> appointments = new ArrayList<>();
	
}
