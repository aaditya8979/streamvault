package em;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: compiled from: ListCompositeDisposable.java */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements bm.b, a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<bm.b> f61162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f61163c;

    @Override // em.a
    public boolean a(bm.b bVar) {
        fm.a.e(bVar, "d is null");
        if (!this.f61163c) {
            synchronized (this) {
                if (!this.f61163c) {
                    List linkedList = this.f61162b;
                    if (linkedList == null) {
                        linkedList = new LinkedList();
                        this.f61162b = linkedList;
                    }
                    linkedList.add(bVar);
                    return true;
                }
            }
        }
        bVar.dispose();
        return false;
    }

    @Override // em.a
    public boolean b(bm.b bVar) {
        if (!delete(bVar)) {
            return false;
        }
        bVar.dispose();
        return true;
    }

    public void c(List<bm.b> list) {
        if (list == null) {
            return;
        }
        ArrayList arrayList = null;
        Iterator<bm.b> it = list.iterator();
        while (it.hasNext()) {
            try {
                it.next().dispose();
            } catch (Throwable th2) {
                cm.a.b(th2);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(th2);
            }
        }
        if (arrayList != null) {
            if (arrayList.size() != 1) {
                throw new CompositeException(arrayList);
            }
            throw ExceptionHelper.d((Throwable) arrayList.get(0));
        }
    }

    @Override // em.a
    public boolean delete(bm.b bVar) {
        fm.a.e(bVar, "Disposable item is null");
        if (this.f61163c) {
            return false;
        }
        synchronized (this) {
            if (this.f61163c) {
                return false;
            }
            List<bm.b> list = this.f61162b;
            if (list != null && list.remove(bVar)) {
                return true;
            }
            return false;
        }
    }

    @Override // bm.b
    public void dispose() {
        if (this.f61163c) {
            return;
        }
        synchronized (this) {
            if (this.f61163c) {
                return;
            }
            this.f61163c = true;
            List<bm.b> list = this.f61162b;
            this.f61162b = null;
            c(list);
        }
    }

    @Override // bm.b
    public boolean isDisposed() {
        return this.f61163c;
    }
}
