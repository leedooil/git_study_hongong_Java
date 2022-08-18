package sec03.exam12;

import java.io.FileReader;
import java.io.Reader;


public class ReadExample {

	public static void main(String[] args) throws Exception {
		Reader reader=new FileReader("C:/Temp/test8.txt");//데이터 출발지를 test8.txt로하는
														 //문자기반 파일 입력스트림생성	
		char[]buffer=new char[100]; //길이 100인 배열 생성
		
		while(true) {
			int readCharNum=reader.read(buffer); //배열 길이만큼 읽기
			System.out.println(readCharNum);
			if(readCharNum==-1) { //파일 끝에 도달했을 경우 -1나옴
				break;
			}
			for(int i=0;i<readCharNum;i++) { // 읽은 문자 수만큼 반복하면서 배열에
				System.out.println(buffer[i]);//저장된 문자를 출력		
			}
		}
		reader.close(); //입력 스트림닫음
	}

}
