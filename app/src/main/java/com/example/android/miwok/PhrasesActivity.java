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
import android.widget.ListView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {
    ListView phraseListview;
    ArrayList<Word> phrases;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);
        phraseListview=(ListView)findViewById(R.id.phrase_listview);
        phrases=new ArrayList<>();
        phrases.add(new Word("minto wuksus","Where are you going?",R.raw.phrase_where_are_you_going));
        phrases.add(new Word("tinnә oyaase'nә","What is your name?",R.raw.phrase_what_is_your_name));
        phrases.add(new Word("oyaaset...","My name is....",R.raw.phrase_my_name_is));
        phrases.add(new Word("michәksәs?","How are you feeling?",R.raw.phrase_how_are_you_feeling));
        phrases.add(new Word("kuchi achit","I'm feeling good.",R.raw.phrase_im_feeling_good));
        WordAdapter phraseAdapter=new WordAdapter(this,phrases);
        phraseListview.setAdapter(phraseAdapter);
    }
}
