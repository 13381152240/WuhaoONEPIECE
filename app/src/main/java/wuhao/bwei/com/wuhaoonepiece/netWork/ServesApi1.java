package wuhao.bwei.com.wuhaoonepiece.netWork;

import io.reactivex.Flowable;
import retrofit2.http.GET;
import wuhao.bwei.com.wuhaoonepiece.bean.TrembleBean;

/**
 * Created by alienware on 2018/1/22.
 */

public interface ServesApi1 {
        //获取段子
    @GET(UrlUtils1.lun)
    Flowable<TrembleBean> getduan();

}
