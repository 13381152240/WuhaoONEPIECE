package wuhao.bwei.com.wuhaoonepiece.presenter;

import wuhao.bwei.com.wuhaoonepiece.bean.LoginBean;
import wuhao.bwei.com.wuhaoonepiece.bean.LunBoBean;
import wuhao.bwei.com.wuhaoonepiece.model.AllModel;
import wuhao.bwei.com.wuhaoonepiece.netWork.OnNetListine;
import wuhao.bwei.com.wuhaoonepiece.view.IBanner;

/**
 * Created by alienware on 2018/1/22.
 */

public class AllPresenter {

    //实例化m层和v层
    private IBanner iBanner;
    private AllModel allModel;

    public AllPresenter(IBanner iBanner) {
        this.iBanner = iBanner;
        allModel = new AllModel();
    }



    public void Getbanner(){
        allModel.getBanner(new OnNetListine<LunBoBean>() {
            @Override
            public void onSucc(LunBoBean lunBoBean) {
                iBanner.GetBanner(lunBoBean);
            }

            @Override
            public void onFail(String str) {

            }
        });


    }

    public void getL(String mobile,String password){
        allModel.getLo(mobile, password, new OnNetListine<LoginBean>() {
            @Override
            public void onSucc(LoginBean loginBean) {
               iBanner.getLog(loginBean);
            }

            @Override
            public void onFail(String str) {

            }
        });


    }




}
