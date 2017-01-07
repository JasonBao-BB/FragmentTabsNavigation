package com.example.administrator.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class NextFragment extends Fragment {


    public NextFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_next, container, false);
        v.findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().popBackStack();
            }
        });
        return v;
    }

    @Override
    public void onPause() {
        super.onPause();
        System.out.println("On Pause");
    }

    @Override
    public void onStop() {
        super.onStop();
        System.out.println("On STOP");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        System.out.println("Destroy View");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        System.out.println("On Destory");
    }

}
