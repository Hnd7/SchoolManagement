package com.ilkDenemeler;

public enum AffiliatedInstitution {
    Devlet(1,"Devlet"),
    Ozel(2,"Özel"),
    Vakıf(3,"Vakıf");

    private int affiliatedInstitutionID;
    private String affiliatedInstitutionName;

    AffiliatedInstitution(int affiliatedInstitutionID,String affiliatedInstitutionName){
        this.affiliatedInstitutionID = affiliatedInstitutionID;
        this.affiliatedInstitutionName = affiliatedInstitutionName;
    }

    public int getAffiliatedInstitutionId() {
        return this.affiliatedInstitutionID;
    }
    public String getAffiliatedInstitutionName() {
        return this.affiliatedInstitutionName;
    }
}

