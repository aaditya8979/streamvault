package com.google.android.exoplayer2.extractor.flv;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.flv.TagPayloadReader;
import com.google.android.exoplayer2.m;
import i6.b0;
import s7.a0;
import s7.v;

/* JADX INFO: compiled from: VideoTagPayloadReader.java */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends TagPayloadReader {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f21563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f21564c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f21565d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f21566e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f21567f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f21568g;

    public b(b0 b0Var) {
        super(b0Var);
        this.f21563b = new a0(v.f79531a);
        this.f21564c = new a0(4);
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    public boolean b(a0 a0Var) throws TagPayloadReader.UnsupportedFormatException {
        int iD = a0Var.D();
        int i10 = (iD >> 4) & 15;
        int i11 = iD & 15;
        if (i11 == 7) {
            this.f21568g = i10;
            return i10 != 5;
        }
        throw new TagPayloadReader.UnsupportedFormatException("Video format not supported: " + i11);
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    public boolean c(a0 a0Var, long j10) throws ParserException {
        int iD = a0Var.D();
        long jO = j10 + (((long) a0Var.o()) * 1000);
        if (iD == 0 && !this.f21566e) {
            a0 a0Var2 = new a0(new byte[a0Var.a()]);
            a0Var.j(a0Var2.d(), 0, a0Var.a());
            t7.a aVarB = t7.a.b(a0Var2);
            this.f21565d = aVarB.f85080b;
            this.f21558a.b(new m.b().e0("video/avc").I(aVarB.f85084f).j0(aVarB.f85081c).Q(aVarB.f85082d).a0(aVarB.f85083e).T(aVarB.f85079a).E());
            this.f21566e = true;
            return false;
        }
        if (iD != 1 || !this.f21566e) {
            return false;
        }
        int i10 = this.f21568g == 1 ? 1 : 0;
        if (!this.f21567f && i10 == 0) {
            return false;
        }
        byte[] bArrD = this.f21564c.d();
        bArrD[0] = 0;
        bArrD[1] = 0;
        bArrD[2] = 0;
        int i11 = 4 - this.f21565d;
        int i12 = 0;
        while (a0Var.a() > 0) {
            a0Var.j(this.f21564c.d(), i11, this.f21565d);
            this.f21564c.P(0);
            int iH = this.f21564c.H();
            this.f21563b.P(0);
            this.f21558a.e(this.f21563b, 4);
            this.f21558a.e(a0Var, iH);
            i12 = i12 + 4 + iH;
        }
        this.f21558a.c(jO, i10, i12, 0, null);
        this.f21567f = true;
        return true;
    }
}
