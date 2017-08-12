package test.msonion.carambola.search.service.impl.collector;

import cc.msonion.carambola.collector.pojo.CollectorItem;
import cc.msonion.carambola.parent.ext.elasticsearch.service.MsOnionElasticsearchService;
import org.springframework.stereotype.Repository;
import test.msonion.carambola.pojo.TestCollectorItem;
import test.msonion.carambola.search.service.collector.TestCollectorItemSearchService;

/**
 * Created by HeroCao on 2017/6/10.
 *
 * 搜索中心的所有 Service，命名规则： xxxSearchService ， 必须包括 SearchService ！！！
 *
 */
@Repository
public class TestCollectorItemSearchServiceImpl extends MsOnionElasticsearchService<TestCollectorItem> implements TestCollectorItemSearchService {


}
