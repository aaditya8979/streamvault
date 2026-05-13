package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class n31 extends p31 {
    public n31(float f10) {
        super(f10);
    }

    @Override // yads.p31
    public final float a(float f10) {
        return zn.n.m(f10, 0.01f, 1.0f);
    }

    @Override // yads.p31
    public final o31 a(Context context, int i10, int i11, int i12) {
        int iA = kl3.a(context, 140);
        int iD = vn.c.d(i10 * this.f93395a);
        if (i11 > iD) {
            i12 = vn.c.d(i12 / (i11 / iD));
            i11 = iD;
        }
        if (i12 > iA) {
            i11 = vn.c.d(i11 / (i12 / iA));
        } else {
            iA = i12;
        }
        return new o31(i11, iA);
    }
}
