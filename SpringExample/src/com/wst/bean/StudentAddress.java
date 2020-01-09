package com.wst.bean;

public class StudentAddress {
	private int addId;
    private String addLine1;
    private String addLine2;
    private String landmark;
    private String city;
    private String state;
    private String country;
    private int zipCode;
    StudentContact stdCon;
    
     
	public StudentAddress() {
		super();
	}
	
	
	public StudentAddress(int addId, String addLine1, String addLine2, String landmark, String city, String state,
			String country, int zipCode, StudentContact stdCon) {
		super();
		this.addId = addId;
		this.addLine1 = addLine1;
		this.addLine2 = addLine2;
		this.landmark = landmark;
		this.city = city;
		this.state = state;
		this.country = country;
		this.zipCode = zipCode;
		this.stdCon = stdCon;
	}


	public int getAddId() {
		return addId;
	}
	public void setAddId(int addId) {
		this.addId = addId;
	}
	public String getAddLine1() {
		return addLine1;
	}
	public void setAddLine1(String addLine1) {
		this.addLine1 = addLine1;
	}
	public String getAddLine2() {
		return addLine2;
	}
	public void setAddLine2(String addLine2) {
		this.addLine2 = addLine2;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	public StudentContact getStdCon() {
		return stdCon;
	}
	public void setStdCon(StudentContact stdCon) {
		this.stdCon = stdCon;
	}
	@Override
	public String toString() {
		return "StudentAddress [addId=" + addId + ", addLine1=" + addLine1 + ", addLine2=" + addLine2 + ", landmark="
				+ landmark + ", city=" + city + ", state=" + state + ", country=" + country + ", zipCode=" + zipCode
				+ ", stdCon=" + stdCon + "]";
	}
    
    

}
