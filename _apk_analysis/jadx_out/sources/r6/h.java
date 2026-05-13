package r6;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.m;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.common.collect.ImmutableList;
import f6.v;
import i6.e0;
import java.util.Arrays;
import java.util.List;
import r6.i;
import s7.a0;

/* JADX INFO: compiled from: OpusReader.java */
/* JADX INFO: loaded from: classes10.dex */
public final class h extends i {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final byte[] f78703o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final byte[] f78704p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f78705n;

    public static boolean o(a0 a0Var, byte[] bArr) {
        if (a0Var.a() < bArr.length) {
            return false;
        }
        int iE = a0Var.e();
        byte[] bArr2 = new byte[bArr.length];
        a0Var.j(bArr2, 0, bArr.length);
        a0Var.P(iE);
        return Arrays.equals(bArr2, bArr);
    }

    public static boolean p(a0 a0Var) {
        return o(a0Var, f78703o);
    }

    @Override // r6.i
    public long f(a0 a0Var) {
        return c(n(a0Var.d()));
    }

    @Override // r6.i
    public boolean i(a0 a0Var, long j10, i.b bVar) throws ParserException {
        if (o(a0Var, f78703o)) {
            byte[] bArrCopyOf = Arrays.copyOf(a0Var.d(), a0Var.f());
            int iC = v.c(bArrCopyOf);
            List<byte[]> listA = v.a(bArrCopyOf);
            if (bVar.f78719a != null) {
                return true;
            }
            bVar.f78719a = new m.b().e0("audio/opus").H(iC).f0(48000).T(listA).E();
            return true;
        }
        byte[] bArr = f78704p;
        if (!o(a0Var, bArr)) {
            s7.a.i(bVar.f78719a);
            return false;
        }
        s7.a.i(bVar.f78719a);
        if (this.f78705n) {
            return true;
        }
        this.f78705n = true;
        a0Var.Q(bArr.length);
        Metadata metadataC = e0.c(ImmutableList.copyOf(e0.j(a0Var, false, false).f63881b));
        if (metadataC == null) {
            return true;
        }
        bVar.f78719a = bVar.f78719a.b().X(metadataC.c(bVar.f78719a.f21749k)).E();
        return true;
    }

    @Override // r6.i
    public void l(boolean z10) {
        super.l(z10);
        if (z10) {
            this.f78705n = false;
        }
    }

    public final long n(byte[] bArr) {
        int i10 = bArr[0] & 255;
        int i11 = i10 & 3;
        int i12 = 2;
        if (i11 == 0) {
            i12 = 1;
        } else if (i11 != 1 && i11 != 2) {
            i12 = bArr[1] & 63;
        }
        int i13 = i10 >> 3;
        int i14 = i13 & 3;
        return ((long) i12) * ((long) (i13 >= 16 ? 2500 << i14 : i13 >= 12 ? 10000 << (i14 & 1) : i14 == 3 ? 60000 : 10000 << i14));
    }
}
