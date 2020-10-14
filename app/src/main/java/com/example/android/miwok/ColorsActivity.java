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

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ColorsActivity extends AppCompatActivity {
ListView listView;
ArrayList<Word> colors;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);
        listView=(ListView)findViewById(R.id.list);
        colors=new ArrayList<>();
        colors.add(new Word("hatti","mutti",R.drawable.color_brown,R.raw.color_black));
        colors.add(new Word("hatti","mutti",R.drawable.color_dusty_yellow,R.raw.color_black));
        colors.add(new Word("hatti","mutti",R.drawable.color_mustard_yellow,R.raw.color_black));
        colors.add(new Word ("hatti","mutti",R.drawable.color_black,R.raw.color_black));
        colors.add(new Word("hatti","mutti",R.drawable.color_green,R.raw.color_black));
        colors.add(new Word("hatti","mutti",R.drawable.color_gray,R.raw.color_black));
        colors.add(new Word("hatti","mutti",R.drawable.color_red,R.raw.color_black));
        colors.add(new Word("hatti","mutti",R.drawable.color_white,R.raw.color_black));
        WordAdapter adapter = new WordAdapter(this,colors);
        listView.setAdapter(adapter);
    }
}
