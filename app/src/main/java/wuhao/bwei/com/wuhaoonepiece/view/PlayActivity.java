package wuhao.bwei.com.wuhaoonepiece.view;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import com.facebook.drawee.view.SimpleDraweeView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import wuhao.bwei.com.wuhaoonepiece.R;
import wuhao.bwei.com.wuhaoonepiece.bean.PointBean;
import wuhao.bwei.com.wuhaoonepiece.presenter.PointPresenter;

public class PlayActivity extends AppCompatActivity implements IPoint {

    @BindView(R.id.bofang_fan)
    ImageView bofangFan;
    @BindView(R.id.bofang_aixin)
    ImageView bofangAixin;
    @BindView(R.id.bofang_xinsui)
    ImageView bofangXinsui;
    @BindView(R.id.bofang_fenxiang)
    ImageView bofangFenxiang;
    @BindView(R.id.imageView13)
    SimpleDraweeView imageView13;
    @BindView(R.id.bofang_cont)
    TextView bofangCont;
    @BindView(R.id.bofang_num)
    TextView bofangNum;
    @BindView(R.id.bofang_shijian)
    TextView bofangShijian;
    @BindView(R.id.videovv)
    VideoView videovv;
    private String wid;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        ButterKnife.bind(this);
        final Intent intent = getIntent();
        String videoid = intent.getStringExtra("videoid");
        final String coverr = intent.getStringExtra("coverr");
        final String contentnum = intent.getStringExtra("contentnum");
        final String createtimee = intent.getStringExtra("createtimee");
        wid = intent.getStringExtra("widd");

        bofangCont.setText("视频");
        bofangNum.setText(contentnum);
        bofangShijian.setText(createtimee);
//         View rootView = getLayoutInflater().from(this).inflate(R.layout.simple_player_view_player, null);
//        setContentView(rootView);
//
//        new PlayerView(this)
//                .setTitle("妖王现世")
//                .setScaleType(PlayStateParams.fitparent)
//                .hideMenu(true)
//                .forbidTouch(false)
//                .setPlaySource(videoid)
//                .startPlay();

        videovv.setMediaController(new MediaController(this));
        videovv.setVideoURI(Uri.parse(videoid));
        videovv.start();
        videovv.requestFocus();

    }

    @OnClick({R.id.bofang_fan, R.id.bofang_aixin, R.id.bofang_xinsui, R.id.bofang_fenxiang})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.bofang_fan:
                finish();
                break;
            case R.id.bofang_aixin:
                //实例化p层
                PointPresenter pointPresenter = new PointPresenter(this);
                pointPresenter.getpoi(wid);
                bofangAixin.setImageResource(R.drawable.raw_110);

                break;
            case R.id.bofang_xinsui:
                break;
            case R.id.bofang_fenxiang:
                break;
        }
    }

    @Override
    public void getpoint(PointBean pointBean) {

        if (pointBean.getMsg().equals("已点赞")) {
            Toast.makeText(PlayActivity.this, pointBean.getMsg(), Toast.LENGTH_LONG).show();

        } else {
            Toast.makeText(PlayActivity.this, pointBean.getMsg(), Toast.LENGTH_LONG).show();

        }
    }
}
