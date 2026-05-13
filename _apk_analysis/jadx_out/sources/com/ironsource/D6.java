package com.ironsource;

import android.app.Activity;
import androidx.appcompat.widget.ActivityChooserModel;
import com.ironsource.C3978d4;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public final class D6 implements E6, InterfaceC4315w6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final C4366z6 f29117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final C4264t6 f29118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private C4264t6 f29119c;

    public D6(@NotNull C4366z6 c4366z6, @NotNull C4264t6 c4264t6, @Nullable C4264t6 c4264t62) {
        tn.p.k(c4366z6, C3978d4.f.f31283e);
        tn.p.k(c4264t6, "currentAdUnit");
        this.f29117a = c4366z6;
        this.f29118b = c4264t6;
        this.f29119c = c4264t62;
        c4264t6.a(this);
    }

    public static /* synthetic */ E6 a(D6 d62, IronSourceError ironSourceError, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            ironSourceError = null;
        }
        return d62.a(ironSourceError);
    }

    private final E6 a(IronSourceError ironSourceError) {
        if (C4015f5.f31688a.a(ironSourceError)) {
            return new B6(this.f29117a, this.f29118b, this.f29119c, true);
        }
        C4264t6 c4264t6 = this.f29119c;
        return c4264t6 == null ? new A6(this.f29117a) : c4264t6.e() != null ? new B6(this.f29117a, c4264t6, null, false, 8, null) : new C6(this.f29117a, c4264t6, false);
    }

    @Override // com.ironsource.E6
    public void a(@NotNull Activity activity) {
        tn.p.k(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        this.f29117a.a("show called while showing");
    }

    @Override // com.ironsource.E6
    public void a(@NotNull C4264t6 c4264t6) {
        tn.p.k(c4264t6, "adUnit");
        if (c4264t6 == this.f29119c) {
            this.f29119c = null;
        } else {
            this.f29117a.a("ad expired while current ad is showing");
        }
    }

    @Override // com.ironsource.E6
    public void a(@NotNull C4264t6 c4264t6, @Nullable IronSourceError ironSourceError) {
        tn.p.k(c4264t6, "adUnit");
        if (!tn.p.f(c4264t6, this.f29118b)) {
            this.f29117a.a("progressive show failed while showing current ad");
            return;
        }
        this.f29117a.a(a(ironSourceError));
        this.f29117a.d().c(ironSourceError);
    }

    @Override // com.ironsource.E6
    public void a(@NotNull C4264t6 c4264t6, @NotNull LevelPlayAdInfo levelPlayAdInfo) {
        tn.p.k(c4264t6, "adUnit");
        tn.p.k(levelPlayAdInfo, "adInfo");
        if (tn.p.f(c4264t6, this.f29118b)) {
            this.f29117a.d().a(levelPlayAdInfo);
        } else {
            this.f29117a.a("progressive show success while showing current ad");
        }
    }

    @Override // com.ironsource.InterfaceC4315w6
    public void a(@NotNull LevelPlayReward levelPlayReward) {
        tn.p.k(levelPlayReward, "reward");
        this.f29117a.c().a(levelPlayReward);
    }

    @Override // com.ironsource.E6
    public void b(@NotNull C4264t6 c4264t6, @Nullable IronSourceError ironSourceError) {
        tn.p.k(c4264t6, "adUnit");
        if (c4264t6 == this.f29119c) {
            this.f29119c = null;
        } else {
            this.f29117a.a("load failed while current ad is showing");
        }
    }

    @Override // com.ironsource.E6
    public void b(@NotNull C4264t6 c4264t6, @NotNull LevelPlayAdInfo levelPlayAdInfo) {
        tn.p.k(c4264t6, "adUnit");
        tn.p.k(levelPlayAdInfo, "adInfo");
        if (c4264t6 == this.f29118b) {
            this.f29117a.a("load success while current ad is showing");
        }
    }

    @Override // com.ironsource.E6
    public void c(@NotNull C4264t6 c4264t6, @NotNull LevelPlayAdInfo levelPlayAdInfo) {
        tn.p.k(c4264t6, "adUnit");
        tn.p.k(levelPlayAdInfo, "adInfo");
        if (c4264t6 == this.f29118b) {
            this.f29117a.a("ad info changed while current ad is showing");
        }
    }

    @Override // com.ironsource.K0
    public void e() {
        this.f29117a.c().e();
    }

    @Override // com.ironsource.E6
    public void loadAd() {
        this.f29117a.a("load called while showing");
    }

    @Override // com.ironsource.InterfaceC4315w6
    public void onClosed() {
        this.f29117a.a(a(this, null, 1, null));
        this.f29117a.c().onClosed();
    }
}
