package School;

public enum ClassNumber {
	Hazýrlýk(0),
	Dokuz(9),
	On(10),
	Onbir(11),
	Oniki(12);
	
	private int classNumberId;
	ClassNumber(int classNumberID){
		this.classNumberId = classNumberID;
	}
	public int getClassNumberId() {
        return this.classNumberId;
    }
}
