package egovframework.guide.helloworld;

import static org.junit.Assert.assertEquals;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
// : 클래스 실행 
// *SpringJUnit4ClassRunner.class : 내부적으로 '스프링 컨테이너' 생성
@ContextConfiguration(locations = { "/context-helloworld.xml" })
// : 설정파일 로드 (설정파일인 /context-helloworld.xml의 context에서 'bean'을 읽어옴)
// : SpringJUnit4ClassRunner.class에서 생성된 스프링 컨테이너에 'bean'을 추가하기위해 필요함
public class HelloWorldServiceTest{
	private HelloWorldService helloworld;
	// HelloWorldService 인터페이스 클래스를 속성으로 선언
	// 이 필드는 HelloWorldService 인터페이스의 구현체 저장
	
	// <bean 주입>
	@Resource(name = "helloworld")
	// @Resource : bean의 이름 찾기
	public void setHelloWorld(HelloWorldService hello) {
		this.helloworld = hello;
	}
	@Test
	// @Test : 테스트 대상임을 알려주기
	public void sayHello() {
		assertEquals("Hello eGovFrame!!!", helloworld.sayHello());
		// assertEquals("예상 결과값", 테스트 코드의 실제 결과값) 
		// 두 값이 일치하면 test 성공 아니면 실패
	}
}