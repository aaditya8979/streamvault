package com.ironsource;

import android.app.Activity;
import androidx.appcompat.widget.ActivityChooserModel;
import com.ironsource.C3978d4;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public final class C6 implements E6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final C4366z6 f28880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final C4264t6 f28881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f28882c;

    public C6(@NotNull C4366z6 c4366z6, @NotNull C4264t6 c4264t6, boolean z10) {
        tn.p.k(c4366z6, C3978d4.f.f31283e);
        tn.p.k(c4264t6, "currentAdUnit");
        this.f28880a = c4366z6;
        this.f28881b = c4264t6;
        this.f28882c = z10;
    }

    @Override // com.ironsource.E6
    public void a(@NotNull Activity activity) {
        tn.p.k(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        this.f28880a.a("show called while loading");
    }

    @Override // com.ironsource.E6
    public void a(@NotNull C4264t6 c4264t6) {
        tn.p.k(c4264t6, "adUnit");
        this.f28880a.a("ad expired while loading");
    }

    @Override // com.ironsource.E6
    public void a(@NotNull C4264t6 c4264t6, @Nullable IronSourceError ironSourceError) {
        tn.p.k(c4264t6, "adUnit");
        this.f28880a.a("show failed while loading");
    }

    @Override // com.ironsource.E6
    public void a(@NotNull C4264t6 c4264t6, @NotNull LevelPlayAdInfo levelPlayAdInfo) {
        tn.p.k(c4264t6, "adUnit");
        tn.p.k(levelPlayAdInfo, "adInfo");
        this.f28880a.a("show success while loading");
    }

    @Override // com.ironsource.E6
    public void b(@NotNull C4264t6 c4264t6, @Nullable IronSourceError ironSourceError) {
        tn.p.k(c4264t6, "adUnit");
        this.f28880a.a(new A6(this.f28880a));
        if (this.f28882c) {
            this.f28880a.d().a(ironSourceError);
        }
    }

    @Override // com.ironsource.E6
    public void b(@NotNull C4264t6 c4264t6, @NotNull LevelPlayAdInfo levelPlayAdInfo) {
        tn.p.k(c4264t6, "adUnit");
        tn.p.k(levelPlayAdInfo, "adInfo");
        if (!this.f28882c) {
            this.f28880a.a(new B6(this.f28880a, this.f28881b, null, false));
            return;
        }
        C4264t6 c4264t6A = this.f28880a.b().a(false, this.f28880a.c());
        this.f28880a.a(new B6(this.f28880a, this.f28881b, c4264t6A, true));
        this.f28880a.d().b(levelPlayAdInfo);
        c4264t6A.a(this.f28880a);
    }

    @Override // com.ironsource.E6
    public void c(@NotNull C4264t6 c4264t6, @NotNull LevelPlayAdInfo levelPlayAdInfo) {
        tn.p.k(c4264t6, "adUnit");
        tn.p.k(levelPlayAdInfo, "adInfo");
        this.f28880a.a("ad info changed while loading");
    }

    @Override // com.ironsource.E6
    public void loadAd() {
        if (this.f28882c) {
            this.f28880a.a("load called while loading");
        }
        this.f28882c = true;
    }
}
