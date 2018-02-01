package wuhao.bwei.com.wuhaoonepiece.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import wuhao.bwei.com.wuhaoonepiece.R;
import wuhao.bwei.com.wuhaoonepiece.adapter.GuanAdapter;
import wuhao.bwei.com.wuhaoonepiece.bean.GuanzhuBean;
import wuhao.bwei.com.wuhaoonepiece.presenter.GuanPresenter;

public class MyguanActivity extends AppCompatActivity implements Iguanzhu {

    @BindView(R.id.rvv)
    RecyclerView rvv;
    @BindView(R.id.imageView11)
    ImageView imageView11;
    @BindView(R.id.hotguanid)
    TextView hotguanid;
    private GuanAdapter guanAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myguan);
        ButterKnife.bind(this);
        rvv.setLayoutManager(new LinearLayoutManager(this));
        //实例化p层
        GuanPresenter guanPresenter = new GuanPresenter(this);
        guanPresenter.getgu();


    }

    @Override
    public void getguanzhu(GuanzhuBean guanzhuBean) {
        guanAdapter = new GuanAdapter(MyguanActivity.this, guanzhuBean.getData());
        rvv.setAdapter(guanAdapter);

    }

    @OnClick({R.id.imageView11, R.id.hotguanid})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.imageView11:
                finish();
                break;
            case R.id.hotguanid:

                break;
        }
    }
}
