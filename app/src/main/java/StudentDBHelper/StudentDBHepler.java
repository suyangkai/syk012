package StudentDBHelper;

import TableContanst.TableContanst;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
public class StudentDBHepler extends SQLiteOpenHelper {
    private static final String TAG = "StudentDBHelper";
    public static final String DB_NAME = "student_manager.db";
    public static final int VERSION = 1;
    public StudentDBHepler(Context context, String name, CursorFactory factory, int version)
    {
        super(context, name, factory, version);
    }
    public StudentDBHepler(Context context) {
        this(context, DB_NAME, null, VERSION);     }
    @Override
    public void onCreate(SQLiteDatabase db) {
        Log.v(TAG, "onCreate");
        db.execSQL("create table "
                + TableContanst.STUDENT_TABLE                 + "(_id Integer primary key AUTOINCREMENT,"
                + "name char,age integer, sex char, likes char, phone_number char,train_date date, "
                + "modify_time DATETIME)");     }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        Log.v(TAG, "onUpgrade");
    }
}