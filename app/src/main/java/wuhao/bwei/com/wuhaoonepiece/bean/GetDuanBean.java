package wuhao.bwei.com.wuhaoonepiece.bean;

import java.util.List;

/**
 * Created by alienware on 2018/1/24.
 */

public class GetDuanBean {

    /**
     * msg : 获取段子列表成功
     * code : 0
     * data : [{"commentNum":null,"content":"111","createTime":"2017-12-10T21:12:19","imgUrls":"https://www.zhaoapi.cn/images/quarter/1512911539881image.jpg","jid":897,"praiseNum":null,"shareNum":null,"uid":3028,"user":{"age":null,"fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/1513148630412image.jpg","nickname":"14","praiseNum":"null"}},{"commentNum":null,"content":"Android工程师是指从事Android移动应用操作系统、游戏和各种Android平台功能的应用、 以手机开发为主要对象，包括但不限于手机操作系统、手机游戏、手机其他多种功能的开发和优化人员。Android工程师是移动应用开发者，希望将自己的应用移植到该平台上或者在该平台上开发应用。","createTime":"2017-12-10T18:44:12","imgUrls":null,"jid":896,"praiseNum":null,"shareNum":null,"uid":185,"user":{"age":null,"fans":"null","follow":false,"icon":"http://120.27.23.105/images/185.jpg","nickname":"我是小雷锋","praiseNum":"null"}},{"commentNum":null,"content":"有人问我：你们在郑州的人凭什么那么牛逼？我默默的深吸了一口气 ，微笑着看了看他，他不服，硬要学我，也深吸了一口气，享年18岁。","createTime":"2017-12-09T11:24:42","imgUrls":null,"jid":895,"praiseNum":null,"shareNum":null,"uid":77,"user":{"age":null,"fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/1512203571490dsf.jpg","nickname":"若水","praiseNum":"null"}},{"commentNum":null,"content":"刷屏！！！！！","createTime":"2017-12-08T18:47:52","imgUrls":null,"jid":894,"praiseNum":null,"shareNum":null,"uid":114,"user":{"age":null,"fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/1514361647822007.jpg","nickname":"linnnn","praiseNum":"null"}},{"commentNum":null,"content":"我只是个幼儿园毕业十几年的孩子  为什么我要面对这么多","createTime":"2017-12-08T18:22:22","imgUrls":"https://www.zhaoapi.cn/images/quarter/15127285424591512728506599.jpeg","jid":893,"praiseNum":null,"shareNum":null,"uid":114,"user":{"age":null,"fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/1514361647822007.jpg","nickname":"linnnn","praiseNum":"null"}},{"commentNum":null,"content":"我只是个幼儿园毕业十几年的孩子  为什么我要面对这么多","createTime":"2017-12-08T18:22:22","imgUrls":"https://www.zhaoapi.cn/images/quarter/15127285422561512728506599.jpeg","jid":892,"praiseNum":null,"shareNum":null,"uid":114,"user":{"age":null,"fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/1514361647822007.jpg","nickname":"linnnn","praiseNum":"null"}},{"commentNum":null,"content":"警察蜀黍，我的开心走丢了，你能帮我找找吗？","createTime":"2017-12-08T18:17:25","imgUrls":"https://www.zhaoapi.cn/images/quarter/1512728245225null2699ab318be9bc9c.jpg","jid":891,"praiseNum":null,"shareNum":null,"uid":114,"user":{"age":null,"fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/1514361647822007.jpg","nickname":"linnnn","praiseNum":"null"}},{"commentNum":null,"content":"警察蜀黍，我的开心走丢了，你能帮我找找吗？","createTime":"2017-12-08T18:17:24","imgUrls":"https://www.zhaoapi.cn/images/quarter/1512728244334null2699ab318be9bc9c.jpg","jid":890,"praiseNum":null,"shareNum":null,"uid":114,"user":{"age":null,"fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/1514361647822007.jpg","nickname":"linnnn","praiseNum":"null"}},{"commentNum":null,"content":"   早睡身体好，睡晚死的早。","createTime":"2017-12-08T11:54:17","imgUrls":"https://www.zhaoapi.cn/images/quarter/1512705257350239d86f621f7803b.jpg","jid":889,"praiseNum":null,"shareNum":null,"uid":100,"user":{"age":null,"fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/1513057376756head.png","nickname":"我是你爸爸","praiseNum":"null"}},{"commentNum":null,"content":"老子上去就是一狗","createTime":"2017-12-08T11:53:54","imgUrls":"https://www.zhaoapi.cn/images/quarter/1512705234334img-43a39d58gy1fio2ojm25zg20b306rx6p.gif","jid":888,"praiseNum":null,"shareNum":null,"uid":551,"user":{"age":null,"fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/551.jpg","nickname":"_zhang","praiseNum":"null"}}]
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
         * content : 111
         * createTime : 2017-12-10T21:12:19
         * imgUrls : https://www.zhaoapi.cn/images/quarter/1512911539881image.jpg
         * jid : 897
         * praiseNum : null
         * shareNum : null
         * uid : 3028
         * user : {"age":null,"fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/1513148630412image.jpg","nickname":"14","praiseNum":"null"}
         */

        private Object commentNum;
        private String content;
        private String createTime;
        private String imgUrls;
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

        public String getImgUrls() {
            return imgUrls;
        }

        public void setImgUrls(String imgUrls) {
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
             * icon : https://www.zhaoapi.cn/images/1513148630412image.jpg
             * nickname : 14
             * praiseNum : null
             */

            private Object age;
            private String fans;
            private boolean follow;
            private String icon;
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

            public String getIcon() {
                return icon;
            }

            public void setIcon(String icon) {
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

