package sec03.exam11;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample {

	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("C:/Temp/test7.txt"); //데이터 출발지를 test7.txt로
		while(true) {										 //하는 문자기반 파일 입력스트림생성				
			int data=reader.read(); //한 문자씩 읽기
			if(data==-1) {			//파일 끝에 도달했을 경우 -1나온다
				break;
			}
			System.out.println((char)data);
		}
		reader.close(); //입력스트림 닫음
	}

}
