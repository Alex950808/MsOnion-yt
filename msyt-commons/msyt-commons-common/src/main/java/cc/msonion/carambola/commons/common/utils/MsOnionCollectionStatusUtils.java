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

package cc.msonion.carambola.commons.common.utils;

/**
 * @Title: MsOnionCollectionStatusUtils.java
 * @Package: cc.msonion.carambola.commons.common.utils
 * @Description: 采集状态常量
 * @Company: 广州市两棵树网络科技有限公司
 * @Author: JohnnyWoo 3028554324@qq.com
 * @Date: 2017/3/31 16:01
 * @Version: V2.0.0
 * @Modify-by: JohnnyWoo 3028554324@qq.com
 * @Modify-date: 2017/3/31 16:01
 * @Modify-version: V2.0.0
 * @Modify-description: 定义采集状态
 */

import cc.msonion.carambola.parent.common.exception.MsOnionException;
import cc.msonion.carambola.parent.common.utils.MsOnionJsonUtils;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName: MsOnionCollectionStatusUtils
 * @Description: 采集状态，1：未采集，2：采集完成，3：编辑完成，4：文案通过
 * @Company: 广州市两棵树网络科技有限公司
 * @Author: JohnnyWoo 3028554324@qq.com
 * @Date: 2017/3/31 16:01
 */
public final class MsOnionCollectionStatusUtils {

    private MsOnionCollectionStatusUtils() {
    }

    /**
     * 定义Map
     */
    private static Map<Short, String> map = new LinkedHashMap<>();

    /**
     * 未采集
     */
    public static final Short COLLECTION_NOT = 1;

    /**
     * 采集完成
     */
    public static final Short COLLECTION_COMPLETED = 2;

    /**
     * 编辑完成
     */
    public static final Short COLLECTION_EDITED = 3;

    /**
     * 文案通过
     */
    public static final Short COLLECTION_PASSED = 4;

    static {
        map = new LinkedHashMap<>();
        map.put(COLLECTION_NOT, "未采集");
        map.put(COLLECTION_COMPLETED, "采集完成");
        map.put(COLLECTION_EDITED, "编辑完成");
        map.put(COLLECTION_PASSED, "文案通过");
    }

    /**
     * 得到描述
     *
     * @param id 传入id
     * @return String
     */
    public static String getDescription(Short id) {
        return map.get(id);
    }

    /**
     * toJson
     *
     * @return String
     * @throws MsOnionException MsOnion异常类
     */
    public static String toJson() throws MsOnionException {
        try {
            return MsOnionJsonUtils.objectToJson(map);
        } catch (MsOnionException e) {
            throw new MsOnionException(e);
        }
    }

    /**
     * 得到Map
     *
     * @return Map
     */
    public static Map getMap() {
        return map;
    }

    /**
     * 得到Map
     *
     * @param ids 传入ids
     * @return Map
     */
    public static Map getMap(Short... ids) {
        Map<Short, String> newMap = new LinkedHashMap<>(map);
        List<Short> keys = Arrays.asList(ids);
        newMap.keySet().retainAll(keys);

        return newMap;
    }

    /**
     * toJson
     *
     * @param ids 传入ids
     * @return String
     * @throws MsOnionException MsOnion异常类
     */
    public static String toJson(Short... ids) throws MsOnionException {
        Map<Short, String> newMap = getMap(ids);

        try {
            return MsOnionJsonUtils.objectToJson(newMap);
        } catch (MsOnionException e) {
            throw new MsOnionException(e);
        }
    }
}
