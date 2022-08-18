package sec03.exam13;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample {

	public static void main(String[] args) throws Exception {
		Reader reader=new FileReader("C:/Temp/test9.txt");//데이터 출발지를 test9.txt로 하는
														//문자기반 파일 입력스트림 생성
		char[]buffer=new char[5];
		
		int readCharNum=reader.read(buffer,2,3);//입력스트림으로 부터 3개의 문자를 읽고
		System.out.println(readCharNum);		//버퍼 2,3,4에 각각 저장 나머지 0과1에는 
		if(readCharNum!=-1) {					//char형의 초기값 유니코드 0과0이 각각 저장됨
			for(int i=0;i<buffer.length;i++) {
				System.out.println(buffer[i]);
			}//읽은 문자가 있다면 배열 전체를 읽고 출력
		}
		reader.close(); //입력 스트림 닫음
	}

}
