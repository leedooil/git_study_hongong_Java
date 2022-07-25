package sec01.exam01;

public class Member {
	public String id;
	
	public Member(String id) {
		this.id=id;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) { //매개값이 member타입인지 확인
			Member member=(Member)obj; //member타입으로 강제타입변환하고 id필드값이
			if(id.equals(member.id)) { //동일한지 검사한 후, 동일하다면 true를 리턴
				return true;
			}
		}
		return false;  //매개값이 member 타입이 아니거나 id 필드값이 다른 경우 false를 리턴
	}
	
}
