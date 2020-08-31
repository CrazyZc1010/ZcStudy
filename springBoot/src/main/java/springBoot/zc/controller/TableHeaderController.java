package springBoot.zc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import springBoot.zc.entity.JsonBean;
import springBoot.zc.service.ITableHeaderService;

@RequestMapping(value = "/form/api")
@RestController
public class TableHeaderController {
	
	@Autowired
    ITableHeaderService tableHeaderService;
 
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public JsonBean getTableHeaderFields(String category){
    	JsonBean jsonBean = new JsonBean();
        try {
        	Integer list = tableHeaderService.select(category);
        	jsonBean.setData(list);
        } catch (Exception e) {
            e.printStackTrace();
        }
 
        return jsonBean;
    }
    
    @RequestMapping(value = "/test2", method = RequestMethod.GET)
    public JsonBean getTableHeaderFields2(String category){
    	JsonBean jsonBean = new JsonBean();
        try {
        	Integer list = tableHeaderService.select2(category);
        	jsonBean.setData(list);
        } catch (Exception e) {
            e.printStackTrace();
        }
 
        return jsonBean;
    }
 

}
