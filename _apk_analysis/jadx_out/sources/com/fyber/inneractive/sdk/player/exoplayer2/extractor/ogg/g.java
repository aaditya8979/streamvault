package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import java.io.EOFException;

/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f17997h = z.a("OggS");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f17998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f17999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18000c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f18001d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18002e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f18003f = new int[255];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f18004g = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(255);

    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, boolean z10) throws com.fyber.inneractive.sdk.player.exoplayer2.r, EOFException {
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = this.f18004g;
        nVar.f18795b = 0;
        nVar.f18796c = 0;
        this.f17998a = 0;
        this.f17999b = 0L;
        this.f18000c = 0;
        this.f18001d = 0;
        this.f18002e = 0;
        long j10 = bVar.f17400b;
        if ((j10 != -1 && j10 - (bVar.f17401c + ((long) bVar.f17403e)) < 27) || !bVar.a(nVar.f18794a, 0, 27, true)) {
            if (z10) {
                return false;
            }
            throw new EOFException();
        }
        if (this.f18004g.k() != f17997h) {
            if (z10) {
                return false;
            }
            throw new com.fyber.inneractive.sdk.player.exoplayer2.r("expected OggS capture pattern at begin of page");
        }
        if (this.f18004g.j() != 0) {
            if (z10) {
                return false;
            }
            throw new com.fyber.inneractive.sdk.player.exoplayer2.r("unsupported bit stream revision");
        }
        this.f17998a = this.f18004g.j();
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar2 = this.f18004g;
        byte[] bArr = nVar2.f18794a;
        int i10 = nVar2.f18795b;
        long j11 = (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
        nVar2.f18795b = i10 + 8;
        this.f17999b = j11 | ((255 & ((long) bArr[i10 + 7])) << 56);
        nVar2.e();
        this.f18004g.e();
        this.f18004g.e();
        int iJ = this.f18004g.j();
        this.f18000c = iJ;
        this.f18001d = iJ + 27;
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar3 = this.f18004g;
        nVar3.f18795b = 0;
        nVar3.f18796c = 0;
        bVar.a(nVar3.f18794a, 0, iJ, false);
        for (int i11 = 0; i11 < this.f18000c; i11++) {
            this.f18003f[i11] = this.f18004g.j();
            this.f18002e += this.f18003f[i11];
        }
        return true;
    }
}
