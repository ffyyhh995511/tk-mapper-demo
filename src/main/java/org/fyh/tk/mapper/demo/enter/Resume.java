package org.fyh.tk.mapper.demo.enter;

import java.util.Date;
import javax.persistence.*;

@Table(name = "resume")
public class Resume {
    /**
     * 用户简历,用户id
     */
    @Id
    private Integer id;

    /**
     * 真实姓名
     */
    @Column(name = "nick_name")
    private String nickName;

    /**
     * 称呼
     */
    private String chenghu;

    /**
     * 生日
     */
    private Date birthday;

    /**
     * 年龄
     */
    private Short age;

    /**
     * 星座
     */
    private String constellation;

    /**
     * 身高
     */
    private Integer height;

    /**
     * 居中省份
     */
    private String province;

    /**
     * 居住城市
     */
    private String city;

    /**
     * 学历 1初中、2中专/职高/技校、3高中、4大专、5本科、6硕士、7博士、8博士后
     */
    private Short education;

    /**
     * 0默认,1男,2女
     */
    private Short sex;

    /**
     * 0未查看(首次审核),1待审核,2审核通过,3审核不通过
     */
    private Short state;

    /**
     * 工资范围-最高工资,-1不限，2k以下: salary_min=0, salary_max=2，30-50k: salary_min=30, salary_max=50，50k以上: salary_min=50, salary_max=-1
     */
    @Column(name = "salary_min")
    private Integer salaryMin;

    /**
     * 工资范围-最高工资,-1不限，2k以下: salary_min=0, salary_max=2，30-50k: salary_min=30, salary_max=50，50k以上: salary_min=50, salary_max=-1
     */
    @Column(name = "salary_max")
    private Integer salaryMax;

    /**
     * 1未婚,2离异,3丧偶
     */
    @Column(name = "marry_state")
    private Short marryState;

    /**
     * 1没有2有.和我住一起3有.有时和我住一起4有.不和我住一起
     */
    @Column(name = "child_state")
    private Short childState;

    /**
     * 期望结婚时间1半年内、2一年内、3两年内、4三年内
     */
    @Column(name = "marry_time")
    private Short marryTime;

    /**
     * 用户自我介绍
     */
    private String pdesc;

    /**
     * 想对ta说
     */
    @Column(name = "sweet_words")
    private String sweetWords;

    /**
     * 管理员备注
     */
    private String remark;

    /**
     * 0是显示, 1下架, 2注销
     */
    @Column(name = "is_del")
    private Short isDel;

    /**
     * 家乡-省
     */
    @Column(name = "home_province")
    private String homeProvince;

    /**
     * 家乡城市
     */
    @Column(name = "home_city")
    private String homeCity;

    /**
     * 80以上:81  40以下:39
     */
    private Short weight;

    /**
     * 1不吸，很反感、2不吸烟，但不反感、3社交时偶尔吸烟、4烟不离手
     */
    private Short somke;

    /**
     * 1不喝酒、2社交需要时喝、3兴致时小酌、4酒不离手
     */
    private Short drink;

    /**
     * 1其他,2独生子女、3老大、4老二、5老三、6老四、7老五
     */
    @Column(name = "family_order")
    private Short familyOrder;

    /**
     * 1父母健在、2单亲家庭、3父亲健在、4母亲健在、5父母均离世
     */
    @Column(name = "parent_state")
    private Short parentState;

    /**
     * 偏爱约会方式,多个用,分割  1一起看电影、2共进晚餐、3共赴浪漫之旅、4牵手漫步公园、5彼此相依相偎
     */
    private String tryst;

    /**
     * 管理员id
     */
    @Column(name = "admin_id")
    private Integer adminId;

    /**
     * state =3 时显示在客户端的警告信息
     */
    @Column(name = "warn_msg")
    private String warnMsg;

    /**
     * 认证集合取 | 
     */
    @Column(name = "auth_state")
    private Integer authState;

    /**
     * -2广场用户,0默认,正常用户1,2广场用户转正常用户
     */
    @Column(name = "user_tag")
    private Short userTag;

