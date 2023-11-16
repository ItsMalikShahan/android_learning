package com.example.androidpractise;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;


public class FragmentB extends Fragment {


    EditText text;
    Button button;
    private FragmentBListener listener;

    public interface FragmentBListener{
        void onInputBSent(CharSequence inputText );

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_b, container, false);
        text = v.findViewById(R.id.et_text);
        button = v.findViewById(R.id.btn_ok);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CharSequence input = text.getText();
                listener.onInputBSent(input);
            }
        });
        return  v;
    }
    public void updateEditText(CharSequence newText){
        text.setText(newText);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if (context instanceof FragmentBListener){
            listener = (FragmentBListener) context;
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
}