package yads;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class m21 implements p30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p30 f92224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f92225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l21 f92226c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f92227d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f92228e;

    public m21(r33 r33Var, int i10, l21 l21Var) {
        ni.a(i10 > 0);
        this.f92224a = r33Var;
        this.f92225b = i10;
        this.f92226c = l21Var;
        this.f92227d = new byte[1];
        this.f92228e = i10;
    }

    @Override // yads.p30
    public final long a(u30 u30Var) {
        throw new UnsupportedOperationException();
    }

    @Override // yads.p30
    public final void a(r83 r83Var) {
        r83Var.getClass();
        this.f92224a.a(r83Var);
    }

    @Override // yads.p30
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // yads.p30
    public final Map getResponseHeaders() {
        return this.f92224a.getResponseHeaders();
    }

    @Override // yads.p30
    public final Uri getUri() {
        return this.f92224a.getUri();
    }

    @Override // yads.l30
    public final int read(byte[] bArr, int i10, int i11) {
        if (this.f92228e == 0) {
            int i12 = 0;
            if (this.f92224a.read(this.f92227d, 0, 1) != -1) {
                int i13 = (this.f92227d[0] & 255) << 4;
                if (i13 != 0) {
                    byte[] bArr2 = new byte[i13];
                    int i14 = i13;
                    while (i14 > 0) {
                        int i15 = this.f92224a.read(bArr2, i12, i14);
                        if (i15 != -1) {
                            i12 += i15;
                            i14 -= i15;
                        }
                    }
                    while (i13 > 0 && bArr2[i13 - 1] == 0) {
                        i13--;
                    }
                    if (i13 > 0) {
                        l21 l21Var = this.f92226c;
                        jb2 jb2Var = new jb2(i13, bArr2);
                        zj2 zj2Var = (zj2) l21Var;
                        long jMax = !zj2Var.f97635l ? zj2Var.f97632i : Math.max(zj2Var.f97636m.a(true), zj2Var.f97632i);
                        int i16 = jb2Var.f91149c - jb2Var.f91148b;
                        ms2 ms2Var = zj2Var.f97634k;
                        ms2Var.getClass();
                        ms2Var.a(i16, jb2Var);
                        ms2Var.a(jMax, 1, i16, 0, (l73) null);
                        zj2Var.f97635l = true;
                    }
                }
                this.f92228e = this.f92225b;
            }
            return -1;
        }
        int i17 = this.f92224a.read(bArr, i10, Math.min(this.f92228e, i11));
        if (i17 != -1) {
            this.f92228e -= i17;
        }
        return i17;
    }
}