    /**
     * 认证复核 0默认, 1去身份认证
     */
    @Column(name = "recheck_auth_identity")
    private Short recheckAuthIdentity;

    /**
     * 认证复核 0默认, 1去芝麻认证
     */
    @Column(name = "recheck_auth_zhima")
    private Short recheckAuthZhima;

    /**
     * 认证复核 0默认, 1去视频认证
     */
    @Column(name = "recheck_auth_video")
    private Short recheckAuthVideo;

    /**
     * 认证系统拦截状态 0默认, 1取消视频认证
     */
    @Column(name = "cancel_video_auth")
    private Short cancelVideoAuth;

    /**
     * 认证系统拦截状态 0默认, 1取消芝麻认证
     */
    @Column(name = "cancel_zhima_auth")
    private Short cancelZhimaAuth;

    /**
     * 认证系统拦截状态 0默认, 1取消身份认证
     */
    @Column(name = "cancel_identity_auth")
    private Short cancelIdentityAuth;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 姓名和公司/机构发生了修改更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * h5页面详细信息需要， 和职业认证不互通
     */
    @Column(name = "h5_profession")
    private String h5Profession;

    /**
     * 民族
     */
    private String nationality;

    /**
     * 获取用户简历,用户id
     *
     * @return id - 用户简历,用户id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置用户简历,用户id
     *
     * @param id 用户简历,用户id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取真实姓名
     *
     * @return nick_name - 真实姓名
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * 设置真实姓名
     *
     * @param nickName 真实姓名
     */
    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    /**
     * 获取称呼
     *
     * @return chenghu - 称呼
     */
    public String getChenghu() {
        return chenghu;
    }

    /**
     * 设置称呼
     *
     * @param chenghu 称呼
     */
    public void setChenghu(String chenghu) {
        this.chenghu = chenghu == null ? null : chenghu.trim();
    }

    /**
     * 获取生日
     *
     * @return birthday - 生日
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * 设置生日
     *
     * @param birthday 生日
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * 获取年龄
     *
     * @return age - 年龄
     */
    public Short getAge() {
        return age;
    }

    /**
     * 设置年龄
     *
     * @param age 年龄
     */
    public void setAge(Short age) {
        this.age = age;
    }

    /**
     * 获取星座
     *
     * @return constellation - 星座
     */
    public String getConstellation() {
        return constellation;
    }

    /**
     * 设置星座
     *
     * @param constellation 星座
     */
    public void setConstellation(String constellation) {
        this.constellation = constellation == null ? null : constellation.trim();
    }

    /**
     * 获取身高
     *
     * @return height - 身高
     */
    public Integer getHeight() {
        return height;
    }

    /**
     * 设置身高
     *
     * @param height 身高
     */
    public void setHeight(Integer height) {
        this.height = height;
    }

    /**
     * 获取居中省份
     *
     * @return province - 居中省份
     */
    public String getProvince() {
        return province;
    }

    /**
     * 设置居中省份
     *
     * @param province 居中省份
     */
    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    /**
     * 获取居住城市
     *
     * @return city - 居住城市
     */
    public String getCity() {
        return city;
    }

    /**
     * 设置居住城市
     *
     * @param city 居住城市
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * 获取学历 1初中、2中专/职高/技校、3高中、4大专、5本科、6硕士、7博士、8博士后
     *
     * @return education - 学历 1初中、2中专/职高/技校、3高中、4大专、5本科、6硕士、7博士、8博士后
     */
    public Short getEducation() {
        return education;
    }

    /**
     * 设置学历 1初中、2中专/职高/技校、3高中、4大专、5本科、6硕士、7博士、8博士后
     *
     * @param education 学历 1初中、2中专/职高/技校、3高中、4大专、5本科、6硕士、7博士、8博士后
     */
    public void setEducation(Short education) {
        this.education = education;
    }

    /**
     * 获取0默认,1男,2女
     *
     * @return sex - 0默认,1男,2女
     */
    public Short getSex() {
        return sex;
    }

