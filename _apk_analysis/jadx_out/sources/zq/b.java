package zq;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: SampleStatistic.java */
/* JADX INFO: loaded from: classes12.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicLong f98409a = new AtomicLong();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicLong f98410b = new AtomicLong();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicLong f98411c = new AtomicLong();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicLong f98412d = new AtomicLong();

    public void a(long j10) {
        long jAddAndGet = this.f98410b.addAndGet(j10);
        long jIncrementAndGet = this.f98411c.incrementAndGet();
        if (jIncrementAndGet > 1) {
            long j11 = (10 * j10) - ((jAddAndGet * 10) / jIncrementAndGet);
            this.f98412d.addAndGet(j11 * j11);
        }
        sq.a.a(this.f98409a, j10);
    }
}
