package com.fyber.inneractive.sdk.ignite;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class l extends d1.a {
    public l(Context context, k kVar, com.fyber.inneractive.sdk.ignite.events.wrappers.a aVar, boolean z10, boolean z11, boolean z12, h hVar) {
        super(kVar, aVar);
        f1.e eVar = new f1.e(context);
        this.f59542a = (z10 && z11) ? new f1.h(new f1.g(eVar, hVar), true, z12, hVar, this) : z10 ? new f1.h(eVar, false, z12, hVar, this) : z11 ? new f1.g(eVar, hVar) : new f1.i(eVar, hVar);
    }
}
