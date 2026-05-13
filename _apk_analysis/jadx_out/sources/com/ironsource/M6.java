package com.ironsource;

import android.app.Activity;
import androidx.appcompat.widget.ActivityChooserModel;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.C4264t6;
import com.ironsource.InterfaceC4349y6;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class M6 implements InterfaceC4349y6, C4264t6.b, C4264t6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final C4173o0 f29836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4349y6.a f29837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4281u6 f29838c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4315w6 f29839d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC4332x6 f29840e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private C4264t6 f29841f;

    public M6(@NotNull C4173o0 c4173o0, @NotNull InterfaceC4349y6.a aVar, @NotNull InterfaceC4281u6 interfaceC4281u6, @NotNull InterfaceC4315w6 interfaceC4315w6, @NotNull InterfaceC4332x6 interfaceC4332x6) {
        tn.p.k(c4173o0, "adTools");
        tn.p.k(aVar, "config");
        tn.p.k(interfaceC4281u6, "fullscreenAdUnitFactory");
        tn.p.k(interfaceC4315w6, "fullscreenAdUnitListener");
        tn.p.k(interfaceC4332x6, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f29836a = c4173o0;
        this.f29837b = aVar;
        this.f29838c = interfaceC4281u6;
        this.f29839d = interfaceC4315w6;
        this.f29840e = interfaceC4332x6;
    }

    @NotNull
    public final C4173o0 a() {
        return this.f29836a;
    }

    @Override // com.ironsource.InterfaceC4349y6
    public void a(@NotNull Activity activity) {
        tn.p.k(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        C4264t6 c4264t6 = this.f29841f;
        if (c4264t6 != null) {
            c4264t6.a(activity, this);
        }
    }

    @Override // com.ironsource.C4264t6.b
    public void a(@NotNull C4264t6 c4264t6) {
        tn.p.k(c4264t6, "adUnit");
        this.f29841f = null;
        this.f29840e.a();
    }

    @Override // com.ironsource.C4264t6.a
    public void a(@NotNull C4264t6 c4264t6, @Nullable IronSourceError ironSourceError) {
        tn.p.k(c4264t6, "adUnit");
        this.f29840e.c(ironSourceError);
    }

    @Override // com.ironsource.C4264t6.a
    public void a(@NotNull C4264t6 c4264t6, @NotNull LevelPlayAdInfo levelPlayAdInfo) {
        tn.p.k(c4264t6, "adUnit");
        tn.p.k(levelPlayAdInfo, "adInfo");
        this.f29840e.a(levelPlayAdInfo);
    }

    @NotNull
    public final InterfaceC4349y6.a b() {
        return this.f29837b;
    }

    @Override // com.ironsource.C4264t6.b
    public void b(@NotNull C4264t6 c4264t6, @Nullable IronSourceError ironSourceError) {
        tn.p.k(c4264t6, "adUnit");
        this.f29840e.a(ironSourceError);
    }

    @Override // com.ironsource.C4264t6.b
    public void b(@NotNull C4264t6 c4264t6, @NotNull LevelPlayAdInfo levelPlayAdInfo) {
        tn.p.k(c4264t6, "adUnit");
        tn.p.k(levelPlayAdInfo, "adInfo");
        this.f29840e.b(levelPlayAdInfo);
    }

    @Override // com.ironsource.C4264t6.b
    public void c(@NotNull C4264t6 c4264t6, @NotNull LevelPlayAdInfo levelPlayAdInfo) {
        tn.p.k(c4264t6, "adUnit");
        tn.p.k(levelPlayAdInfo, "adInfo");
        this.f29840e.onAdInfoChanged(levelPlayAdInfo);
    }

    @Override // com.ironsource.InterfaceC4349y6
    public void loadAd() {
        C4264t6 c4264t6A = this.f29838c.a(true, this.f29839d);
        c4264t6A.a(this);
        this.f29841f = c4264t6A;
    }
}
