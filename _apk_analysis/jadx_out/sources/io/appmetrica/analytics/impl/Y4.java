package io.appmetrica.analytics.impl;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public class Y4 implements Qa, Fa, InterfaceC4915kh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f66214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final R4 f66215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Xe f66216c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C4655af f66217d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final M6 f66218e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C5166ui f66219f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Y8 f66220g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C4872j0 f66221h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C4898k0 f66222i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Sk f66223j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Rg f66224k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final N8 f66225l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final PublicLogger f66226m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C4933l9 f66227n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final T4 f66228o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final InterfaceC5082r9 f66229p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C4977n3 f66230q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final TimePassedChecker f66231r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C5163uf f66232s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final yo f66233t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Kk f66234u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final C5051q2 f66235v;

    public Y4(Context context, R4 r42, C4898k0 c4898k0, TimePassedChecker timePassedChecker, C4723d5 c4723d5, C5028p4 c5028p4) {
        this.f66214a = context.getApplicationContext();
        this.f66215b = r42;
        this.f66222i = c4898k0;
        this.f66231r = timePassedChecker;
        yo yoVarF = c4723d5.f();
        this.f66233t = yoVarF;
        this.f66232s = C5009oa.k().t();
        Xe xeA = c4723d5.e().a();
        this.f66216c = xeA;
        this.f66235v = c4723d5.a(xeA);
        Rg rgA = c4723d5.a(this);
        this.f66224k = rgA;
        PublicLogger publicLoggerA = c4723d5.d().a();
        this.f66226m = publicLoggerA;
        this.f66217d = C5009oa.k().y();
        C4872j0 c4872j0A = c4898k0.a(r42, publicLoggerA, xeA);
        this.f66221h = c4872j0A;
        this.f66225l = c4723d5.a();
        M6 m6B = c4723d5.b(this);
        this.f66218e = m6B;
        C5216wi c5216wiD = c4723d5.d(this);
        this.f66228o = C4723d5.b();
        w();
        Sk skA = C4723d5.a(this, yoVarF, new X4(this));
        this.f66223j = skA;
        publicLoggerA.info("Read app environment for component %s. Value: %s", r42.toString(), c4872j0A.a().f66948a);
        Kk kkC = c4723d5.c();
        this.f66234u = kkC;
        this.f66227n = c4723d5.a(xeA, yoVarF, skA, m6B, c4872j0A, kkC, c5216wiD);
        Y8 y8C = C4723d5.c(this);
        this.f66220g = y8C;
        this.f66219f = C4723d5.a(this, y8C);
        this.f66230q = c4723d5.b(xeA);
        this.f66229p = c4723d5.a(c5216wiD, m6B, rgA, c5028p4, r42, xeA);
        m6B.e();
    }

    public Y4(@NonNull Context context, @NonNull C4817gm c4817gm, @NonNull R4 r42, @NonNull C5028p4 c5028p4, @NonNull InterfaceC4863ih interfaceC4863ih, @NonNull W4 w42) {
        this(context, r42, new C4898k0(), new TimePassedChecker(), new C4723d5(context, r42, c5028p4, w42, c4817gm, interfaceC4863ih, C5009oa.k().w().c(), PackageManagerUtils.getAppVersionCodeInt(context), C5009oa.k().l(), new Q4()), c5028p4);
    }

    public final boolean A() {
        C4941lh c4941lh = (C4941lh) this.f66224k.a();
        return c4941lh.f67225n && this.f66231r.didTimePassSeconds(this.f66227n.f67205k, c4941lh.f67231t, "should force send permissions");
    }

    public final boolean B() {
        C4817gm c4817gm;
        C5163uf c5163uf = this.f66232s;
        c5163uf.f65811h.a(c5163uf.f65804a);
        boolean z10 = ((C5088rf) c5163uf.c()).f67620d;
        Rg rg2 = this.f66224k;
        synchronized (rg2) {
            c4817gm = rg2.f67507c.f65562a;
        }
        return !(z10 && c4817gm.f66862q);
    }

    public void C() {
    }

    @Override // io.appmetrica.analytics.impl.Qa, io.appmetrica.analytics.impl.Rl
    public final void a(@NonNull Kl kl2, @Nullable C4817gm c4817gm) {
    }

    @Override // io.appmetrica.analytics.impl.Qa
    public final void a(@NonNull Q5 q52) {
        String strA = Rf.a("Event received on service", EnumC4703cb.a(q52.f65791d), q52.getName(), q52.getValue());
        if (strA != null) {
            this.f66226m.info(strA, new Object[0]);
        }
        String str = this.f66215b.f65832b;
        if (TextUtils.isEmpty(str) || com.ironsource.Y1.f30690f.equals(str)) {
            return;
        }
        this.f66219f.a(q52, new C5141ti());
    }

    @Override // io.appmetrica.analytics.impl.Qa, io.appmetrica.analytics.impl.Rl
    public final synchronized void a(@NonNull C4817gm c4817gm) {
        this.f66224k.a(c4817gm);
        ((C4929l5) this.f66229p).e();
    }

    @Override // io.appmetrica.analytics.impl.Qa, io.appmetrica.analytics.impl.Fa
    public synchronized void a(@NonNull C5028p4 c5028p4) {
        long jLongValue;
        this.f66224k.a(c5028p4);
        boolean z10 = false;
        if (Boolean.TRUE.equals(c5028p4.f67497h)) {
            this.f66226m.setEnabled(true);
        } else {
            if (Boolean.FALSE.equals(c5028p4.f67497h)) {
                this.f66226m.setEnabled(false);
            }
        }
        C5051q2 c5051q2 = this.f66235v;
        Set<String> set = c5028p4.f67504o;
        long jCurrentTimeMillis = c5051q2.f67557d.currentTimeMillis();
        boolean z11 = false;
        for (String str : set) {
            Long l10 = (Long) c5051q2.f67558e.get(str);
            if (l10 != null) {
                jLongValue = l10.longValue();
            } else {
                jLongValue = -1;
                z11 = true;
            }
            if (jCurrentTimeMillis - jLongValue > c5051q2.f67555b) {
                c5051q2.f67558e.put(str, Long.valueOf(jCurrentTimeMillis));
                z10 = true;
            }
        }
        if (z10) {
            c5051q2.a(c5051q2.f67558e);
            c5051q2.f67554a.a(c5051q2.f67558e);
        }
        if (z11) {
            this.f66224k.e();
        }
    }

    public final void a(@Nullable String str) {
        this.f66216c.j(str).b();
    }

    @Override // io.appmetrica.analytics.impl.Fa
    @NonNull
    public final R4 b() {
        return this.f66215b;
    }

    public final void b(Q5 q52) {
        this.f66221h.a(q52.f65793f);
        C4847i0 c4847i0A = this.f66221h.a();
        C4898k0 c4898k0 = this.f66222i;
        Xe xe2 = this.f66216c;
        synchronized (c4898k0) {
            if (c4847i0A.f66949b > xe2.d().f66949b) {
                xe2.a(c4847i0A).b();
                this.f66226m.info("Save new app environment for %s. Value: %s", this.f66215b, c4847i0A.f66948a);
            }
        }
    }

    @NonNull
    public CounterConfigurationReporterType c() {
        return CounterConfigurationReporterType.MANUAL;
    }

    public final void d() {
        C4872j0 c4872j0 = this.f66221h;
        synchronized (c4872j0) {
            c4872j0.f67000a = new Gc();
        }
        this.f66222i.a(this.f66221h.a(), this.f66216c);
    }

    public final synchronized void e() {
        ((C4929l5) this.f66229p).d();
    }

    @NonNull
    public final C5051q2 f() {
        return this.f66235v;
    }

    @NonNull
    public final C4977n3 g() {
        return this.f66230q;
    }

    @Override // io.appmetrica.analytics.impl.Fa
    @NonNull
    public final Context getContext() {
        return this.f66214a;
    }

    @NonNull
    public final Xe h() {
        return this.f66216c;
    }

    @NonNull
    public final M6 i() {
        return this.f66218e;
    }

    @NonNull
    public final N8 j() {
        return this.f66225l;
    }

    @NonNull
    public final Y8 k() {
        return this.f66220g;
    }

    @NonNull
    public final C4933l9 l() {
        return this.f66227n;
    }

    @NonNull
    public final InterfaceC5082r9 m() {
        return this.f66229p;
    }

    @NonNull
    public final C4941lh n() {
        return (C4941lh) this.f66224k.a();
    }

    @Nullable
    public final String o() {
        return this.f66216c.j();
    }

    @NonNull
    public final PublicLogger p() {
        return this.f66226m;
    }

    @NonNull
    public final C4655af q() {
        return this.f66217d;
    }

    @NonNull
    public final Kk r() {
        return this.f66234u;
    }

    @NonNull
    public final Sk s() {
        return this.f66223j;
    }

    @NonNull
    public final C4817gm t() {
        C4817gm c4817gm;
        Rg rg2 = this.f66224k;
        synchronized (rg2) {
            c4817gm = rg2.f67507c.f65562a;
        }
        return c4817gm;
    }

    @NonNull
    public final yo u() {
        return this.f66233t;
    }

    public final void v() {
        C4933l9 c4933l9 = this.f66227n;
        int i10 = c4933l9.f67204j;
        c4933l9.f67206l = i10;
        c4933l9.f67195a.a(i10).b();
    }

    public final void w() {
        int iOptInt;
        int libraryApiLevel = AppMetrica.getLibraryApiLevel();
        yo yoVar = this.f66233t;
        synchronized (yoVar) {
            iOptInt = yoVar.f68052a.a().optInt("last_migration_api_level", 0);
        }
        Integer numValueOf = Integer.valueOf(iOptInt);
        if (numValueOf.intValue() < libraryApiLevel) {
            this.f66228o.getClass();
            List listE = cn.v.e(new V4(this));
            int iIntValue = numValueOf.intValue();
            Iterator it = listE.iterator();
            while (it.hasNext()) {
                ((U4) it.next()).a(iIntValue);
            }
            this.f66233t.b(libraryApiLevel);
        }
    }

    public final boolean x() {
        C4941lh c4941lh = (C4941lh) this.f66224k.a();
        return c4941lh.f67225n && c4941lh.isIdentifiersValid() && this.f66231r.didTimePassSeconds(this.f66227n.f67205k, c4941lh.f67230s, "need to check permissions");
    }

    public final boolean y() {
        C4933l9 c4933l9 = this.f66227n;
        return c4933l9.f67206l < c4933l9.f67204j && ((C4941lh) this.f66224k.a()).f67226o && ((C4941lh) this.f66224k.a()).isIdentifiersValid();
    }

    public final void z() {
        Rg rg2 = this.f66224k;
        synchronized (rg2) {
            rg2.f67505a = null;
        }
    }
}
