package bond.com.commontest.activity;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import bond.com.commontest.R;
import bond.com.commontest.fragment.FragmentMain01;
import bond.com.commontest.fragment.FragmentMain02;
import bond.com.commontest.fragment.FragmentMain03;

public class MainActivity extends FragmentActivity implements View.OnClickListener{
    private RelativeLayout layout_top_01;
    private TextView tv_top_01;
    private RelativeLayout layout_top_02;
    private TextView tv_top_02;
    private RelativeLayout layout_top_03;
    private TextView tv_top_03;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        layout_top_01 = (RelativeLayout) findViewById(R.id.layout_top_01);
        layout_top_01.setOnClickListener(this);
        layout_top_02 = (RelativeLayout) findViewById(R.id.layout_top_02);
        layout_top_02.setOnClickListener(this);
        layout_top_03 = (RelativeLayout) findViewById(R.id.layout_top_03);
        layout_top_03.setOnClickListener(this);
        tv_top_01 = (TextView) findViewById(R.id.tv_top_01);
        tv_top_02 = (TextView) findViewById(R.id.tv_top_02);
        tv_top_03 = (TextView) findViewById(R.id.tv_top_03);
        unifyStyle();
        layout_top_01.setBackgroundColor(getResources().getColor(R.color.whites));
        tv_top_01.setTextColor(getResources().getColor(R.color.orange));

        FragmentMain01 main01 = new FragmentMain01();
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.layout_fragments_container,main01);
        transaction.commit();
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.layout_top_01:
                unifyStyle();
                view.setBackgroundColor(getResources().getColor(R.color.whites));
                tv_top_01.setTextColor(getResources().getColor(R.color.orange));

                FragmentMain01 main01 = new FragmentMain01();
                replace(main01);
                break;
            case R.id.layout_top_02:
                unifyStyle();
                view.setBackgroundColor(getResources().getColor(R.color.whites));
                tv_top_02.setTextColor(getResources().getColor(R.color.orange));

                FragmentMain02 main02 = new FragmentMain02();
                replace(main02);
                break;
            case R.id.layout_top_03:
                unifyStyle();
                view.setBackgroundColor(getResources().getColor(R.color.whites));
                tv_top_03.setTextColor(getResources().getColor(R.color.orange));

                FragmentMain03 main03 = new FragmentMain03();
                replace(main03);
                break;
        }
    }

    private void replace(Fragment main) {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.layout_fragments_container,main);
        transaction.commit();
    }

    private void unifyStyle() {
        layout_top_01.setBackgroundColor(getResources().getColor(R.color.graywhites));
        tv_top_01.setTextColor(getResources().getColor(R.color.gray));
        layout_top_02.setBackgroundColor(getResources().getColor(R.color.graywhites));
        tv_top_02.setTextColor(getResources().getColor(R.color.gray));
        layout_top_03.setBackgroundColor(getResources().getColor(R.color.graywhites));
        tv_top_03.setTextColor(getResources().getColor(R.color.gray));
    }
}
