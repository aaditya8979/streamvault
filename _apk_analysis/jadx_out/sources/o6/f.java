package o6;

import i6.l;
import java.io.IOException;
import s7.a0;

/* JADX INFO: compiled from: Sniffer.java */
/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f76267a = new a0(8);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f76268b;

    public final long a(l lVar) throws IOException {
        int i10 = 0;
        lVar.peekFully(this.f76267a.d(), 0, 1);
        int i11 = this.f76267a.d()[0] & 255;
        if (i11 == 0) {
            return Long.MIN_VALUE;
        }
        int i12 = 128;
        int i13 = 0;
        while ((i11 & i12) == 0) {
            i12 >>= 1;
            i13++;
        }
        int i14 = i11 & (~i12);
        lVar.peekFully(this.f76267a.d(), 1, i13);
        while (i10 < i13) {
            i10++;
            i14 = (this.f76267a.d()[i10] & 255) + (i14 << 8);
        }
        this.f76268b += i13 + 1;
        return i14;
    }

    public boolean b(l lVar) throws IOException {
        long length = lVar.getLength();
        long j10 = 1024;
        if (length != -1 && length <= 1024) {
            j10 = length;
        }
        int i10 = (int) j10;
        lVar.peekFully(this.f76267a.d(), 0, 4);
        long jF = this.f76267a.F();
        this.f76268b = 4;
        while (jF != 440786851) {
            int i11 = this.f76268b + 1;
            this.f76268b = i11;
            if (i11 == i10) {
                return false;
            }
            lVar.peekFully(this.f76267a.d(), 0, 1);
            jF = ((jF << 8) & (-256)) | ((long) (this.f76267a.d()[0] & 255));
        }
        long jA = a(lVar);
        long j11 = this.f76268b;
        if (jA == Long.MIN_VALUE) {
            return false;
        }
        if (length != -1 && j11 + jA >= length) {
            return false;
        }
        while (true) {
            int i12 = this.f76268b;
            long j12 = j11 + jA;
            if (i12 >= j12) {
                return ((long) i12) == j12;
            }
            if (a(lVar) == Long.MIN_VALUE) {
                return false;
            }
            long jA2 = a(lVar);
            if (jA2 < 0 || jA2 > 2147483647L) {
                break;
            }
            if (jA2 != 0) {
                int i13 = (int) jA2;
                lVar.advancePeekPosition(i13);
                this.f76268b += i13;
            }
        }
        return false;
    }
}
