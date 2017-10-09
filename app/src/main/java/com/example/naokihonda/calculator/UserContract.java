package com.example.naokihonda.calculator;

import android.provider.BaseColumns;

import static com.example.naokihonda.calculator.Form.warikan;

/**
 * Created by naokihonda on 2017/09/25.
 */

public final class UserContract {

    //何もしない
    public UserContract(){

    }

    //DB内のカラムを定義
    //implementsでBaseColumnsを実行。カラムに自動で_idがつく。
    public static abstract class Users implements BaseColumns{  
        public static final String TABLE_NAME = "MyTable";
        public static final String COL_DATE = "date";
        public static final String COL_TITLE = "title";
        public static final String COL_RESULT = "result";
    }


}
