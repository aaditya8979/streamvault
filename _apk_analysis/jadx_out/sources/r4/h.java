package r4;

import a6.t;
import com.google.android.exoplayer.Format;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import r4.i;

/* JADX INFO: compiled from: OpusReader.java */
/* JADX INFO: loaded from: classes3.dex */
public final class h extends i {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final byte[] f78613o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f78614n;

    public static boolean n(t tVar) {
        int iA = tVar.a();
        byte[] bArr = f78613o;
        if (iA < bArr.length) {
            return false;
        }
        byte[] bArr2 = new byte[bArr.length];
        tVar.h(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // r4.i
    public long e(t tVar) {
        return b(l(tVar.f3620a));
    }

    @Override // r4.i
    public boolean h(t tVar, long j10, i.b bVar) {
        if (this.f78614n) {
            boolean z10 = tVar.j() == 1332770163;
            tVar.L(0);
            return z10;
        }
        byte[] bArrCopyOf = Arrays.copyOf(tVar.f3620a, tVar.d());
        int i10 = bArrCopyOf[9] & 255;
        int i11 = ((bArrCopyOf[11] & 255) << 8) | (bArrCopyOf[10] & 255);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArrCopyOf);
        m(arrayList, i11);
        m(arrayList, 3840);
        bVar.f78628a = Format.q(null, "audio/opus", null, -1, -1, i10, 48000, arrayList, null, 0, null);
        this.f78614n = true;
        return true;
    }

    @Override // r4.i
    public void j(boolean z10) {
        super.j(z10);
        if (z10) {
            this.f78614n = false;
        }
    }

    public final long l(byte[] bArr) {
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

    public final void m(List<byte[]> list, int i10) {
        list.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong((((long) i10) * 1000000000) / 48000).array());
    }
}
