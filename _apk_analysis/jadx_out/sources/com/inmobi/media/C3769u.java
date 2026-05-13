package com.inmobi.media;

import com.squareup.picasso.Callback;

/* JADX INFO: renamed from: com.inmobi.media.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3769u implements Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3819w f28214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.c f28215b;

    public C3769u(C3819w c3819w, kotlinx.coroutines.c cVar) {
        this.f28214a = c3819w;
        this.f28215b = cVar;
    }

    @Override // com.squareup.picasso.Callback
    public final void onError(Exception exc) {
        C3605n9 c3605n9 = this.f28214a.f28400d;
        if (c3605n9 != null) {
            c3605n9.a("AdChoiceViewManager", "onError Called " + exc);
        }
        P4.a(this.f28215b, Boolean.FALSE);
    }

    @Override // com.squareup.picasso.Callback
    public final void onSuccess() {
        C3605n9 c3605n9 = this.f28214a.f28400d;
        if (c3605n9 != null) {
            c3605n9.a("AdChoiceViewManager", "onSuccess Called");
        }
        P4.a(this.f28215b, Boolean.TRUE);
    }
}
