package com.ilkDenemeler;

public class School {
    public String name;
    public String address;
    public SchoolType schoolType;
    public AffiliatedInstitution affiliatedInstitution;
    public int isActive=1;

    public School(String name, String address, SchoolType schoolType, AffiliatedInstitution affiliatedInstitution) {
        this.name = name;
        this.address = address;
        this.schoolType = schoolType;
        this.affiliatedInstitution = affiliatedInstitution;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public SchoolType getSchoolType() {
        return schoolType;
    }

    public void setSchoolType(SchoolType schoolType) {
        this.schoolType = schoolType;
    }

    public AffiliatedInstitution getAffiliatedInstitution() {
        return affiliatedInstitution;
    }

    public void setAffiliatedInstitution(AffiliatedInstitution affiliatedInstitution) {
        this.affiliatedInstitution = affiliatedInstitution;
    }


    public int getIsActive() {
        return isActive;
    }

    public void setIsActive(int isActive) {
        this.isActive = isActive;
    }
}
