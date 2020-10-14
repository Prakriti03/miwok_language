/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        ListView numbers_text= (ListView) findViewById(R.id.numbers_text);
        ArrayList<Word> numbersList=new ArrayList<>();
        numbersList.add(new Word("one","lutti",R.drawable.number_one,R.raw.number_one));
        numbersList.add(new Word("one","lutti",R.drawable.number_two,R.raw.number_two));
        numbersList.add(new Word("one","lutti",R.drawable.number_three,R.raw.number_three));
        numbersList.add(new Word("one","lutti",R.drawable.number_four,R.raw.number_four));
        numbersList.add(new Word("one","lutti",R.drawable.number_five,R.raw.number_five));
        numbersList.add(new Word("one","lutti",R.drawable.number_six,R.raw.number_six));
        numbersList.add(new Word("one","lutti",R.drawable.number_seven,R.raw.number_seven));
        numbersList.add(new Word("one","lutti",R.drawable.number_eight,R.raw.number_eight));
        numbersList.add(new Word("one","lutti",R.drawable.number_nine,R.raw.number_nine));
        numbersList.add(new Word("one","lutti",R.drawable.number_ten,R.raw.number_ten));
        WordAdapter adapter = new WordAdapter(this,numbersList);
        numbers_text.setAdapter(adapter);
    }
}
