package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.i;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.j;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.m;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.r;
import com.fyber.inneractive.sdk.player.exoplayer2.util.n;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import java.io.EOFException;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements i {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f17728m = z.a("Xing");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f17729n = z.a("Info");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f17730o = z.a("VBRI");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f17731a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public j f17735e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public r f17736f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f17737g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.metadata.b f17738h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public b f17739i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f17741k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f17742l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f17732b = new n(10);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.n f17733c = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.n();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m f17734d = new m();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f17740j = -9223372036854775807L;

    public c(long j10) {
        this.f17731a = j10;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006a  */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r40, com.fyber.inneractive.sdk.player.exoplayer2.extractor.o r41) throws java.lang.InterruptedException, com.fyber.inneractive.sdk.player.exoplayer2.r, java.io.EOFException {
        /*
            Method dump skipped, instruction units count: 773
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.c.a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b, com.fyber.inneractive.sdk.player.exoplayer2.extractor.o):int");
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(long j10, long j11) {
        this.f17737g = 0;
        this.f17740j = -9223372036854775807L;
        this.f17741k = 0L;
        this.f17742l = 0;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(j jVar) {
        this.f17735e = jVar;
        this.f17736f = jVar.a(0, 1);
        this.f17735e.b();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) {
        return a(bVar, true);
    }

    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, boolean z10) throws InterruptedException, com.fyber.inneractive.sdk.player.exoplayer2.r, EOFException {
        int i10;
        int i11;
        int iA;
        int i12 = z10 ? 16384 : 131072;
        bVar.f17403e = 0;
        if (bVar.f17401c == 0) {
            int i13 = 0;
            while (true) {
                bVar.a(this.f17732b.f18794a, 0, 10, false);
                this.f17732b.e(0);
                if (this.f17732b.l() != com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.n.f18439b) {
                    break;
                }
                n nVar = this.f17732b;
                nVar.e(nVar.f18795b + 3);
                int i14 = this.f17732b.i();
                int i15 = i14 + 10;
                if (this.f17738h == null) {
                    byte[] bArr = new byte[i15];
                    System.arraycopy(this.f17732b.f18794a, 0, bArr, 0, 10);
                    bVar.a(bArr, 10, i14, false);
                    com.fyber.inneractive.sdk.player.exoplayer2.metadata.b bVarA = new com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.n(null).a(i15, bArr);
                    this.f17738h = bVarA;
                    if (bVarA != null) {
                        this.f17734d.a(bVarA);
                    }
                } else {
                    bVar.a(i14, false);
                }
                i13 += i15;
            }
            bVar.f17403e = 0;
            bVar.a(i13, false);
            i10 = (int) (bVar.f17401c + ((long) bVar.f17403e));
            if (!z10) {
                bVar.a(i10);
            }
            i11 = 0;
        } else {
            i10 = 0;
            i11 = 0;
        }
        int i16 = i11;
        int i17 = i16;
        while (true) {
            if (!bVar.a(this.f17732b.f18794a, 0, 4, i11 > 0)) {
                break;
            }
            this.f17732b.e(0);
            int iB = this.f17732b.b();
            if ((i16 == 0 || ((-128000) & iB) == (((long) i16) & (-128000))) && (iA = com.fyber.inneractive.sdk.player.exoplayer2.extractor.n.a(iB)) != -1) {
                i11++;
                if (i11 != 1) {
                    if (i11 == 4) {
                        break;
                    }
                } else {
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.n.a(iB, this.f17733c);
                    i16 = iB;
                }
                bVar.a(iA - 4, false);
            } else {
                int i18 = i17 + 1;
                if (i17 == i12) {
                    if (z10) {
                        return false;
                    }
                    throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Searched too many bytes.");
                }
                if (z10) {
                    bVar.f17403e = 0;
                    bVar.a(i10 + i18, false);
                } else {
                    bVar.a(1);
                }
                i16 = 0;
                i17 = i18;
                i11 = 0;
            }
        }
        if (z10) {
            bVar.a(i10 + i17);
        } else {
            bVar.f17403e = 0;
        }
        this.f17737g = i16;
        return true;
    }

    public final a b(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) {
        bVar.a(this.f17732b.f18794a, 0, 4, false);
        this.f17732b.e(0);
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.n.a(this.f17732b.b(), this.f17733c);
        return new a(this.f17733c.f17968f, bVar.f17401c, bVar.f17400b);
    }
}
