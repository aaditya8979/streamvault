package com.fyber.inneractive.sdk.player.exoplayer2.extractor.wav;

import android.util.Log;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.i;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.j;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.o;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.q;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.r;
import com.fyber.inneractive.sdk.player.exoplayer2.util.n;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import java.io.EOFException;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements i, q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j f18287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r f18288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f18289c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f18290d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18291e;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, o oVar) throws InterruptedException, com.fyber.inneractive.sdk.player.exoplayer2.r, EOFException {
        if (this.f18289c == null) {
            b bVarA = d.a(bVar);
            this.f18289c = bVarA;
            if (bVarA == null) {
                throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Unsupported or unrecognized wav header.");
            }
            int i10 = bVarA.f18293b;
            int i11 = bVarA.f18296e * i10;
            int i12 = bVarA.f18292a;
            this.f18288b.a(com.fyber.inneractive.sdk.player.exoplayer2.o.a(null, "audio/raw", i11 * i12, 32768, i12, i10, bVarA.f18297f, -1, -1, null, null, 0, null, null));
            this.f18290d = this.f18289c.f18295d;
        }
        b bVar2 = this.f18289c;
        if (bVar2.f18298g == 0 || bVar2.f18299h == 0) {
            bVar.f17403e = 0;
            n nVar = new n(8);
            c cVarA = c.a(bVar, nVar);
            while (cVarA.f18300a != z.a("data")) {
                Log.w("WavHeaderReader", "Ignoring unknown WAV chunk: " + cVarA.f18300a);
                long j10 = cVarA.f18301b + 8;
                if (cVarA.f18300a == z.a("RIFF")) {
                    j10 = 12;
                }
                if (j10 > 2147483647L) {
                    throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Chunk is too large (~2GB+) to skip; id: " + cVarA.f18300a);
                }
                bVar.a((int) j10);
                cVarA = c.a(bVar, nVar);
            }
            bVar.a(8);
            long j11 = bVar.f17401c;
            long j12 = cVarA.f18301b;
            bVar2.f18298g = j11;
            bVar2.f18299h = j12;
            this.f18287a.a(this);
        }
        int iA = this.f18288b.a(bVar, 32768 - this.f18291e, true);
        if (iA != -1) {
            this.f18291e += iA;
        }
        int i13 = this.f18291e;
        int i14 = this.f18290d;
        int i15 = i13 / i14;
        if (i15 > 0) {
            long j13 = ((bVar.f17401c - ((long) i13)) * 1000000) / ((long) this.f18289c.f18294c);
            int i16 = i15 * i14;
            int i17 = i13 - i16;
            this.f18291e = i17;
            this.f18288b.a(j13, 1, i16, i17, null);
        }
        return iA == -1 ? -1 : 0;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long a(long j10) {
        b bVar = this.f18289c;
        long j11 = (j10 * ((long) bVar.f18294c)) / 1000000;
        long j12 = bVar.f18295d;
        return Math.min((j11 / j12) * j12, bVar.f18299h - j12) + bVar.f18298g;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(long j10, long j11) {
        this.f18291e = 0;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(j jVar) {
        this.f18287a = jVar;
        this.f18288b = jVar.a(0, 1);
        this.f18289c = null;
        jVar.b();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final boolean a() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) {
        return d.a(bVar) != null;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long c() {
        b bVar = this.f18289c;
        return ((bVar.f18299h / ((long) bVar.f18295d)) * 1000000) / ((long) bVar.f18293b);
    }
}
