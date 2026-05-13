package com.ironsource;

import android.app.Activity;
import androidx.appcompat.widget.ActivityChooserModel;
import com.ironsource.C3978d4;
import com.ironsource.C4136m1;
import com.ironsource.InterfaceC4082j1;
import com.ironsource.P8;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.ironsourceads.rewarded.RewardedAdInfo;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public final class Nd implements InterfaceC4034g6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private O9 f29900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private InterfaceC3938b0 f29901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private X1 f29902c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private InterfaceC4209q1 f29903d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private InterfaceC4129lc f29904e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private Tf f29905f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private P8 f29906g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private P8.a f29907h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final Map<String, Nd> f29908i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private RewardedAdInfo f29909j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private Od f29910k;

    public Nd(@NotNull O9 o92, @NotNull InterfaceC3938b0 interfaceC3938b0, @NotNull X1 x12, @NotNull InterfaceC4209q1 interfaceC4209q1, @NotNull InterfaceC4129lc interfaceC4129lc, @NotNull Tf tf2, @NotNull P8 p82, @NotNull P8.a aVar, @NotNull Map<String, Nd> map) {
        tn.p.k(o92, C3978d4.i.f31356p0);
        tn.p.k(interfaceC3938b0, "adNetworkShow");
        tn.p.k(x12, "auctionDataReporter");
        tn.p.k(interfaceC4209q1, "analytics");
        tn.p.k(interfaceC4129lc, "networkDestroyAPI");
        tn.p.k(tf2, "threadManager");
        tn.p.k(p82, "sessionDepthService");
        tn.p.k(aVar, "sessionDepthServiceEditor");
        tn.p.k(map, "retainer");
        this.f29900a = o92;
        this.f29901b = interfaceC3938b0;
        this.f29902c = x12;
        this.f29903d = interfaceC4209q1;
        this.f29904e = interfaceC4129lc;
        this.f29905f = tf2;
        this.f29906g = p82;
        this.f29907h = aVar;
        this.f29908i = map;
        String strF = o92.f();
        tn.p.j(strF, "adInstance.instanceId");
        String strE = this.f29900a.e();
        tn.p.j(strE, "adInstance.id");
        this.f29909j = new RewardedAdInfo(strF, strE);
        C3998e6 c3998e6 = new C3998e6();
        this.f29900a.a(c3998e6);
        c3998e6.a(this);
    }

    public /* synthetic */ Nd(O9 o92, InterfaceC3938b0 interfaceC3938b0, X1 x12, InterfaceC4209q1 interfaceC4209q1, InterfaceC4129lc interfaceC4129lc, Tf tf2, P8 p82, P8.a aVar, Map map, int i10, tn.i iVar) {
        this(o92, interfaceC3938b0, x12, interfaceC4209q1, (i10 & 16) != 0 ? new C4147mc() : interfaceC4129lc, (i10 & 32) != 0 ? V7.f30593a : tf2, (i10 & 64) != 0 ? Lb.f29764s.d().s() : p82, (i10 & 128) != 0 ? Lb.f29764s.a().h() : aVar, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Nd nd2) {
        tn.p.k(nd2, "this$0");
        InterfaceC4082j1.d.f32003a.b().a(nd2.f29903d);
        nd2.f29904e.a(nd2.f29900a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Nd nd2, IronSourceError ironSourceError) {
        tn.p.k(nd2, "this$0");
        tn.p.k(ironSourceError, "$error");
        Od od2 = nd2.f29910k;
        if (od2 != null) {
            od2.onRewardedAdFailedToShow(ironSourceError);
        }
    }

    private final void a(final IronSourceError ironSourceError) {
        this.f29908i.remove(this.f29909j.getAdId());
        InterfaceC4082j1.a.f31980a.a(new C4136m1.j(ironSourceError.getErrorCode()), new C4136m1.k(ironSourceError.getErrorMessage())).a(this.f29903d);
        this.f29905f.a(new Runnable() { // from class: com.ironsource.si
            @Override // java.lang.Runnable
            public final void run() {
                Nd.a(this.f34030b, ironSourceError);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Nd nd2) {
        tn.p.k(nd2, "this$0");
        Od od2 = nd2.f29910k;
        if (od2 != null) {
            od2.onRewardedAdClicked();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Nd nd2) {
        tn.p.k(nd2, "this$0");
        Od od2 = nd2.f29910k;
        if (od2 != null) {
            od2.onRewardedAdDismissed();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Nd nd2) {
        tn.p.k(nd2, "this$0");
        Od od2 = nd2.f29910k;
        if (od2 != null) {
            od2.onUserEarnedReward();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Nd nd2) {
        tn.p.k(nd2, "this$0");
        Od od2 = nd2.f29910k;
        if (od2 != null) {
            od2.onRewardedAdShown();
        }
    }

    public final void a() {
        Tf.a(this.f29905f, new Runnable() { // from class: com.ironsource.ni
            @Override // java.lang.Runnable
            public final void run() {
                Nd.a(this.f33117b);
            }
        }, 0L, 2, null);
    }

    public final void a(@NotNull Activity activity) {
        tn.p.k(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        this.f29908i.put(this.f29909j.getAdId(), this);
        if (!this.f29901b.a(this.f29900a)) {
            a(C4365z5.f34494a.t());
        } else {
            InterfaceC4082j1.a.f31980a.d(new InterfaceC4156n1[0]).a(this.f29903d);
            this.f29901b.a(activity, this.f29900a);
        }
    }

    public final void a(@Nullable Od od2) {
        this.f29910k = od2;
    }

    public final void a(@NotNull RewardedAdInfo rewardedAdInfo) {
        tn.p.k(rewardedAdInfo, "<set-?>");
        this.f29909j = rewardedAdInfo;
    }

    @Override // com.ironsource.InterfaceC4034g6
    public void a(@Nullable String str) {
        a(C4365z5.f34494a.c(new IronSourceError(0, str)));
    }

    @NotNull
    public final RewardedAdInfo b() {
        return this.f29909j;
    }

    @Nullable
    public final Od c() {
        return this.f29910k;
    }

    public final boolean d() {
        boolean zA = this.f29901b.a(this.f29900a);
        InterfaceC4082j1.a.f31980a.a(zA).a(this.f29903d);
        return zA;
    }

    public final void finalize() {
        a();
    }

    @Override // com.ironsource.InterfaceC4034g6
    public void onAdInstanceDidBecomeVisible() {
        InterfaceC4082j1.a.f31980a.f(new InterfaceC4156n1[0]).a(this.f29903d);
    }

    @Override // com.ironsource.InterfaceC4034g6
    public void onAdInstanceDidClick() {
        InterfaceC4082j1.a.f31980a.a().a(this.f29903d);
        this.f29905f.a(new Runnable() { // from class: com.ironsource.pi
            @Override // java.lang.Runnable
            public final void run() {
                Nd.b(this.f33262b);
            }
        });
    }

    @Override // com.ironsource.InterfaceC4034g6
    public void onAdInstanceDidDismiss() {
        this.f29908i.remove(this.f29909j.getAdId());
        InterfaceC4082j1.a.f31980a.a(new InterfaceC4156n1[0]).a(this.f29903d);
        this.f29905f.a(new Runnable() { // from class: com.ironsource.ri
            @Override // java.lang.Runnable
            public final void run() {
                Nd.c(this.f33431b);
            }
        });
    }

    @Override // com.ironsource.InterfaceC4034g6
    public void onAdInstanceDidReward(@Nullable String str, int i10) {
        C4136m1.u uVar = new C4136m1.u("Virtual Item");
        C4136m1.t tVar = new C4136m1.t(1);
        C4136m1.q qVar = new C4136m1.q("DefaultRewardedVideo");
        String strA = IronSourceUtils.a(System.currentTimeMillis(), this.f29900a.g());
        tn.p.j(strA, "getTransId(System.curren…illis(), adInstance.name)");
        InterfaceC4082j1.a.f31980a.c(uVar, tVar, qVar, new C4136m1.y(strA)).a(this.f29903d);
        this.f29905f.a(new Runnable() { // from class: com.ironsource.qi
            @Override // java.lang.Runnable
            public final void run() {
                Nd.d(this.f33364b);
            }
        });
    }

    @Override // com.ironsource.InterfaceC4034g6
    public void onAdInstanceDidShow() {
        P8 p82 = this.f29906g;
        IronSource.a aVar = IronSource.a.REWARDED_VIDEO;
        InterfaceC4082j1.a.f31980a.b(new C4136m1.w(p82.a(aVar))).a(this.f29903d);
        this.f29907h.b(aVar);
        this.f29902c.b("onAdInstanceDidShow");
        this.f29905f.a(new Runnable() { // from class: com.ironsource.oi
            @Override // java.lang.Runnable
            public final void run() {
                Nd.e(this.f33169b);
            }
        });
    }
}
