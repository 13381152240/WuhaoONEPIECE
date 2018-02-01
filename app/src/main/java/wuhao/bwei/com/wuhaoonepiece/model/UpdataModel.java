package wuhao.bwei.com.wuhaoonepiece.model;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import wuhao.bwei.com.wuhaoonepiece.bean.UpdataPassBean;
import wuhao.bwei.com.wuhaoonepiece.netWork.OnNetListine;
import wuhao.bwei.com.wuhaoonepiece.netWork.RetrofitHolder;

/**
 * Created by alienware on 2018/1/23.
 */

public class UpdataModel {
    public void updatapass(String uid, String oldPassword, String newPassword , final OnNetListine<UpdataPassBean> onNetListine){
        RetrofitHolder.getApi().updata(uid,oldPassword,newPassword)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<UpdataPassBean>() {
                    @Override
                    public void accept(UpdataPassBean updataPassBean) throws Exception {
                        onNetListine.onSucc(updataPassBean);

                    }
                });


    }


}
