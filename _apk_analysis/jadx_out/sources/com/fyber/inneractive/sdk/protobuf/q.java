package com.fyber.inneractive.sdk.protobuf;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public class q extends p {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f19208d;

    public q(byte[] bArr) {
        bArr.getClass();
        this.f19208d = bArr;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s
    public final int a(int i10, int i11) {
        byte[] bArr = this.f19208d;
        int iG = g();
        Charset charset = l1.f19181a;
        for (int i12 = iG; i12 < iG + i11; i12++) {
            i10 = (i10 * 31) + bArr[i12];
        }
        return i10;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s
    public void a(int i10, byte[] bArr) {
        System.arraycopy(this.f19208d, 0, bArr, 0, i10);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s
    public final void a(k kVar) {
        kVar.a(this.f19208d, g(), size());
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s
    public byte c(int i10) {
        return this.f19208d[i10];
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s
    public final boolean c() {
        int iG = g();
        return d4.f19118a.b(this.f19208d, iG, size() + iG);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s
    public byte d(int i10) {
        return this.f19208d[i10];
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s
    public final w d() {
        byte[] bArr = this.f19208d;
        int iG = g();
        int size = size();
        t tVar = new t(bArr, iG, size, true);
        try {
            tVar.d(size);
            return tVar;
        } catch (n1 e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s
    public final s e(int i10) {
        int iA = s.a(0, i10, size());
        return iA == 0 ? s.f19223b : new n(this.f19208d, g(), iA);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s
    public final String e() {
        return new String(this.f19208d, g(), size(), l1.f19181a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s) || size() != ((s) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof q)) {
            return obj.equals(this);
        }
        q qVar = (q) obj;
        int i10 = this.f19225a;
        int i11 = qVar.f19225a;
        if (i10 != 0 && i11 != 0 && i10 != i11) {
            return false;
        }
        int size = size();
        if (size > qVar.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > qVar.size()) {
            StringBuilder sbA = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Ran off end of other: 0, ", size, ", ");
            sbA.append(qVar.size());
            throw new IllegalArgumentException(sbA.toString());
        }
        byte[] bArr = this.f19208d;
        byte[] bArr2 = qVar.f19208d;
        int iG = g() + size;
        int iG2 = g();
        int iG3 = qVar.g();
        while (iG2 < iG) {
            if (bArr[iG2] != bArr2[iG3]) {
                return false;
            }
            iG2++;
            iG3++;
        }
        return true;
    }

    public int g() {
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s
    public int size() {
        return this.f19208d.length;
    }
}