    /**
     * 设置0默认,1男,2女
     *
     * @param sex 0默认,1男,2女
     */
    public void setSex(Short sex) {
        this.sex = sex;
    }

    /**
     * 获取0未查看(首次审核),1待审核,2审核通过,3审核不通过
     *
     * @return state - 0未查看(首次审核),1待审核,2审核通过,3审核不通过
     */
    public Short getState() {
        return state;
    }

    /**
     * 设置0未查看(首次审核),1待审核,2审核通过,3审核不通过
     *
     * @param state 0未查看(首次审核),1待审核,2审核通过,3审核不通过
     */
    public void setState(Short state) {
        this.state = state;
    }

    /**
     * 获取工资范围-最高工资,-1不限，2k以下: salary_min=0, salary_max=2，30-50k: salary_min=30, salary_max=50，50k以上: salary_min=50, salary_max=-1
     *
     * @return salary_min - 工资范围-最高工资,-1不限，2k以下: salary_min=0, salary_max=2，30-50k: salary_min=30, salary_max=50，50k以上: salary_min=50, salary_max=-1
     */
    public Integer getSalaryMin() {
        return salaryMin;
    }

    /**
     * 设置工资范围-最高工资,-1不限，2k以下: salary_min=0, salary_max=2，30-50k: salary_min=30, salary_max=50，50k以上: salary_min=50, salary_max=-1
     *
     * @param salaryMin 工资范围-最高工资,-1不限，2k以下: salary_min=0, salary_max=2，30-50k: salary_min=30, salary_max=50，50k以上: salary_min=50, salary_max=-1
     */
    public void setSalaryMin(Integer salaryMin) {
        this.salaryMin = salaryMin;
    }

    /**
     * 获取工资范围-最高工资,-1不限，2k以下: salary_min=0, salary_max=2，30-50k: salary_min=30, salary_max=50，50k以上: salary_min=50, salary_max=-1
     *
     * @return salary_max - 工资范围-最高工资,-1不限，2k以下: salary_min=0, salary_max=2，30-50k: salary_min=30, salary_max=50，50k以上: salary_min=50, salary_max=-1
     */
    public Integer getSalaryMax() {
        return salaryMax;
    }

    /**
     * 设置工资范围-最高工资,-1不限，2k以下: salary_min=0, salary_max=2，30-50k: salary_min=30, salary_max=50，50k以上: salary_min=50, salary_max=-1
     *
     * @param salaryMax 工资范围-最高工资,-1不限，2k以下: salary_min=0, salary_max=2，30-50k: salary_min=30, salary_max=50，50k以上: salary_min=50, salary_max=-1
     */
    public void setSalaryMax(Integer salaryMax) {
        this.salaryMax = salaryMax;
    }

    /**
     * 获取1未婚,2离异,3丧偶
     *
     * @return marry_state - 1未婚,2离异,3丧偶
     */
    public Short getMarryState() {
        return marryState;
    }

    /**
     * 设置1未婚,2离异,3丧偶
     *
     * @param marryState 1未婚,2离异,3丧偶
     */
    public void setMarryState(Short marryState) {
        this.marryState = marryState;
    }

    /**
     * 获取1没有2有.和我住一起3有.有时和我住一起4有.不和我住一起
     *
     * @return child_state - 1没有2有.和我住一起3有.有时和我住一起4有.不和我住一起
     */
    public Short getChildState() {
        return childState;
    }

    /**
     * 设置1没有2有.和我住一起3有.有时和我住一起4有.不和我住一起
     *
     * @param childState 1没有2有.和我住一起3有.有时和我住一起4有.不和我住一起
     */
    public void setChildState(Short childState) {
        this.childState = childState;
    }

    /**
     * 获取期望结婚时间1半年内、2一年内、3两年内、4三年内
     *
     * @return marry_time - 期望结婚时间1半年内、2一年内、3两年内、4三年内
     */
    public Short getMarryTime() {
        return marryTime;
    }

