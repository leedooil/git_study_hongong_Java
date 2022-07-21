package sec02.exam03;

public class Button {
	OnClickListener listener;  //인터페이스 타입 필드
	
	void setOnClickListener(OnClickListener listener) {
		this.listener=listener;  //인터페이스 생성자 매개변수 초기화
	}
	
	void touch() {
		listener.onClick();   	//구현객체의 onclick()메소드 호출
	}
	static interface OnClickListener{ //중첩 인터페이스
		void onClick();
	}
}
