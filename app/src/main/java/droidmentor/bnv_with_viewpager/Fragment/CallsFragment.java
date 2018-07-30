package droidmentor.bnv_with_viewpager.Fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import droidmentor.bnv_with_viewpager.R;
import droidmentor.bnv_with_viewpager.list.ListActivity1;
import droidmentor.bnv_with_viewpager.list2.ListActivity2;
import droidmentor.bnv_with_viewpager.ytv.KosaKata;


/**
 * A simple {@link Fragment} subclass.
 */
public class CallsFragment extends Fragment implements View.OnClickListener {

    ImageView button,button2,button3;


    public CallsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_calls, container, false);
        button = (ImageView) view.findViewById(R.id.imageView);
        button.setOnClickListener(this);
        button2 = (ImageView) view.findViewById(R.id.imageVieww);
        button2.setOnClickListener(this);
        button3 = (ImageView) view.findViewById(R.id.imageViewww);
        button3.setOnClickListener(this);




        return view;
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.imageView:
                Intent mIntent = new Intent(getActivity(), ListActivity1.class);
                startActivity(mIntent);
                break;
            case R.id.imageVieww:
                Intent yIntent = new Intent(getActivity(), ListActivity2.class);
                startActivity(yIntent);
                break;
            case R.id.imageViewww:
                Intent rIntent = new Intent(getActivity(), KosaKata.class);
                startActivity(rIntent);
                break;



        }
    }
}
