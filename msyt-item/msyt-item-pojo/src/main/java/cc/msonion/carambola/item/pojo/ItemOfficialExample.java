package cc.msonion.carambola.item.pojo;

import cc.msonion.carambola.parent.interfaces.pojo.base.MsOnionBaseExampleAdapter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ItemOfficialExample implements MsOnionBaseExampleAdapter {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public ItemOfficialExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria implements Serializable {
        protected List<Criterion> criteria;

        private static final long serialVersionUID = 1L;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdxIsNull() {
            addCriterion("idx is null");
            return (Criteria) this;
        }

        public Criteria andIdxIsNotNull() {
            addCriterion("idx is not null");
            return (Criteria) this;
        }

        public Criteria andIdxEqualTo(Long value) {
            addCriterion("idx =", value, "idx");
            return (Criteria) this;
        }

        public Criteria andIdxNotEqualTo(Long value) {
            addCriterion("idx <>", value, "idx");
            return (Criteria) this;
        }

        public Criteria andIdxGreaterThan(Long value) {
            addCriterion("idx >", value, "idx");
            return (Criteria) this;
        }

        public Criteria andIdxGreaterThanOrEqualTo(Long value) {
            addCriterion("idx >=", value, "idx");
            return (Criteria) this;
        }

        public Criteria andIdxLessThan(Long value) {
            addCriterion("idx <", value, "idx");
            return (Criteria) this;
        }

        public Criteria andIdxLessThanOrEqualTo(Long value) {
            addCriterion("idx <=", value, "idx");
            return (Criteria) this;
        }

        public Criteria andIdxIn(List<Long> values) {
            addCriterion("idx in", values, "idx");
            return (Criteria) this;
        }

        public Criteria andIdxNotIn(List<Long> values) {
            addCriterion("idx not in", values, "idx");
            return (Criteria) this;
        }

        public Criteria andIdxBetween(Long value1, Long value2) {
            addCriterion("idx between", value1, value2, "idx");
            return (Criteria) this;
        }

        public Criteria andIdxNotBetween(Long value1, Long value2) {
            addCriterion("idx not between", value1, value2, "idx");
            return (Criteria) this;
        }

        public Criteria andIdxCodeIsNull() {
            addCriterion("idx_code is null");
            return (Criteria) this;
        }

        public Criteria andIdxCodeIsNotNull() {
            addCriterion("idx_code is not null");
            return (Criteria) this;
        }

        public Criteria andIdxCodeEqualTo(Long value) {
            addCriterion("idx_code =", value, "idxCode");
            return (Criteria) this;
        }

        public Criteria andIdxCodeNotEqualTo(Long value) {
            addCriterion("idx_code <>", value, "idxCode");
            return (Criteria) this;
        }

        public Criteria andIdxCodeGreaterThan(Long value) {
            addCriterion("idx_code >", value, "idxCode");
            return (Criteria) this;
        }

        public Criteria andIdxCodeGreaterThanOrEqualTo(Long value) {
            addCriterion("idx_code >=", value, "idxCode");
            return (Criteria) this;
        }

        public Criteria andIdxCodeLessThan(Long value) {
            addCriterion("idx_code <", value, "idxCode");
            return (Criteria) this;
        }

        public Criteria andIdxCodeLessThanOrEqualTo(Long value) {
            addCriterion("idx_code <=", value, "idxCode");
            return (Criteria) this;
        }

        public Criteria andIdxCodeIn(List<Long> values) {
            addCriterion("idx_code in", values, "idxCode");
            return (Criteria) this;
        }

        public Criteria andIdxCodeNotIn(List<Long> values) {
            addCriterion("idx_code not in", values, "idxCode");
            return (Criteria) this;
        }

        public Criteria andIdxCodeBetween(Long value1, Long value2) {
            addCriterion("idx_code between", value1, value2, "idxCode");
            return (Criteria) this;
        }

        public Criteria andIdxCodeNotBetween(Long value1, Long value2) {
            addCriterion("idx_code not between", value1, value2, "idxCode");
            return (Criteria) this;
        }

        public Criteria andItemIdxIsNull() {
            addCriterion("item_idx is null");
            return (Criteria) this;
        }

        public Criteria andItemIdxIsNotNull() {
            addCriterion("item_idx is not null");
            return (Criteria) this;
        }

        public Criteria andItemIdxEqualTo(Long value) {
            addCriterion("item_idx =", value, "itemIdx");
            return (Criteria) this;
        }

        public Criteria andItemIdxNotEqualTo(Long value) {
            addCriterion("item_idx <>", value, "itemIdx");
            return (Criteria) this;
        }

        public Criteria andItemIdxGreaterThan(Long value) {
            addCriterion("item_idx >", value, "itemIdx");
            return (Criteria) this;
        }

        public Criteria andItemIdxGreaterThanOrEqualTo(Long value) {
            addCriterion("item_idx >=", value, "itemIdx");
            return (Criteria) this;
        }

        public Criteria andItemIdxLessThan(Long value) {
            addCriterion("item_idx <", value, "itemIdx");
            return (Criteria) this;
        }

        public Criteria andItemIdxLessThanOrEqualTo(Long value) {
            addCriterion("item_idx <=", value, "itemIdx");
            return (Criteria) this;
        }

        public Criteria andItemIdxIn(List<Long> values) {
            addCriterion("item_idx in", values, "itemIdx");
            return (Criteria) this;
        }

        public Criteria andItemIdxNotIn(List<Long> values) {
            addCriterion("item_idx not in", values, "itemIdx");
            return (Criteria) this;
        }

        public Criteria andItemIdxBetween(Long value1, Long value2) {
            addCriterion("item_idx between", value1, value2, "itemIdx");
            return (Criteria) this;
        }

        public Criteria andItemIdxNotBetween(Long value1, Long value2) {
            addCriterion("item_idx not between", value1, value2, "itemIdx");
            return (Criteria) this;
        }

        public Criteria andPlatformIdxIsNull() {
            addCriterion("platform_idx is null");
            return (Criteria) this;
        }

        public Criteria andPlatformIdxIsNotNull() {
            addCriterion("platform_idx is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformIdxEqualTo(Long value) {
            addCriterion("platform_idx =", value, "platformIdx");
            return (Criteria) this;
        }

        public Criteria andPlatformIdxNotEqualTo(Long value) {
            addCriterion("platform_idx <>", value, "platformIdx");
            return (Criteria) this;
        }

        public Criteria andPlatformIdxGreaterThan(Long value) {
            addCriterion("platform_idx >", value, "platformIdx");
            return (Criteria) this;
        }

        public Criteria andPlatformIdxGreaterThanOrEqualTo(Long value) {
            addCriterion("platform_idx >=", value, "platformIdx");
            return (Criteria) this;
        }

        public Criteria andPlatformIdxLessThan(Long value) {
            addCriterion("platform_idx <", value, "platformIdx");
            return (Criteria) this;
        }

        public Criteria andPlatformIdxLessThanOrEqualTo(Long value) {
            addCriterion("platform_idx <=", value, "platformIdx");
            return (Criteria) this;
        }

        public Criteria andPlatformIdxIn(List<Long> values) {
            addCriterion("platform_idx in", values, "platformIdx");
            return (Criteria) this;
        }

        public Criteria andPlatformIdxNotIn(List<Long> values) {
            addCriterion("platform_idx not in", values, "platformIdx");
            return (Criteria) this;
        }

        public Criteria andPlatformIdxBetween(Long value1, Long value2) {
            addCriterion("platform_idx between", value1, value2, "platformIdx");
            return (Criteria) this;
        }

        public Criteria andPlatformIdxNotBetween(Long value1, Long value2) {
            addCriterion("platform_idx not between", value1, value2, "platformIdx");
            return (Criteria) this;
        }

        public Criteria andFirstOnlineByMemberIdxIsNull() {
            addCriterion("first_online_by_member_idx is null");
            return (Criteria) this;
        }

        public Criteria andFirstOnlineByMemberIdxIsNotNull() {
            addCriterion("first_online_by_member_idx is not null");
            return (Criteria) this;
        }

        public Criteria andFirstOnlineByMemberIdxEqualTo(Long value) {
            addCriterion("first_online_by_member_idx =", value, "firstOnlineByMemberIdx");
            return (Criteria) this;
        }

        public Criteria andFirstOnlineByMemberIdxNotEqualTo(Long value) {
            addCriterion("first_online_by_member_idx <>", value, "firstOnlineByMemberIdx");
            return (Criteria) this;
        }

        public Criteria andFirstOnlineByMemberIdxGreaterThan(Long value) {
            addCriterion("first_online_by_member_idx >", value, "firstOnlineByMemberIdx");
            return (Criteria) this;
        }

        public Criteria andFirstOnlineByMemberIdxGreaterThanOrEqualTo(Long value) {
            addCriterion("first_online_by_member_idx >=", value, "firstOnlineByMemberIdx");
            return (Criteria) this;
        }

        public Criteria andFirstOnlineByMemberIdxLessThan(Long value) {
            addCriterion("first_online_by_member_idx <", value, "firstOnlineByMemberIdx");
            return (Criteria) this;
        }

        public Criteria andFirstOnlineByMemberIdxLessThanOrEqualTo(Long value) {
            addCriterion("first_online_by_member_idx <=", value, "firstOnlineByMemberIdx");
            return (Criteria) this;
        }

        public Criteria andFirstOnlineByMemberIdxIn(List<Long> values) {
            addCriterion("first_online_by_member_idx in", values, "firstOnlineByMemberIdx");
            return (Criteria) this;
        }

        public Criteria andFirstOnlineByMemberIdxNotIn(List<Long> values) {
            addCriterion("first_online_by_member_idx not in", values, "firstOnlineByMemberIdx");
            return (Criteria) this;
        }

        public Criteria andFirstOnlineByMemberIdxBetween(Long value1, Long value2) {
            addCriterion("first_online_by_member_idx between", value1, value2, "firstOnlineByMemberIdx");
            return (Criteria) this;
        }

        public Criteria andFirstOnlineByMemberIdxNotBetween(Long value1, Long value2) {
            addCriterion("first_online_by_member_idx not between", value1, value2, "firstOnlineByMemberIdx");
            return (Criteria) this;
        }

        public Criteria andFirstOnlineTimeIsNull() {
            addCriterion("first_online_time is null");
            return (Criteria) this;
        }

        public Criteria andFirstOnlineTimeIsNotNull() {
            addCriterion("first_online_time is not null");
            return (Criteria) this;
        }

        public Criteria andFirstOnlineTimeEqualTo(Date value) {
            addCriterion("first_online_time =", value, "firstOnlineTime");
            return (Criteria) this;
        }

        public Criteria andFirstOnlineTimeNotEqualTo(Date value) {
            addCriterion("first_online_time <>", value, "firstOnlineTime");
            return (Criteria) this;
        }

        public Criteria andFirstOnlineTimeGreaterThan(Date value) {
            addCriterion("first_online_time >", value, "firstOnlineTime");
            return (Criteria) this;
        }

        public Criteria andFirstOnlineTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("first_online_time >=", value, "firstOnlineTime");
            return (Criteria) this;
        }

        public Criteria andFirstOnlineTimeLessThan(Date value) {
            addCriterion("first_online_time <", value, "firstOnlineTime");
            return (Criteria) this;
        }

        public Criteria andFirstOnlineTimeLessThanOrEqualTo(Date value) {
            addCriterion("first_online_time <=", value, "firstOnlineTime");
            return (Criteria) this;
        }

        public Criteria andFirstOnlineTimeIn(List<Date> values) {
            addCriterion("first_online_time in", values, "firstOnlineTime");
            return (Criteria) this;
        }

        public Criteria andFirstOnlineTimeNotIn(List<Date> values) {
            addCriterion("first_online_time not in", values, "firstOnlineTime");
            return (Criteria) this;
        }

        public Criteria andFirstOnlineTimeBetween(Date value1, Date value2) {
            addCriterion("first_online_time between", value1, value2, "firstOnlineTime");
            return (Criteria) this;
        }

        public Criteria andFirstOnlineTimeNotBetween(Date value1, Date value2) {
            addCriterion("first_online_time not between", value1, value2, "firstOnlineTime");
            return (Criteria) this;
        }

        public Criteria andOnlineByMemberIdxIsNull() {
            addCriterion("online_by_member_idx is null");
            return (Criteria) this;
        }

        public Criteria andOnlineByMemberIdxIsNotNull() {
            addCriterion("online_by_member_idx is not null");
            return (Criteria) this;
        }

        public Criteria andOnlineByMemberIdxEqualTo(Long value) {
            addCriterion("online_by_member_idx =", value, "onlineByMemberIdx");
            return (Criteria) this;
        }

        public Criteria andOnlineByMemberIdxNotEqualTo(Long value) {
            addCriterion("online_by_member_idx <>", value, "onlineByMemberIdx");
            return (Criteria) this;
        }

        public Criteria andOnlineByMemberIdxGreaterThan(Long value) {
            addCriterion("online_by_member_idx >", value, "onlineByMemberIdx");
            return (Criteria) this;
        }

        public Criteria andOnlineByMemberIdxGreaterThanOrEqualTo(Long value) {
            addCriterion("online_by_member_idx >=", value, "onlineByMemberIdx");
            return (Criteria) this;
        }

        public Criteria andOnlineByMemberIdxLessThan(Long value) {
            addCriterion("online_by_member_idx <", value, "onlineByMemberIdx");
            return (Criteria) this;
        }

        public Criteria andOnlineByMemberIdxLessThanOrEqualTo(Long value) {
            addCriterion("online_by_member_idx <=", value, "onlineByMemberIdx");
            return (Criteria) this;
        }

        public Criteria andOnlineByMemberIdxIn(List<Long> values) {
            addCriterion("online_by_member_idx in", values, "onlineByMemberIdx");
            return (Criteria) this;
        }

        public Criteria andOnlineByMemberIdxNotIn(List<Long> values) {
            addCriterion("online_by_member_idx not in", values, "onlineByMemberIdx");
            return (Criteria) this;
        }

        public Criteria andOnlineByMemberIdxBetween(Long value1, Long value2) {
            addCriterion("online_by_member_idx between", value1, value2, "onlineByMemberIdx");
            return (Criteria) this;
        }

        public Criteria andOnlineByMemberIdxNotBetween(Long value1, Long value2) {
            addCriterion("online_by_member_idx not between", value1, value2, "onlineByMemberIdx");
            return (Criteria) this;
        }

        public Criteria andOnlineTimeIsNull() {
            addCriterion("online_time is null");
            return (Criteria) this;
        }

        public Criteria andOnlineTimeIsNotNull() {
            addCriterion("online_time is not null");
            return (Criteria) this;
        }

        public Criteria andOnlineTimeEqualTo(Date value) {
            addCriterion("online_time =", value, "onlineTime");
            return (Criteria) this;
        }

        public Criteria andOnlineTimeNotEqualTo(Date value) {
            addCriterion("online_time <>", value, "onlineTime");
            return (Criteria) this;
        }

        public Criteria andOnlineTimeGreaterThan(Date value) {
            addCriterion("online_time >", value, "onlineTime");
            return (Criteria) this;
        }

        public Criteria andOnlineTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("online_time >=", value, "onlineTime");
            return (Criteria) this;
        }

        public Criteria andOnlineTimeLessThan(Date value) {
            addCriterion("online_time <", value, "onlineTime");
            return (Criteria) this;
        }

        public Criteria andOnlineTimeLessThanOrEqualTo(Date value) {
            addCriterion("online_time <=", value, "onlineTime");
            return (Criteria) this;
        }

        public Criteria andOnlineTimeIn(List<Date> values) {
            addCriterion("online_time in", values, "onlineTime");
            return (Criteria) this;
        }

        public Criteria andOnlineTimeNotIn(List<Date> values) {
            addCriterion("online_time not in", values, "onlineTime");
            return (Criteria) this;
        }

        public Criteria andOnlineTimeBetween(Date value1, Date value2) {
            addCriterion("online_time between", value1, value2, "onlineTime");
            return (Criteria) this;
        }

        public Criteria andOnlineTimeNotBetween(Date value1, Date value2) {
            addCriterion("online_time not between", value1, value2, "onlineTime");
            return (Criteria) this;
        }

        public Criteria andOfflineByMemberIdxIsNull() {
            addCriterion("offline_by_member_idx is null");
            return (Criteria) this;
        }

        public Criteria andOfflineByMemberIdxIsNotNull() {
            addCriterion("offline_by_member_idx is not null");
            return (Criteria) this;
        }

        public Criteria andOfflineByMemberIdxEqualTo(Long value) {
            addCriterion("offline_by_member_idx =", value, "offlineByMemberIdx");
            return (Criteria) this;
        }

        public Criteria andOfflineByMemberIdxNotEqualTo(Long value) {
            addCriterion("offline_by_member_idx <>", value, "offlineByMemberIdx");
            return (Criteria) this;
        }

        public Criteria andOfflineByMemberIdxGreaterThan(Long value) {
            addCriterion("offline_by_member_idx >", value, "offlineByMemberIdx");
            return (Criteria) this;
        }

        public Criteria andOfflineByMemberIdxGreaterThanOrEqualTo(Long value) {
            addCriterion("offline_by_member_idx >=", value, "offlineByMemberIdx");
            return (Criteria) this;
        }

        public Criteria andOfflineByMemberIdxLessThan(Long value) {
            addCriterion("offline_by_member_idx <", value, "offlineByMemberIdx");
            return (Criteria) this;
        }

        public Criteria andOfflineByMemberIdxLessThanOrEqualTo(Long value) {
            addCriterion("offline_by_member_idx <=", value, "offlineByMemberIdx");
            return (Criteria) this;
        }

        public Criteria andOfflineByMemberIdxIn(List<Long> values) {
            addCriterion("offline_by_member_idx in", values, "offlineByMemberIdx");
            return (Criteria) this;
        }

        public Criteria andOfflineByMemberIdxNotIn(List<Long> values) {
            addCriterion("offline_by_member_idx not in", values, "offlineByMemberIdx");
            return (Criteria) this;
        }

        public Criteria andOfflineByMemberIdxBetween(Long value1, Long value2) {
            addCriterion("offline_by_member_idx between", value1, value2, "offlineByMemberIdx");
            return (Criteria) this;
        }

        public Criteria andOfflineByMemberIdxNotBetween(Long value1, Long value2) {
            addCriterion("offline_by_member_idx not between", value1, value2, "offlineByMemberIdx");
            return (Criteria) this;
        }

        public Criteria andOfflineTimeIsNull() {
            addCriterion("offline_time is null");
            return (Criteria) this;
        }

        public Criteria andOfflineTimeIsNotNull() {
            addCriterion("offline_time is not null");
            return (Criteria) this;
        }

        public Criteria andOfflineTimeEqualTo(Date value) {
            addCriterion("offline_time =", value, "offlineTime");
            return (Criteria) this;
        }

        public Criteria andOfflineTimeNotEqualTo(Date value) {
            addCriterion("offline_time <>", value, "offlineTime");
            return (Criteria) this;
        }

        public Criteria andOfflineTimeGreaterThan(Date value) {
            addCriterion("offline_time >", value, "offlineTime");
            return (Criteria) this;
        }

        public Criteria andOfflineTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("offline_time >=", value, "offlineTime");
            return (Criteria) this;
        }

        public Criteria andOfflineTimeLessThan(Date value) {
            addCriterion("offline_time <", value, "offlineTime");
            return (Criteria) this;
        }

        public Criteria andOfflineTimeLessThanOrEqualTo(Date value) {
            addCriterion("offline_time <=", value, "offlineTime");
            return (Criteria) this;
        }

        public Criteria andOfflineTimeIn(List<Date> values) {
            addCriterion("offline_time in", values, "offlineTime");
            return (Criteria) this;
        }

        public Criteria andOfflineTimeNotIn(List<Date> values) {
            addCriterion("offline_time not in", values, "offlineTime");
            return (Criteria) this;
        }

        public Criteria andOfflineTimeBetween(Date value1, Date value2) {
            addCriterion("offline_time between", value1, value2, "offlineTime");
            return (Criteria) this;
        }

        public Criteria andOfflineTimeNotBetween(Date value1, Date value2) {
            addCriterion("offline_time not between", value1, value2, "offlineTime");
            return (Criteria) this;
        }

        public Criteria andCreateByMemberIdxIsNull() {
            addCriterion("create_by_member_idx is null");
            return (Criteria) this;
        }

        public Criteria andCreateByMemberIdxIsNotNull() {
            addCriterion("create_by_member_idx is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByMemberIdxEqualTo(Long value) {
            addCriterion("create_by_member_idx =", value, "createByMemberIdx");
            return (Criteria) this;
        }

        public Criteria andCreateByMemberIdxNotEqualTo(Long value) {
            addCriterion("create_by_member_idx <>", value, "createByMemberIdx");
            return (Criteria) this;
        }

        public Criteria andCreateByMemberIdxGreaterThan(Long value) {
            addCriterion("create_by_member_idx >", value, "createByMemberIdx");
            return (Criteria) this;
        }

        public Criteria andCreateByMemberIdxGreaterThanOrEqualTo(Long value) {
            addCriterion("create_by_member_idx >=", value, "createByMemberIdx");
            return (Criteria) this;
        }

        public Criteria andCreateByMemberIdxLessThan(Long value) {
            addCriterion("create_by_member_idx <", value, "createByMemberIdx");
            return (Criteria) this;
        }

        public Criteria andCreateByMemberIdxLessThanOrEqualTo(Long value) {
            addCriterion("create_by_member_idx <=", value, "createByMemberIdx");
            return (Criteria) this;
        }

        public Criteria andCreateByMemberIdxIn(List<Long> values) {
            addCriterion("create_by_member_idx in", values, "createByMemberIdx");
            return (Criteria) this;
        }

        public Criteria andCreateByMemberIdxNotIn(List<Long> values) {
            addCriterion("create_by_member_idx not in", values, "createByMemberIdx");
            return (Criteria) this;
        }

        public Criteria andCreateByMemberIdxBetween(Long value1, Long value2) {
            addCriterion("create_by_member_idx between", value1, value2, "createByMemberIdx");
            return (Criteria) this;
        }

        public Criteria andCreateByMemberIdxNotBetween(Long value1, Long value2) {
            addCriterion("create_by_member_idx not between", value1, value2, "createByMemberIdx");
            return (Criteria) this;
        }

        public Criteria andUpdateByMemberIdxIsNull() {
            addCriterion("update_by_member_idx is null");
            return (Criteria) this;
        }

        public Criteria andUpdateByMemberIdxIsNotNull() {
            addCriterion("update_by_member_idx is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateByMemberIdxEqualTo(Long value) {
            addCriterion("update_by_member_idx =", value, "updateByMemberIdx");
            return (Criteria) this;
        }

        public Criteria andUpdateByMemberIdxNotEqualTo(Long value) {
            addCriterion("update_by_member_idx <>", value, "updateByMemberIdx");
            return (Criteria) this;
        }

        public Criteria andUpdateByMemberIdxGreaterThan(Long value) {
            addCriterion("update_by_member_idx >", value, "updateByMemberIdx");
            return (Criteria) this;
        }

        public Criteria andUpdateByMemberIdxGreaterThanOrEqualTo(Long value) {
            addCriterion("update_by_member_idx >=", value, "updateByMemberIdx");
            return (Criteria) this;
        }

        public Criteria andUpdateByMemberIdxLessThan(Long value) {
            addCriterion("update_by_member_idx <", value, "updateByMemberIdx");
            return (Criteria) this;
        }

        public Criteria andUpdateByMemberIdxLessThanOrEqualTo(Long value) {
            addCriterion("update_by_member_idx <=", value, "updateByMemberIdx");
            return (Criteria) this;
        }

        public Criteria andUpdateByMemberIdxIn(List<Long> values) {
            addCriterion("update_by_member_idx in", values, "updateByMemberIdx");
            return (Criteria) this;
        }

        public Criteria andUpdateByMemberIdxNotIn(List<Long> values) {
            addCriterion("update_by_member_idx not in", values, "updateByMemberIdx");
            return (Criteria) this;
        }

        public Criteria andUpdateByMemberIdxBetween(Long value1, Long value2) {
            addCriterion("update_by_member_idx between", value1, value2, "updateByMemberIdx");
            return (Criteria) this;
        }

        public Criteria andUpdateByMemberIdxNotBetween(Long value1, Long value2) {
            addCriterion("update_by_member_idx not between", value1, value2, "updateByMemberIdx");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Short value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Short value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Short value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Short value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Short value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Short> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Short> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Short value1, Short value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Short value1, Short value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(Long value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(Long value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(Long value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(Long value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(Long value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(Long value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<Long> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<Long> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(Long value1, Long value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(Long value1, Long value2) {
            addCriterion("version not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andExtIsNull() {
            addCriterion("ext is null");
            return (Criteria) this;
        }

        public Criteria andExtIsNotNull() {
            addCriterion("ext is not null");
            return (Criteria) this;
        }

        public Criteria andExtEqualTo(String value) {
            addCriterion("ext =", value, "ext");
            return (Criteria) this;
        }

        public Criteria andExtNotEqualTo(String value) {
            addCriterion("ext <>", value, "ext");
            return (Criteria) this;
        }

        public Criteria andExtGreaterThan(String value) {
            addCriterion("ext >", value, "ext");
            return (Criteria) this;
        }

        public Criteria andExtGreaterThanOrEqualTo(String value) {
            addCriterion("ext >=", value, "ext");
            return (Criteria) this;
        }

        public Criteria andExtLessThan(String value) {
            addCriterion("ext <", value, "ext");
            return (Criteria) this;
        }

        public Criteria andExtLessThanOrEqualTo(String value) {
            addCriterion("ext <=", value, "ext");
            return (Criteria) this;
        }

        public Criteria andExtLike(String value) {
            addCriterion("ext like", value, "ext");
            return (Criteria) this;
        }

        public Criteria andExtNotLike(String value) {
            addCriterion("ext not like", value, "ext");
            return (Criteria) this;
        }

        public Criteria andExtIn(List<String> values) {
            addCriterion("ext in", values, "ext");
            return (Criteria) this;
        }

        public Criteria andExtNotIn(List<String> values) {
            addCriterion("ext not in", values, "ext");
            return (Criteria) this;
        }

        public Criteria andExtBetween(String value1, String value2) {
            addCriterion("ext between", value1, value2, "ext");
            return (Criteria) this;
        }

        public Criteria andExtNotBetween(String value1, String value2) {
            addCriterion("ext not between", value1, value2, "ext");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria implements Serializable {
        private static final long serialVersionUID = 1L;

        protected Criteria() {
            super();
        }
    }

    public static class Criterion implements Serializable {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        private static final long serialVersionUID = 1L;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}