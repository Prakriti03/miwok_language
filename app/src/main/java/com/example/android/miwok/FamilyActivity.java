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

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {
    ListView listView;
   ArrayList<Word> families;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);
        listView=(ListView)findViewById(R.id.family_listView);
        families=new ArrayList<Word>();
        families.add(new Word("tune","Daughter",R.drawable.family_grandfather,R.raw.family_grandfather));
        families.add(new Word("tune","Daughter",R.drawable.family_grandmother,R.raw.family_grandmother));
        families.add(new Word("tune","Daughter",R.drawable.family_father,R.raw.family_father));
        families.add(new Word("tune","Daughter",R.drawable.family_mother,R.raw.family_mother));
        families.add(new Word("tune","Daughter",R.drawable.family_older_brother,R.raw.family_daughter));
        families.add(new Word("tune","Daughter",R.drawable.family_younger_brother,R.raw.family_younger_brother));
        families.add(new Word("tune","Daughter",R.drawable.family_older_sister,R.raw.family_older_sister));
        families.add(new Word("tune","Daughter",R.drawable.family_younger_sister,R.raw.family_younger_sister));
        families.add(new Word("tune","Daughter",R.drawable.family_son,R.raw.family_son));
        families.add(new Word("tune","Daughter",R.drawable.family_daughter,R.raw.family_daughter));
        WordAdapter adapter = new WordAdapter(this,families);
        listView.setAdapter(adapter);

    }
}
