package y9;

import android.os.Handler;
import android.util.SparseArray;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: QueuesHandler.java */
/* JADX INFO: loaded from: classes10.dex */
public class d0 implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseArray<Handler> f87433a = new SparseArray<>();

    @Override // y9.x
    public boolean a(int i10) {
        return this.f87433a.get(i10) != null;
    }

    @Override // y9.x
    public int b() {
        return this.f87433a.size();
    }

    @Override // y9.x
    public void c() {
        for (int i10 = 0; i10 < this.f87433a.size(); i10++) {
            e(this.f87433a.get(this.f87433a.keyAt(i10)));
        }
    }

    @Override // y9.x
    public void d(List<Integer> list) {
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            f(this.f87433a.get(it.next().intValue()));
        }
    }

    public final void e(Handler handler) {
        handler.sendEmptyMessage(2);
    }

    public final void f(Handler handler) {
        handler.sendEmptyMessage(3);
    }
}
