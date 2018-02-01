package wuhao.bwei.com.wuhaoonepiece.model;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import wuhao.bwei.com.wuhaoonepiece.bean.GuanBean;
import wuhao.bwei.com.wuhaoonepiece.netWork.OnNetListine;
import wuhao.bwei.com.wuhaoonepiece.netWork.RetrofitHolder;

/**
 * Created by alienware on 2018/1/28.
 */

public class MGuan {
    public void getgua(String followId, final OnNetListine<GuanBean> onNetListine){
        RetrofitHolder.getApi().guang(followId)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<GuanBean>() {
                    @Override
                    public void accept(GuanBean guanBean) throws Exception {
                        onNetListine.onSucc(guanBean);
                    }
                });

    }

}
