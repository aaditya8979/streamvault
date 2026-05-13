package q6;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: Track.java */
/* JADX INFO: loaded from: classes3.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f77958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f77959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f77960c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f77961d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f77962e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.google.android.exoplayer2.m f77963f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f77964g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public final long[] f77965h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final long[] f77966i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f77967j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public final p[] f77968k;

    public o(int i10, int i11, long j10, long j11, long j12, com.google.android.exoplayer2.m mVar, int i12, @Nullable p[] pVarArr, int i13, @Nullable long[] jArr, @Nullable long[] jArr2) {
        this.f77958a = i10;
        this.f77959b = i11;
        this.f77960c = j10;
        this.f77961d = j11;
        this.f77962e = j12;
        this.f77963f = mVar;
        this.f77964g = i12;
        this.f77968k = pVarArr;
        this.f77967j = i13;
        this.f77965h = jArr;
        this.f77966i = jArr2;
    }

    @Nullable
    public p a(int i10) {
        p[] pVarArr = this.f77968k;
        if (pVarArr == null) {
            return null;
        }
        return pVarArr[i10];
    }
}
