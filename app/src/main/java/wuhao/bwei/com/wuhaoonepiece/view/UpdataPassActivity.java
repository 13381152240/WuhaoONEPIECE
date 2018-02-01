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
import wuhao.bwei.com.wuhaoonepiece.bean.UpdataPassBean;
import wuhao.bwei.com.wuhaoonepiece.presenter.UpdataPresenter;

public class UpdataPassActivity extends AppCompatActivity implements Iupdataview {

    @BindView(R.id.imageView7)
    ImageView imageView7;
    @BindView(R.id.yijing)
    TextView yijing;
    @BindView(R.id.pass)
    EditText pass;
    @BindView(R.id.passs)
    EditText passs;
    @BindView(R.id.finish)
    Button finish;
    @BindView(R.id.zhijie)
    TextView zhijie;
    String uid;
    String oldPassword;
    String newPassword;
    @BindView(R.id.iduser)
    EditText iduser;
    @BindView(R.id.oldpass)
    EditText oldpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_updata_pass);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.imageView7, R.id.yijing, R.id.finish, R.id.zhijie})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.imageView7:
                finish();
                break;
            case R.id.yijing:
                final Intent intent = new Intent(UpdataPassActivity.this, LoginActivity.class);
                startActivity(intent);
                break;
            case R.id.finish:
                uid = iduser.getText().toString().trim();
                oldPassword = oldpass.getText().toString().trim();
                newPassword = pass.getText().toString().trim();

                UpdataPresenter updataPresenter = new UpdataPresenter(this);
                updataPresenter.getUpda(uid,oldPassword,newPassword);

                break;
            case R.id.zhijie:
                final Intent intent1 = new Intent(UpdataPassActivity.this, MainActivity.class);
                startActivity(intent1);
                break;
        }
    }

    @Override
    public void getupdata(UpdataPassBean updataPassBean) {
        if(updataPassBean.getMsg().equals("密码修改成功")){
            Toast.makeText(UpdataPassActivity.this,updataPassBean.getMsg(),Toast.LENGTH_SHORT).show();
            final Intent intent = new Intent(UpdataPassActivity.this,LoginActivity.class);
            startActivity(intent);

        }else if(pass!=passs){
            Toast.makeText(UpdataPassActivity.this,"两次密码输入不一致",Toast.LENGTH_SHORT).show();
        }else if(iduser==null||oldpass==null||pass==null||passs==null){
            Toast.makeText(UpdataPassActivity.this,"输入框不能为空",Toast.LENGTH_SHORT).show();
        }







    }
}
