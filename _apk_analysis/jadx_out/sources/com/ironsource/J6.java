package com.ironsource;

import android.app.Activity;
import androidx.appcompat.widget.ActivityChooserModel;
import com.ironsource.C3978d4;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class J6 implements L6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final F6 f29654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final C4264t6 f29655b;

    public J6(@NotNull F6 f62, @NotNull C4264t6 c4264t6) {
        tn.p.k(f62, C3978d4.f.f31283e);
        tn.p.k(c4264t6, "adUnit");
        this.f29654a = f62;
        this.f29655b = c4264t6;
    }

    @Override // com.ironsource.L6
    public void a() {
        F6 f62 = this.f29654a;
        f62.a(new G6(f62, null, true));
        this.f29654a.d().a();
    }

    @Override // com.ironsource.L6
    public void a(@NotNull Activity activity) {
        tn.p.k(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        this.f29655b.a(activity, this.f29654a);
    }

    @Override // com.ironsource.L6
    public void a(@Nullable IronSourceError ironSourceError) {
        this.f29654a.a("load failed after ad unit is already loaded");
    }

    @Override // com.ironsource.L6
    public void a(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        tn.p.k(levelPlayAdInfo, "adInfo");
        this.f29654a.d().a(levelPlayAdInfo);
        C4264t6 c4264t6A = this.f29654a.b().a(false, this.f29654a.c());
        F6 f62 = this.f29654a;
        f62.a(new I6(f62, this.f29655b, c4264t6A));
        c4264t6A.a(this.f29654a);
    }

    @Override // com.ironsource.L6
    public void b(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        tn.p.k(levelPlayAdInfo, "adInfo");
        this.f29654a.d().onAdInfoChanged(levelPlayAdInfo);
    }

    @Override // com.ironsource.L6
    public void c(@Nullable IronSourceError ironSourceError) {
        if (!C4015f5.f31688a.a(ironSourceError)) {
            F6 f62 = this.f29654a;
            f62.a(new G6(f62, null, false, 4, null));
        }
        this.f29654a.d().c(ironSourceError);
    }

    @Override // com.ironsource.L6
    public void c(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        tn.p.k(levelPlayAdInfo, "adInfo");
        this.f29654a.a("Ad unit is already loaded");
    }

    @Override // com.ironsource.L6
    public void loadAd() {
        F6 f62 = this.f29654a;
        f62.a(new G6(f62, null, false, 4, null));
        this.f29654a.loadAd();
    }
}
