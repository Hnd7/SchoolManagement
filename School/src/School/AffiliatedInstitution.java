package School;

public enum AffiliatedInstitution {
    Devlet(1,"Devlet"),
    Ozel(2,"Özel"),
    Vakýf(3,"Vakýf");

    private int affiliatedInstitutionID;
    private String affiliatedInstitutionName;

    AffiliatedInstitution(int affiliatedInstitutionID,String affiliatedInstitutionName){
        this.affiliatedInstitutionID = affiliatedInstitutionID;
        this.affiliatedInstitutionName = affiliatedInstitutionName;
    }

    public int getAffiliatedInstitutionID() {
        return this.affiliatedInstitutionID;
    }
    public String getAffiliatedInstitutionName() {
        return this.affiliatedInstitutionName;
    }
}
