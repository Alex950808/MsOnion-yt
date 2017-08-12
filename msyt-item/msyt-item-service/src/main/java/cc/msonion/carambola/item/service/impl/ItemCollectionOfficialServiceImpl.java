/**
 * 广州市两棵树网络科技有限公司版权所有
 * DT Group Technology & commerce Co., LtdAll rights reserved.
 * <p>
 * 广州市两棵树网络科技有限公司，创立于2009年。旗下运营品牌洋葱小姐。
 * 洋葱小姐（Ms.Onion） 下属三大业务模块 [洋葱海外仓] , [洋葱DSP] , [洋葱海外聚合供应链]
 * [洋葱海外仓]（DFS）系中国海关批准的跨境电商自营平台(Cross-border ecommerce platform)，
 * 合法持有海外直邮保税模式的跨境电商营运资格。是渠道拓展，平台营运，渠道营运管理，及客户服务等前端业务模块。
 * [洋葱DSP]（DSP）系拥有1.3亿消费者大数据分析模型。 是基于客户的消费行为，消费轨迹，及多维度云算法(MDPP)
 * 沉淀而成的精准消费者模型。洋葱DSP能同时为超过36种各行业店铺 及200万个销售端口
 * 进行多店铺高精度配货，并能预判消费者购物需求进行精准推送。同时为洋葱供应链提供更前瞻的商品采买需求模型 。
 * [洋葱海外聚合供应链]（Super Supply Chain）由中国最大的进口贸易集团共同
 * 合资成立，拥有20余年的海外供应链营运经验。并已入股多家海外贸易企业，与欧美澳等9家顶级全球供应商达成战略合作伙伴关系。
 * 目前拥有835个国际品牌直接采买权，12万个单品的商品供应库。并已建设6大海外直邮仓库，为国内客户提供海外商品采买集货供应，
 * 跨境 物流，保税清关三合一的一体化模型。目前是中国唯一多模式聚合的海外商品供应链 。
 * <p>
 * 洋葱商城：http://m.msyc.cc/wx/indexView?tmn=1
 * <p>
 * 洋桃商城：http://www.yunyangtao.com
 */
package cc.msonion.carambola.item.service.impl;

/**
 * @Title: ItemCollectionOfficialServiceImpl.java
 * @Package: cc.msonion.carambola.item.service.impl
 * @Description: 商品模块商品采集服务实现类
 * @Company: 广州市两棵树网络科技有限公司
 * @Author: JohnnyWoo johnny-woo@msyc.cc
 * @Date: 2017年6月22日 上午11:10:21
 * @Version: V2.0.0
 * @Modify-by: JohnnyWoo johnny-woo@msyc.cc
 * @Modify-date: 2017年6月22日 上午11:10:21
 * @Modify-version: V2.0.0
 * @Modify-description: 新增：增，删，改，查方法
 */

import cc.msonion.carambola.parent.ext.constants.MsOnionZookeeperConstants;
import cc.msonion.carambola.commons.common.enums.MsOnionTableRecordStatus;
import cc.msonion.carambola.parent.ext.utils.zookeeper.MsOnionDistributedAtomicLongUtils;
import cc.msonion.carambola.item.pojo.ItemCollectionOfficial;
import cc.msonion.carambola.item.pojo.ItemCollectionOfficialExample;
import cc.msonion.carambola.item.service.ItemCollectionOfficialService;
import cc.msonion.carambola.parent.common.constants.MsOnionMessageConstants;
import cc.msonion.carambola.parent.common.constants.MsOnionStatusConstants;
import cc.msonion.carambola.parent.common.exception.MsOnionException;
import cc.msonion.carambola.parent.common.exception.MsOnionIllegalArgumentException;
import cc.msonion.carambola.parent.ext.service.MsOnionServiceExt;
import cc.msonion.carambola.parent.pojo.MsOnionApiVersion;
import cc.msonion.carambola.parent.pojo.MsOnionResult;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @ClassName: ItemCollectionOfficialServiceImpl
 * @Description: 商品模块商品采集服务实现类
 * @Company: 广州市两棵树网络科技有限公司
 * @Author: JohnnyWoo johnny-woo@msyc.cc
 * @Date: 2017年6月22日 上午11:10:21
 */
