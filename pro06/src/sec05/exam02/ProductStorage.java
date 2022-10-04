package sec05.exam02;

import java.util.*;

public class ProductStorage {
	private List<Product>list=new ArrayList<>(); //List 컬렉션 생성
	private Scanner sc=new Scanner(System.in);   //키보드 입력 Scanner 생성
	private int counter; //pno제공 카운터
	
	public void showMenu() {
		while(true) {
			System.out.println("--------------------------");
			System.out.println("1.등록  |  2.목록  |  3.종료");
			System.out.println("--------------------------");
			
			System.out.print("선택: ");
			String selectNo=sc.nextLine();  //번호 읽기
			switch(selectNo) {
				case "1": registerProduct(); break;  //Product 등록
				case "2": showProducts(); break;     //등록된 모든 Product정보 보기
				case "3": return;				//프로그램종료
			}
		}
	}
	
	public void registerProduct() {
		try {
			Product product = new Product();
			product.setPno(++counter); //pno 세팅
			
			System.out.print("상품명: ");
			product.setName(sc.nextLine()); //이름읽고세팅
			
			System.out.print("가격: ");
			product.setPrice(Integer.parseInt(sc.nextLine())); //가격읽고세팅
			
			System.out.print("재고: ");
			product.setStock(Integer.parseInt(sc.nextLine())); //재고읽고세팅
			
			list.add(product); //list에 Product저장
		}catch(Exception e) {
			System.out.println("등록 에러: "+e.getMessage());
		}
	}
	
	public void showProducts() {
		//list에 저장된 모든 Product정보를 모니터에 출력
		for(Product p:list) {
			System.out.println(p.getPno()+"\t"+p.getName()+"\t"+p.getPrice()+"\t"+p.getStock());
		}
	}
}
