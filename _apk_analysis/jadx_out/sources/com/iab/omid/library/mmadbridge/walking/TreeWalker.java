package com.iab.omid.library.mmadbridge.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.mmadbridge.internal.j;
import com.iab.omid.library.mmadbridge.processor.a;
import com.iab.omid.library.mmadbridge.utils.f;
import com.iab.omid.library.mmadbridge.utils.h;
import com.iab.omid.library.mmadbridge.walking.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class TreeWalker implements a.InterfaceC0351a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static TreeWalker f24758i = new TreeWalker();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static Handler f24759j = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static Handler f24760k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Runnable f24761l = new b();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Runnable f24762m = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f24764b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f24770h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f24763a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f24765c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<com.iab.omid.library.mmadbridge.weakreference.a> f24766d = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.iab.omid.library.mmadbridge.walking.a f24768f = new com.iab.omid.library.mmadbridge.walking.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.iab.omid.library.mmadbridge.processor.b f24767e = new com.iab.omid.library.mmadbridge.processor.b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.iab.omid.library.mmadbridge.walking.b f24769g = new com.iab.omid.library.mmadbridge.walking.b(new com.iab.omid.library.mmadbridge.walking.async.c());

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
            TreeWalker.this.f24769g.b();
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
            if (TreeWalker.f24760k != null) {
                TreeWalker.f24760k.post(TreeWalker.f24761l);
                TreeWalker.f24760k.postDelayed(TreeWalker.f24762m, 200L);
            }
        }
    }

    private void a(long j10) {
        if (this.f24763a.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f24763a) {
                treeWalkerTimeLogger.onTreeProcessed(this.f24764b, TimeUnit.NANOSECONDS.toMillis(j10));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f24764b, j10);
                }
            }
        }
    }

    private void a(View view, com.iab.omid.library.mmadbridge.processor.a aVar, JSONObject jSONObject, com.iab.omid.library.mmadbridge.walking.c cVar, boolean z10) {
        aVar.a(view, jSONObject, this, cVar == com.iab.omid.library.mmadbridge.walking.c.PARENT_VIEW, z10);
    }

    private void a(String str, View view, JSONObject jSONObject) {
        com.iab.omid.library.mmadbridge.processor.a aVarB = this.f24767e.b();
        String strB = this.f24768f.b(str);
        if (strB != null) {
            JSONObject jSONObjectA = aVarB.a(view);
            com.iab.omid.library.mmadbridge.utils.c.a(jSONObjectA, str);
            com.iab.omid.library.mmadbridge.utils.c.b(jSONObjectA, strB);
            com.iab.omid.library.mmadbridge.utils.c.a(jSONObject, jSONObjectA);
        }
    }

    private boolean a(View view, JSONObject jSONObject) {
        a.C0353a c0353aB = this.f24768f.b(view);
        if (c0353aB == null) {
            return false;
        }
        com.iab.omid.library.mmadbridge.utils.c.a(jSONObject, c0353aB);
        return true;
    }

    private boolean b(View view, JSONObject jSONObject) {
        String strC = this.f24768f.c(view);
        if (strC == null) {
            return false;
        }
        com.iab.omid.library.mmadbridge.utils.c.a(jSONObject, strC);
        com.iab.omid.library.mmadbridge.utils.c.a(jSONObject, Boolean.valueOf(this.f24768f.e(view)));
        com.iab.omid.library.mmadbridge.utils.c.b(jSONObject, Boolean.valueOf(this.f24768f.c(strC)));
        this.f24768f.d();
        return true;
    }

    private void d() {
        a(f.b() - this.f24770h);
    }

    private void e() {
        this.f24764b = 0;
        this.f24766d.clear();
        this.f24765c = false;
        Iterator<com.iab.omid.library.mmadbridge.adsession.a> it = com.iab.omid.library.mmadbridge.internal.c.c().a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().e()) {
                this.f24765c = true;
                break;
            }
        }
        this.f24770h = f.b();
    }

    public static TreeWalker getInstance() {
        return f24758i;
    }

    private void i() {
        if (f24760k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f24760k = handler;
            handler.post(f24761l);
            f24760k.postDelayed(f24762m, 200L);
        }
    }

    private void k() {
        Handler handler = f24760k;
        if (handler != null) {
            handler.removeCallbacks(f24762m);
            f24760k = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        e();
        f();
        d();
        j.b().a();
    }

    @Override // com.iab.omid.library.mmadbridge.processor.a.InterfaceC0351a
    public void a(View view, com.iab.omid.library.mmadbridge.processor.a aVar, JSONObject jSONObject, boolean z10) {
        com.iab.omid.library.mmadbridge.walking.c cVarD;
        if (h.f(view) && (cVarD = this.f24768f.d(view)) != com.iab.omid.library.mmadbridge.walking.c.UNDERLYING_VIEW) {
            JSONObject jSONObjectA = aVar.a(view);
            com.iab.omid.library.mmadbridge.utils.c.a(jSONObject, jSONObjectA);
            if (!b(view, jSONObjectA)) {
                boolean z11 = z10 || a(view, jSONObjectA);
                if (this.f24765c && cVarD == com.iab.omid.library.mmadbridge.walking.c.OBSTRUCTION_VIEW && !z11) {
                    this.f24766d.add(new com.iab.omid.library.mmadbridge.weakreference.a(view));
                }
                a(view, aVar, jSONObjectA, cVarD, z11);
            }
            this.f24764b++;
        }
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f24763a.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f24763a.add(treeWalkerTimeLogger);
    }

    @VisibleForTesting
    public void f() {
        this.f24768f.e();
        long jB = f.b();
        com.iab.omid.library.mmadbridge.processor.a aVarA = this.f24767e.a();
        if (this.f24768f.b().size() > 0) {
            for (String str : this.f24768f.b()) {
                JSONObject jSONObjectA = aVarA.a(null);
                a(str, this.f24768f.a(str), jSONObjectA);
                com.iab.omid.library.mmadbridge.utils.c.b(jSONObjectA);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(str);
                this.f24769g.a(jSONObjectA, hashSet, jB);
            }
        }
        if (this.f24768f.c().size() > 0) {
            JSONObject jSONObjectA2 = aVarA.a(null);
            a(null, aVarA, jSONObjectA2, com.iab.omid.library.mmadbridge.walking.c.PARENT_VIEW, false);
            com.iab.omid.library.mmadbridge.utils.c.b(jSONObjectA2);
            this.f24769g.b(jSONObjectA2, this.f24768f.c(), jB);
            if (this.f24765c) {
                Iterator<com.iab.omid.library.mmadbridge.adsession.a> it = com.iab.omid.library.mmadbridge.internal.c.c().a().iterator();
                while (it.hasNext()) {
                    it.next().a(this.f24766d);
                }
            }
        } else {
            this.f24769g.b();
        }
        this.f24768f.a();
    }

    public void g() {
        k();
    }

    public void h() {
        i();
    }

    public void j() {
        g();
        this.f24763a.clear();
        f24759j.post(new a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f24763a.contains(treeWalkerTimeLogger)) {
            this.f24763a.remove(treeWalkerTimeLogger);
        }
    }
}
