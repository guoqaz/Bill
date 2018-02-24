package ssm.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ssm.entity.BillType;
import ssm.entity.Bills;
import ssm.services.BillService;

@Controller
public class BillController {

	@Resource
	private BillService bservice;
	
	@RequestMapping("/")
	public String one(){		
		return "redirect:selectAll";
	}
	
	
	@RequestMapping(value="selectAll",method=RequestMethod.GET)
	public String selectall(Integer typeId,Date startTime,Date endTime,HttpSession session){									  
		List<Bills> bills=bservice.selectBill(typeId,startTime,endTime);
		List<BillType> btype=bservice.selectType();
		session.setAttribute("bills", bills);
		session.setAttribute("btype", btype);
		return "index";
	}
	
	@RequestMapping(value="selectBooks",method=RequestMethod.POST)
	public String selectInfo(Integer typeId,String sTime,String eTime,HttpSession session){
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Date starTime=null;
		Date endTime=null;
		try {
			if(sTime!=null&&sTime!=""){
				starTime=sdf.parse(sTime);
			}
			if(eTime!=null&&eTime!=""){
				endTime=sdf.parse(eTime);
			}			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}									  
		List<Bills> bills=bservice.selectBill(typeId,starTime,endTime);
		List<BillType> btype=bservice.selectType();
		session.setAttribute("bills", bills);
		session.setAttribute("btype", btype);
		return "index";
	}
	
}
