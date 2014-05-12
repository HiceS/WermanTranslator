package com.devil.android.wermantranslater;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TranslateActivity extends ActionBarActivity {
	
	private static ClipboardManager m_ClipboardManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_translate);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.translate, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_translate, container, false);
            final EditText edit1 = (EditText) rootView.findViewById(R.id.editText1);
            final Button english = (Button) rootView.findViewById(R.id.button1);
            final TextView result = (TextView) rootView.findViewById(R.id.textView1);
            final Button werman = (Button) rootView.findViewById(R.id.button2);
            english.setOnClickListener(new View.OnClickListener() {
                public void onClick(View planes) { //PROBLEM PLZ FIX 
                    // Perform action on click
                	String editText1=edit1.getText().toString();
                	String encrypting = StringTranslater.encrpytingString(editText1);
                	result.setText(encrypting);
//                	InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
//                	imm.hideSoftInputFromWindow(edit1.getWindowToken(), 0);
                }
            });
            werman.setOnClickListener(new View.OnClickListener() {
                public void onClick(View planes) { //PROBLEM PLZ FIX 
                    // Perform action on click
                	String editText1=edit1.getText().toString();
                	String decrypting = StringTranslater.decryptString(editText1);
                	result.setText(decrypting);
                }
            });
            return rootView;
        }
    }

}
