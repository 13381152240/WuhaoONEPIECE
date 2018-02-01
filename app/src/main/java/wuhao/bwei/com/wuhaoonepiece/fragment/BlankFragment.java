package wuhao.bwei.com.wuhaoonepiece.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.youth.banner.Banner;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import wuhao.bwei.com.wuhaoonepiece.R;
import wuhao.bwei.com.wuhaoonepiece.adapter.OneAdapter;
import wuhao.bwei.com.wuhaoonepiece.bean.LoginBean;
import wuhao.bwei.com.wuhaoonepiece.bean.LunBoBean;
import wuhao.bwei.com.wuhaoonepiece.bean.OneDuanBean;
import wuhao.bwei.com.wuhaoonepiece.presenter.AllPresenter;
import wuhao.bwei.com.wuhaoonepiece.presenter.GetonePresenter;
import wuhao.bwei.com.wuhaoonepiece.view.GlideImageLoader;
import wuhao.bwei.com.wuhaoonepiece.view.IBanner;
import wuhao.bwei.com.wuhaoonepiece.view.IGetOne;

/**
 * Created by alienware on 2018/1/22.
 */

public class BlankFragment extends Fragment implements IBanner, IGetOne {
    @BindView(R.id.banner)
    Banner banner;
    Unbinder unbinder;
    @BindView(R.id.onerv)
    RecyclerView onerv;
    private List<String> listimg = new ArrayList<>();
    private OneAdapter oneAdapter;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fm01_01, container, false);
        unbinder = ButterKnife.bind(this, view);
        //实例化p层
        AllPresenter allPresenter = new AllPresenter(this);
        allPresenter.Getbanner();
        GetonePresenter getonePresenter = new GetonePresenter(this);
        getonePresenter.geto();
        onerv.setLayoutManager(new LinearLayoutManager(getActivity()));

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }

    @Override
    public void GetBanner(LunBoBean lunBoBean) {
        List<LunBoBean.DataBean> data = lunBoBean.getData();

        for (int i = 0; i < data.size(); i++) {
            LunBoBean.DataBean dataBean = data.get(i);
            listimg.add(dataBean.getIcon());
        }

        banner.setImageLoader(new GlideImageLoader());
        banner.setImages(listimg);
        banner.setDelayTime(3500);
        banner.start();

    }

    @Override
    public void getLog(LoginBean loginBean) {

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    @Override
    public void getone(OneDuanBean oneDuanBean) {
        oneAdapter = new OneAdapter(getActivity(), oneDuanBean.getData());
        onerv.setAdapter(oneAdapter);

    }


}
