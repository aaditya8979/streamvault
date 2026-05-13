package s7;

import java.util.Collections;
import java.util.PriorityQueue;

/* JADX INFO: compiled from: PriorityTaskManager.java */
/* JADX INFO: loaded from: classes11.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f79447a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PriorityQueue<Integer> f79448b = new PriorityQueue<>(10, Collections.reverseOrder());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f79449c = Integer.MIN_VALUE;

    public void a(int i10) {
        synchronized (this.f79447a) {
            this.f79448b.add(Integer.valueOf(i10));
            this.f79449c = Math.max(this.f79449c, i10);
        }
    }

    public void b(int i10) {
        synchronized (this.f79447a) {
            this.f79448b.remove(Integer.valueOf(i10));
            this.f79449c = this.f79448b.isEmpty() ? Integer.MIN_VALUE : ((Integer) m0.j(this.f79448b.peek())).intValue();
            this.f79447a.notifyAll();
        }
    }
}
