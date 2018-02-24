package ssm.serviceImpl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import ssm.dao.BillMapper;
import ssm.entity.BillType;
import ssm.entity.Bills;
import ssm.services.BillService;

@Service
public class BillServiceImpl implements BillService {

	@Resource
	private BillMapper bill;
	
	@Override
	public List<Bills> selectBill(Integer typeId,Date startTime,Date endTime) {
		// TODO Auto-generated method stub
		if(typeId==null){
			typeId=0;
		}
		return bill.selectBill(typeId,startTime, endTime);
	}

	@Override
	public List<BillType> selectType() {
		// TODO Auto-generated method stub
		return bill.selectType();
	}

}
