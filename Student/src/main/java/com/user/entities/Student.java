package com.user.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


	@Entity
	@Table(name="Student")
	public class Student {

		
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Column(name="ID")
	private String id;
		
		@Column(name=" First Name",length=3 )
	private String firstname;
		
		@Column(name=" Last Name",length=3 )
		private String lastname;
		
		
		@Column(name="Date OF Birth")
		
	private String dob;
		
		@Column(name="Section")
	private String section;
		
		@Column(name="Gender")
		private String gender;
		
		@Column(name="Marks 1")
		private int marks1;
		
		@Column(name="Marks 2")
		private int marks2;
		
		@Column(name="Marks 3")
		private int marks3;

		@Override
		public String toString() {
			return "Student [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", dob=" + dob
					+ ", section=" + section + ", gender=" + gender + ", marks1=" + marks1 + ", marks2=" + marks2
					+ ", marks3=" + marks3 + "]";
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getFirstname() {
			return firstname;
		}

		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}

		public String getLastname() {
			return lastname;
		}

		public void setLastname(String lastname) {
			this.lastname = lastname;
		}

		public String getDob() {
			return dob;
		}

		public void setDob(String dob) {
			this.dob = dob;
		}

		public String getSection() {
			return section;
		}

		public void setSection(String section) {
			this.section = section;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public int getMarks1() {
			return marks1;
		}

		public void setMarks1(int marks1) {
			this.marks1 = marks1;
		}

		public int getMarks2() {
			return marks2;
		}

		public void setMarks2(int marks2) {
			this.marks2 = marks2;
		}

		public int getMarks3() {
			return marks3;
		}

		public void setMarks3(int marks3) {
			this.marks3 = marks3;
		}

		public Student(String id, String firstname, String lastname, String dob, String section, String gender,
				int marks1, int marks2, int marks3) {
			super();
			this.id = id;
			this.firstname = firstname;
			this.lastname = lastname;
			this.dob = dob;
			this.section = section;
			this.gender = gender;
			this.marks1 = marks1;
			this.marks2 = marks2;
			this.marks3 = marks3;
		}
		
	
		
		
		
	}


