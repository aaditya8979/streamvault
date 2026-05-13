package com.ironsource;

import android.app.Activity;
import androidx.appcompat.widget.ActivityChooserModel;
import com.ironsource.C3978d4;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public final class A6 implements E6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final C4366z6 f28729a;

    public A6(@NotNull C4366z6 c4366z6) {
        tn.p.k(c4366z6, C3978d4.f.f31283e);
        this.f28729a = c4366z6;
    }

    @Override // com.ironsource.E6
    public void a(@NotNull Activity activity) {
        tn.p.k(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        this.f28729a.a("show called before load success");
    }

    @Override // com.ironsource.E6
    public void a(@NotNull C4264t6 c4264t6) {
        tn.p.k(c4264t6, "adUnit");
        this.f28729a.a("ad expired before load called");
    }

    @Override // com.ironsource.E6
    public void a(@NotNull C4264t6 c4264t6, @Nullable IronSourceError ironSourceError) {
        tn.p.k(c4264t6, "adUnit");
        this.f28729a.a("ad display failed before load called");
    }

    @Override // com.ironsource.E6
    public void a(@NotNull C4264t6 c4264t6, @NotNull LevelPlayAdInfo levelPlayAdInfo) {
        tn.p.k(c4264t6, "adUnit");
        tn.p.k(levelPlayAdInfo, "adInfo");
        this.f28729a.a("ad display success before load called");
    }

    @Override // com.ironsource.E6
    public void b(@NotNull C4264t6 c4264t6, @Nullable IronSourceError ironSourceError) {
        tn.p.k(c4264t6, "adUnit");
        this.f28729a.a("load failed before load called");
    }

    @Override // com.ironsource.E6
    public void b(@NotNull C4264t6 c4264t6, @NotNull LevelPlayAdInfo levelPlayAdInfo) {
        tn.p.k(c4264t6, "adUnit");
        tn.p.k(levelPlayAdInfo, "adInfo");
        this.f28729a.a("load success before load called");
    }

    @Override // com.ironsource.E6
    public void c(@NotNull C4264t6 c4264t6, @NotNull LevelPlayAdInfo levelPlayAdInfo) {
        tn.p.k(c4264t6, "adUnit");
        tn.p.k(levelPlayAdInfo, "adInfo");
        this.f28729a.a("load success with better ad before load called");
    }

    @Override // com.ironsource.E6
    public void loadAd() {
        C4264t6 c4264t6A = this.f28729a.b().a(true, this.f28729a.c());
        this.f28729a.a(new C6(this.f28729a, c4264t6A, true));
        c4264t6A.a(this.f28729a);
    }
}
