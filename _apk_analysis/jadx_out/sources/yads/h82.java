package yads;

import android.util.Base64;

/* JADX INFO: loaded from: classes10.dex */
public final class h82 implements g82 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hn f90277a;

    public /* synthetic */ h82() {
        this(new hn());
    }

    public h82(hn hnVar) {
        this.f90277a = hnVar;
    }

    public final String a(wp2 wp2Var) {
        byte[] bArr = wp2Var.f96471b.f96852a;
        if (bArr == null) {
            return null;
        }
        String strC = t01.c(wp2Var.f96472c, u11.T);
        if (strC != null && !Boolean.parseBoolean(strC)) {
            return new String(bArr, bo.c.f5639b);
        }
        this.f90277a.getClass();
        try {
            return new String(Base64.decode(bArr, 0), bo.c.f5639b);
        } catch (Exception unused) {
            String str = new String(bArr, bo.c.f5639b);
            boolean z10 = ad1.f87661a;
            return str;
        }
    }
}
