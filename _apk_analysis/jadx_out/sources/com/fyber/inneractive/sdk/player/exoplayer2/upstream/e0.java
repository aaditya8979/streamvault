package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.net.Uri;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class e0 implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f18680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.c f18681b;

    public e0(h hVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.c cVar) {
        hVar.getClass();
        this.f18680a = hVar;
        cVar.getClass();
        this.f18681b = cVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final long a(k kVar) throws com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.b {
        k kVar2 = kVar;
        long jA = this.f18680a.a(kVar2);
        if (kVar2.f18699d == -1 && jA != -1) {
            kVar2 = new k(kVar2.f18696a, kVar2.f18697b, kVar2.f18698c, jA, kVar2.f18700e, kVar2.f18701f);
        }
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.c cVar = this.f18681b;
        cVar.getClass();
        if (kVar2.f18699d != -1 || (kVar2.f18701f & 2) == 2) {
            cVar.f18609d = kVar2;
            cVar.f18614i = 0L;
            try {
                cVar.b();
            } catch (IOException e10) {
                throw new com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.b(e10);
            }
        } else {
            cVar.f18609d = null;
        }
        return jA;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final Uri a() {
        return this.f18680a.a();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final void close() throws com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.b {
        try {
            this.f18680a.close();
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.c cVar = this.f18681b;
            if (cVar.f18609d == null) {
                return;
            }
            try {
                cVar.a();
            } catch (IOException e10) {
                throw new com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.b(e10);
            }
        } catch (Throwable th2) {
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.c cVar2 = this.f18681b;
            if (cVar2.f18609d != null) {
                try {
                    cVar2.a();
                } catch (IOException e11) {
                    throw new com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.b(e11);
                }
            }
            throw th2;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final int read(byte[] bArr, int i10, int i11) throws com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.b {
        int i12 = this.f18680a.read(bArr, i10, i11);
        if (i12 > 0) {
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.c cVar = this.f18681b;
            if (cVar.f18609d != null) {
                int i13 = 0;
                while (i13 < i12) {
                    try {
                        if (cVar.f18613h == cVar.f18607b) {
                            cVar.a();
                            cVar.b();
                        }
                        int iMin = (int) Math.min(i12 - i13, cVar.f18607b - cVar.f18613h);
                        cVar.f18611f.write(bArr, i10 + i13, iMin);
                        i13 += iMin;
                        long j10 = iMin;
                        cVar.f18613h += j10;
                        cVar.f18614i += j10;
                    } catch (IOException e10) {
                        throw new com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.b(e10);
                    }
                }
            }
        }
        return i12;
    }
}
