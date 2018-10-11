package blake.planetatree;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class MySqliteHelper extends SQLiteOpenHelper {
    private final String TABLE_NAME_TREE = "tree";
    private final String VALUE_HEIGHT = "height";
    private final String VALUE_NAME = "name";
    private final String VALUE_PLACE = "place";
    private final String VALUE_GROWTH = "growth";
    private final String VALUE_PRICE = "price";

    private final String CREATE_TREE = "create table " + TABLE_NAME_TREE + "(" +
            VALUE_NAME + " text primary key," +
            VALUE_HEIGHT + " integer," +
            VALUE_GROWTH + " integer," +
            VALUE_PLACE + " text," +
            VALUE_PRICE + " integer,"+
            ")";

    public MySqliteHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table tree ( name varchar(64) primary key,height integer, growth integer, place varchar(64), price integer)" );
        db.execSQL("insert into "+TABLE_NAME_TREE+" values('pine',95,11,Ahipara,100)");
        db.execSQL("insert into "+TABLE_NAME_TREE+" values('cedar',80,14,Auckland,200)");
        db.execSQL("insert into "+TABLE_NAME_TREE+" values('larch',110,18,Clevedon,500)");
        db.execSQL("insert into "+TABLE_NAME_TREE+" values('cypress',72,26,Clive,150)");
        db.execSQL("insert into "+TABLE_NAME_TREE+" values('fir',63,25,Dobson,120)");
        db.execSQL("insert into "+TABLE_NAME_TREE+" values('spruce',79,21,Drury,130)");
        db.execSQL("insert into "+TABLE_NAME_TREE+" values('aspen',77,20,Enfield,140)");
        db.execSQL("insert into "+TABLE_NAME_TREE+" values('oak',72,18,Fitzroy,220)");
        db.execSQL("insert into "+TABLE_NAME_TREE+" values('maple',78,19,Auckland,240)");
        db.execSQL("insert into "+TABLE_NAME_TREE+" values('elm',70,17,Doyleston,190)");
        db.execSQL("insert into "+TABLE_NAME_TREE+" values('mulbberry',80,21,Devonport,233)");
        db.execSQL("insert into "+TABLE_NAME_TREE+" values('palm',91,12,Crownwell,196)");
        db.execSQL("insert into "+TABLE_NAME_TREE+" values('holly',93,13,Christchurch,209)");
        db.execSQL("insert into "+TABLE_NAME_TREE+" values('banyan',95,11,Drury,127)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

}
