package com.ironsource;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.G;
import com.ironsource.Kg;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class tg implements F, Dg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final W0 f34117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final AbstractC4309w0 f34118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Bg f34119c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Kg f34120d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final wg f34121e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private G f34122f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private Eg f34123g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final List<A> f34124h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private A f34125i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f34126j;

    public static final class a implements xg {
        public a() {
        }

        @Override // com.ironsource.xg
        public void a(int i10, @NotNull String str) {
            tn.p.k(str, "errorReason");
            if (tg.this.f34126j) {
                return;
            }
            tg.this.f34119c.a(i10, str);
        }

        @Override // com.ironsource.xg
        public void a(@NotNull yg ygVar) {
            tn.p.k(ygVar, "waterfallInstances");
            if (tg.this.f34126j) {
                return;
            }
            tg.this.a(ygVar);
        }
    }

    public tg(@NotNull W0 w02, @NotNull AbstractC4309w0 abstractC4309w0, boolean z10, @NotNull Bg bg2) {
        tn.p.k(w02, "adTools");
        tn.p.k(abstractC4309w0, "adUnitData");
        tn.p.k(bg2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f34117a = w02;
        this.f34118b = abstractC4309w0;
        this.f34119c = bg2;
        this.f34120d = Kg.a.f29736a.a(z10, this);
        this.f34121e = wg.f34352d.a(w02, abstractC4309w0);
        this.f34124h = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(yg ygVar) {
        G gA = G.f29339c.a(this.f34118b, ygVar);
        this.f34122f = gA;
        this.f34123g = Eg.f29279c.a(this.f34117a, this.f34118b, this.f34121e.a(), ygVar, gA);
        j();
    }

    private final List<A> f() {
        G.c cVarC;
        List<A> listD;
        G g10 = this.f34122f;
        return (g10 == null || (cVarC = g10.c()) == null || (listD = cVarC.d()) == null) ? cn.w.m() : listD;
    }

    private final boolean i() {
        return this.f34125i != null;
    }

    private final void j() {
        G g10 = this.f34122f;
        G.b bVarD = g10 != null ? g10.d() : null;
        if (bVarD == null || bVarD.e()) {
            this.f34119c.a(509, "Mediation No fill");
            return;
        }
        if (!bVarD.f()) {
            Iterator<A> it = bVarD.a().iterator();
            while (it.hasNext()) {
                it.next().a(this);
            }
        } else {
            Eg eg2 = this.f34123g;
            if (eg2 != null) {
                eg2.a();
            }
        }
    }

    @Override // com.ironsource.Dg
    @Nullable
    public A a(int i10) {
        List<A> listF = f();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listF) {
            if (((A) obj).w()) {
                arrayList.add(obj);
            }
        }
        return (A) cn.f0.w0(arrayList, i10);
    }

    @Override // com.ironsource.Dg
    public void a() {
        IronLog.INTERNAL.verbose(C4173o0.a(this.f34117a, "destroyReadyToShowInstances", (String) null, 2, (Object) null));
        if (this.f34124h.isEmpty()) {
            return;
        }
        Iterator<T> it = this.f34124h.iterator();
        while (it.hasNext()) {
            ((A) it.next()).c();
        }
        this.f34124h.clear();
        this.f34117a.e().h().a();
    }

    @Override // com.ironsource.Dg
    public void a(@NotNull A a10) {
        tn.p.k(a10, C4157n2.f33007p);
        this.f34125i = a10;
        this.f34124h.remove(a10);
    }

    public final void a(@NotNull D d10) {
        tn.p.k(d10, "adInstanceFactory");
        this.f34121e.a(d10, new a());
    }

    public final void a(@NotNull J j10, boolean z10) {
        Eg eg2;
        tn.p.k(j10, "adInstancePresenter");
        A aC = this.f34120d.c();
        if (aC != null) {
            this.f34120d.a(aC);
            if (!z10 && (eg2 = this.f34123g) != null) {
                eg2.a(aC, f());
            }
            aC.a(j10);
        }
    }

    @Override // com.ironsource.F
    public void a(@NotNull IronSourceError ironSourceError, @NotNull A a10) {
        tn.p.k(ironSourceError, "error");
        tn.p.k(a10, C4157n2.f33007p);
        if (this.f34126j) {
            return;
        }
        j();
    }

    @Override // com.ironsource.F
    public void b(@NotNull A a10) {
        tn.p.k(a10, C4157n2.f33007p);
        if (this.f34126j || i()) {
            a10.c();
            return;
        }
        Eg eg2 = this.f34123g;
        if (eg2 != null) {
            eg2.a(a10);
        }
        this.f34124h.add(a10);
        if (this.f34124h.size() == 1) {
            Eg eg3 = this.f34123g;
            if (eg3 != null) {
                eg3.b(a10);
            }
            this.f34119c.b(a10);
            return;
        }
        G g10 = this.f34122f;
        if (g10 == null || !g10.a(a10)) {
            return;
        }
        this.f34119c.a(a10);
    }

    @Override // com.ironsource.Dg
    public boolean b() {
        return !this.f34124h.isEmpty();
    }

    public final void c() {
        this.f34120d.a();
    }

    public final void c(@NotNull A a10) {
        tn.p.k(a10, C4157n2.f33007p);
        Eg eg2 = this.f34123g;
        if (eg2 != null) {
            eg2.a(a10, this.f34118b.l(), this.f34118b.o());
        }
    }

    public final void d() {
        this.f34126j = true;
        A a10 = this.f34125i;
        if (a10 != null) {
            a10.b();
        }
    }

    @Nullable
    public final A e() {
        G.c cVarC;
        G g10 = this.f34122f;
        if (g10 == null || (cVarC = g10.c()) == null) {
            return null;
        }
        return cVarC.c();
    }

    @NotNull
    public final Ed g() {
        return this.f34120d.b();
    }

    public final boolean h() {
        Iterator<A> it = this.f34124h.iterator();
        while (it.hasNext()) {
            if (it.next().z()) {
                return true;
            }
        }
        return false;
    }
}
