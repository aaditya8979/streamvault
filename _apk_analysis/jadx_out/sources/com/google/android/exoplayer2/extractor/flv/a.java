package com.google.android.exoplayer2.extractor.flv;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.flv.TagPayloadReader;
import com.google.android.exoplayer2.m;
import f6.a;
import i6.b0;
import java.util.Collections;
import s7.a0;

/* JADX INFO: compiled from: AudioTagPayloadReader.java */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends TagPayloadReader {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f21559e = {5512, 11025, 22050, 44100};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f21560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f21561c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f21562d;

    public a(b0 b0Var) {
        super(b0Var);
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    public boolean b(a0 a0Var) throws TagPayloadReader.UnsupportedFormatException {
        if (this.f21560b) {
            a0Var.Q(1);
        } else {
            int iD = a0Var.D();
            int i10 = (iD >> 4) & 15;
            this.f21562d = i10;
            if (i10 == 2) {
                this.f21558a.b(new m.b().e0("audio/mpeg").H(1).f0(f21559e[(iD >> 2) & 3]).E());
                this.f21561c = true;
            } else if (i10 == 7 || i10 == 8) {
                this.f21558a.b(new m.b().e0(i10 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw").H(1).f0(8000).E());
                this.f21561c = true;
            } else if (i10 != 10) {
                throw new TagPayloadReader.UnsupportedFormatException("Audio format not supported: " + this.f21562d);
            }
            this.f21560b = true;
        }
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    public boolean c(a0 a0Var, long j10) throws ParserException {
        if (this.f21562d == 2) {
            int iA = a0Var.a();
            this.f21558a.e(a0Var, iA);
            this.f21558a.c(j10, 1, iA, 0, null);
            return true;
        }
        int iD = a0Var.D();
        if (iD != 0 || this.f21561c) {
            if (this.f21562d == 10 && iD != 1) {
                return false;
            }
            int iA2 = a0Var.a();
            this.f21558a.e(a0Var, iA2);
            this.f21558a.c(j10, 1, iA2, 0, null);
            return true;
        }
        int iA3 = a0Var.a();
        byte[] bArr = new byte[iA3];
        a0Var.j(bArr, 0, iA3);
        a.b bVarE = f6.a.e(bArr);
        this.f21558a.b(new m.b().e0("audio/mp4a-latm").I(bVarE.f61474c).H(bVarE.f61473b).f0(bVarE.f61472a).T(Collections.singletonList(bArr)).E());
        this.f21561c = true;
        return false;
    }
}
