package bm;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.ArrayList;
import qm.i;

/* JADX INFO: compiled from: CompositeDisposable.java */
/* JADX INFO: loaded from: classes12.dex */
public final class a implements b, em.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i<b> f5606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f5607c;

    @Override // em.a
    public boolean a(b bVar) {
        fm.a.e(bVar, "d is null");
        if (!this.f5607c) {
            synchronized (this) {
                if (!this.f5607c) {
                    i<b> iVar = this.f5606b;
                    if (iVar == null) {
                        iVar = new i<>();
                        this.f5606b = iVar;
                    }
                    iVar.a(bVar);
                    return true;
                }
            }
        }
        bVar.dispose();
        return false;
    }

    @Override // em.a
    public boolean b(b bVar) {
        if (!delete(bVar)) {
            return false;
        }
        bVar.dispose();
        return true;
    }

    public void c() {
        if (this.f5607c) {
            return;
        }
        synchronized (this) {
            if (this.f5607c) {
                return;
            }
            i<b> iVar = this.f5606b;
            this.f5606b = null;
            d(iVar);
        }
    }

    public void d(i<b> iVar) {
        if (iVar == null) {
            return;
        }
        ArrayList arrayList = null;
        for (Object obj : iVar.b()) {
            if (obj instanceof b) {
                try {
                    ((b) obj).dispose();
                } catch (Throwable th2) {
                    cm.a.b(th2);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th2);
                }
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
    public boolean delete(b bVar) {
        fm.a.e(bVar, "Disposable item is null");
        if (this.f5607c) {
            return false;
        }
        synchronized (this) {
            if (this.f5607c) {
                return false;
            }
            i<b> iVar = this.f5606b;
            if (iVar != null && iVar.e(bVar)) {
                return true;
            }
            return false;
        }
    }

    @Override // bm.b
    public void dispose() {
        if (this.f5607c) {
            return;
        }
        synchronized (this) {
            if (this.f5607c) {
                return;
            }
            this.f5607c = true;
            i<b> iVar = this.f5606b;
            this.f5606b = null;
            d(iVar);
        }
    }

    public int e() {
        if (this.f5607c) {
            return 0;
        }
        synchronized (this) {
            if (this.f5607c) {
                return 0;
            }
            i<b> iVar = this.f5606b;
            return iVar != null ? iVar.g() : 0;
        }
    }

    @Override // bm.b
    public boolean isDisposed() {
        return this.f5607c;
    }
}
