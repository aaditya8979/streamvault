package com.fyber.inneractive.sdk.flow.nativead;

import android.net.Uri;
import com.fyber.inneractive.sdk.network.f0;

/* JADX INFO: loaded from: classes2.dex */
public final class t implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.response.nativead.f f16498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f16499b;

    public t(com.fyber.inneractive.sdk.response.nativead.f fVar, s sVar) {
        this.f16498a = fVar;
        this.f16499b = sVar;
    }

    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(Object obj, Exception exc, boolean z10) {
        Uri uri = (Uri) obj;
        if (exc instanceof com.fyber.inneractive.sdk.network.g) {
            return;
        }
        if (exc != null || uri == null) {
            this.f16499b.a(null, exc, this.f16498a);
            return;
        }
        s sVar = this.f16499b;
        com.fyber.inneractive.sdk.response.nativead.f fVar = this.f16498a;
        sVar.a(new g(fVar.f19415a, uri), null, fVar);
    }
}
