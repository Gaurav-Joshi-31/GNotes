package com.example.gpets.data;

import android.net.Uri;
import android.provider.BaseColumns;

public final class PetContract {


    public static final String CONTENT_AUTHORITY = "com.example.gpets";
    public static final Uri BASE_CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY);
    public static final String PATH_PETS = "pets";
    private PetContract() {}

    public static final class PetEntry implements BaseColumns {


        public final static String TABLE_NAME = "pets";


        public final static String _ID = BaseColumns._ID;


        public final static String COLUMN_PET_NAME ="name";


        public final static String COLUMN_PET_BREED = "breed";


        public final static String COLUMN_PET_GENDER = "gender";


        public final static String COLUMN_PET_WEIGHT = "weight";


        public static final int GENDER_UNKNOWN = 0;
        public static final int GENDER_MALE = 1;
        public static final int GENDER_FEMALE = 2;


        public static final Uri CONTENT_URI = Uri.withAppendedPath(BASE_CONTENT_URI, PATH_PETS);

        public static boolean isValidGender(Integer gender) {
            if (gender == GENDER_UNKNOWN || gender == GENDER_MALE || gender == GENDER_FEMALE) {
                return true;
            }
            return false;
        }
    }

}
