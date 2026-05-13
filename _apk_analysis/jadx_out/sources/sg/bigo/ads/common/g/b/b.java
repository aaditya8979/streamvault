package sg.bigo.ads.common.g.b;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* JADX INFO: loaded from: classes12.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f82128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f82129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f82130c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f82131d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f82132e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f82133f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f82134g;

    public b(Cursor cursor) {
        this.f82128a = -1L;
        this.f82128a = cursor.getLong(cursor.getColumnIndex("_id"));
        this.f82129b = cursor.getString(cursor.getColumnIndex("event_id"));
        this.f82130c = cursor.getString(cursor.getColumnIndex("event_info"));
        this.f82131d = cursor.getLong(cursor.getColumnIndex("expired_ts"));
        this.f82132e = cursor.getString(cursor.getColumnIndex("ext"));
        this.f82133f = cursor.getLong(cursor.getColumnIndex("ctime"));
        this.f82134g = cursor.getLong(cursor.getColumnIndex("mtime"));
    }

    public b(String str, String str2, long j10) {
        this.f82128a = -1L;
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f82129b = str;
        this.f82130c = str2;
        this.f82131d = j10;
        this.f82132e = "";
        this.f82133f = jCurrentTimeMillis;
        this.f82134g = jCurrentTimeMillis;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != b.class) {
            return false;
        }
        long j10 = this.f82128a;
        return j10 >= 0 && j10 == ((b) obj).f82128a;
    }

    @NonNull
    public String toString() {
        return "mId = " + this.f82128a + StringUtils.COMMA + "mEventId = " + this.f82129b + StringUtils.COMMA + "mExpiredTs = " + this.f82131d + StringUtils.COMMA + "eventInfo = " + this.f82130c;
    }
}
