package sg.bigo.ads.common.u.a;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import sg.bigo.ads.common.l;

/* JADX INFO: loaded from: classes2.dex */
public class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, sg.bigo.ads.common.n.e> f82414a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private static l f82415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    private final Executor f82416c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final sg.bigo.ads.common.u.b.c f82417d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final sg.bigo.ads.common.u.b f82418e;

    public e(@Nullable Executor executor, sg.bigo.ads.common.u.b.c cVar, sg.bigo.ads.common.u.b bVar) {
        this.f82416c = executor == null ? a() : executor;
        this.f82417d = cVar;
        this.f82418e = bVar;
    }

    public static sg.bigo.ads.common.n.e a() {
        l lVar = f82415b;
        return a("DefaultNet", 5, lVar != null ? lVar.p() : false);
    }

    private static synchronized sg.bigo.ads.common.n.e a(String str, int i10, boolean z10) {
        sg.bigo.ads.common.n.e eVar;
        if (TextUtils.isEmpty(str)) {
            str = "DefaultNet";
        }
        Map<String, sg.bigo.ads.common.n.e> map = f82414a;
        eVar = map.get(str);
        if (eVar == null) {
            eVar = new sg.bigo.ads.common.n.e(str, i10, z10);
            map.put(str, eVar);
        }
        return eVar;
    }

    public static void a(@Nullable l lVar) {
        f82415b = lVar;
    }

    public static sg.bigo.ads.common.n.e b() {
        int iA;
        boolean zB;
        l lVar = f82415b;
        if (lVar != null) {
            iA = lVar.a();
            zB = lVar.b();
        } else {
            iA = 3;
            zB = false;
        }
        return a("ConfigNet", iA, zB);
    }

    public static sg.bigo.ads.common.n.e c() {
        int iC;
        boolean zD;
        l lVar = f82415b;
        if (lVar != null) {
            iC = lVar.c();
            zD = lVar.d();
        } else {
            iC = 2;
            zD = false;
        }
        return a("ReportNet", iC, zD);
    }

    public static sg.bigo.ads.common.n.e d() {
        int iE;
        boolean zF;
        l lVar = f82415b;
        if (lVar != null) {
            iE = lVar.e();
            zF = lVar.f();
        } else {
            iE = 12;
            zF = false;
        }
        return a("AdNet", iE, zF);
    }

    public static sg.bigo.ads.common.n.e e() {
        int iG;
        boolean zH;
        l lVar = f82415b;
        if (lVar != null) {
            iG = lVar.g();
            zH = lVar.h();
        } else {
            iG = 3;
            zH = false;
        }
        return a("CallbackNet", iG, zH);
    }

    public static sg.bigo.ads.common.n.e f() {
        int i10;
        boolean zJ;
        l lVar = f82415b;
        if (lVar != null) {
            i10 = lVar.i();
            zJ = lVar.j();
        } else {
            i10 = 3;
            zJ = false;
        }
        return a("VastNet", i10, zJ);
    }

    public static sg.bigo.ads.common.n.e g() {
        int iK;
        boolean zL;
        l lVar = f82415b;
        if (lVar != null) {
            iK = lVar.k();
            zL = lVar.l();
        } else {
            iK = 10;
            zL = false;
        }
        return a("TrackerNet", iK, zL);
    }

    public static sg.bigo.ads.common.n.e h() {
        int iM;
        boolean zN;
        l lVar = f82415b;
        if (lVar != null) {
            iM = lVar.m();
            zN = lVar.n();
        } else {
            iM = 5;
            zN = false;
        }
        return a("CreativeNet", iM, zN);
    }

    public static sg.bigo.ads.common.n.e i() {
        int i10;
        boolean zO;
        l lVar = f82415b;
        if (lVar != null) {
            i10 = 40;
            zO = lVar.o();
        } else {
            i10 = 5;
            zO = false;
        }
        return a("IconCreativeNet", i10, zO);
    }

    public static sg.bigo.ads.common.n.e j() {
        return a("BannerIconCreativeNet", f82415b != null ? 40 : 5, true);
    }

    public static void k() {
    }

    public void a(sg.bigo.ads.common.u.b.c cVar, sg.bigo.ads.common.u.b bVar) {
    }

    public final void l() {
        this.f82416c.execute(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        sg.bigo.ads.common.u.b bVar = this.f82418e;
        if (bVar != null) {
            bVar.a(this.f82417d);
        }
        a(this.f82417d, this.f82418e);
    }
}
