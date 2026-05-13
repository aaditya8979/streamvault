package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f17972a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f17973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f17974c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l f17975d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f17976e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f17977f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f17978g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f17979h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f17980i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f17981j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f17982k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f17983l;

    public b(long j10, long j11, l lVar, int i10, long j12) {
        if (j10 < 0 || j11 <= j10) {
            throw new IllegalArgumentException();
        }
        this.f17975d = lVar;
        this.f17973b = j10;
        this.f17974c = j11;
        if (i10 != j11 - j10) {
            this.f17976e = 0;
        } else {
            this.f17977f = j12;
            this.f17976e = 3;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.h
    public final long a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) throws InterruptedException, IOException {
        g gVar;
        long jMin;
        int i10;
        int i11 = this.f17976e;
        long j10 = 0;
        if (i11 == 0) {
            long j11 = bVar.f17401c;
            this.f17978g = j11;
            this.f17976e = 1;
            long j12 = this.f17974c - 65307;
            if (j12 > j11) {
                return j12;
            }
        } else if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    return -1L;
                }
                throw new IllegalStateException();
            }
            long j13 = this.f17979h;
            if (j13 == 0) {
                i10 = 3;
            } else {
                long j14 = this.f17980i;
                long j15 = this.f17981j;
                if (j14 == j15) {
                    jMin = -(this.f17982k + 2);
                } else {
                    long j16 = bVar.f17401c;
                    if (a(bVar, j15)) {
                        this.f17972a.a(bVar, false);
                        bVar.f17403e = 0;
                        g gVar2 = this.f17972a;
                        long j17 = gVar2.f17999b;
                        long j18 = j13 - j17;
                        int i12 = gVar2.f18001d + gVar2.f18002e;
                        if (j18 < 0 || j18 > 72000) {
                            if (j18 < 0) {
                                this.f17981j = j16;
                                this.f17983l = j17;
                            } else {
                                long j19 = i12;
                                long j20 = bVar.f17401c + j19;
                                this.f17980i = j20;
                                this.f17982k = j17;
                                if ((this.f17981j - j20) + j19 < 100000) {
                                    bVar.a(i12);
                                    jMin = -(this.f17982k + 2);
                                }
                                j10 = 0;
                            }
                            long j21 = this.f17981j;
                            long j22 = this.f17980i;
                            long j23 = j21 - j22;
                            if (j23 < 100000) {
                                this.f17981j = j22;
                                jMin = j22;
                            } else {
                                jMin = Math.min(Math.max(((j23 * j18) / (this.f17983l - this.f17982k)) + (bVar.f17401c - ((long) (i12 * (j18 <= 0 ? 2 : 1)))), j22), this.f17981j - 1);
                            }
                            j10 = 0;
                        } else {
                            bVar.a(i12);
                            jMin = -(this.f17972a.f17999b + 2);
                        }
                    } else {
                        jMin = this.f17980i;
                        if (jMin == j16) {
                            throw new IOException("No ogg page can be found.");
                        }
                    }
                }
                if (jMin >= j10) {
                    return jMin;
                }
                long j24 = this.f17979h;
                long j25 = -(jMin + 2);
                this.f17972a.a(bVar, false);
                while (true) {
                    g gVar3 = this.f17972a;
                    if (gVar3.f17999b >= j24) {
                        break;
                    }
                    bVar.a(gVar3.f18001d + gVar3.f18002e);
                    g gVar4 = this.f17972a;
                    long j26 = gVar4.f17999b;
                    gVar4.a(bVar, false);
                    j25 = j26;
                }
                bVar.f17403e = 0;
                j10 = j25;
                i10 = 3;
            }
            this.f17976e = i10;
            return -(j10 + 2);
        }
        if (!a(bVar, this.f17974c)) {
            throw new EOFException();
        }
        g gVar5 = this.f17972a;
        gVar5.f17998a = 0;
        gVar5.f17999b = 0L;
        gVar5.f18000c = 0;
        gVar5.f18001d = 0;
        gVar5.f18002e = 0;
        while (true) {
            gVar = this.f17972a;
            if ((gVar.f17998a & 4) == 4 || bVar.f17401c >= this.f17974c) {
                break;
            }
            gVar.a(bVar, false);
            g gVar6 = this.f17972a;
            bVar.a(gVar6.f18001d + gVar6.f18002e);
        }
        this.f17977f = gVar.f17999b;
        this.f17976e = 3;
        return this.f17978g;
    }

    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, long j10) throws InterruptedException, EOFException {
        int i10;
        long jMin = Math.min(j10 + 3, this.f17974c);
        int i11 = 2048;
        byte[] bArr = new byte[2048];
        while (true) {
            long j11 = bVar.f17401c;
            int i12 = 0;
            if (((long) i11) + j11 > jMin && (i11 = (int) (jMin - j11)) < 4) {
                return false;
            }
            bVar.a(bArr, 0, i11, false);
            while (true) {
                i10 = i11 - 3;
                if (i12 < i10) {
                    if (bArr[i12] == 79 && bArr[i12 + 1] == 103 && bArr[i12 + 2] == 103 && bArr[i12 + 3] == 83) {
                        bVar.a(i12);
                        return true;
                    }
                    i12++;
                }
            }
            bVar.a(i10);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.h
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.q b() {
        if (this.f17977f != 0) {
            return new a(this);
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.h
    public final long c(long j10) {
        int i10 = this.f17976e;
        if (i10 != 3 && i10 != 2) {
            throw new IllegalArgumentException();
        }
        long j11 = j10 == 0 ? 0L : (((long) this.f17975d.f18018i) * j10) / 1000000;
        this.f17979h = j11;
        this.f17976e = 2;
        this.f17980i = this.f17973b;
        this.f17981j = this.f17974c;
        this.f17982k = 0L;
        this.f17983l = this.f17977f;
        return j11;
    }
}
