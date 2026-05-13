package com.iab.omid.library.ironsrc.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.ironsrc.internal.j;
import com.iab.omid.library.ironsrc.processor.a;
import com.iab.omid.library.ironsrc.utils.f;
import com.iab.omid.library.ironsrc.utils.h;
import com.iab.omid.library.ironsrc.walking.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class TreeWalker implements a.InterfaceC0347a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static TreeWalker f24623i = new TreeWalker();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static Handler f24624j = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static Handler f24625k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Runnable f24626l = new b();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Runnable f24627m = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f24629b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f24635h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f24628a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f24630c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<com.iab.omid.library.ironsrc.weakreference.a> f24631d = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.iab.omid.library.ironsrc.walking.a f24633f = new com.iab.omid.library.ironsrc.walking.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.iab.omid.library.ironsrc.processor.b f24632e = new com.iab.omid.library.ironsrc.processor.b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.iab.omid.library.ironsrc.walking.b f24634g = new com.iab.omid.library.ironsrc.walking.b(new com.iab.omid.library.ironsrc.walking.async.c());

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
            TreeWalker.this.f24634g.b();
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
            if (TreeWalker.f24625k != null) {
                TreeWalker.f24625k.post(TreeWalker.f24626l);
                TreeWalker.f24625k.postDelayed(TreeWalker.f24627m, 200L);
            }
        }
    }

    private void a(long j10) {
        if (this.f24628a.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f24628a) {
                treeWalkerTimeLogger.onTreeProcessed(this.f24629b, TimeUnit.NANOSECONDS.toMillis(j10));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f24629b, j10);
                }
            }
        }
    }

    private void a(View view, com.iab.omid.library.ironsrc.processor.a aVar, JSONObject jSONObject, com.iab.omid.library.ironsrc.walking.c cVar, boolean z10) {
        aVar.a(view, jSONObject, this, cVar == com.iab.omid.library.ironsrc.walking.c.PARENT_VIEW, z10);
    }

    private void a(String str, View view, JSONObject jSONObject) {
        com.iab.omid.library.ironsrc.processor.a aVarB = this.f24632e.b();
        String strB = this.f24633f.b(str);
        if (strB != null) {
            JSONObject jSONObjectA = aVarB.a(view);
            com.iab.omid.library.ironsrc.utils.c.a(jSONObjectA, str);
            com.iab.omid.library.ironsrc.utils.c.b(jSONObjectA, strB);
            com.iab.omid.library.ironsrc.utils.c.a(jSONObject, jSONObjectA);
        }
    }

    private boolean a(View view, JSONObject jSONObject) {
        a.C0349a c0349aB = this.f24633f.b(view);
        if (c0349aB == null) {
            return false;
        }
        com.iab.omid.library.ironsrc.utils.c.a(jSONObject, c0349aB);
        return true;
    }

    private boolean b(View view, JSONObject jSONObject) {
        String strC = this.f24633f.c(view);
        if (strC == null) {
            return false;
        }
        com.iab.omid.library.ironsrc.utils.c.a(jSONObject, strC);
        com.iab.omid.library.ironsrc.utils.c.a(jSONObject, Boolean.valueOf(this.f24633f.e(view)));
        com.iab.omid.library.ironsrc.utils.c.b(jSONObject, Boolean.valueOf(this.f24633f.c(strC)));
        this.f24633f.d();
        return true;
    }

    private void d() {
        a(f.b() - this.f24635h);
    }

    private void e() {
        this.f24629b = 0;
        this.f24631d.clear();
        this.f24630c = false;
        Iterator<com.iab.omid.library.ironsrc.adsession.a> it = com.iab.omid.library.ironsrc.internal.c.c().a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().e()) {
                this.f24630c = true;
                break;
            }
        }
        this.f24635h = f.b();
    }

    public static TreeWalker getInstance() {
        return f24623i;
    }

    private void i() {
        if (f24625k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f24625k = handler;
            handler.post(f24626l);
            f24625k.postDelayed(f24627m, 200L);
        }
    }

    private void k() {
        Handler handler = f24625k;
        if (handler != null) {
            handler.removeCallbacks(f24627m);
            f24625k = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        e();
        f();
        d();
        j.b().a();
    }

    @Override // com.iab.omid.library.ironsrc.processor.a.InterfaceC0347a
    public void a(View view, com.iab.omid.library.ironsrc.processor.a aVar, JSONObject jSONObject, boolean z10) {
        com.iab.omid.library.ironsrc.walking.c cVarD;
        if (h.f(view) && (cVarD = this.f24633f.d(view)) != com.iab.omid.library.ironsrc.walking.c.UNDERLYING_VIEW) {
            JSONObject jSONObjectA = aVar.a(view);
            com.iab.omid.library.ironsrc.utils.c.a(jSONObject, jSONObjectA);
            if (!b(view, jSONObjectA)) {
                boolean z11 = z10 || a(view, jSONObjectA);
                if (this.f24630c && cVarD == com.iab.omid.library.ironsrc.walking.c.OBSTRUCTION_VIEW && !z11) {
                    this.f24631d.add(new com.iab.omid.library.ironsrc.weakreference.a(view));
                }
                a(view, aVar, jSONObjectA, cVarD, z11);
            }
            this.f24629b++;
        }
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f24628a.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f24628a.add(treeWalkerTimeLogger);
    }

    @VisibleForTesting
    public void f() {
        this.f24633f.e();
        long jB = f.b();
        com.iab.omid.library.ironsrc.processor.a aVarA = this.f24632e.a();
        if (this.f24633f.b().size() > 0) {
            for (String str : this.f24633f.b()) {
                JSONObject jSONObjectA = aVarA.a(null);
                a(str, this.f24633f.a(str), jSONObjectA);
                com.iab.omid.library.ironsrc.utils.c.b(jSONObjectA);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(str);
                this.f24634g.a(jSONObjectA, hashSet, jB);
            }
        }
        if (this.f24633f.c().size() > 0) {
            JSONObject jSONObjectA2 = aVarA.a(null);
            a(null, aVarA, jSONObjectA2, com.iab.omid.library.ironsrc.walking.c.PARENT_VIEW, false);
            com.iab.omid.library.ironsrc.utils.c.b(jSONObjectA2);
            this.f24634g.b(jSONObjectA2, this.f24633f.c(), jB);
            if (this.f24630c) {
                Iterator<com.iab.omid.library.ironsrc.adsession.a> it = com.iab.omid.library.ironsrc.internal.c.c().a().iterator();
                while (it.hasNext()) {
                    it.next().a(this.f24631d);
                }
            }
        } else {
            this.f24634g.b();
        }
        this.f24633f.a();
    }

    public void g() {
        k();
    }

    public void h() {
        i();
    }

    public void j() {
        g();
        this.f24628a.clear();
        f24624j.post(new a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f24628a.contains(treeWalkerTimeLogger)) {
            this.f24628a.remove(treeWalkerTimeLogger);
        }
    }
}
