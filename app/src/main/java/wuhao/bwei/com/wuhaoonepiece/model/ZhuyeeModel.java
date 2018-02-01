package wuhao.bwei.com.wuhaoonepiece.model;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import wuhao.bwei.com.wuhaoonepiece.bean.ZhuyeeBean;
import wuhao.bwei.com.wuhaoonepiece.netWork.OnNetListine;
import wuhao.bwei.com.wuhaoonepiece.netWork.RetrofitHolder;

/**
 * Created by alienware on 2018/1/27.
 */

public class ZhuyeeModel {
    public void getzhuye(String uid, final OnNetListine<ZhuyeeBean> onNetListine){
        RetrofitHolder.getApi().zhuyee(uid)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<ZhuyeeBean>() {
                    @Override
                    public void accept(ZhuyeeBean zhuyeeBean) throws Exception {
                        onNetListine.onSucc(zhuyeeBean);
                    }
                });


    }


}
