package com.iab.omid.library.inmobi.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.inmobi.internal.j;
import com.iab.omid.library.inmobi.processor.a;
import com.iab.omid.library.inmobi.utils.f;
import com.iab.omid.library.inmobi.utils.h;
import com.iab.omid.library.inmobi.walking.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class TreeWalker implements a.InterfaceC0343a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static TreeWalker f24488i = new TreeWalker();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static Handler f24489j = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static Handler f24490k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Runnable f24491l = new b();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Runnable f24492m = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f24494b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f24500h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f24493a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f24495c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<com.iab.omid.library.inmobi.weakreference.a> f24496d = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.iab.omid.library.inmobi.walking.a f24498f = new com.iab.omid.library.inmobi.walking.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.iab.omid.library.inmobi.processor.b f24497e = new com.iab.omid.library.inmobi.processor.b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.iab.omid.library.inmobi.walking.b f24499g = new com.iab.omid.library.inmobi.walking.b(new com.iab.omid.library.inmobi.walking.async.c());

    public interface TreeWalkerNanoTimeLogger extends TreeWalkerTimeLogger {
        void onTreeProcessedNano(int i10, long j10);
    }

    public interface TreeWalkerTimeLogger {
        void onTreeProcessed(int i10, long j10);
    }

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TreeWalker.this.f24499g.b();
        }
    }

    public class b implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            TreeWalker.getInstance().l();
        }
    }

    public class c implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            if (TreeWalker.f24490k != null) {
                TreeWalker.f24490k.post(TreeWalker.f24491l);
                TreeWalker.f24490k.postDelayed(TreeWalker.f24492m, 200L);
            }
        }
    }

    private void a(long j10) {
        if (this.f24493a.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f24493a) {
                treeWalkerTimeLogger.onTreeProcessed(this.f24494b, TimeUnit.NANOSECONDS.toMillis(j10));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f24494b, j10);
                }
            }
        }
    }

    private void a(View view, com.iab.omid.library.inmobi.processor.a aVar, JSONObject jSONObject, com.iab.omid.library.inmobi.walking.c cVar, boolean z10) {
        aVar.a(view, jSONObject, this, cVar == com.iab.omid.library.inmobi.walking.c.PARENT_VIEW, z10);
    }

    private void a(String str, View view, JSONObject jSONObject) {
        com.iab.omid.library.inmobi.processor.a aVarB = this.f24497e.b();
        String strB = this.f24498f.b(str);
        if (strB != null) {
            JSONObject jSONObjectA = aVarB.a(view);
            com.iab.omid.library.inmobi.utils.c.a(jSONObjectA, str);
            com.iab.omid.library.inmobi.utils.c.b(jSONObjectA, strB);
            com.iab.omid.library.inmobi.utils.c.a(jSONObject, jSONObjectA);
        }
    }

    private boolean a(View view, JSONObject jSONObject) {
        a.C0345a c0345aB = this.f24498f.b(view);
        if (c0345aB == null) {
            return false;
        }
        com.iab.omid.library.inmobi.utils.c.a(jSONObject, c0345aB);
        return true;
    }

    private boolean b(View view, JSONObject jSONObject) {
        String strC = this.f24498f.c(view);
        if (strC == null) {
            return false;
        }
        com.iab.omid.library.inmobi.utils.c.a(jSONObject, strC);
        com.iab.omid.library.inmobi.utils.c.a(jSONObject, Boolean.valueOf(this.f24498f.e(view)));
        com.iab.omid.library.inmobi.utils.c.b(jSONObject, Boolean.valueOf(this.f24498f.c(strC)));
        this.f24498f.d();
        return true;
    }

    private void d() {
        a(f.b() - this.f24500h);
    }

    private void e() {
        this.f24494b = 0;
        this.f24496d.clear();
        this.f24495c = false;
        Iterator<com.iab.omid.library.inmobi.adsession.a> it = com.iab.omid.library.inmobi.internal.c.c().a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().g()) {
                this.f24495c = true;
                break;
            }
        }
        this.f24500h = f.b();
    }

    public static TreeWalker getInstance() {
        return f24488i;
    }

    private void i() {
        if (f24490k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f24490k = handler;
            handler.post(f24491l);
            f24490k.postDelayed(f24492m, 200L);
        }
    }

    private void k() {
        Handler handler = f24490k;
        if (handler != null) {
            handler.removeCallbacks(f24492m);
            f24490k = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        e();
        f();
        d();
        j.b().a();
    }

    @Override // com.iab.omid.library.inmobi.processor.a.InterfaceC0343a
    public void a(View view, com.iab.omid.library.inmobi.processor.a aVar, JSONObject jSONObject, boolean z10) {
        com.iab.omid.library.inmobi.walking.c cVarD;
        if (h.f(view) && (cVarD = this.f24498f.d(view)) != com.iab.omid.library.inmobi.walking.c.UNDERLYING_VIEW) {
            JSONObject jSONObjectA = aVar.a(view);
            com.iab.omid.library.inmobi.utils.c.a(jSONObject, jSONObjectA);
            if (!b(view, jSONObjectA)) {
                boolean z11 = z10 || a(view, jSONObjectA);
                if (this.f24495c && cVarD == com.iab.omid.library.inmobi.walking.c.OBSTRUCTION_VIEW && !z11) {
                    this.f24496d.add(new com.iab.omid.library.inmobi.weakreference.a(view));
                }
                a(view, aVar, jSONObjectA, cVarD, z11);
            }
            this.f24494b++;
        }
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f24493a.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f24493a.add(treeWalkerTimeLogger);
    }

    @VisibleForTesting
    public void f() {
        this.f24498f.e();
        long jB = f.b();
        com.iab.omid.library.inmobi.processor.a aVarA = this.f24497e.a();
        if (this.f24498f.b().size() > 0) {
            for (String str : this.f24498f.b()) {
                JSONObject jSONObjectA = aVarA.a(null);
                a(str, this.f24498f.a(str), jSONObjectA);
                com.iab.omid.library.inmobi.utils.c.b(jSONObjectA);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(str);
                this.f24499g.a(jSONObjectA, hashSet, jB);
            }
        }
        if (this.f24498f.c().size() > 0) {
            JSONObject jSONObjectA2 = aVarA.a(null);
            a(null, aVarA, jSONObjectA2, com.iab.omid.library.inmobi.walking.c.PARENT_VIEW, false);
            com.iab.omid.library.inmobi.utils.c.b(jSONObjectA2);
            this.f24499g.b(jSONObjectA2, this.f24498f.c(), jB);
            if (this.f24495c) {
                Iterator<com.iab.omid.library.inmobi.adsession.a> it = com.iab.omid.library.inmobi.internal.c.c().a().iterator();
                while (it.hasNext()) {
                    it.next().a(this.f24496d);
                }
            }
        } else {
            this.f24499g.b();
        }
        this.f24498f.a();
    }

    public void g() {
        k();
    }

    public void h() {
        i();
    }

    public void j() {
        g();
        this.f24493a.clear();
        f24489j.post(new a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f24493a.contains(treeWalkerTimeLogger)) {
            this.f24493a.remove(treeWalkerTimeLogger);
        }
    }
}
