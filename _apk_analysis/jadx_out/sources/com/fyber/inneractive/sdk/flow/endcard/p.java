package com.fyber.inneractive.sdk.flow.endcard;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes.dex */
public final class p extends u {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f16366j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f16367k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f16368l;

    public p(o oVar) {
        super(oVar);
        com.fyber.inneractive.sdk.model.vast.o oVar2 = oVar.f16308c.f16705e.f16826f;
        this.f16366j = oVar2 != null ? oVar2.f16877a : null;
    }

    public final void b(com.fyber.inneractive.sdk.flow.endcard.loaders.listeners.a aVar) {
        if (TextUtils.isEmpty(this.f16378e) || TextUtils.isEmpty(this.f16367k)) {
            return;
        }
        if (this.f16379f || !this.f16381h.compareAndSet(false, true)) {
            IAlog.a("%sisWebLoaded: %s, mFmpEndCardPrepareInProgress: %s", this.f16304a, Boolean.valueOf(this.f16379f), Boolean.valueOf(this.f16381h.get()));
        } else {
            a(aVar);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.u
    public final q d() {
        b bVar = this.f16305b;
        return new q(bVar.f16308c.f16705e, (o) bVar);
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.u
    public final boolean f() {
        return false;
    }
}
