package com.iab.omid.library.applovin.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.applovin.internal.j;
import com.iab.omid.library.applovin.processor.a;
import com.iab.omid.library.applovin.utils.f;
import com.iab.omid.library.applovin.utils.h;
import com.iab.omid.library.applovin.walking.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class TreeWalker implements a.InterfaceC0323a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static TreeWalker f23826i = new TreeWalker();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static Handler f23827j = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static Handler f23828k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Runnable f23829l = new b();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Runnable f23830m = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f23832b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f23838h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f23831a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f23833c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<com.iab.omid.library.applovin.weakreference.a> f23834d = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.iab.omid.library.applovin.walking.a f23836f = new com.iab.omid.library.applovin.walking.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.iab.omid.library.applovin.processor.b f23835e = new com.iab.omid.library.applovin.processor.b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.iab.omid.library.applovin.walking.b f23837g = new com.iab.omid.library.applovin.walking.b(new com.iab.omid.library.applovin.walking.async.c());

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
            TreeWalker.this.f23837g.b();
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
            if (TreeWalker.f23828k != null) {
                TreeWalker.f23828k.post(TreeWalker.f23829l);
                TreeWalker.f23828k.postDelayed(TreeWalker.f23830m, 200L);
            }
        }
    }

    private void a(long j10) {
        if (this.f23831a.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f23831a) {
                treeWalkerTimeLogger.onTreeProcessed(this.f23832b, TimeUnit.NANOSECONDS.toMillis(j10));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f23832b, j10);
                }
            }
        }
    }

    private void a(View view, com.iab.omid.library.applovin.processor.a aVar, JSONObject jSONObject, com.iab.omid.library.applovin.walking.c cVar, boolean z10) {
        aVar.a(view, jSONObject, this, cVar == com.iab.omid.library.applovin.walking.c.PARENT_VIEW, z10);
    }

    private void a(String str, View view, JSONObject jSONObject) {
        com.iab.omid.library.applovin.processor.a aVarB = this.f23835e.b();
        String strB = this.f23836f.b(str);
        if (strB != null) {
            JSONObject jSONObjectA = aVarB.a(view);
            com.iab.omid.library.applovin.utils.c.a(jSONObjectA, str);
            com.iab.omid.library.applovin.utils.c.b(jSONObjectA, strB);
            com.iab.omid.library.applovin.utils.c.a(jSONObject, jSONObjectA);
        }
    }

    private boolean a(View view, JSONObject jSONObject) {
        a.C0325a c0325aB = this.f23836f.b(view);
        if (c0325aB == null) {
            return false;
        }
        com.iab.omid.library.applovin.utils.c.a(jSONObject, c0325aB);
        return true;
    }

    private boolean b(View view, JSONObject jSONObject) {
        String strC = this.f23836f.c(view);
        if (strC == null) {
            return false;
        }
        com.iab.omid.library.applovin.utils.c.a(jSONObject, strC);
        com.iab.omid.library.applovin.utils.c.a(jSONObject, Boolean.valueOf(this.f23836f.e(view)));
        com.iab.omid.library.applovin.utils.c.b(jSONObject, Boolean.valueOf(this.f23836f.c(strC)));
        this.f23836f.d();
        return true;
    }

    private void d() {
        a(f.b() - this.f23838h);
    }

    private void e() {
        this.f23832b = 0;
        this.f23834d.clear();
        this.f23833c = false;
        Iterator<com.iab.omid.library.applovin.adsession.a> it = com.iab.omid.library.applovin.internal.c.c().a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().g()) {
                this.f23833c = true;
                break;
            }
        }
        this.f23838h = f.b();
    }

    public static TreeWalker getInstance() {
        return f23826i;
    }

    private void i() {
        if (f23828k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f23828k = handler;
            handler.post(f23829l);
            f23828k.postDelayed(f23830m, 200L);
        }
    }

    private void k() {
        Handler handler = f23828k;
        if (handler != null) {
            handler.removeCallbacks(f23830m);
            f23828k = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        e();
        f();
        d();
        j.b().a();
    }

    @Override // com.iab.omid.library.applovin.processor.a.InterfaceC0323a
    public void a(View view, com.iab.omid.library.applovin.processor.a aVar, JSONObject jSONObject, boolean z10) {
        com.iab.omid.library.applovin.walking.c cVarD;
        if (h.f(view) && (cVarD = this.f23836f.d(view)) != com.iab.omid.library.applovin.walking.c.UNDERLYING_VIEW) {
            JSONObject jSONObjectA = aVar.a(view);
            com.iab.omid.library.applovin.utils.c.a(jSONObject, jSONObjectA);
            if (!b(view, jSONObjectA)) {
                boolean z11 = z10 || a(view, jSONObjectA);
                if (this.f23833c && cVarD == com.iab.omid.library.applovin.walking.c.OBSTRUCTION_VIEW && !z11) {
                    this.f23834d.add(new com.iab.omid.library.applovin.weakreference.a(view));
                }
                a(view, aVar, jSONObjectA, cVarD, z11);
            }
            this.f23832b++;
        }
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f23831a.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f23831a.add(treeWalkerTimeLogger);
    }

    @VisibleForTesting
    public void f() {
        this.f23836f.e();
        long jB = f.b();
        com.iab.omid.library.applovin.processor.a aVarA = this.f23835e.a();
        if (this.f23836f.b().size() > 0) {
            for (String str : this.f23836f.b()) {
                JSONObject jSONObjectA = aVarA.a(null);
                a(str, this.f23836f.a(str), jSONObjectA);
                com.iab.omid.library.applovin.utils.c.b(jSONObjectA);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(str);
                this.f23837g.a(jSONObjectA, hashSet, jB);
            }
        }
        if (this.f23836f.c().size() > 0) {
            JSONObject jSONObjectA2 = aVarA.a(null);
            a(null, aVarA, jSONObjectA2, com.iab.omid.library.applovin.walking.c.PARENT_VIEW, false);
            com.iab.omid.library.applovin.utils.c.b(jSONObjectA2);
            this.f23837g.b(jSONObjectA2, this.f23836f.c(), jB);
            if (this.f23833c) {
                Iterator<com.iab.omid.library.applovin.adsession.a> it = com.iab.omid.library.applovin.internal.c.c().a().iterator();
                while (it.hasNext()) {
                    it.next().a(this.f23834d);
                }
            }
        } else {
            this.f23837g.b();
        }
        this.f23836f.a();
    }

    public void g() {
        k();
    }

    public void h() {
        i();
    }

    public void j() {
        g();
        this.f23831a.clear();
        f23827j.post(new a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f23831a.contains(treeWalkerTimeLogger)) {
            this.f23831a.remove(treeWalkerTimeLogger);
        }
    }
}
