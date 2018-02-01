package wuhao.bwei.com.wuhaoonepiece.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;

import java.util.List;

import wuhao.bwei.com.wuhaoonepiece.R;
import wuhao.bwei.com.wuhaoonepiece.bean.GetDuanBean;

/**
 * Created by alienware on 2018/1/24.
 */

public class TalkAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
    private Context context;
    private List<GetDuanBean.DataBean> list;
    private LayoutInflater inflater;

    public TalkAdapter(Context context, List<GetDuanBean.DataBean> list) {
        this.context = context;
        this.list = list;
        inflater=LayoutInflater.from(context);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view=inflater.inflate(R.layout.talk_item,parent,false);
        MyViewHolder myViewHolder=new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        GetDuanBean.DataBean dataBean = list.get(position);
        GetDuanBean.DataBean.UserBean user = dataBean.getUser();
        MyViewHolder myViewHolder= (MyViewHolder) holder;
        myViewHolder.image.setImageURI(user.getIcon());
        myViewHolder.title.setText(user.getNickname());
        myViewHolder.time.setText(dataBean.getCreateTime());
        myViewHolder.neirong.setText(dataBean.getContent());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    class MyViewHolder extends RecyclerView.ViewHolder {

        private final SimpleDraweeView image;
        private final TextView title;
        private final TextView time;
        private final TextView neirong;

        public MyViewHolder(View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image_duanzi);
            title = itemView.findViewById(R.id.title_duanzi);
            time = itemView.findViewById(R.id.time_duanzi);
            neirong = itemView.findViewById(R.id.neirong_duanzi);
        }
    }
}
