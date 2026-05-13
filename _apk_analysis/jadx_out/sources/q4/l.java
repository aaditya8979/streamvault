package q4;

import androidx.annotation.Nullable;
import com.google.android.exoplayer.Format;

/* JADX INFO: compiled from: Track.java */
/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f77772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f77773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f77774c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f77775d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f77776e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Format f77777f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f77778g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public final long[] f77779h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final long[] f77780i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f77781j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public final m[] f77782k;

    public l(int i10, int i11, long j10, long j11, long j12, Format format, int i12, @Nullable m[] mVarArr, int i13, @Nullable long[] jArr, @Nullable long[] jArr2) {
        this.f77772a = i10;
        this.f77773b = i11;
        this.f77774c = j10;
        this.f77775d = j11;
        this.f77776e = j12;
        this.f77777f = format;
        this.f77778g = i12;
        this.f77782k = mVarArr;
        this.f77781j = i13;
        this.f77779h = jArr;
        this.f77780i = jArr2;
    }

    @Nullable
    public m a(int i10) {
        m[] mVarArr = this.f77782k;
        if (mVarArr == null) {
            return null;
        }
        return mVarArr[i10];
    }
}
