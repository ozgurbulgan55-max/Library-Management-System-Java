package Classes;

public class Member {

	private String name;
	private String surname;
	private int MemberNo;
	
	public Member(String name,String surname,int MemberNo) {
		this.name=name;
		this.surname=surname;
		this.MemberNo=MemberNo;
	}
	public String getname(){
		return name;
	}
	public String getsurname(){
		return surname;
	}
	public int getMemberNo(){
		return MemberNo;
	}
	
	public String toString() {
		return"Üye Bilgileri\n" +
	               "Ad : " + name +
	               "\nSoyad : " + surname +
	               "\nÜye No: " + MemberNo;

	}
}
