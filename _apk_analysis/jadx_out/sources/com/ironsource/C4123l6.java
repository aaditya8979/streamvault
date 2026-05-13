package com.ironsource;

import android.app.Activity;
import androidx.appcompat.widget.ActivityChooserModel;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.InterstitialAdListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.RewardedVideoAdListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.l6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4123l6 extends A implements InterstitialAdListener, RewardedVideoAdListener, AdapterAdRewardListener {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    private WeakReference<InterfaceC4141m6> f32197x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @Nullable
    private C4122l5 f32198y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4123l6(@NotNull W0 w02, @NotNull B b10, @NotNull H h10, @NotNull InterfaceC4141m6 interfaceC4141m6) {
        super(w02, b10, h10, interfaceC4141m6);
        tn.p.k(w02, "adTools");
        tn.p.k(b10, "instanceData");
        tn.p.k(h10, "adInstancePayload");
        tn.p.k(interfaceC4141m6, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f32197x = new WeakReference<>(interfaceC4141m6);
    }

    private final List<String> I() {
        JSONObject jSONObjectOptJSONObject = new S6().a(new String[]{Q6.f30268u}).optJSONObject(Q6.f30268u);
        if (jSONObjectOptJSONObject == null) {
            return cn.w.m();
        }
        Object objOpt = jSONObjectOptJSONObject.opt(Q6.C);
        List list = objOpt instanceof List ? (List) objOpt : null;
        if (list == null) {
            return cn.w.m();
        }
        ArrayList arrayList = new ArrayList(cn.x.x(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next()));
        }
        return arrayList;
    }

    private final Map<String, Object> J() {
        Map mapD = cn.p0.d();
        for (String str : I()) {
            List listU0 = bo.d0.U0(str, new String[]{"="}, false, 2, 2, null);
            if (listU0.size() < 2) {
                IronLog.INTERNAL.warning(a("\"" + str + "\" is not a valid key=value format"));
            } else {
                String str2 = (String) listU0.get(0);
                mapD.put("custom_" + str2, (String) listU0.get(1));
            }
        }
        return cn.p0.c(mapD);
    }

    private final void K() {
        if (v()) {
            f().e().h().l("closed after failure");
            return;
        }
        this.f32198y = new C4122l5();
        IronLog.INTERNAL.verbose(A.a(this, (String) null, 1, (Object) null));
        f().e().a().a(k(), "");
        InterfaceC4141m6 interfaceC4141m6 = this.f32197x.get();
        if (interfaceC4141m6 != null) {
            interfaceC4141m6.b(this);
        }
        c();
    }

    private final void L() {
        IronLog.INTERNAL.verbose(A.a(this, (String) null, 1, (Object) null));
        f().e().a().d(k());
    }

    private final void M() {
        if (v()) {
            f().e().h().l("rewarded after failure");
            return;
        }
        Map<String, Object> mapJ = J();
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strA = f().a(jCurrentTimeMillis, p());
        long jA = C4122l5.a(this.f32198y);
        LevelPlayReward levelPlayRewardA = Lb.f29764s.d().B().a(k(), n().i().b().c());
        if (levelPlayRewardA == null) {
            levelPlayRewardA = M4.f29833a.a();
        }
        f().e().a().a(k(), levelPlayRewardA.getName(), levelPlayRewardA.getAmount(), jCurrentTimeMillis, strA, jA, mapJ, f().j());
        InterfaceC4141m6 interfaceC4141m6 = this.f32197x.get();
        if (interfaceC4141m6 != null) {
            interfaceC4141m6.a(this, levelPlayRewardA);
        }
    }

    private final void N() {
        IronLog.INTERNAL.verbose(A.a(this, (String) null, 1, (Object) null));
        InterfaceC4141m6 interfaceC4141m6 = this.f32197x.get();
        if (interfaceC4141m6 != null) {
            interfaceC4141m6.a(this);
        }
    }

    private final void O() {
        IronLog.INTERNAL.verbose(A.a(this, (String) null, 1, (Object) null));
        f().e().a().i(k());
    }

    private final void P() {
        IronLog.INTERNAL.verbose(A.a(this, (String) null, 1, (Object) null));
        f().e().a().k(k());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4123l6 c4123l6) {
        tn.p.k(c4123l6, "this$0");
        c4123l6.K();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C4123l6 c4123l6) {
        tn.p.k(c4123l6, "this$0");
        c4123l6.L();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C4123l6 c4123l6) {
        tn.p.k(c4123l6, "this$0");
        c4123l6.N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C4123l6 c4123l6) {
        tn.p.k(c4123l6, "this$0");
        c4123l6.M();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(C4123l6 c4123l6) {
        tn.p.k(c4123l6, "this$0");
        c4123l6.O();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(C4123l6 c4123l6) {
        tn.p.k(c4123l6, "this$0");
        c4123l6.P();
    }

    @Override // com.ironsource.A
    public void A() {
        if (!(g() instanceof AdapterAdFullScreenInterface)) {
            IronLog.INTERNAL.error(a("adapter not instance of AdapterAdFullScreenInterface"));
            return;
        }
        Object objG = g();
        tn.p.i(objG, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface<com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener>");
        ((AdapterAdFullScreenInterface) objG).loadAd(n().g(), ContextProvider.getInstance().getActiveContext(), this);
    }

    public final void a(@NotNull Activity activity) {
        tn.p.k(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a("placementName = " + k()));
        try {
            f().e().a().a(activity, k());
            if (g() instanceof AdapterAdFullScreenInterface) {
                Object objG = g();
                tn.p.i(objG, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface<com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener>");
                ((AdapterAdFullScreenInterface) objG).showAd(i(), activity, this);
            } else {
                ironLog.error(a("showAd - adapter not instance of AdapterAdFullScreenInterface"));
                f().e().h().g("showAd - adapter not instance of AdapterAdFullScreenInterface");
            }
        } catch (Throwable th2) {
            C4228r4.d().a(th2);
            String str = "showAd - exception = " + th2.getMessage();
            IronLog.INTERNAL.error(a(str));
            f().e().h().g(str);
            a(A0.h(n().h()), str);
        }
    }

    @Override // com.ironsource.A
    public void a(@NotNull J j10) {
        tn.p.k(j10, "adInstancePresenter");
        j10.a(this);
    }

    @Override // com.ironsource.A
    public void c() {
        if (!(g() instanceof AdapterAdFullScreenInterface)) {
            IronLog.INTERNAL.error(a("adapter not instance of AdapterAdFullScreenInterface"));
            return;
        }
        Object objG = g();
        tn.p.i(objG, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface<*>");
        ((AdapterAdFullScreenInterface) objG).destroyAd(n().g());
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdClosed() {
        a(new Runnable() { // from class: com.ironsource.cl
            @Override // java.lang.Runnable
            public final void run() {
                C4123l6.a(this.f31167b);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdEnded() {
        a(new Runnable() { // from class: com.ironsource.zk
            @Override // java.lang.Runnable
            public final void run() {
                C4123l6.b(this.f34571b);
            }
        });
    }

    @Override // com.ironsource.A, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened() {
        onAdOpened(new LinkedHashMap());
    }

    @Override // com.ironsource.A, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened(@NotNull Map<String, Object> map) {
        tn.p.k(map, "extraData");
        super.onAdOpened(map);
        a(new Runnable() { // from class: com.ironsource.bl
            @Override // java.lang.Runnable
            public final void run() {
                C4123l6.c(this.f31076b);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener
    public void onAdRewarded() {
        a(new Runnable() { // from class: com.ironsource.al
            @Override // java.lang.Runnable
            public final void run() {
                C4123l6.d(this.f31006b);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdStarted() {
        a(new Runnable() { // from class: com.ironsource.el
            @Override // java.lang.Runnable
            public final void run() {
                C4123l6.e(this.f31601b);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdVisible() {
        a(new Runnable() { // from class: com.ironsource.dl
            @Override // java.lang.Runnable
            public final void run() {
                C4123l6.f(this.f31502b);
            }
        });
    }
}
