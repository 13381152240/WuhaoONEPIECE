package wuhao.bwei.com.wuhaoonepiece.presenter;

import wuhao.bwei.com.wuhaoonepiece.bean.GetDuanBean;
import wuhao.bwei.com.wuhaoonepiece.model.TalkModel;
import wuhao.bwei.com.wuhaoonepiece.netWork.OnNetListine;
import wuhao.bwei.com.wuhaoonepiece.view.ITalk;

/**
 * Created by alienware on 2018/1/24.
 */

public class TalkPresenter {
    //实例化v层和m层
    ITalk iTalk;
    TalkModel talkModel;

    public TalkPresenter(ITalk iTalk) {
        this.iTalk = iTalk;
        talkModel = new TalkModel();
    }

    public void getdu(){
        talkModel.getdua(new OnNetListine<GetDuanBean>() {
            @Override
            public void onSucc(GetDuanBean getDuanBean) {
                iTalk.getduan(getDuanBean);
            }

            @Override
            public void onFail(String str) {

            }
        });


    }



}
