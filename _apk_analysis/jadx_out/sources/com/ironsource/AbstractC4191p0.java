package com.ironsource;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.E0;
import com.ironsource.InterfaceC4081j0;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.lang.ref.WeakReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC4191p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final AbstractC4309w0 f33176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final W6 f33177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final W0 f33178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private M0 f33179d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private InterfaceC4343y0 f33180e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final tg f33181f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final WeakReference<K0> f33182g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private C4122l5 f33183h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final E5 f33184i;

    /* JADX INFO: renamed from: com.ironsource.p0$a */
    public class a implements E {
        public a() {
        }

        @Override // com.ironsource.E
        public void a(@NotNull A a10) {
            tn.p.k(a10, C4157n2.f33007p);
            AbstractC4191p0.this.f33184i.a().a(AbstractC4191p0.this.h());
            K0 k02 = (K0) AbstractC4191p0.this.f33182g.get();
            if (k02 != null) {
                k02.e();
            }
        }

        @Override // com.ironsource.E
        public void a(@NotNull A a10, @NotNull IronSourceError ironSourceError) {
            tn.p.k(a10, C4157n2.f33007p);
            tn.p.k(ironSourceError, "error");
            IronLog.INTERNAL.verbose(AbstractC4191p0.this.a(a10.q()));
            AbstractC4191p0.this.f33184i.a().a(AbstractC4191p0.this.h(), ironSourceError.getErrorCode(), ironSourceError.getErrorMessage(), null);
            InterfaceC4343y0 interfaceC4343y0I = AbstractC4191p0.this.i();
            if (interfaceC4343y0I != null) {
                interfaceC4343y0I.c(ironSourceError);
            }
        }

        @Override // com.ironsource.E
        public void b(@NotNull A a10) {
            tn.p.k(a10, C4157n2.f33007p);
            IronLog.INTERNAL.verbose(AbstractC4191p0.this.a(a10.q()));
            AbstractC4191p0.this.k().c(a10);
            AbstractC4191p0.this.f33184i.a().g(AbstractC4191p0.this.h());
            AbstractC4191p0.this.f().l().b(AbstractC4191p0.this.e().b().a());
        }
    }

    /* JADX INFO: renamed from: com.ironsource.p0$b */
    public static final class b implements Bg {
        public b() {
        }

        @Override // com.ironsource.Bg
        public void a(int i10, @NotNull String str) {
            tn.p.k(str, "errorReason");
            AbstractC4191p0.this.a(i10, str);
        }

        @Override // com.ironsource.Bg
        public void a(@NotNull A a10) {
            tn.p.k(a10, C4157n2.f33007p);
            AbstractC4191p0.this.f().e().a().e(AbstractC4191p0.this.h());
            M0 m0J = AbstractC4191p0.this.j();
            if (m0J != null) {
                m0J.b(new C4258t0(AbstractC4191p0.this, a10.e()));
            }
        }

        @Override // com.ironsource.Bg
        public void b(@NotNull A a10) {
            tn.p.k(a10, C4157n2.f33007p);
            AbstractC4191p0.this.f33184i.e().a(C4122l5.a(AbstractC4191p0.this.f33183h), AbstractC4191p0.this.e().u());
            M0 m0J = AbstractC4191p0.this.j();
            if (m0J != null) {
                m0J.a(new C4258t0(AbstractC4191p0.this, a10.e()));
            }
        }
    }

    public AbstractC4191p0(@NotNull C4173o0 c4173o0, @NotNull AbstractC4309w0 abstractC4309w0, @NotNull K0 k02, @NotNull W6 w62) {
        tn.p.k(c4173o0, "adTools");
        tn.p.k(abstractC4309w0, "adUnitData");
        tn.p.k(k02, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        tn.p.k(w62, "taskScheduler");
        this.f33176a = abstractC4309w0;
        this.f33177b = w62;
        W0 w02 = new W0(c4173o0, abstractC4309w0, E0.b.MEDIATION);
        this.f33178c = w02;
        this.f33181f = new tg(w02, abstractC4309w0, false, c());
        this.f33182g = new WeakReference<>(k02);
        this.f33184i = w02.e();
        IronLog.INTERNAL.verbose("adFormat = " + abstractC4309w0.b().a() + ", adUnitId = " + abstractC4309w0.b().c());
    }

    public /* synthetic */ AbstractC4191p0(C4173o0 c4173o0, AbstractC4309w0 abstractC4309w0, K0 k02, W6 w62, int i10, tn.i iVar) {
        this(c4173o0, abstractC4309w0, k02, (i10 & 8) != 0 ? new W6(X6.a(c4173o0.a())) : w62);
    }

    private final b c() {
        return new b();
    }

    @NotNull
    public abstract D a();

    @NotNull
    public final String a(@Nullable String str) {
        return C4173o0.a(this.f33178c, str, (String) null, 2, (Object) null);
    }

    public final void a(int i10, @NotNull String str) {
        tn.p.k(str, "errorReason");
        IronLog.INTERNAL.verbose(a("errorCode = " + i10 + ", errorReason = " + str));
        this.f33184i.e().a(C4122l5.a(this.f33183h), i10, str, this.f33176a.u());
        M0 m02 = this.f33179d;
        if (m02 != null) {
            m02.a(new IronSourceError(i10, str));
        }
    }

    public final void a(@NotNull J j10, @NotNull InterfaceC4343y0 interfaceC4343y0) {
        tn.p.k(j10, "adInstancePresenter");
        tn.p.k(interfaceC4343y0, "displayListener");
        this.f33180e = interfaceC4343y0;
        this.f33181f.a(j10, false);
    }

    public void a(@NotNull M0 m02) {
        tn.p.k(m02, "loadListener");
        IronLog.INTERNAL.verbose(C4173o0.a(this.f33178c, (String) null, (String) null, 3, (Object) null));
        this.f33178c.a(b());
        this.f33179d = m02;
        this.f33184i.a(this.f33176a.u());
        this.f33183h = new C4122l5();
        this.f33181f.a(a());
    }

    public final void a(@Nullable InterfaceC4343y0 interfaceC4343y0) {
        this.f33180e = interfaceC4343y0;
    }

    public final void a(boolean z10) {
        IronLog.INTERNAL.verbose(C4173o0.a(this.f33178c, (String) null, (String) null, 3, (Object) null));
        this.f33181f.d();
        if (z10) {
            this.f33178c.e().e().a(this.f33178c.f());
        }
    }

    @NotNull
    public C4224r0 b() {
        return new C4224r0(this.f33176a.b());
    }

    public final void b(@Nullable M0 m02) {
        this.f33179d = m02;
    }

    @NotNull
    public InterfaceC4081j0 d() {
        return this.f33181f.h() ? InterfaceC4081j0.b.f31978a : new InterfaceC4081j0.a(null, 1, null);
    }

    @NotNull
    public final AbstractC4309w0 e() {
        return this.f33176a;
    }

    @NotNull
    public final W0 f() {
        return this.f33178c;
    }

    @Nullable
    public final C4041gd g() {
        return this.f33176a.b().f();
    }

    @NotNull
    public final String h() {
        return this.f33176a.l();
    }

    @Nullable
    public final InterfaceC4343y0 i() {
        return this.f33180e;
    }

    @Nullable
    public final M0 j() {
        return this.f33179d;
    }

    @NotNull
    public final tg k() {
        return this.f33181f;
    }
}
