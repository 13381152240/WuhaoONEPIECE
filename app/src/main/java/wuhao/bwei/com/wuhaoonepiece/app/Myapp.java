package wuhao.bwei.com.wuhaoonepiece.app;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.mob.MobSDK;

/**
 * Created by alienware on 2018/1/22.
 */

public class Myapp extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);
        MobSDK.init(this,"23a7286818901","04bf56f24f66acca1cc6d31393cb606a");
    }
}
