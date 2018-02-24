package ssm.services;


import java.util.Date;
import java.util.List;

import ssm.entity.BillType;
import ssm.entity.Bills;

public interface BillService {
	
	//用来查询账单的方法
	public List<Bills> selectBill(Integer typeId,Date startTime,Date endTime);
	
	//用来查询类别的方法
	public List<BillType> selectType();
}
