package com.kalvinkao.guideforvalorant.ui.actionbar;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.kalvinkao.guideforvalorant.R;
import com.kalvinkao.guideforvalorant.ui.languages.LocaleHelper;

public class Languages extends AppCompatActivity {
    TextView mTextView;
    Spinner mLanguage;
    ArrayAdapter<String> mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_languages);

        mLanguage = (Spinner) findViewById(R.id.spinner1);
        mTextView = (TextView) findViewById(R.id.textView);
        mAdapter = new ArrayAdapter<String>(Languages.this, android.R.layout.simple_spinner_dropdown_item, getResources().getStringArray(R.array.language_arrays));
        mLanguage.setAdapter(mAdapter);

        if (LocaleHelper.getLanguage(Languages.this).equalsIgnoreCase("en")) {
            mLanguage.setSelection(mAdapter.getPosition("English"));
        } else if (LocaleHelper.getLanguage(Languages.this).equalsIgnoreCase("es")) {
            mLanguage.setSelection(mAdapter.getPosition("Español"));
        } else if (LocaleHelper.getLanguage(Languages.this).equalsIgnoreCase("ru")) {
            mLanguage.setSelection(mAdapter.getPosition("русский"));
        }

        mLanguage.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Context context;
                Resources resources;
                switch (i) {
                    case 0:
                        context = LocaleHelper.setLocale(Languages.this, "en");
                        resources = context.getResources();
                        // mTextView.setText(resources.getString(R.string.text_translation));
                        break;
                    case 1:
                        context = LocaleHelper.setLocale(Languages.this, "es");
                        resources = context.getResources();
                        //   mTextView.setText(resources.getString(R.string.text_translation));
                        break;
                    case 2:
                        context = LocaleHelper.setLocale(Languages.this, "ru");
                        resources = context.getResources();
                        //   mTextView.setText(resources.getString(R.string.text_translation));
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        // Back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(LocaleHelper.onAttach(newBase));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
