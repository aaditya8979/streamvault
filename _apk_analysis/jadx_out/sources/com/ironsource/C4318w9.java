package com.ironsource;

import android.app.Activity;
import androidx.appcompat.widget.ActivityChooserModel;
import com.ironsource.C3978d4;
import com.ironsource.C4136m1;
import com.ironsource.InterfaceC4082j1;
import com.ironsource.P8;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.interstitial.InterstitialAdInfo;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.w9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4318w9 implements InterfaceC4034g6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private O9 f34320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private InterfaceC3938b0 f34321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private X1 f34322c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private InterfaceC4209q1 f34323d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private InterfaceC4129lc f34324e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private Tf f34325f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private P8 f34326g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private P8.a f34327h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final Map<String, C4318w9> f34328i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private InterstitialAdInfo f34329j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private InterfaceC4335x9 f34330k;

    public C4318w9(@NotNull O9 o92, @NotNull InterfaceC3938b0 interfaceC3938b0, @NotNull X1 x12, @NotNull InterfaceC4209q1 interfaceC4209q1, @NotNull InterfaceC4129lc interfaceC4129lc, @NotNull Tf tf2, @NotNull P8 p82, @NotNull P8.a aVar, @NotNull Map<String, C4318w9> map) {
        tn.p.k(o92, C3978d4.i.f31356p0);
        tn.p.k(interfaceC3938b0, "adNetworkShow");
        tn.p.k(x12, "auctionDataReporter");
        tn.p.k(interfaceC4209q1, "analytics");
        tn.p.k(interfaceC4129lc, "networkDestroyAPI");
        tn.p.k(tf2, "threadManager");
        tn.p.k(p82, "sessionDepthService");
        tn.p.k(aVar, "sessionDepthServiceEditor");
        tn.p.k(map, "retainer");
        this.f34320a = o92;
        this.f34321b = interfaceC3938b0;
        this.f34322c = x12;
        this.f34323d = interfaceC4209q1;
        this.f34324e = interfaceC4129lc;
        this.f34325f = tf2;
        this.f34326g = p82;
        this.f34327h = aVar;
        this.f34328i = map;
        String strF = o92.f();
        tn.p.j(strF, "adInstance.instanceId");
        String strE = this.f34320a.e();
        tn.p.j(strE, "adInstance.id");
        this.f34329j = new InterstitialAdInfo(strF, strE);
        C3998e6 c3998e6 = new C3998e6();
        this.f34320a.a(c3998e6);
        c3998e6.a(this);
    }

    public /* synthetic */ C4318w9(O9 o92, InterfaceC3938b0 interfaceC3938b0, X1 x12, InterfaceC4209q1 interfaceC4209q1, InterfaceC4129lc interfaceC4129lc, Tf tf2, P8 p82, P8.a aVar, Map map, int i10, tn.i iVar) {
        this(o92, interfaceC3938b0, x12, interfaceC4209q1, (i10 & 16) != 0 ? new C4147mc() : interfaceC4129lc, (i10 & 32) != 0 ? V7.f30593a : tf2, (i10 & 64) != 0 ? Lb.f29764s.d().s() : p82, (i10 & 128) != 0 ? Lb.f29764s.a().h() : aVar, map);
    }

    private final void a(final IronSourceError ironSourceError) {
        this.f34328i.remove(this.f34329j.getAdId());
        InterfaceC4082j1.a.f31980a.a(new C4136m1.j(ironSourceError.getErrorCode()), new C4136m1.k(ironSourceError.getErrorMessage())).a(this.f34323d);
        this.f34325f.a(new Runnable() { // from class: com.ironsource.hm
            @Override // java.lang.Runnable
            public final void run() {
                C4318w9.a(this.f31904b, ironSourceError);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4318w9 c4318w9) {
        tn.p.k(c4318w9, "this$0");
        InterfaceC4082j1.d.f32003a.b().a(c4318w9.f34323d);
        c4318w9.f34324e.a(c4318w9.f34320a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4318w9 c4318w9, IronSourceError ironSourceError) {
        tn.p.k(c4318w9, "this$0");
        tn.p.k(ironSourceError, "$error");
        InterfaceC4335x9 interfaceC4335x9 = c4318w9.f34330k;
        if (interfaceC4335x9 != null) {
            interfaceC4335x9.onAdInstanceDidFailedToShow(ironSourceError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C4318w9 c4318w9) {
        tn.p.k(c4318w9, "this$0");
        InterfaceC4335x9 interfaceC4335x9 = c4318w9.f34330k;
        if (interfaceC4335x9 != null) {
            interfaceC4335x9.onAdInstanceDidClick();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C4318w9 c4318w9) {
        tn.p.k(c4318w9, "this$0");
        InterfaceC4335x9 interfaceC4335x9 = c4318w9.f34330k;
        if (interfaceC4335x9 != null) {
            interfaceC4335x9.onAdInstanceDidDismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C4318w9 c4318w9) {
        tn.p.k(c4318w9, "this$0");
        InterfaceC4335x9 interfaceC4335x9 = c4318w9.f34330k;
        if (interfaceC4335x9 != null) {
            interfaceC4335x9.onAdInstanceDidShow();
        }
    }

    public final void a() {
        Tf.a(this.f34325f, new Runnable() { // from class: com.ironsource.im
            @Override // java.lang.Runnable
            public final void run() {
                C4318w9.a(this.f31972b);
            }
        }, 0L, 2, null);
    }

    public final void a(@NotNull Activity activity) {
        tn.p.k(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        this.f34328i.put(this.f34329j.getAdId(), this);
        if (!this.f34321b.a(this.f34320a)) {
            a(C4365z5.f34494a.t());
        } else {
            InterfaceC4082j1.a.f31980a.d(new InterfaceC4156n1[0]).a(this.f34323d);
            this.f34321b.a(activity, this.f34320a);
        }
    }

    public final void a(@Nullable InterfaceC4335x9 interfaceC4335x9) {
        this.f34330k = interfaceC4335x9;
    }

    public final void a(@NotNull InterstitialAdInfo interstitialAdInfo) {
        tn.p.k(interstitialAdInfo, "<set-?>");
        this.f34329j = interstitialAdInfo;
    }

    @Override // com.ironsource.InterfaceC4034g6
    public void a(@Nullable String str) {
        a(C4365z5.f34494a.c(new IronSourceError(0, str)));
    }

    @NotNull
    public final InterstitialAdInfo b() {
        return this.f34329j;
    }

    @Nullable
    public final InterfaceC4335x9 c() {
        return this.f34330k;
    }

    public final boolean d() {
        boolean zA = this.f34321b.a(this.f34320a);
        InterfaceC4082j1.a.f31980a.a(zA).a(this.f34323d);
        return zA;
    }

    public final void finalize() {
        a();
    }

    @Override // com.ironsource.InterfaceC4034g6
    public void onAdInstanceDidBecomeVisible() {
        InterfaceC4082j1.a.f31980a.f(new InterfaceC4156n1[0]).a(this.f34323d);
    }

    @Override // com.ironsource.InterfaceC4034g6
    public void onAdInstanceDidClick() {
        InterfaceC4082j1.a.f31980a.a().a(this.f34323d);
        this.f34325f.a(new Runnable() { // from class: com.ironsource.gm
            @Override // java.lang.Runnable
            public final void run() {
                C4318w9.b(this.f31829b);
            }
        });
    }

    @Override // com.ironsource.InterfaceC4034g6
    public void onAdInstanceDidDismiss() {
        this.f34328i.remove(this.f34329j.getAdId());
        InterfaceC4082j1.a.f31980a.a(new InterfaceC4156n1[0]).a(this.f34323d);
        this.f34325f.a(new Runnable() { // from class: com.ironsource.jm
            @Override // java.lang.Runnable
            public final void run() {
                C4318w9.c(this.f32099b);
            }
        });
    }

    @Override // com.ironsource.InterfaceC4034g6
    public void onAdInstanceDidReward(@Nullable String str, int i10) {
    }

    @Override // com.ironsource.InterfaceC4034g6
    public void onAdInstanceDidShow() {
        P8 p82 = this.f34326g;
        IronSource.a aVar = IronSource.a.INTERSTITIAL;
        InterfaceC4082j1.a.f31980a.b(new C4136m1.w(p82.a(aVar))).a(this.f34323d);
        this.f34327h.b(aVar);
        this.f34322c.b("onAdInstanceDidShow");
        this.f34325f.a(new Runnable() { // from class: com.ironsource.km
            @Override // java.lang.Runnable
            public final void run() {
                C4318w9.d(this.f32182b);
            }
        });
    }
}
