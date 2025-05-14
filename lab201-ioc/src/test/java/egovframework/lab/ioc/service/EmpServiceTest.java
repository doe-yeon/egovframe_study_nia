package egovframework.lab.ioc.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
    "classpath*:META-INF/spring/context-common.xml",
    "classpath*:META-INF/spring/context-emp.xml"
    //,"classpath*:META-INF/spring/context-postprocessor.xml"   // 이 주석을 풀고 테스트 시 annotationEmpService 에 대해서는 delete 메서드에 @Debug 를 설정하였으므로 trace 로그가 출력될 것임.
    })
//Java Config만 사용할 경우 위의 locations 설정된 @ContextConfiguration 전체를 주석 처리하고 밑의 주석을 풀도록 한다.
//@ContextConfiguration(classes = EmpConfig.class) 
public class EmpServiceTest {

	// TODO [Step 1-6, 2-6, 3-6] EmpServiceTest 작성
}
