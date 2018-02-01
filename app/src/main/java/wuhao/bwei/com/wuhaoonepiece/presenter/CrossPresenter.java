package wuhao.bwei.com.wuhaoonepiece.presenter;

import wuhao.bwei.com.wuhaoonepiece.bean.Issuebean;
import wuhao.bwei.com.wuhaoonepiece.model.CrossModel;
import wuhao.bwei.com.wuhaoonepiece.netWork.OnNetListine;
import wuhao.bwei.com.wuhaoonepiece.view.ICross;

/**
 * Created by alienware on 2018/1/24.
 */

public class CrossPresenter {
    //实例化m层和v层
    ICross iCross;
    CrossModel crossModel;

    public CrossPresenter(ICross iCross) {
        this.iCross = iCross;
        crossModel = new CrossModel();
    }

    public void getcro(String content){
        crossModel.getCros(content, new OnNetListine<Issuebean>() {
            @Override
            public void onSucc(Issuebean issuebean) {
                iCross.getIcross(issuebean);
            }

            @Override
            public void onFail(String str) {

            }
        });


    }




}
