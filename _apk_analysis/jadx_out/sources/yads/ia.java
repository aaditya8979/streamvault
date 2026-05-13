package yads;

import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class ia {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rb2 f90715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WebView f90716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f90717c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f90718d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f90719e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f90720f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f90721g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ja f90722h;

    public ia(rb2 rb2Var, String str, List list) {
        ja jaVar = ja.f91136d;
        ArrayList arrayList = new ArrayList();
        this.f90717c = arrayList;
        this.f90718d = new HashMap();
        this.f90715a = rb2Var;
        this.f90716b = null;
        this.f90719e = str;
        this.f90722h = jaVar;
        arrayList.addAll(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            md3 md3Var = (md3) it.next();
            this.f90718d.put(UUID.randomUUID().toString(), md3Var);
        }
        this.f90721g = null;
        this.f90720f = null;
    }

    public final ja a() {
        return this.f90722h;
    }

    public final Map b() {
        return Collections.unmodifiableMap(this.f90718d);
    }

    public final String c() {
        return this.f90719e;
    }

    public final WebView d() {
        return this.f90716b;
    }
}
