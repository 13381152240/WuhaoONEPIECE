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
import wuhao.bwei.com.wuhaoonepiece.bean.LoginBean;
import wuhao.bwei.com.wuhaoonepiece.bean.LunBoBean;
import wuhao.bwei.com.wuhaoonepiece.presenter.AllPresenter;

public class LoginActivity extends AppCompatActivity implements IBanner{

    @BindView(R.id.imageView4)
    ImageView imageView4;
    @BindView(R.id.zhuceid)
    TextView zhuceid;
    @BindView(R.id.number)
    EditText number;
    @BindView(R.id.password)
    EditText password;
    @BindView(R.id.Llogin)
    Button Llogin;
    @BindView(R.id.forget)
    TextView forget;
    @BindView(R.id.youke)
    TextView youke;
    private String s;
    private String s1;
    private AllPresenter allPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.imageView4, R.id.zhuceid,R.id.Llogin, R.id.forget, R.id.youke})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.imageView4:
                finish();
                overridePendingTransition(R.anim.out_to_left1, R.anim.in_from_right1);

                break;
            case R.id.zhuceid:
                final Intent intent2 = new Intent(LoginActivity.this,ZhuceActivity.class);
                startActivity(intent2);
                overridePendingTransition(R.anim.in_from_right,R.anim.out_to_left);

                break;
            case R.id.Llogin:
                //登陆,获取输入框的值,然后实例化p层
                s = number.getText().toString().trim();
                s1 = password.getText().toString().trim();
                allPresenter = new AllPresenter(this);
                allPresenter.getL(s,s1);

                break;
            case R.id.forget:
                final Intent intent1 = new Intent(LoginActivity.this,YanZhengActivity.class);
                startActivity(intent1);
                break;
            case R.id.youke:
                final Intent intent = new Intent(LoginActivity.this,MainActivity.class);
                startActivity(intent);
                break;
        }
    }

    @Override
    public void GetBanner(LunBoBean lunBoBean) {

    }

    @Override
    public void getLog(LoginBean loginBean) {
        //判断登陆接口中的msg值
        if(loginBean.getMsg().equals("登录成功")){
            Toast.makeText(this,loginBean.getMsg(),Toast.LENGTH_SHORT).show();
            final Intent intent = new Intent(LoginActivity.this,MainActivity.class);
            startActivity(intent);

        }else if(s==null||s1==null){
            Toast.makeText(LoginActivity.this,"用户名或密码不能为空",Toast.LENGTH_SHORT).show();

        }else{
            Toast.makeText(LoginActivity.this,"登陆失败",Toast.LENGTH_SHORT).show();
        }


    }
}
