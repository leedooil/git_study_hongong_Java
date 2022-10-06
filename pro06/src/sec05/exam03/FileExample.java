package sec05.exam03;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExample {

	public static void main(String[] args) throws Exception {
		//File 객체 생성
		File dir = new File("C:/Temp/images"); //폴더 객체 생성
		File file1 = new File("C:/Temp/file1.txt");  //파일 객체 생성
		File file2 = new File("C:/Temp/file2.txt");	 //파일 객체 생성	
		File file3 = new File("C:/Temp/file3.txt");	 //파일 객체 생성
		
		//폴더 또는 파일이 존재하지 않으면 생성
		if(dir.exists()==false) {dir.mkdirs();}  //폴더를 생성할때
		if(file1.exists()==false) {file1.createNewFile();}  //파일을 생성할때
		if(file2.exists()==false) {file2.createNewFile();}	//파일을 생성할때
		if(file3.exists()==false) {file3.createNewFile();}	//파일을 생성할때
		
		//C:/Temp 폴더의 내용 목록을 File 배열로 얻음
		File temp = new File("C:/Temp");
		File[]contents = temp.listFiles();
		
		System.out.println("시간\t\t\t형태\t\t크기\t이름");
		System.out.println("--------------------------------");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH-mm");
		for(File file : contents) {
			//폴더 또는 파일 정보를 출력
			System.out.print(sdf.format(new Date(file.lastModified())));
			//isDirectory는 지금 폴더가 있니? 폴더랑 파일이랑 다름주의
			if(file.isDirectory()) {
				System.out.print("\t<DIR>\t\t\t"+file.getName());
			}else {
				System.out.print("\t\t\t"+file.length()+"\t"+file.getName());
			}
			System.out.println();
		}
	}

}
