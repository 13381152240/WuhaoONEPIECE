package wuhao.bwei.com.wuhaoonepiece.presenter;

import wuhao.bwei.com.wuhaoonepiece.bean.HotdeoBean;
import wuhao.bwei.com.wuhaoonepiece.model.HotVideoModel;
import wuhao.bwei.com.wuhaoonepiece.netWork.OnNetListine;
import wuhao.bwei.com.wuhaoonepiece.view.IHotVideo;

/**
 * Created by alienware on 2018/1/26.
 */

public class HotPresenter {
    //实例化v层和m层
    IHotVideo iHotVideo;
    HotVideoModel hotVideoModel;

    public HotPresenter(IHotVideo iHotVideo) {
        this.iHotVideo = iHotVideo;
        hotVideoModel = new HotVideoModel();
    }

    public void getvid(){

        hotVideoModel.gethotvide(new OnNetListine<HotdeoBean>() {
            @Override
            public void onSucc(HotdeoBean hotdeoBean) {
                iHotVideo.gethotvideo(hotdeoBean);
            }

            @Override
            public void onFail(String str) {

            }
        });

    }


}
