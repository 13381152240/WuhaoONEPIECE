package wuhao.bwei.com.wuhaoonepiece.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import wuhao.bwei.com.wuhaoonepiece.R;

public class LoginyeActivity extends AppCompatActivity {

    @BindView(R.id.logintext)
    TextView logintext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginye);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.logintext)
    public void onViewClicked() {
        final Intent intent = new Intent(LoginyeActivity.this,LoginActivity.class);

        startActivity(intent);
        overridePendingTransition(R.anim.in_from_right,R.anim.out_to_left);


    }
}
