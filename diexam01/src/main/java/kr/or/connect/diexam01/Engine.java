package kr.or.connect.diexam01;

import org.springframework.stereotype.Component;

@Component
public class Engine {
	public Engine() {
		System.out.println("Engine 생성자");
		// TODO Auto-generated constructor stub
	}
	public void exec() {
		System.out.println("엔진이 동작합니다.");
	}
}
