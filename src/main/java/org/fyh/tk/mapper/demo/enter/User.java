package org.fyh.tk.mapper.demo.enter;

import java.util.Date;
import javax.persistence.*;

@Table(name = "user")
public class User {
    /**
     * 用户表
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 手机号码
     */
    private String phone;

    /**
     * 密码
     */
    private String psw;

    /**
     * -1后台生成,1Android,2IOS,3WEB
     */
    @Column(name = "user_type")
    private Short userType;

    private String remark;

    @Column(name = "create_time")
    private Date createTime;

    private String token;

    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 获取用户表
     *
     * @return id - 用户表
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置用户表
     *
     * @param id 用户表
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取手机号码
     *
     * @return phone - 手机号码
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置手机号码
     *
     * @param phone 手机号码
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * 获取密码
     *
     * @return psw - 密码
     */
    public String getPsw() {
        return psw;
    }

    /**
     * 设置密码
     *
     * @param psw 密码
     */
    public void setPsw(String psw) {
        this.psw = psw == null ? null : psw.trim();
    }

    /**
     * 获取-1后台生成,1Android,2IOS,3WEB
     *
     * @return user_type - -1后台生成,1Android,2IOS,3WEB
     */
    public Short getUserType() {
        return userType;
    }

    /**
     * 设置-1后台生成,1Android,2IOS,3WEB
     *
     * @param userType -1后台生成,1Android,2IOS,3WEB
     */
    public void setUserType(Short userType) {
        this.userType = userType;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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

    /**
     * @return token
     */
    public String getToken() {
        return token;
    }

    /**
     * @param token
     */
    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    /**
     * @return update_time
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}