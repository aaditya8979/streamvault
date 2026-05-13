package com.ironsource;

import android.app.Activity;
import androidx.appcompat.widget.ActivityChooserModel;
import co.b;
import com.ironsource.E0;
import com.ironsource.InterfaceC4202pb;
import com.ironsource.InterfaceC4262t4;
import com.ironsource.InterfaceC4307vf;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Lambda;
import kotlin.time.DurationUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.t6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4264t6 implements InterfaceC4141m6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Lb f34062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final W0 f34063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final AbstractC4309w0 f34064c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private InterfaceC4315w6 f34065d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final sn.q<B, H, InterfaceC4141m6, C4123l6> f34066e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC4307vf f34067f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final InterfaceC4262t4 f34068g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private C4161n6 f34069h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private b f34070i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private a f34071j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final tg f34072k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private InterfaceC4307vf.a f34073l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    private Long f34074m;

    /* JADX INFO: renamed from: com.ironsource.t6$a */
    public interface a {
        void a(@NotNull C4264t6 c4264t6, @Nullable IronSourceError ironSourceError);

        void a(@NotNull C4264t6 c4264t6, @NotNull LevelPlayAdInfo levelPlayAdInfo);
    }

    /* JADX INFO: renamed from: com.ironsource.t6$b */
    public interface b {
        void a(@NotNull C4264t6 c4264t6);

        void b(@NotNull C4264t6 c4264t6, @Nullable IronSourceError ironSourceError);

        void b(@NotNull C4264t6 c4264t6, @NotNull LevelPlayAdInfo levelPlayAdInfo);

        void c(@NotNull C4264t6 c4264t6, @NotNull LevelPlayAdInfo levelPlayAdInfo);
    }

    /* JADX INFO: renamed from: com.ironsource.t6$c */
    public static final class c implements Bg {
        public c() {
        }

        @Override // com.ironsource.Bg
        public void a(int i10, @NotNull String str) {
            Long lValueOf;
            tn.p.k(str, "errorReason");
            Long l10 = C4264t6.this.f34074m;
            if (l10 != null) {
                lValueOf = Long.valueOf(C4264t6.this.f34068g.a() - l10.longValue());
            } else {
                lValueOf = null;
            }
            C4264t6.this.f34063b.e().e().a(lValueOf != null ? lValueOf.longValue() : 0L, i10, str, C4264t6.this.f34064c.u());
            b bVar = C4264t6.this.f34070i;
            if (bVar != null) {
                bVar.b(C4264t6.this, new IronSourceError(i10, str));
            }
        }

        @Override // com.ironsource.Bg
        public void a(@NotNull A a10) {
            tn.p.k(a10, C4157n2.f33007p);
            C4264t6.this.f34063b.e().a().e(C4264t6.this.c());
            C4264t6.this.g();
            b bVar = C4264t6.this.f34070i;
            if (bVar != null) {
                bVar.c(C4264t6.this, a10.e());
            }
        }

        @Override // com.ironsource.Bg
        public void b(@NotNull A a10) {
            Long lValueOf;
            tn.p.k(a10, C4157n2.f33007p);
            Long l10 = C4264t6.this.f34074m;
            if (l10 != null) {
                lValueOf = Long.valueOf(C4264t6.this.f34068g.a() - l10.longValue());
            } else {
                lValueOf = null;
            }
            C4264t6.this.f34063b.e().e().a(lValueOf != null ? lValueOf.longValue() : 0L, C4264t6.this.f34064c.u());
            C4264t6.this.g();
            b bVar = C4264t6.this.f34070i;
            if (bVar != null) {
                bVar.b(C4264t6.this, a10.e());
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.t6$d */
    public /* synthetic */ class d extends FunctionReferenceImpl implements sn.q<B, H, InterfaceC4141m6, C4123l6> {
        public d(Object obj) {
            super(3, obj, C4264t6.class, "createAdInstance", "createAdInstance(Lcom/unity3d/mediation/internal/ads/controllers/adunits/adinstances/AdInstanceData;Lcom/unity3d/mediation/internal/ads/controllers/adunits/adinstances/AdInstancePayload;Lcom/unity3d/mediation/internal/ads/controllers/adunits/adinstances/listeners/FullscreenAdInstanceListener;)Lcom/unity3d/mediation/internal/ads/controllers/adunits/adinstances/FullscreenAdInstance;", 0);
        }

        @Override // sn.q
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4123l6 invoke(@NotNull B b10, @NotNull H h10, @NotNull InterfaceC4141m6 interfaceC4141m6) {
            tn.p.k(b10, "p0");
            tn.p.k(h10, "p1");
            tn.p.k(interfaceC4141m6, "p2");
            return ((C4264t6) this.receiver).a(b10, h10, interfaceC4141m6);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.t6$e */
    public static final class e extends Lambda implements sn.l<C4264t6, bn.r> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f34076a = new e();

        public e() {
            super(1);
        }

        public final void a(@NotNull C4264t6 c4264t6) {
            tn.p.k(c4264t6, "$this$weak");
            b bVar = c4264t6.f34070i;
            if (bVar != null) {
                bVar.a(c4264t6);
            }
            c4264t6.f34072k.a();
        }

        @Override // sn.l
        public /* bridge */ /* synthetic */ bn.r invoke(C4264t6 c4264t6) {
            a(c4264t6);
            return bn.r.f5635a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4264t6(@NotNull Lb lb2, @NotNull W0 w02, @NotNull AbstractC4309w0 abstractC4309w0, @NotNull InterfaceC4315w6 interfaceC4315w6, @Nullable vg vgVar, @Nullable sn.q<? super B, ? super H, ? super InterfaceC4141m6, C4123l6> qVar, @NotNull InterfaceC4307vf interfaceC4307vf, @NotNull InterfaceC4262t4 interfaceC4262t4) {
        tn.p.k(lb2, "mediationServices");
        tn.p.k(w02, "adUnitTools");
        tn.p.k(abstractC4309w0, "adUnitData");
        tn.p.k(interfaceC4315w6, "fullscreenListener");
        tn.p.k(interfaceC4307vf, "taskScheduler");
        tn.p.k(interfaceC4262t4, "currentTimeProvider");
        this.f34062a = lb2;
        this.f34063b = w02;
        this.f34064c = abstractC4309w0;
        this.f34065d = interfaceC4315w6;
        this.f34066e = qVar;
        this.f34067f = interfaceC4307vf;
        this.f34068g = interfaceC4262t4;
        this.f34072k = a(vgVar);
    }

    public /* synthetic */ C4264t6(Lb lb2, W0 w02, AbstractC4309w0 abstractC4309w0, InterfaceC4315w6 interfaceC4315w6, vg vgVar, sn.q qVar, InterfaceC4307vf interfaceC4307vf, InterfaceC4262t4 interfaceC4262t4, int i10, tn.i iVar) {
        this(lb2, w02, abstractC4309w0, interfaceC4315w6, (i10 & 16) != 0 ? null : vgVar, (i10 & 32) != 0 ? null : qVar, (i10 & 64) != 0 ? new W6(X6.a(w02.a())) : interfaceC4307vf, (i10 & 128) != 0 ? new InterfaceC4262t4.a() : interfaceC4262t4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A a(C4264t6 c4264t6, B b10, H h10) {
        tn.p.k(c4264t6, "this$0");
        tn.p.k(b10, "instanceData");
        tn.p.k(h10, "adInstancePayload");
        sn.q dVar = c4264t6.f34066e;
        if (dVar == null) {
            dVar = new d(c4264t6);
        }
        return (A) dVar.invoke(b10, h10, c4264t6);
    }

    private final Bg a() {
        return new c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C4123l6 a(B b10, H h10, InterfaceC4141m6 interfaceC4141m6) {
        return new C4123l6(new W0(this.f34063b, E0.b.PROVIDER), b10, h10, interfaceC4141m6);
    }

    private final tg a(vg vgVar) {
        Bg bgA = a();
        if (vgVar != null) {
            return vgVar.a(bgA);
        }
        return new tg(this.f34063b, this.f34064c, Lb.f29764s.c().g().f(), bgA);
    }

    private final void a(Ed ed2) {
        if (ed2 == Ed.CAN_RECOVER || ed2 == Ed.NO_LOADED_ADS) {
            this.f34063b.e().h().a(ed2);
        }
    }

    private final LevelPlay.AdFormat b() {
        return this.f34064c.b().e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String c() {
        return this.f34064c.l();
    }

    private final InterfaceC4202pb<bn.r> f() {
        if (!this.f34072k.h()) {
            return new InterfaceC4202pb.a(new IronSourceError(509, "show called while ad unit is not ready to show"));
        }
        if (this.f34062a.p().a(c(), b()).d()) {
            return new InterfaceC4202pb.a(new IronSourceError(IronSourceError.ERROR_PLACEMENT_CAPPED, "placement " + c() + " is capped"));
        }
        if (!this.f34062a.f().a(this.f34064c.b().c()).d()) {
            return new InterfaceC4202pb.b(bn.r.f5635a);
        }
        return new InterfaceC4202pb.a(new IronSourceError(IronSourceError.ERROR_AD_UNIT_CAPPED, "adUnitId " + this.f34064c.b().c() + " is capped"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g() {
        InterfaceC4307vf.a aVar = this.f34073l;
        if (aVar != null) {
            aVar.a();
        }
        long jB = this.f34063b.b(b());
        InterfaceC4307vf interfaceC4307vf = this.f34067f;
        InterfaceC4307vf.b bVarA = X6.a(this, e.f34076a);
        b.a aVar2 = co.b.f6773c;
        this.f34073l = interfaceC4307vf.a(bVarA, co.d.t(jB, DurationUnit.MILLISECONDS));
    }

    private final void h() {
        String strC = c();
        if (strC.length() > 0) {
            this.f34062a.a().b(strC, b());
            M3 m3A = this.f34062a.p().a(strC, b());
            if (m3A.d()) {
                this.f34063b.e().a().b(strC, m3A.e());
            }
        }
    }

    public final void a(@NotNull Activity activity, @NotNull a aVar) {
        tn.p.k(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        tn.p.k(aVar, "displayListener");
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(C4173o0.a(this.f34063b, (String) null, (String) null, 3, (Object) null));
        this.f34071j = aVar;
        this.f34063b.e().a().a(activity, c());
        InterfaceC4202pb<bn.r> interfaceC4202pbF = f();
        if (interfaceC4202pbF instanceof InterfaceC4202pb.a) {
            IronSourceError ironSourceErrorB = ((InterfaceC4202pb.a) interfaceC4202pbF).b();
            ironLog.verbose(C4173o0.a(this.f34063b, ironSourceErrorB.getErrorMessage(), (String) null, 2, (Object) null));
            this.f34063b.e().a().a(c(), ironSourceErrorB.getErrorCode(), ironSourceErrorB.getErrorMessage(), this.f34072k.g());
            aVar.a(this, ironSourceErrorB);
            return;
        }
        InterfaceC4307vf.a aVar2 = this.f34073l;
        if (aVar2 != null) {
            aVar2.a();
        }
        C4161n6 c4161n6 = new C4161n6(activity);
        this.f34069h = c4161n6;
        this.f34072k.a((J) c4161n6, false);
    }

    @Override // com.ironsource.E
    public void a(@NotNull A a10) {
        tn.p.k(a10, C4157n2.f33007p);
        this.f34063b.e().a().a(c());
        this.f34065d.e();
    }

    @Override // com.ironsource.E
    public void a(@NotNull A a10, @NotNull IronSourceError ironSourceError) {
        tn.p.k(a10, C4157n2.f33007p);
        tn.p.k(ironSourceError, "error");
        IronLog.INTERNAL.verbose(C4173o0.a(this.f34063b, ironSourceError.toString(), (String) null, 2, (Object) null));
        C4161n6 c4161n6 = this.f34069h;
        Ed edG = this.f34072k.g();
        a(edG);
        if (edG == Ed.CAN_RECOVER && c4161n6 != null) {
            this.f34072k.a((J) c4161n6, true);
            return;
        }
        this.f34072k.c();
        this.f34069h = null;
        this.f34063b.e().a().a(c(), ironSourceError.getErrorCode(), ironSourceError.getErrorMessage(), edG);
        a aVar = this.f34071j;
        if (aVar != null) {
            aVar.a(this, ironSourceError);
        }
    }

    @Override // com.ironsource.InterfaceC4141m6
    public void a(@NotNull C4123l6 c4123l6) {
        tn.p.k(c4123l6, "fullscreenInstance");
        this.f34072k.c();
        this.f34069h = null;
        a aVar = this.f34071j;
        if (aVar != null) {
            aVar.a(this, c4123l6.e());
        }
        h();
        this.f34062a.l().b(this.f34064c.b().c());
    }

    @Override // com.ironsource.InterfaceC4141m6
    public void a(@NotNull C4123l6 c4123l6, @NotNull LevelPlayReward levelPlayReward) {
        tn.p.k(c4123l6, "fullscreenInstance");
        tn.p.k(levelPlayReward, "reward");
        IronLog.INTERNAL.verbose(C4173o0.a(this.f34063b, c4123l6.q(), (String) null, 2, (Object) null));
        this.f34065d.a(levelPlayReward);
    }

    public final void a(@NotNull b bVar) {
        tn.p.k(bVar, "loadListener");
        IronLog.INTERNAL.verbose(C4173o0.a(this.f34063b, (String) null, (String) null, 3, (Object) null));
        this.f34070i = bVar;
        this.f34074m = Long.valueOf(this.f34068g.a());
        this.f34063b.a(new C4224r0(this.f34064c.b()));
        D d10 = new D() { // from class: com.ironsource.xl
            @Override // com.ironsource.D
            public final A a(B b10, H h10) {
                return C4264t6.a(this.f34406a, b10, h10);
            }
        };
        this.f34063b.e().e().a(this.f34064c.u());
        this.f34072k.a(d10);
    }

    public final void a(@NotNull InterfaceC4315w6 interfaceC4315w6) {
        tn.p.k(interfaceC4315w6, "<set-?>");
        this.f34065d = interfaceC4315w6;
    }

    @Override // com.ironsource.E
    public void b(@NotNull A a10) {
        tn.p.k(a10, C4157n2.f33007p);
        this.f34072k.c(a10);
        this.f34063b.e().a().g(c());
        this.f34062a.h().b(com.unity3d.mediation.a.a(b()));
    }

    @Override // com.ironsource.InterfaceC4141m6
    public void b(@NotNull C4123l6 c4123l6) {
        tn.p.k(c4123l6, "fullscreenInstance");
        this.f34063b.e().a().b(c());
        this.f34072k.c();
        this.f34069h = null;
        this.f34065d.onClosed();
    }

    @NotNull
    public final InterfaceC4315w6 d() {
        return this.f34065d;
    }

    @Nullable
    public final LevelPlayAdInfo e() {
        A aE = this.f34072k.e();
        if (aE != null) {
            return aE.e();
        }
        return null;
    }

    public final void finalize() {
        IronLog.INTERNAL.verbose(C4173o0.a(this.f34063b, "finalizing ad unit", (String) null, 2, (Object) null));
        InterfaceC4307vf.a aVar = this.f34073l;
        if (aVar != null) {
            aVar.a();
        }
    }
}
