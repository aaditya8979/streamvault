package zq;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: CounterStatistic.java */
/* JADX INFO: loaded from: classes12.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicLong f98406a = new AtomicLong();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicLong f98407b = new AtomicLong();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicLong f98408c = new AtomicLong();

    public void a(long j10) {
        long jAddAndGet = this.f98407b.addAndGet(j10);
        if (j10 > 0) {
            this.f98408c.addAndGet(j10);
        }
        sq.a.a(this.f98406a, jAddAndGet);
    }

    public void b() {
        a(-1L);
    }

    public void c() {
        a(1L);
    }
}
