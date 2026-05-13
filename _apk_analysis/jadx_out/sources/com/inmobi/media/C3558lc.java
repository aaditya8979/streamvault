package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.ads.nativeAd.MediaView;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.lc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3558lc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3605n9 f27560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AbstractC3498j2 f27561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MediaView f27562c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C3851x6 f27563d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final go.k f27564e;

    public C3558lc(Context context, p000do.l0 l0Var, C3605n9 c3605n9) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(l0Var, "coroutineScope");
        this.f27560a = c3605n9;
        go.k kVarB = go.q.b(0, 0, null, 7, null);
        this.f27562c = new MediaView(context);
        this.f27563d = new C3851x6(context, l0Var, kVarB, c3605n9);
        this.f27564e = kVarB;
    }

    public final Object a(AbstractC3876y6 abstractC3876y6, ContinuationImpl continuationImpl) {
        C3605n9 c3605n9 = this.f27560a;
        if (c3605n9 != null) {
            c3605n9.a("MediaViewManager", "load called - experienceModel: " + abstractC3876y6);
        }
        return this.f27561b != null ? this.f27562c : p000do.g.g(p000do.w0.b(), new C3533kc(this, abstractC3876y6, null), continuationImpl);
    }
}
