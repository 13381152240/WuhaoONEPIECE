package wuhao.bwei.com.wuhaoonepiece.netWork;

/**
 * Created by alienware on 2018/1/22.
 */

public interface OnNetListine<T> {
    void onSucc(T t);
    void onFail(String str);
}
