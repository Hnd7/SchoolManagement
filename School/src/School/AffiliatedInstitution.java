package School;

public enum AffiliatedInstitution {
    Devlet(1,"Devlet"),
    Ozel(2,"�zel"),
    Vak�f(3,"Vak�f");

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
