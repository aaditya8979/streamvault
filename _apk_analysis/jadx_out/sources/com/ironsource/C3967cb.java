package com.ironsource;

import android.app.Activity;
import androidx.appcompat.widget.ActivityChooserModel;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.C4105k6;
import com.ironsource.C4173o0;
import com.ironsource.E0;
import com.ironsource.InterfaceC4081j0;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import java.util.UUID;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.cb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3967cb implements InterfaceC4087j6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public static final a f31136n = new a(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public static final String f31137o = "Fullscreen Ad Internal";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final LevelPlay.AdFormat f31138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f31139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final b f31140c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final C4173o0 f31141d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final C4070i6 f31142e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC4326x0 f31143f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final L7 f31144g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final InterfaceC4262t4 f31145h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final bn.g f31146i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private InterfaceC3985db f31147j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final UUID f31148k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private InterfaceC4247s6 f31149l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    private C4122l5 f31150m;

    /* JADX INFO: renamed from: com.ironsource.cb$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        public final boolean a(@NotNull String str, @NotNull LevelPlay.AdFormat adFormat) {
            tn.p.k(str, "placementName");
            tn.p.k(adFormat, "adFormat");
            C4173o0 c4173o0A = C4173o0.a.a(com.unity3d.mediation.a.a(adFormat), E0.b.MEDIATION);
            if (!c4173o0A.g()) {
                c4173o0A.e().a().a(str, "SDK is not initialized", false);
                return false;
            }
            M3 m3A = Lb.f29764s.d().p().a(str, adFormat);
            boolean zD = m3A.d();
            c4173o0A.e().a().a(str, m3A.e(), zD);
            return zD;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.cb$b */
    public interface b {
        @Nullable
        Double getBidFloor();
    }

    /* JADX INFO: renamed from: com.ironsource.cb$c */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final C4173o0 f31151a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final C4070i6 f31152b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final L7 f31153c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final InterfaceC4262t4 f31154d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        private final C4367z7 f31155e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        private final b f31156f;

        public c(@NotNull C4173o0 c4173o0, @NotNull C4070i6 c4070i6, @NotNull L7 l72, @NotNull InterfaceC4262t4 interfaceC4262t4, @NotNull C4367z7 c4367z7, @NotNull b bVar) {
            tn.p.k(c4173o0, "adTools");
            tn.p.k(c4070i6, "adControllerFactory");
            tn.p.k(l72, IronSourceConstants.EVENTS_PROVIDER);
            tn.p.k(interfaceC4262t4, "currentTimeProvider");
            tn.p.k(c4367z7, "idFactory");
            tn.p.k(bVar, "config");
            this.f31151a = c4173o0;
            this.f31152b = c4070i6;
            this.f31153c = l72;
            this.f31154d = interfaceC4262t4;
            this.f31155e = c4367z7;
            this.f31156f = bVar;
        }

        @NotNull
        public final C4070i6 a() {
            return this.f31152b;
        }

        @NotNull
        public final C4173o0 b() {
            return this.f31151a;
        }

        @NotNull
        public final b c() {
            return this.f31156f;
        }

        @NotNull
        public final InterfaceC4262t4 d() {
            return this.f31154d;
        }

        @NotNull
        public final C4367z7 e() {
            return this.f31155e;
        }

        @NotNull
        public final L7 f() {
            return this.f31153c;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.cb$d */
    public static final class d extends Lambda implements sn.a<C4052h6> {
        public d() {
            super(0);
        }

        @Override // sn.a
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4052h6 invoke() {
            return C3967cb.this.b();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.cb$e */
    public static final class e implements InterfaceC4281u6 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C4028g0 f31159b;

        public e(C4028g0 c4028g0) {
            this.f31159b = c4028g0;
        }

        @Override // com.ironsource.InterfaceC4281u6
        @NotNull
        public C4264t6 a(boolean z10, @NotNull InterfaceC4315w6 interfaceC4315w6) {
            tn.p.k(interfaceC4315w6, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            AbstractC4309w0 abstractC4309w0A = C3967cb.this.g().a(z10, this.f31159b);
            return new C4264t6(Lb.f29764s.c(), new W0(C3967cb.this.f(), abstractC4309w0A, E0.b.MEDIATION), abstractC4309w0A, interfaceC4315w6, null, null, null, null, 240, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3967cb(@NotNull LevelPlay.AdFormat adFormat, @NotNull String str, @NotNull b bVar, @NotNull C4173o0 c4173o0, @NotNull C4070i6 c4070i6, @NotNull InterfaceC4326x0 interfaceC4326x0, @NotNull L7 l72, @NotNull InterfaceC4262t4 interfaceC4262t4, @NotNull C4367z7 c4367z7) {
        tn.p.k(adFormat, "adFormat");
        tn.p.k(str, "adUnitId");
        tn.p.k(bVar, "config");
        tn.p.k(c4173o0, "adTools");
        tn.p.k(c4070i6, "fullscreenAdControllerFactory");
        tn.p.k(interfaceC4326x0, "adUnitDataFactory");
        tn.p.k(l72, "mediationServicesProvider");
        tn.p.k(interfaceC4262t4, "currentTimeProvider");
        tn.p.k(c4367z7, "idFactory");
        this.f31138a = adFormat;
        this.f31139b = str;
        this.f31140c = bVar;
        this.f31141d = c4173o0;
        this.f31142e = c4070i6;
        this.f31143f = interfaceC4326x0;
        this.f31144g = l72;
        this.f31145h = interfaceC4262t4;
        this.f31146i = kotlin.b.b(new d());
        UUID uuidA = c4367z7.a();
        this.f31148k = uuidA;
        this.f31149l = new C4105k6(this, null, 2, 0 == true ? 1 : 0);
        c4173o0.e().a(new C4154n(com.unity3d.mediation.a.a(adFormat), uuidA, str));
        p();
    }

    public /* synthetic */ C3967cb(LevelPlay.AdFormat adFormat, String str, b bVar, C4173o0 c4173o0, C4070i6 c4070i6, InterfaceC4326x0 interfaceC4326x0, L7 l72, InterfaceC4262t4 interfaceC4262t4, C4367z7 c4367z7, int i10, tn.i iVar) {
        this(adFormat, str, bVar, c4173o0, c4070i6, interfaceC4326x0, (i10 & 64) != 0 ? Lb.f29764s.d() : l72, interfaceC4262t4, c4367z7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Activity activity, C3967cb c3967cb, String str) {
        tn.p.k(activity, "$activity");
        tn.p.k(c3967cb, "this$0");
        ContextProvider.getInstance().updateActivity(activity);
        c3967cb.f31141d.e().h().d();
        c3967cb.f31149l.a(activity, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3967cb c3967cb, long j10) {
        tn.p.k(c3967cb, "this$0");
        c3967cb.f31141d.e().f().a(j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3967cb c3967cb, long j10, LevelPlayAdError levelPlayAdError) {
        String errorMessage;
        tn.p.k(c3967cb, "this$0");
        Tc tcF = c3967cb.f31141d.e().f();
        int errorCode = levelPlayAdError != null ? levelPlayAdError.getErrorCode() : 0;
        if (levelPlayAdError == null || (errorMessage = levelPlayAdError.getErrorMessage()) == null) {
            errorMessage = "";
        }
        tcF.a(j10, errorCode, errorMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3967cb c3967cb, LevelPlayAdError levelPlayAdError) {
        tn.p.k(c3967cb, "this$0");
        tn.p.k(levelPlayAdError, "$error");
        c3967cb.f31141d.e().h().a(levelPlayAdError);
    }

    public static /* synthetic */ void a(C3967cb c3967cb, LevelPlayAdError levelPlayAdError, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        c3967cb.a(levelPlayAdError, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3967cb c3967cb, LevelPlayAdError levelPlayAdError, LevelPlayAdInfo levelPlayAdInfo) {
        tn.p.k(c3967cb, "this$0");
        tn.p.k(levelPlayAdError, "$error");
        tn.p.k(levelPlayAdInfo, "$adInfo");
        InterfaceC3985db interfaceC3985db = c3967cb.f31147j;
        if (interfaceC3985db != null) {
            interfaceC3985db.onAdDisplayFailed(levelPlayAdError, levelPlayAdInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3967cb c3967cb, LevelPlayAdInfo levelPlayAdInfo) {
        tn.p.k(c3967cb, "this$0");
        tn.p.k(levelPlayAdInfo, "$adInfo");
        InterfaceC3985db interfaceC3985db = c3967cb.f31147j;
        if (interfaceC3985db != null) {
            interfaceC3985db.onAdLoaded(levelPlayAdInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3967cb c3967cb, LevelPlayReward levelPlayReward) {
        tn.p.k(c3967cb, "this$0");
        tn.p.k(levelPlayReward, "$reward");
        InterfaceC3985db interfaceC3985db = c3967cb.f31147j;
        if (interfaceC3985db != null) {
            interfaceC3985db.onAdRewarded(levelPlayReward, c3967cb.f31149l.b());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayAdError levelPlayAdError, C3967cb c3967cb) {
        InterfaceC3985db interfaceC3985db;
        tn.p.k(c3967cb, "this$0");
        if (levelPlayAdError == null || (interfaceC3985db = c3967cb.f31147j) == null) {
            return;
        }
        interfaceC3985db.onAdLoadFailed(levelPlayAdError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C4052h6 b() {
        C4028g0 c4028g0 = new C4028g0(com.unity3d.mediation.a.a(this.f31138a), this.f31148k, this.f31139b, null, this.f31144g.A().a(), this.f31140c.getBidFloor(), 8, null);
        e eVar = new e(c4028g0);
        E5 e5E = this.f31141d.e();
        C4173o0 c4173o0 = this.f31141d;
        e5E.a(new C0(c4173o0, c4028g0, c4173o0.b(this.f31138a, this.f31139b).b().b()));
        return this.f31142e.a(this, this.f31141d, c4028g0, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C3967cb c3967cb) {
        tn.p.k(c3967cb, "this$0");
        c3967cb.f31141d.e().f().a();
        c3967cb.f31149l.loadAd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C3967cb c3967cb, LevelPlayAdError levelPlayAdError) {
        tn.p.k(c3967cb, "this$0");
        tn.p.k(levelPlayAdError, "$error");
        c3967cb.f31149l.a(levelPlayAdError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C3967cb c3967cb, LevelPlayAdInfo levelPlayAdInfo) {
        tn.p.k(c3967cb, "this$0");
        tn.p.k(levelPlayAdInfo, "$adInfo");
        c3967cb.f31149l.onAdDisplayed(levelPlayAdInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C3967cb c3967cb) {
        tn.p.k(c3967cb, "this$0");
        c3967cb.f31149l.onAdClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C3967cb c3967cb, LevelPlayAdError levelPlayAdError) {
        tn.p.k(c3967cb, "this$0");
        tn.p.k(levelPlayAdError, "$error");
        c3967cb.f31149l.onAdLoadFailed(levelPlayAdError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C3967cb c3967cb, LevelPlayAdInfo levelPlayAdInfo) {
        tn.p.k(c3967cb, "this$0");
        tn.p.k(levelPlayAdInfo, "$adInfo");
        c3967cb.f31149l.onAdInfoChanged(levelPlayAdInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C3967cb c3967cb) {
        tn.p.k(c3967cb, "this$0");
        c3967cb.f31149l.onAdClosed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C3967cb c3967cb, LevelPlayAdInfo levelPlayAdInfo) {
        tn.p.k(c3967cb, "this$0");
        tn.p.k(levelPlayAdInfo, "$adInfo");
        c3967cb.f31149l.onAdLoaded(levelPlayAdInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(C3967cb c3967cb) {
        tn.p.k(c3967cb, "this$0");
        c3967cb.f31149l.a();
    }

    private final void p() {
        Double bidFloor = this.f31140c.getBidFloor();
        if (bidFloor != null) {
            this.f31141d.e().f().a(bidFloor.doubleValue());
        }
    }

    @Override // com.ironsource.InterfaceC4087j6
    public void a() {
        this.f31141d.d(new Runnable() { // from class: com.ironsource.gk
            @Override // java.lang.Runnable
            public final void run() {
                C3967cb.e(this.f31826b);
            }
        });
    }

    public final void a(@NotNull final Activity activity, @Nullable final String str) {
        tn.p.k(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        this.f31141d.d(new Runnable() { // from class: com.ironsource.dk
            @Override // java.lang.Runnable
            public final void run() {
                C3967cb.a(activity, this, str);
            }
        });
    }

    public final void a(@Nullable InterfaceC3985db interfaceC3985db) {
        this.f31147j = interfaceC3985db;
    }

    public final void a(@NotNull C4105k6.a aVar) {
        tn.p.k(aVar, "status");
        this.f31149l = new C4105k6(this, aVar);
    }

    public final void a(@NotNull InterfaceC4247s6 interfaceC4247s6) {
        tn.p.k(interfaceC4247s6, "state");
        this.f31149l = interfaceC4247s6;
    }

    @Override // com.ironsource.InterfaceC4087j6
    public void a(@NotNull final LevelPlayAdError levelPlayAdError) {
        tn.p.k(levelPlayAdError, "error");
        this.f31141d.d(new Runnable() { // from class: com.ironsource.fk
            @Override // java.lang.Runnable
            public final void run() {
                C3967cb.b(this.f31747b, levelPlayAdError);
            }
        });
    }

    public final void a(@Nullable final LevelPlayAdError levelPlayAdError, final long j10) {
        IronLog.INTERNAL.verbose(C4173o0.a(this.f31141d, "onAdLoadFailed error: " + levelPlayAdError, (String) null, 2, (Object) null));
        this.f31141d.d(new Runnable() { // from class: com.ironsource.nk
            @Override // java.lang.Runnable
            public final void run() {
                C3967cb.a(this.f33119b, j10, levelPlayAdError);
            }
        });
        this.f31141d.e(new Runnable() { // from class: com.ironsource.ok
            @Override // java.lang.Runnable
            public final void run() {
                C3967cb.a(levelPlayAdError, this);
            }
        });
    }

    public final void a(@NotNull final LevelPlayAdError levelPlayAdError, @NotNull final LevelPlayAdInfo levelPlayAdInfo) {
        tn.p.k(levelPlayAdError, "error");
        tn.p.k(levelPlayAdInfo, "adInfo");
        IronLog.INTERNAL.verbose(C4173o0.a(this.f31141d, "onAdDisplayFailed error: " + levelPlayAdError + ", adInfo: " + levelPlayAdInfo, (String) null, 2, (Object) null));
        this.f31141d.d(new Runnable() { // from class: com.ironsource.lk
            @Override // java.lang.Runnable
            public final void run() {
                C3967cb.a(this.f32239b, levelPlayAdError);
            }
        });
        this.f31141d.e(new Runnable() { // from class: com.ironsource.mk
            @Override // java.lang.Runnable
            public final void run() {
                C3967cb.a(this.f32990b, levelPlayAdError, levelPlayAdInfo);
            }
        });
    }

    public final void a(@NotNull final LevelPlayAdInfo levelPlayAdInfo) {
        tn.p.k(levelPlayAdInfo, "adInfo");
        IronLog.INTERNAL.verbose(C4173o0.a(this.f31141d, "onAdLoaded adInfo: " + levelPlayAdInfo, (String) null, 2, (Object) null));
        final long jA = C4122l5.a(this.f31150m);
        this.f31141d.d(new Runnable() { // from class: com.ironsource.rk
            @Override // java.lang.Runnable
            public final void run() {
                C3967cb.a(this.f33433b, jA);
            }
        });
        this.f31141d.e(new Runnable() { // from class: com.ironsource.ck
            @Override // java.lang.Runnable
            public final void run() {
                C3967cb.a(this.f31165b, levelPlayAdInfo);
            }
        });
    }

    @Override // com.ironsource.InterfaceC4087j6
    public void a(@NotNull final LevelPlayReward levelPlayReward) {
        tn.p.k(levelPlayReward, "reward");
        IronLog.INTERNAL.verbose(C4173o0.a(this.f31141d, "onAdRewarded adInfo: " + this.f31149l.b() + " reward: " + levelPlayReward, (String) null, 2, (Object) null));
        this.f31141d.e(new Runnable() { // from class: com.ironsource.jk
            @Override // java.lang.Runnable
            public final void run() {
                C3967cb.a(this.f32095b, levelPlayReward);
            }
        });
    }

    public final void a(@NotNull String str) {
        tn.p.k(str, "message");
        this.f31141d.e().h().f("Fullscreen Ad Internal - " + str);
    }

    @NotNull
    public final C4052h6 c() {
        return (C4052h6) this.f31146i.getValue();
    }

    @NotNull
    public final LevelPlay.AdFormat d() {
        return this.f31138a;
    }

    @NotNull
    public final UUID e() {
        return this.f31148k;
    }

    @NotNull
    public final C4173o0 f() {
        return this.f31141d;
    }

    @NotNull
    public final InterfaceC4326x0 g() {
        return this.f31143f;
    }

    @NotNull
    public final String h() {
        return this.f31139b;
    }

    @NotNull
    public final b i() {
        return this.f31140c;
    }

    @NotNull
    public final InterfaceC4262t4 j() {
        return this.f31145h;
    }

    @Nullable
    public final InterfaceC3985db k() {
        return this.f31147j;
    }

    @NotNull
    public final L7 l() {
        return this.f31144g;
    }

    public final boolean m() {
        InterfaceC4081j0 interfaceC4081j0C = this.f31149l.c();
        this.f31141d.e().e().a(Boolean.valueOf(interfaceC4081j0C.a()), interfaceC4081j0C instanceof InterfaceC4081j0.a ? ((InterfaceC4081j0.a) interfaceC4081j0C).c() : null);
        return interfaceC4081j0C.a();
    }

    public final void n() {
        this.f31150m = new C4122l5();
        this.f31141d.d(new Runnable() { // from class: com.ironsource.qk
            @Override // java.lang.Runnable
            public final void run() {
                C3967cb.b(this.f33367b);
            }
        });
    }

    public final void o() {
        a(new C4197p6(this, this.f31145h));
        c().m();
    }

    @Override // com.ironsource.InterfaceC4087j6
    public void onAdClicked() {
        this.f31141d.d(new Runnable() { // from class: com.ironsource.kk
            @Override // java.lang.Runnable
            public final void run() {
                C3967cb.c(this.f32180b);
            }
        });
    }

    @Override // com.ironsource.InterfaceC4087j6
    public void onAdClosed() {
        this.f31141d.d(new Runnable() { // from class: com.ironsource.ik
            @Override // java.lang.Runnable
            public final void run() {
                C3967cb.d(this.f31969b);
            }
        });
    }

    @Override // com.ironsource.InterfaceC4087j6
    public void onAdDisplayed(@NotNull final LevelPlayAdInfo levelPlayAdInfo) {
        tn.p.k(levelPlayAdInfo, "adInfo");
        this.f31141d.d(new Runnable() { // from class: com.ironsource.pk
            @Override // java.lang.Runnable
            public final void run() {
                C3967cb.b(this.f33265b, levelPlayAdInfo);
            }
        });
    }

    @Override // com.ironsource.InterfaceC4087j6
    public void onAdInfoChanged(@NotNull final LevelPlayAdInfo levelPlayAdInfo) {
        tn.p.k(levelPlayAdInfo, "adInfo");
        this.f31141d.d(new Runnable() { // from class: com.ironsource.ek
            @Override // java.lang.Runnable
            public final void run() {
                C3967cb.c(this.f31599b, levelPlayAdInfo);
            }
        });
    }

    @Override // com.ironsource.InterfaceC4087j6
    public void onAdLoadFailed(@NotNull final LevelPlayAdError levelPlayAdError) {
        tn.p.k(levelPlayAdError, "error");
        this.f31141d.d(new Runnable() { // from class: com.ironsource.bk
            @Override // java.lang.Runnable
            public final void run() {
                C3967cb.c(this.f31074b, levelPlayAdError);
            }
        });
    }

    @Override // com.ironsource.InterfaceC4087j6
    public void onAdLoaded(@NotNull final LevelPlayAdInfo levelPlayAdInfo) {
        tn.p.k(levelPlayAdInfo, "adInfo");
        this.f31141d.d(new Runnable() { // from class: com.ironsource.hk
            @Override // java.lang.Runnable
            public final void run() {
                C3967cb.d(this.f31901b, levelPlayAdInfo);
            }
        });
    }
}
