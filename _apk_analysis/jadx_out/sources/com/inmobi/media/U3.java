package com.inmobi.media;

import android.content.Context;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;

/* JADX INFO: loaded from: classes9.dex */
public final class U3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f26408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3605n9 f26409b;

    public U3(Context context, C3605n9 c3605n9) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        this.f26408a = context;
        this.f26409b = c3605n9;
    }

    public final C3615nj a(C3813vi c3813vi) {
        tn.p.k(c3813vi, "resource");
        c3813vi.getClass();
        return new C3615nj(this.f26408a, this.f26409b);
    }
}
