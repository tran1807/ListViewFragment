package com.example.listviewfragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Myfrag1#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Myfrag1 extends Fragment {
    ListView lv;
    ArrayList<String> al;
    ArrayAdapter<String>aa;



    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Myfrag1() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Myfrag1.
     */
    // TODO: Rename and change types and number of parameters
    public static Myfrag1 newInstance(String param1, String param2) {
        Myfrag1 fragment = new Myfrag1();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_myfrag1, container, false);
        lv =(ListView) view.findViewById(R.id.List1);
        al=new ArrayList<String>();
        aa=new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_activated_1,al);
        lv.setAdapter(aa);
        al.add("Hoa Cúc");
        al.add("Hoa Mai");
        al.add("Hoa Đào");
        al.add("Hoa Bằng Lăng");
        al.add("Hoa Thược Dược");
        al.add("Hoa Hải Đường");
        al.add("Hoa Cẩm Tú");
        al.add("Hoa Hòe");
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
               String s=al.get(i);
               MainActivity mn1=(MainActivity) getActivity();
               mn1.fl(s);
            }
        });

        return view;
    }
}