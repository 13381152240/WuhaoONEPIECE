package wuhao.bwei.com.wuhaoonepiece.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import wuhao.bwei.com.wuhaoonepiece.R;

public class IssActivity extends AppCompatActivity {

    @BindView(R.id.fini)
    TextView fini;
    @BindView(R.id.video)
    SimpleDraweeView video;
    @BindView(R.id.cross)
    SimpleDraweeView cross;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iss);
        ButterKnife.bind(this);


    }

    @OnClick(R.id.fini)
    public void onViewClicked() {
        finish();
    }

    @OnClick({R.id.video, R.id.cross})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.video:
                break;
            case R.id.cross:
                final Intent intent = new Intent(IssActivity.this,CrossActivity.class);
                startActivity(intent);

                break;
        }
    }
}
