package wuhao.bwei.com.wuhaoonepiece.presenter;

import wuhao.bwei.com.wuhaoonepiece.bean.PointBean;
import wuhao.bwei.com.wuhaoonepiece.model.PointModel;
import wuhao.bwei.com.wuhaoonepiece.netWork.OnNetListine;
import wuhao.bwei.com.wuhaoonepiece.view.IPoint;

/**
 * Created by alienware on 2018/1/27.
 */

public class PointPresenter {
    //实例化v层和m层
    IPoint iPoint;
    PointModel pointModel;

    public PointPresenter(IPoint iPoint) {
        this.iPoint = iPoint;
        pointModel = new PointModel();
    }

    public void getpoi(String wid){
        pointModel.getpoin(wid,new OnNetListine<PointBean>() {
            @Override
            public void onSucc(PointBean pointBean) {
                iPoint.getpoint(pointBean);
            }

            @Override
            public void onFail(String str) {

            }
        });



    }


}
