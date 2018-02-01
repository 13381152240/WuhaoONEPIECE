package wuhao.bwei.com.wuhaoonepiece.presenter;

import wuhao.bwei.com.wuhaoonepiece.bean.GuanzhuBean;
import wuhao.bwei.com.wuhaoonepiece.model.GuanModel;
import wuhao.bwei.com.wuhaoonepiece.netWork.OnNetListine;
import wuhao.bwei.com.wuhaoonepiece.view.Iguanzhu;

/**
 * Created by alienware on 2018/1/25.
 */

public class GuanPresenter {
    //实例化
    Iguanzhu iguanzhu;
    GuanModel guanModel;

    public GuanPresenter(Iguanzhu iguanzhu) {
        this.iguanzhu = iguanzhu;
        guanModel = new GuanModel();
    }
    public void getgu(){
        guanModel.getgua(new OnNetListine<GuanzhuBean>() {
            @Override
            public void onSucc(GuanzhuBean guanzhuBean) {
                iguanzhu.getguanzhu(guanzhuBean);
            }

            @Override
            public void onFail(String str) {

            }
        });


    }

}
