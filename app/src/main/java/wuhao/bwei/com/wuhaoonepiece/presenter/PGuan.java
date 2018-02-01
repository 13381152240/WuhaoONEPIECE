package wuhao.bwei.com.wuhaoonepiece.presenter;

import wuhao.bwei.com.wuhaoonepiece.bean.GuanBean;
import wuhao.bwei.com.wuhaoonepiece.model.MGuan;
import wuhao.bwei.com.wuhaoonepiece.netWork.OnNetListine;
import wuhao.bwei.com.wuhaoonepiece.view.IGuan;

/**
 * Created by alienware on 2018/1/28.
 */

public class PGuan {
    IGuan iGuan;
    MGuan mGuan;

    public PGuan(IGuan iGuan) {
        this.iGuan = iGuan;
        mGuan = new MGuan();
    }

    public void getgu(String followId){
        mGuan.getgua(followId, new OnNetListine<GuanBean>() {
            @Override
            public void onSucc(GuanBean guanBean) {
                iGuan.getguan(guanBean);
            }

            @Override
            public void onFail(String str) {

            }
        });


    }



}
