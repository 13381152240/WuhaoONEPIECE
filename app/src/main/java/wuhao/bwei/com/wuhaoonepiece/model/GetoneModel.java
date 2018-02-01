package wuhao.bwei.com.wuhaoonepiece.model;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import wuhao.bwei.com.wuhaoonepiece.bean.OneDuanBean;
import wuhao.bwei.com.wuhaoonepiece.netWork.OnNetListine;
import wuhao.bwei.com.wuhaoonepiece.netWork.RetrofitHolder;

/**
 * Created by alienware on 2018/1/25.
 */

public class GetoneModel {
    public void geton(final OnNetListine<OneDuanBean> oneDuanBeanOnNetListine){
        RetrofitHolder.getApi().oneduan()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<OneDuanBean>() {
                    @Override
                    public void accept(OneDuanBean oneDuanBean) throws Exception {
                        oneDuanBeanOnNetListine.onSucc(oneDuanBean);
                    }
                });


    }


}
