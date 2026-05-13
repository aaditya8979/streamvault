package a6;

import java.util.Collections;
import java.util.PriorityQueue;

/* JADX INFO: compiled from: PriorityTaskManager.java */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f3627a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PriorityQueue<Integer> f3628b = new PriorityQueue<>(10, Collections.reverseOrder());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3629c = Integer.MIN_VALUE;

    public void a(int i10) {
        synchronized (this.f3627a) {
            this.f3628b.add(Integer.valueOf(i10));
            this.f3629c = Math.max(this.f3629c, i10);
        }
    }

    public void b(int i10) {
        synchronized (this.f3627a) {
            this.f3628b.remove(Integer.valueOf(i10));
            this.f3629c = this.f3628b.isEmpty() ? Integer.MIN_VALUE : ((Integer) k0.i(this.f3628b.peek())).intValue();
            this.f3627a.notifyAll();
        }
    }
}
