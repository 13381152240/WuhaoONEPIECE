package wuhao.bwei.com.wuhaoonepiece.presenter;

import wuhao.bwei.com.wuhaoonepiece.bean.ZhuceBean;
import wuhao.bwei.com.wuhaoonepiece.model.ZhuceModel;
import wuhao.bwei.com.wuhaoonepiece.netWork.OnNetListine;
import wuhao.bwei.com.wuhaoonepiece.view.IZhuceview;

/**
 * Created by alienware on 2018/1/23.
 */

public class ZhucePresenter {
    //实例化v层和m层
    IZhuceview iZhuceview;
    ZhuceModel zhuceModel;

    public ZhucePresenter(IZhuceview iZhuceview) {
        this.iZhuceview = iZhuceview;
        zhuceModel = new ZhuceModel();
    }

    public void getZ(String mobile,String password){
        zhuceModel.getZh(mobile, password, new OnNetListine<ZhuceBean>() {
            @Override
            public void onSucc(ZhuceBean zhuceBean) {
                iZhuceview.getZhu(zhuceBean);
            }

            @Override
            public void onFail(String str) {

            }
        });

    }



}
