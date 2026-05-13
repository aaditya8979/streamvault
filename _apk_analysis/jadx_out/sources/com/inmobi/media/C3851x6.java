package com.inmobi.media;

import android.content.Context;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;

/* JADX INFO: renamed from: com.inmobi.media.x6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3851x6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f28501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p000do.l0 f28502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final go.k f28503c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C3605n9 f28504d;

    public C3851x6(Context context, p000do.l0 l0Var, go.k kVar, C3605n9 c3605n9) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(l0Var, "coroutineScope");
        tn.p.k(kVar, "mediaEventFlow");
        this.f28501a = context;
        this.f28502b = l0Var;
        this.f28503c = kVar;
        this.f28504d = c3605n9;
    }
}
