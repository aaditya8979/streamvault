package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public byte[] f17472i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f17473j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public volatile boolean f17474k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f17475l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public byte[] f17476m;

    public c(com.fyber.inneractive.sdk.player.exoplayer2.upstream.h hVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar, com.fyber.inneractive.sdk.player.exoplayer2.o oVar, int i10, Object obj, byte[] bArr, String str) {
        super(3, i10, -9223372036854775807L, -9223372036854775807L, oVar, hVar, kVar, obj);
        this.f17472i = bArr;
        this.f17475l = str;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.z
    public final boolean a() {
        return this.f17474k;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.z
    public final void b() {
        this.f17474k = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a
    public final long c() {
        return this.f17473j;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.z
    public final void load() {
        try {
            this.f18498h.a(this.f18491a);
            int i10 = 0;
            this.f17473j = 0;
            while (i10 != -1 && !this.f17474k) {
                byte[] bArr = this.f17472i;
                if (bArr == null) {
                    this.f17472i = new byte[16384];
                } else if (bArr.length < this.f17473j + 16384) {
                    this.f17472i = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i10 = this.f18498h.read(this.f17472i, this.f17473j, 16384);
                if (i10 != -1) {
                    this.f17473j += i10;
                }
            }
            if (!this.f17474k) {
                this.f17476m = Arrays.copyOf(this.f17472i, this.f17473j);
            }
        } finally {
            z.a(this.f18498h);
        }
    }
}
