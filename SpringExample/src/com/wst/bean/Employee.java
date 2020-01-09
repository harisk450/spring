package com.wst.bean;

public class Employee {
	private int empNo;
    private String empName;
    private double empSal;
    private String empDep;
    private String empHireDate;
	
    
    
    public Employee() {
		super();
	}
    
    
    
	public Employee(int empNo, String empName, double empSal, String empDep, String empHireDate) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.empSal = empSal;
		this.empDep = empDep;
		this.empHireDate = empHireDate;
	}



	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
	public String getEmpDep() {
		return empDep;
	}
	public void setEmpDep(String empDep) {
		this.empDep = empDep;
	}
	public String getEmpHireDate() {
		return empHireDate;
	}
	public void setEmpHireDate(String empHireDate) {
		this.empHireDate = empHireDate;
	}
	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + ", empSal=" + empSal + ", empDep=" + empDep
				+ ", empHireDate=" + empHireDate + "]";
	}
    
    
}
