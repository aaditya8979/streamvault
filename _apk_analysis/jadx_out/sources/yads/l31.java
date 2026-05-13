package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes11.dex */
public final class l31 extends p31 {
    public l31(float f10) {
        super(f10);
    }

    @Override // yads.p31
    public final float a(float f10) {
        return zn.n.d(f10, 10.0f);
    }

    @Override // yads.p31
    public final o31 a(Context context, int i10, int i11, int i12) {
        int iJ = zn.n.j(kl3.a(context, this.f93395a), i10);
        return new o31(iJ, vn.c.d(i12 * (iJ / i11)));
    }
}
