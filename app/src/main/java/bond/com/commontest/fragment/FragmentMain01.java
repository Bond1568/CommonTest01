package bond.com.commontest.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.List;

import bond.com.commontest.Adapters.SmallAdapter;
import bond.com.commontest.R;

/**
 * Bond 2016/8/18.
 */

public class FragmentMain01 extends Fragment implements View.OnClickListener{
    private RecyclerView recyclerView;
    private List<String> mData;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = LayoutInflater.from(getActivity()).inflate(R.layout.fragment_main_01,container,false);
        initDAta();
        initViews(view);
        return view;
    }

    private void initDAta() {
        mData = new ArrayList<String>();
        for (int i = 'A'; i < 'Z'; i++) {
            mData.add(""+(char)i);
        }
    }

    private void initViews(View view) {
        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerview);
        initRecyclerView();

    }

    private void initRecyclerView() {
        SmallAdapter adapter = new SmallAdapter(getActivity(),R.layout.item_home,mData);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

    }

    @Override
    public void onClick(View view) {
    }
}