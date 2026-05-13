package com.google.android.exoplayer.extractor.flv;

import a6.d;
import a6.t;
import android.util.Pair;
import com.google.android.exoplayer.Format;
import com.google.android.exoplayer.ParserException;
import com.google.android.exoplayer.extractor.flv.TagPayloadReader;
import java.util.Collections;
import k4.u;

/* JADX INFO: compiled from: AudioTagPayloadReader.java */
/* JADX INFO: loaded from: classes8.dex */
public final class a extends TagPayloadReader {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f20137e = {5512, 11025, 22050, 44100};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f20138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f20139c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f20140d;

    public a(u uVar) {
        super(uVar);
    }

    @Override // com.google.android.exoplayer.extractor.flv.TagPayloadReader
    public boolean b(t tVar) throws TagPayloadReader.UnsupportedFormatException {
        if (this.f20138b) {
            tVar.M(1);
        } else {
            int iY = tVar.y();
            int i10 = (iY >> 4) & 15;
            this.f20140d = i10;
            if (i10 == 2) {
                this.f20136a.d(Format.q(null, "audio/mpeg", null, -1, -1, 1, f20137e[(iY >> 2) & 3], null, null, 0, null));
                this.f20139c = true;
            } else if (i10 == 7 || i10 == 8) {
                this.f20136a.d(Format.p(null, i10 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw", null, -1, -1, 1, 8000, -1, null, null, 0, null));
                this.f20139c = true;
            } else if (i10 != 10) {
                throw new TagPayloadReader.UnsupportedFormatException("Audio format not supported: " + this.f20140d);
            }
            this.f20138b = true;
        }
        return true;
    }

    @Override // com.google.android.exoplayer.extractor.flv.TagPayloadReader
    public boolean c(t tVar, long j10) throws ParserException {
        if (this.f20140d == 2) {
            int iA = tVar.a();
            this.f20136a.a(tVar, iA);
            this.f20136a.c(j10, 1, iA, 0, null);
            return true;
        }
        int iY = tVar.y();
        if (iY != 0 || this.f20139c) {
            if (this.f20140d == 10 && iY != 1) {
                return false;
            }
            int iA2 = tVar.a();
            this.f20136a.a(tVar, iA2);
            this.f20136a.c(j10, 1, iA2, 0, null);
            return true;
        }
        int iA3 = tVar.a();
        byte[] bArr = new byte[iA3];
        tVar.h(bArr, 0, iA3);
        Pair<Integer, Integer> pairJ = d.j(bArr);
        this.f20136a.d(Format.q(null, "audio/mp4a-latm", null, -1, -1, ((Integer) pairJ.second).intValue(), ((Integer) pairJ.first).intValue(), Collections.singletonList(bArr), null, 0, null));
        this.f20139c = true;
        return false;
    }
}
