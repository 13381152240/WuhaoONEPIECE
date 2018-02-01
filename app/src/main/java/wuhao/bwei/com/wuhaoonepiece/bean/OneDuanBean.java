package wuhao.bwei.com.wuhaoonepiece.bean;

import java.util.List;

/**
 * Created by alienware on 2018/1/25.
 */

public class OneDuanBean {

    /**
     * msg : 获取段子列表成功
     * code : 0
     * data : [{"commentNum":null,"content":"李少奇","createTime":"2018-01-25T20:41:40","imgUrls":null,"jid":1176,"praiseNum":null,"shareNum":null,"uid":2825,"user":{"age":null,"fans":"null","follow":false,"icon":null,"nickname":"淘宝","praiseNum":"null"}},{"commentNum":null,"content":"。。。。。。。。。。。。。。","createTime":"2018-01-25T20:27:24","imgUrls":null,"jid":1175,"praiseNum":null,"shareNum":null,"uid":1600,"user":{"age":null,"fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/151575551828852d4ae27f2029.jpg","nickname":"哈哈哈","praiseNum":"null"}},{"commentNum":null,"content":"123456","createTime":"2018-01-25T20:21:45","imgUrls":null,"jid":1174,"praiseNum":null,"shareNum":null,"uid":2856,"user":{"age":null,"fans":"null","follow":false,"icon":null,"nickname":"123","praiseNum":"null"}},{"commentNum":null,"content":"陈大屌","createTime":"2018-01-25T20:07:48","imgUrls":null,"jid":1173,"praiseNum":null,"shareNum":null,"uid":5408,"user":{"age":null,"fans":"null","follow":false,"icon":null,"nickname":null,"praiseNum":"null"}},{"commentNum":null,"content":"猪上天了！！！！","createTime":"2018-01-25T20:05:56","imgUrls":null,"jid":1172,"praiseNum":null,"shareNum":null,"uid":2825,"user":{"age":null,"fans":"null","follow":false,"icon":null,"nickname":"淘宝","praiseNum":"null"}},{"commentNum":null,"content":"呵呵  晚上 好","createTime":"2018-01-25T20:05:54","imgUrls":null,"jid":1171,"praiseNum":null,"shareNum":null,"uid":2322,"user":{"age":null,"fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/15162436520281516243653081.png","nickname":null,"praiseNum":"null"}},{"commentNum":null,"content":"哈哈  晚上 好","createTime":"2018-01-25T20:05:12","imgUrls":null,"jid":1170,"praiseNum":null,"shareNum":null,"uid":2322,"user":{"age":null,"fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/15162436520281516243653081.png","nickname":null,"praiseNum":"null"}},{"commentNum":null,"content":"六家军上刺刀","createTime":"2018-01-25T19:02:42","imgUrls":null,"jid":1169,"praiseNum":null,"shareNum":null,"uid":2924,"user":{"age":null,"fans":"null","follow":false,"icon":null,"nickname":null,"praiseNum":"null"}},{"commentNum":null,"content":"老六","createTime":"2018-01-25T18:59:45","imgUrls":null,"jid":1168,"praiseNum":null,"shareNum":null,"uid":2924,"user":{"age":null,"fans":"null","follow":false,"icon":null,"nickname":null,"praiseNum":"null"}},{"commentNum":null,"content":"你好世界你好世界","createTime":"2018-01-25T18:56:55","imgUrls":null,"jid":1167,"praiseNum":null,"shareNum":null,"uid":1701,"user":{"age":null,"fans":"null","follow":false,"icon":null,"nickname":null,"praiseNum":"null"}}]
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
         * commentNum : null
         * content : 李少奇
         * createTime : 2018-01-25T20:41:40
         * imgUrls : null
         * jid : 1176
         * praiseNum : null
         * shareNum : null
         * uid : 2825
         * user : {"age":null,"fans":"null","follow":false,"icon":null,"nickname":"淘宝","praiseNum":"null"}
         */

        private Object commentNum;
        private String content;
        private String createTime;
        private Object imgUrls;
        private int jid;
        private Object praiseNum;
        private Object shareNum;
        private int uid;
        private UserBean user;

        public Object getCommentNum() {
            return commentNum;
        }

        public void setCommentNum(Object commentNum) {
            this.commentNum = commentNum;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getCreateTime() {
            return createTime;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public Object getImgUrls() {
            return imgUrls;
        }

        public void setImgUrls(Object imgUrls) {
            this.imgUrls = imgUrls;
        }

        public int getJid() {
            return jid;
        }

        public void setJid(int jid) {
            this.jid = jid;
        }

        public Object getPraiseNum() {
            return praiseNum;
        }

        public void setPraiseNum(Object praiseNum) {
            this.praiseNum = praiseNum;
        }

        public Object getShareNum() {
            return shareNum;
        }

        public void setShareNum(Object shareNum) {
            this.shareNum = shareNum;
        }

        public int getUid() {
            return uid;
        }

        public void setUid(int uid) {
            this.uid = uid;
        }

        public UserBean getUser() {
            return user;
        }

        public void setUser(UserBean user) {
            this.user = user;
        }

        public static class UserBean {
            /**
             * age : null
             * fans : null
             * follow : false
             * icon : null
             * nickname : 淘宝
             * praiseNum : null
             */

            private Object age;
            private String fans;
            private boolean follow;
            private Object icon;
            private String nickname;
            private String praiseNum;

            public Object getAge() {
                return age;
            }

            public void setAge(Object age) {
                this.age = age;
            }

            public String getFans() {
                return fans;
            }

            public void setFans(String fans) {
                this.fans = fans;
            }

            public boolean isFollow() {
                return follow;
            }

            public void setFollow(boolean follow) {
                this.follow = follow;
            }

            public Object getIcon() {
                return icon;
            }

            public void setIcon(Object icon) {
                this.icon = icon;
            }

            public String getNickname() {
                return nickname;
            }

            public void setNickname(String nickname) {
                this.nickname = nickname;
            }

            public String getPraiseNum() {
                return praiseNum;
            }

            public void setPraiseNum(String praiseNum) {
                this.praiseNum = praiseNum;
            }
        }
    }
}
