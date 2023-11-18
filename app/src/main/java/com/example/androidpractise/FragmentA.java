package com.example.androidpractise;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;


public class FragmentA extends Fragment {

    EditText text;
    Button button;
    private SharedViewModel viewModel;
    /*
    Interface Method to share data

    private FragmentAListener listener;
    public interface FragmentAListener{
        void onInputASent(CharSequence inputText );
    }
     */


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_a, container, false);
        text = v.findViewById(R.id.et_text);
        button = v.findViewById(R.id.btn_ok);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                  viewModel.setData(text.getText());
//                listener.onInputASent(input);
            }
        });
        return  v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
//        viewModel = new ViewModelProviders(getActivity()).get(SharedViewModel.class);
    }
    /*
     Interface Method to share data


        public void updateEditText(CharSequence newText){
        text.setText(newText);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if (context instanceof FragmentAListener){
            listener = (FragmentAListener) context;
        }else
        {
            throw new RuntimeException(context.toString()
                    + " must implement FragmentAListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        listener = null;
    }
     */

}