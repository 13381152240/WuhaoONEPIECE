package wuhao.bwei.com.wuhaoonepiece.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import wuhao.bwei.com.wuhaoonepiece.R;
import wuhao.bwei.com.wuhaoonepiece.bean.Issuebean;
import wuhao.bwei.com.wuhaoonepiece.presenter.CrossPresenter;

public class CrossActivity extends AppCompatActivity implements ICross{

    @BindView(R.id.quxiao)
    TextView quxiao;
    @BindView(R.id.fabiao)
    TextView fabiao;
    @BindView(R.id.text_tt)
    EditText textTt;
    private String content;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cross);
        ButterKnife.bind(this);



    }

    @OnClick({R.id.quxiao, R.id.fabiao})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.quxiao:
                finish();
                break;
            case R.id.fabiao:
                content = textTt.getText().toString().trim();
                //实例化p层
                CrossPresenter crossPresenter = new CrossPresenter(this);
                crossPresenter.getcro(content);

                break;
        }
    }

    @Override
    public void getIcross(Issuebean issuebean) {
        if(issuebean.getMsg().equals("发布成功")){
            Toast.makeText(CrossActivity.this,issuebean.getMsg(),Toast.LENGTH_SHORT).show();final Intent intent = new Intent(CrossActivity.this,CrossSuccessActivity.class);
            startActivity(intent);

        }else if(textTt==null){
            Toast.makeText(CrossActivity.this,"内容不能为空",Toast.LENGTH_SHORT).show();

        }else{
            Toast.makeText(CrossActivity.this,issuebean.getMsg(),Toast.LENGTH_SHORT).show();
        }



    }
}
