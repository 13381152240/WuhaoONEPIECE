package wuhao.bwei.com.wuhaoonepiece.netWork;

/**
 * Created by alienware on 2018/1/22.
 */

public class UrlUtils {
    public static final String HOST = "https://www.zhaoapi.cn/";
    //登录
    public static final String LOGIN="user/login";
    //注册
    public static final String zhuce = "user/reg";
    public static final String LUNBO="ad/getAd";

    //发布
    public static final String Issue="quarter/publishJoke?uid=4212&content=";

    //修改密码
    public static final String UpdataPass = "quarter/resetPass";
    //获取段子
    public static final String getduan = "quarter/getJokes?page=1";
    //获取关注成功
    public static final String getguan = "quarter/getFollowUsers?uid=4212";

    //获取第一页段子
    public static final String oneduan = "quarter/getJokes?page=1";

    //获取热门视频
    public static final String getvideo = "quarter/getVideos?uid=4212&page=1";

    //点赞
    public static final String point = "quarter/praise?uid=4212";

    //獲取主頁
    public static final String zhudd="quarter/getUserVideos?page=1";

    //關注用戶
    public static final String guan="quarter/follow?uid=4212";


}
