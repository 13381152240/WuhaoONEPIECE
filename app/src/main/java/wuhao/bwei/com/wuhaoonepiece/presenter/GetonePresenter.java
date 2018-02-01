package wuhao.bwei.com.wuhaoonepiece.presenter;

import wuhao.bwei.com.wuhaoonepiece.bean.OneDuanBean;
import wuhao.bwei.com.wuhaoonepiece.model.GetoneModel;
import wuhao.bwei.com.wuhaoonepiece.netWork.OnNetListine;
import wuhao.bwei.com.wuhaoonepiece.view.IGetOne;

/**
 * Created by alienware on 2018/1/25.
 */

public class GetonePresenter {
    //实例化v层和m层
    IGetOne iGetOne;
    GetoneModel getoneModel;

    public GetonePresenter(IGetOne iGetOne) {
        this.iGetOne = iGetOne;
        getoneModel = new GetoneModel();
    }

    public void geto(){
        getoneModel.geton(new OnNetListine<OneDuanBean>() {
            @Override
            public void onSucc(OneDuanBean oneDuanBean) {
                iGetOne.getone(oneDuanBean);
            }

            @Override
            public void onFail(String str) {

            }
        });


    }



}
