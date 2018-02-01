package wuhao.bwei.com.wuhaoonepiece.presenter;

import wuhao.bwei.com.wuhaoonepiece.bean.TrembleBean;
import wuhao.bwei.com.wuhaoonepiece.model.GetrightModel;
import wuhao.bwei.com.wuhaoonepiece.netWork.OnNetListine;
import wuhao.bwei.com.wuhaoonepiece.view.IRightLun;

/**
 * Created by alienware on 2018/1/25.
 */

public class GetrightPresenter {
    //实例化v层和p层
    IRightLun iRightLun;
    GetrightModel getrightModel;

    public GetrightPresenter(IRightLun iRightLun) {
        this.iRightLun = iRightLun;
        getrightModel = new GetrightModel();
    }

    public void getrigh(){
        getrightModel.getrigh(new OnNetListine<TrembleBean>() {
            @Override
            public void onSucc(TrembleBean trembleBean) {
                iRightLun.getright(trembleBean);
            }

            @Override
            public void onFail(String str) {

            }
        });


    }



}
