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
public final class I6 implements L6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final F6 f29603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final C4264t6 f29604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final C4264t6 f29605c;

    public I6(@NotNull F6 f62, @NotNull C4264t6 c4264t6, @NotNull C4264t6 c4264t62) {
        tn.p.k(f62, C3978d4.f.f31283e);
        tn.p.k(c4264t6, "currentAdUnit");
        tn.p.k(c4264t62, "progressiveAdUnit");
        this.f29603a = f62;
        this.f29604b = c4264t6;
        this.f29605c = c4264t62;
    }

    @Override // com.ironsource.L6
    public void a() {
        this.f29603a.a("ad expired before progressive load success");
    }

    @Override // com.ironsource.L6
    public void a(@NotNull Activity activity) {
        tn.p.k(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        this.f29603a.d().c(new IronSourceError(LevelPlayAdError.ERROR_CODE_SHOW_WHILE_LOAD, "Show called while progressive loading another ad"));
    }

    @Override // com.ironsource.L6
    public void a(@Nullable IronSourceError ironSourceError) {
        F6 f62 = this.f29603a;
        f62.a(new G6(f62, this.f29604b, false, 4, null));
    }

    @Override // com.ironsource.L6
    public void a(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        tn.p.k(levelPlayAdInfo, "adInfo");
        this.f29603a.a("show success before progressive load success");
    }

    @Override // com.ironsource.L6
    public void b(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        tn.p.k(levelPlayAdInfo, "adInfo");
        this.f29603a.a("load success with better ad before progressive load success");
    }

    @Override // com.ironsource.L6
    public void c(@Nullable IronSourceError ironSourceError) {
        this.f29603a.a("show failed before progressive load success");
    }

    @Override // com.ironsource.L6
    public void c(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        tn.p.k(levelPlayAdInfo, "adInfo");
        F6 f62 = this.f29603a;
        f62.a(new H6(f62, this.f29604b, this.f29605c, levelPlayAdInfo));
    }

    @Override // com.ironsource.L6
    public void loadAd() {
        F6 f62 = this.f29603a;
        f62.a(new K6(f62, this.f29605c));
    }
}
