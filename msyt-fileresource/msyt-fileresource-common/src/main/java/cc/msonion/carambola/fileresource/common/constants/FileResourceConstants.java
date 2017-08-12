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


package cc.msonion.carambola.fileresource.common.constants;

/**
 * @Title: FileResourceConstants.java
 * @Package: cc.msonion.carambola.fileresource.common.constants
 * @Description: 文件资源中心常量
 * @Company: 广州市两棵树网络科技有限公司
 * @Author: liaoxf
 * @Date: 2017年05月04日
 * @Version: V2.0.0
 * @Modify-by: liaoxf
 * @Modify-date: 2017年05月04日
 * @Modify-version: V2.0.0
 * @Modify-description:
 *
 */

/**
 * @ClassName: FileResourceConstants
 * @Description: 文件资源中心常量
 * @Company: 广州市两棵树网络科技有限公司
 * @Author: liaoxf
 * @Date: 2017年05月04日
 *
 */
public final class FileResourceConstants {

    private  FileResourceConstants() {

    }

    /**
     * netty配置文件名称
     */
    public static final String NETTY_PROPERTIES_NAME = "/properties/config-netty.properties";

    /**
     * 文件资源中心API 版本号
     */
    public static final String API_VERSION = "V2.0.0";


    /**
     * 1小时 秒单位
     */
    public static final int ONE_HOUR = 3600;

    /**
     *  默认流缓冲大小
     */
    public static final int DEFAULT_BUFFER_SIZE = 4096;


    /**
     * 文件 图片类型
     */
    public static final Short FILE_PIC = 1;

    /**
     * 文件 资源类型
     */
    public static final Short FILE_RESOURCE = 2;

    /**
     * 上传、下载成功
     */
    public static final Short UPLOAD_SUC = 1;

    /**
     * 上传、下载失败
     */
    public static final Short UPLOAD_FAIL = 0;

    /**
     * 上传、下载中
     */
    public static final Short UPLOAD_ING = 2;


    /**
     * 目标对象不能为空
     */
    public static final String POJO_NOT_NULL = "目标对象不能为空";

    /**
     * 目标对象参数不能为空
     */
    public static final String POJO_PARAM_NOT_NULL = "目标对象参数不能为空";

    /**
     * 操作失败
     */
    public static final String FAIL = "操作失败";

    /**
     * 非法的文件格式
     */
    public static final String INVALID_FILE_FORMAT = "### 非法的文件格式";


    /**
     * 非法的文件格式
     */
    public static final String INVALID_FILE_TEMPLATE = "同一应用平台，同一模板类别下已经存在模板";








}
