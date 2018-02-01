package wuhao.bwei.com.wuhaoonepiece.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import wuhao.bwei.com.wuhaoonepiece.R;

public class CrossSuccessActivity extends AppCompatActivity {

    @BindView(R.id.textView7)
    TextView textView7;
    @BindView(R.id.t_qianqu)
    Button tQianqu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cross_success);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.textView7, R.id.t_qianqu})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.textView7:
                finish();
                break;
            case R.id.t_qianqu:
                final Intent intent = new Intent(CrossSuccessActivity.this,MainActivity.class);
                startActivity(intent);

                break;
        }
    }
}
