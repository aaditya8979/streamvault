package com.ironsource;

import com.ironsource.E0;
import com.ironsource.InterfaceC4128lb;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.sdk.controller.f;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.mb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4146mb extends Aa implements Vb {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final UUID f32298d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final C4110kb f32299e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Sb f32300f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private String f32301g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private C4041gd f32302h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private InterfaceC4184ob f32303i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private AdapterNativeAdData f32304j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private AdapterNativeAdViewBinder f32305k;

    /* JADX WARN: Illegal instructions before constructor call */
    public C4146mb(@NotNull UUID uuid, @NotNull C4110kb c4110kb) {
        tn.p.k(uuid, f.b.f33716c);
        tn.p.k(c4110kb, "nativeAd");
        IronSource.a aVar = IronSource.a.NATIVE_AD;
        super(new C4173o0(aVar, E0.b.MEDIATION));
        this.f32298d = uuid;
        this.f32299e = c4110kb;
        this.f32301g = "";
        a().e().a(new C4154n(aVar, uuid, b()));
    }

    public /* synthetic */ C4146mb(UUID uuid, C4110kb c4110kb, int i10, tn.i iVar) {
        this((i10 & 1) != 0 ? C4367z7.f34502a.a() : uuid, c4110kb);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4146mb c4146mb) {
        tn.p.k(c4146mb, "this$0");
        IronLog.API.info(String.valueOf(c4146mb));
        try {
            Sb sb2 = c4146mb.f32300f;
            if (sb2 == null) {
                tn.p.C("nativeAdController");
                sb2 = null;
            }
            sb2.n();
            c4146mb.f32303i = null;
        } catch (Throwable th2) {
            C4228r4.d().a(th2);
            IronLog.API.error("destroyNativeAd()");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4146mb c4146mb, InterfaceC4184ob interfaceC4184ob) {
        tn.p.k(c4146mb, "this$0");
        c4146mb.f32303i = interfaceC4184ob;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4146mb c4146mb, LevelPlayAdError levelPlayAdError) {
        tn.p.k(c4146mb, "this$0");
        tn.p.k(levelPlayAdError, "$levelPlayError");
        InterfaceC4184ob interfaceC4184ob = c4146mb.f32303i;
        if (interfaceC4184ob != null) {
            interfaceC4184ob.a(c4146mb.f32299e, levelPlayAdError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4146mb c4146mb, LevelPlayAdInfo levelPlayAdInfo) {
        tn.p.k(c4146mb, "this$0");
        tn.p.k(levelPlayAdInfo, "$adInfo");
        InterfaceC4184ob interfaceC4184ob = c4146mb.f32303i;
        if (interfaceC4184ob != null) {
            interfaceC4184ob.c(c4146mb.f32299e, levelPlayAdInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4146mb c4146mb, String str) {
        tn.p.k(c4146mb, "this$0");
        tn.p.k(str, "$placementName");
        c4146mb.f32301g = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C4146mb c4146mb) {
        tn.p.k(c4146mb, "this$0");
        Sb sb2 = null;
        if (c4146mb.c()) {
            IronLog.INTERNAL.warning(C4173o0.a(c4146mb.a(), "Native ad load already called", (String) null, 2, (Object) null));
            return;
        }
        c4146mb.a(true);
        if (c4146mb.d()) {
            Sb sb3 = c4146mb.f32300f;
            if (sb3 == null) {
                tn.p.C("nativeAdController");
            } else {
                sb2 = sb3;
            }
            sb2.o();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C4146mb c4146mb, LevelPlayAdInfo levelPlayAdInfo) {
        tn.p.k(c4146mb, "this$0");
        tn.p.k(levelPlayAdInfo, "$adInfo");
        InterfaceC4184ob interfaceC4184ob = c4146mb.f32303i;
        if (interfaceC4184ob != null) {
            interfaceC4184ob.b(c4146mb.f32299e, levelPlayAdInfo);
        }
    }

    private final Sb e() {
        this.f32302h = a().c(this.f32301g);
        UUID uuid = this.f32298d;
        String strB = b();
        C4041gd c4041gd = this.f32302h;
        if (c4041gd == null) {
            tn.p.C("placement");
            c4041gd = null;
        }
        C3968cc c3968cc = new C3968cc(uuid, strB, c4041gd);
        a(c3968cc);
        return new Sb(this, a(), c3968cc);
    }

    public final void a(@Nullable final InterfaceC4184ob interfaceC4184ob) {
        a(new Runnable() { // from class: com.ironsource.fl
            @Override // java.lang.Runnable
            public final void run() {
                C4146mb.a(this.f31749b, interfaceC4184ob);
            }
        });
    }

    @Override // com.ironsource.Vb
    public void a(@NotNull final LevelPlayAdInfo levelPlayAdInfo) {
        tn.p.k(levelPlayAdInfo, "adInfo");
        IronLog.CALLBACK.info(String.valueOf(this));
        Pb pb2 = new Pb();
        Sb sb2 = this.f32300f;
        if (sb2 == null) {
            tn.p.C("nativeAdController");
            sb2 = null;
        }
        sb2.a(pb2);
        this.f32304j = pb2.a();
        this.f32305k = pb2.b();
        b(new Runnable() { // from class: com.ironsource.ll
            @Override // java.lang.Runnable
            public final void run() {
                C4146mb.b(this.f32241b, levelPlayAdInfo);
            }
        });
    }

    @Override // com.ironsource.Vb
    public void b(@NotNull final LevelPlayAdInfo levelPlayAdInfo) {
        tn.p.k(levelPlayAdInfo, "adInfo");
        b(new Runnable() { // from class: com.ironsource.il
            @Override // java.lang.Runnable
            public final void run() {
                C4146mb.a(this.f31970b, levelPlayAdInfo);
            }
        });
    }

    public final void b(@NotNull final String str) {
        tn.p.k(str, "placementName");
        a(new Runnable() { // from class: com.ironsource.gl
            @Override // java.lang.Runnable
            public final void run() {
                C4146mb.a(this.f31827b, str);
            }
        });
    }

    @Override // com.ironsource.Aa
    public boolean d() {
        this.f32300f = e();
        return true;
    }

    public final void f() {
        a(new Runnable() { // from class: com.ironsource.hl
            @Override // java.lang.Runnable
            public final void run() {
                C4146mb.a(this.f31903b);
            }
        });
    }

    @NotNull
    public final UUID g() {
        return this.f32298d;
    }

    @Nullable
    public final String h() {
        AdapterNativeAdData adapterNativeAdData = this.f32304j;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getAdvertiser();
        }
        return null;
    }

    @Nullable
    public final String i() {
        AdapterNativeAdData adapterNativeAdData = this.f32304j;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getBody();
        }
        return null;
    }

    @Nullable
    public final String j() {
        AdapterNativeAdData adapterNativeAdData = this.f32304j;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getCallToAction();
        }
        return null;
    }

    @Nullable
    public final InterfaceC4128lb.a k() {
        NativeAdDataInterface.Image icon;
        AdapterNativeAdData adapterNativeAdData = this.f32304j;
        if (adapterNativeAdData == null || (icon = adapterNativeAdData.getIcon()) == null) {
            return null;
        }
        return new InterfaceC4128lb.a(icon.getDrawable(), icon.getUri());
    }

    @Nullable
    public final AdapterNativeAdViewBinder l() {
        return this.f32305k;
    }

    @Nullable
    public final String m() {
        AdapterNativeAdData adapterNativeAdData = this.f32304j;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getTitle();
        }
        return null;
    }

    public final void n() {
        a(new Runnable() { // from class: com.ironsource.kl
            @Override // java.lang.Runnable
            public final void run() {
                C4146mb.b(this.f32181b);
            }
        });
    }

    @Override // com.ironsource.Vb
    public void onNativeAdLoadFailed(@Nullable IronSourceError ironSourceError) {
        String string = this.f32298d.toString();
        tn.p.j(string, "adId.toString()");
        final LevelPlayAdError levelPlayAdError = new LevelPlayAdError(ironSourceError, string, b());
        b(new Runnable() { // from class: com.ironsource.jl
            @Override // java.lang.Runnable
            public final void run() {
                C4146mb.a(this.f32097b, levelPlayAdError);
            }
        });
    }
}
