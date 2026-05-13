package com.inmobi.media;

import kotlinx.coroutines.g;

/* JADX INFO: renamed from: com.inmobi.media.yn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3893yn implements go.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p000do.l0 f28611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bn f28612b;

    public C3893yn(p000do.l0 l0Var, Bn bn2) {
        this.f28612b = bn2;
        this.f28611a = l0Var;
    }

    @Override // go.e
    public final Object emit(Object obj, hn.c cVar) {
        p000do.l0 l0Var = this.f28611a;
        boolean z10 = true;
        if (((Mn) obj) == Mn.f25978b) {
            Cn cn2 = this.f28612b.f25234d;
            if (!cn2.f25277b) {
                kotlinx.coroutines.g gVar = cn2.f25276a;
                if (!(gVar != null ? gVar.isActive() : false)) {
                    z10 = false;
                }
            }
            if (!z10) {
                Bn bn2 = this.f28612b;
                bn2.f25234d.f25276a = p000do.i.d(l0Var, null, null, new An(bn2, null), 3, null);
            }
        } else {
            Bn bn3 = this.f28612b;
            kotlinx.coroutines.g gVar2 = bn3.f25234d.f25276a;
            if (gVar2 != null) {
                g.a.a(gVar2, null, 1, null);
            }
            bn3.f25234d.f25276a = null;
        }
        return bn.r.f5635a;
    }
}