    /**
     * 设置期望结婚时间1半年内、2一年内、3两年内、4三年内
     *
     * @param marryTime 期望结婚时间1半年内、2一年内、3两年内、4三年内
     */
    public void setMarryTime(Short marryTime) {
        this.marryTime = marryTime;
    }

    /**
     * 获取用户自我介绍
     *
     * @return pdesc - 用户自我介绍
     */
    public String getPdesc() {
        return pdesc;
    }

    /**
     * 设置用户自我介绍
     *
     * @param pdesc 用户自我介绍
     */
    public void setPdesc(String pdesc) {
        this.pdesc = pdesc == null ? null : pdesc.trim();
    }

    /**
     * 获取想对ta说
     *
     * @return sweet_words - 想对ta说
     */
    public String getSweetWords() {
        return sweetWords;
    }

    /**
     * 设置想对ta说
     *
     * @param sweetWords 想对ta说
     */
    public void setSweetWords(String sweetWords) {
        this.sweetWords = sweetWords == null ? null : sweetWords.trim();
    }

    /**
     * 获取管理员备注
     *
     * @return remark - 管理员备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置管理员备注
     *
     * @param remark 管理员备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 获取0是显示, 1下架, 2注销
     *
     * @return is_del - 0是显示, 1下架, 2注销
     */
    public Short getIsDel() {
        return isDel;
    }

    /**
     * 设置0是显示, 1下架, 2注销
     *
     * @param isDel 0是显示, 1下架, 2注销
     */
    public void setIsDel(Short isDel) {
        this.isDel = isDel;
    }

    /**
     * 获取家乡-省
     *
     * @return home_province - 家乡-省
     */
    public String getHomeProvince() {
        return homeProvince;
    }

    /**
     * 设置家乡-省
     *
     * @param homeProvince 家乡-省
     */
    public void setHomeProvince(String homeProvince) {
        this.homeProvince = homeProvince == null ? null : homeProvince.trim();
    }

    /**
     * 获取家乡城市
     *
     * @return home_city - 家乡城市
     */
    public String getHomeCity() {
        return homeCity;
    }

    /**
     * 设置家乡城市
     *
     * @param homeCity 家乡城市
     */
    public void setHomeCity(String homeCity) {
        this.homeCity = homeCity == null ? null : homeCity.trim();
    }

    /**
     * 获取80以上:81  40以下:39
     *
     * @return weight - 80以上:81  40以下:39
     */
    public Short getWeight() {
        return weight;
    }

    /**
     * 设置80以上:81  40以下:39
     *
     * @param weight 80以上:81  40以下:39
     */
    public void setWeight(Short weight) {
        this.weight = weight;
    }

    /**
     * 获取1不吸，很反感、2不吸烟，但不反感、3社交时偶尔吸烟、4烟不离手
     *
     * @return somke - 1不吸，很反感、2不吸烟，但不反感、3社交时偶尔吸烟、4烟不离手
     */
    public Short getSomke() {
        return somke;
    }

    /**
     * 设置1不吸，很反感、2不吸烟，但不反感、3社交时偶尔吸烟、4烟不离手
     *
     * @param somke 1不吸，很反感、2不吸烟，但不反感、3社交时偶尔吸烟、4烟不离手
     */
    public void setSomke(Short somke) {
        this.somke = somke;
    }

    /**
     * 获取1不喝酒、2社交需要时喝、3兴致时小酌、4酒不离手
     *
     * @return drink - 1不喝酒、2社交需要时喝、3兴致时小酌、4酒不离手
     */
    public Short getDrink() {
        return drink;
    }

    /**
     * 设置1不喝酒、2社交需要时喝、3兴致时小酌、4酒不离手
     *
     * @param drink 1不喝酒、2社交需要时喝、3兴致时小酌、4酒不离手
     */
    public void setDrink(Short drink) {
        this.drink = drink;
    }

    /**
     * 获取1其他,2独生子女、3老大、4老二、5老三、6老四、7老五
     *
     * @return family_order - 1其他,2独生子女、3老大、4老二、5老三、6老四、7老五
     */
    public Short getFamilyOrder() {
        return familyOrder;
    }

