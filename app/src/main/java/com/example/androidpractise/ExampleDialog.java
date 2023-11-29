package com.example.androidpractise;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialogFragment;

public class ExampleDialog extends AppCompatDialogFragment {

    EditText username, password;
    ExampleDialogInterface dialogListener;

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {

        AlertDialog.Builder dialog = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.design_login_dialog, null);

        dialog.setView(view)
                .setTitle("Login")
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                })
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                     String userName = username.getText().toString();
                     String userPassword = password.getText().toString();
                     dialogListener.applyText(userName, userPassword);
                    }
                });
        username = view.findViewById(R.id.et_username);
        password = view.findViewById(R.id.et_password);
        return dialog.create();
    }

    public interface ExampleDialogInterface {
        void applyText(String username, String password);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        try {
            dialogListener = (ExampleDialogInterface) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString() + "must be implemented");
        }
    }
}
