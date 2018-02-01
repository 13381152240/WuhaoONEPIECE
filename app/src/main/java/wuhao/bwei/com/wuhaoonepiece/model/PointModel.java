package wuhao.bwei.com.wuhaoonepiece.model;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import wuhao.bwei.com.wuhaoonepiece.bean.PointBean;
import wuhao.bwei.com.wuhaoonepiece.netWork.OnNetListine;
import wuhao.bwei.com.wuhaoonepiece.netWork.RetrofitHolder;

/**
 * Created by alienware on 2018/1/27.
 */

public class PointModel {
    public void getpoin(String wid,final OnNetListine<PointBean> onNetListine){
        RetrofitHolder.getApi().point(wid)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<PointBean>() {
                    @Override
                    public void accept(PointBean pointBean) throws Exception {
                        onNetListine.onSucc(pointBean);
                    }
                });


    }



}
