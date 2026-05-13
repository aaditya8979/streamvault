package a6;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: compiled from: TimedValueQueue.java */
/* JADX INFO: loaded from: classes4.dex */
public final class f0<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f3540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public V[] f3541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3542c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3543d;

    public f0() {
        this(10);
    }

    public f0(int i10) {
        this.f3540a = new long[i10];
        this.f3541b = (V[]) f(i10);
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
        int i10 = this.f3542c;
        int i11 = this.f3543d;
        V[] vArr = this.f3541b;
        int length = (i10 + i11) % vArr.length;
        this.f3540a[length] = j10;
        vArr[length] = v10;
        this.f3543d = i11 + 1;
    }

    public synchronized void c() {
        this.f3542c = 0;
        this.f3543d = 0;
        Arrays.fill(this.f3541b, (Object) null);
    }

    public final void d(long j10) {
        if (this.f3543d > 0) {
            if (j10 <= this.f3540a[((this.f3542c + r0) - 1) % this.f3541b.length]) {
                c();
            }
        }
    }

    public final void e() {
        int length = this.f3541b.length;
        if (this.f3543d < length) {
            return;
        }
        int i10 = length * 2;
        long[] jArr = new long[i10];
        V[] vArr = (V[]) f(i10);
        int i11 = this.f3542c;
        int i12 = length - i11;
        System.arraycopy(this.f3540a, i11, jArr, 0, i12);
        System.arraycopy(this.f3541b, this.f3542c, vArr, 0, i12);
        int i13 = this.f3542c;
        if (i13 > 0) {
            System.arraycopy(this.f3540a, 0, jArr, i12, i13);
            System.arraycopy(this.f3541b, 0, vArr, i12, this.f3542c);
        }
        this.f3540a = jArr;
        this.f3541b = vArr;
        this.f3542c = 0;
    }

    @Nullable
    public final V g(long j10, boolean z10) {
        long j11 = Long.MAX_VALUE;
        V v10 = null;
        while (true) {
            int i10 = this.f3543d;
            if (i10 <= 0) {
                break;
            }
            long[] jArr = this.f3540a;
            int i11 = this.f3542c;
            long j12 = j10 - jArr[i11];
            if (j12 < 0 && (z10 || (-j12) >= j11)) {
                break;
            }
            V[] vArr = this.f3541b;
            v10 = vArr[i11];
            vArr[i11] = null;
            this.f3542c = (i11 + 1) % vArr.length;
            this.f3543d = i10 - 1;
            j11 = j12;
        }
        return v10;
    }

    @Nullable
    public synchronized V h(long j10) {
        return g(j10, true);
    }
}
