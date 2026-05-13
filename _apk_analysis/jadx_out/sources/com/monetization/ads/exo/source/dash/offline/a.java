package com.monetization.ads.exo.source.dash.offline;

import yads.as2;
import yads.j30;
import yads.lo2;
import yads.p30;
import yads.rr;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends as2 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p30 f51056i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f51057j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ lo2 f51058k;

    public a(rr rrVar, int i10, lo2 lo2Var) {
        this.f51056i = rrVar;
        this.f51057j = i10;
        this.f51058k = lo2Var;
    }

    @Override // yads.as2
    public final Object b() {
        return j30.a(this.f51056i, this.f51057j, this.f51058k);
    }
}
