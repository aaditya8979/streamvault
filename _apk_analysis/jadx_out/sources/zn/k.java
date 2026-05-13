package zn;

import cn.l0;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: ProgressionIterators.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class k extends l0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f98367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f98368c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f98369d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f98370e;

    public k(long j10, long j11, long j12) {
        this.f98367b = j12;
        this.f98368c = j11;
        boolean z10 = true;
        if (j12 <= 0 ? j10 < j11 : j10 > j11) {
            z10 = false;
        }
        this.f98369d = z10;
        this.f98370e = z10 ? j10 : j11;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f98369d;
    }

    @Override // cn.l0
    public long nextLong() {
        long j10 = this.f98370e;
        if (j10 != this.f98368c) {
            this.f98370e = this.f98367b + j10;
        } else {
            if (!this.f98369d) {
                throw new NoSuchElementException();
            }
            this.f98369d = false;
        }
        return j10;
    }
}
