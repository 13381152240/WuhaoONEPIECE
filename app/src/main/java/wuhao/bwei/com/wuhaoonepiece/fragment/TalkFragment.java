package wuhao.bwei.com.wuhaoonepiece.fragment;

import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import wuhao.bwei.com.wuhaoonepiece.R;
import wuhao.bwei.com.wuhaoonepiece.adapter.TalkAdapter;
import wuhao.bwei.com.wuhaoonepiece.bean.GetDuanBean;
import wuhao.bwei.com.wuhaoonepiece.presenter.TalkPresenter;
import wuhao.bwei.com.wuhaoonepiece.view.ITalk;

/**
 * Created by alienware on 2018/1/22.
 */

public class TalkFragment extends Fragment implements ITalk {


    Uri uri = Uri.parse("https://pic4.zhimg.com/03b2d57be62b30f158f48f388c8f3f33_b.png");
    @BindView(R.id.rlv)
    RecyclerView rlv;
    Unbinder unbinder;
    private View view;
    private TalkAdapter talkAdapter;
    private List<GetDuanBean.DataBean> list;
    /**
     * 推荐
     */
    private TextView mTitle;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fm02, container, false);
        initView(view);
        TalkPresenter talkPresenter = new TalkPresenter(this);
        talkPresenter.getdu();
        mTitle.setText("段子");
        unbinder = ButterKnife.bind(this, view);
        rlv.setLayoutManager(new LinearLayoutManager(getActivity()));
        return view;


    }

    private void initView(View view) {
        mTitle = (TextView) view.findViewById(R.id.title);


    }


    @Override
    public void getduan(GetDuanBean getDuanBean) {
        talkAdapter = new TalkAdapter(getActivity(),getDuanBean.getData());
        rlv.setAdapter(talkAdapter);

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
