package wuhao.bwei.com.wuhaoonepiece.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import wuhao.bwei.com.wuhaoonepiece.R;
import wuhao.bwei.com.wuhaoonepiece.bean.OneDuanBean;
import wuhao.bwei.com.wuhaoonepiece.view.ZhuyeActivity;

/**
 * Created by alienware on 2018/1/25.
 */

public class OneAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
    private Context context;
    private List<OneDuanBean.DataBean> list;
    private LayoutInflater inflater;

    public OneAdapter(Context context, List<OneDuanBean.DataBean> list) {
        this.context = context;
        this.list = list;
        inflater=LayoutInflater.from(context);
    }




    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view=inflater.inflate(R.layout.one_item,parent,false);
        MyViewHolder myViewHolder=new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        final OneDuanBean.DataBean dataBean = list.get(position);
        MyViewHolder myViewHolder = (MyViewHolder) holder;
        myViewHolder.nick.setText(dataBean.getUser().getNickname());
        myViewHolder.create.setText(dataBean.getCreateTime());
        myViewHolder.contentid.setText(dataBean.getContent());
        myViewHolder.nick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final Intent intent = new Intent(context, ZhuyeActivity.class);
                final String nickname = dataBean.getUser().getNickname();
                final int uid = dataBean.getUid();
                final String createTime = dataBean.getCreateTime();
                final Object img = dataBean.getUser().getIcon();
                final String content = dataBean.getContent();


                intent.putExtra("nickname",nickname);
                intent.putExtra("uidd",uid+"");
                intent.putExtra("createtimme",createTime);
                intent.putExtra("imgg",img+"");
                intent.putExtra("conn",content+"");



                context.startActivity(intent);

            }
        });
        myViewHolder.image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Intent intent = new Intent(context, ZhuyeActivity.class);
                final String nickname = dataBean.getUser().getNickname();
                final int uid = dataBean.getUid();
                final String createTime = dataBean.getCreateTime();
                final Object img = dataBean.getUser().getIcon();
                final String content = dataBean.getContent();

                intent.putExtra("nickname",nickname);
                intent.putExtra("uidd",uid);
                intent.putExtra("createtimme",createTime);
                intent.putExtra("imgg",img+"");
                intent.putExtra("conn",content+"");



                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        private final TextView nick;
        private final TextView create;
        private final TextView contentid;
        private final ImageView image;
        public MyViewHolder(View itemView) {
            super(itemView);
            nick = itemView.findViewById(R.id.tick);
            create = itemView.findViewById(R.id.createtime);
            contentid = itemView.findViewById(R.id.contentid);
            image = itemView.findViewById(R.id.imageView20);
        }
    }


}
