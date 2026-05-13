package com.iab.omid.library.vungle.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.vungle.internal.j;
import com.iab.omid.library.vungle.processor.a;
import com.iab.omid.library.vungle.utils.f;
import com.iab.omid.library.vungle.utils.h;
import com.iab.omid.library.vungle.walking.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class TreeWalker implements a.InterfaceC0360a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static TreeWalker f25027i = new TreeWalker();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static Handler f25028j = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static Handler f25029k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Runnable f25030l = new b();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Runnable f25031m = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f25033b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f25039h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f25032a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f25034c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<com.iab.omid.library.vungle.weakreference.a> f25035d = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.iab.omid.library.vungle.walking.a f25037f = new com.iab.omid.library.vungle.walking.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.iab.omid.library.vungle.processor.b f25036e = new com.iab.omid.library.vungle.processor.b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.iab.omid.library.vungle.walking.b f25038g = new com.iab.omid.library.vungle.walking.b(new com.iab.omid.library.vungle.walking.async.c());

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
            TreeWalker.this.f25038g.b();
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
            if (TreeWalker.f25029k != null) {
                TreeWalker.f25029k.post(TreeWalker.f25030l);
                TreeWalker.f25029k.postDelayed(TreeWalker.f25031m, 200L);
            }
        }
    }

    private void a(long j10) {
        if (this.f25032a.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f25032a) {
                treeWalkerTimeLogger.onTreeProcessed(this.f25033b, TimeUnit.NANOSECONDS.toMillis(j10));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f25033b, j10);
                }
            }
        }
    }

    private void a(View view, com.iab.omid.library.vungle.processor.a aVar, JSONObject jSONObject, com.iab.omid.library.vungle.walking.c cVar, boolean z10) {
        aVar.a(view, jSONObject, this, cVar == com.iab.omid.library.vungle.walking.c.PARENT_VIEW, z10);
    }

    private void a(String str, View view, JSONObject jSONObject) {
        com.iab.omid.library.vungle.processor.a aVarB = this.f25036e.b();
        String strB = this.f25037f.b(str);
        if (strB != null) {
            JSONObject jSONObjectA = aVarB.a(view);
            com.iab.omid.library.vungle.utils.c.a(jSONObjectA, str);
            com.iab.omid.library.vungle.utils.c.b(jSONObjectA, strB);
            com.iab.omid.library.vungle.utils.c.a(jSONObject, jSONObjectA);
        }
    }

    private boolean a(View view, JSONObject jSONObject) {
        a.C0362a c0362aB = this.f25037f.b(view);
        if (c0362aB == null) {
            return false;
        }
        com.iab.omid.library.vungle.utils.c.a(jSONObject, c0362aB);
        return true;
    }

    private boolean b(View view, JSONObject jSONObject) {
        String strC = this.f25037f.c(view);
        if (strC == null) {
            return false;
        }
        com.iab.omid.library.vungle.utils.c.a(jSONObject, strC);
        com.iab.omid.library.vungle.utils.c.a(jSONObject, Boolean.valueOf(this.f25037f.e(view)));
        com.iab.omid.library.vungle.utils.c.b(jSONObject, Boolean.valueOf(this.f25037f.c(strC)));
        this.f25037f.d();
        return true;
    }

    private void d() {
        a(f.b() - this.f25039h);
    }

    private void e() {
        this.f25033b = 0;
        this.f25035d.clear();
        this.f25034c = false;
        Iterator<com.iab.omid.library.vungle.adsession.a> it = com.iab.omid.library.vungle.internal.c.c().a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().g()) {
                this.f25034c = true;
                break;
            }
        }
        this.f25039h = f.b();
    }

    public static TreeWalker getInstance() {
        return f25027i;
    }

    private void i() {
        if (f25029k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f25029k = handler;
            handler.post(f25030l);
            f25029k.postDelayed(f25031m, 200L);
        }
    }

    private void k() {
        Handler handler = f25029k;
        if (handler != null) {
            handler.removeCallbacks(f25031m);
            f25029k = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        e();
        f();
        d();
        j.b().a();
    }

    @Override // com.iab.omid.library.vungle.processor.a.InterfaceC0360a
    public void a(View view, com.iab.omid.library.vungle.processor.a aVar, JSONObject jSONObject, boolean z10) {
        com.iab.omid.library.vungle.walking.c cVarD;
        if (h.f(view) && (cVarD = this.f25037f.d(view)) != com.iab.omid.library.vungle.walking.c.UNDERLYING_VIEW) {
            JSONObject jSONObjectA = aVar.a(view);
            com.iab.omid.library.vungle.utils.c.a(jSONObject, jSONObjectA);
            if (!b(view, jSONObjectA)) {
                boolean z11 = z10 || a(view, jSONObjectA);
                if (this.f25034c && cVarD == com.iab.omid.library.vungle.walking.c.OBSTRUCTION_VIEW && !z11) {
                    this.f25035d.add(new com.iab.omid.library.vungle.weakreference.a(view));
                }
                a(view, aVar, jSONObjectA, cVarD, z11);
            }
            this.f25033b++;
        }
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f25032a.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f25032a.add(treeWalkerTimeLogger);
    }

    @VisibleForTesting
    public void f() {
        this.f25037f.e();
        long jB = f.b();
        com.iab.omid.library.vungle.processor.a aVarA = this.f25036e.a();
        if (this.f25037f.b().size() > 0) {
            for (String str : this.f25037f.b()) {
                JSONObject jSONObjectA = aVarA.a(null);
                a(str, this.f25037f.a(str), jSONObjectA);
                com.iab.omid.library.vungle.utils.c.b(jSONObjectA);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(str);
                this.f25038g.a(jSONObjectA, hashSet, jB);
            }
        }
        if (this.f25037f.c().size() > 0) {
            JSONObject jSONObjectA2 = aVarA.a(null);
            a(null, aVarA, jSONObjectA2, com.iab.omid.library.vungle.walking.c.PARENT_VIEW, false);
            com.iab.omid.library.vungle.utils.c.b(jSONObjectA2);
            this.f25038g.b(jSONObjectA2, this.f25037f.c(), jB);
            if (this.f25034c) {
                Iterator<com.iab.omid.library.vungle.adsession.a> it = com.iab.omid.library.vungle.internal.c.c().a().iterator();
                while (it.hasNext()) {
                    it.next().a(this.f25035d);
                }
            }
        } else {
            this.f25038g.b();
        }
        this.f25037f.a();
    }

    public void g() {
        k();
    }

    public void h() {
        i();
    }

    public void j() {
        g();
        this.f25032a.clear();
        f25028j.post(new a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f25032a.contains(treeWalkerTimeLogger)) {
            this.f25032a.remove(treeWalkerTimeLogger);
        }
    }
}
