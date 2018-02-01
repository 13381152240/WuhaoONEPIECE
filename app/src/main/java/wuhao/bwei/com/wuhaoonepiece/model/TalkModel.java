package wuhao.bwei.com.wuhaoonepiece.model;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import wuhao.bwei.com.wuhaoonepiece.bean.GetDuanBean;
import wuhao.bwei.com.wuhaoonepiece.netWork.OnNetListine;
import wuhao.bwei.com.wuhaoonepiece.netWork.RetrofitHolder;

/**
 * Created by alienware on 2018/1/24.
 */

public class TalkModel {
    public void getdua(final OnNetListine<GetDuanBean> onNetListine){
        RetrofitHolder.getApi().getduan()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<GetDuanBean>() {
                    @Override
                    public void accept(GetDuanBean getDuanBean) throws Exception {
                        onNetListine.onSucc(getDuanBean);
                    }
                });


    }


}
