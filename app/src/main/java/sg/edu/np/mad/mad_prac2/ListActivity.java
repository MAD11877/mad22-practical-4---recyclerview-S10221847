package sg.edu.np.mad.mad_prac2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        ImageView imageButton = findViewById(R.id.imageView5);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MADness();
            }
        });

    }
    private void MADness(){
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setMessage("MADness").setCancelable(false);
        builder.setNegativeButton("Close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        builder.setPositiveButton("View", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent myIntent=new Intent(ListActivity.this,MainActivity.class);
                Random ran = new Random();   //calling random class assigning to a variable random
                int value = ran.nextInt(999999);
                Bundle extras=new Bundle();
                extras.putInt("Random",value);
                myIntent.putExtras(extras);
                startActivity(myIntent);

            }
        });
        AlertDialog alert=builder.create();
        alert.setTitle("Profile");
        alert.show();
    }


    }


