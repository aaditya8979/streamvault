package com.ironsource;

import android.app.Activity;
import androidx.appcompat.widget.ActivityChooserModel;
import com.ironsource.C3978d4;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class H6 implements L6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final F6 f29508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final C4264t6 f29509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final C4264t6 f29510c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private LevelPlayAdInfo f29511d;

    public H6(@NotNull F6 f62, @NotNull C4264t6 c4264t6, @NotNull C4264t6 c4264t62, @NotNull LevelPlayAdInfo levelPlayAdInfo) {
        tn.p.k(f62, C3978d4.f.f31283e);
        tn.p.k(c4264t6, "currentAdUnit");
        tn.p.k(c4264t62, "progressiveAdUnit");
        tn.p.k(levelPlayAdInfo, "adInfo");
        this.f29508a = f62;
        this.f29509b = c4264t6;
        this.f29510c = c4264t62;
        this.f29511d = levelPlayAdInfo;
    }

    @Override // com.ironsource.L6
    public void a() {
        F6 f62 = this.f29508a;
        f62.a(new G6(f62, this.f29509b, true));
    }

    @Override // com.ironsource.L6
    public void a(@NotNull Activity activity) {
        tn.p.k(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        this.f29508a.d().c(new IronSourceError(LevelPlayAdError.ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK, "Show called before load success"));
    }

    @Override // com.ironsource.L6
    public void a(@Nullable IronSourceError ironSourceError) {
        this.f29508a.a("load failed on progressive ad unit that already loaded");
    }

    @Override // com.ironsource.L6
    public void a(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        tn.p.k(levelPlayAdInfo, "adInfo");
        this.f29508a.a("show success on progressive ad unit that already loaded");
    }

    @Override // com.ironsource.L6
    public void b(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        tn.p.k(levelPlayAdInfo, "adInfo");
        this.f29511d = levelPlayAdInfo;
    }

    @Override // com.ironsource.L6
    public void c(@Nullable IronSourceError ironSourceError) {
        this.f29508a.a("show failed on progressive ad unit that already loaded");
    }

    @Override // com.ironsource.L6
    public void c(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        tn.p.k(levelPlayAdInfo, "adInfo");
        this.f29508a.a("load success on progressive ad unit is already loaded");
    }

    @Override // com.ironsource.L6
    public void loadAd() {
        this.f29508a.d().b(this.f29511d);
        F6 f62 = this.f29508a;
        f62.a(new J6(f62, this.f29510c));
    }
}
