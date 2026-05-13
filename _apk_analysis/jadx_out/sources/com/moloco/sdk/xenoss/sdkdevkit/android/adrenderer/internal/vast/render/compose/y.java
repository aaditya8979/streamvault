package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 1)
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final sn.a<bn.r> f50463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final sn.a<bn.r> f50464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final sn.a<bn.r> f50465c;

    public y() {
        this(null, null, null, 7, null);
    }

    public y(@Nullable sn.a<bn.r> aVar, @Nullable sn.a<bn.r> aVar2, @Nullable sn.a<bn.r> aVar3) {
        this.f50463a = aVar;
        this.f50464b = aVar2;
        this.f50465c = aVar3;
    }

    public /* synthetic */ y(sn.a aVar, sn.a aVar2, sn.a aVar3, int i10, tn.i iVar) {
        this((i10 & 1) != 0 ? null : aVar, (i10 & 2) != 0 ? null : aVar2, (i10 & 4) != 0 ? null : aVar3);
    }

    @Nullable
    public final sn.a<bn.r> a() {
        return this.f50464b;
    }

    @Nullable
    public final sn.a<bn.r> b() {
        return this.f50465c;
    }

    @Nullable
    public final sn.a<bn.r> c() {
        return this.f50463a;
    }
}
