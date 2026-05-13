package com.google.android.exoplayer.trackselection;

import a6.k0;
import a6.p;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer.ExoPlaybackException;
import com.google.android.exoplayer.source.TrackGroup;
import com.google.android.exoplayer.source.TrackGroupArray;
import e4.q0;
import e4.r0;
import e4.v0;
import e5.r;
import java.util.Arrays;
import w5.d;
import w5.e;

/* JADX INFO: compiled from: MappingTrackSelector.java */
/* JADX INFO: loaded from: classes12.dex */
public abstract class b extends d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public a f20866c;

    /* JADX INFO: compiled from: MappingTrackSelector.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Deprecated
        public final int f20867a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f20868b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int[] f20869c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final TrackGroupArray[] f20870d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int[] f20871e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int[][][] f20872f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final TrackGroupArray f20873g;

        public a(int[] iArr, TrackGroupArray[] trackGroupArrayArr, int[] iArr2, int[][][] iArr3, TrackGroupArray trackGroupArray) {
            this.f20869c = iArr;
            this.f20870d = trackGroupArrayArr;
            this.f20872f = iArr3;
            this.f20871e = iArr2;
            this.f20873g = trackGroupArray;
            int length = iArr.length;
            this.f20868b = length;
            this.f20867a = length;
        }

        public int a(int i10, int i11, boolean z10) {
            int i12 = this.f20870d[i10].b(i11).f20388b;
            int[] iArr = new int[i12];
            int i13 = 0;
            for (int i14 = 0; i14 < i12; i14++) {
                int iF = f(i10, i11, i14);
                if (iF == 4 || (z10 && iF == 3)) {
                    iArr[i13] = i14;
                    i13++;
                }
            }
            return b(i10, i11, Arrays.copyOf(iArr, i13));
        }

        public int b(int i10, int i11, int[] iArr) {
            int i12 = 0;
            int iMin = 16;
            String str = null;
            boolean z10 = false;
            int i13 = 0;
            while (i12 < iArr.length) {
                String str2 = this.f20870d[i10].b(i11).b(iArr[i12]).f19927j;
                int i14 = i13 + 1;
                if (i13 == 0) {
                    str = str2;
                } else {
                    z10 |= !k0.c(str, str2);
                }
                iMin = Math.min(iMin, q0.getAdaptiveSupport(this.f20872f[i10][i11][i12]));
                i12++;
                i13 = i14;
            }
            return z10 ? Math.min(iMin, this.f20871e[i10]) : iMin;
        }

        public int c() {
            return this.f20868b;
        }

        public int d(int i10) {
            return this.f20869c[i10];
        }

        public TrackGroupArray e(int i10) {
            return this.f20870d[i10];
        }

        public int f(int i10, int i11, int i12) {
            return q0.getFormatSupport(this.f20872f[i10][i11][i12]);
        }

        public TrackGroupArray g() {
            return this.f20873g;
        }
    }

    public static int f(q0[] q0VarArr, TrackGroup trackGroup, int[] iArr, boolean z10) throws ExoPlaybackException {
        int length = q0VarArr.length;
        boolean z11 = true;
        int i10 = 0;
        for (int i11 = 0; i11 < q0VarArr.length; i11++) {
            q0 q0Var = q0VarArr[i11];
            int iMax = 0;
            for (int i12 = 0; i12 < trackGroup.f20388b; i12++) {
                iMax = Math.max(iMax, q0.getFormatSupport(q0Var.a(trackGroup.b(i12))));
            }
            boolean z12 = iArr[i11] == 0;
            if (iMax > i10 || (iMax == i10 && z10 && !z11 && z12)) {
                length = i11;
                z11 = z12;
                i10 = iMax;
            }
        }
        return length;
    }

    public static int[] h(q0 q0Var, TrackGroup trackGroup) throws ExoPlaybackException {
        int[] iArr = new int[trackGroup.f20388b];
        for (int i10 = 0; i10 < trackGroup.f20388b; i10++) {
            iArr[i10] = q0Var.a(trackGroup.b(i10));
        }
        return iArr;
    }

    public static int[] i(q0[] q0VarArr) throws ExoPlaybackException {
        int length = q0VarArr.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = q0VarArr[i10].supportsMixedMimeTypeAdaptation();
        }
        return iArr;
    }

    @Override // w5.d
    public final void d(Object obj) {
        this.f20866c = (a) obj;
    }

    @Override // w5.d
    public final e e(q0[] q0VarArr, TrackGroupArray trackGroupArray, r.a aVar, v0 v0Var) throws ExoPlaybackException {
        int[] iArr = new int[q0VarArr.length + 1];
        int length = q0VarArr.length + 1;
        TrackGroup[][] trackGroupArr = new TrackGroup[length][];
        int[][][] iArr2 = new int[q0VarArr.length + 1][][];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = trackGroupArray.f20392b;
            trackGroupArr[i10] = new TrackGroup[i11];
            iArr2[i10] = new int[i11][];
        }
        int[] iArrI = i(q0VarArr);
        for (int i12 = 0; i12 < trackGroupArray.f20392b; i12++) {
            TrackGroup trackGroupB = trackGroupArray.b(i12);
            int iF = f(q0VarArr, trackGroupB, iArr, p.h(trackGroupB.b(0).f19927j) == 4);
            int[] iArrH = iF == q0VarArr.length ? new int[trackGroupB.f20388b] : h(q0VarArr[iF], trackGroupB);
            int i13 = iArr[iF];
            trackGroupArr[iF][i13] = trackGroupB;
            iArr2[iF][i13] = iArrH;
            iArr[iF] = i13 + 1;
        }
        TrackGroupArray[] trackGroupArrayArr = new TrackGroupArray[q0VarArr.length];
        int[] iArr3 = new int[q0VarArr.length];
        for (int i14 = 0; i14 < q0VarArr.length; i14++) {
            int i15 = iArr[i14];
            trackGroupArrayArr[i14] = new TrackGroupArray((TrackGroup[]) k0.q0(trackGroupArr[i14], i15));
            iArr2[i14] = (int[][]) k0.q0(iArr2[i14], i15);
            iArr3[i14] = q0VarArr[i14].getTrackType();
        }
        a aVar2 = new a(iArr3, trackGroupArrayArr, iArrI, iArr2, new TrackGroupArray((TrackGroup[]) k0.q0(trackGroupArr[q0VarArr.length], iArr[q0VarArr.length])));
        Pair<r0[], c[]> pairJ = j(aVar2, iArr2, iArrI);
        return new e((r0[]) pairJ.first, (c[]) pairJ.second, aVar2);
    }

    @Nullable
    public final a g() {
        return this.f20866c;
    }

    public abstract Pair<r0[], c[]> j(a aVar, int[][][] iArr, int[] iArr2) throws ExoPlaybackException;
}
