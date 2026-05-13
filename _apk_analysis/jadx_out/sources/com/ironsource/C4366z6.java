package com.ironsource;

import android.app.Activity;
import androidx.appcompat.widget.ActivityChooserModel;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.C4264t6;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.z6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C4366z6 implements InterfaceC4349y6, C4264t6.b, C4264t6.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f34495f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final String f34496g = "Fullscreen ProgressiveOnLoaded Strategy";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final C4173o0 f34497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4281u6 f34498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4315w6 f34499c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4332x6 f34500d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private E6 f34501e;

    /* JADX INFO: renamed from: com.ironsource.z6$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public C4366z6(@NotNull C4173o0 c4173o0, @NotNull InterfaceC4281u6 interfaceC4281u6, @NotNull InterfaceC4315w6 interfaceC4315w6, @NotNull InterfaceC4332x6 interfaceC4332x6) {
        tn.p.k(c4173o0, "adTools");
        tn.p.k(interfaceC4281u6, "factory");
        tn.p.k(interfaceC4315w6, "fullscreenAdUnitListener");
        tn.p.k(interfaceC4332x6, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f34497a = c4173o0;
        this.f34498b = interfaceC4281u6;
        this.f34499c = interfaceC4315w6;
        this.f34500d = interfaceC4332x6;
        this.f34501e = new A6(this);
    }

    @NotNull
    public final C4173o0 a() {
        return this.f34497a;
    }

    @Override // com.ironsource.InterfaceC4349y6
    public void a(@NotNull Activity activity) {
        tn.p.k(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        this.f34501e.a(activity);
    }

    public final void a(@NotNull E6 e62) {
        tn.p.k(e62, "state");
        this.f34501e = e62;
    }

    @Override // com.ironsource.C4264t6.b
    public void a(@NotNull C4264t6 c4264t6) {
        tn.p.k(c4264t6, "adUnit");
        this.f34501e.a(c4264t6);
    }

    @Override // com.ironsource.C4264t6.a
    public void a(@NotNull C4264t6 c4264t6, @Nullable IronSourceError ironSourceError) {
        tn.p.k(c4264t6, "adUnit");
        this.f34501e.a(c4264t6, ironSourceError);
    }

    @Override // com.ironsource.C4264t6.a
    public void a(@NotNull C4264t6 c4264t6, @NotNull LevelPlayAdInfo levelPlayAdInfo) {
        tn.p.k(c4264t6, "adUnit");
        tn.p.k(levelPlayAdInfo, "adInfo");
        this.f34501e.a(c4264t6, levelPlayAdInfo);
    }

    public final void a(@NotNull String str) {
        tn.p.k(str, "message");
        this.f34497a.e().h().f("Fullscreen ProgressiveOnLoaded Strategy - " + str);
    }

    @NotNull
    public final InterfaceC4281u6 b() {
        return this.f34498b;
    }

    @Override // com.ironsource.C4264t6.b
    public void b(@NotNull C4264t6 c4264t6, @Nullable IronSourceError ironSourceError) {
        tn.p.k(c4264t6, "adUnit");
        this.f34501e.b(c4264t6, ironSourceError);
    }

    @Override // com.ironsource.C4264t6.b
    public void b(@NotNull C4264t6 c4264t6, @NotNull LevelPlayAdInfo levelPlayAdInfo) {
        tn.p.k(c4264t6, "adUnit");
        tn.p.k(levelPlayAdInfo, "adInfo");
        this.f34501e.b(c4264t6, levelPlayAdInfo);
    }

    @NotNull
    public final InterfaceC4315w6 c() {
        return this.f34499c;
    }

    @Override // com.ironsource.C4264t6.b
    public void c(@NotNull C4264t6 c4264t6, @NotNull LevelPlayAdInfo levelPlayAdInfo) {
        tn.p.k(c4264t6, "adUnit");
        tn.p.k(levelPlayAdInfo, "adInfo");
        this.f34501e.c(c4264t6, levelPlayAdInfo);
    }

    @NotNull
    public final InterfaceC4332x6 d() {
        return this.f34500d;
    }

    @Override // com.ironsource.InterfaceC4349y6
    public void loadAd() {
        this.f34501e.loadAd();
    }
}
