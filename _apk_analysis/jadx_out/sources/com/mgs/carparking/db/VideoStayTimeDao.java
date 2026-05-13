package com.mgs.carparking.db;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import com.mgs.carparking.dbtable.VideoStayTimeEntry;
import ec.b;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class VideoStayTimeDao {
    private static volatile VideoStayTimeDao instance;

    private VideoStayTimeDao() {
    }

    public static VideoStayTimeDao getInstance() {
        if (instance == null) {
            synchronized (VideoStayTimeDao.class) {
                if (instance == null) {
                    instance = new VideoStayTimeDao();
                }
            }
        }
        return instance;
    }

    public void clearHistory() {
        DBHelper.getInstance().getWritableDatabase().delete(VideoStayTimeEntry.TABLE_NAME, "", new String[0]);
    }

    public synchronized void deleteStayTime(VideoStayTimeEntry videoStayTimeEntry) {
        DBHelper.getInstance().getWritableDatabase().delete(VideoStayTimeEntry.TABLE_NAME, "id='" + videoStayTimeEntry.getId() + "'", new String[0]);
    }

    public synchronized long insertStayTime(VideoStayTimeEntry videoStayTimeEntry) {
        if (videoStayTimeEntry == null) {
            return 0L;
        }
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Integer.valueOf(videoStayTimeEntry.getId()));
        contentValues.put("name", videoStayTimeEntry.getName());
        contentValues.put("duration", Long.valueOf(videoStayTimeEntry.getDuration()));
        return writableDatabase.insertWithOnConflict(VideoStayTimeEntry.TABLE_NAME, "id", contentValues, 5);
    }

    public synchronized boolean isExist(int i10) {
        Cursor cursorRawQuery = null;
        try {
            cursorRawQuery = DBHelper.getInstance().getWritableDatabase().rawQuery("select * from video_stay where id='" + i10 + "'", new String[0]);
        } catch (Exception unused) {
            if (cursorRawQuery != null) {
                try {
                    cursorRawQuery.close();
                } catch (Exception e10) {
                    e = e10;
                    e.printStackTrace();
                }
            }
        } catch (Throwable th2) {
            if (cursorRawQuery != null) {
                try {
                    cursorRawQuery.close();
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
            throw th2;
        }
        if (cursorRawQuery.getCount() > 0) {
            try {
                cursorRawQuery.close();
            } catch (Exception e12) {
                e12.printStackTrace();
            }
            return true;
        }
        try {
            cursorRawQuery.close();
        } catch (Exception e13) {
            e = e13;
            e.printStackTrace();
        }
        return false;
    }

    public synchronized ArrayList<VideoStayTimeEntry> queryItemHistory(int i10) {
        ArrayList<VideoStayTimeEntry> arrayList;
        arrayList = new ArrayList<>();
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = DBHelper.getInstance().getWritableDatabase().rawQuery("select * from video_stay where id='" + i10 + "'", new String[0]);
                if (cursorRawQuery.moveToFirst()) {
                    int columnIndex = cursorRawQuery.getColumnIndex("id");
                    int columnIndex2 = cursorRawQuery.getColumnIndex("name");
                    int columnIndex3 = cursorRawQuery.getColumnIndex("duration");
                    do {
                        VideoStayTimeEntry videoStayTimeEntry = new VideoStayTimeEntry();
                        videoStayTimeEntry.setId(cursorRawQuery.getInt(columnIndex));
                        videoStayTimeEntry.setName(cursorRawQuery.getString(columnIndex2));
                        videoStayTimeEntry.setDuration(cursorRawQuery.getLong(columnIndex3));
                        arrayList.add(videoStayTimeEntry);
                    } while (cursorRawQuery.moveToNext());
                }
                try {
                    cursorRawQuery.close();
                } catch (Exception e10) {
                    e = e10;
                    e.printStackTrace();
                }
            } finally {
            }
        } catch (Exception e11) {
            b.c("获取搜索历史数据库失败 >>> " + Log.getStackTraceString(e11));
            if (cursorRawQuery != null) {
                try {
                    cursorRawQuery.close();
                } catch (Exception e12) {
                    e = e12;
                    e.printStackTrace();
                }
            }
        }
        return arrayList;
    }

    public synchronized ArrayList<VideoStayTimeEntry> queryStayTime() {
        ArrayList<VideoStayTimeEntry> arrayList;
        arrayList = new ArrayList<>();
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = DBHelper.getInstance().getWritableDatabase().rawQuery("select * from video_stay order by id desc", new String[0]);
                if (cursorRawQuery.moveToFirst()) {
                    int columnIndex = cursorRawQuery.getColumnIndex("id");
                    int columnIndex2 = cursorRawQuery.getColumnIndex("name");
                    int columnIndex3 = cursorRawQuery.getColumnIndex("duration");
                    do {
                        VideoStayTimeEntry videoStayTimeEntry = new VideoStayTimeEntry();
                        videoStayTimeEntry.setId(cursorRawQuery.getInt(columnIndex));
                        videoStayTimeEntry.setName(cursorRawQuery.getString(columnIndex2));
                        videoStayTimeEntry.setDuration(cursorRawQuery.getLong(columnIndex3));
                        arrayList.add(videoStayTimeEntry);
                    } while (cursorRawQuery.moveToNext());
                }
                try {
                    cursorRawQuery.close();
                } catch (Exception e10) {
                    e = e10;
                    e.printStackTrace();
                }
            } catch (Exception e11) {
                b.c("获取搜索历史数据库失败 >>> " + Log.getStackTraceString(e11));
                if (cursorRawQuery != null) {
                    try {
                        cursorRawQuery.close();
                    } catch (Exception e12) {
                        e = e12;
                        e.printStackTrace();
                    }
                }
            }
        } finally {
        }
        return arrayList;
    }
}
