package sg.bigo.ads;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.api.AdConfig;
import sg.bigo.ads.api.a.i;
import sg.bigo.ads.api.core.n;
import sg.bigo.ads.c;
import sg.bigo.ads.common.m;
import sg.bigo.ads.common.n.d;
import sg.bigo.ads.common.o;
import sg.bigo.ads.common.p.h;
import sg.bigo.ads.common.utils.f;
import sg.bigo.ads.common.utils.k;
import sg.bigo.ads.common.utils.q;
import sg.bigo.ads.common.utils.t;
import sg.bigo.ads.controller.e.a;
import sg.bigo.ads.controller.e.e;
import sg.bigo.ads.core.b.b.j;
import sg.bigo.ads.core.player.b;

/* JADX INFO: loaded from: classes10.dex */
public class BigoAdSdk {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static sg.bigo.ads.controller.e.a f79732d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile a f79733e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicBoolean f79729a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AtomicBoolean f79730b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AtomicBoolean f79731c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final CopyOnWriteArrayList<InitListener> f79734f = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final List<Pair<String, String>> f79735g = new ArrayList();

    /* JADX INFO: renamed from: sg.bigo.ads.BigoAdSdk$5, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass5 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f79742a;

        static {
            int[] iArr = new int[ConsentOptions.values().length];
            f79742a = iArr;
            try {
                iArr[ConsentOptions.LGPD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f79742a[ConsentOptions.GDPR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f79742a[ConsentOptions.CCPA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f79742a[ConsentOptions.COPPA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public interface InitListener {
        void onInitialized();
    }

    @NonNull
    public static a a(@NonNull Context context) {
        if (f79733e == null) {
            f79733e = new a(context);
        }
        if (!f79733e.f81995c) {
            f79733e.b(context);
        }
        return f79733e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static a.C1035a<sg.bigo.ads.api.b> a(final sg.bigo.ads.api.b bVar, sg.bigo.ads.controller.c cVar) {
        String str;
        bVar.f81810h.f81816f = System.currentTimeMillis();
        sg.bigo.ads.controller.a aVar = new sg.bigo.ads.controller.a(cVar);
        if (!f79729a.get()) {
            aVar.a(0, 1000, 0, "Please initialize SDK before request ads.", new Pair<>(bVar, null));
            return null;
        }
        b(f79732d.f83233a);
        final sg.bigo.ads.controller.e.a aVar2 = f79732d;
        if (q.a((CharSequence) aVar2.f83237e.f83290a.getAppKey())) {
            aVar.a(0, 1013, 10000, "App id cannot be empty, please pass the id when initializing bigo sdk.", new Pair(bVar, null));
            return null;
        }
        sg.bigo.ads.api.core.c cVarB = bVar.b();
        if (cVarB != null) {
            aVar.a(0, cVarB.f81840a, cVarB.f81841b, cVarB.f81842c, new Pair(bVar, null));
            return null;
        }
        int i10 = 0;
        Object[] objArr = 0;
        if (!sg.bigo.ads.common.x.a.q()) {
            final a.C1035a<sg.bigo.ads.api.b> c1035a = new a.C1035a<>(bVar, aVar, objArr == true ? 1 : 0);
            d.a(3, new Runnable() { // from class: sg.bigo.ads.controller.e.a.9
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public final void run() {
                    if (bVar.f()) {
                        ((sg.bigo.ads.api.b) c1035a.f83276a).b(0);
                        a.a(a.this, c1035a);
                    } else {
                        a.this.f83244l.b();
                        a.this.f83238f.a(new e.a() { // from class: sg.bigo.ads.controller.e.a.9.1
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // sg.bigo.ads.controller.e.e.a
                            public final void a(int i11) {
                                a.a(a.this, 1, (Map) null);
                                ((sg.bigo.ads.api.b) c1035a.f83276a).b(i11);
                                AnonymousClass9 anonymousClass9 = AnonymousClass9.this;
                                a.a(a.this, c1035a);
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // sg.bigo.ads.controller.e.e.a
                            public final void a(int i11, int i12, String str2) {
                                ((sg.bigo.ads.api.b) c1035a.f83276a).b(i11);
                                if (a.this.f83234b.N()) {
                                    AnonymousClass9 anonymousClass9 = AnonymousClass9.this;
                                    a.a(a.this, c1035a);
                                } else {
                                    AnonymousClass9 anonymousClass92 = AnonymousClass9.this;
                                    a.this.a(c1035a, 1008, i12, str2);
                                }
                            }
                        }, 1);
                    }
                }
            });
            return c1035a;
        }
        String str2 = "Missing CCPA consent";
        if (sg.bigo.ads.common.x.a.m() == 2) {
            str = "Missing GDPR consent";
            i10 = 1;
        } else {
            str = "Missing CCPA consent";
        }
        if (sg.bigo.ads.common.x.a.o() == 2) {
            i10++;
            str = "Missing LGPD consent";
        }
        if (sg.bigo.ads.common.x.a.n() == 2) {
            i10++;
        } else {
            str2 = str;
        }
        if (sg.bigo.ads.common.x.a.p() == 2) {
            i10++;
            str2 = "Missing COPPA consent";
        }
        aVar.a(0, 1001, 800, i10 > 1 ? "Missing user consent" : str2, new Pair(bVar, null));
        return null;
    }

    private static void a(final Context context, @NonNull final ConsentOptions consentOptions, boolean z10) {
        boolean zA = a(consentOptions, z10);
        if (z10 || !zA) {
            return;
        }
        d.a(1, new Runnable() { // from class: sg.bigo.ads.BigoAdSdk.2
            @Override // java.lang.Runnable
            public final void run() {
                HashMap map = new HashMap();
                map.put(ConsentOptions.GDPR, Integer.valueOf(sg.bigo.ads.common.x.a.m()));
                map.put(ConsentOptions.LGPD, Integer.valueOf(sg.bigo.ads.common.x.a.o()));
                map.put(ConsentOptions.CCPA, Integer.valueOf(sg.bigo.ads.common.x.a.n()));
                map.put(ConsentOptions.COPPA, Integer.valueOf(sg.bigo.ads.common.x.a.p()));
                map.remove(consentOptions);
                int iL = sg.bigo.ads.common.x.a.l();
                sg.bigo.ads.common.t.a.a(2, 5, "", "Revoking user consent...The cached data of user will be deleted now.");
                sg.bigo.ads.core.d.b.b bVar = sg.bigo.ads.core.d.c.a().f83739b;
                if (bVar != null) {
                    bVar.f83719c.f();
                }
                sg.bigo.ads.core.b.b bVarA = sg.bigo.ads.core.b.b.a();
                sg.bigo.ads.core.b.b.a aVar = bVarA.f83611a;
                if (aVar != null) {
                    aVar.f83620b.e();
                }
                j jVar = bVarA.f83613c;
                if (jVar != null) {
                    jVar.f83660c.g();
                    jVar.f83659b.g();
                }
                sg.bigo.ads.core.e.a.d dVarA = sg.bigo.ads.core.e.a.d.a();
                dVarA.f83811e = context.getApplicationContext();
                dVarA.b();
                dVarA.f83807a.clear();
                sg.bigo.ads.core.player.b bVarA2 = sg.bigo.ads.core.player.b.a();
                Context context2 = context;
                sg.bigo.ads.common.h.b bVar2 = bVarA2.f84289g;
                if (bVar2 != null) {
                    sg.bigo.ads.common.h.b.b.a();
                    bVar2.f82168a.clear();
                    bVar2.f82170c.clear();
                    bVar2.f82169b.clear();
                    bVar2.f82171d.clear();
                }
                List<n> list = bVarA2.f84286d;
                if (list != null) {
                    list.clear();
                }
                List<n> list2 = bVarA2.f84287e;
                if (list2 != null) {
                    list2.clear();
                }
                Map<String, b.a> map2 = bVarA2.f84288f;
                if (map2 != null) {
                    map2.clear();
                }
                h.a.f82370a.e(context2);
                f.b(new File(o.a(context)));
                sg.bigo.ads.common.g.a.a.a();
                sg.bigo.ads.common.x.a.s();
                BigoAdSdk.a(consentOptions);
                for (Map.Entry entry : map.entrySet()) {
                    int i10 = AnonymousClass5.f79742a[((ConsentOptions) entry.getKey()).ordinal()];
                    if (i10 == 1) {
                        sg.bigo.ads.common.x.a.e(((Integer) entry.getValue()).intValue());
                    } else if (i10 == 2) {
                        sg.bigo.ads.common.x.a.c(((Integer) entry.getValue()).intValue());
                    } else if (i10 == 3) {
                        sg.bigo.ads.common.x.a.d(((Integer) entry.getValue()).intValue());
                    } else if (i10 == 4) {
                        sg.bigo.ads.common.x.a.f(((Integer) entry.getValue()).intValue());
                    }
                }
                sg.bigo.ads.common.x.a.b(iL);
            }
        });
    }

    public static /* synthetic */ void a(final String str) {
        d.a(1, new Runnable() { // from class: sg.bigo.ads.BigoAdSdk.4
            @Override // java.lang.Runnable
            public final void run() {
                if (BigoAdSdk.f79732d != null) {
                    for (Pair pair : BigoAdSdk.f79735g) {
                        BigoAdSdk.f79732d.a((String) pair.first, (String) pair.second);
                    }
                    Map<String, String> mapB = sg.bigo.ads.controller.a.d.b(str);
                    if (!k.a(mapB)) {
                        for (Map.Entry<String, String> entry : mapB.entrySet()) {
                            BigoAdSdk.f79732d.a(entry.getKey(), entry.getValue());
                        }
                    }
                }
                BigoAdSdk.f79735g.clear();
            }
        });
    }

