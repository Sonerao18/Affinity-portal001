package com.nt.proj1_hi_wit_4_quick;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Student_table")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class stud {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
   private int sid;
	@Column(name = "Student_name" ,length = 50)
   private String sname;
   
}
