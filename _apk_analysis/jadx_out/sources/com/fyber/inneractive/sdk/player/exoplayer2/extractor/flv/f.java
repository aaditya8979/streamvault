package com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.r;
import com.fyber.inneractive.sdk.player.exoplayer2.m;
import com.fyber.inneractive.sdk.player.exoplayer2.o;
import com.fyber.inneractive.sdk.player.exoplayer2.util.l;
import com.fyber.inneractive.sdk.player.exoplayer2.util.n;

/* JADX INFO: loaded from: classes10.dex */
public final class f extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f17448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f17449c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f17450d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f17451e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f17452f;

    public f(r rVar) {
        super(rVar);
        this.f17448b = new n(l.f18786a);
        this.f17449c = new n(4);
    }

    public final void a(n nVar, long j10) throws com.fyber.inneractive.sdk.player.exoplayer2.r {
        int iJ = nVar.j();
        long jL = (((long) nVar.l()) * 1000) + j10;
        if (iJ == 0 && !this.f17451e) {
            byte[] bArr = new byte[nVar.f18796c - nVar.f18795b];
            n nVar2 = new n(bArr);
            nVar.a(bArr, 0, nVar.f18796c - nVar.f18795b);
            com.fyber.inneractive.sdk.player.exoplayer2.video.a aVarA = com.fyber.inneractive.sdk.player.exoplayer2.video.a.a(nVar2);
            this.f17450d = aVarA.f18853b;
            this.f17447a.a(o.a(null, "video/avc", -1, aVarA.f18854c, aVarA.f18855d, aVarA.f18852a, -1, aVarA.f18856e, null, -1, null, null));
            this.f17451e = true;
            return;
        }
        if (iJ == 1 && this.f17451e) {
            byte[] bArr2 = this.f17449c.f18794a;
            bArr2[0] = 0;
            bArr2[1] = 0;
            bArr2[2] = 0;
            int i10 = 4 - this.f17450d;
            int i11 = 0;
            while (nVar.f18796c - nVar.f18795b > 0) {
                nVar.a(this.f17449c.f18794a, i10, this.f17450d);
                this.f17449c.e(0);
                int iM = this.f17449c.m();
                this.f17448b.e(0);
                this.f17447a.a(4, this.f17448b);
                this.f17447a.a(iM, nVar);
                i11 = i11 + 4 + iM;
            }
            this.f17447a.a(jL, this.f17452f == 1 ? 1 : 0, i11, 0, null);
        }
    }

    public final boolean a(n nVar) throws d {
        int iJ = nVar.j();
        int i10 = (iJ >> 4) & 15;
        int i11 = iJ & 15;
        if (i11 != 7) {
            throw new d(m.a("Video format not supported: ", i11));
        }
        this.f17452f = i10;
        return i10 != 5;
    }
}
