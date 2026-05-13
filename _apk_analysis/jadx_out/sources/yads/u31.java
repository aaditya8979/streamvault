package yads;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes10.dex */
public final class u31 implements j41 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w31 f95532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f95533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s31 f95534c;

    public u31(w31 w31Var, String str, s31 s31Var) {
        this.f95532a = w31Var;
        this.f95533b = str;
        this.f95534c = s31Var;
    }

    @Override // yads.j41
    public final void a(i41 i41Var, boolean z10) {
        Bitmap bitmap = i41Var.f90663a;
        if (bitmap != null) {
            w31 w31Var = this.f95532a;
            String str = this.f95533b;
            s31 s31Var = this.f95534c;
            mi2 mi2Var = w31Var.f96269b;
            mi2Var.f92364b.putAll(cn.p0.g(bn.h.a(str, bitmap)));
            s31Var.a(bitmap);
        }
    }

    @Override // yads.tp2
    public final void a(im3 im3Var) {
        boolean z10 = ad1.f87661a;
    }
}
