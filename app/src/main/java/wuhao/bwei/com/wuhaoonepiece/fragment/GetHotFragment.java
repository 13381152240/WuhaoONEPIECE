package wuhao.bwei.com.wuhaoonepiece.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import wuhao.bwei.com.wuhaoonepiece.R;
import wuhao.bwei.com.wuhaoonepiece.adapter.VideoAdapter;
import wuhao.bwei.com.wuhaoonepiece.bean.HotdeoBean;
import wuhao.bwei.com.wuhaoonepiece.presenter.HotPresenter;
import wuhao.bwei.com.wuhaoonepiece.view.IHotVideo;
import wuhao.bwei.com.wuhaoonepiece.view.SpacesItemDecoration;

/**
 * Created by alienware on 2018/1/26.
 */

public class GetHotFragment extends Fragment implements IHotVideo {
    @BindView(R.id.rlvv)
    RecyclerView rlvv;
    Unbinder unbinder;
    private VideoAdapter videoAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fm03_03, container, false);
        unbinder = ButterKnife.bind(this, view);

        HotPresenter hotPresenter = new HotPresenter(this);
        hotPresenter.getvid();


        return view;

    }

    @Override
    public void gethotvideo(HotdeoBean hotVideoBean) {
        videoAdapter = new VideoAdapter(getActivity(),hotVideoBean.getData());
        rlvv.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));

        SpacesItemDecoration decoration=new SpacesItemDecoration(16);
        rlvv.addItemDecoration(decoration);
        rlvv.setAdapter(videoAdapter);

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
