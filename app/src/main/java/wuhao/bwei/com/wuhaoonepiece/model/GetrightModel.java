package wuhao.bwei.com.wuhaoonepiece.model;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import wuhao.bwei.com.wuhaoonepiece.bean.TrembleBean;
import wuhao.bwei.com.wuhaoonepiece.netWork.OnNetListine;
import wuhao.bwei.com.wuhaoonepiece.netWork.RetrofitHolder1;

/**
 * Created by alienware on 2018/1/25.
 */

public class GetrightModel {
    public void getrigh(final OnNetListine<TrembleBean> onNetListine){
        RetrofitHolder1.getApi().getduan()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<TrembleBean>() {
                    @Override
                    public void accept(TrembleBean trembleBean) throws Exception {
                        onNetListine.onSucc(trembleBean);
                    }
                });


    }

}
