package egovframework.guide.helloworld;

import org.springframework.beans.factory.annotation.Autowired;

public class HelloWorldServiceImpl implements HelloWorldService{

	private String name;
	
	@Autowired
	// @Autowired : bean의 타입 찾기
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String sayHello() {
		return "Hello " + name + "!!!" ;
	}
}
