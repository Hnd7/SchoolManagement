package School;

public enum Lessons {
	Fizik("Fizik",1,2,2,0,0),
	Beden_Egitimi("Beden E�itimi",2,2,2,2,2),
	Kimya("Kimya",3,2,2,0,0),
	Sa�l�k_Bilgisi("Sa�l�k Bilgisi",4,1,0,0,0),
	Matematik("Matematik",5,6,6,0,0),
	Biyoloji("Biyoloji",6,2,2,0,0),
	Gorsel_Sanatlar("G�rsel Sanatlar",7,1,1,1,1),
	Muzik("M�zik",8,1,1,1,1),
	�ngilizce("�ngilizce",9,4,4,4,4),
	Tarih("Tarih",10,2,2,2,0),
	Din_Kulturu_ve_Ahlak_Bilgisi("Din K�lt�r� ve Ahlak Bilgisi",11,2,2,2,2),
	�kinci_Yabanci_Dil("�kinci Yabanci Dil",12,2,2,2,2),
	Cografya("Co�rafya",13,2,2,0,0),
	Turk_Dili_ve_Edebiyati("T�rk Dili ve Edebiyat�",14,5,5,5,5);
	private String lessonsName;
	private int lessonsCode;
	private int ninthGrade;
	private int tenthGrade;
	private int eleventhGrade;
	private int twelfthGrade;
	Lessons(String lessonsName, int lessonsCode, int ninthGrade, int tenthGrade, int eleventhGrade, int twelfthGrade) {
	    this.lessonsName = lessonsName;
	    this.lessonsCode = lessonsCode;
	    this.ninthGrade = ninthGrade;
	    this.tenthGrade = tenthGrade;
	    this.eleventhGrade = eleventhGrade;
	    this.twelfthGrade = twelfthGrade;
	}
	
	public String getLessonsName() {
		return lessonsName;
	}

	public void setLessonsName(String lessonsName) {
		this.lessonsName = lessonsName;
	}

	public int getLessonsCode() {
		return lessonsCode;
	}

	public void setLessonsCode(int lessonsCode) {
		this.lessonsCode = lessonsCode;
	}

	public int getNinthGrade() {
		return ninthGrade;
	}

	public void setNinthGrade(int ninthGrade) {
		this.ninthGrade = ninthGrade;
	}

	public int getTenthGrade() {
		return tenthGrade;
	}

	public void setTenthGrade(int tenthGrade) {
		this.tenthGrade = tenthGrade;
	}

	public int getEleventhGrade() {
		return eleventhGrade;
	}

	public void setEleventhGrade(int eleventhGrade) {
		this.eleventhGrade = eleventhGrade;
	}

	public int getTwelfthGrade() {
		return twelfthGrade;
	}

	public void setTwelfthGrade(int twelfthGrade) {
		this.twelfthGrade = twelfthGrade;
	}


}