    /**
     * 设置1其他,2独生子女、3老大、4老二、5老三、6老四、7老五
     *
     * @param familyOrder 1其他,2独生子女、3老大、4老二、5老三、6老四、7老五
     */
    public void setFamilyOrder(Short familyOrder) {
        this.familyOrder = familyOrder;
    }

    /**
     * 获取1父母健在、2单亲家庭、3父亲健在、4母亲健在、5父母均离世
     *
     * @return parent_state - 1父母健在、2单亲家庭、3父亲健在、4母亲健在、5父母均离世
     */
    public Short getParentState() {
        return parentState;
    }

    /**
     * 设置1父母健在、2单亲家庭、3父亲健在、4母亲健在、5父母均离世
     *
     * @param parentState 1父母健在、2单亲家庭、3父亲健在、4母亲健在、5父母均离世
     */
    public void setParentState(Short parentState) {
        this.parentState = parentState;
    }

    /**
     * 获取偏爱约会方式,多个用,分割  1一起看电影、2共进晚餐、3共赴浪漫之旅、4牵手漫步公园、5彼此相依相偎
     *
     * @return tryst - 偏爱约会方式,多个用,分割  1一起看电影、2共进晚餐、3共赴浪漫之旅、4牵手漫步公园、5彼此相依相偎
     */
    public String getTryst() {
        return tryst;
    }

    /**
     * 设置偏爱约会方式,多个用,分割  1一起看电影、2共进晚餐、3共赴浪漫之旅、4牵手漫步公园、5彼此相依相偎
     *
     * @param tryst 偏爱约会方式,多个用,分割  1一起看电影、2共进晚餐、3共赴浪漫之旅、4牵手漫步公园、5彼此相依相偎
     */
    public void setTryst(String tryst) {
        this.tryst = tryst == null ? null : tryst.trim();
    }

    /**
     * 获取管理员id
     *
     * @return admin_id - 管理员id
     */
    public Integer getAdminId() {
        return adminId;
    }

    /**
     * 设置管理员id
     *
     * @param adminId 管理员id
     */
    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    /**
     * 获取state =3 时显示在客户端的警告信息
     *
     * @return warn_msg - state =3 时显示在客户端的警告信息
     */
    public String getWarnMsg() {
        return warnMsg;
    }

    /**
     * 设置state =3 时显示在客户端的警告信息
     *
     * @param warnMsg state =3 时显示在客户端的警告信息
     */
    public void setWarnMsg(String warnMsg) {
        this.warnMsg = warnMsg == null ? null : warnMsg.trim();
    }

    /**
     * 获取认证集合取 | 
     *
     * @return auth_state - 认证集合取 | 
     */
    public Integer getAuthState() {
        return authState;
    }

    /**
     * 设置认证集合取 | 
     *
     * @param authState 认证集合取 | 
     */
    public void setAuthState(Integer authState) {
        this.authState = authState;
    }

    /**
     * 获取-2广场用户,0默认,正常用户1,2广场用户转正常用户
     *
     * @return user_tag - -2广场用户,0默认,正常用户1,2广场用户转正常用户
     */
    public Short getUserTag() {
        return userTag;
    }

    /**
     * 设置-2广场用户,0默认,正常用户1,2广场用户转正常用户
     *
     * @param userTag -2广场用户,0默认,正常用户1,2广场用户转正常用户
     */
    public void setUserTag(Short userTag) {
        this.userTag = userTag;
    }

    /**
     * 获取认证复核 0默认, 1去身份认证
     *
     * @return recheck_auth_identity - 认证复核 0默认, 1去身份认证
     */
    public Short getRecheckAuthIdentity() {
        return recheckAuthIdentity;
    }

    /**
     * 设置认证复核 0默认, 1去身份认证
     *
     * @param recheckAuthIdentity 认证复核 0默认, 1去身份认证
     */
    public void setRecheckAuthIdentity(Short recheckAuthIdentity) {
        this.recheckAuthIdentity = recheckAuthIdentity;
    }

