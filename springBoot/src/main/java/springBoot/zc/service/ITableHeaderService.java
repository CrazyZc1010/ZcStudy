package springBoot.zc.service;

import java.util.List;

import org.springframework.stereotype.Component;

import springBoot.zc.entity.Form;

public interface ITableHeaderService {
	
	Integer select(String processDefName);
	Integer select2(String processDefName);

}
