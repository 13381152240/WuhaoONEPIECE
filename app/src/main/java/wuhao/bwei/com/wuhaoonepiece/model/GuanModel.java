package wuhao.bwei.com.wuhaoonepiece.model;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import wuhao.bwei.com.wuhaoonepiece.bean.GuanzhuBean;
import wuhao.bwei.com.wuhaoonepiece.netWork.OnNetListine;
import wuhao.bwei.com.wuhaoonepiece.netWork.RetrofitHolder;

/**
 * Created by alienware on 2018/1/25.
 */

public class GuanModel {
    public void getgua(final OnNetListine<GuanzhuBean> onNetListine){
        RetrofitHolder.getApi().guanzhu()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<GuanzhuBean>() {
                    @Override
                    public void accept(GuanzhuBean guanzhuBean) throws Exception {
                        onNetListine.onSucc(guanzhuBean);
                    }
                });



    }


}
