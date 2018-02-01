package wuhao.bwei.com.wuhaoonepiece.model;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import wuhao.bwei.com.wuhaoonepiece.bean.Issuebean;
import wuhao.bwei.com.wuhaoonepiece.netWork.OnNetListine;
import wuhao.bwei.com.wuhaoonepiece.netWork.RetrofitHolder;

/**
 * Created by alienware on 2018/1/24.
 */

public class CrossModel {
    public void getCros(String content, final OnNetListine<Issuebean> onNetListine){
        RetrofitHolder.getApi().issue(content)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<Issuebean>() {
                    @Override
                    public void accept(Issuebean issuebean) throws Exception {
                        onNetListine.onSucc(issuebean);
                    }
                });

    }


}
