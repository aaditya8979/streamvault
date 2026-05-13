package com.mgs.carparking.db;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.mgs.carparking.dbtable.VideoLookHistoryEntry;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public class VideoLookHistoryDao {
    private static volatile VideoLookHistoryDao instance;

    private VideoLookHistoryDao() {
    }

    public static VideoLookHistoryDao getInstance() {
        if (instance == null) {
            synchronized (VideoLookHistoryDao.class) {
                if (instance == null) {
                    instance = new VideoLookHistoryDao();
                }
            }
        }
        return instance;
    }

    public void clearHistory() {
        DBHelper.getInstance().getWritableDatabase().delete(VideoLookHistoryEntry.TABLE_NAME, "", new String[0]);
    }

    public synchronized void deleteHistory(VideoLookHistoryEntry videoLookHistoryEntry) {
        DBHelper.getInstance().getWritableDatabase().delete(VideoLookHistoryEntry.TABLE_NAME, "id='" + videoLookHistoryEntry.getId() + "'", new String[0]);
    }

    public synchronized long insertHistory(VideoLookHistoryEntry videoLookHistoryEntry) {
        if (videoLookHistoryEntry == null) {
            return 0L;
        }
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        Cursor cursor = null;
        try {
            Cursor cursorRawQuery = writableDatabase.rawQuery("select * from video_history where id='" + videoLookHistoryEntry.getId() + "'", new String[0]);
            if (cursorRawQuery.getCount() > 0) {
                deleteHistory(videoLookHistoryEntry);
            } else {
                ArrayList<VideoLookHistoryEntry> arrayListQueryHistory = queryHistory();
                if (arrayListQueryHistory != null && arrayListQueryHistory.size() == 50) {
                    deleteHistory(arrayListQueryHistory.get(49));
                }
            }
            try {
                cursorRawQuery.close();
            } catch (Exception e10) {
                e = e10;
                e.printStackTrace();
            }
        } catch (Exception unused) {
            if (0 != 0) {
                try {
                    cursor.close();
                } catch (Exception e11) {
                    e = e11;
                    e.printStackTrace();
                }
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                try {
                    cursor.close();
                } catch (Exception e12) {
                    e12.printStackTrace();
                }
            }
            throw th2;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Integer.valueOf(videoLookHistoryEntry.getId()));
        contentValues.put("name", videoLookHistoryEntry.getName());
        contentValues.put("coverUrl", videoLookHistoryEntry.getCoverUrl());
        contentValues.put("videoType", Integer.valueOf(videoLookHistoryEntry.getVideoType()));
        contentValues.put(VideoLookHistoryEntry.VIDEO_DESC, videoLookHistoryEntry.getVideoDesc());
        contentValues.put("updateTime", Long.valueOf(videoLookHistoryEntry.getUpdateTime()));
        contentValues.put("url", videoLookHistoryEntry.getUrl());
        contentValues.put(VideoLookHistoryEntry.CURRNET, Integer.valueOf(videoLookHistoryEntry.getCurrent()));
        contentValues.put(VideoLookHistoryEntry.CONTENNT_POSITION, Long.valueOf(videoLookHistoryEntry.getContentPosition()));
        contentValues.put("duration", Long.valueOf(videoLookHistoryEntry.getDuration()));
        contentValues.put(VideoLookHistoryEntry.ISNOTSHARE, Integer.valueOf(videoLookHistoryEntry.is_not_share()));
        contentValues.put("collection", Integer.valueOf(videoLookHistoryEntry.getCollection()));
        contentValues.put(VideoLookHistoryEntry.AUDIOTYPE, videoLookHistoryEntry.getAudiotype());
        contentValues.put(VideoLookHistoryEntry.SUBTITLETYPE, videoLookHistoryEntry.getSubtitletype());
        return writableDatabase.insertWithOnConflict(VideoLookHistoryEntry.TABLE_NAME, "name", contentValues, 5);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:50|5|(5:7|8|(6:53|9|10|57|11|(1:14)(0))|20|36)(1:19)|59|20|36) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0106, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0107, code lost:
    
        r1 = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized java.util.ArrayList<com.mgs.carparking.dbtable.VideoLookHistoryEntry> queryHistory() {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mgs.carparking.db.VideoLookHistoryDao.queryHistory():java.util.ArrayList");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:51|3|4|(2:48|5)|(5:7|8|(6:55|9|10|59|11|(1:14)(0))|20|36)(1:19)|49|20|36) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x011c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x011d, code lost:
    
        r1 = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized java.util.ArrayList<com.mgs.carparking.dbtable.VideoLookHistoryEntry> queryItemHistory(int r20) {
        /*
            Method dump skipped, instruction units count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mgs.carparking.db.VideoLookHistoryDao.queryItemHistory(int):java.util.ArrayList");
    }

    public synchronized void updateHistory(int i10, int i11) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(VideoLookHistoryEntry.ISNOTSHARE, Integer.valueOf(i10));
        writableDatabase.update(VideoLookHistoryEntry.TABLE_NAME, contentValues, "id='" + i11 + "'", null);
    }
}
