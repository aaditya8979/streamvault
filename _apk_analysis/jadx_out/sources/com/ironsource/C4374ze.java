package com.ironsource;

import android.content.Context;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.C3987dd;
import com.ironsource.C4374ze;
import com.ironsource.Lb;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.ze, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C4374ze {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Re f34532b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private static C4131le f34538h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private static C4169ne f34539i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static boolean f34540j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static long f34541k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C4374ze f34531a = new C4374ze();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final bn.g f34533c = kotlin.b.b(a.f34542a);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f34534d = C4374ze.class.getSimpleName();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final De f34535e = new De();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final Ke f34536f = new Ke();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final List<InterfaceC4238re> f34537g = new ArrayList();

    /* JADX INFO: renamed from: com.ironsource.ze$a */
    public static final class a extends Lambda implements sn.a<InterfaceC4180o7> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f34542a = new a();

        public a() {
            super(0);
        }

        @Override // sn.a
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC4180o7 invoke() {
            return Lb.f29764s.d().k();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.ze$b */
    public static final class b implements InterfaceC4238re {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f34543a;

        public b(Context context) {
            this.f34543a = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(Context context, C4131le c4131le) throws JSONException {
            tn.p.k(c4131le, "$sdkConfig");
            C4374ze c4374ze = C4374ze.f34531a;
            tn.p.j(context, "applicationContext");
            c4374ze.a(context, c4131le);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(C4169ne c4169ne) {
            tn.p.k(c4169ne, "$error");
            C4374ze.f34531a.a(c4169ne);
        }

        @Override // com.ironsource.InterfaceC4238re
        public void a(@NotNull final C4131le c4131le) {
            tn.p.k(c4131le, "sdkConfig");
            De de2 = C4374ze.f34535e;
            final Context context = this.f34543a;
            de2.a(new Runnable() { // from class: com.ironsource.gn
                @Override // java.lang.Runnable
                public final void run() throws JSONException {
                    C4374ze.b.a(context, c4131le);
                }
            });
        }

        @Override // com.ironsource.InterfaceC4238re
        public void a(@NotNull final C4169ne c4169ne) {
            tn.p.k(c4169ne, "error");
            C4374ze.f34535e.a(new Runnable() { // from class: com.ironsource.hn
                @Override // java.lang.Runnable
                public final void run() {
                    C4374ze.b.b(c4169ne);
                }
            });
        }
    }

    private C4374ze() {
    }

    private final void a(Context context, X9 x92, Ne ne2) {
        x92.i(ne2.g().h());
        x92.c(ne2.g().d());
        A1 a1B = ne2.c().b();
        tn.p.h(a1B);
        x92.a(a1B.a());
        x92.d(a1B.c().b());
        x92.b(a1B.k().b());
        x92.a(Boolean.valueOf(IronSourceUtils.c(context)));
        A1 a1B2 = ne2.c().b();
        tn.p.h(a1B2);
        x92.b(a1B2.f().b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Context context, C4131le c4131le) throws JSONException {
        b(c4131le);
        K1 k1A = c4131le.a();
        C3925a5 c3925a5 = C3925a5.f30911a;
        c3925a5.c(k1A.g());
        Lb.b bVar = Lb.f29764s;
        bVar.a().o().a(k1A.c());
        c3925a5.a(k1A.f());
        c3925a5.a(k1A.j());
        IronSourceThreadManager.INSTANCE.setUseSharedExecutorService(k1A.h());
        c().a(k1A);
        De de2 = f34535e;
        a(context, de2.c(), c4131le.d());
        de2.a(new Date().getTime() - f34541k, c4131le.f());
        Re re2 = new Re();
        f34532b = re2;
        re2.a(c());
        IronSourceUtils.e(context, c4131le.d().toString());
        bVar.d().q().c(true);
        J9.i().c(true);
        C3952be.i().c(true);
        C3987dd.P.c(true);
        b(context, c4131le);
        IronSourceLoggerManager.getLogger(0).setDebugLevel(c4131le.e().b());
        D1 d1B = c4131le.b();
        if (d1B.f()) {
            de2.a(d1B);
        }
        a(c4131le);
        new C3987dd.a().a();
        d();
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("parameters for init url: " + Pe.a());
        ironLog.verbose("parameters for init POST data: " + Pe.b());
    }

    private final void a(C4131le c4131le) {
        Iterator<InterfaceC4238re> it = f34537g.iterator();
        while (it.hasNext()) {
            a(it.next(), c4131le);
        }
        f34537g.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(C4169ne c4169ne) {
        f34539i = c4169ne;
        a(false);
        Iterator<InterfaceC4238re> it = f34537g.iterator();
        while (it.hasNext()) {
            a(it.next(), c4169ne);
        }
        f34537g.clear();
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "Mediation availability false reason: " + c4169ne, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InterfaceC4238re interfaceC4238re, Context context, C4272te c4272te, Context context2) throws Throwable {
        tn.p.k(interfaceC4238re, "$listener");
        tn.p.k(context, "$context");
        tn.p.k(c4272te, "$initRequest");
        C4131le c4131le = f34538h;
        if (c4131le != null) {
            f34531a.a(interfaceC4238re, c4131le);
            return;
        }
        f34537g.add(interfaceC4238re);
        if (f34540j) {
            return;
        }
        f34539i = null;
        f34531a.a(true);
        f34541k = new Date().getTime();
        f34536f.a(context, c4272te, f34535e, new b(context2));
    }

    private final void a(final InterfaceC4238re interfaceC4238re, final C4131le c4131le) {
        f34535e.e(new Runnable() { // from class: com.ironsource.cn
            @Override // java.lang.Runnable
            public final void run() {
                C4374ze.b(interfaceC4238re, c4131le);
            }
        });
    }

    private final void a(final InterfaceC4238re interfaceC4238re, final C4169ne c4169ne) {
        f34535e.e(new Runnable() { // from class: com.ironsource.an
            @Override // java.lang.Runnable
            public final void run() {
                C4374ze.b(interfaceC4238re, c4169ne);
            }
        });
    }

    private final void a(AbstractC4244s3 abstractC4244s3, H1 h12, Context context, Ne ne2, boolean z10) {
        abstractC4244s3.a(z10);
        abstractC4244s3.a(h12.c(), context);
        abstractC4244s3.b(h12.d(), context);
        abstractC4244s3.a(h12.f());
        abstractC4244s3.d(h12.e());
        abstractC4244s3.b(h12.a());
        abstractC4244s3.b(h12.i(), context);
        abstractC4244s3.c(h12.h(), context);
        abstractC4244s3.a(h12.j(), context);
        abstractC4244s3.d(h12.g(), context);
        A1 a1B = ne2.c().b();
        tn.p.h(a1B);
        abstractC4244s3.a(a1B.j());
        abstractC4244s3.b(h12.k());
        abstractC4244s3.c(h12.b());
    }

    public static /* synthetic */ void a(C4374ze c4374ze, AbstractC4244s3 abstractC4244s3, H1 h12, Context context, Ne ne2, boolean z10, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            z10 = true;
        }
        c4374ze.a(abstractC4244s3, h12, context, ne2, z10);
    }

    private final void a(boolean z10) {
        f34540j = z10;
        f34535e.a(b());
    }

    private final Be b() {
        return f34538h != null ? Be.INITIATED : f34539i != null ? Be.INIT_FAILED : f34540j ? Be.INIT_IN_PROGRESS : Be.NOT_INIT;
    }

    private final void b(Context context, C4131le c4131le) {
        H1 h1B;
        Qb qbE;
        H1 h1G;
        U2 u2C;
        H1 h1G2;
        H9 h9D;
        H1 h1I;
        Zd zdF;
        H1 h1M;
        H1 h1B2;
        Ne neD = c4131le.d();
        A1 a1B = neD.c().b();
        boolean zL = (a1B == null || (h1B2 = a1B.b()) == null) ? false : h1B2.l();
        T3 t3C = neD.c();
        boolean zL2 = (t3C == null || (zdF = t3C.f()) == null || (h1M = zdF.m()) == null) ? false : h1M.l();
        T3 t3C2 = neD.c();
        boolean zL3 = (t3C2 == null || (h9D = t3C2.d()) == null || (h1I = h9D.i()) == null) ? false : h1I.l();
        T3 t3C3 = neD.c();
        boolean zL4 = (t3C3 == null || (u2C = t3C3.c()) == null || (h1G2 = u2C.g()) == null) ? false : h1G2.l();
        T3 t3C4 = neD.c();
        boolean zL5 = (t3C4 == null || (qbE = t3C4.e()) == null || (h1G = qbE.g()) == null) ? false : h1G.l();
        if (zL) {
            A1 a1B2 = neD.c().b();
            if (a1B2 != null && (h1B = a1B2.b()) != null) {
                a(f34531a, Lb.f29764s.d().q(), h1B, context, neD, false, 16, null);
            }
        } else {
            Lb.f29764s.d().q().a(false);
        }
        if (zL2) {
            T3 t3C5 = neD.c();
            Zd zdF2 = t3C5 != null ? t3C5.f() : null;
            tn.p.h(zdF2);
            H1 h1M2 = zdF2.m();
            C3952be c3952beI = C3952be.i();
            tn.p.j(c3952beI, "getInstance()");
            tn.p.j(h1M2, "rewardedVideoConfig");
            a(this, c3952beI, h1M2, context, neD, false, 16, null);
        } else {
            C3952be.i().a(false);
        }
        if (zL3) {
            T3 t3C6 = neD.c();
            H9 h9D2 = t3C6 != null ? t3C6.d() : null;
            tn.p.h(h9D2);
            H1 h1I2 = h9D2.i();
            J9 j9I = J9.i();
            tn.p.j(j9I, "getInstance()");
            tn.p.j(h1I2, "interstitialConfig");
            a(this, j9I, h1I2, context, neD, false, 16, null);
        } else if (zL4) {
            T3 t3C7 = neD.c();
            U2 u2C2 = t3C7 != null ? t3C7.c() : null;
            tn.p.h(u2C2);
            H1 h1G3 = u2C2.g();
            J9 j9I2 = J9.i();
            tn.p.j(j9I2, "getInstance()");
            tn.p.j(h1G3, "bannerConfig");
            a(this, j9I2, h1G3, context, neD, false, 16, null);
        } else if (zL5) {
            T3 t3C8 = neD.c();
            Qb qbE2 = t3C8 != null ? t3C8.e() : null;
            tn.p.h(qbE2);
            H1 h1G4 = qbE2.g();
            J9 j9I3 = J9.i();
            tn.p.j(j9I3, "getInstance()");
            a(this, j9I3, h1G4, context, neD, false, 16, null);
        } else {
            J9.i().a(false);
        }
        T3 t3C9 = neD.c();
        A1 a1B3 = t3C9 != null ? t3C9.b() : null;
        tn.p.h(a1B3);
        C4005ed c4005edI = a1B3.i();
        boolean zA = c4005edI.a();
        String strB = c4005edI.b();
        boolean zC = c4005edI.c();
        int iD = c4005edI.d();
        int[] iArrE = c4005edI.e();
        int[] iArrF = c4005edI.f();
        C3987dd c3987dd = C3987dd.P;
        c3987dd.a(zA);
        if (zA) {
            c3987dd.b(strB, context);
            c3987dd.b(iArrE, context);
            c3987dd.c(iArrF, context);
            c3987dd.b(zC);
            c3987dd.c(iD);
        }
    }

    private final void b(C4131le c4131le) {
        f34538h = c4131le;
        a(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(InterfaceC4238re interfaceC4238re, C4131le c4131le) {
        tn.p.k(interfaceC4238re, "$listener");
        tn.p.k(c4131le, "$sdkConfig");
        interfaceC4238re.a(c4131le);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(InterfaceC4238re interfaceC4238re, C4169ne c4169ne) {
        tn.p.k(interfaceC4238re, "$listener");
        tn.p.k(c4169ne, "$error");
        interfaceC4238re.a(c4169ne);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C4289ue c4289ue) {
        tn.p.k(c4289ue, "$serverResponse");
        C4131le c4131le = new C4131le(c4289ue);
        C4374ze c4374ze = f34531a;
        c4374ze.b(c4131le);
        c4374ze.a(c4131le);
    }

    private final InterfaceC4180o7 c() {
        return (InterfaceC4180o7) f34533c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C4169ne c4169ne) {
        tn.p.k(c4169ne, "$error");
        f34531a.a(c4169ne);
    }

    private final void d() {
        if (Lb.f29764s.d().g().h()) {
            C3952be.i().a(new C5(D5.EP_CONFIG_RECEIVED, (JSONObject) null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f() {
        f34531a.a(true);
    }

    public final void a(@NotNull final Context context, @NotNull final C4272te c4272te, @NotNull final InterfaceC4238re interfaceC4238re) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(c4272te, "initRequest");
        tn.p.k(interfaceC4238re, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        final Context applicationContext = context.getApplicationContext();
        f34535e.c(new Runnable() { // from class: com.ironsource.fn
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                C4374ze.a(interfaceC4238re, context, c4272te, applicationContext);
            }
        });
    }

    public final void a(@NotNull final C4289ue c4289ue) {
        tn.p.k(c4289ue, "serverResponse");
        f34535e.c(new Runnable() { // from class: com.ironsource.bn
            @Override // java.lang.Runnable
            public final void run() {
                C4374ze.b(c4289ue);
            }
        });
    }

    public final void b(@NotNull final C4169ne c4169ne) {
        tn.p.k(c4169ne, "error");
        f34535e.c(new Runnable() { // from class: com.ironsource.dn
            @Override // java.lang.Runnable
            public final void run() {
                C4374ze.c(c4169ne);
            }
        });
    }

    public final void e() {
        f34535e.c(new Runnable() { // from class: com.ironsource.en
            @Override // java.lang.Runnable
            public final void run() {
                C4374ze.f();
            }
        });
    }
}
