package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.q;
import com.fyber.inneractive.sdk.player.exoplayer2.util.v;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class h extends com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.b {
    public static final AtomicInteger G = new AtomicInteger();
    public int A;
    public int B;
    public boolean C;
    public n D;
    public volatile boolean E;
    public volatile boolean F;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f17497j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f17498k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a f17499l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.h f17500m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.k f17501n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f17502o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f17503p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final v f17504q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f17505r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.i f17506s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f17507t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f17508u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final List f17509v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f17510w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.n f17511x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f17512y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.i f17513z;

    /* JADX WARN: Illegal instructions before constructor call */
    public h(com.fyber.inneractive.sdk.player.exoplayer2.upstream.h hVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar2, com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a aVar, List list, int i10, Object obj, long j10, long j11, int i11, int i12, boolean z10, v vVar, h hVar2, byte[] bArr, byte[] bArr2) {
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.h aVar2 = (bArr == null || bArr2 == null) ? hVar : new a(hVar, bArr, bArr2);
        super(i10, i11, j10, j11, aVar.f17573b, aVar2, kVar, obj);
        this.f17498k = i12;
        this.f17501n = kVar2;
        this.f17499l = aVar;
        this.f17509v = list;
        this.f17503p = z10;
        this.f17504q = vVar;
        this.f17502o = aVar2 instanceof a;
        String lastPathSegment = kVar.f18696a.getLastPathSegment();
        this.f17505r = lastPathSegment;
        boolean z11 = lastPathSegment.endsWith(".aac") || lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3") || lastPathSegment.endsWith(".mp3");
        this.f17510w = z11;
        if (hVar2 != null) {
            this.f17511x = hVar2.f17511x;
            this.f17512y = hVar2.f17512y;
            this.f17506s = hVar2.f17513z;
            boolean z12 = hVar2.f17499l != aVar;
            this.f17507t = z12;
            this.f17508u = hVar2.f17498k != i12 || z12;
        } else {
            this.f17511x = z11 ? new com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.n() : null;
            this.f17512y = z11 ? new com.fyber.inneractive.sdk.player.exoplayer2.util.n(10) : null;
            this.f17506s = null;
            this.f17507t = false;
            this.f17508u = true;
        }
        this.f17500m = hVar;
        this.f17497j = G.getAndIncrement();
    }

    public final long a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) {
        com.fyber.inneractive.sdk.player.exoplayer2.metadata.b bVarA;
        bVar.f17403e = 0;
        if (!bVar.a(this.f17512y.f18794a, 0, 10, true)) {
            return -9223372036854775807L;
        }
        this.f17512y.c(10);
        if (this.f17512y.l() != com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.n.f18439b) {
            return -9223372036854775807L;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = this.f17512y;
        nVar.e(nVar.f18795b + 3);
        int i10 = this.f17512y.i();
        int i11 = i10 + 10;
        if (i11 > this.f17512y.a()) {
            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar2 = this.f17512y;
            byte[] bArr = nVar2.f18794a;
            nVar2.c(i11);
            System.arraycopy(bArr, 0, this.f17512y.f18794a, 0, 10);
        }
        if (!bVar.a(this.f17512y.f18794a, 10, i10, true) || (bVarA = this.f17511x.a(i10, this.f17512y.f18794a)) == null) {
            return -9223372036854775807L;
        }
        int length = bVarA.f18412a.length;
        for (int i12 = 0; i12 < length; i12++) {
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.o oVar = bVarA.f18412a[i12];
            if (oVar instanceof q) {
                q qVar = (q) oVar;
                if (io.bidmachine.media3.exoplayer.hls.a.PRIV_TIMESTAMP_FRAME_OWNER.equals(qVar.f18442b)) {
                    System.arraycopy(qVar.f18443c, 0, this.f17512y.f18794a, 0, 8);
                    this.f17512y.c(8);
                    return this.f17512y.g();
                }
            }
        }
        return -9223372036854775807L;
    }

    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.i a(long j10) {
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.i aVar;
        if (this.f17505r.endsWith(".aac")) {
            aVar = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.c(j10);
        } else if (this.f17505r.endsWith(".ac3") || this.f17505r.endsWith(".ec3")) {
            aVar = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.a(j10);
        } else {
            if (!this.f17505r.endsWith(".mp3")) {
                throw new IllegalArgumentException("Unkown extension for audio file: " + this.f17505r);
            }
            aVar = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.c(j10);
        }
        aVar.a(this.D);
        return aVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.z
    public final boolean a() {
        return this.E;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.z
    public final void b() {
        this.E = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a
    public final long c() {
        return this.B;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01f3 A[Catch: all -> 0x023c, TryCatch #2 {all -> 0x023c, blocks: (B:126:0x01e1, B:128:0x01f3, B:130:0x01fb, B:132:0x0204, B:131:0x0202, B:134:0x020c, B:143:0x022a, B:141:0x021f, B:142:0x0229, B:136:0x0213, B:138:0x0217), top: B:152:0x01e1, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x020c A[Catch: all -> 0x023c, TRY_LEAVE, TryCatch #2 {all -> 0x023c, blocks: (B:126:0x01e1, B:128:0x01f3, B:130:0x01fb, B:132:0x0204, B:131:0x0202, B:134:0x020c, B:143:0x022a, B:141:0x021f, B:142:0x0229, B:136:0x0213, B:138:0x0217), top: B:152:0x01e1, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0213 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f3  */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void load() {
        /*
            Method dump skipped, instruction units count: 580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.h.load():void");
    }
}
