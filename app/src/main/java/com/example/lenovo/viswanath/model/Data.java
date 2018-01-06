package com.example.lenovo.viswanath.model;

/**
 * Awesome Pojo Generator
 */
public class Data {
    private Integer id;
    private String cluster_name;
    private String region_name;
    private String distributor_name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCluster_name() {
        return cluster_name;
    }

    public void setCluster_name(String cluster_name) {
        this.cluster_name = cluster_name;
    }

    public String getRegion_name() {
        return region_name;
    }

    public void setRegion_name(String region_name) {
        this.region_name = region_name;
    }

    public String getDistributor_name() {
        return distributor_name;
    }

    public void setDistributor_name(String distributor_name) {
        this.distributor_name = distributor_name;
    }
/*private String account_type;
    private String last_updated_date_time;
    private String next_visit_date;
    private String lead_source;
    private Integer estimated_order_date;
    private String dflt_sup_la;
    private String dsr_names;
    private String dflt_sup_lc;
    private String oem_name;
    private String key_note_for_this_call;
    private String all_products;
    private String cus_location;
    private String dflt_keynotes;
    private String top_prospect;
    private Integer entered_by;
    private Integer id;
    private String sector;
    private String lead_status;
    private Integer region_id;
    private Object f_next_visit_date;
    private String product_name;
    //private Double volume;
    private String cus_name;
    private String need_dflt;
    private String product_name_2;
    private String dflt_sup_dvro;
    private String product_name_3;
    private String dflt_remainder;
    private Object cus_email;
    private String volume_converted;
    private Integer distributor_id;
    private Integer updated_by;
    private Integer dsr_id;
    private String entered_date_time;
    private Object lead_type;
    private String volume_converted_date;
    private String dflt_sup_pr;
    private Double target_volume;
    private Integer country_id;
    private Object cus_phone_no;
    private String status;
    private String f_lead_generation_date;
    private String customer_type;
    private String opportunity_type;
    private String gka_name;
    private String premium_opportunity;
    private String dflt_sup_xs_us;
    private String dflt_sup_oem;
    private String distributor_code;
    private String campaign_name;
    private Integer cluster_id;
    private String dflt_name;
    private Integer branch_id;
    private Integer dflt_id;
    private String dflt_sup_dvr_rtb;
    private Object source_details;
    private String branch_name;
    private String country_name;
    private String region_name;
    private String dsr_name;
    private String dflt_sup_jv;
    private String cluster_name;
    private Object contact_person;
    private Integer opportunity_percent;
    private String f_estimated_order_date;
    private Object current_brand;
    private Double annual_potential;
    private String opportunity_success;
    private String remainder_reason;
    private String distributor_name;
    private Integer lead_generation_date;
    private String dflt_sup_tr_pr;

    public void setAccount_type(String account_type) {
        this.account_type = account_type;
    }

    public String getAccount_type() {
        return account_type;
    }

    public void setLast_updated_date_time(String last_updated_date_time) {
        this.last_updated_date_time = last_updated_date_time;
    }

    public String getLast_updated_date_time() {
        return last_updated_date_time;
    }

    public void setNext_visit_date(String next_visit_date) {
        this.next_visit_date = next_visit_date;
    }

    public String getNext_visit_date() {
        return next_visit_date;
    }

    public void setLead_source(String lead_source) {
        this.lead_source = lead_source;
    }

    public String getLead_source() {
        return lead_source;
    }

    public void setEstimated_order_date(Integer estimated_order_date) {
        this.estimated_order_date = estimated_order_date;
    }

    public Integer getEstimated_order_date() {
        return estimated_order_date;
    }

    public void setDflt_sup_la(String dflt_sup_la) {
        this.dflt_sup_la = dflt_sup_la;
    }

    public String getDflt_sup_la() {
        return dflt_sup_la;
    }

    public void setDsr_names(String dsr_names) {
        this.dsr_names = dsr_names;
    }

    public String getDsr_names() {
        return dsr_names;
    }

    public void setDflt_sup_lc(String dflt_sup_lc) {
        this.dflt_sup_lc = dflt_sup_lc;
    }

    public String getDflt_sup_lc() {
        return dflt_sup_lc;
    }

    public void setOem_name(String oem_name) {
        this.oem_name = oem_name;
    }

    public String getOem_name() {
        return oem_name;
    }

    public void setKey_note_for_this_call(String key_note_for_this_call) {
        this.key_note_for_this_call = key_note_for_this_call;
    }

    public String getKey_note_for_this_call() {
        return key_note_for_this_call;
    }

    public void setAll_products(String all_products) {
        this.all_products = all_products;
    }

    public String getAll_products() {
        return all_products;
    }

    public void setCus_location(String cus_location) {
        this.cus_location = cus_location;
    }

    public String getCus_location() {
        return cus_location;
    }

    public void setDflt_keynotes(String dflt_keynotes) {
        this.dflt_keynotes = dflt_keynotes;
    }

    public String getDflt_keynotes() {
        return dflt_keynotes;
    }

    public void setTop_prospect(String top_prospect) {
        this.top_prospect = top_prospect;
    }

    public String getTop_prospect() {
        return top_prospect;
    }

    public void setEntered_by(Integer entered_by) {
        this.entered_by = entered_by;
    }

    public Integer getEntered_by() {
        return entered_by;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getSector() {
        return sector;
    }

    public void setLead_status(String lead_status) {
        this.lead_status = lead_status;
    }

    public String getLead_status() {
        return lead_status;
    }

    public void setRegion_id(Integer region_id) {
        this.region_id = region_id;
    }

    public Integer getRegion_id() {
        return region_id;
    }

    public void setF_next_visit_date(Object f_next_visit_date) {
        this.f_next_visit_date = f_next_visit_date;
    }

    public Object getF_next_visit_date() {
        return f_next_visit_date;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getProduct_name() {
        return product_name;
    }

   *//* public void setVolume(Double volume) {
        this.volume = volume;
    }

    public Double getVolume() {
        return volume;
    }*//*

    public void setCus_name(String cus_name) {
        this.cus_name = cus_name;
    }

    public String getCus_name() {
        return cus_name;
    }

    public void setNeed_dflt(String need_dflt) {
        this.need_dflt = need_dflt;
    }

    public String getNeed_dflt() {
        return need_dflt;
    }

    public void setProduct_name_2(String product_name_2) {
        this.product_name_2 = product_name_2;
    }

    public String getProduct_name_2() {
        return product_name_2;
    }

    public void setDflt_sup_dvro(String dflt_sup_dvro) {
        this.dflt_sup_dvro = dflt_sup_dvro;
    }

    public String getDflt_sup_dvro() {
        return dflt_sup_dvro;
    }

    public void setProduct_name_3(String product_name_3) {
        this.product_name_3 = product_name_3;
    }

    public String getProduct_name_3() {
        return product_name_3;
    }

    public void setDflt_remainder(String dflt_remainder) {
        this.dflt_remainder = dflt_remainder;
    }

    public String getDflt_remainder() {
        return dflt_remainder;
    }

    public void setCus_email(Object cus_email) {
        this.cus_email = cus_email;
    }

    public Object getCus_email() {
        return cus_email;
    }

    public void setVolume_converted(String volume_converted) {
        this.volume_converted = volume_converted;
    }

    public String getVolume_converted() {
        return volume_converted;
    }

    public void setDistributor_id(Integer distributor_id) {
        this.distributor_id = distributor_id;
    }

    public Integer getDistributor_id() {
        return distributor_id;
    }

    public void setUpdated_by(Integer updated_by) {
        this.updated_by = updated_by;
    }

    public Integer getUpdated_by() {
        return updated_by;
    }

    public void setDsr_id(Integer dsr_id) {
        this.dsr_id = dsr_id;
    }

    public Integer getDsr_id() {
        return dsr_id;
    }

    public void setEntered_date_time(String entered_date_time) {
        this.entered_date_time = entered_date_time;
    }

    public String getEntered_date_time() {
        return entered_date_time;
    }

    public void setLead_type(Object lead_type) {
        this.lead_type = lead_type;
    }

    public Object getLead_type() {
        return lead_type;
    }

    public void setVolume_converted_date(String volume_converted_date) {
        this.volume_converted_date = volume_converted_date;
    }

    public String getVolume_converted_date() {
        return volume_converted_date;
    }

    public void setDflt_sup_pr(String dflt_sup_pr) {
        this.dflt_sup_pr = dflt_sup_pr;
    }

    public String getDflt_sup_pr() {
        return dflt_sup_pr;
    }

    public void setTarget_volume(Double target_volume) {
        this.target_volume = target_volume;
    }

    public Double getTarget_volume() {
        return target_volume;
    }

    public void setCountry_id(Integer country_id) {
        this.country_id = country_id;
    }

    public Integer getCountry_id() {
        return country_id;
    }

    public void setCus_phone_no(Object cus_phone_no) {
        this.cus_phone_no = cus_phone_no;
    }

    public Object getCus_phone_no() {
        return cus_phone_no;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setF_lead_generation_date(String f_lead_generation_date) {
        this.f_lead_generation_date = f_lead_generation_date;
    }

    public String getF_lead_generation_date() {
        return f_lead_generation_date;
    }

    public void setCustomer_type(String customer_type) {
        this.customer_type = customer_type;
    }

    public String getCustomer_type() {
        return customer_type;
    }

    public void setOpportunity_type(String opportunity_type) {
        this.opportunity_type = opportunity_type;
    }

    public String getOpportunity_type() {
        return opportunity_type;
    }

    public void setGka_name(String gka_name) {
        this.gka_name = gka_name;
    }

    public String getGka_name() {
        return gka_name;
    }

    public void setPremium_opportunity(String premium_opportunity) {
        this.premium_opportunity = premium_opportunity;
    }

    public String getPremium_opportunity() {
        return premium_opportunity;
    }

    public void setDflt_sup_xs_us(String dflt_sup_xs_us) {
        this.dflt_sup_xs_us = dflt_sup_xs_us;
    }

    public String getDflt_sup_xs_us() {
        return dflt_sup_xs_us;
    }

    public void setDflt_sup_oem(String dflt_sup_oem) {
        this.dflt_sup_oem = dflt_sup_oem;
    }

    public String getDflt_sup_oem() {
        return dflt_sup_oem;
    }

    public void setDistributor_code(String distributor_code) {
        this.distributor_code = distributor_code;
    }

    public String getDistributor_code() {
        return distributor_code;
    }

    public void setCampaign_name(String campaign_name) {
        this.campaign_name = campaign_name;
    }

    public String getCampaign_name() {
        return campaign_name;
    }

    public void setCluster_id(Integer cluster_id) {
        this.cluster_id = cluster_id;
    }

    public Integer getCluster_id() {
        return cluster_id;
    }

    public void setDflt_name(String dflt_name) {
        this.dflt_name = dflt_name;
    }

    public String getDflt_name() {
        return dflt_name;
    }

    public void setBranch_id(Integer branch_id) {
        this.branch_id = branch_id;
    }

    public Integer getBranch_id() {
        return branch_id;
    }

    public void setDflt_id(Integer dflt_id) {
        this.dflt_id = dflt_id;
    }

    public Integer getDflt_id() {
        return dflt_id;
    }

    public void setDflt_sup_dvr_rtb(String dflt_sup_dvr_rtb) {
        this.dflt_sup_dvr_rtb = dflt_sup_dvr_rtb;
    }

    public String getDflt_sup_dvr_rtb() {
        return dflt_sup_dvr_rtb;
    }

    public void setSource_details(Object source_details) {
        this.source_details = source_details;
    }

    public Object getSource_details() {
        return source_details;
    }

    public void setBranch_name(String branch_name) {
        this.branch_name = branch_name;
    }

    public String getBranch_name() {
        return branch_name;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }

    public String getCountry_name() {
        return country_name;
    }

    public void setRegion_name(String region_name) {
        this.region_name = region_name;
    }

    public String getRegion_name() {
        return region_name;
    }

    public void setDsr_name(String dsr_name) {
        this.dsr_name = dsr_name;
    }

    public String getDsr_name() {
        return dsr_name;
    }

    public void setDflt_sup_jv(String dflt_sup_jv) {
        this.dflt_sup_jv = dflt_sup_jv;
    }

    public String getDflt_sup_jv() {
        return dflt_sup_jv;
    }

    public void setCluster_name(String cluster_name) {
        this.cluster_name = cluster_name;
    }

    public String getCluster_name() {
        return cluster_name;
    }

    public void setContact_person(Object contact_person) {
        this.contact_person = contact_person;
    }

    public Object getContact_person() {
        return contact_person;
    }

    public void setOpportunity_percent(Integer opportunity_percent) {
        this.opportunity_percent = opportunity_percent;
    }

    public Integer getOpportunity_percent() {
        return opportunity_percent;
    }

    public void setF_estimated_order_date(String f_estimated_order_date) {
        this.f_estimated_order_date = f_estimated_order_date;
    }

    public String getF_estimated_order_date() {
        return f_estimated_order_date;
    }

    public void setCurrent_brand(Object current_brand) {
        this.current_brand = current_brand;
    }

    public Object getCurrent_brand() {
        return current_brand;
    }

    public void setAnnual_potential(Double annual_potential) {
        this.annual_potential = annual_potential;
    }

    public Double getAnnual_potential() {
        return annual_potential;
    }

    public void setOpportunity_success(String opportunity_success) {
        this.opportunity_success = opportunity_success;
    }

    public String getOpportunity_success() {
        return opportunity_success;
    }

    public void setRemainder_reason(String remainder_reason) {
        this.remainder_reason = remainder_reason;
    }

    public String getRemainder_reason() {
        return remainder_reason;
    }

    public void setDistributor_name(String distributor_name) {
        this.distributor_name = distributor_name;
    }

    public String getDistributor_name() {
        return distributor_name;
    }

    public void setLead_generation_date(Integer lead_generation_date) {
        this.lead_generation_date = lead_generation_date;
    }

    public Integer getLead_generation_date() {
        return lead_generation_date;
    }

    public void setDflt_sup_tr_pr(String dflt_sup_tr_pr) {
        this.dflt_sup_tr_pr = dflt_sup_tr_pr;
    }

    public String getDflt_sup_tr_pr() {
        return dflt_sup_tr_pr;
    }*/
}