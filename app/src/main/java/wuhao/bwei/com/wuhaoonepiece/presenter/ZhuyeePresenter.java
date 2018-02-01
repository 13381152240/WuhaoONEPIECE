package wuhao.bwei.com.wuhaoonepiece.presenter;

import wuhao.bwei.com.wuhaoonepiece.bean.ZhuyeeBean;
import wuhao.bwei.com.wuhaoonepiece.model.ZhuyeeModel;
import wuhao.bwei.com.wuhaoonepiece.netWork.OnNetListine;
import wuhao.bwei.com.wuhaoonepiece.view.Izhuyee;

/**
 * Created by alienware on 2018/1/27.
 */

public class ZhuyeePresenter {
    Izhuyee izhuyee;
    ZhuyeeModel zhuyeeModel;

    public ZhuyeePresenter(Izhuyee izhuyee) {
        this.izhuyee = izhuyee;
        zhuyeeModel = new ZhuyeeModel();
    }

    public void getzhuy(String uid){
        zhuyeeModel.getzhuye(uid, new OnNetListine<ZhuyeeBean>() {
            @Override
            public void onSucc(ZhuyeeBean zhuyeeBean) {
                izhuyee.getzhuyee(zhuyeeBean);
            }

            @Override
            public void onFail(String str) {

            }
        });


    }


}
