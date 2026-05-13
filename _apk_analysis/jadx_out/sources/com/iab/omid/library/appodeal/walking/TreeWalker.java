package com.iab.omid.library.appodeal.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.appodeal.internal.j;
import com.iab.omid.library.appodeal.processor.a;
import com.iab.omid.library.appodeal.utils.f;
import com.iab.omid.library.appodeal.utils.h;
import com.iab.omid.library.appodeal.walking.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class TreeWalker implements a.InterfaceC0327a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static TreeWalker f23961i = new TreeWalker();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static Handler f23962j = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static Handler f23963k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Runnable f23964l = new b();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Runnable f23965m = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f23967b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f23973h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f23966a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f23968c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<com.iab.omid.library.appodeal.weakreference.a> f23969d = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.iab.omid.library.appodeal.walking.a f23971f = new com.iab.omid.library.appodeal.walking.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.iab.omid.library.appodeal.processor.b f23970e = new com.iab.omid.library.appodeal.processor.b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.iab.omid.library.appodeal.walking.b f23972g = new com.iab.omid.library.appodeal.walking.b(new com.iab.omid.library.appodeal.walking.async.c());

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
            TreeWalker.this.f23972g.b();
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
            if (TreeWalker.f23963k != null) {
                TreeWalker.f23963k.post(TreeWalker.f23964l);
                TreeWalker.f23963k.postDelayed(TreeWalker.f23965m, 200L);
            }
        }
    }

    private void a(long j10) {
        if (this.f23966a.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f23966a) {
                treeWalkerTimeLogger.onTreeProcessed(this.f23967b, TimeUnit.NANOSECONDS.toMillis(j10));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f23967b, j10);
                }
            }
        }
    }

    private void a(View view, com.iab.omid.library.appodeal.processor.a aVar, JSONObject jSONObject, com.iab.omid.library.appodeal.walking.c cVar, boolean z10) {
        aVar.a(view, jSONObject, this, cVar == com.iab.omid.library.appodeal.walking.c.PARENT_VIEW, z10);
    }

    private void a(String str, View view, JSONObject jSONObject) {
        com.iab.omid.library.appodeal.processor.a aVarB = this.f23970e.b();
        String strB = this.f23971f.b(str);
        if (strB != null) {
            JSONObject jSONObjectA = aVarB.a(view);
            com.iab.omid.library.appodeal.utils.c.a(jSONObjectA, str);
            com.iab.omid.library.appodeal.utils.c.b(jSONObjectA, strB);
            com.iab.omid.library.appodeal.utils.c.a(jSONObject, jSONObjectA);
        }
    }

    private boolean a(View view, JSONObject jSONObject) {
        a.C0329a c0329aB = this.f23971f.b(view);
        if (c0329aB == null) {
            return false;
        }
        com.iab.omid.library.appodeal.utils.c.a(jSONObject, c0329aB);
        return true;
    }

    private boolean b(View view, JSONObject jSONObject) {
        String strC = this.f23971f.c(view);
        if (strC == null) {
            return false;
        }
        com.iab.omid.library.appodeal.utils.c.a(jSONObject, strC);
        com.iab.omid.library.appodeal.utils.c.a(jSONObject, Boolean.valueOf(this.f23971f.e(view)));
        com.iab.omid.library.appodeal.utils.c.b(jSONObject, Boolean.valueOf(this.f23971f.c(strC)));
        this.f23971f.d();
        return true;
    }

    private void d() {
        a(f.b() - this.f23973h);
    }

    private void e() {
        this.f23967b = 0;
        this.f23969d.clear();
        this.f23968c = false;
        Iterator<com.iab.omid.library.appodeal.adsession.a> it = com.iab.omid.library.appodeal.internal.c.c().a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().g()) {
                this.f23968c = true;
                break;
            }
        }
        this.f23973h = f.b();
    }

    public static TreeWalker getInstance() {
        return f23961i;
    }

    private void i() {
        if (f23963k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f23963k = handler;
            handler.post(f23964l);
            f23963k.postDelayed(f23965m, 200L);
        }
    }

    private void k() {
        Handler handler = f23963k;
        if (handler != null) {
            handler.removeCallbacks(f23965m);
            f23963k = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        e();
        f();
        d();
        j.b().a();
    }

    @Override // com.iab.omid.library.appodeal.processor.a.InterfaceC0327a
    public void a(View view, com.iab.omid.library.appodeal.processor.a aVar, JSONObject jSONObject, boolean z10) {
        com.iab.omid.library.appodeal.walking.c cVarD;
        if (h.f(view) && (cVarD = this.f23971f.d(view)) != com.iab.omid.library.appodeal.walking.c.UNDERLYING_VIEW) {
            JSONObject jSONObjectA = aVar.a(view);
            com.iab.omid.library.appodeal.utils.c.a(jSONObject, jSONObjectA);
            if (!b(view, jSONObjectA)) {
                boolean z11 = z10 || a(view, jSONObjectA);
                if (this.f23968c && cVarD == com.iab.omid.library.appodeal.walking.c.OBSTRUCTION_VIEW && !z11) {
                    this.f23969d.add(new com.iab.omid.library.appodeal.weakreference.a(view));
                }
                a(view, aVar, jSONObjectA, cVarD, z11);
            }
            this.f23967b++;
        }
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f23966a.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f23966a.add(treeWalkerTimeLogger);
    }

    @VisibleForTesting
    public void f() {
        this.f23971f.e();
        long jB = f.b();
        com.iab.omid.library.appodeal.processor.a aVarA = this.f23970e.a();
        if (this.f23971f.b().size() > 0) {
            for (String str : this.f23971f.b()) {
                JSONObject jSONObjectA = aVarA.a(null);
                a(str, this.f23971f.a(str), jSONObjectA);
                com.iab.omid.library.appodeal.utils.c.b(jSONObjectA);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(str);
                this.f23972g.a(jSONObjectA, hashSet, jB);
            }
        }
        if (this.f23971f.c().size() > 0) {
            JSONObject jSONObjectA2 = aVarA.a(null);
            a(null, aVarA, jSONObjectA2, com.iab.omid.library.appodeal.walking.c.PARENT_VIEW, false);
            com.iab.omid.library.appodeal.utils.c.b(jSONObjectA2);
            this.f23972g.b(jSONObjectA2, this.f23971f.c(), jB);
            if (this.f23968c) {
                Iterator<com.iab.omid.library.appodeal.adsession.a> it = com.iab.omid.library.appodeal.internal.c.c().a().iterator();
                while (it.hasNext()) {
                    it.next().a(this.f23969d);
                }
            }
        } else {
            this.f23972g.b();
        }
        this.f23971f.a();
    }

    public void g() {
        k();
    }

    public void h() {
        i();
    }

    public void j() {
        g();
        this.f23966a.clear();
        f23962j.post(new a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f23966a.contains(treeWalkerTimeLogger)) {
            this.f23966a.remove(treeWalkerTimeLogger);
        }
    }
}
