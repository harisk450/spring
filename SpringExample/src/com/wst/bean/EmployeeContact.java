package com.wst.bean;

public class EmployeeContact {
	private int contactId;
    private String phoneNo;
    private String mobileNo;
    private String emailId;
    private EmployeeAddress empAdd ;
	
    public EmployeeContact() {
		super();
	}
    
    
    
    public EmployeeContact(int contactId, String phoneNo, String mobileNo, String emailId, EmployeeAddress empAdd) {
		super();
		this.contactId = contactId;
		this.phoneNo = phoneNo;
		this.mobileNo = mobileNo;
		this.emailId = emailId;
		this.empAdd = empAdd;
	}



	public int getContactId() {
		return contactId;
	}
	public void setContactId(int contactId) {
		this.contactId = contactId;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public EmployeeAddress getEmpAdd() {
		return empAdd;
	}
	public void setEmpAdd(EmployeeAddress empAdd) {
		this.empAdd = empAdd;
	}
	@Override
	public String toString() {
		return "EmployeeContact [contactId=" + contactId + ", phoneNo=" + phoneNo + ", mobileNo=" + mobileNo
				+ ", emailId=" + emailId + ", empAdd=" + empAdd + "]";
	}
    
    

}
