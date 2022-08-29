package edu.kh.network.client.run;

import edu.kh.network.client.model.service.ClientService;

public class ClientRun {
	public static void main(String[] args) {
		
		ClientService service = new ClientService();
//		ClientService 라는 객체를 참조변수 service로 선언 후 new (heap영역에 저장)
		
		
		service.clientStart();
	}
}