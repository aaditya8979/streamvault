package sg.bigo.ads.common.g.b;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.common.utils.j;

/* JADX INFO: loaded from: classes12.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f82135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f82136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f82137c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f82138d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f82139e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f82140f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f82141g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Map<String, String> f82142h;

    public c(Cursor cursor) {
        this.f82135a = -1L;
        this.f82136b = false;
        this.f82137c = 0;
        this.f82138d = 0L;
        this.f82139e = "";
        this.f82135a = cursor.getLong(cursor.getColumnIndex("_id"));
        try {
            this.f82142h = j.a(new JSONObject(cursor.getString(cursor.getColumnIndex("ad_data"))));
        } catch (JSONException unused) {
        }
        a(cursor.getString(cursor.getColumnIndex("tracker_imp")));
        b(cursor.getString(cursor.getColumnIndex("tracker_cli")));
        c(cursor.getString(cursor.getColumnIndex("tracker_nurl")));
        d(cursor.getString(cursor.getColumnIndex("tracker_lurl")));
        this.f82137c = cursor.getInt(cursor.getColumnIndex("tracker_type"));
        this.f82138d = cursor.getLong(cursor.getColumnIndex("last_retry_ts"));
        this.f82139e = cursor.getString(cursor.getColumnIndex("ext"));
        this.f82140f = cursor.getLong(cursor.getColumnIndex("ctime"));
        this.f82141g = cursor.getLong(cursor.getColumnIndex("mtime"));
        this.f82136b = true;
    }

    public c(@NonNull Map<String, String> map) {
        this.f82135a = -1L;
        this.f82136b = false;
        this.f82137c = 0;
        this.f82138d = 0L;
        this.f82139e = "";
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f82142h = map;
        this.f82140f = jCurrentTimeMillis;
        this.f82141g = jCurrentTimeMillis;
    }

    @NonNull
    public final String a() {
        Map<String, String> map = this.f82142h;
        if (map == null) {
            return "";
        }
        if ((map instanceof HashMap) && map != null) {
            map.remove(null);
            map.values().removeAll(Collections.singleton(null));
        }
        return new JSONObject(this.f82142h).toString();
    }

    public abstract void a(String str);

    @NonNull
    public abstract String b();

    public abstract void b(String str);

    @NonNull
    public abstract String c();

    public abstract void c(String str);

    @NonNull
    public abstract String d();

    public abstract void d(String str);

    @NonNull
    public abstract String e();

    public boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != c.class) {
            return false;
        }
        long j10 = this.f82135a;
        return j10 >= 0 && j10 == ((c) obj).f82135a;
    }

    public long f() {
        return 0L;
    }

    @NonNull
    public String toString() {
        return "mId = " + this.f82135a;
    }
}
