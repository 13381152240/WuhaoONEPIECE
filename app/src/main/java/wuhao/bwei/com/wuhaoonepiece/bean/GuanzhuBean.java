package wuhao.bwei.com.wuhaoonepiece.bean;

import java.util.List;

/**
 * Created by alienware on 2018/1/25.
 */

public class GuanzhuBean {
    /**
     * msg : 获取关注用户列表成功
     * code : 0
     * data : [{"age":null,"appkey":"3ab1e6ea58b8ca73","appsecret":"92A8C830AD52D68E76769219A379C551","createtime":"2018-01-25T11:38:43","email":null,"fans":null,"follow":null,"gender":null,"icon":null,"latitude":null,"longitude":null,"mobile":"17698765432","money":null,"nickname":"叫我飞哥好吗!","password":"8F669074CAF5513351A2DE5CC22AC04C","praiseNum":null,"token":"A5EF0CC17B44D0BDEBEE6A19497E1D2F","uid":4814,"userId":null,"username":"17698765432"},{"age":null,"appkey":"1bf6f71b2b1eb7ca","appsecret":"D757211689797DE2F2F29E3AB71D15F0","createtime":"2018-01-25T19:13:13","email":null,"fans":null,"follow":null,"gender":null,"icon":null,"latitude":null,"longitude":null,"mobile":"15011419855","money":null,"nickname":"叫我博哥好吗！","password":"8F669074CAF5513351A2DE5CC22AC04C","praiseNum":null,"token":"C4142E2E1ED19EFA8F0C3EFAF5EA7473","uid":2952,"userId":null,"username":"15011419855"}]
     */

    private String msg;
    private String code;
    private List<DataBean> data;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * age : null
         * appkey : 3ab1e6ea58b8ca73
         * appsecret : 92A8C830AD52D68E76769219A379C551
         * createtime : 2018-01-25T11:38:43
         * email : null
         * fans : null
         * follow : null
         * gender : null
         * icon : null
         * latitude : null
         * longitude : null
         * mobile : 17698765432
         * money : null
         * nickname : 叫我飞哥好吗!
         * password : 8F669074CAF5513351A2DE5CC22AC04C
         * praiseNum : null
         * token : A5EF0CC17B44D0BDEBEE6A19497E1D2F
         * uid : 4814
         * userId : null
         * username : 17698765432
         */

        private Object age;
        private String appkey;
        private String appsecret;
        private String createtime;
        private Object email;
        private Object fans;
        private Object follow;
        private Object gender;
        private Object icon;
        private Object latitude;
        private Object longitude;
        private String mobile;
        private Object money;
        private String nickname;
        private String password;
        private Object praiseNum;
        private String token;
        private int uid;
        private Object userId;
        private String username;

        public Object getAge() {
            return age;
        }

        public void setAge(Object age) {
            this.age = age;
        }

        public String getAppkey() {
            return appkey;
        }

        public void setAppkey(String appkey) {
            this.appkey = appkey;
        }

        public String getAppsecret() {
            return appsecret;
        }

        public void setAppsecret(String appsecret) {
            this.appsecret = appsecret;
        }

        public String getCreatetime() {
            return createtime;
        }

        public void setCreatetime(String createtime) {
            this.createtime = createtime;
        }

        public Object getEmail() {
            return email;
        }

        public void setEmail(Object email) {
            this.email = email;
        }

        public Object getFans() {
            return fans;
        }

        public void setFans(Object fans) {
            this.fans = fans;
        }

        public Object getFollow() {
            return follow;
        }

        public void setFollow(Object follow) {
            this.follow = follow;
        }

        public Object getGender() {
            return gender;
        }

        public void setGender(Object gender) {
            this.gender = gender;
        }

        public Object getIcon() {
            return icon;
        }

        public void setIcon(Object icon) {
            this.icon = icon;
        }

        public Object getLatitude() {
            return latitude;
        }

        public void setLatitude(Object latitude) {
            this.latitude = latitude;
        }

        public Object getLongitude() {
            return longitude;
        }

        public void setLongitude(Object longitude) {
            this.longitude = longitude;
        }

        public String getMobile() {
            return mobile;
        }

        public void setMobile(String mobile) {
            this.mobile = mobile;
        }

        public Object getMoney() {
            return money;
        }

        public void setMoney(Object money) {
            this.money = money;
        }

        public String getNickname() {
            return nickname;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public Object getPraiseNum() {
            return praiseNum;
        }

        public void setPraiseNum(Object praiseNum) {
            this.praiseNum = praiseNum;
        }

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }

        public int getUid() {
            return uid;
        }

        public void setUid(int uid) {
            this.uid = uid;
        }

        public Object getUserId() {
            return userId;
        }

        public void setUserId(Object userId) {
            this.userId = userId;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }
    }
}
