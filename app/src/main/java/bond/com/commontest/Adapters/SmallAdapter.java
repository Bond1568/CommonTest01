package bond.com.commontest.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import bond.com.commontest.R;

/**
 * Bond 2016/8/20.
 */
public class SmallAdapter extends RecyclerView.Adapter<SmallAdapter.SmallViewHolder> {
    private View mItem;
    private Context mContext;
    private int mLayoutId;
    private List<String> mData;
    public SmallAdapter(Context context, int layoutId, List<String> data){
        mContext = context;
        mLayoutId =layoutId;
        mData = data;
    }
    @Override
    public SmallAdapter.SmallViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        mItem = LayoutInflater.from(mContext).inflate(mLayoutId,parent,false);
        SmallViewHolder holder = new SmallViewHolder(mItem);
        return holder;
    }

    @Override
    public void onBindViewHolder(SmallAdapter.SmallViewHolder holder, int position) {
            holder.tv_item.setText(mData.get(position));
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    class SmallViewHolder extends RecyclerView.ViewHolder {
        TextView tv_item;
        public SmallViewHolder(View itemView) {
            super(itemView);
            tv_item = (TextView) itemView.findViewById(R.id.tv_item);
        }
    }
}
