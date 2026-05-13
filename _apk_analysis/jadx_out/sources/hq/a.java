package hq;

import com.ironsource.C3978d4;
import hq.d;
import hq.h;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import sq.p;

/* JADX INFO: compiled from: AbstractBuffer.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements d {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final vq.c f63575l = vq.b.a(a.class);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final boolean f63576m = Boolean.getBoolean("org.eclipse.jetty.io.AbstractBuffer.boundsChecking");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f63577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f63578c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f63579d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f63580e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f63581f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f63582g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f63583h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f63584i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f63585j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public m f63586k;

    public a(int i10, boolean z10) {
        if (i10 == 0 && z10) {
            throw new IllegalArgumentException("IMMUTABLE && VOLATILE");
        }
        V(-1);
        this.f63577b = i10;
        this.f63578c = z10;
    }

    @Override // hq.d
    public byte[] H() {
        int length = length();
        byte[] bArr = new byte[length];
        byte[] bArrW = W();
        if (bArrW != null) {
            System.arraycopy(bArrW, getIndex(), bArr, 0, length);
        } else {
            J(getIndex(), bArr, 0, length());
        }
        return bArr;
    }

    @Override // hq.d
    public int K(InputStream inputStream, int i10) throws IOException {
        byte[] bArrW = W();
        int iL = L();
        if (iL <= i10) {
            i10 = iL;
        }
        if (bArrW != null) {
            int i11 = inputStream.read(bArrW, this.f63580e, i10);
            if (i11 > 0) {
                this.f63580e += i11;
            }
            return i11;
        }
        int i12 = i10 <= 1024 ? i10 : 1024;
        byte[] bArr = new byte[i12];
        while (i10 > 0) {
            int i13 = inputStream.read(bArr, 0, i12);
            if (i13 < 0) {
                return -1;
            }
            b(bArr, 0, i13);
            i10 -= i13;
        }
        return 0;
    }

    @Override // hq.d
    public int L() {
        return e0() - this.f63580e;
    }

    @Override // hq.d
    public int M(int i10, byte[] bArr, int i11, int i12) {
        int i13 = 0;
        this.f63581f = 0;
        if (i10 + i12 > e0()) {
            i12 = e0() - i10;
        }
        byte[] bArrW = W();
        if (bArrW != null) {
            System.arraycopy(bArr, i11, bArrW, i10, i12);
        } else {
            while (i13 < i12) {
                I(i10, bArr[i11]);
                i13++;
                i10++;
                i11++;
            }
        }
        return i12;
    }

    @Override // hq.d
    public d N(int i10, int i11) {
        m mVar = this.f63586k;
        if (mVar == null) {
            this.f63586k = new m(this, -1, i10, i10 + i11, isReadOnly() ? 1 : 2);
        } else {
            mVar.update(buffer());
            this.f63586k.V(-1);
            this.f63586k.l0(0);
            this.f63586k.X(i11 + i10);
            this.f63586k.l0(i10);
        }
        return this.f63586k;
    }

    @Override // hq.d
    public String O() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C3978d4.j.f31383d);
        sb2.append(super.hashCode());
        sb2.append(StringUtils.COMMA);
        sb2.append(buffer().hashCode());
        sb2.append(",m=");
        sb2.append(i0());
        sb2.append(",g=");
        sb2.append(getIndex());
        sb2.append(",p=");
        sb2.append(T());
        sb2.append(",c=");
        sb2.append(e0());
        sb2.append("]={");
        if (i0() >= 0) {
            for (int iI0 = i0(); iI0 < getIndex(); iI0++) {
                p.g(Q(iI0), sb2);
            }
            sb2.append("}{");
        }
        int i10 = 0;
        int index = getIndex();
        while (index < T()) {
            p.g(Q(index), sb2);
            int i11 = i10 + 1;
            if (i10 == 50 && T() - index > 20) {
                sb2.append(" ... ");
                index = T() - 20;
            }
            index++;
            i10 = i11;
        }
        sb2.append('}');
        return sb2.toString();
    }

    @Override // hq.d
    public String P(Charset charset) {
        try {
            byte[] bArrW = W();
            return bArrW != null ? new String(bArrW, getIndex(), length(), charset) : new String(H(), 0, length(), charset);
        } catch (Exception e10) {
            f63575l.e(e10);
            return new String(H(), 0, length());
        }
    }

    @Override // hq.d
    public boolean R(d dVar) {
        int i10;
        if (dVar == this) {
            return true;
        }
        if (dVar.length() != length()) {
            return false;
        }
        int i11 = this.f63581f;
        if (i11 != 0 && (dVar instanceof a) && (i10 = ((a) dVar).f63581f) != 0 && i11 != i10) {
            return false;
        }
        int index = getIndex();
        int iT = dVar.T();
        byte[] bArrW = W();
        byte[] bArrW2 = dVar.W();
        if (bArrW != null && bArrW2 != null) {
            int iT2 = T();
            while (true) {
                int i12 = iT2 - 1;
                if (iT2 <= index) {
                    break;
                }
                byte b10 = bArrW[i12];
                iT--;
                byte b11 = bArrW2[iT];
                if (b10 != b11) {
                    if (97 <= b10 && b10 <= 122) {
                        b10 = (byte) ((b10 - 97) + 65);
                    }
                    if (97 <= b11 && b11 <= 122) {
                        b11 = (byte) ((b11 - 97) + 65);
                    }
                    if (b10 != b11) {
                        return false;
                    }
                }
                iT2 = i12;
            }
        } else {
            int iT3 = T();
            while (true) {
                int i13 = iT3 - 1;
                if (iT3 <= index) {
                    break;
                }
                byte bQ = Q(i13);
                iT--;
                byte bQ2 = dVar.Q(iT);
                if (bQ != bQ2) {
                    if (97 <= bQ && bQ <= 122) {
                        bQ = (byte) ((bQ - 97) + 65);
                    }
                    if (97 <= bQ2 && bQ2 <= 122) {
                        bQ2 = (byte) ((bQ2 - 97) + 65);
                    }
                    if (bQ != bQ2) {
                        return false;
                    }
                }
                iT3 = i13;
            }
        }
        return true;
    }

    @Override // hq.d
    public void S() {
        V(this.f63579d - 1);
    }

    @Override // hq.d
    public final int T() {
        return this.f63580e;
    }

    @Override // hq.d
    public int U(int i10, d dVar) {
        int i11 = 0;
        this.f63581f = 0;
        int length = dVar.length();
        if (i10 + length > e0()) {
            length = e0() - i10;
        }
        byte[] bArrW = dVar.W();
        byte[] bArrW2 = W();
        if (bArrW != null && bArrW2 != null) {
            System.arraycopy(bArrW, dVar.getIndex(), bArrW2, i10, length);
        } else if (bArrW != null) {
            int index = dVar.getIndex();
            while (i11 < length) {
                I(i10, bArrW[index]);
                i11++;
                i10++;
                index++;
            }
        } else if (bArrW2 != null) {
            int index2 = dVar.getIndex();
            while (i11 < length) {
                bArrW2[i10] = dVar.Q(index2);
                i11++;
                i10++;
                index2++;
            }
        } else {
            int index3 = dVar.getIndex();
            while (i11 < length) {
                I(i10, dVar.Q(index3));
                i11++;
                i10++;
                index3++;
            }
        }
        return length;
    }

    @Override // hq.d
    public void V(int i10) {
        this.f63584i = i10;
    }

    @Override // hq.d
    public void X(int i10) {
        this.f63580e = i10;
        this.f63581f = 0;
    }

    @Override // hq.d
    public int Y(byte[] bArr) {
        int iT = T();
        int iM = M(iT, bArr, 0, bArr.length);
        X(iT + iM);
        return iM;
    }

    @Override // hq.d
    public boolean Z() {
        return this.f63577b <= 0;
    }

    public h a(int i10) {
        return ((this instanceof d.a) || (buffer() instanceof d.a)) ? new h.a(H(), 0, length(), i10) : new h(H(), 0, length(), i10);
    }

    public int b(byte[] bArr, int i10, int i11) {
        int iT = T();
        int iM = M(iT, bArr, i10, i11);
        X(iT + iM);
        return iM;
    }

    @Override // hq.d
    public int b0(byte[] bArr, int i10, int i11) {
        int index = getIndex();
        int length = length();
        if (length == 0) {
            return -1;
        }
        if (i11 > length) {
            i11 = length;
        }
        int iJ = J(index, bArr, i10, i11);
        if (iJ > 0) {
            l0(index + iJ);
        }
        return iJ;
    }

    @Override // hq.d
    public d buffer() {
        return this;
    }

    public d c(int i10) {
        if (i0() < 0) {
            return null;
        }
        d dVarN = N(i0(), i10);
        V(-1);
        return dVarN;
    }

    @Override // hq.d
    public void c0() {
        if (isReadOnly()) {
            throw new IllegalStateException("READONLY");
        }
        int iI0 = i0() >= 0 ? i0() : getIndex();
        if (iI0 > 0) {
            byte[] bArrW = W();
            int iT = T() - iI0;
            if (iT > 0) {
                if (bArrW != null) {
                    System.arraycopy(W(), iI0, W(), 0, iT);
                } else {
                    U(0, N(iI0, iT));
                }
            }
            if (i0() > 0) {
                V(i0() - iI0);
            }
            l0(getIndex() - iI0);
            X(T() - iI0);
        }
    }

    @Override // hq.d
    public void clear() {
        V(-1);
        l0(0);
        X(0);
    }

    @Override // hq.d
    public d d0() {
        return c((getIndex() - i0()) - 1);
    }

    public boolean equals(Object obj) {
        int i10;
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if ((this instanceof d.a) || (dVar instanceof d.a)) {
            return R(dVar);
        }
        if (dVar.length() != length()) {
            return false;
        }
        int i11 = this.f63581f;
        if (i11 != 0 && (obj instanceof a) && (i10 = ((a) obj).f63581f) != 0 && i11 != i10) {
            return false;
        }
        int index = getIndex();
        int iT = dVar.T();
        int iT2 = T();
        while (true) {
            int i12 = iT2 - 1;
            if (iT2 <= index) {
                return true;
            }
            iT--;
            if (Q(i12) != dVar.Q(iT)) {
                return false;
            }
            iT2 = i12;
        }
    }

    @Override // hq.d
    public byte get() {
        int i10 = this.f63579d;
        this.f63579d = i10 + 1;
        return Q(i10);
    }

    @Override // hq.d
    public d get(int i10) {
        int index = getIndex();
        d dVarN = N(index, i10);
        l0(index + i10);
        return dVarN;
    }

    @Override // hq.d
    public final int getIndex() {
        return this.f63579d;
    }

    @Override // hq.d
    public boolean hasContent() {
        return this.f63580e > this.f63579d;
    }

    public int hashCode() {
        if (this.f63581f == 0 || this.f63582g != this.f63579d || this.f63583h != this.f63580e) {
            int index = getIndex();
            byte[] bArrW = W();
            if (bArrW != null) {
                int iT = T();
                while (true) {
                    int i10 = iT - 1;
                    if (iT <= index) {
                        break;
                    }
                    byte b10 = bArrW[i10];
                    if (97 <= b10 && b10 <= 122) {
                        b10 = (byte) ((b10 - 97) + 65);
                    }
                    this.f63581f = (this.f63581f * 31) + b10;
                    iT = i10;
                }
            } else {
                int iT2 = T();
                while (true) {
                    int i11 = iT2 - 1;
                    if (iT2 <= index) {
                        break;
                    }
                    byte bQ = Q(i11);
                    if (97 <= bQ && bQ <= 122) {
                        bQ = (byte) ((bQ - 97) + 65);
                    }
                    this.f63581f = (this.f63581f * 31) + bQ;
                    iT2 = i11;
                }
            }
            if (this.f63581f == 0) {
                this.f63581f = -1;
            }
            this.f63582g = this.f63579d;
            this.f63583h = this.f63580e;
        }
        return this.f63581f;
    }

    @Override // hq.d
    public int i0() {
        return this.f63584i;
    }

    @Override // hq.d
    public boolean isReadOnly() {
        return this.f63577b <= 1;
    }

    @Override // hq.d
    public boolean j0() {
        return this.f63578c;
    }

    @Override // hq.d
    public int k0(d dVar) {
        int iT = T();
        int iU = U(iT, dVar);
        X(iT + iU);
        return iU;
    }

    @Override // hq.d
    public void l0(int i10) {
        this.f63579d = i10;
        this.f63581f = 0;
    }

    @Override // hq.d
    public int length() {
        return this.f63580e - this.f63579d;
    }

    @Override // hq.d
    public d m0() {
        return Z() ? this : a(0);
    }

    @Override // hq.d
    public byte peek() {
        return Q(this.f63579d);
    }

    @Override // hq.d
    public void put(byte b10) {
        int iT = T();
        I(iT, b10);
        X(iT + 1);
    }

    @Override // hq.d
    public int skip(int i10) {
        if (length() < i10) {
            i10 = length();
        }
        l0(getIndex() + i10);
        return i10;
    }

    public String toString() {
        if (!Z()) {
            return new String(H(), 0, length());
        }
        if (this.f63585j == null) {
            this.f63585j = new String(H(), 0, length());
        }
        return this.f63585j;
    }

    @Override // hq.d
    public String toString(String str) {
        try {
            byte[] bArrW = W();
            return bArrW != null ? new String(bArrW, getIndex(), length(), str) : new String(H(), 0, length(), str);
        } catch (Exception e10) {
            f63575l.e(e10);
            return new String(H(), 0, length());
        }
    }

    @Override // hq.d
    public void writeTo(OutputStream outputStream) throws IOException {
        byte[] bArrW = W();
        if (bArrW != null) {
            outputStream.write(bArrW, getIndex(), length());
        } else {
            int length = length();
            int i10 = length <= 1024 ? length : 1024;
            byte[] bArr = new byte[i10];
            int i11 = this.f63579d;
            while (length > 0) {
                int iJ = J(i11, bArr, 0, length > i10 ? i10 : length);
                outputStream.write(bArr, 0, iJ);
                i11 += iJ;
                length -= iJ;
            }
        }
        clear();
    }
}
