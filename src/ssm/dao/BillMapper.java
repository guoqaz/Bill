package ssm.dao;


import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import ssm.entity.BillType;
import ssm.entity.Bills;

public interface BillMapper {
	
	//用来查询账单的方法
	public List<Bills> selectBill(@Param("typeId") Integer typeId,
								  @Param("startTime") Date startTime,
								  @Param("endTime") Date endTime);
	
	//用来查询类别的方法
	public List<BillType> selectType();
}
