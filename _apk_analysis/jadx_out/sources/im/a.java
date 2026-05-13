package im;

import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: CompletableAmb.java */
/* JADX INFO: loaded from: classes10.dex */
public final class a extends xl.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xl.c[] f64318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterable<? extends xl.c> f64319b;

    /* JADX INFO: renamed from: im.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CompletableAmb.java */
    public static final class C0792a implements xl.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicBoolean f64320b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final bm.a f64321c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final xl.b f64322d;

        public C0792a(AtomicBoolean atomicBoolean, bm.a aVar, xl.b bVar) {
            this.f64320b = atomicBoolean;
            this.f64321c = aVar;
            this.f64322d = bVar;
        }

        @Override // xl.b, xl.h
        public void onComplete() {
            if (this.f64320b.compareAndSet(false, true)) {
                this.f64321c.dispose();
                this.f64322d.onComplete();
            }
        }

        @Override // xl.b
        public void onError(Throwable th2) {
            if (!this.f64320b.compareAndSet(false, true)) {
                tm.a.s(th2);
            } else {
                this.f64321c.dispose();
                this.f64322d.onError(th2);
            }
        }

        @Override // xl.b
        public void onSubscribe(bm.b bVar) {
            this.f64321c.a(bVar);
        }
    }

    public a(xl.c[] cVarArr, Iterable<? extends xl.c> iterable) {
        this.f64318a = cVarArr;
        this.f64319b = iterable;
    }

    @Override // xl.a
    public void f(xl.b bVar) {
        int length;
        xl.c[] cVarArr = this.f64318a;
        if (cVarArr == null) {
            cVarArr = new xl.c[8];
            try {
                length = 0;
                for (xl.c cVar : this.f64319b) {
                    if (cVar == null) {
                        EmptyDisposable.error(new NullPointerException("One of the sources is null"), bVar);
                        return;
                    }
                    if (length == cVarArr.length) {
                        xl.c[] cVarArr2 = new xl.c[(length >> 2) + length];
                        System.arraycopy(cVarArr, 0, cVarArr2, 0, length);
                        cVarArr = cVarArr2;
                    }
                    int i10 = length + 1;
                    cVarArr[length] = cVar;
                    length = i10;
                }
            } catch (Throwable th2) {
                cm.a.b(th2);
                EmptyDisposable.error(th2, bVar);
                return;
            }
        } else {
            length = cVarArr.length;
        }
        bm.a aVar = new bm.a();
        bVar.onSubscribe(aVar);
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        C0792a c0792a = new C0792a(atomicBoolean, aVar, bVar);
        for (int i11 = 0; i11 < length; i11++) {
            xl.c cVar2 = cVarArr[i11];
            if (aVar.isDisposed()) {
                return;
            }
            if (cVar2 == null) {
                Throwable nullPointerException = new NullPointerException("One of the sources is null");
                if (!atomicBoolean.compareAndSet(false, true)) {
                    tm.a.s(nullPointerException);
                    return;
                } else {
                    aVar.dispose();
                    bVar.onError(nullPointerException);
                    return;
                }
            }
            cVar2.b(c0792a);
        }
        if (length == 0) {
            bVar.onComplete();
        }
    }
}
