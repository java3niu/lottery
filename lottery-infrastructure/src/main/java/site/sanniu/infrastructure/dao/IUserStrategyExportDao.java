package site.sanniu.infrastructure.dao;

import cn.bugstack.middleware.db.router.annotation.DBRouter;
import cn.bugstack.middleware.db.router.annotation.DBRouterStrategy;
import org.apache.ibatis.annotations.Mapper;
import site.sanniu.infrastructure.po.UserStrategyExport;

/**
 * 用户策略计算结果表DAO
 * @author 12966
 */
@Mapper
@DBRouterStrategy(splitTable = true)
public interface IUserStrategyExportDao {

    /**
     * 新增数据
     * @param userStrategyExport 用户策略
     */
    @DBRouter(key = "uId")
    void insert(UserStrategyExport userStrategyExport);

    /**
     * 查询数据
     * @param uId 用户ID
     * @return 用户策略
     */
    @DBRouter
    UserStrategyExport queryUserStrategyExportByUId(String uId);

    /**
     * 更新发奖状态
     * @param userStrategyExport 发奖信息
     */
    @DBRouter
    void updateUserAwardState(UserStrategyExport userStrategyExport);

    /**
     * 更新发送MQ状态
     * @param userStrategyExport 发送消息
     */
    @DBRouter
    void updateInvoiceMqState(UserStrategyExport userStrategyExport);
}

