package com.iab.omid.library.bigosg.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.bigosg.c.a;
import com.iab.omid.library.bigosg.d.d;
import com.iab.omid.library.bigosg.d.f;
import com.iab.omid.library.bigosg.walking.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class TreeWalker implements a.InterfaceC0331a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static TreeWalker f24086a = new TreeWalker();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Handler f24087b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Handler f24088c = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Runnable f24089j = new Runnable() { // from class: com.iab.omid.library.bigosg.walking.TreeWalker.2
        @Override // java.lang.Runnable
        public final void run() {
            TreeWalker.getInstance().h();
        }
    };

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Runnable f24090k = new Runnable() { // from class: com.iab.omid.library.bigosg.walking.TreeWalker.3
        @Override // java.lang.Runnable
        public final void run() {
            if (TreeWalker.f24088c != null) {
                TreeWalker.f24088c.post(TreeWalker.f24089j);
                TreeWalker.f24088c.postDelayed(TreeWalker.f24090k, 200L);
            }
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f24092e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f24096i;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f24091d = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private a f24094g = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.iab.omid.library.bigosg.c.b f24093f = new com.iab.omid.library.bigosg.c.b();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private b f24095h = new b(new com.iab.omid.library.bigosg.walking.a.c());

    public interface TreeWalkerNanoTimeLogger extends TreeWalkerTimeLogger {
        void onTreeProcessedNano(int i10, long j10);
    }

    public interface TreeWalkerTimeLogger {
        void onTreeProcessed(int i10, long j10);
    }

    private void a(long j10) {
        if (this.f24091d.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f24091d) {
                treeWalkerTimeLogger.onTreeProcessed(this.f24092e, TimeUnit.NANOSECONDS.toMillis(j10));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f24092e, j10);
                }
            }
        }
    }

    private void a(View view, com.iab.omid.library.bigosg.c.a aVar, JSONObject jSONObject, c cVar) {
        aVar.a(view, jSONObject, this, cVar == c.PARENT_VIEW);
    }

    private void a(String str, View view, JSONObject jSONObject) {
        com.iab.omid.library.bigosg.c.a aVarB = this.f24093f.b();
        String strA = this.f24094g.a(str);
        if (strA != null) {
            JSONObject jSONObjectA = aVarB.a(view);
            com.iab.omid.library.bigosg.d.b.a(jSONObjectA, str);
            com.iab.omid.library.bigosg.d.b.b(jSONObjectA, strA);
            com.iab.omid.library.bigosg.d.b.a(jSONObject, jSONObjectA);
        }
    }

    private boolean a(View view, JSONObject jSONObject) {
        String strA = this.f24094g.a(view);
        if (strA == null) {
            return false;
        }
        com.iab.omid.library.bigosg.d.b.a(jSONObject, strA);
        this.f24094g.e();
        return true;
    }

    private void b(View view, JSONObject jSONObject) {
        a.C0332a c0332aB = this.f24094g.b(view);
        if (c0332aB != null) {
            com.iab.omid.library.bigosg.d.b.a(jSONObject, c0332aB);
        }
    }

    public static TreeWalker getInstance() {
        return f24086a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        i();
        d();
        j();
    }

    private void i() {
        this.f24092e = 0;
        this.f24096i = d.a();
    }

    private void j() {
        a(d.a() - this.f24096i);
    }

    private void k() {
        if (f24088c == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f24088c = handler;
            handler.post(f24089j);
            f24088c.postDelayed(f24090k, 200L);
        }
    }

    private void l() {
        Handler handler = f24088c;
        if (handler != null) {
            handler.removeCallbacks(f24090k);
            f24088c = null;
        }
    }

    public void a() {
        k();
    }

    @Override // com.iab.omid.library.bigosg.c.a.InterfaceC0331a
    public void a(View view, com.iab.omid.library.bigosg.c.a aVar, JSONObject jSONObject) {
        c cVarC;
        if (f.d(view) && (cVarC = this.f24094g.c(view)) != c.UNDERLYING_VIEW) {
            JSONObject jSONObjectA = aVar.a(view);
            com.iab.omid.library.bigosg.d.b.a(jSONObject, jSONObjectA);
            if (!a(view, jSONObjectA)) {
                b(view, jSONObjectA);
                a(view, aVar, jSONObjectA, cVarC);
            }
            this.f24092e++;
        }
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f24091d.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f24091d.add(treeWalkerTimeLogger);
    }

    public void b() {
        c();
        this.f24091d.clear();
        f24087b.post(new Runnable() { // from class: com.iab.omid.library.bigosg.walking.TreeWalker.1
            @Override // java.lang.Runnable
            public void run() {
                TreeWalker.this.f24095h.a();
            }
        });
    }

    public void c() {
        l();
    }

    @VisibleForTesting
    public void d() {
        this.f24094g.c();
        long jA = d.a();
        com.iab.omid.library.bigosg.c.a aVarA = this.f24093f.a();
        if (this.f24094g.b().size() > 0) {
            for (String str : this.f24094g.b()) {
                JSONObject jSONObjectA = aVarA.a(null);
                a(str, this.f24094g.b(str), jSONObjectA);
                com.iab.omid.library.bigosg.d.b.a(jSONObjectA);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(str);
                this.f24095h.b(jSONObjectA, hashSet, jA);
            }
        }
        if (this.f24094g.a().size() > 0) {
            JSONObject jSONObjectA2 = aVarA.a(null);
            a(null, aVarA, jSONObjectA2, c.PARENT_VIEW);
            com.iab.omid.library.bigosg.d.b.a(jSONObjectA2);
            this.f24095h.a(jSONObjectA2, this.f24094g.a(), jA);
        } else {
            this.f24095h.a();
        }
        this.f24094g.d();
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f24091d.contains(treeWalkerTimeLogger)) {
            this.f24091d.remove(treeWalkerTimeLogger);
        }
    }
}