@Service
public class ItemCollectionOfficialServiceImpl extends MsOnionServiceExt<ItemCollectionOfficial, ItemCollectionOfficialExample>
        implements ItemCollectionOfficialService {

    /**
     * 新增商品采集信息
     *
     * @param apiVersion         Api版本
     * @param itemCollectionOfficial 商品采集信息
     * @return 返回新增结果
     * @throws MsOnionIllegalArgumentException 非法参数异常
     * @throws MsOnionException                自定义异常
     * @Author JohnnyWoo johnny-woo@msyc.cc
     * @Date 2017年6月22日 上午11:10:21
     */
    @Override
    public MsOnionResult addItemItemCollection(MsOnionApiVersion apiVersion, ItemCollectionOfficial itemCollectionOfficial)
            throws MsOnionIllegalArgumentException, MsOnionException {
        Long idx = MsOnionDistributedAtomicLongUtils.getIdx(this.getMsOnionDomain(), this.getMsOnionCuratorZookeeperClient(),
                this.getRetryPolicy(), MsOnionZookeeperConstants.ZK_COUNTER_ITEM_ITEM_COLLECTION_IDX_PATH);
        itemCollectionOfficial.setIdx(idx);

        // 新增时默认有效
        itemCollectionOfficial.setStatus(MsOnionTableRecordStatus.NORMAL.getValue());

        // 版本号 , 不使用 idx 避免理解歧义
        Long version = MsOnionDistributedAtomicLongUtils.getVersion(this.getMsOnionDomain(), this.getMsOnionCuratorZookeeperClient(),
                this.getRetryPolicy(), MsOnionZookeeperConstants.ZK_COUNTER_ITEM_ITEM_COLLECTION_VERSION_PATH);
        itemCollectionOfficial.setVersion(version);

        this.getMsOnionLogger().info(this.getClass().getName(), "准备新增，itemCollectionOfficial=" + itemCollectionOfficial);

        int result = this.save(apiVersion, itemCollectionOfficial);
        if (result > 0) {
            return MsOnionResult.ok(itemCollectionOfficial);
        }

        this.getMsOnionLogger().info(this.getClass().getName(), "新增结果，result=" + result);
        return MsOnionResult.build(MsOnionStatusConstants.STATUS_400, MsOnionMessageConstants.MESSAGE_SAVE_FAILURE);
    }

    /**
     * 修改商品采集信息
     *
     * @param apiVersion         Api版本
     * @param itemCollectionOfficial 商品采集信息
     * @return 返回修改结果
     * @throws MsOnionIllegalArgumentException 非法参数异常
     * @throws MsOnionException                自定义异常
     * @Author JohnnyWoo johnny-woo@msyc.cc
     * @Date 2017年6月22日 上午11:10:21
     */
    @Override
    public MsOnionResult updateItemItemCollection(MsOnionApiVersion apiVersion, ItemCollectionOfficial itemCollectionOfficial)
            throws MsOnionIllegalArgumentException, MsOnionException {
        Long idx = itemCollectionOfficial.getIdx();

        ItemCollectionOfficial oldData = this.queryByPrimaryKey(apiVersion, idx);
        oldData.setSellingPoint(itemCollectionOfficial.getSellingPoint());
        oldData.setSlogan(itemCollectionOfficial.getSlogan());
        oldData.setShoppingGuide(itemCollectionOfficial.getShoppingGuide());
        oldData.setEditorIdx(itemCollectionOfficial.getEditorIdx());
        oldData.setSearchKeywords(itemCollectionOfficial.getSearchKeywords());
        oldData.setVideoLink(itemCollectionOfficial.getVideoLink());
        oldData.setEditType(itemCollectionOfficial.getEditType());
        oldData.setUpdateTime(new Date());
        oldData.setUpdateByMemberIdx(itemCollectionOfficial.getUpdateByMemberIdx());

        int result = this.updateByPrimaryKey(apiVersion, oldData);
        if (result > 0) {
            return MsOnionResult.build(MsOnionStatusConstants.STATUS_200,
                    MsOnionMessageConstants.MESSAGE_UPDATE_SUCCESS, oldData);
        }

        return MsOnionResult.build(MsOnionStatusConstants.STATUS_400, MsOnionMessageConstants.MESSAGE_UPDATE_FAILURE);
    }

    /**
     * 获取商品采集信息
     *
     * @param apiVersion Api版本
     * @param sourceIdx  源主键idx
     * @return 返回商品采集信息
     * @throws MsOnionIllegalArgumentException 非法参数异常
     * @throws MsOnionException                自定义异常
     */
    @Override
    public ItemCollectionOfficial queryOneBySourceIdx(MsOnionApiVersion apiVersion, Long sourceIdx)
            throws MsOnionIllegalArgumentException, MsOnionException {
        ItemCollectionOfficialExample example = new ItemCollectionOfficialExample();
        ItemCollectionOfficialExample.Criteria criteria = example.createCriteria();
        criteria.andItemOfficialIdxEqualTo(sourceIdx);
        criteria.andStatusEqualTo(MsOnionTableRecordStatus.NORMAL.getValue());

        return this.queryOne(apiVersion, example);
    }
}
