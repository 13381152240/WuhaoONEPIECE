package wuhao.bwei.com.wuhaoonepiece.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import wuhao.bwei.com.wuhaoonepiece.R;
import wuhao.bwei.com.wuhaoonepiece.bean.ZhuceBean;
import wuhao.bwei.com.wuhaoonepiece.presenter.ZhucePresenter;

public class ZhuceActivity extends AppCompatActivity implements IZhuceview{

    @BindView(R.id.imageView9)
    ImageView imageView9;
    @BindView(R.id.yi)
    TextView yi;
    @BindView(R.id.numbe)
    EditText numbe;
    @BindView(R.id.passwor)
    EditText passwor;
    @BindView(R.id.zhucebtn)
    Button zhucebtn;
    @BindView(R.id.you)
    TextView you;
    String s,s1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zhuce);
        ButterKnife.bind(this);


    }

    @OnClick({R.id.imageView9, R.id.yi, R.id.zhucebtn, R.id.you})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.imageView9:
                finish();
                overridePendingTransition(R.anim.out_to_left1, R.anim.in_from_right1);
                break;
            case R.id.yi:
                finish();
                break;
            case R.id.zhucebtn:
                s = numbe.getText().toString().trim();
                s1 = passwor.getText().toString().trim();

                //获取p层
                ZhucePresenter zhucePresenter = new ZhucePresenter(this);
                zhucePresenter.getZ(s,s1);

                break;
            case R.id.you:
                final Intent intent = new Intent(ZhuceActivity.this,MainActivity.class);
                startActivity(intent);
                break;
        }
    }

    @Override
    public void getZhu(ZhuceBean zhuceBean) {
        if(zhuceBean.getMsg().equals("注册成功")){
            Toast.makeText(ZhuceActivity.this,zhuceBean.getMsg(),Toast.LENGTH_SHORT).show();
            finish();
        }else{
            Toast.makeText(ZhuceActivity.this,zhuceBean.getMsg(),Toast.LENGTH_SHORT).show();
        }




    }
}
