package com.monetization.ads.exo.source.dash;

import java.io.IOException;
import yads.f30;
import yads.gg1;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements gg1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f51034a;

    public f(i iVar) {
        this.f51034a = iVar;
    }

    @Override // yads.gg1
    public final void a() throws IOException {
        this.f51034a.A.a(Integer.MIN_VALUE);
        f30 f30Var = this.f51034a.C;
        if (f30Var != null) {
            throw f30Var;
        }
    }
}
