package com.inmobi.media;

import android.content.ContentValues;

/* JADX INFO: renamed from: com.inmobi.media.zb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC3906zb {
    public static final ContentValues a(C3682qb c3682qb) {
        tn.p.k(c3682qb, "<this>");
        ContentValues contentValues = new ContentValues();
        contentValues.put("filename", c3682qb.f27957a);
        contentValues.put("saveTimestamp", Long.valueOf(c3682qb.f27958b));
        contentValues.put("retryCount", Integer.valueOf(c3682qb.f27959c));
        contentValues.put("lastRetryTimestamp", Long.valueOf(c3682qb.f27960d));
        contentValues.put("checkpoints", Integer.valueOf(c3682qb.f27962f));
        contentValues.put("hasLoggerFinished", Integer.valueOf(c3682qb.f27961e ? 1 : 0));
        return contentValues;
    }

    public static final C3682qb a(ContentValues contentValues) {
        tn.p.k(contentValues, "<this>");
        String asString = contentValues.getAsString("filename");
        tn.p.j(asString, "getAsString(...)");
        Long asLong = contentValues.getAsLong("saveTimestamp");
        tn.p.j(asLong, "getAsLong(...)");
        long jLongValue = asLong.longValue();
        Integer asInteger = contentValues.getAsInteger("retryCount");
        tn.p.j(asInteger, "getAsInteger(...)");
        int iIntValue = asInteger.intValue();
        Long asLong2 = contentValues.getAsLong("lastRetryTimestamp");
        tn.p.j(asLong2, "getAsLong(...)");
        long jLongValue2 = asLong2.longValue();
        Integer asInteger2 = contentValues.getAsInteger("checkpoints");
        tn.p.j(asInteger2, "getAsInteger(...)");
        int iIntValue2 = asInteger2.intValue();
        Integer asInteger3 = contentValues.getAsInteger("hasLoggerFinished");
        return new C3682qb(asString, jLongValue, iIntValue, jLongValue2, asInteger3 != null && asInteger3.intValue() == 1, iIntValue2);
    }
}
