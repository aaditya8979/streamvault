package s7;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: compiled from: TimedValueQueue.java */
/* JADX INFO: loaded from: classes10.dex */
public final class i0<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f79475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public V[] f79476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f79477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f79478d;

    public i0() {
        this(10);
    }

    public i0(int i10) {
        this.f79475a = new long[i10];
        this.f79476b = (V[]) f(i10);
    }

    public static <V> V[] f(int i10) {
        return (V[]) new Object[i10];
    }

    public synchronized void a(long j10, V v10) {
        d(j10);
        e();
        b(j10, v10);
    }

    public final void b(long j10, V v10) {
        int i10 = this.f79477c;
        int i11 = this.f79478d;
        V[] vArr = this.f79476b;
        int length = (i10 + i11) % vArr.length;
        this.f79475a[length] = j10;
        vArr[length] = v10;
        this.f79478d = i11 + 1;
    }

    public synchronized void c() {
        this.f79477c = 0;
        this.f79478d = 0;
        Arrays.fill(this.f79476b, (Object) null);
    }

    public final void d(long j10) {
        if (this.f79478d > 0) {
            if (j10 <= this.f79475a[((this.f79477c + r0) - 1) % this.f79476b.length]) {
                c();
            }
        }
    }

    public final void e() {
        int length = this.f79476b.length;
        if (this.f79478d < length) {
            return;
        }
        int i10 = length * 2;
        long[] jArr = new long[i10];
        V[] vArr = (V[]) f(i10);
        int i11 = this.f79477c;
        int i12 = length - i11;
        System.arraycopy(this.f79475a, i11, jArr, 0, i12);
        System.arraycopy(this.f79476b, this.f79477c, vArr, 0, i12);
        int i13 = this.f79477c;
        if (i13 > 0) {
            System.arraycopy(this.f79475a, 0, jArr, i12, i13);
            System.arraycopy(this.f79476b, 0, vArr, i12, this.f79477c);
        }
        this.f79475a = jArr;
        this.f79476b = vArr;
        this.f79477c = 0;
    }

    @Nullable
    public synchronized V g(long j10) {
        return h(j10, false);
    }

    @Nullable
    public final V h(long j10, boolean z10) {
        V vK = null;
        long j11 = Long.MAX_VALUE;
        while (this.f79478d > 0) {
            long j12 = j10 - this.f79475a[this.f79477c];
            if (j12 < 0 && (z10 || (-j12) >= j11)) {
                break;
            }
            vK = k();
            j11 = j12;
        }
        return vK;
    }

    @Nullable
    public synchronized V i() {
        return this.f79478d == 0 ? null : k();
    }

    @Nullable
    public synchronized V j(long j10) {
        return h(j10, true);
    }

    @Nullable
    public final V k() {
        a.g(this.f79478d > 0);
        V[] vArr = this.f79476b;
        int i10 = this.f79477c;
        V v10 = vArr[i10];
        vArr[i10] = null;
        this.f79477c = (i10 + 1) % vArr.length;
        this.f79478d--;
        return v10;
    }

    public synchronized int l() {
        return this.f79478d;
    }
}
