package q7;

import androidx.annotation.Nullable;
import e7.g0;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: compiled from: BaseTrackSelection.java */
/* JADX INFO: loaded from: classes12.dex */
public abstract class c implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g0 f78031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f78032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f78033c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f78034d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.google.android.exoplayer2.m[] f78035e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long[] f78036f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f78037g;

    public c(g0 g0Var, int[] iArr, int i10) {
        int i11 = 0;
        s7.a.g(iArr.length > 0);
        this.f78034d = i10;
        this.f78031a = (g0) s7.a.e(g0Var);
        int length = iArr.length;
        this.f78032b = length;
        this.f78035e = new com.google.android.exoplayer2.m[length];
        for (int i12 = 0; i12 < iArr.length; i12++) {
            this.f78035e[i12] = g0Var.c(iArr[i12]);
        }
        Arrays.sort(this.f78035e, new Comparator() { // from class: q7.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return c.b((com.google.android.exoplayer2.m) obj, (com.google.android.exoplayer2.m) obj2);
            }
        });
        this.f78033c = new int[this.f78032b];
        while (true) {
            int i13 = this.f78032b;
            if (i11 >= i13) {
                this.f78036f = new long[i13];
                return;
            } else {
                this.f78033c[i11] = g0Var.d(this.f78035e[i11]);
                i11++;
            }
        }
    }

    public static /* synthetic */ int b(com.google.android.exoplayer2.m mVar, com.google.android.exoplayer2.m mVar2) {
        return mVar2.f21747i - mVar.f21747i;
    }

    @Override // q7.r
    public void disable() {
    }

    @Override // q7.r
    public void enable() {
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f78031a == cVar.f78031a && Arrays.equals(this.f78033c, cVar.f78033c);
    }

    @Override // q7.u
    public final com.google.android.exoplayer2.m getFormat(int i10) {
        return this.f78035e[i10];
    }

    @Override // q7.u
    public final int getIndexInTrackGroup(int i10) {
        return this.f78033c[i10];
    }

    @Override // q7.r
    public final com.google.android.exoplayer2.m getSelectedFormat() {
        return this.f78035e[getSelectedIndex()];
    }

    @Override // q7.u
    public final g0 getTrackGroup() {
        return this.f78031a;
    }

    @Override // q7.r, q7.u
    public final int getType() {
        return this.f78034d;
    }

    public int hashCode() {
        if (this.f78037g == 0) {
            this.f78037g = (System.identityHashCode(this.f78031a) * 31) + Arrays.hashCode(this.f78033c);
        }
        return this.f78037g;
    }

    @Override // q7.u
    public final int indexOf(int i10) {
        for (int i11 = 0; i11 < this.f78032b; i11++) {
            if (this.f78033c[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    @Override // q7.u
    public final int length() {
        return this.f78033c.length;
    }

    @Override // q7.r
    public void onPlaybackSpeed(float f10) {
    }
}