    /**
     * 获取认证复核 0默认, 1去芝麻认证
     *
     * @return recheck_auth_zhima - 认证复核 0默认, 1去芝麻认证
     */
    public Short getRecheckAuthZhima() {
        return recheckAuthZhima;
    }

    /**
     * 设置认证复核 0默认, 1去芝麻认证
     *
     * @param recheckAuthZhima 认证复核 0默认, 1去芝麻认证
     */
    public void setRecheckAuthZhima(Short recheckAuthZhima) {
        this.recheckAuthZhima = recheckAuthZhima;
    }

    /**
     * 获取认证复核 0默认, 1去视频认证
     *
     * @return recheck_auth_video - 认证复核 0默认, 1去视频认证
     */
    public Short getRecheckAuthVideo() {
        return recheckAuthVideo;
    }

    /**
     * 设置认证复核 0默认, 1去视频认证
     *
     * @param recheckAuthVideo 认证复核 0默认, 1去视频认证
     */
    public void setRecheckAuthVideo(Short recheckAuthVideo) {
        this.recheckAuthVideo = recheckAuthVideo;
    }

    /**
     * 获取认证系统拦截状态 0默认, 1取消视频认证
     *
     * @return cancel_video_auth - 认证系统拦截状态 0默认, 1取消视频认证
     */
    public Short getCancelVideoAuth() {
        return cancelVideoAuth;
    }

    /**
     * 设置认证系统拦截状态 0默认, 1取消视频认证
     *
     * @param cancelVideoAuth 认证系统拦截状态 0默认, 1取消视频认证
     */
    public void setCancelVideoAuth(Short cancelVideoAuth) {
        this.cancelVideoAuth = cancelVideoAuth;
    }

    /**
     * 获取认证系统拦截状态 0默认, 1取消芝麻认证
     *
     * @return cancel_zhima_auth - 认证系统拦截状态 0默认, 1取消芝麻认证
     */
    public Short getCancelZhimaAuth() {
        return cancelZhimaAuth;
    }

    /**
     * 设置认证系统拦截状态 0默认, 1取消芝麻认证
     *
     * @param cancelZhimaAuth 认证系统拦截状态 0默认, 1取消芝麻认证
     */
    public void setCancelZhimaAuth(Short cancelZhimaAuth) {
        this.cancelZhimaAuth = cancelZhimaAuth;
    }

    /**
     * 获取认证系统拦截状态 0默认, 1取消身份认证
     *
     * @return cancel_identity_auth - 认证系统拦截状态 0默认, 1取消身份认证
     */
    public Short getCancelIdentityAuth() {
        return cancelIdentityAuth;
    }

    /**
     * 设置认证系统拦截状态 0默认, 1取消身份认证
     *
     * @param cancelIdentityAuth 认证系统拦截状态 0默认, 1取消身份认证
     */
    public void setCancelIdentityAuth(Short cancelIdentityAuth) {
        this.cancelIdentityAuth = cancelIdentityAuth;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取姓名和公司/机构发生了修改更新时间
     *
     * @return update_time - 姓名和公司/机构发生了修改更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置姓名和公司/机构发生了修改更新时间
     *
     * @param updateTime 姓名和公司/机构发生了修改更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取h5页面详细信息需要， 和职业认证不互通
     *
     * @return h5_profession - h5页面详细信息需要， 和职业认证不互通
     */
    public String getH5Profession() {
        return h5Profession;
    }

    /**
     * 设置h5页面详细信息需要， 和职业认证不互通
     *
     * @param h5Profession h5页面详细信息需要， 和职业认证不互通
     */
    public void setH5Profession(String h5Profession) {
        this.h5Profession = h5Profession == null ? null : h5Profession.trim();
    }

    /**
     * 获取民族
     *
     * @return nationality - 民族
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * 设置民族
     *
     * @param nationality 民族
     */
    public void setNationality(String nationality) {
        this.nationality = nationality == null ? null : nationality.trim();
    }
}