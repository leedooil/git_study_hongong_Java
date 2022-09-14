package sec04.exam03;

import java.io.*;

public class ReadLineExample {

	public static void main(String[] args) throws Exception {
		//문자기반 입력스트림 얻기
		Reader reader=new FileReader("E:\\leedooil\\pro06\\src\\sec04\\exam03\\language.txt");
		
		//BufferedReader 보조 스트림연결
		BufferedReader br=new BufferedReader(reader);
		
		while(true) {
			String data=br.readLine(); //라인 단위 문자열을 읽고 리턴
			if(data==null) { //파일 끝에 도달했을 경우
				break;
				
			}
			System.out.println(data);
		}
		br.close(); //입력스트림닫기
	}

}
