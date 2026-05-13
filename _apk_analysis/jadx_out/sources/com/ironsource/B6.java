package com.ironsource;

import android.app.Activity;
import androidx.appcompat.widget.ActivityChooserModel;
import com.ironsource.C3978d4;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public final class B6 implements E6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final C4366z6 f28844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final C4264t6 f28845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private C4264t6 f28846c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f28847d;

    public B6(@NotNull C4366z6 c4366z6, @NotNull C4264t6 c4264t6, @Nullable C4264t6 c4264t62, boolean z10) {
        tn.p.k(c4366z6, C3978d4.f.f31283e);
        tn.p.k(c4264t6, "currentAdUnit");
        this.f28844a = c4366z6;
        this.f28845b = c4264t6;
        this.f28846c = c4264t62;
        this.f28847d = z10;
    }

    public /* synthetic */ B6(C4366z6 c4366z6, C4264t6 c4264t6, C4264t6 c4264t62, boolean z10, int i10, tn.i iVar) {
        this(c4366z6, c4264t6, c4264t62, (i10 & 8) != 0 ? false : z10);
    }

    private final void a() {
        E6 c62;
        C4264t6 c4264t6 = this.f28846c;
        if (c4264t6 == null) {
            C4366z6 c4366z6 = this.f28844a;
            c4366z6.a(new A6(c4366z6));
        } else {
            if (c4264t6.e() != null) {
                C4366z6 c4366z62 = this.f28844a;
                C4264t6 c4264t62 = this.f28846c;
                tn.p.h(c4264t62);
                c62 = new B6(c4366z62, c4264t62, null, false, 8, null);
            } else {
                C4366z6 c4366z63 = this.f28844a;
                C4264t6 c4264t63 = this.f28846c;
                tn.p.h(c4264t63);
                c62 = new C6(c4366z63, c4264t63, false);
            }
            this.f28844a.a(c62);
        }
        this.f28844a.d().a();
    }

    @Override // com.ironsource.E6
    public void a(@NotNull Activity activity) {
        tn.p.k(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        this.f28844a.a(new D6(this.f28844a, this.f28845b, this.f28846c));
        this.f28845b.a(activity, this.f28844a);
    }

    @Override // com.ironsource.E6
    public void a(@NotNull C4264t6 c4264t6) {
        tn.p.k(c4264t6, "adUnit");
        if (tn.p.f(c4264t6, this.f28846c)) {
            this.f28846c = null;
        } else if (tn.p.f(c4264t6, this.f28845b)) {
            a();
        }
    }

    @Override // com.ironsource.E6
    public void a(@NotNull C4264t6 c4264t6, @Nullable IronSourceError ironSourceError) {
        tn.p.k(c4264t6, "adUnit");
        if (tn.p.f(c4264t6, this.f28845b)) {
            this.f28844a.a("show failed when loaded");
        } else {
            this.f28844a.a("progressive show failed while current ad is loaded");
        }
    }

    @Override // com.ironsource.E6
    public void a(@NotNull C4264t6 c4264t6, @NotNull LevelPlayAdInfo levelPlayAdInfo) {
        tn.p.k(c4264t6, "adUnit");
        tn.p.k(levelPlayAdInfo, "adInfo");
        if (tn.p.f(c4264t6, this.f28845b)) {
            this.f28844a.a("show success when loaded");
        } else {
            this.f28844a.a("progressive show success while current ad is loaded");
        }
    }

    @Override // com.ironsource.E6
    public void b(@NotNull C4264t6 c4264t6, @Nullable IronSourceError ironSourceError) {
        tn.p.k(c4264t6, "adUnit");
        if (tn.p.f(c4264t6, this.f28846c)) {
            this.f28846c = null;
        } else {
            this.f28844a.a("load failed after current ad is loaded");
        }
    }

    @Override // com.ironsource.E6
    public void b(@NotNull C4264t6 c4264t6, @NotNull LevelPlayAdInfo levelPlayAdInfo) {
        tn.p.k(c4264t6, "adUnit");
        tn.p.k(levelPlayAdInfo, "adInfo");
        if (tn.p.f(this.f28845b, c4264t6)) {
            this.f28844a.a("load success after current ad is loaded");
        }
    }

    @Override // com.ironsource.E6
    public void c(@NotNull C4264t6 c4264t6, @NotNull LevelPlayAdInfo levelPlayAdInfo) {
        tn.p.k(c4264t6, "adUnit");
        tn.p.k(levelPlayAdInfo, "adInfo");
        if (tn.p.f(c4264t6, this.f28845b)) {
            this.f28844a.d().onAdInfoChanged(levelPlayAdInfo);
        }
    }

    @Override // com.ironsource.E6
    public void loadAd() {
        bn.r rVar;
        if (this.f28847d) {
            this.f28844a.a("load called while current ad is loaded");
            return;
        }
        this.f28847d = true;
        LevelPlayAdInfo levelPlayAdInfoE = this.f28845b.e();
        if (levelPlayAdInfoE != null) {
            this.f28844a.d().b(levelPlayAdInfoE);
            rVar = bn.r.f5635a;
        } else {
            rVar = null;
        }
        if (rVar == null) {
            this.f28844a.a("current ad is loaded without ad info");
        } else if (this.f28846c == null) {
            C4264t6 c4264t6A = this.f28844a.b().a(false, this.f28844a.c());
            this.f28846c = c4264t6A;
            c4264t6A.a(this.f28844a);
        }
    }
}
