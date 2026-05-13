package com.google.android.exoplayer.source.smoothstreaming;

import androidx.annotation.Nullable;
import com.google.android.exoplayer.Format;
import com.google.android.exoplayer.drm.DrmInitData;
import com.google.android.exoplayer.source.TrackGroup;
import com.google.android.exoplayer.source.TrackGroupArray;
import com.google.android.exoplayer.source.smoothstreaming.b;
import com.google.android.exoplayer.source.smoothstreaming.manifest.a;
import e4.t0;
import e5.b0;
import e5.i0;
import e5.j0;
import e5.q;
import g5.g;
import java.io.IOException;
import java.util.ArrayList;
import y5.m;
import y5.n;

/* JADX INFO: compiled from: SsMediaPeriod.java */
/* JADX INFO: loaded from: classes2.dex */
public final class c implements q, j0.a<g<b>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b.a f20688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final y5.q f20689c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n f20690d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.google.android.exoplayer.drm.a<?> f20691e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m f20692f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b0.a f20693g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final y5.b f20694h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TrackGroupArray f20695i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e5.g f20696j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public q.a f20697k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public com.google.android.exoplayer.source.smoothstreaming.manifest.a f20698l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public g<b>[] f20699m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public j0 f20700n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f20701o;

    public c(com.google.android.exoplayer.source.smoothstreaming.manifest.a aVar, b.a aVar2, @Nullable y5.q qVar, e5.g gVar, com.google.android.exoplayer.drm.a<?> aVar3, m mVar, b0.a aVar4, n nVar, y5.b bVar) {
        this.f20698l = aVar;
        this.f20688b = aVar2;
        this.f20689c = qVar;
        this.f20690d = nVar;
        this.f20691e = aVar3;
        this.f20692f = mVar;
        this.f20693g = aVar4;
        this.f20694h = bVar;
        this.f20696j = gVar;
        this.f20695i = g(aVar, aVar3);
        g<b>[] gVarArrH = h(0);
        this.f20699m = gVarArrH;
        this.f20700n = gVar.a(gVarArrH);
        aVar4.I();
    }

    public static TrackGroupArray g(com.google.android.exoplayer.source.smoothstreaming.manifest.a aVar, com.google.android.exoplayer.drm.a<?> aVar2) {
        TrackGroup[] trackGroupArr = new TrackGroup[aVar.f20739f.length];
        int i10 = 0;
        while (true) {
            a.b[] bVarArr = aVar.f20739f;
            if (i10 >= bVarArr.length) {
                return new TrackGroupArray(trackGroupArr);
            }
            Format[] formatArr = bVarArr[i10].f20754j;
            Format[] formatArr2 = new Format[formatArr.length];
            for (int i11 = 0; i11 < formatArr.length; i11++) {
                Format formatF = formatArr[i11];
                DrmInitData drmInitData = formatF.f19930m;
                if (drmInitData != null) {
                    formatF = formatF.f(aVar2.e(drmInitData));
                }
                formatArr2[i11] = formatF;
            }
            trackGroupArr[i10] = new TrackGroup(formatArr2);
            i10++;
        }
    }

    public static g<b>[] h(int i10) {
        return new g[i10];
    }

    @Override // e5.q
    public long a(long j10, t0 t0Var) {
        for (g<b> gVar : this.f20699m) {
            if (gVar.f62036b == 2) {
                return gVar.a(j10, t0Var);
            }
        }
        return j10;
    }

    public final g<b> b(com.google.android.exoplayer.trackselection.c cVar, long j10) {
        int iC = this.f20695i.c(cVar.getTrackGroup());
        return new g<>(this.f20698l.f20739f[iC].f20745a, null, null, this.f20688b.a(this.f20690d, this.f20698l, iC, cVar, this.f20689c), this, this.f20694h, j10, this.f20691e, this.f20692f, this.f20693g);
    }

    @Override // e5.q, e5.j0
    public boolean continueLoading(long j10) {
        return this.f20700n.continueLoading(j10);
    }

    @Override // e5.q
    public void discardBuffer(long j10, boolean z10) {
        for (g<b> gVar : this.f20699m) {
            gVar.discardBuffer(j10, z10);
        }
    }

    @Override // e5.q
    public long e(com.google.android.exoplayer.trackselection.c[] cVarArr, boolean[] zArr, i0[] i0VarArr, boolean[] zArr2, long j10) {
        com.google.android.exoplayer.trackselection.c cVar;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < cVarArr.length; i10++) {
            i0 i0Var = i0VarArr[i10];
            if (i0Var != null) {
                g gVar = (g) i0Var;
                if (cVarArr[i10] == null || !zArr[i10]) {
                    gVar.z();
                    i0VarArr[i10] = null;
                } else {
                    ((b) gVar.o()).b(cVarArr[i10]);
                    arrayList.add(gVar);
                }
            }
            if (i0VarArr[i10] == null && (cVar = cVarArr[i10]) != null) {
                g<b> gVarB = b(cVar, j10);
                arrayList.add(gVarB);
                i0VarArr[i10] = gVarB;
                zArr2[i10] = true;
            }
        }
        g<b>[] gVarArrH = h(arrayList.size());
        this.f20699m = gVarArrH;
        arrayList.toArray(gVarArrH);
        this.f20700n = this.f20696j.a(this.f20699m);
        return j10;
    }

    @Override // e5.q
    public void f(q.a aVar, long j10) {
        this.f20697k = aVar;
        aVar.d(this);
    }

    @Override // e5.q, e5.j0
    public long getBufferedPositionUs() {
        return this.f20700n.getBufferedPositionUs();
    }

    @Override // e5.q, e5.j0
    public long getNextLoadPositionUs() {
        return this.f20700n.getNextLoadPositionUs();
    }

    @Override // e5.q
    public TrackGroupArray getTrackGroups() {
        return this.f20695i;
    }

    @Override // e5.j0.a
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void c(g<b> gVar) {
        this.f20697k.c(this);
    }

    @Override // e5.q, e5.j0
    public boolean isLoading() {
        return this.f20700n.isLoading();
    }

    public void j() {
        for (g<b> gVar : this.f20699m) {
            gVar.z();
        }
        this.f20697k = null;
        this.f20693g.J();
    }

    public void k(com.google.android.exoplayer.source.smoothstreaming.manifest.a aVar) {
        this.f20698l = aVar;
        for (g<b> gVar : this.f20699m) {
            ((b) gVar.o()).c(aVar);
        }
        this.f20697k.c(this);
    }

    @Override // e5.q
    public void maybeThrowPrepareError() throws IOException {
        this.f20690d.maybeThrowError();
    }

    @Override // e5.q
    public long readDiscontinuity() {
        if (this.f20701o) {
            return -9223372036854775807L;
        }
        this.f20693g.L();
        this.f20701o = true;
        return -9223372036854775807L;
    }

    @Override // e5.q, e5.j0
    public void reevaluateBuffer(long j10) {
        this.f20700n.reevaluateBuffer(j10);
    }

    @Override // e5.q
    public long seekToUs(long j10) {
        for (g<b> gVar : this.f20699m) {
            gVar.B(j10);
        }
        return j10;
    }
}
