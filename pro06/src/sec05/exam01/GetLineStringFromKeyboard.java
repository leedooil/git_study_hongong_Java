package sec05.exam01;

import java.io.*; //io는 자바 입출력관련 패키지

public class GetLineStringFromKeyboard {

	public static void main(String[] args) throws Exception {
		InputStream is=System.in;

		//InputStream을 Reader로 변환
		Reader reader=new InputStreamReader(is);
		
		//BufferedReader에 다시 연결
		BufferedReader br=new BufferedReader(reader);
		
		while(true) {
			System.out.print("입력하세요:");
			
			//라인 단위로 문자열을 읽음
			String lineStr=br.readLine();
			
			//q또는quit를 읽었을 때 while 반복문 종료
			if(lineStr.equals("q")||lineStr.equals("quit")) {
				break;
			}
			System.out.print("입력된 내용: "+lineStr);
			System.out.println();
		}
		br.close(); //입력 스트림 닫기
		
	}

}
