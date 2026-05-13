package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class i43 implements dq2 {
    @Override // yads.dq2
    public final Object a(wp2 wp2Var) {
        byte[] bArr = wp2Var.f96471b.f96852a;
        if (bArr == null) {
            return null;
        }
        try {
            return new String(bArr, t01.a(wp2Var.f96472c));
        } catch (Exception unused) {
            return new String(bArr, bo.c.f5639b);
        }
    }
}
