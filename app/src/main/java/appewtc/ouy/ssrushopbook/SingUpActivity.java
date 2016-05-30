package appewtc.ouy.ssrushopbook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SingUpActivity extends AppCompatActivity {

    //Explicit
    private EditText nameEditText, surnameEditText,
    useEditText, passwordEditText;
    private String nameString, surnameString, userString, passwordString;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sing_up);

        //Bind Widget
        nameEditText = (EditText) findViewById(R.id.editText);
        surnameEditText = (EditText) findViewById(R.id.editText2);
        useEditText = (EditText) findViewById(R.id.editText3);
        passwordEditText = (EditText) findViewById(R.id.editText4);


    }// Main Method

    public void cliclkSingUpSign(View view) {

        nameString = nameEditText.getText().toString().trim();
        surnameString = surnameEditText.getText().toString().trim();
        userString = useEditText.getText().toString().trim();
        passwordString = passwordEditText.getText().toString().trim();

        //Chack Space
        if (nameString.equals("") || surnameString.equals("") ||
                userString.equals("") || passwordString.equals("")) {
            //Have Space
            MyAlert myAlert = new MyAlert();
            myAlert.myDialog(this,"มีช่องว่าง","กรุณากรอกทุกช่องค่ะ");
        } else {
            //No Space
            uploadNewUser();

        }


    } //clickSign
    private  void uploadNewUser() {

    }//uploadNewUser

} //Main Class