    public static /* synthetic */ boolean a(ConsentOptions consentOptions) {
        return a(consentOptions, false);
    }

    private static boolean a(@NonNull ConsentOptions consentOptions, boolean z10) {
        int i10 = z10 ? 1 : 2;
        boolean z11 = false;
        int i11 = AnonymousClass5.f79742a[consentOptions.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 == 4 && i10 != sg.bigo.ads.common.x.a.p()) {
                        sg.bigo.ads.common.x.a.f(i10);
                        z11 = true;
                    }
                } else if (i10 != sg.bigo.ads.common.x.a.n()) {
                    sg.bigo.ads.common.x.a.d(i10);
                    z11 = true;
                }
            } else if (i10 != sg.bigo.ads.common.x.a.m()) {
                sg.bigo.ads.common.x.a.c(i10);
                z11 = true;
            }
        } else if (i10 != sg.bigo.ads.common.x.a.o()) {
            sg.bigo.ads.common.x.a.e(i10);
            z11 = true;
        }
        if (z11) {
            f79731c.set(true);
        }
        return z11;
    }

    public static void addExtraHost(@Nullable final String str, @Nullable final String str2) {
        d.a(1, new Runnable() { // from class: sg.bigo.ads.BigoAdSdk.3
            @Override // java.lang.Runnable
            public final void run() {
                if (BigoAdSdk.f79732d == null || !BigoAdSdk.f79729a.get()) {
                    BigoAdSdk.f79735g.add(Pair.create(str, str2));
                } else {
                    BigoAdSdk.f79732d.a(str, str2);
                }
            }
        });
    }

    private static void b(@NonNull Context context) {
        if (!sg.bigo.ads.common.m.b.f()) {
            sg.bigo.ads.common.t.a.a(0, 3, "GDPR", "GDPRContent is not changed, so return");
            return;
        }
        sg.bigo.ads.common.m.b.g();
        f79731c.set(true);
        if (!sg.bigo.ads.common.x.b.a()) {
            sg.bigo.ads.common.x.b.f82806a = context.getApplicationContext();
        }
        if (!sg.bigo.ads.common.m.b.a()) {
            sg.bigo.ads.common.m.b.a(context.getApplicationContext());
        }
        if (!sg.bigo.ads.common.m.b.e(context)) {
            a(context, ConsentOptions.GDPR, sg.bigo.ads.common.x.a.l() != 2);
            sg.bigo.ads.common.t.a.a(0, 3, "GDPR", "GDPR applies is null, so return");
        } else if (sg.bigo.ads.common.m.a.b()) {
            a(context, ConsentOptions.GDPR, sg.bigo.ads.common.m.a.a());
        } else {
            a(context, ConsentOptions.GDPR, true);
        }
    }

    @Nullable
    public static String getBidderToken() {
        String str;
        String str2;
        if (!f79729a.get()) {
            str = "BigoAdSdk";
            str2 = "Please initialize SDK before get bidder token.";
        } else {
            if (f79732d != null) {
                if (f79731c.compareAndSet(true, false)) {
                    sg.bigo.ads.controller.e.a aVar = f79732d;
                    sg.bigo.ads.controller.e.f fVar = aVar.f83239g;
                    if (fVar == null) {
                        fVar = new sg.bigo.ads.controller.e.f();
                        aVar.f83239g = fVar;
                    }
                    if (fVar.f83342a != null) {
                        synchronized (sg.bigo.ads.controller.e.f.class) {
                            fVar.f83342a = null;
                        }
                    }
                }
                sg.bigo.ads.controller.e.a aVar2 = f79732d;
                if (aVar2.f83237e == null) {
                    return null;
                }
                sg.bigo.ads.controller.e.f fVar2 = aVar2.f83239g;
                if (fVar2 == null) {
                    fVar2 = new sg.bigo.ads.controller.e.f();
                    aVar2.f83239g = fVar2;
                }
                sg.bigo.ads.controller.e.d dVar = aVar2.f83237e;
                sg.bigo.ads.controller.e.f.f83341b = true;
                sg.bigo.ads.api.a.h hVar = i.f81802a;
                int iW = hVar != null ? hVar.w() : 0;
                return iW != 1 ? iW != 2 ? fVar2.a(dVar) : (fVar2.f83342a == null || fVar2.f83343c == 0 || System.currentTimeMillis() - fVar2.f83343c > 300000) ? fVar2.b(dVar) : fVar2.a(dVar) : fVar2.b(dVar);
            }
            str = "BigoAdSdk";
            str2 = "Error to get bidder token with empty controller.";
        }
        sg.bigo.ads.common.t.a.a(0, str, str2);
        return null;
    }

    @NonNull
    public static String getHashId() {
        return "4240b30";
    }

    @NonNull
    public static String getSDKVersion() {
        return "50602";
    }

    @NonNull
    public static String getSDKVersionName() {
        return "5.6.2";
    }

    public static void initialize(@NonNull Context context, @NonNull AdConfig adConfig, @Nullable InitListener initListener) {
        boolean z10 = !f79729a.get();
        if (!z10) {
            sg.bigo.ads.common.t.a.a(2, 5, "", "Bigo Ads SDK init had been invoked.");
        }
        if (sg.bigo.ads.controller.e.c.a().f83289b.get() == -1) {
            sg.bigo.ads.common.t.a.a(2, 5, "", "Bigo Ads SDK wait to initing due to empty config.");
            z10 = true;
        }
        if (!z10) {
            sg.bigo.ads.common.t.a.a(2, 5, "", "Avoid initializing Bigo Ads SDK repeatedly.");
            if (initListener != null) {
                initListener.onInitialized();
                return;
            }
            return;
        }
        if (initListener != null) {
            f79734f.add(initListener);
        }
        m.a(context);
        m.a(adConfig);
        Context applicationContext = context.getApplicationContext();
        m.a(applicationContext);
        if (f79730b.getAndSet(true)) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zIsDebug = adConfig.isDebug();
        sg.bigo.ads.common.y.a.a((int) (System.currentTimeMillis() / 1000));
        sg.bigo.ads.common.x.b.f82806a = applicationContext;
        sg.bigo.ads.common.m.b.a(applicationContext);
        sg.bigo.ads.common.d.a.a().a(applicationContext);
        b(context);
        t.a(zIsDebug);
        final String extra = adConfig.getExtra(AdConfig.EXTRA_KEY_HOST_RULES);
        final sg.bigo.ads.controller.e.a aVar = new sg.bigo.ads.controller.e.a(applicationContext, adConfig);
        f79732d = aVar;
        final Runnable runnable = new Runnable() { // from class: sg.bigo.ads.BigoAdSdk.1
            @Override // java.lang.Runnable
            public final void run() {
                BigoAdSdk.f79729a.set(true);
                BigoAdSdk.f79730b.set(false);
                BigoAdSdk.a(extra);
                sg.bigo.ads.common.t.a.a(2, 4, "", "Initialized Bigo Ads SDK successfully.");
                for (InitListener initListener2 : BigoAdSdk.f79734f) {
                    if (initListener2 != null) {
                        initListener2.onInitialized();
                    }
                }
                BigoAdSdk.f79734f.clear();
                if (c.a.a().isEmpty()) {
                    return;
                }
                d.a(3, new Runnable() { // from class: sg.bigo.ads.c.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        sg.bigo.ads.core.d.b.c(a.c());
                        a.b();
                    }
                });
            }
        };
        aVar.f83242j = jElapsedRealtime;
        aVar.f83237e.f83290a = adConfig;
        aVar.f83239g = new sg.bigo.ads.controller.e.f();
        d.a(new sg.bigo.ads.common.n.a() { // from class: sg.bigo.ads.controller.e.a.4
            @Override // sg.bigo.ads.common.n.a
            public final void a(Throwable th2) {
                sg.bigo.ads.core.d.b.a(3000, 10100, Log.getStackTraceString(th2));
            }
        });
        d.a(3, new Runnable() { // from class: sg.bigo.ads.controller.e.a.5
            /* JADX WARN: Removed duplicated region for block: B:24:0x022f  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x0235  */
            /* JADX WARN: Removed duplicated region for block: B:28:0x0270  */
            /* JADX WARN: Removed duplicated region for block: B:29:0x0277  */
            /* JADX WARN: Removed duplicated region for block: B:37:0x02e3  */
            /* JADX WARN: Removed duplicated region for block: B:38:0x02e8  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x0334  */
            /* JADX WARN: Removed duplicated region for block: B:44:0x03d5  */
            /* JADX WARN: Removed duplicated region for block: B:47:0x03ea  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instruction units count: 1012
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.controller.e.a.AnonymousClass5.run():void");
            }
        });
        sg.bigo.ads.common.n.e.a(new sg.bigo.ads.common.n.a() { // from class: sg.bigo.ads.controller.e.a.6
            @Override // sg.bigo.ads.common.n.a
            public final void a(Throwable th2) {
                String name = Thread.currentThread().getName();
                if (name.contains("ReportNet") || name.contains("Stat-Worker")) {
                    return;
                }
                sg.bigo.ads.core.d.b.a(3000, 10100, Log.getStackTraceString(th2));
            }
        });
    }

    public static boolean isInitialized() {
        return f79729a.get();
    }

    public static boolean isOffice() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void setUserConsent(@androidx.annotation.NonNull final android.content.Context r4, @androidx.annotation.NonNull final sg.bigo.ads.ConsentOptions r5, final boolean r6) {
        /*
            boolean r0 = sg.bigo.ads.common.x.b.a()
            if (r0 != 0) goto Lc
            android.content.Context r0 = r4.getApplicationContext()
            sg.bigo.ads.common.x.b.f82806a = r0
        Lc:
            boolean r0 = sg.bigo.ads.common.m.b.a()
            if (r0 != 0) goto L19
            android.content.Context r0 = r4.getApplicationContext()
            sg.bigo.ads.common.m.b.a(r0)
        L19:
            r0 = 3
            sg.bigo.ads.c$1 r1 = new sg.bigo.ads.c$1
            r1.<init>()
            sg.bigo.ads.common.n.d.a(r0, r1)
            sg.bigo.ads.ConsentOptions r0 = sg.bigo.ads.ConsentOptions.GDPR
            r1 = 4
            java.lang.String r2 = ""
            r3 = 2
            if (r5 != r0) goto L41
            sg.bigo.ads.common.x.a.a(r6)
            boolean r0 = sg.bigo.ads.common.m.b.e(r4)
            if (r0 == 0) goto L41
            java.lang.String r4 = java.lang.String.valueOf(r6)
            java.lang.String r5 = "Filter the consent status from user: "
        L39:
            java.lang.String r4 = r5.concat(r4)
            sg.bigo.ads.common.t.a.a(r3, r1, r2, r4)
            return
        L41:
            a(r4, r5, r6)
            java.lang.String r4 = java.lang.String.valueOf(r6)
            java.lang.String r5 = "Update the consent status from user: "
            goto L39
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.BigoAdSdk.setUserConsent(android.content.Context, sg.bigo.ads.ConsentOptions, boolean):void");
    }
}
