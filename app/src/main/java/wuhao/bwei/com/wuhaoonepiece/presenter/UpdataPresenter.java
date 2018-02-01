package wuhao.bwei.com.wuhaoonepiece.presenter;

import wuhao.bwei.com.wuhaoonepiece.bean.UpdataPassBean;
import wuhao.bwei.com.wuhaoonepiece.model.UpdataModel;
import wuhao.bwei.com.wuhaoonepiece.netWork.OnNetListine;
import wuhao.bwei.com.wuhaoonepiece.view.Iupdataview;

/**
 * Created by alienware on 2018/1/23.
 */

public class UpdataPresenter {
    //实例化p层和m层
    private Iupdataview iupdataview;
    private UpdataModel updataModel;

    public UpdataPresenter(Iupdataview iupdataview) {
        this.iupdataview = iupdataview;
        updataModel = new UpdataModel();
    }

    public void getUpda(String uid, String oldPassword, String newPassword){
        updataModel.updatapass(uid, oldPassword, newPassword, new OnNetListine<UpdataPassBean>() {
            @Override
            public void onSucc(UpdataPassBean updataPassBean) {
                iupdataview.getupdata(updataPassBean);
            }

            @Override
            public void onFail(String str) {

            }
        });

    }



}
