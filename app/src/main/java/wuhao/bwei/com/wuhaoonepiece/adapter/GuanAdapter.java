package wuhao.bwei.com.wuhaoonepiece.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import wuhao.bwei.com.wuhaoonepiece.R;
import wuhao.bwei.com.wuhaoonepiece.bean.GuanzhuBean;

/**
 * Created by alienware on 2018/1/25.
 */

public class GuanAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
    private Context context;
    private List<GuanzhuBean.DataBean> list;
    private LayoutInflater inflater;

    public GuanAdapter(Context context, List<GuanzhuBean.DataBean> list) {
        this.context = context;
        this.list = list;
        inflater=LayoutInflater.from(context);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view=inflater.inflate(R.layout.guan_item,parent,false);
        MyViewHolder myViewHolder=new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        final GuanzhuBean.DataBean dataBean = list.get(position);
        MyViewHolder myViewHolder = (MyViewHolder) holder;
        myViewHolder.nickname.setText("用户姓名:"+dataBean.getNickname());
        myViewHolder.createid.setText("用户创建时间:"+dataBean.getCreatetime());
        myViewHolder.userid.setText("用户id:"+dataBean.getUid());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        private final TextView nickname;
        private final TextView createid;
        private final TextView userid;

        public MyViewHolder(View itemView) {
            super(itemView);
            nickname = itemView.findViewById(R.id.tickid);
            createid = itemView.findViewById(R.id.createtimeid);
            userid = itemView.findViewById(R.id.userid);
        }
    }


}
