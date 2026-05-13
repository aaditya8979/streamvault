package com.fyber.inneractive.sdk.player.exoplayer2.trackselection;

import android.os.SystemClock;
import com.fyber.inneractive.sdk.player.exoplayer2.o;
import com.fyber.inneractive.sdk.player.exoplayer2.source.y;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f18585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f18587c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o[] f18588d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long[] f18589e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f18590f;

    public b(y yVar, int... iArr) {
        if (iArr.length <= 0) {
            throw new IllegalStateException();
        }
        yVar.getClass();
        this.f18585a = yVar;
        int length = iArr.length;
        this.f18586b = length;
        this.f18588d = new o[length];
        int i10 = 0;
        for (int i11 = 0; i11 < iArr.length; i11++) {
            this.f18588d[i11] = yVar.f18574b[iArr[i11]];
        }
        Arrays.sort(this.f18588d, new a());
        this.f18587c = new int[this.f18586b];
        while (true) {
            int i12 = this.f18586b;
            if (i10 >= i12) {
                this.f18589e = new long[i12];
                return;
            } else {
                this.f18587c[i10] = yVar.a(this.f18588d[i10]);
                i10++;
            }
        }
    }

    public abstract int a();

    public final boolean a(int i10) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z10 = this.f18589e[i10] > jElapsedRealtime;
        int i11 = 0;
        while (i11 < this.f18586b && !z10) {
            z10 = i11 != i10 && this.f18589e[i11] <= jElapsedRealtime;
            i11++;
        }
        if (!z10) {
            return false;
        }
        long[] jArr = this.f18589e;
        jArr[i10] = Math.max(jArr[i10], jElapsedRealtime + 60000);
        return true;
    }

    public abstract Object b();

    public abstract int c();

    public abstract void d();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f18585a == bVar.f18585a && Arrays.equals(this.f18587c, bVar.f18587c);
    }

    public final int hashCode() {
        if (this.f18590f == 0) {
            this.f18590f = Arrays.hashCode(this.f18587c) + (System.identityHashCode(this.f18585a) * 31);
        }
        return this.f18590f;
    }
}
