package wuhao.bwei.com.wuhaoonepiece.netWork;

import io.reactivex.Flowable;
import retrofit2.http.GET;
import retrofit2.http.Query;
import wuhao.bwei.com.wuhaoonepiece.bean.GetDuanBean;
import wuhao.bwei.com.wuhaoonepiece.bean.GuanBean;
import wuhao.bwei.com.wuhaoonepiece.bean.GuanzhuBean;
import wuhao.bwei.com.wuhaoonepiece.bean.HotdeoBean;
import wuhao.bwei.com.wuhaoonepiece.bean.Issuebean;
import wuhao.bwei.com.wuhaoonepiece.bean.LoginBean;
import wuhao.bwei.com.wuhaoonepiece.bean.LunBoBean;
import wuhao.bwei.com.wuhaoonepiece.bean.OneDuanBean;
import wuhao.bwei.com.wuhaoonepiece.bean.PointBean;
import wuhao.bwei.com.wuhaoonepiece.bean.UpdataPassBean;
import wuhao.bwei.com.wuhaoonepiece.bean.ZhuceBean;
import wuhao.bwei.com.wuhaoonepiece.bean.ZhuyeeBean;

/**
 * Created by alienware on 2018/1/22.
 */

public interface ServesApi {
    //登录
    @GET(UrlUtils.LOGIN)
    Flowable<LoginBean> login(@Query("mobile") String mo, @Query("password") String pas);
    //轮播
    @GET(UrlUtils.LUNBO)
    Flowable<LunBoBean> lunbo();
    //注册账号
    @GET(UrlUtils.zhuce)
    Flowable<ZhuceBean> zhuce(@Query("mobile") String mo, @Query("password") String pas);
    //发布段子
    @GET(UrlUtils.Issue)
    Flowable<Issuebean> issue(@Query("content") String content);
    //修改密码
    @GET(UrlUtils.UpdataPass)
    Flowable<UpdataPassBean> updata(@Query("uid") String uid,@Query("oldPassword")String oldPassword,@Query("newPassword")String newPassword);
    //获取段子
    @GET(UrlUtils.getduan)
    Flowable<GetDuanBean> getduan();
    //获取关注
    @GET(UrlUtils.getguan)
    Flowable<GuanzhuBean> guanzhu();

    //获取第一页段子
    @GET(UrlUtils.oneduan)
    Flowable<OneDuanBean> oneduan();

    //获取热门视频
    @GET(UrlUtils.getvideo)
    Flowable<HotdeoBean> getvideo();

    //点赞
    @GET(UrlUtils.point)
    Flowable<PointBean> point(@Query("wid") String wid);

    //主頁
    @GET(UrlUtils.zhudd)
    Flowable<ZhuyeeBean> zhuyee(@Query("uid") String uid);

    //關注
    @GET(UrlUtils.guan)
    Flowable<GuanBean> guang(@Query("followId")String followId);

}
