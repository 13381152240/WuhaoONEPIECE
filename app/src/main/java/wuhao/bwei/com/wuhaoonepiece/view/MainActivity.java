package wuhao.bwei.com.wuhaoonepiece.view;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.facebook.drawee.view.SimpleDraweeView;
import com.hjm.bottomtabbar.BottomTabBar;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import wuhao.bwei.com.wuhaoonepiece.R;
import wuhao.bwei.com.wuhaoonepiece.fragment.HomePageFragment;
import wuhao.bwei.com.wuhaoonepiece.fragment.TalkFragment;
import wuhao.bwei.com.wuhaoonepiece.fragment.VideoFragment;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.bottom_tab_bar)
    BottomTabBar mb;
    @BindView(R.id.cl_imageView)
    SimpleDraweeView clImageView;
    @BindView(R.id.drawerLayout)
    DrawerLayout drawerLayout;
    @BindView(R.id.myguanid)
    RelativeLayout myguanid;
    private ImageView iss;
    private SimpleDraweeView headimg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
        iss = (ImageView) findViewById(R.id.iss);
        headimg = (SimpleDraweeView) findViewById(R.id.headimg);

        mb.init(getSupportFragmentManager())
                .setImgSize(60, 60)
                .setFontSize(16)
                .setTabPadding(4, 6, 10)
                .setChangeColor(Color.RED, Color.DKGRAY)
                .addTabItem("推荐", R.mipmap.raw, HomePageFragment.class)
                .addTabItem("段子", R.mipmap.raa, TalkFragment.class)
                .addTabItem("视频", R.mipmap.rap, VideoFragment.class)
                .isShowDivider(false)

                .setOnTabChangeListener(new BottomTabBar.OnTabChangeListener() {
                    @Override
                    public void onTabChange(int position, String name) {

                    }
                });
        iss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Intent intent = new Intent(MainActivity.this, IssActivity.class);
                startActivity(intent);
            }
        });
        headimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawerLayout.openDrawer(Gravity.LEFT);
            }
        });

        drawerLayout.addDrawerListener(listener);
        //主布局亮度不变
        drawerLayout.setScrimColor(0x00ffffff);
        clImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Intent intent = new Intent(MainActivity.this, LoginyeActivity.class);
                startActivity(intent);

            }
        });

    }


    DrawerLayout.DrawerListener listener = new DrawerLayout.DrawerListener() {
        @Override
        public void onDrawerSlide(View drawerView, float slideOffset) {
            View mContent = drawerLayout.getChildAt(0);
            int offset = (int) (drawerView.getWidth() * slideOffset);
            mContent.setTranslationX(offset);
        }

        /**
         * 打开
         * @param drawerView
         */
        @Override
        public void onDrawerOpened(View drawerView) {

        }

        @Override
        public void onDrawerClosed(View drawerView) {

        }

        @Override
        public void onDrawerStateChanged(int newState) {

        }
    };


    @OnClick(R.id.myguanid)
    public void onViewClicked() {
        final Intent intent = new Intent(MainActivity.this,MyguanActivity.class);
        startActivity(intent);
    }
}
