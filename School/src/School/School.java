package School;

public class School {
	public String name; 
	public String address;
	public String schoolType;
	public String affiliatedInstitution;
	public Building[] buildings;
	
	
	public School(String name,String address, String schoolType, String affiliatedInstitution) {
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

    public String getSchoolType() {
        return schoolType;
    }

    public void setSchoolType(String schoolType) {
        this.schoolType = schoolType;
    }

    public String getAffiliatedInstitution() {
        return affiliatedInstitution;
    }

    public void setAffiliatedInstitution(String affiliatedInstitution) {
        this.affiliatedInstitution = affiliatedInstitution;
    }

    public Building[] getBuildings() { 
        return buildings;
    }

    public void setBuildings(Building[] buildings) {
        this.buildings = buildings;
    }

}
	