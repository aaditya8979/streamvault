package wa;

import java.util.LinkedList;

/* JADX INFO: compiled from: ObjectPools.java */
/* JADX INFO: loaded from: classes10.dex */
public class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedList<T> f86354a = new LinkedList<>();

    public T a() {
        return this.f86354a.poll();
    }

    public void b() {
        this.f86354a.clear();
    }

    public final boolean c(T t10) {
        return this.f86354a.contains(t10);
    }

    public boolean d(T t10) {
        if (c(t10)) {
            return false;
        }
        return this.f86354a.add(t10);
    }
}
