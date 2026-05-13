package sg.bigo.ads.common.g.b;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f82121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f82122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f82123c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f82124d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f82125e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f82126f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f82127g;

    public a(Cursor cursor) {
        this.f82121a = -1L;
        this.f82121a = cursor.getLong(cursor.getColumnIndex("_id"));
        this.f82122b = cursor.getString(cursor.getColumnIndex("event_action"));
        this.f82123c = cursor.getString(cursor.getColumnIndex("event_info"));
        this.f82124d = cursor.getInt(cursor.getColumnIndex("states"));
        this.f82125e = cursor.getString(cursor.getColumnIndex("ext"));
        this.f82126f = cursor.getLong(cursor.getColumnIndex("ctime"));
        this.f82127g = cursor.getLong(cursor.getColumnIndex("mtime"));
    }

    public a(String str, String str2) {
        this.f82121a = -1L;
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f82122b = str;
        this.f82123c = str2;
        this.f82124d = 0;
        this.f82125e = "";
        this.f82126f = jCurrentTimeMillis;
        this.f82127g = jCurrentTimeMillis;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != a.class) {
            return false;
        }
        long j10 = this.f82121a;
        return j10 >= 0 && j10 == ((a) obj).f82121a;
    }

    @NonNull
    public String toString() {
        return "mId = " + this.f82121a + ",eventInfo=" + this.f82123c;
    }
}
