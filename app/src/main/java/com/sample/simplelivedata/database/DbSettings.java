package com.sample.simplelivedata.database;

import android.provider.BaseColumns;

public class DbSettings {

    public static final String DATABSE_NAME = "todo.db";
    public static final int DATABSE_VERSION = 3;

    public class DBEntry implements BaseColumns {
        public static final String TABLE = "list";
        public static final String COL_FAV_URL = "url";
        public static final String COL_FAV_DATE = "date";
    }

}
