package ru.job4j.pojo;

import java.util.Date;

public class Student {
    private String familyNameMidname;
    private String group;
    private Date dateOfReciept;

    public String getFNM() {
        return familyNameMidname;
    }

    public void setFNM(String familyNameMidname) {
        this.familyNameMidname = familyNameMidname;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Date getDateOfReciept() {
        return dateOfReciept;
    }

    public void setDateOfReciept(Date dateOfReciept) {
        this.dateOfReciept = dateOfReciept;
    }
}
