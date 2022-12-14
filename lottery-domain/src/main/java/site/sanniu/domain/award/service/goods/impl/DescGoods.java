package site.sanniu.domain.award.service.goods.impl;

import org.springframework.stereotype.Component;
import site.sanniu.common.Constants;
import site.sanniu.domain.award.model.req.GoodsReq;
import site.sanniu.domain.award.model.res.DistributionRes;
import site.sanniu.domain.award.service.goods.DistributionBase;
import site.sanniu.domain.award.service.goods.IDistributionGoods;

/**
 * @Author sanniu
 * @Description 描述类商品，以文字形式展示给用户
 * @Date $ $
 **/
@Component
public class DescGoods extends DistributionBase implements IDistributionGoods {

    @Override
    public DistributionRes doDistribution(GoodsReq req) {

        super.updateUserAwardState(req.getuId(), req.getOrderId(), req.getAwardId(), Constants.GrantState.COMPLETE.getCode());

        return new DistributionRes(req.getuId(), Constants.AwardState.SUCCESS.getCode(), Constants.AwardState.SUCCESS.getInfo());
    }

}


