package com.google.android.exoplayer.extractor.flv;

import a6.q;
import a6.t;
import com.google.android.exoplayer.Format;
import com.google.android.exoplayer.ParserException;
import com.google.android.exoplayer.extractor.flv.TagPayloadReader;
import k4.u;

/* JADX INFO: compiled from: VideoTagPayloadReader.java */
/* JADX INFO: loaded from: classes8.dex */
public final class b extends TagPayloadReader {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f20141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f20142c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f20143d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f20144e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f20145f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f20146g;

    public b(u uVar) {
        super(uVar);
        this.f20141b = new t(q.f3596a);
        this.f20142c = new t(4);
    }

    @Override // com.google.android.exoplayer.extractor.flv.TagPayloadReader
    public boolean b(t tVar) throws TagPayloadReader.UnsupportedFormatException {
        int iY = tVar.y();
        int i10 = (iY >> 4) & 15;
        int i11 = iY & 15;
        if (i11 == 7) {
            this.f20146g = i10;
            return i10 != 5;
        }
        throw new TagPayloadReader.UnsupportedFormatException("Video format not supported: " + i11);
    }

    @Override // com.google.android.exoplayer.extractor.flv.TagPayloadReader
    public boolean c(t tVar, long j10) throws ParserException {
        int iY = tVar.y();
        long jK = j10 + (((long) tVar.k()) * 1000);
        if (iY == 0 && !this.f20144e) {
            t tVar2 = new t(new byte[tVar.a()]);
            tVar.h(tVar2.f3620a, 0, tVar.a());
            b6.a aVarB = b6.a.b(tVar2);
            this.f20143d = aVarB.f5405b;
            this.f20136a.d(Format.C(null, "video/avc", null, -1, -1, aVarB.f5406c, aVarB.f5407d, -1.0f, aVarB.f5404a, -1, aVarB.f5408e, null));
            this.f20144e = true;
            return false;
        }
        if (iY != 1 || !this.f20144e) {
            return false;
        }
        int i10 = this.f20146g == 1 ? 1 : 0;
        if (!this.f20145f && i10 == 0) {
            return false;
        }
        byte[] bArr = this.f20142c.f3620a;
        bArr[0] = 0;
        bArr[1] = 0;
        bArr[2] = 0;
        int i11 = 4 - this.f20143d;
        int i12 = 0;
        while (tVar.a() > 0) {
            tVar.h(this.f20142c.f3620a, i11, this.f20143d);
            this.f20142c.L(0);
            int iC = this.f20142c.C();
            this.f20141b.L(0);
            this.f20136a.a(this.f20141b, 4);
            this.f20136a.a(tVar, iC);
            i12 = i12 + 4 + iC;
        }
        this.f20136a.c(jK, i10, i12, 0, null);
        this.f20145f = true;
        return true;
    }
}
