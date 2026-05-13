package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class m31 extends p31 {
    public m31(float f10) {
        super(f10);
    }

    @Override // yads.p31
    public final float a(float f10) {
        return zn.n.m(f10, 0.01f, 1.0f);
    }

    @Override // yads.p31
    public final o31 a(Context context, int i10, int i11, int i12) {
        int iD = vn.c.d(i10 * this.f93395a);
        return new o31(iD, vn.c.d(i12 * (iD / i11)));
    }
}
