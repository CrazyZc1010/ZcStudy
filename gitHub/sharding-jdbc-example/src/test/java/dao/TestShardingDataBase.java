package dao;

import com.zc.study.RunBoot;
import com.zc.study.entity.BOrder;
import com.zc.study.entity.Position;
import com.zc.study.entity.PositionDetail;
import com.zc.study.reposity.BOrderRespository;
import com.zc.study.reposity.PositionDetailRepository;
import com.zc.study.reposity.PositionRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Repeat;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Date;
import java.util.Random;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RunBoot.class)
public class TestShardingDataBase {

    @Resource
    private PositionRepository positionRepository;

    @Resource
    private PositionDetailRepository positionDetailRepository;

    @Resource
    private BOrderRespository bOrderRespository;

    @Test
    public void testAdd(){
        for (int i = 0; i <= 20; i++){
            Position position = new Position();
//            position.setId(i);
            position.setCity("beijing");
            position.setSalsay("1100000");
            position.setName("zc"+i);
            positionRepository.save(position);
        }
    }

    @Test
    public void testAdd2(){
        for (int i = 0; i <= 20; i++){
            Position position = new Position();
//            position.setId(i);
            position.setCity("beijing");
            position.setSalsay("1100000");
            position.setName("zc"+i);
            positionRepository.save(position);

            PositionDetail detail = new PositionDetail();
            detail.setPid(position.getId());
            detail.setDescription("this id message"+i);
            positionDetailRepository.save(detail);
        }
    }

    @Test
    public void testload(){
      Object ob = positionRepository.findPositionById(508314647309320193L);
      Object[] objects = (Object[])ob;
      System.out.println(objects[0]+" "+objects[1]+" "+objects[2]+" "+objects[3]);
    }


    @Test
    @Repeat(100)
    public void testBOrder(){
        Random random = new Random();
        int companyID =random.nextInt(10);
        BOrder bOrder = new BOrder();
        bOrder.setDEL(false);
        bOrder.setCompanyId(companyID);
        bOrder.setCreateTime(new Date());
        bOrder.setPositionId(646453);
        bOrder.setUserId(222222);
        bOrder.setPublishUserId(111111);
        bOrder.setResumeType(1);
        bOrder.setStatus("AUTO");
        bOrder.setOperateTime(new Date());
        bOrder.setWorkYear("4");
        bOrder.setName("zczczczc");
        bOrder.setPositionName("java");
        bOrder.setResumeId(112233);
        bOrderRespository.save(bOrder);
    }
}
