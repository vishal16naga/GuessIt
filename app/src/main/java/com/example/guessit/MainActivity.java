package com.example.guessit;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int finaltext;
    static int randomfunction(int maxnum, int minnum)
    {
        return (int)((Math.random()
                * (maxnum - minnum)) + minnum);
    }

    public void makeToast(String str)
    {
        Toast.makeText(MainActivity.this, str, Toast.LENGTH_SHORT).show();
    }
    public void clickFunction(View view)
    {
        int usertext;
        EditText variable
                = (EditText)findViewById(
                R.id.editId);
        usertext
                = Integer.parseInt(
                variable
                        .getText()
                        .toString());
        if (usertext < finaltext) {

            makeToast("GUess of Higher Number,Try Again");
        }
        else if (usertext > finaltext) {
            makeToast("Guess of Lower Number,Try Again");
        }
        else {
            makeToast(
                    "Congratulations,"
                            +"This is the correct number");
        }
    }

    @Override
    protected void onCreate(
            Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int minnum = 1;
        int maxnum = 50;
        finaltext = randomfunction(minnum, maxnum);
    }
}
