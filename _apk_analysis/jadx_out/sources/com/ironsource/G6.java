package com.ironsource;

import android.app.Activity;
import androidx.appcompat.widget.ActivityChooserModel;
import com.ironsource.C3978d4;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public final class G6 implements L6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final F6 f29412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final C4264t6 f29413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f29414c;

    public G6(@NotNull F6 f62, @Nullable C4264t6 c4264t6, boolean z10) {
        tn.p.k(f62, C3978d4.f.f31283e);
        this.f29412a = f62;
        this.f29413b = c4264t6;
        this.f29414c = z10;
    }

    public /* synthetic */ G6(F6 f62, C4264t6 c4264t6, boolean z10, int i10, tn.i iVar) {
        this(f62, c4264t6, (i10 & 4) != 0 ? false : z10);
    }

    @Override // com.ironsource.L6
    public void a() {
        this.f29412a.a(this.f29414c ? "ad expired on expired ad" : "ad expired before load called");
    }

    @Override // com.ironsource.L6
    public void a(@NotNull Activity activity) {
        tn.p.k(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        this.f29412a.d().c(new IronSourceError(LevelPlayAdError.ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK, this.f29414c ? "Show called on expired ad" : "Show called before load success"));
    }

    @Override // com.ironsource.L6
    public void a(@Nullable IronSourceError ironSourceError) {
        this.f29412a.a(this.f29414c ? "load failed on expired ad" : "load failed before load called");
    }

    @Override // com.ironsource.L6
    public void a(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        tn.p.k(levelPlayAdInfo, "adInfo");
        this.f29412a.a(this.f29414c ? "show success on expired ad" : "show success before load called");
    }

    @Override // com.ironsource.L6
    public void b(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        tn.p.k(levelPlayAdInfo, "adInfo");
        this.f29412a.a(this.f29414c ? "load with better ad on expired ad" : "load success with better ad before load success");
    }

    @Override // com.ironsource.L6
    public void c(@Nullable IronSourceError ironSourceError) {
        this.f29412a.a(this.f29414c ? "show failed on expired ad" : "show failed before load called");
    }

    @Override // com.ironsource.L6
    public void c(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        tn.p.k(levelPlayAdInfo, "adInfo");
        this.f29412a.a(this.f29414c ? "load success on expired ad" : "load success before load called");
    }

    @Override // com.ironsource.L6
    public void loadAd() {
        C4264t6 c4264t6A = this.f29412a.b().a(true, this.f29412a.c());
        F6 f62 = this.f29412a;
        f62.a(new K6(f62, c4264t6A));
        c4264t6A.a(this.f29412a);
    }
}
