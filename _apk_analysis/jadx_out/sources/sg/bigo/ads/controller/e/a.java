package sg.bigo.ads.controller.e;

import android.content.ContentValues;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import sg.bigo.ads.ad.b;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.AdConfig;
import sg.bigo.ads.api.a.l;
import sg.bigo.ads.api.b;
import sg.bigo.ads.api.core.f;
import sg.bigo.ads.api.core.p;
import sg.bigo.ads.common.utils.k;
import sg.bigo.ads.common.utils.q;
import sg.bigo.ads.common.utils.t;
import sg.bigo.ads.controller.e.e;
import sg.bigo.ads.controller.f.a;
import sg.bigo.ads.controller.g.j;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements sg.bigo.ads.controller.e<sg.bigo.ads.api.b, sg.bigo.ads.api.core.b, l>, a.InterfaceC1036a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final Context f83233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sg.bigo.ads.controller.b.d f83234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sg.bigo.ads.controller.b.h f83235c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final sg.bigo.ads.controller.a.b f83236d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final d f83237e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final e f83238f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public f f83239g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LinkedList<C1035a<? extends sg.bigo.ads.api.b>> f83240h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final SparseArray<C1035a<sg.bigo.ads.controller.g.i>> f83241i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f83242j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final b f83244l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Context f83246n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final sg.bigo.ads.controller.b f83247o;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final AtomicBoolean f83245m = new AtomicBoolean(false);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f83243k = true;

    /* JADX INFO: renamed from: sg.bigo.ads.controller.e.a$a, reason: collision with other inner class name */
    public static class C1035a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public final T f83276a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        public final sg.bigo.ads.controller.c f83277b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f83278c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f83279d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f83280e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f83281f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public p f83282g;

        private C1035a(@NonNull T t10, @NonNull sg.bigo.ads.controller.c cVar) {
            this.f83280e = 1;
            this.f83281f = 0;
            this.f83276a = t10;
            this.f83277b = cVar;
        }

        public /* synthetic */ C1035a(Object obj, sg.bigo.ads.controller.c cVar, byte b10) {
            this(obj, cVar);
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile int f83284b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f83285c = true;

        public b() {
        }

        public static /* synthetic */ void a(b bVar) {
            if (bVar.f83284b == 2) {
                sg.bigo.ads.common.t.a.a(0, 3, "PrefetchConfigTask", "Task resumed.");
                bVar.a();
            }
        }

        public final void a() {
            if (this.f83284b == 0 || this.f83284b == 2) {
                sg.bigo.ads.common.t.a.a(0, 3, "PrefetchConfigTask", "Task set.");
                sg.bigo.ads.common.n.d.a(3, this, 5000L);
                this.f83284b = 1;
            }
        }

        public final void b() {
            if (this.f83284b == 1 || this.f83284b == 2) {
                if (this.f83284b == 1) {
                    sg.bigo.ads.common.n.d.a(this);
                }
                sg.bigo.ads.common.t.a.a(0, 3, "PrefetchConfigTask", "Task canceled.");
                this.f83284b = 3;
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (!sg.bigo.ads.common.f.b.e()) {
                b();
                return;
            }
            if (!this.f83285c || a.this.f83243k) {
                sg.bigo.ads.common.t.a.a(0, 3, "PrefetchConfigTask", "Start to execute task.");
                this.f83284b = 4;
                a.this.f83238f.a(new e.a() { // from class: sg.bigo.ads.controller.e.a.b.1
                    @Override // sg.bigo.ads.controller.e.e.a
                    public final void a(int i10) {
                        a.a(a.this, 1, (Map) null);
                    }

                    @Override // sg.bigo.ads.controller.e.e.a
                    public final void a(int i10, int i11, String str) {
                    }
                }, 0);
            } else {
                this.f83285c = false;
                sg.bigo.ads.common.t.a.b("PrefetchConfigTask", "The network is unavailable now. Task paused.");
                this.f83284b = 2;
            }
        }
    }

    public a(@NonNull Context context, @NonNull AdConfig adConfig) {
        sg.bigo.ads.controller.b bVar = new sg.bigo.ads.controller.b() { // from class: sg.bigo.ads.controller.e.a.1
            @Override // sg.bigo.ads.controller.e
            public final void a(int i10, int i11, int i12, @NonNull String str, @Nullable Object obj) {
                sg.bigo.ads.common.t.a.a(0, "AdController", "sdk config fetch error, seq=" + i10 + ", code=" + i11 + ", subCode=" + i12 + ", message=" + str);
            }

            @Override // sg.bigo.ads.controller.b
            public final void a(int i10, @NonNull String str) {
                sg.bigo.ads.common.t.a.a(0, 3, "AdController", "sdk config fetch success, seqId=" + i10 + ", data=" + str);
            }
        };
        this.f83247o = bVar;
        this.f83233a = context;
        sg.bigo.ads.controller.b.d dVar = new sg.bigo.ads.controller.b.d(context);
        this.f83234b = dVar;
        sg.bigo.ads.api.a.i.f81802a = dVar;
        sg.bigo.ads.controller.b.h hVar = new sg.bigo.ads.controller.b.h(context);
        this.f83235c = hVar;
        d dVar2 = new d(context, adConfig, dVar);
        this.f83237e = dVar2;
        sg.bigo.ads.controller.a.b bVar2 = new sg.bigo.ads.controller.a.b(context, dVar2, dVar);
        this.f83236d = bVar2;
        bVar2.f82897g = bVar;
        sg.bigo.ads.common.u.a.e.a(bVar2.f82891a.f82824m);
        sg.bigo.ads.common.u.g.f82458a = new sg.bigo.ads.common.u.a.a(dVar2);
        this.f83238f = new e(context, dVar, hVar, dVar2, bVar2);
        sg.bigo.ads.api.a.h hVar2 = sg.bigo.ads.api.a.i.f81802a;
        if (hVar2 != null) {
            sg.bigo.ads.api.a.b bVarQ = hVar2.q();
            if (bVarQ instanceof sg.bigo.ads.controller.b.b) {
                ((sg.bigo.ads.controller.b.b) bVarQ).f82999a = hVar;
            }
        }
        this.f83240h = new LinkedList<>();
        this.f83241i = new SparseArray<>();
        this.f83244l = new b();
    }

    public static /* synthetic */ void a(a aVar, int i10, Map map) {
        if (q.a((CharSequence) aVar.f83237e.f83292c.F()) || aVar.f83245m.getAndSet(true)) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jI = sg.bigo.ads.common.x.a.i();
        long jElapsedRealtime = aVar.f83242j == 0 ? -1L : SystemClock.elapsedRealtime() - aVar.f83242j;
        if (jCurrentTimeMillis - jI >= 300000) {
            sg.bigo.ads.core.d.b.a(jElapsedRealtime, i10, sg.bigo.ads.common.x.a.r(), sg.bigo.ads.common.m.b.e(), (Map<String, String>) map);
            sg.bigo.ads.common.x.a.c(jCurrentTimeMillis);
            sg.bigo.ads.core.d.b.a();
            sg.bigo.ads.core.d.b.a(aVar.f83237e);
        }
    }

    public static /* synthetic */ void a(a aVar, final C1035a c1035a) {
        if (aVar.f83234b.H()) {
            sg.bigo.ads.common.n.d.a(3, new Runnable() { // from class: sg.bigo.ads.controller.e.a.10
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public final void run() {
                    Ad adA;
                    sg.bigo.ads.api.b bVar = (sg.bigo.ads.api.b) c1035a.f83276a;
                    l lVarA = a.this.f83235c.a(bVar);
                    if ((lVarA != null ? lVarA.w() : false) || bVar.g()) {
                        a.this.f83240h.addFirst(c1035a);
                    } else {
                        if (lVarA != null && (adA = b.a.f79836a.a(lVarA)) != null) {
                            sg.bigo.ads.controller.c cVar = c1035a.f83277b;
                            if ((cVar instanceof sg.bigo.ads.controller.a) && (((sg.bigo.ads.controller.a) cVar).f82814a instanceof sg.bigo.ads.controller.d)) {
                                sg.bigo.ads.controller.c cVar2 = ((sg.bigo.ads.controller.a) cVar).f82814a;
                                if (cVar2 instanceof sg.bigo.ads.controller.d) {
                                    ((sg.bigo.ads.controller.d) cVar2).a(lVarA, adA);
                                }
                            }
                        }
                        a.this.f83240h.offer(c1035a);
                    }
                    a.this.a();
                }
            });
        } else {
            aVar.a(c1035a, 1005, 10004, "The country where the ad request comes from is not supported, please change your country to RU or US and have a try. Besides, check your COPPA setup on bigo's console. The app will fail to send an ad request if it's targeted children under 13.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @WorkerThread
    public final void a() {
        C1035a<? extends sg.bigo.ads.api.b> c1035aPoll;
        int i10;
        int i11;
        String str;
        boolean z10;
        sg.bigo.ads.api.core.b bVarA;
        sg.bigo.ads.api.a.h hVar;
        int i12;
        sg.bigo.ads.api.a.h hVar2;
        while (this.f83241i.size() < this.f83234b.D() && (c1035aPoll = this.f83240h.poll()) != null) {
            l lVarA = this.f83235c.a((sg.bigo.ads.api.b) c1035aPoll.f83276a);
            String str2 = ((sg.bigo.ads.api.b) c1035aPoll.f83276a).f81804b;
            byte b10 = 0;
            if (lVarA == null) {
                sg.bigo.ads.common.t.a.a(0, "AdController", "scheduleRequest error, slot is empty, slot id=" + ((sg.bigo.ads.api.b) c1035aPoll.f83276a).f81803a);
                i10 = 1014;
                i11 = 10006;
                str = "The slot id is inactive or invalid, please make sure the id is aligned with app id. If ids are correct, please wait for at least 30 minutes then try again";
            } else if (!lVarA.m()) {
                sg.bigo.ads.common.t.a.a(0, "AdController", "schedule next request, slot is disable, slot id=" + ((sg.bigo.ads.api.b) c1035aPoll.f83276a).f81803a);
                i10 = 1015;
                i11 = 10005;
                str = "The switch of the slot is turned off. Please check slot setup.";
            } else if (((sg.bigo.ads.api.b) c1035aPoll.f83276a).a(lVarA.b())) {
                sg.bigo.ads.common.t.a.a(0, "AdController", "schedule next request, this slot id is ad type " + lVarA.b() + ", request as type " + ((sg.bigo.ads.api.b) c1035aPoll.f83276a).c());
                i10 = 1016;
                i11 = 10007;
                str = "The ad type of this slot isn't consistent with the method to querying an ad.";
            } else {
                boolean zW = lVarA.w();
                if (!zW && !TextUtils.isEmpty(str2)) {
                    sg.bigo.ads.common.t.a.a(0, "AdController", "requsting an ordinary ad with server bidding payload.");
                }
                if (c1035aPoll.f83278c && (hVar2 = sg.bigo.ads.api.a.i.f81802a) != null && hVar2.q().f(lVarA.l()) > 1) {
                    sg.bigo.ads.common.t.a.a(0, "AdController", "schedule next request, slot is timeout, slot id=" + ((sg.bigo.ads.api.b) c1035aPoll.f83276a).f81803a);
                    i12 = 10207;
                } else {
                    if (!c1035aPoll.f83279d || (hVar = sg.bigo.ads.api.a.i.f81802a) == null || hVar.q().g(lVarA.l()) <= 1) {
                        if (sg.bigo.ads.api.core.a.d(lVarA.b())) {
                            sg.bigo.ads.common.x.a.j(lVarA.l());
                            int iA = lVarA.q().a("splash_impression_limit");
                            if (iA <= 0) {
                                z10 = true;
                            } else {
                                z10 = sg.bigo.ads.common.x.a.i(lVarA.l()) < iA;
                                if (!z10) {
                                    sg.bigo.ads.common.t.a.b("AdController", "The maximum number of ad impressions for the day (" + iA + ") has been reached.");
                                }
                            }
                            if (!z10) {
                                i10 = 1017;
                                i11 = 10008;
                                str = "The impressions of the ad has reached the limit. You can change this setup on bigo's console";
                            } else if (!zW && (bVarA = sg.bigo.ads.controller.c.a.a(lVarA, ((sg.bigo.ads.api.b) c1035aPoll.f83276a).f81810h)) != null) {
                                if (bVarA.J()) {
                                    sg.bigo.ads.controller.c.a.a(lVarA.l());
                                } else {
                                    sg.bigo.ads.common.t.a.a("AdController", "Succeed to load splash ads from local db.");
                                    f.a aVar = new f.a(bVarA, lVarA, (sg.bigo.ads.api.b) c1035aPoll.f83276a, this.f83233a, b());
                                    aVar.f81866a = this.f83237e;
                                    c1035aPoll.f83277b.a(-1, c1035aPoll.f83276a, aVar.a());
                                }
                            }
                        }
                        sg.bigo.ads.api.a.h hVar3 = sg.bigo.ads.api.a.i.f81802a;
                        if (hVar3 != null && hVar3.t() && !this.f83243k) {
                            a(c1035aPoll, 1003, 3006, "no network connection");
                            return;
                        }
                        sg.bigo.ads.controller.b.d dVar = this.f83234b;
                        d dVar2 = this.f83237e;
                        sg.bigo.ads.controller.a.b bVar = this.f83236d;
                        sg.bigo.ads.api.b bVar2 = (sg.bigo.ads.api.b) c1035aPoll.f83276a;
                        sg.bigo.ads.controller.g.i jVar = bVar2.e() ? new j(dVar, dVar2, bVar, bVar2, lVarA, this) : lVarA.w() ? new sg.bigo.ads.controller.g.c(dVar, dVar2, bVar2, lVarA, this) : new sg.bigo.ads.controller.g.b(dVar, dVar2, bVar, bVar2, lVarA, this);
                        this.f83241i.put(jVar.a(), new C1035a<>(jVar, c1035aPoll.f83277b, b10));
                        b.a aVar2 = ((sg.bigo.ads.api.b) c1035aPoll.f83276a).f81810h;
                        if (aVar2.f81821k == 0) {
                            aVar2.f81821k = System.currentTimeMillis();
                        }
                        c1035aPoll.f83280e = 2;
                        if (jVar instanceof sg.bigo.ads.controller.g.b) {
                            c1035aPoll.f83282g = ((sg.bigo.ads.controller.g.b) jVar).f83386h;
                        }
                        jVar.b();
                        Map<String, Object> mapA = sg.bigo.ads.core.b.a.a("load", lVarA, (sg.bigo.ads.api.b) c1035aPoll.f83276a, null, Integer.valueOf(lVarA.v()));
                        mapA.put("is_server_request", 1);
                        sg.bigo.ads.core.b.b.a().a("load", mapA);
                        return;
                    }
                    sg.bigo.ads.common.t.a.a(0, "AdController", "schedule next request, slot is loaded with cache, slot id=" + ((sg.bigo.ads.api.b) c1035aPoll.f83276a).f81803a);
                    i12 = 10208;
                }
                a(c1035aPoll, 1011, i12, "no fill");
            }
            a(c1035aPoll, i10, i11, str);
        }
    }

    @Override // sg.bigo.ads.controller.e
    public final /* synthetic */ void a(final int i10, final int i11, final int i12, @NonNull final String str, @Nullable l lVar) {
        final l lVar2 = lVar;
        sg.bigo.ads.common.n.d.a(3, new Runnable() { // from class: sg.bigo.ads.controller.e.a.3
            @Override // java.lang.Runnable
            public final void run() {
                C1035a<sg.bigo.ads.controller.g.i> c1035a = a.this.f83241i.get(i10);
                if (c1035a != null) {
                    sg.bigo.ads.api.b bVarK = c1035a.f83276a.k();
                    a.this.f83241i.remove(i10);
                    int i13 = i11;
                    String str2 = str;
                    if (i13 == 1005) {
                        if (i12 == -6) {
                            i13 = 1004;
                            str2 = "The sdk integration and ad request are successful, but no ad wins at this time.";
                        } else {
                            str2 = "Error from server: " + str;
                        }
                    }
                    c1035a.f83277b.a(i10, i13, i12, str2, Pair.create(bVarK, lVar2));
                }
                a.this.a();
            }
        });
    }

    @Override // sg.bigo.ads.controller.e
    public final /* synthetic */ void a(final int i10, @NonNull sg.bigo.ads.api.b bVar, @NonNull sg.bigo.ads.api.core.b[] bVarArr) {
        final sg.bigo.ads.api.b bVar2 = bVar;
        final sg.bigo.ads.api.core.b[] bVarArr2 = bVarArr;
        sg.bigo.ads.common.n.d.a(3, new Runnable() { // from class: sg.bigo.ads.controller.e.a.2
            @Override // java.lang.Runnable
            public final void run() {
                C1035a<sg.bigo.ads.controller.g.i> c1035a = a.this.f83241i.get(i10);
                if (c1035a != null) {
                    a.this.f83241i.remove(i10);
                    if (!k.a(bVarArr2)) {
                        sg.bigo.ads.api.core.f[] fVarArr = new sg.bigo.ads.api.core.f[bVarArr2.length];
                        int i11 = 0;
                        while (true) {
                            sg.bigo.ads.api.core.b[] bVarArr3 = bVarArr2;
                            if (i11 >= bVarArr3.length) {
                                break;
                            }
                            sg.bigo.ads.api.core.b bVar3 = bVarArr3[i11];
                            l lVarL = c1035a.f83276a.l();
                            sg.bigo.ads.api.b bVar4 = bVar2;
                            a aVar = a.this;
                            f.a aVar2 = new f.a(bVar3, lVarL, bVar4, aVar.f83233a, aVar.b());
                            aVar2.f81866a = a.this.f83237e;
                            fVarArr[i11] = aVar2.a();
                            if (sg.bigo.ads.api.core.a.d(bVar3.x())) {
                                t.a();
                                ContentValues contentValues = new ContentValues();
                                contentValues.put("slot", bVar3.b());
                                contentValues.put("log_id", Long.valueOf(bVar3.Z()));
                                long jCurrentTimeMillis = System.currentTimeMillis();
                                contentValues.put("start_time", Long.valueOf(jCurrentTimeMillis));
                                contentValues.put("end_time", Long.valueOf((bVar3.L() * 1000) + jCurrentTimeMillis));
                                JSONObject jSONObjectAf = bVar3.af();
                                contentValues.put("ad_data", jSONObjectAf == null ? "" : jSONObjectAf.toString());
                                contentValues.put("mtime", Long.valueOf(jCurrentTimeMillis));
                                sg.bigo.ads.common.g.a.a.b("tb_addata", contentValues);
                            }
                            i11++;
                        }
                        c1035a.f83277b.a(i10, bVar2, fVarArr);
                    }
                }
                a.this.a();
            }
        });
    }

    public final void a(String str, String str2) {
        this.f83236d.a(str, str2);
    }

    public final void a(@NonNull final C1035a<? extends sg.bigo.ads.api.b> c1035a, final int i10, final int i11, final String str) {
        sg.bigo.ads.common.n.d.a(2, new Runnable() { // from class: sg.bigo.ads.controller.e.a.11
            @Override // java.lang.Runnable
            public final void run() {
                c1035a.f83277b.a(0, i10, i11, str, new Pair(c1035a.f83276a, null));
            }
        });
    }

    @Override // sg.bigo.ads.controller.f.a.InterfaceC1036a
    public final void a(boolean z10) {
        this.f83243k = z10;
        if (z10) {
            sg.bigo.ads.common.aa.b.a();
            b.a(this.f83244l);
        }
    }

    public final Context b() {
        try {
            if (Build.VERSION.SDK_INT < 30) {
                return this.f83233a;
            }
            Context context = this.f83246n;
            if (context != null) {
                return context;
            }
            Context contextCreateWindowContext = this.f83233a.createDisplayContext(((DisplayManager) this.f83233a.getSystemService(DisplayManager.class)).getDisplay(0)).createWindowContext(1001, null);
            this.f83246n = contextCreateWindowContext;
            return contextCreateWindowContext;
        } catch (Throwable unused) {
            return this.f83233a;
        }
    }
}
