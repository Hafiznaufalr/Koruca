package droidmentor.bnv_with_viewpager.db;

import android.provider.BaseColumns;

public class DatabaseContract {

    static final class NoteColumns implements BaseColumns {
        static String TABLE_NAME = "note";

        //Note title
        static String TITLE = "title";
        //Note description
        static String DESCRIPTION = "description";
        //Note date
        static String DATE = "date";

    }
}
