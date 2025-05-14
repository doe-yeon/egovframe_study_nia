package egovframework.lab.dataaccess.service.impl;

import java.util.List;

import org.egovframe.rte.psl.dataaccess.mapper.Mapper;

import egovframework.lab.dataaccess.service.EmpVO;

/**
 * Mapper Interface - 메서드명과 쿼리ID를 매핑하여 쿼리호출
 */
@Mapper("empMapper")
public interface EmpMapper {

	// TODO [Step 3-2] EmpMapper 작성 (Mapper Interface)
	public void insertEmp(EmpVO vo);

	public int updateEmp(EmpVO vo);

	public int deleteEmp(EmpVO vo);

	public EmpVO selectEmp(EmpVO vo);

	public List<EmpVO> selectEmpList(EmpVO searchVO);

}
