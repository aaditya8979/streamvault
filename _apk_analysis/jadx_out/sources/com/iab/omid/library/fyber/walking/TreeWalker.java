package com.iab.omid.library.fyber.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.fyber.internal.j;
import com.iab.omid.library.fyber.processor.a;
import com.iab.omid.library.fyber.utils.f;
import com.iab.omid.library.fyber.utils.h;
import com.iab.omid.library.fyber.walking.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class TreeWalker implements a.InterfaceC0338a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static TreeWalker f24347i = new TreeWalker();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static Handler f24348j = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static Handler f24349k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Runnable f24350l = new b();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Runnable f24351m = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f24353b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f24359h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f24352a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f24354c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<com.iab.omid.library.fyber.weakreference.a> f24355d = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.iab.omid.library.fyber.walking.a f24357f = new com.iab.omid.library.fyber.walking.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.iab.omid.library.fyber.processor.b f24356e = new com.iab.omid.library.fyber.processor.b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.iab.omid.library.fyber.walking.b f24358g = new com.iab.omid.library.fyber.walking.b(new com.iab.omid.library.fyber.walking.async.c());

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
            TreeWalker.this.f24358g.b();
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
            if (TreeWalker.f24349k != null) {
                TreeWalker.f24349k.post(TreeWalker.f24350l);
                TreeWalker.f24349k.postDelayed(TreeWalker.f24351m, 200L);
            }
        }
    }

    private void a(long j10) {
        if (this.f24352a.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f24352a) {
                treeWalkerTimeLogger.onTreeProcessed(this.f24353b, TimeUnit.NANOSECONDS.toMillis(j10));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f24353b, j10);
                }
            }
        }
    }

    private void a(View view, com.iab.omid.library.fyber.processor.a aVar, JSONObject jSONObject, com.iab.omid.library.fyber.walking.c cVar, boolean z10) {
        aVar.a(view, jSONObject, this, cVar == com.iab.omid.library.fyber.walking.c.PARENT_VIEW, z10);
    }

    private void a(String str, View view, JSONObject jSONObject) {
        com.iab.omid.library.fyber.processor.a aVarB = this.f24356e.b();
        String strB = this.f24357f.b(str);
        if (strB != null) {
            JSONObject jSONObjectA = aVarB.a(view);
            com.iab.omid.library.fyber.utils.c.a(jSONObjectA, str);
            com.iab.omid.library.fyber.utils.c.b(jSONObjectA, strB);
            com.iab.omid.library.fyber.utils.c.a(jSONObject, jSONObjectA);
        }
    }

    private boolean a(View view, JSONObject jSONObject) {
        a.C0340a c0340aB = this.f24357f.b(view);
        if (c0340aB == null) {
            return false;
        }
        com.iab.omid.library.fyber.utils.c.a(jSONObject, c0340aB);
        return true;
    }

    private boolean b(View view, JSONObject jSONObject) {
        String strC = this.f24357f.c(view);
        if (strC == null) {
            return false;
        }
        com.iab.omid.library.fyber.utils.c.a(jSONObject, strC);
        com.iab.omid.library.fyber.utils.c.a(jSONObject, Boolean.valueOf(this.f24357f.e(view)));
        com.iab.omid.library.fyber.utils.c.b(jSONObject, Boolean.valueOf(this.f24357f.c(strC)));
        this.f24357f.d();
        return true;
    }

    private void d() {
        a(f.b() - this.f24359h);
    }

    private void e() {
        this.f24353b = 0;
        this.f24355d.clear();
        this.f24354c = false;
        Iterator<com.iab.omid.library.fyber.adsession.a> it = com.iab.omid.library.fyber.internal.c.c().a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().g()) {
                this.f24354c = true;
                break;
            }
        }
        this.f24359h = f.b();
    }

    public static TreeWalker getInstance() {
        return f24347i;
    }

    private void i() {
        if (f24349k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f24349k = handler;
            handler.post(f24350l);
            f24349k.postDelayed(f24351m, 200L);
        }
    }

    private void k() {
        Handler handler = f24349k;
        if (handler != null) {
            handler.removeCallbacks(f24351m);
            f24349k = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        e();
        f();
        d();
        j.b().a();
    }

    @Override // com.iab.omid.library.fyber.processor.a.InterfaceC0338a
    public void a(View view, com.iab.omid.library.fyber.processor.a aVar, JSONObject jSONObject, boolean z10) {
        com.iab.omid.library.fyber.walking.c cVarD;
        if (h.f(view) && (cVarD = this.f24357f.d(view)) != com.iab.omid.library.fyber.walking.c.UNDERLYING_VIEW) {
            JSONObject jSONObjectA = aVar.a(view);
            com.iab.omid.library.fyber.utils.c.a(jSONObject, jSONObjectA);
            if (!b(view, jSONObjectA)) {
                boolean z11 = z10 || a(view, jSONObjectA);
                if (this.f24354c && cVarD == com.iab.omid.library.fyber.walking.c.OBSTRUCTION_VIEW && !z11) {
                    this.f24355d.add(new com.iab.omid.library.fyber.weakreference.a(view));
                }
                a(view, aVar, jSONObjectA, cVarD, z11);
            }
            this.f24353b++;
        }
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f24352a.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f24352a.add(treeWalkerTimeLogger);
    }

    @VisibleForTesting
    public void f() {
        this.f24357f.e();
        long jB = f.b();
        com.iab.omid.library.fyber.processor.a aVarA = this.f24356e.a();
        if (this.f24357f.b().size() > 0) {
            for (String str : this.f24357f.b()) {
                JSONObject jSONObjectA = aVarA.a(null);
                a(str, this.f24357f.a(str), jSONObjectA);
                com.iab.omid.library.fyber.utils.c.b(jSONObjectA);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(str);
                this.f24358g.a(jSONObjectA, hashSet, jB);
            }
        }
        if (this.f24357f.c().size() > 0) {
            JSONObject jSONObjectA2 = aVarA.a(null);
            a(null, aVarA, jSONObjectA2, com.iab.omid.library.fyber.walking.c.PARENT_VIEW, false);
            com.iab.omid.library.fyber.utils.c.b(jSONObjectA2);
            this.f24358g.b(jSONObjectA2, this.f24357f.c(), jB);
            if (this.f24354c) {
                Iterator<com.iab.omid.library.fyber.adsession.a> it = com.iab.omid.library.fyber.internal.c.c().a().iterator();
                while (it.hasNext()) {
                    it.next().a(this.f24355d);
                }
            }
        } else {
            this.f24358g.b();
        }
        this.f24357f.a();
    }

    public void g() {
        k();
    }

    public void h() {
        i();
    }

    public void j() {
        g();
        this.f24352a.clear();
        f24348j.post(new a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f24352a.contains(treeWalkerTimeLogger)) {
            this.f24352a.remove(treeWalkerTimeLogger);
        }
    }
}
