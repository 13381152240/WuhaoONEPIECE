package wuhao.bwei.com.wuhaoonepiece.model;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import wuhao.bwei.com.wuhaoonepiece.bean.LoginBean;
import wuhao.bwei.com.wuhaoonepiece.bean.LunBoBean;
import wuhao.bwei.com.wuhaoonepiece.netWork.OnNetListine;
import wuhao.bwei.com.wuhaoonepiece.netWork.RetrofitHolder;

/**
 * Created by alienware on 2018/1/22.
 */

public class AllModel {

    public void getBanner(final OnNetListine<LunBoBean> onNetListine){
        RetrofitHolder.getApi().lunbo()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<LunBoBean>() {
                    @Override
                    public void accept(LunBoBean lunBoBean) throws Exception {
                        onNetListine.onSucc(lunBoBean);
                    }
                });


    }

    public void getLo(String mobile, String password, final OnNetListine<LoginBean> onNetListine){
        RetrofitHolder.getApi().login(mobile,password)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<LoginBean>() {
                    @Override
                    public void accept(LoginBean loginBean) throws Exception {
                        onNetListine.onSucc(loginBean);
                    }
                });


    }





}
