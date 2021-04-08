package School;

public enum SchoolType {
	Mesleki_ve_Teknik_Anadolu_Lisesi("Mesleki ve Teknik Anadolu Lisesi",0),
	Anadolu_Lisesi("Anadolu Lisesi",1),
	Aksam_Lisesi("Ak�am Lisesi",2),
	Sosyal_Bilimler_Lisesi("Sosyal Bilimler Lisesi",3),
	Guzel_Sanatlar_Lisesi("G�zel Sanatlar Lisesi",4),
	Imam_Hatip_Lisesi("�mam Hatip Lisesi",5),
	Fen_Lisesi("Fen Lisesi",6),
	Spor_Lisesi("Spor Lisesi",7),
	Cok_Programli_Anadolu_Lisesi("�ok Programl� Anadolu Lisesi",8),
	Acik_Ogretim_Lisesi("A��k ��retim Lisesi",9),
	Mesleki_A��k_Ogretim_Lisesi("Mesleki A��k ��retim Lisesi",10);
	
	
	private String schoolTypeName;
	private int schoolTypeId;
	SchoolType(String schoolTypeName, int schoolTypeId) {
		// TODO Auto-generated constructor stub
		this.schoolTypeId = schoolTypeId;
		this.schoolTypeName = schoolTypeName;

	}
	public String getSchoolTypeName() {
		return this.schoolTypeName;
	}
	public int getSchoolTypeId() {
		return this.schoolTypeId;
	}

	

}
