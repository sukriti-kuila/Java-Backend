package com.springcore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("ob")
public class Student {
	@Value("Sukriti")
	private String studentName;
	@Value("Kolkata")
	private String city;
	@Value("#{f1}")
	private List<String> frnds;
	@Value("#{ T(java.lang.Math).sqrt(25) }")
	private double z;
	public List<String> getFrnds() {
		return frnds;
	}
	public void setFrnds(List<String> frnds) {
		this.frnds = frnds;
	}
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", city=" + city + ", frnds=" + frnds + ", z=" + z + "]";
	}
	
	
}
