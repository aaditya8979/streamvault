package ws;

import java.util.ArrayDeque;
import java.util.Queue;
import ws.h;

/* JADX INFO: compiled from: BaseKeyPool.java */
/* JADX INFO: loaded from: classes11.dex */
public abstract class c<T extends h> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Queue<T> f86700a = b(20);

    public static <T> Queue<T> b(int i10) {
        return new ArrayDeque(i10);
    }

    public abstract T a();

    public T c() {
        T tPoll = this.f86700a.poll();
        return tPoll == null ? (T) a() : tPoll;
    }

    public void d(T t10) {
        if (this.f86700a.size() < 20) {
            this.f86700a.offer(t10);
        }
    }
}
