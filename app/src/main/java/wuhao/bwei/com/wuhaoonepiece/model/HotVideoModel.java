package wuhao.bwei.com.wuhaoonepiece.model;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import wuhao.bwei.com.wuhaoonepiece.bean.HotdeoBean;
import wuhao.bwei.com.wuhaoonepiece.netWork.OnNetListine;
import wuhao.bwei.com.wuhaoonepiece.netWork.RetrofitHolder;

/**
 * Created by alienware on 2018/1/26.
 */

public class HotVideoModel {
    public void gethotvide(final OnNetListine<HotdeoBean> onNetListine){
        RetrofitHolder.getApi().getvideo()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<HotdeoBean>() {
                    @Override
                    public void accept(HotdeoBean hotdeoBean) throws Exception {
                        onNetListine.onSucc(hotdeoBean);
                    }
                });



    }



}
