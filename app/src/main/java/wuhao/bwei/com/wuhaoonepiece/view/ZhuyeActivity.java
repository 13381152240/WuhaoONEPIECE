package wuhao.bwei.com.wuhaoonepiece.view;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import com.facebook.drawee.view.SimpleDraweeView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import wuhao.bwei.com.wuhaoonepiece.R;
import wuhao.bwei.com.wuhaoonepiece.bean.GuanBean;
import wuhao.bwei.com.wuhaoonepiece.bean.ZhuyeeBean;
import wuhao.bwei.com.wuhaoonepiece.presenter.PGuan;
import wuhao.bwei.com.wuhaoonepiece.presenter.ZhuyeePresenter;

public class ZhuyeActivity extends AppCompatActivity implements Izhuyee,IGuan{

    @BindView(R.id.imageView15)
    ImageView imageView15;
    @BindView(R.id.textView4)
    TextView textView4;
    @BindView(R.id.imageView16)
    ImageView imageView16;
    @BindView(R.id.imageView17)
    ImageView imageView17;
    @BindView(R.id.linearLayout2)
    LinearLayout linearLayout2;
    @BindView(R.id.simpleDraweeView)
    SimpleDraweeView simpleDraweeView;
    @BindView(R.id.guan)
    Button guan;
    @BindView(R.id.simpleDraweeView2)
    SimpleDraweeView simpleDraweeView2;
    @BindView(R.id.textView8)
    TextView textView8;
    @BindView(R.id.textView9)
    TextView textView9;
    @BindView(R.id.imageView18)
    ImageView imageView18;
    @BindView(R.id.textView15)
    TextView textView15;
    @BindView(R.id.videovvv)
    VideoView videovvv;
    private String uidd;
    private String videoUrl;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zhuye);
        ButterKnife.bind(this);
        final Intent intent = getIntent();
        final String nickname = intent.getStringExtra("nickname");
        uidd = intent.getStringExtra("uidd");
        final String createtimme = intent.getStringExtra("createtimme");
        final String imgg = intent.getStringExtra("imgg");
        final String conn = intent.getStringExtra("conn");

        textView8.setText(nickname);
        textView9.setText(createtimme);
        simpleDraweeView2.setImageURI(imgg);
        textView15.setText(conn);
        ZhuyeePresenter zhuyeePresenter = new ZhuyeePresenter(this);
        zhuyeePresenter.getzhuy(uidd);

        Toast.makeText(ZhuyeActivity.this, uidd,Toast.LENGTH_LONG).show();


    }

    @OnClick({R.id.imageView15, R.id.guan})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.imageView15:
                finish();
                break;
            case R.id.guan:
                PGuan pGuan = new PGuan(this);
                pGuan.getgu(uidd);


                break;
        }
    }

    @Override
    public void getzhuyee(ZhuyeeBean zhuyeeBean) {
        final List<ZhuyeeBean.DataBean> data = zhuyeeBean.getData();
        for (int i = 0; i < data.size(); i++) {
            final ZhuyeeBean.DataBean dataBean = data.get(i);
            videoUrl = dataBean.getVideoUrl();
        }
        if(videoUrl==null){
            Toast.makeText(ZhuyeActivity.this, "此人没有发布视频",Toast.LENGTH_LONG).show();

        }else{
            videovvv.setMediaController(new MediaController(this));
            videovvv.setVideoURI(Uri.parse(videoUrl));
            videovvv.start();
            videovvv.requestFocus();
            Toast.makeText(ZhuyeActivity.this, videoUrl,Toast.LENGTH_LONG).show();
        }

    }

    @Override
    public void getguan(GuanBean guanBean) {
        Toast.makeText(this,guanBean.getMsg(),Toast.LENGTH_LONG);

        if(guanBean.getMsg().equals("关注成功")){
            guan.setText("已关注");
            Toast.makeText(this,guanBean.getMsg(),Toast.LENGTH_LONG);

        }else{
            Toast.makeText(this,guanBean.getMsg(),Toast.LENGTH_LONG);
        }

    }
}
