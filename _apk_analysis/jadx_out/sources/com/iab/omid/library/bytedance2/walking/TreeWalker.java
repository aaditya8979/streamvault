package com.iab.omid.library.bytedance2.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.bytedance2.processor.a;
import com.iab.omid.library.bytedance2.utils.f;
import com.iab.omid.library.bytedance2.utils.h;
import com.iab.omid.library.bytedance2.walking.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class TreeWalker implements a.InterfaceC0334a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static TreeWalker f24212i = new TreeWalker();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static Handler f24213j = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static Handler f24214k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Runnable f24215l = new b();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Runnable f24216m = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f24218b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f24224h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f24217a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f24219c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<com.iab.omid.library.bytedance2.weakreference.a> f24220d = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.iab.omid.library.bytedance2.walking.a f24222f = new com.iab.omid.library.bytedance2.walking.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.iab.omid.library.bytedance2.processor.b f24221e = new com.iab.omid.library.bytedance2.processor.b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.iab.omid.library.bytedance2.walking.b f24223g = new com.iab.omid.library.bytedance2.walking.b(new com.iab.omid.library.bytedance2.walking.async.c());

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
            TreeWalker.this.f24223g.b();
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
            if (TreeWalker.f24214k != null) {
                TreeWalker.f24214k.post(TreeWalker.f24215l);
                TreeWalker.f24214k.postDelayed(TreeWalker.f24216m, 200L);
            }
        }
    }

    private void a(long j10) {
        if (this.f24217a.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f24217a) {
                treeWalkerTimeLogger.onTreeProcessed(this.f24218b, TimeUnit.NANOSECONDS.toMillis(j10));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f24218b, j10);
                }
            }
        }
    }

    private void a(View view, com.iab.omid.library.bytedance2.processor.a aVar, JSONObject jSONObject, com.iab.omid.library.bytedance2.walking.c cVar, boolean z10) {
        aVar.a(view, jSONObject, this, cVar == com.iab.omid.library.bytedance2.walking.c.PARENT_VIEW, z10);
    }

    private void a(String str, View view, JSONObject jSONObject) {
        com.iab.omid.library.bytedance2.processor.a aVarB = this.f24221e.b();
        String strB = this.f24222f.b(str);
        if (strB != null) {
            JSONObject jSONObjectA = aVarB.a(view);
            com.iab.omid.library.bytedance2.utils.c.a(jSONObjectA, str);
            com.iab.omid.library.bytedance2.utils.c.b(jSONObjectA, strB);
            com.iab.omid.library.bytedance2.utils.c.a(jSONObject, jSONObjectA);
        }
    }

    private boolean a(View view, JSONObject jSONObject) {
        a.C0336a c0336aC = this.f24222f.c(view);
        if (c0336aC == null) {
            return false;
        }
        com.iab.omid.library.bytedance2.utils.c.a(jSONObject, c0336aC);
        return true;
    }

    private boolean b(View view, JSONObject jSONObject) {
        String strD = this.f24222f.d(view);
        if (strD == null) {
            return false;
        }
        com.iab.omid.library.bytedance2.utils.c.a(jSONObject, strD);
        com.iab.omid.library.bytedance2.utils.c.a(jSONObject, Boolean.valueOf(this.f24222f.f(view)));
        this.f24222f.d();
        return true;
    }

    private void d() {
        a(f.b() - this.f24224h);
    }

    private void e() {
        this.f24218b = 0;
        this.f24220d.clear();
        this.f24219c = false;
        Iterator<com.iab.omid.library.bytedance2.adsession.a> it = com.iab.omid.library.bytedance2.internal.c.c().a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().e()) {
                this.f24219c = true;
                break;
            }
        }
        this.f24224h = f.b();
    }

    public static TreeWalker getInstance() {
        return f24212i;
    }

    private void i() {
        if (f24214k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f24214k = handler;
            handler.post(f24215l);
            f24214k.postDelayed(f24216m, 200L);
        }
    }

    private void k() {
        Handler handler = f24214k;
        if (handler != null) {
            handler.removeCallbacks(f24216m);
            f24214k = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        e();
        f();
        d();
    }

    @Override // com.iab.omid.library.bytedance2.processor.a.InterfaceC0334a
    public void a(View view, com.iab.omid.library.bytedance2.processor.a aVar, JSONObject jSONObject, boolean z10) {
        com.iab.omid.library.bytedance2.walking.c cVarE;
        if (h.d(view) && (cVarE = this.f24222f.e(view)) != com.iab.omid.library.bytedance2.walking.c.UNDERLYING_VIEW) {
            JSONObject jSONObjectA = aVar.a(view);
            com.iab.omid.library.bytedance2.utils.c.a(jSONObject, jSONObjectA);
            if (!b(view, jSONObjectA)) {
                boolean z11 = z10 || a(view, jSONObjectA);
                if (this.f24219c && cVarE == com.iab.omid.library.bytedance2.walking.c.OBSTRUCTION_VIEW && !z11) {
                    this.f24220d.add(new com.iab.omid.library.bytedance2.weakreference.a(view));
                }
                a(view, aVar, jSONObjectA, cVarE, z11);
            }
            this.f24218b++;
        }
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f24217a.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f24217a.add(treeWalkerTimeLogger);
    }

    @VisibleForTesting
    public void f() {
        this.f24222f.e();
        long jB = f.b();
        com.iab.omid.library.bytedance2.processor.a aVarA = this.f24221e.a();
        if (this.f24222f.b().size() > 0) {
            for (String str : this.f24222f.b()) {
                JSONObject jSONObjectA = aVarA.a(null);
                a(str, this.f24222f.a(str), jSONObjectA);
                com.iab.omid.library.bytedance2.utils.c.b(jSONObjectA);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(str);
                this.f24223g.a(jSONObjectA, hashSet, jB);
            }
        }
        if (this.f24222f.c().size() > 0) {
            JSONObject jSONObjectA2 = aVarA.a(null);
            a(null, aVarA, jSONObjectA2, com.iab.omid.library.bytedance2.walking.c.PARENT_VIEW, false);
            com.iab.omid.library.bytedance2.utils.c.b(jSONObjectA2);
            this.f24223g.b(jSONObjectA2, this.f24222f.c(), jB);
            if (this.f24219c) {
                Iterator<com.iab.omid.library.bytedance2.adsession.a> it = com.iab.omid.library.bytedance2.internal.c.c().a().iterator();
                while (it.hasNext()) {
                    it.next().a(this.f24220d);
                }
            }
        } else {
            this.f24223g.b();
        }
        this.f24222f.a();
    }

    public void g() {
        k();
    }

    public void h() {
        i();
    }

    public void j() {
        g();
        this.f24217a.clear();
        f24213j.post(new a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f24217a.contains(treeWalkerTimeLogger)) {
            this.f24217a.remove(treeWalkerTimeLogger);
        }
    }
}
