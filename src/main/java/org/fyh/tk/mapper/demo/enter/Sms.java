package org.fyh.tk.mapper.demo.enter;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sms")
public class Sms {
    /**
     * 发送短信记录
     */
    @Id
    private Integer id;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 校验码
     */
    private String code;

    /**
     * 1注册,2忘记密码,3创业者修改提现密码,4登录 5: 引导关注公众号 6 : 添加爱情顾问微信；7=更换手机号
     */
    private Short type;

    /**
     * 有效时间
     */
    @Column(name = "end_time")
    private Date endTime;

    /**
     * 1Android,2IOS,3WEB
     */
    @Column(name = "platform_type")
    private Short platformType;

    /**
     * 0未使用,1使用
     */
    private Short state;

    /**
     * 1发送成功,0发送失败
     */
    @Column(name = "is_send")
    private String isSend;

    /**
     * 10位随机防刷码
     */
    @Column(name = "extra_code")
    private String extraCode;

    @Column(name = "create_time")
    private Date createTime;

    /**
     * 获取发送短信记录
     *
     * @return id - 发送短信记录
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置发送短信记录
     *
     * @param id 发送短信记录
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取手机号
     *
     * @return phone - 手机号
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置手机号
     *
     * @param phone 手机号
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * 获取校验码
     *
     * @return code - 校验码
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置校验码
     *
     * @param code 校验码
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * 获取1注册,2忘记密码,3创业者修改提现密码,4登录 5: 引导关注公众号 6 : 添加爱情顾问微信；7=更换手机号
     *
     * @return type - 1注册,2忘记密码,3创业者修改提现密码,4登录 5: 引导关注公众号 6 : 添加爱情顾问微信；7=更换手机号
     */
    public Short getType() {
        return type;
    }

    /**
     * 设置1注册,2忘记密码,3创业者修改提现密码,4登录 5: 引导关注公众号 6 : 添加爱情顾问微信；7=更换手机号
     *
     * @param type 1注册,2忘记密码,3创业者修改提现密码,4登录 5: 引导关注公众号 6 : 添加爱情顾问微信；7=更换手机号
     */
    public void setType(Short type) {
        this.type = type;
    }

    /**
     * 获取有效时间
     *
     * @return end_time - 有效时间
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * 设置有效时间
     *
     * @param endTime 有效时间
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * 获取1Android,2IOS,3WEB
     *
     * @return platform_type - 1Android,2IOS,3WEB
     */
    public Short getPlatformType() {
        return platformType;
    }

    /**
     * 设置1Android,2IOS,3WEB
     *
     * @param platformType 1Android,2IOS,3WEB
     */
    public void setPlatformType(Short platformType) {
        this.platformType = platformType;
    }

    /**
     * 获取0未使用,1使用
     *
     * @return state - 0未使用,1使用
     */
    public Short getState() {
        return state;
    }

    /**
     * 设置0未使用,1使用
     *
     * @param state 0未使用,1使用
     */
    public void setState(Short state) {
        this.state = state;
    }

    /**
     * 获取1发送成功,0发送失败
     *
     * @return is_send - 1发送成功,0发送失败
     */
    public String getIsSend() {
        return isSend;
    }

    /**
     * 设置1发送成功,0发送失败
     *
     * @param isSend 1发送成功,0发送失败
     */
    public void setIsSend(String isSend) {
        this.isSend = isSend == null ? null : isSend.trim();
    }

    /**
     * 获取10位随机防刷码
     *
     * @return extra_code - 10位随机防刷码
     */
    public String getExtraCode() {
        return extraCode;
    }

    /**
     * 设置10位随机防刷码
     *
     * @param extraCode 10位随机防刷码
     */
    public void setExtraCode(String extraCode) {
        this.extraCode = extraCode == null ? null : extraCode.trim();
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}