package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.mn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3594mn implements go.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3669pn f27645a;

    public C3594mn(p000do.l0 l0Var, C3669pn c3669pn) {
        this.f27645a = c3669pn;
    }

    @Override // go.e
    public final Object emit(Object obj, hn.c cVar) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        C3605n9 c3605n9 = this.f27645a.f27902c;
        if (c3605n9 != null) {
            c3605n9.a("VideoSurfaceViewabilityController", "Viewability " + zBooleanValue);
        }
        if (zBooleanValue) {
            Ij ij2 = this.f27645a.f27907h;
            if (ij2 != null) {
                ij2.a();
            }
        } else {
            Ij ij3 = this.f27645a.f27907h;
            if (ij3 != null) {
                ij3.b();
            }
        }
        return bn.r.f5635a;
    }
}
