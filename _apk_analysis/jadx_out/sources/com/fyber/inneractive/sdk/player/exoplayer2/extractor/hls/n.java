package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import android.os.Handler;
import android.text.TextUtils;
import android.util.SparseArray;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.q;
import com.fyber.inneractive.sdk.player.exoplayer2.source.w;
import com.fyber.inneractive.sdk.player.exoplayer2.source.y;
import com.fyber.inneractive.sdk.player.exoplayer2.source.z;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.b0;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.x;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes2.dex */
public final class n implements x, w, com.fyber.inneractive.sdk.player.exoplayer2.extractor.j, com.fyber.inneractive.sdk.player.exoplayer2.extractor.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f17539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f17540c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.b f17541d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.o f17542e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f17543f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.source.f f17545h;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f17551n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f17552o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f17553p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.o f17554q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f17555r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f17556s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public z f17557t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f17558u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean[] f17559v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f17560w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f17561x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f17562y;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b0 f17544g = new b0("Loader:HlsSampleStreamWrapper");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final d f17546i = new d();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final SparseArray f17547j = new SparseArray();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LinkedList f17548k = new LinkedList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final m f17549l = new m(this);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Handler f17550m = new Handler();

    public n(int i10, i iVar, f fVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.b bVar, long j10, com.fyber.inneractive.sdk.player.exoplayer2.o oVar, int i11, com.fyber.inneractive.sdk.player.exoplayer2.source.f fVar2) {
        this.f17538a = i10;
        this.f17539b = iVar;
        this.f17540c = fVar;
        this.f17541d = bVar;
        this.f17542e = oVar;
        this.f17543f = i11;
        this.f17545h = fVar2;
        this.f17560w = j10;
        this.f17561x = j10;
    }

    public static com.fyber.inneractive.sdk.player.exoplayer2.o a(com.fyber.inneractive.sdk.player.exoplayer2.o oVar, com.fyber.inneractive.sdk.player.exoplayer2.o oVar2) {
        if (oVar == null) {
            return oVar2;
        }
        String strA = null;
        int iC = com.fyber.inneractive.sdk.player.exoplayer2.util.i.c(oVar2.f18453f);
        if (iC == 1) {
            strA = a(oVar.f18450c, 1);
        } else if (iC == 2) {
            strA = a(oVar.f18450c, 2);
        }
        String str = strA;
        return new com.fyber.inneractive.sdk.player.exoplayer2.o(oVar.f18448a, oVar2.f18452e, oVar2.f18453f, str, oVar.f18449b, oVar2.f18454g, oVar.f18457j, oVar.f18458k, oVar2.f18459l, oVar2.f18460m, oVar2.f18461n, oVar2.f18463p, oVar2.f18462o, oVar2.f18464q, oVar2.f18465r, oVar2.f18466s, oVar2.f18467t, oVar2.f18468u, oVar2.f18469v, oVar.f18471x, oVar.f18472y, oVar2.f18473z, oVar2.f18470w, oVar2.f18455h, oVar2.f18456i, oVar2.f18451d);
    }

    public static String a(String str, int i10) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split("(\\s*,\\s*)|(\\s*$)");
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : strArrSplit) {
            if (i10 == com.fyber.inneractive.sdk.player.exoplayer2.util.i.c(com.fyber.inneractive.sdk.player.exoplayer2.util.i.a(str2))) {
                if (sb2.length() > 0) {
                    sb2.append(StringUtils.COMMA);
                }
                sb2.append(str2);
            }
        }
        if (sb2.length() > 0) {
            return sb2.toString();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x011a  */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.z r25, long r26, long r28, java.io.IOException r30) {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.n.a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.z, long, long, java.io.IOException):int");
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.j
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a(int i10, int i11) {
        if (this.f17547j.indexOfKey(i10) >= 0) {
            return (com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.f17547j.get(i10);
        }
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVar = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.g(this.f17541d);
        gVar.f17466n = this;
        gVar.f17455c.f17427r = this.f17555r;
        this.f17547j.put(i10, gVar);
        return gVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.j
    public final void a(q qVar) {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.z zVar, long j10, long j11) {
        com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a aVar = (com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a) zVar;
        f fVar = this.f17540c;
        fVar.getClass();
        if (aVar instanceof c) {
            c cVar = (c) aVar;
            fVar.f17489i = cVar.f17472i;
            fVar.a(cVar.f18491a.f18696a, cVar.f17475l, cVar.f17476m);
        }
        com.fyber.inneractive.sdk.player.exoplayer2.source.f fVar2 = this.f17545h;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar = aVar.f18491a;
        int i10 = aVar.f18492b;
        int i11 = this.f17538a;
        com.fyber.inneractive.sdk.player.exoplayer2.o oVar = aVar.f18493c;
        int i12 = aVar.f18494d;
        Object obj = aVar.f18495e;
        long j12 = aVar.f18496f;
        long j13 = aVar.f18497g;
        long jC = aVar.c();
        if (fVar2.f18509b != null) {
            fVar2.f18508a.post(new com.fyber.inneractive.sdk.player.exoplayer2.source.b(fVar2, kVar, i10, i11, oVar, i12, obj, j12, j13, j10, j11, jC));
        }
        if (!this.f17552o) {
            b(this.f17560w);
            return;
        }
        i iVar = this.f17539b;
        iVar.getClass();
        if (iVar.f17526m == null) {
            return;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.l lVar = (com.fyber.inneractive.sdk.player.exoplayer2.l) iVar.f17523j;
        lVar.getClass();
        lVar.f18356f.obtainMessage(9, iVar).sendToTarget();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.z zVar, long j10, long j11, boolean z10) {
        com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a aVar = (com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a) zVar;
        com.fyber.inneractive.sdk.player.exoplayer2.source.f fVar = this.f17545h;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar = aVar.f18491a;
        int i10 = aVar.f18492b;
        int i11 = this.f17538a;
        com.fyber.inneractive.sdk.player.exoplayer2.o oVar = aVar.f18493c;
        int i12 = aVar.f18494d;
        Object obj = aVar.f18495e;
        long j12 = aVar.f18496f;
        long j13 = aVar.f18497g;
        long jC = aVar.c();
        if (fVar.f18509b != null) {
            fVar.f18508a.post(new com.fyber.inneractive.sdk.player.exoplayer2.source.c(fVar, kVar, i10, i11, oVar, i12, obj, j12, j13, j10, j11, jC));
        }
        if (z10) {
            return;
        }
        int size = this.f17547j.size();
        for (int i13 = 0; i13 < size; i13++) {
            ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.f17547j.valueAt(i13)).a(this.f17559v[i13]);
        }
        i iVar = this.f17539b;
        iVar.getClass();
        if (iVar.f17526m == null) {
            return;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.l lVar = (com.fyber.inneractive.sdk.player.exoplayer2.l) iVar.f17523j;
        lVar.getClass();
        lVar.f18356f.obtainMessage(9, iVar).sendToTarget();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.j
    public final void b() {
        this.f17551n = true;
        this.f17550m.post(this.f17549l);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x013d  */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(long r40) {
        /*
            Method dump skipped, instruction units count: 837
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.n.b(long):boolean");
    }

    public final void c(long j10) {
        this.f17560w = j10;
        this.f17561x = j10;
        this.f17562y = false;
        this.f17548k.clear();
        if (this.f17544g.a()) {
            this.f17544g.f18604b.a(false);
            return;
        }
        int size = this.f17547j.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.f17547j.valueAt(i10)).a(this.f17559v[i10]);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public final void e() {
        this.f17550m.post(this.f17549l);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.w
    public final long f() {
        long j10 = this.f17561x;
        if (j10 != -9223372036854775807L) {
            return j10;
        }
        if (this.f17562y) {
            return Long.MIN_VALUE;
        }
        return ((h) this.f17548k.getLast()).f18497g;
    }

    public final void h() {
        if (this.f17556s || this.f17552o || !this.f17551n) {
            return;
        }
        int size = this.f17547j.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.f17547j.valueAt(i10)).e() == null) {
                return;
            }
        }
        int size2 = this.f17547j.size();
        int i11 = 0;
        char c10 = 0;
        int i12 = -1;
        while (true) {
            if (i11 >= size2) {
                break;
            }
            String str = ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.f17547j.valueAt(i11)).e().f18453f;
            char c11 = "video".equals(com.fyber.inneractive.sdk.player.exoplayer2.util.i.b(str)) ? (char) 3 : "audio".equals(com.fyber.inneractive.sdk.player.exoplayer2.util.i.b(str)) ? (char) 2 : "text".equals(com.fyber.inneractive.sdk.player.exoplayer2.util.i.b(str)) ? (char) 1 : (char) 0;
            if (c11 > c10) {
                i12 = i11;
                c10 = c11;
            } else if (c11 == c10 && i12 != -1) {
                i12 = -1;
            }
            i11++;
        }
        y yVar = this.f17540c.f17486f;
        int i13 = yVar.f18573a;
        this.f17558u = -1;
        this.f17559v = new boolean[size2];
        y[] yVarArr = new y[size2];
        for (int i14 = 0; i14 < size2; i14++) {
            com.fyber.inneractive.sdk.player.exoplayer2.o oVarE = ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.f17547j.valueAt(i14)).e();
            if (i14 == i12) {
                com.fyber.inneractive.sdk.player.exoplayer2.o[] oVarArr = new com.fyber.inneractive.sdk.player.exoplayer2.o[i13];
                for (int i15 = 0; i15 < i13; i15++) {
                    oVarArr[i15] = a(yVar.f18574b[i15], oVarE);
                }
                yVarArr[i14] = new y(oVarArr);
                this.f17558u = i14;
            } else {
                yVarArr[i14] = new y(a((c10 == 3 && "audio".equals(com.fyber.inneractive.sdk.player.exoplayer2.util.i.b(oVarE.f18453f))) ? this.f17542e : null, oVarE));
            }
        }
        this.f17557t = new z(yVarArr);
        this.f17552o = true;
        i iVar = this.f17539b;
        int i16 = iVar.f17524k - 1;
        iVar.f17524k = i16;
        if (i16 > 0) {
            return;
        }
        int i17 = 0;
        for (n nVar : iVar.f17527n) {
            i17 += nVar.f17557t.f18577a;
        }
        y[] yVarArr2 = new y[i17];
        int i18 = 0;
        for (n nVar2 : iVar.f17527n) {
            int i19 = nVar2.f17557t.f18577a;
            int i20 = 0;
            while (i20 < i19) {
                yVarArr2[i18] = nVar2.f17557t.f18578b[i20];
                i20++;
                i18++;
            }
        }
        iVar.f17526m = new z(yVarArr2);
        ((com.fyber.inneractive.sdk.player.exoplayer2.l) iVar.f17523j).f18356f.obtainMessage(8, iVar).sendToTarget();
    }
}
