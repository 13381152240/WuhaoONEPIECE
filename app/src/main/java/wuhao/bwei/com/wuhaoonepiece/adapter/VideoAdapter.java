package wuhao.bwei.com.wuhaoonepiece.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.facebook.drawee.view.SimpleDraweeView;

import java.util.List;

import wuhao.bwei.com.wuhaoonepiece.R;
import wuhao.bwei.com.wuhaoonepiece.bean.HotdeoBean;
import wuhao.bwei.com.wuhaoonepiece.view.PlayActivity;

/**
 * Created by alienware on 2018/1/26.
 */

public class VideoAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
    private Context context;
    private List<HotdeoBean.DataBean> list;
    private LayoutInflater inflater;

    public VideoAdapter(Context context, List<HotdeoBean.DataBean> list) {
        this.context = context;
        this.list = list;
        inflater=LayoutInflater.from(context);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view=inflater.inflate(R.layout.fm03_03item,parent,false);
        MyViewHolder myViewHolder=new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        final HotdeoBean.DataBean dataBean = list.get(position);
        MyViewHolder myViewHolder = (MyViewHolder) holder;
        myViewHolder.videoimg.setImageURI(dataBean.getCover());
        myViewHolder.userna.setText(dataBean.getUser().getNickname()+"");

        myViewHolder.videoimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final Intent intent = new Intent(context, PlayActivity.class);
                final String videoUrl = dataBean.getVideoUrl();
                final String createTime = dataBean.getCreateTime();
                final String cover = dataBean.getCover();
                final int commentNum = dataBean.getCommentNum();
                final int wid = dataBean.getWid();
                intent.putExtra("videoid",videoUrl);
                Toast.makeText(context,dataBean.getVideoUrl(),Toast.LENGTH_LONG).show();
                intent.putExtra("createtimee",createTime);
                intent.putExtra("coverr",cover);
                intent.putExtra("contentnum",commentNum+"");
                intent.putExtra("widd",wid+"");
                context.startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
        private final SimpleDraweeView videoimg;
        private final TextView userna;


        public MyViewHolder(View itemView) {
            super(itemView);
            videoimg = itemView.findViewById(R.id.videoimg);
            userna = itemView.findViewById(R.id.userna);
        }



    }


}
