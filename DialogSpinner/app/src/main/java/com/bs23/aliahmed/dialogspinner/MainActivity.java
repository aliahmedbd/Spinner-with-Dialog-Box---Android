package com.bs23.aliahmed.dialogspinner;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText edtSpinner;
    List<Model> models = new ArrayList<>();
    MyRecyclerViewAdapter myRecyclerViewAdapter;
    AliSpinnerDialog aliSpinnerDialog;
    Model model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtSpinner = (EditText) findViewById(R.id.edtSpinner);
        edtSpinner.setFocusable(false);
        edtSpinner.setHint("Select Person");
        model = new Model("Ali", "BAS 23");

        models.add(model);
        models.add(model);
        models.add(model);
        models.add(model);
        models.add(model);
        models.add(model);
        models.add(model);
        models.add(model);
        models.add(model);
        models.add(model);
        models.add(model);
        models.add(model);
        models.add(model);
        models.add(model);
        models.add(model);
        models.add(model);
        models.add(model);
        models.add(model);
        models.add(model);
        models.add(model);
        models.add(model);
        models.add(model);
        models.add(model);
        models.add(model);
        models.add(model);

        edtSpinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AliSpinnerDialog aliSpinnerDialog = new AliSpinnerDialog(MainActivity.this, "Select persons", models, edtSpinner);
                aliSpinnerDialog.openDialogue();
            }
        });

    }
}
