package egovframework.lab.aop.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import egovframework.lab.aop.common.BizException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"classpath*:META-INF/spring/context-advice-xml.xml",
		"classpath*:META-INF/spring/context-aspectj-annotation.xml",
		"classpath*:META-INF/spring/context-common.xml",
		"classpath*:META-INF/spring/context-emp.xml"})
//Java Config 방식으로 테스트할 경우 아래 주석을 해제하고 위의 @ContextConfiguration을 주석 처리
//@ContextConfiguration(classes = EmpJavaConfig.class)
public class EmpServiceTest {

	// TODO [Step 1-8, 2-8, 3-7] EmpServiceTest 작성

}
