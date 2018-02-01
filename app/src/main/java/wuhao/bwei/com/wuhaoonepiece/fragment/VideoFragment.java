package wuhao.bwei.com.wuhaoonepiece.fragment;

import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import wuhao.bwei.com.wuhaoonepiece.R;

/**
 * Created by alienware on 2018/1/22.
 */

public class VideoFragment extends Fragment {
    Uri uri = Uri.parse("https://pic4.zhimg.com/03b2d57be62b30f158f48f388c8f3f33_b.png");
    @BindView(R.id.tabLa)
    TabLayout tabLa;
    @BindView(R.id.viewPa)
    ViewPager viewPa;
    Unbinder unbinder;
    ArrayList<Fragment> fragmentList = new ArrayList<Fragment>();
    ArrayList<String> titleList = new ArrayList<String>();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fm03, container, false);
        unbinder = ButterKnife.bind(this, view);
        return view;


    }
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initData();
        MPagerAdapter mPagerAdapter = new MPagerAdapter(getChildFragmentManager());
        viewPa.setAdapter(mPagerAdapter);

        //设置TabLayout的模式
        tabLa.setTabMode(TabLayout.MODE_FIXED);
        //让tablayout和Viewpager关联;
        tabLa.setupWithViewPager(viewPa);

    }
    private void initData() {
        fragmentList.add(new GetHotFragment());
        fragmentList.add(new GetNearFragment());
        titleList.add("热门");
        titleList.add("附近");

    }
    class  MPagerAdapter extends FragmentPagerAdapter {

        public MPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return fragmentList.get(position);
        }

        @Override
        public int getCount() {
            return fragmentList.size();
        }
        @Override
        public CharSequence getPageTitle(int position) {
            return titleList.get(position);
        }

    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
