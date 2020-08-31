package springBoot.zc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springBoot.zc.entity.Form;
import springBoot.zc.mapper.mapper1.FormMapper;
import springBoot.zc.mapper.mapper2.SecondaryDaoMapper;
import springBoot.zc.service.ITableHeaderService;

@Service
public class TableHeaderServiceImpl implements ITableHeaderService {
	
	@Autowired
	SecondaryDaoMapper secondaryDao;
	
	@Autowired
	FormMapper formMapper;

	@Override
	public Integer select(String processDefName) {
		Integer result= 0;
		try {
			result = formMapper.selectForm();
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	@Override
	public Integer select2(String processDefName) {
		Integer result= 0;
		try {
			result = secondaryDao.selectForm();
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	


}
