package com.bs23.aliahmed.dialogspinner;

import android.app.Dialog;
import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.EditText;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Name : Ali Ahmed
 * Email: aliahmedaiub@gmail.com
 * on 4/20/2017.
 */

public class AliSpinnerDialog {
    public Context context;
    public String dialogueName;
    MyRecyclerViewAdapter myRecyclerViewAdapter;
    RecyclerView recyclerView;
    Dialog openDialog;
    String selectedText;
    EditText editText;

    AliSpinnerDialog(Context context, String dialogueName, List<Model> models, EditText editText){
        this.context = context;
        this.dialogueName = dialogueName;
        myRecyclerViewAdapter = new MyRecyclerViewAdapter(context,models);
        this.editText = editText;
    }

    public void openDialogue(){
        openDialog = new Dialog(context);
        openDialog.setContentView(R.layout.dialoag);
        openDialog.setTitle(dialogueName);
        recyclerView = (RecyclerView)openDialog.findViewById(R.id.rvSpinnerList);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.setAdapter(myRecyclerViewAdapter);
        openDialog.show();
        getSelectedText();
    }

    public void getSelectedText(){
        myRecyclerViewAdapter.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(Model item) {
                selectedText = item.getText1();
                editText.setText(selectedText);
                openDialog.dismiss();
            }
            @Override
            public void onChildItemClick(Model item) {

            }
        });
    }
}
