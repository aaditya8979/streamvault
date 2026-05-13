package com.ironsource;

import android.app.Activity;
import androidx.appcompat.widget.ActivityChooserModel;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.C4264t6;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public final class F6 implements InterfaceC4349y6, C4264t6.b, C4264t6.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f29299f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final String f29300g = "Fullscreen ProgressiveOnShown Strategy";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final C4173o0 f29301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4281u6 f29302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4315w6 f29303c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4332x6 f29304d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private L6 f29305e;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public F6(@NotNull C4173o0 c4173o0, @NotNull InterfaceC4281u6 interfaceC4281u6, @NotNull InterfaceC4315w6 interfaceC4315w6, @NotNull InterfaceC4332x6 interfaceC4332x6) {
        tn.p.k(c4173o0, "adTools");
        tn.p.k(interfaceC4281u6, "factory");
        tn.p.k(interfaceC4315w6, "fullscreenAdUnitListener");
        tn.p.k(interfaceC4332x6, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f29301a = c4173o0;
        this.f29302b = interfaceC4281u6;
        this.f29303c = interfaceC4315w6;
        this.f29304d = interfaceC4332x6;
        this.f29305e = new G6(this, null, false, 4, null);
    }

    @NotNull
    public final C4173o0 a() {
        return this.f29301a;
    }

    @Override // com.ironsource.InterfaceC4349y6
    public void a(@NotNull Activity activity) {
        tn.p.k(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        this.f29305e.a(activity);
    }

    public final void a(@NotNull L6 l62) {
        tn.p.k(l62, "state");
        this.f29305e = l62;
    }

    @Override // com.ironsource.C4264t6.b
    public void a(@NotNull C4264t6 c4264t6) {
        tn.p.k(c4264t6, "adUnit");
        this.f29305e.a();
    }

    @Override // com.ironsource.C4264t6.a
    public void a(@NotNull C4264t6 c4264t6, @Nullable IronSourceError ironSourceError) {
        tn.p.k(c4264t6, "adUnit");
        this.f29305e.c(ironSourceError);
    }

    @Override // com.ironsource.C4264t6.a
    public void a(@NotNull C4264t6 c4264t6, @NotNull LevelPlayAdInfo levelPlayAdInfo) {
        tn.p.k(c4264t6, "adUnit");
        tn.p.k(levelPlayAdInfo, "adInfo");
        this.f29305e.a(levelPlayAdInfo);
    }

    public final void a(@NotNull String str) {
        tn.p.k(str, "message");
        this.f29301a.e().h().f("Fullscreen ProgressiveOnShown Strategy - " + str);
    }

    @NotNull
    public final InterfaceC4281u6 b() {
        return this.f29302b;
    }

    @Override // com.ironsource.C4264t6.b
    public void b(@NotNull C4264t6 c4264t6, @Nullable IronSourceError ironSourceError) {
        tn.p.k(c4264t6, "adUnit");
        this.f29305e.a(ironSourceError);
    }

    @Override // com.ironsource.C4264t6.b
    public void b(@NotNull C4264t6 c4264t6, @NotNull LevelPlayAdInfo levelPlayAdInfo) {
        tn.p.k(c4264t6, "adUnit");
        tn.p.k(levelPlayAdInfo, "adInfo");
        this.f29305e.c(levelPlayAdInfo);
    }

    @NotNull
    public final InterfaceC4315w6 c() {
        return this.f29303c;
    }

    @Override // com.ironsource.C4264t6.b
    public void c(@NotNull C4264t6 c4264t6, @NotNull LevelPlayAdInfo levelPlayAdInfo) {
        tn.p.k(c4264t6, "adUnit");
        tn.p.k(levelPlayAdInfo, "adInfo");
        this.f29305e.b(levelPlayAdInfo);
    }

    @NotNull
    public final InterfaceC4332x6 d() {
        return this.f29304d;
    }

    @Override // com.ironsource.InterfaceC4349y6
    public void loadAd() {
        this.f29305e.loadAd();
    }
}
