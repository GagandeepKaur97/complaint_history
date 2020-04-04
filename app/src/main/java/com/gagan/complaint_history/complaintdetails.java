package com.gagan.complaint_history;

import java.io.Serializable;

public class complaintdetails implements Serializable {
    private  String suffix;
    private  String firstname;
    private  String Lastname;
    private  String empstatus;
    private  String designation;
    private  String streetNo;
    private  String streetName;
    private  String province;
    private  String city;
    private  String country;
    private  String postalcode;
    private  String emailid;
    private  String countryCode;
    private  String cellNumber;
    private  String issuedate;
    private  String issuetype;
    private  Float sevirty;
    private String detailedDesc;

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        this.Lastname = lastname;
    }

    public String getEmpstatus() {
        return empstatus;
    }

    public void setEmpstatus(String empstatus) {
        this.empstatus = empstatus;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getStreetNo() {
        return streetNo;
    }

    public void setStreetNo(String streetNo) {
        this.streetNo = streetNo;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCellNumber() {
        return cellNumber;
    }

    public void setCellNumber(String cellNumber) {
        this.cellNumber = cellNumber;
    }

    public String getIssuedate() {
        return issuedate;
    }

    public void setIssuedate(String issuedate) {
        this.issuedate = issuedate;
    }

    public String getIssuetype() {
        return issuetype;
    }

    public void setIssuetype(String issuetype) {
        this.issuetype = issuetype;
    }

    public Float getSevirty() {
        return sevirty;
    }

    public void setSevirty(Float sevirty) {
        this.sevirty = sevirty;
    }

    public String getDetailedDesc() {
        return detailedDesc;
    }

    public void setDetailedDesc(String detailedDesc) {
        this.detailedDesc = detailedDesc;
    }

    public complaintdetails(String suffix, String firstname, String lastname, String empstatus, String designation, String streetNo, String streetName, String province, String city, String country, String postalcode, String emailid, String countryCode, String cellNumber, String issuedate, String issuetype, Float sevirty, String detailedDesc) {
        this.suffix = suffix;
        this.firstname = firstname;
        this.Lastname = lastname;
        this.empstatus = empstatus;
        this.designation = designation;
        this.streetNo = streetNo;
        this.streetName = streetName;
        this.province = province;
        this.city = city;
        this.country = country;
        this.postalcode = postalcode;
        this.emailid = emailid;
        this.countryCode = countryCode;
        this.cellNumber = cellNumber;
        this.issuedate = issuedate;
        this.issuetype = issuetype;
        this.sevirty = sevirty;
        this.detailedDesc = detailedDesc;
    }
}
