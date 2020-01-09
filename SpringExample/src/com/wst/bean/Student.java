package com.wst.bean;

public class Student {
	private int stdNo;
    private String stdName;
    private double stdFees;
    private StudentAddress stdAdd;
    
    
	public Student() {
		super();
	}
	
	
	public Student(int stdNo, String stdName, double stdFees, StudentAddress stdAdd) {
		super();
		this.stdNo = stdNo;
		this.stdName = stdName;
		this.stdFees = stdFees;
		this.stdAdd = stdAdd;
	}


	public int getStdNo() {
		return stdNo;
	}
	public void setStdNo(int stdNo) {
		this.stdNo = stdNo;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public double getStdFees() {
		return stdFees;
	}
	public void setStdFees(double stdFees) {
		this.stdFees = stdFees;
	}
	public StudentAddress getStdAdd() {
		return stdAdd;
	}
	public void setStdAdd(StudentAddress stdAdd) {
		this.stdAdd = stdAdd;
	}
	@Override
	public String toString() {
		return "Student [stdNo=" + stdNo + ", stdName=" + stdName + ", stdFees=" + stdFees + ", stdAdd=" + stdAdd + "]";
	}
    
    

}
