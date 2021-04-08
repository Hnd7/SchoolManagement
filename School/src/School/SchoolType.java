package School;

public enum SchoolType {
	Mesleki_ve_Teknik_Anadolu_Lisesi("Mesleki ve Teknik Anadolu Lisesi",0),
	Anadolu_Lisesi("Anadolu Lisesi",1),
	Aksam_Lisesi("Akþam Lisesi",2),
	Sosyal_Bilimler_Lisesi("Sosyal Bilimler Lisesi",3),
	Guzel_Sanatlar_Lisesi("Güzel Sanatlar Lisesi",4),
	Imam_Hatip_Lisesi("Ýmam Hatip Lisesi",5),
	Fen_Lisesi("Fen Lisesi",6),
	Spor_Lisesi("Spor Lisesi",7),
	Cok_Programli_Anadolu_Lisesi("Çok Programlý Anadolu Lisesi",8),
	Acik_Ogretim_Lisesi("Açýk Öðretim Lisesi",9),
	Mesleki_Açýk_Ogretim_Lisesi("Mesleki Açýk Öðretim Lisesi",10);
	
	
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
