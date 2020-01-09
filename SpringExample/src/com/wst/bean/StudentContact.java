package com.wst.bean;

public class StudentContact {
	private int contactId;
    private String phoneNo;
    private String emailId;
    private String whatsapp;
	
    
    public StudentContact() {
		super();
	}
    
    
	public StudentContact(int contactId, String phoneNo, String emailId, String whatsapp) {
		super();
		this.contactId = contactId;
		this.phoneNo = phoneNo;
		this.emailId = emailId;
		this.whatsapp = whatsapp;
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
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getWhatsapp() {
		return whatsapp;
	}
	public void setWhatsapp(String whatsapp) {
		this.whatsapp = whatsapp;
	}
	@Override
	public String toString() {
		return "StudentContact [contactId=" + contactId + ", phoneNo=" + phoneNo + ", emailId=" + emailId
				+ ", whatsapp=" + whatsapp + "]";
	}
    
    

}
