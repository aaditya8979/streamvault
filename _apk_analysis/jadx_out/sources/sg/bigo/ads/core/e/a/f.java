package sg.bigo.ads.core.e.a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import androidx.annotation.NonNull;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import sg.bigo.ads.api.core.q;
import sg.bigo.ads.core.e.b;

/* JADX INFO: loaded from: classes.dex */
public final class f extends sg.bigo.ads.common.g.b.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f83830i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f83831j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f83832k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f83833l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f83834m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f83835n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f83836o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f83837p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NonNull
    public final q f83838q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f83839r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public CopyOnWriteArrayList<e> f83840s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public CopyOnWriteArrayList<e> f83841t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public CopyOnWriteArrayList<e> f83842u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public CopyOnWriteArrayList<e> f83843v;

    public f(@NonNull q qVar, Cursor cursor) {
        super(cursor);
        this.f83830i = 0;
        this.f83831j = 0L;
        this.f83832k = 0;
        this.f83833l = 0L;
        this.f83834m = 0;
        this.f83835n = 0L;
        this.f83836o = 0;
        this.f83837p = 0L;
        this.f83838q = qVar;
        this.f82137c = 1;
    }

    public f(@NonNull q qVar, @NonNull Map<String, String> map) {
        super(map);
        this.f83830i = 0;
        this.f83831j = 0L;
        this.f83832k = 0;
        this.f83833l = 0L;
        this.f83834m = 0;
        this.f83835n = 0L;
        this.f83836o = 0;
        this.f83837p = 0L;
        this.f83838q = qVar;
        this.f82137c = 1;
    }

    private void a(Context context, final String str, final e eVar) {
        String str2 = eVar.f83818b;
        if (eVar.b()) {
            if ("impl_track".equals(str)) {
                this.f83840s.remove(eVar);
                return;
            }
            if ("click_track".equals(str)) {
                this.f83841t.remove(eVar);
                return;
            } else if ("nurl_track".equals(str)) {
                this.f83842u.remove(eVar);
                return;
            } else {
                if ("lurl_track".equals(str)) {
                    this.f83843v.remove(eVar);
                    return;
                }
                return;
            }
        }
        int i10 = this.f83830i;
        if ("click_track".equals(str)) {
            i10 = this.f83832k;
        } else if ("nurl_track".equals(str)) {
            i10 = this.f83834m;
        } else if ("lurl_track".equals(str)) {
            i10 = this.f83836o;
        }
        int i11 = i10;
        sg.bigo.ads.common.u.a aVarD = eVar.d();
        int i12 = eVar.f83819c;
        eVar.a();
        sg.bigo.ads.core.e.b.a(context, i12, str, aVarD, str2, this.f83839r, this.f82136b, i11, this.f82142h, new b.a() { // from class: sg.bigo.ads.core.e.a.f.1
            @Override // sg.bigo.ads.core.e.b.a
            public final void a() {
                d.a().b(f.this);
            }

            @Override // sg.bigo.ads.core.e.b.a
            public final boolean a(int i13) {
                return f.this.f83838q.a(i13);
            }

            @Override // sg.bigo.ads.core.e.b.a
            public final void b() {
                CopyOnWriteArrayList<e> copyOnWriteArrayList;
                if ("impl_track".equals(str)) {
                    copyOnWriteArrayList = f.this.f83840s;
                } else if ("click_track".equals(str)) {
                    copyOnWriteArrayList = f.this.f83841t;
                } else {
                    if (!"nurl_track".equals(str)) {
                        if ("lurl_track".equals(str)) {
                            copyOnWriteArrayList = f.this.f83843v;
                        }
                        d.a().b(f.this);
                    }
                    copyOnWriteArrayList = f.this.f83842u;
                }
                copyOnWriteArrayList.remove(eVar);
                d.a().b(f.this);
            }
        });
    }

    private static boolean a(List<e> list) {
        return list != null && list.size() == 0;
    }

    @SuppressLint({"ConcurrentModification"})
    public final void a(Context context) {
        Iterator<e> it = this.f83840s.iterator();
        while (it.hasNext()) {
            a(context, "impl_track", it.next());
        }
    }

    @Override // sg.bigo.ads.common.g.b.c
    public final void a(String str) {
        if (sg.bigo.ads.common.utils.q.a((CharSequence) str)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            this.f83840s = new CopyOnWriteArrayList<>();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                this.f83840s.add(new e(jSONArray.getJSONObject(i10)));
            }
        } catch (JSONException unused) {
        }
    }

    public final boolean a(int i10) {
        return this.f83838q.b(i10);
    }

    public final boolean a(List<e> list, int i10) {
        return list == null || list.size() == 0 || !a(i10);
    }

    @SuppressLint({"ConcurrentModification"})
    public final int b(Context context) {
        Iterator<e> it = this.f83841t.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10++;
            a(context, "click_track", it.next());
        }
        return i10;
    }

    @Override // sg.bigo.ads.common.g.b.c
    @NonNull
    public final String b() {
        if (this.f83840s == null) {
            return "";
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<e> it = this.f83840s.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().f83821e);
        }
        return jSONArray.toString();
    }

    @Override // sg.bigo.ads.common.g.b.c
    public final void b(String str) {
        if (sg.bigo.ads.common.utils.q.a((CharSequence) str)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            this.f83841t = new CopyOnWriteArrayList<>();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                this.f83841t.add(new e(jSONArray.getJSONObject(i10)));
            }
        } catch (JSONException unused) {
        }
    }

    @SuppressLint({"ConcurrentModification"})
    public final int c(Context context) {
        Iterator<e> it = this.f83842u.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10++;
            a(context, "nurl_track", it.next());
        }
        return i10;
    }

    @Override // sg.bigo.ads.common.g.b.c
    @NonNull
    public final String c() {
        if (this.f83841t == null) {
            return "";
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<e> it = this.f83841t.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().f83821e);
        }
        return jSONArray.toString();
    }

    @Override // sg.bigo.ads.common.g.b.c
    public final void c(String str) {
        if (sg.bigo.ads.common.utils.q.a((CharSequence) str)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            this.f83842u = new CopyOnWriteArrayList<>();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                this.f83842u.add(new e(jSONArray.getJSONObject(i10)));
            }
        } catch (JSONException unused) {
        }
    }

    @SuppressLint({"ConcurrentModification"})
    public final int d(Context context) {
        Iterator<e> it = this.f83843v.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10++;
            a(context, "lurl_track", it.next());
        }
        return i10;
    }

    @Override // sg.bigo.ads.common.g.b.c
    @NonNull
    public final String d() {
        if (this.f83842u == null) {
            return "";
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<e> it = this.f83842u.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().f83821e);
        }
        return jSONArray.toString();
    }

    @Override // sg.bigo.ads.common.g.b.c
    public final void d(String str) {
        if (sg.bigo.ads.common.utils.q.a((CharSequence) str)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            this.f83843v = new CopyOnWriteArrayList<>();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                this.f83843v.add(new e(jSONArray.getJSONObject(i10)));
            }
        } catch (JSONException unused) {
        }
    }

    @Override // sg.bigo.ads.common.g.b.c
    @NonNull
    public final String e() {
        if (this.f83843v == null) {
            return "";
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<e> it = this.f83843v.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().f83821e);
        }
        return jSONArray.toString();
    }

    @Override // sg.bigo.ads.common.g.b.c
    public final long f() {
        return Math.max(Math.max(this.f83831j, this.f83833l), this.f82138d);
    }

    public final boolean g() {
        return a(this.f83840s) && a(this.f83841t) && a(this.f83842u) && a(this.f83843v);
    }
}
