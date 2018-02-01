package wuhao.bwei.com.wuhaoonepiece.view;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by alienware on 2018/1/22.
 */

public abstract class BaseActivity extends AppCompatActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(bindLayout());
        initView();
        initData();
        bindEvent();

    }

    //绑定布局的方法
    public abstract int bindLayout();
    //绑定组件的方法
    protected abstract void initView();
    //操作数据的方法
    protected abstract void initData();
    //设置监听的方法
    protected abstract void bindEvent();

    protected  < T extends View> T bindView(int resId){
        return (T) findViewById(resId);
    }


}
