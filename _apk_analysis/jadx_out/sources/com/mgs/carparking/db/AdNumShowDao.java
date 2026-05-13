package com.mgs.carparking.db;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.mgs.carparking.dbtable.AdNumShowEntry;
import ec.b;

/* JADX INFO: loaded from: classes8.dex */
public class AdNumShowDao {
    private static volatile AdNumShowDao mInstance;

    private AdNumShowDao() {
    }

    public static AdNumShowDao getInstance() {
        if (mInstance == null) {
            synchronized (AdNumShowDao.class) {
                if (mInstance == null) {
                    mInstance = new AdNumShowDao();
                }
            }
        }
        return mInstance;
    }

    public void deleteAll() {
        DBHelper.getInstance().getWritableDatabase().delete(AdNumShowEntry.TABLE_NAME, null, null);
    }

    public synchronized boolean getAdStatus(int i10) {
        boolean z10;
        Cursor cursorQuery = null;
        boolean z11 = false;
        try {
            try {
                cursorQuery = DBHelper.getInstance().getWritableDatabase().query(AdNumShowEntry.TABLE_NAME, null, "id=?", new String[]{"1"}, null, null, null);
                loop0: while (true) {
                    z10 = false;
                    while (cursorQuery.moveToNext()) {
                        try {
                            if (i10 == 1) {
                                if (cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.CSJREWARDAD)) <= 0) {
                                    break;
                                }
                                z10 = true;
                            } else if (i10 == 2) {
                                if (cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.GDTREWARDAD)) > 0) {
                                    z10 = true;
                                }
                            } else if (i10 != 4) {
                                continue;
                            } else {
                                if (cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.TDREWARDAD)) <= 0) {
                                    break;
                                }
                                z10 = true;
                            }
                        } catch (Exception unused) {
                            z11 = z10;
                            return z11;
                        }
                    }
                    try {
                        break loop0;
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                }
                cursorQuery.close();
                return z10;
            } finally {
                if (0 != 0) {
                    try {
                        cursorQuery.close();
                    } catch (Exception e11) {
                        e11.printStackTrace();
                    }
                }
            }
        } catch (Exception unused2) {
        }
    }

    public synchronized int getNum(int i10) {
        int i11;
        Cursor cursorQuery = null;
        try {
            cursorQuery = DBHelper.getInstance().getWritableDatabase().query(AdNumShowEntry.TABLE_NAME, null, "id=?", new String[]{"1"}, null, null, null);
            i11 = 0;
            while (cursorQuery.moveToNext()) {
                if (i10 == 1) {
                    i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.SPLASHWXNUM));
                } else if (i10 == 2) {
                    i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.SPLASHTDNUM));
                } else if (i10 == 28) {
                    i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.SPLASHTHIRDNUM));
                } else if (i10 == 83) {
                    i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.SPLASHMOBNUM));
                } else if (i10 == 3) {
                    i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.ROTATIONWXNUM));
                } else if (i10 == 4) {
                    i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.ROTATIONTDNUM));
                } else if (i10 == 14) {
                    i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.ROTATIONTHIRDNUM));
                } else if (i10 == 84) {
                    i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.ROTATIONMOBNUM));
                } else if (i10 == 5) {
                    i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.BANNERWXNUM));
                } else if (i10 == 6) {
                    i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.BANNERTDNUM));
                } else if (i10 == 7) {
                    i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.PLAYWXNUM));
                } else if (i10 == 8) {
                    i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.PLAYTDNUM));
                } else if (i10 == 29) {
                    i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.PLAYTHIRDNUM));
                } else if (i10 == 80) {
                    i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.PLAYMOBNUM));
                } else if (i10 == 9) {
                    i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.DOWNLOADWXNUM));
                } else if (i10 == 10) {
                    i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.DOWNLOADTDNUM));
                } else if (i10 == 30) {
                    i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.DOWNLOADTHIRDNUM));
                } else if (i10 == 82) {
                    i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.DOWNLOADMOBNUM));
                } else if (i10 == 11) {
                    i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.PLAYWXINFO));
                } else if (i10 == 12) {
                    i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.PLAYTDINFO));
                } else if (i10 == 13) {
                    i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.PLAYTHIRDINFO));
                } else if (i10 == 81) {
                    i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.PLAYMOBINFO));
                } else if (i10 == 15) {
                    i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.UPDATEWXNUM));
                } else if (i10 == 16) {
                    i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.UPDATETDNUM));
                } else if (i10 == 85) {
                    i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.UPDATEADSETNUM));
                } else if (i10 == 17) {
                    i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.SEARCHWXINFO));
                } else if (i10 == 18) {
                    i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.SEARCHTDINFO));
                } else if (i10 == 19) {
                    i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.SEARCHTHIRDINFO));
                } else if (i10 == 51) {
                    i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.PLAYWXCENTER));
                } else if (i10 == 52) {
                    i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.PLAYTDCENTER));
                } else if (i10 == 53) {
                    i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.PLAYTHIRDCENTER));
                } else if (i10 == 71) {
                    i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.CSJINTERSTITIALHOME));
                } else if (i10 == 72) {
                    i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.GDTINTERSTITIALHOME));
                } else if (i10 == 21) {
                    i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.SPLASHINDEX));
                } else if (i10 == 22) {
                    i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.ROTATIONINDEX));
                } else if (i10 == 23) {
                    i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.PLAYINDEX));
                } else if (i10 == 24) {
                    i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.DOWNLOADINDEX));
                } else if (i10 == 25) {
                    i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.PLAYINFOINDEX));
                } else if (i10 == 26) {
                    i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.UPDATEINDEX));
                } else if (i10 == 27) {
                    i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.SEARCHINDEX));
                } else if (i10 == 50) {
                    i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.PLAYCENTERINDEX));
                } else if (i10 == 70) {
                    i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.INTERSTITIALHOMEINDEX));
                } else if (i10 == 90) {
                    i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.INTERSTITIALHOMEINDEX3));
                } else if (i10 == 91) {
                    i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.WXINTERSTITIALHOME3));
                } else if (i10 == 92) {
                    i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.OPENSETINTERSTITIALHOME3));
                } else if (i10 == 95) {
                    i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.BANNERVIDEOPAUSEINDEX));
                } else if (i10 == 96) {
                    i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.WXBANNERVIDEOPAUSE));
                } else if (i10 == 97) {
                    i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.OSETVIDEOPAUSE));
                } else if (i10 == 100) {
                    i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.BANNERMOREINDEX));
                } else if (i10 == 101) {
                    i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.WXBANNERMORE));
                } else if (i10 == 102) {
                    i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.FLOATVIEWADINDEX));
                } else if (i10 == 103) {
                    i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.WXFLOATVIEWAD));
                } else if (i10 == 104) {
                    i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.RANKBANNERADINDEX));
                } else if (i10 == 105) {
                    i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.WXRANKBANNERAD));
                } else if (i10 == 106) {
                    i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.SEARCHBANNERADINDEX));
                } else if (i10 == 107) {
                    i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.WXSEARCHBANNERAD));
                } else if (i10 == 108) {
                    i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.CLINGREWARDADINDEX));
                } else if (i10 == 109) {
                    i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.WXCLINGREWARDAD));
                } else if (i10 == 110) {
                    i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.OSETCLINGREWARDAD));
                }
            }
            try {
                cursorQuery.close();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        } catch (Exception unused) {
            if (cursorQuery != null) {
                try {
                    cursorQuery.close();
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
            return 0;
        } catch (Throwable th2) {
            if (cursorQuery != null) {
                try {
                    cursorQuery.close();
                } catch (Exception e12) {
                    e12.printStackTrace();
                }
            }
            throw th2;
        }
        return i11;
    }

    public synchronized long insertHistory() {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        Cursor cursorRawQuery = null;
        try {
            cursorRawQuery = writableDatabase.rawQuery("select * from ad_shownum where id='1'", new String[0]);
            if (cursorRawQuery.getCount() > 0) {
                b.c("数据已存在");
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
        contentValues.put("id", (Integer) 1);
        return writableDatabase.insertWithOnConflict(AdNumShowEntry.TABLE_NAME, "id", contentValues, 5);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:59|3|4|51|5|(7:7|8|53|9|(5:10|11|57|12|(1:15)(0))|21|37)(1:20)|60|21|37) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x03b1, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x03b2, code lost:
    
        r1 = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized java.util.ArrayList<com.mgs.carparking.dbtable.AdNumShowEntry> queryHistory() {
        /*
            Method dump skipped, instruction units count: 1007
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mgs.carparking.db.AdNumShowDao.queryHistory():java.util.ArrayList");
    }

    public synchronized void update() {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.SPLASHWXNUM, (Integer) 0);
        contentValues.put(AdNumShowEntry.SPLASHTDNUM, (Integer) 0);
        contentValues.put(AdNumShowEntry.SPLASHTHIRDNUM, (Integer) 0);
        contentValues.put(AdNumShowEntry.SPLASHMOBNUM, (Integer) 0);
        contentValues.put(AdNumShowEntry.ROTATIONWXNUM, (Integer) 0);
        contentValues.put(AdNumShowEntry.ROTATIONTDNUM, (Integer) 0);
        contentValues.put(AdNumShowEntry.ROTATIONTHIRDNUM, (Integer) 0);
        contentValues.put(AdNumShowEntry.ROTATIONMOBNUM, (Integer) 0);
        contentValues.put(AdNumShowEntry.BANNERWXNUM, (Integer) 0);
        contentValues.put(AdNumShowEntry.BANNERTDNUM, (Integer) 0);
        contentValues.put(AdNumShowEntry.PLAYWXNUM, (Integer) 0);
        contentValues.put(AdNumShowEntry.PLAYTDNUM, (Integer) 0);
        contentValues.put(AdNumShowEntry.PLAYTHIRDNUM, (Integer) 0);
        contentValues.put(AdNumShowEntry.PLAYMOBNUM, (Integer) 0);
        contentValues.put(AdNumShowEntry.DOWNLOADWXNUM, (Integer) 0);
        contentValues.put(AdNumShowEntry.DOWNLOADTDNUM, (Integer) 0);
        contentValues.put(AdNumShowEntry.DOWNLOADTHIRDNUM, (Integer) 0);
        contentValues.put(AdNumShowEntry.DOWNLOADMOBNUM, (Integer) 0);
        contentValues.put(AdNumShowEntry.PLAYWXINFO, (Integer) 0);
        contentValues.put(AdNumShowEntry.PLAYTDINFO, (Integer) 0);
        contentValues.put(AdNumShowEntry.PLAYTHIRDINFO, (Integer) 0);
        contentValues.put(AdNumShowEntry.PLAYMOBINFO, (Integer) 0);
        contentValues.put(AdNumShowEntry.UPDATEWXNUM, (Integer) 0);
        contentValues.put(AdNumShowEntry.UPDATETDNUM, (Integer) 0);
        contentValues.put(AdNumShowEntry.UPDATEADSETNUM, (Integer) 0);
        contentValues.put(AdNumShowEntry.SEARCHWXINFO, (Integer) 0);
        contentValues.put(AdNumShowEntry.SEARCHTDINFO, (Integer) 0);
        contentValues.put(AdNumShowEntry.SEARCHTHIRDINFO, (Integer) 0);
        contentValues.put(AdNumShowEntry.PLAYWXCENTER, (Integer) 0);
        contentValues.put(AdNumShowEntry.PLAYTDCENTER, (Integer) 0);
        contentValues.put(AdNumShowEntry.PLAYTHIRDCENTER, (Integer) 0);
        contentValues.put(AdNumShowEntry.CSJINTERSTITIALHOME, (Integer) 0);
        contentValues.put(AdNumShowEntry.GDTINTERSTITIALHOME, (Integer) 0);
        contentValues.put(AdNumShowEntry.WXBANNERVIDEOPAUSE, (Integer) 0);
        contentValues.put(AdNumShowEntry.OSETVIDEOPAUSE, (Integer) 0);
        contentValues.put(AdNumShowEntry.WXBANNERMORE, (Integer) 0);
        contentValues.put(AdNumShowEntry.WXFLOATVIEWAD, (Integer) 0);
        contentValues.put(AdNumShowEntry.WXRANKBANNERAD, (Integer) 0);
        contentValues.put(AdNumShowEntry.WXSEARCHBANNERAD, (Integer) 0);
        contentValues.put(AdNumShowEntry.WXCLINGREWARDAD, (Integer) 0);
        contentValues.put(AdNumShowEntry.OSETCLINGREWARDAD, (Integer) 0);
        contentValues.put(AdNumShowEntry.SPLASHINDEX, (Integer) (-1));
        contentValues.put(AdNumShowEntry.ROTATIONINDEX, (Integer) (-1));
        contentValues.put(AdNumShowEntry.BANNERMOREINDEX, (Integer) (-1));
        contentValues.put(AdNumShowEntry.PLAYINDEX, (Integer) (-1));
        contentValues.put(AdNumShowEntry.DOWNLOADINDEX, (Integer) (-1));
        contentValues.put(AdNumShowEntry.PLAYINFOINDEX, (Integer) (-1));
        contentValues.put(AdNumShowEntry.UPDATEINDEX, (Integer) (-1));
        contentValues.put(AdNumShowEntry.SEARCHINDEX, (Integer) (-1));
        contentValues.put(AdNumShowEntry.PLAYCENTERINDEX, (Integer) (-1));
        contentValues.put(AdNumShowEntry.INTERSTITIALHOMEINDEX, (Integer) (-1));
        contentValues.put(AdNumShowEntry.CSJREWARDAD, (Integer) 0);
        contentValues.put(AdNumShowEntry.GDTREWARDAD, (Integer) 0);
        contentValues.put(AdNumShowEntry.TDREWARDAD, (Integer) 0);
        contentValues.put(AdNumShowEntry.WXINTERSTITIALHOME3, (Integer) 0);
        contentValues.put(AdNumShowEntry.OPENSETINTERSTITIALHOME3, (Integer) 0);
        contentValues.put(AdNumShowEntry.INTERSTITIALHOMEINDEX3, (Integer) (-1));
        contentValues.put(AdNumShowEntry.BANNERVIDEOPAUSEINDEX, (Integer) (-1));
        contentValues.put(AdNumShowEntry.FLOATVIEWADINDEX, (Integer) (-1));
        contentValues.put(AdNumShowEntry.RANKBANNERADINDEX, (Integer) (-1));
        contentValues.put(AdNumShowEntry.SEARCHBANNERADINDEX, (Integer) (-1));
        contentValues.put(AdNumShowEntry.CLINGREWARDADINDEX, (Integer) (-1));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updateAdsetNum(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.UPDATEADSETNUM, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updateBannerModeIndex(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.BANNERMOREINDEX, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updateBannerMoreNum(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.WXBANNERMORE, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updateBannerVideoPauseIndexNum(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.BANNERVIDEOPAUSEINDEX, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updateBannerWxNum(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.BANNERWXNUM, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updateCSJRewardAd(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.CSJREWARDAD, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updateClingRewardIndex(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.CLINGREWARDADINDEX, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updateClingRewardOsetNum(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.OSETCLINGREWARDAD, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updateClingRewardWxNum(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.WXCLINGREWARDAD, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updateDownloadIndex(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.DOWNLOADINDEX, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updateDownloadMobNum(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.DOWNLOADMOBNUM, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updateDownloadTdNum(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.DOWNLOADTDNUM, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updateDownloadThirdNum(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.DOWNLOADTHIRDNUM, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updateDownloadWxNum(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.DOWNLOADWXNUM, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updateFloatAdIndexNum(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.FLOATVIEWADINDEX, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updateGDTRewardAd(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.GDTREWARDAD, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updateHome3Index(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.INTERSTITIALHOMEINDEX3, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updateHome3Num(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.WXINTERSTITIALHOME3, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updateInterstitialHomeCSJ(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.CSJINTERSTITIALHOME, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updateInterstitialHomeGDT(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.GDTINTERSTITIALHOME, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updateInterstitialHomeIndex(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.INTERSTITIALHOMEINDEX, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updateOpenSetHome3Num(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.OPENSETINTERSTITIALHOME3, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updateOsetVideoPauseNum(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.OSETVIDEOPAUSE, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updatePlayCenterIndex(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.PLAYCENTERINDEX, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updatePlayCenterTdNum(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.PLAYTDCENTER, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updatePlayCenterThirdNum(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.PLAYTHIRDCENTER, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updatePlayCenterWxNum(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.PLAYWXCENTER, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updatePlayIndex(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.PLAYINDEX, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updatePlayInfoIndex(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.PLAYINFOINDEX, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updatePlayInfoMobNum(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.PLAYMOBINFO, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updatePlayInfoTd1Num(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.PLAYTHIRDINFO, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updatePlayInfoTdNum(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.PLAYTDINFO, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updatePlayInfoWxNum(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.PLAYWXINFO, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updatePlayMobNum(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.PLAYMOBNUM, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updatePlayTdNum(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.PLAYTDNUM, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updatePlayThirdNum(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.PLAYTHIRDNUM, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updatePlayWxNum(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.PLAYWXNUM, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updateRankBannerAdIndexNum(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.RANKBANNERADINDEX, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updateRotationIndex(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.ROTATIONINDEX, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updateRotationMobNum(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.ROTATIONMOBNUM, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updateRotationTd1Num(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.ROTATIONTHIRDNUM, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updateRotationTdNum(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.ROTATIONTDNUM, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updateRotationWxNum(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.ROTATIONWXNUM, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updateSearchBannerAdIndexNum(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.SEARCHBANNERADINDEX, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updateSearchIndex(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.SEARCHINDEX, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updateSearchInfoTd1Num(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.SEARCHTHIRDINFO, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updateSearchInfoTdNum(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.SEARCHTDINFO, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updateSearchInfoWxNum(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.SEARCHWXINFO, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updateSplashIndex(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.SPLASHINDEX, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updateSplashMobNum(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.SPLASHMOBNUM, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updateSplashTdNum(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.SPLASHTDNUM, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updateSplashThirdNum(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.SPLASHTHIRDNUM, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updateSplashWxNum() {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.SPLASHWXNUM, Integer.valueOf(getNum(1) + 1));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updateTDRewardAd(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.TDREWARDAD, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updateUpdateIndex(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.UPDATEINDEX, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updateUpdateTdNum(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.UPDATETDNUM, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updateUpdateWxNum(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.UPDATEWXNUM, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updateWxBannerVideoPauseNum(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.WXBANNERVIDEOPAUSE, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updateWxFloatAdNum(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.WXFLOATVIEWAD, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updateWxRankBannerAdNum(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.WXRANKBANNERAD, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updateWxSearchBannerAdNum(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.WXSEARCHBANNERAD, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }
}
