package wuhao.bwei.com.wuhaoonepiece.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import wuhao.bwei.com.wuhaoonepiece.R;
import wuhao.bwei.com.wuhaoonepiece.adapter.OneAdapter;
import wuhao.bwei.com.wuhaoonepiece.bean.OneDuanBean;
import wuhao.bwei.com.wuhaoonepiece.presenter.GetonePresenter;
import wuhao.bwei.com.wuhaoonepiece.view.IGetOne;

/**
 * Created by alienware on 2018/1/22.
 */

public class RightFragment extends Fragment implements IGetOne{
    @BindView(R.id.onervv)
    RecyclerView onervv;
    Unbinder unbinder;


//    @BindView(R.id.banner)
//    Banner banner;
//    Unbinder unbinder;
//    private List<String> listimg = new ArrayList<>();

    private OneAdapter oneAdapter;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fm02_02, container, false);

        unbinder = ButterKnife.bind(this, view);
        GetonePresenter getonePresenter = new GetonePresenter(this);
        getonePresenter.geto();
        onervv.setLayoutManager(new LinearLayoutManager(getActivity()));


        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    @Override
    public void getone(OneDuanBean oneDuanBean) {
        oneAdapter = new OneAdapter(getActivity(),oneDuanBean.getData());
        onervv.setAdapter(oneAdapter);
    }
}
