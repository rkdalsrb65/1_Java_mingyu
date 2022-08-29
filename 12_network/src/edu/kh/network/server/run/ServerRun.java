package edu.kh.network.server.run;

import edu.kh.network.server.model.service.ServerService;

public class ServerRun {
	public static void main(String[] args) {
		
		ServerService service = new ServerService();
//		ServerService 라는 객체를 참조변수 service로 선언 후 new (heap영역에 저장)
		
		
		service.serverStart();
	}
}