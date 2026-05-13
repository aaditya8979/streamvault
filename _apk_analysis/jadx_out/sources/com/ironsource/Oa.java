package com.ironsource;

import co.b;
import com.ironsource.AbstractC4067i3;
import com.ironsource.C3978d4;
import com.ironsource.InterfaceC4202pb;
import com.ironsource.InterfaceC4307vf;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.jvm.internal.Lambda;
import kotlin.time.DurationUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public final class Oa implements Ra {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Ha f30081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final L2 f30082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final L2 f30083c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f30084d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private InterfaceC4202pb<LevelPlayAdInfo> f30085e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private InterfaceC4307vf.a f30086f;

    public static final class a extends Lambda implements sn.l<Oa, bn.r> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f30087a = new a();

        public a() {
            super(1);
        }

        public final void a(@NotNull Oa oa2) {
            tn.p.k(oa2, "$this$weak");
            oa2.e();
        }

        @Override // sn.l
        public /* bridge */ /* synthetic */ bn.r invoke(Oa oa2) {
            a(oa2);
            return bn.r.f5635a;
        }
    }

    public Oa(@NotNull Ha ha2, @NotNull L2 l22, @NotNull L2 l23, long j10) {
        tn.p.k(ha2, C3978d4.f.f31283e);
        tn.p.k(l22, "currentAdUnit");
        tn.p.k(l23, "reloadingAdUnit");
        this.f30081a = ha2;
        this.f30082b = l22;
        this.f30083c = l23;
        this.f30084d = j10;
        g();
    }

    private final void a(InterfaceC4202pb<LevelPlayAdInfo> interfaceC4202pb) {
        if (this.f30085e == null) {
            this.f30085e = interfaceC4202pb;
            return;
        }
        this.f30081a.a("Received excessive load " + Pa.b(interfaceC4202pb) + " while reloading");
    }

    private final void a(LevelPlayAdInfo levelPlayAdInfo) {
        long jA = this.f30081a.p().a() - this.f30084d;
        this.f30081a.a(new C4258t0(this.f30083c, levelPlayAdInfo), this.f30083c, this.f30082b, (AbstractC4067i3) new AbstractC4067i3.c(jA, AbstractC4067i3.d.h.f31928a), false, Long.valueOf(this.f30084d));
    }

    private final void b(IronSourceError ironSourceError) {
        this.f30081a.a(ironSourceError, this.f30082b, (AbstractC4067i3) new AbstractC4067i3.c(this.f30081a.p().a() - this.f30084d, AbstractC4067i3.d.g.f31927a), true, false, Long.valueOf(this.f30084d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e() {
        InterfaceC4202pb<LevelPlayAdInfo> interfaceC4202pb = this.f30085e;
        if (interfaceC4202pb == null) {
            Ha ha2 = this.f30081a;
            ha2.a((Ra) new Qa(ha2, this.f30082b, this.f30083c, this.f30084d));
        } else if (interfaceC4202pb instanceof InterfaceC4202pb.b) {
            a((LevelPlayAdInfo) ((InterfaceC4202pb.b) interfaceC4202pb).b());
        } else if (interfaceC4202pb instanceof InterfaceC4202pb.a) {
            b(((InterfaceC4202pb.a) interfaceC4202pb).b());
        }
    }

    private final void g() {
        InterfaceC4307vf interfaceC4307vfO = this.f30081a.o();
        InterfaceC4307vf.b bVarA = X6.a(this, a.f30087a);
        b.a aVar = co.b.f6773c;
        this.f30086f = interfaceC4307vfO.a(bVarA, co.d.t(this.f30081a.l(), DurationUnit.MILLISECONDS));
    }

    @Override // com.ironsource.M0
    public void a(@Nullable IronSourceError ironSourceError) {
        if (ironSourceError == null) {
            ironSourceError = new IronSourceError(0, "Unknown error");
        }
        a(new InterfaceC4202pb.a(ironSourceError));
    }

    @Override // com.ironsource.M0
    public void a(@NotNull C4258t0 c4258t0) {
        tn.p.k(c4258t0, "adUnitCallback");
        LevelPlayAdInfo levelPlayAdInfoC = c4258t0.c();
        if (levelPlayAdInfoC != null) {
            a(new InterfaceC4202pb.b(levelPlayAdInfoC));
        } else {
            a(new InterfaceC4202pb.a(new IronSourceError(0, "Missing ad info")));
        }
    }

    @Override // com.ironsource.Ra
    public void b() {
        this.f30081a.a("Loading an ad while reloading");
    }

    @Override // com.ironsource.Ra
    public void c() {
        InterfaceC4307vf.a aVar = this.f30086f;
        if (aVar != null) {
            aVar.a();
        }
        this.f30082b.a(true);
        this.f30083c.a(true);
        Ha ha2 = this.f30081a;
        ha2.a((Ra) new Ka(ha2));
    }

    @Override // com.ironsource.Ra
    public void d() {
        InterfaceC4307vf.a aVar = this.f30086f;
        if (aVar != null) {
            aVar.a();
        }
        Ha ha2 = this.f30081a;
        ha2.a((Ra) new Na(ha2, this.f30082b));
    }

    @Override // com.ironsource.Ra
    public void f() {
        Ha ha2 = this.f30081a;
        ha2.a((Ra) new Oa(ha2, this.f30082b, this.f30083c, ha2.p().a()));
    }
}
