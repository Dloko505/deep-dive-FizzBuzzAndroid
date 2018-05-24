package edu.cnm.deepdive.dloko505.fizzbuzzandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements TextWatcher {

  private TextView textView;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    textView = findViewById(R.id.fizzbuzztext);

    EditText input = findViewById(R.id.editText);

    input.addTextChangedListener(this);

    updateText(10);

  }

  private void updateText(int count_to) {
    StringBuilder stringBuilder = new StringBuilder();

    for (int i = 0; i < count_to; i++) {
      stringBuilder.append(FizzBuzz.count(i + 1) + "\n");
    }

    textView.setText(stringBuilder);
  }

  @Override
  public void beforeTextChanged(CharSequence s, int start, int count, int after) {

  }

  @Override
  public void onTextChanged(CharSequence s, int start, int before, int count) {

  }

  @Override
  public void afterTextChanged(Editable editable) {
    try {
      updateText(Integer.parseInt(editable.toString()));
    } catch (NumberFormatException e) {
      Toast.makeText(this, "Invalid Input", Toast.LENGTH_LONG).show();
    }
  }
}
