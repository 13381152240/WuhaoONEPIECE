package wuhao.bwei.com.wuhaoonepiece.model;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import wuhao.bwei.com.wuhaoonepiece.bean.ZhuceBean;
import wuhao.bwei.com.wuhaoonepiece.netWork.OnNetListine;
import wuhao.bwei.com.wuhaoonepiece.netWork.RetrofitHolder;

/**
 * Created by alienware on 2018/1/23.
 */

public class ZhuceModel {
    public void getZh(String mobile, String password, final OnNetListine<ZhuceBean> onNetListine){
        RetrofitHolder.getApi().zhuce(mobile,password)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<ZhuceBean>() {
                    @Override
                    public void accept(ZhuceBean zhuceBean) throws Exception {
                        onNetListine.onSucc(zhuceBean);
                    }
                });


    }


}
