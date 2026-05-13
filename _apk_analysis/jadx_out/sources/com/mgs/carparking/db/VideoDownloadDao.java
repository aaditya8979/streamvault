package com.mgs.carparking.db;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.mgs.carparking.dbtable.VideoDownloadEntity;
import zp.g;

/* JADX INFO: loaded from: classes2.dex */
public class VideoDownloadDao {
    private static volatile VideoDownloadDao instance;

    private VideoDownloadDao() {
    }

    public static VideoDownloadDao getInstance() {
        if (instance == null) {
            synchronized (VideoDownloadDao.class) {
                if (instance == null) {
                    instance = new VideoDownloadDao();
                }
            }
        }
        return instance;
    }

    public void clearHistory() {
        DBHelper.getInstance().getWritableDatabase().delete(VideoDownloadEntity.TABLE_NAME, "", new String[0]);
    }

    public synchronized void deleteHistory(VideoDownloadEntity videoDownloadEntity) {
        DBHelper.getInstance().getWritableDatabase().delete(VideoDownloadEntity.TABLE_NAME, "streamid='" + videoDownloadEntity.getStreamid() + "'", new String[0]);
    }

    public synchronized void deleteHistory(String str) {
        DBHelper.getInstance().getWritableDatabase().delete(VideoDownloadEntity.TABLE_NAME, "streamid='" + str + "'", new String[0]);
    }

    public synchronized long insertHistory(VideoDownloadEntity videoDownloadEntity) {
        if (videoDownloadEntity == null) {
            return 0L;
        }
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        Cursor cursorRawQuery = null;
        try {
            cursorRawQuery = writableDatabase.rawQuery("select * from video_download where streamid='" + videoDownloadEntity.getStreamid() + "'", new String[0]);
            if (cursorRawQuery.getCount() > 0) {
                g.b("数据已存在");
                try {
                    cursorRawQuery.close();
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                return 0L;
            }
            try {
                cursorRawQuery.close();
            } catch (Exception e11) {
                e = e11;
                e.printStackTrace();
            }
        } catch (Exception unused) {
            if (cursorRawQuery != null) {
                try {
                    cursorRawQuery.close();
                } catch (Exception e12) {
                    e = e12;
                    e.printStackTrace();
                }
            }
        } catch (Throwable th2) {
            if (cursorRawQuery != null) {
                try {
                    cursorRawQuery.close();
                } catch (Exception e13) {
                    e13.printStackTrace();
                }
            }
            throw th2;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Integer.valueOf(videoDownloadEntity.getId()));
        contentValues.put("name", videoDownloadEntity.getName());
        contentValues.put(VideoDownloadEntity.LAST_NAME, videoDownloadEntity.getLastName());
        contentValues.put("coverUrl", videoDownloadEntity.getCoverUrl());
        contentValues.put("videoType", Integer.valueOf(videoDownloadEntity.getVideoType()));
        contentValues.put("updateTime", Long.valueOf(videoDownloadEntity.getUpdateTime()));
        contentValues.put("url", videoDownloadEntity.getUrl());
        contentValues.put("complete", Integer.valueOf(videoDownloadEntity.getComplete()));
        contentValues.put("size", Long.valueOf(videoDownloadEntity.getSize()));
        contentValues.put(VideoDownloadEntity.COMPLETE_NAME, videoDownloadEntity.getComplete_name());
        contentValues.put(VideoDownloadEntity.STREAMID, videoDownloadEntity.getStreamid());
        contentValues.put("status", Integer.valueOf(videoDownloadEntity.getStatus()));
        contentValues.put(VideoDownloadEntity.ORGINAL_URL, videoDownloadEntity.getOrginal_url());
        contentValues.put("collection", Integer.valueOf(videoDownloadEntity.getCollection()));
        contentValues.put(VideoDownloadEntity.DOWN_URL, videoDownloadEntity.getDown_url());
        contentValues.put(VideoDownloadEntity.VIDEO_POSITION, Integer.valueOf(videoDownloadEntity.getVideo_position()));
        contentValues.put(VideoDownloadEntity.AUDIO_TYPE, Integer.valueOf(videoDownloadEntity.getAudio_type()));
        return writableDatabase.insertWithOnConflict(VideoDownloadEntity.TABLE_NAME, "name", contentValues, 5);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:62|3|4|51|5|(7:7|8|53|9|(5:10|11|57|12|(1:15)(0))|21|37)(1:20)|60|21|37) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0143, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0144, code lost:
    
        r1 = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized java.util.ArrayList<com.mgs.carparking.dbtable.VideoDownloadEntity> queryHistory() {
        /*
            Method dump skipped, instruction units count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mgs.carparking.db.VideoDownloadDao.queryHistory():java.util.ArrayList");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:(2:60|5)|(7:7|8|49|9|(5:10|11|53|12|(1:15)(0))|21|37)(1:20)|56|21|37) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0159, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x015a, code lost:
    
        r1 = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized java.util.ArrayList<com.mgs.carparking.dbtable.VideoDownloadEntity> queryItemHistory(int r22) {
        /*
            Method dump skipped, instruction units count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mgs.carparking.db.VideoDownloadDao.queryItemHistory(int):java.util.ArrayList");
    }

    public synchronized void updateHistory(int i10, String str, long j10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("complete", Integer.valueOf(i10));
        contentValues.put("size", Long.valueOf(j10));
        writableDatabase.update(VideoDownloadEntity.TABLE_NAME, contentValues, "streamid='" + str + "'", null);
    }
}
