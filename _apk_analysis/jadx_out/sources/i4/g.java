package i4;

import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import i4.e;
import i4.f;
import java.lang.Exception;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: SimpleDecoder.java */
/* JADX INFO: loaded from: classes11.dex */
public abstract class g<I extends e, O extends f, E extends Exception> implements c<I, O, E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Thread f63716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f63717b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayDeque<I> f63718c = new ArrayDeque<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayDeque<O> f63719d = new ArrayDeque<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final I[] f63720e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final O[] f63721f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f63722g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f63723h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public I f63724i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public E f63725j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f63726k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f63727l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f63728m;

    /* JADX INFO: compiled from: SimpleDecoder.java */
    public class a extends Thread {
        public a() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            g.this.p();
        }
    }

    public g(I[] iArr, O[] oArr) {
        this.f63720e = iArr;
        this.f63722g = iArr.length;
        for (int i10 = 0; i10 < this.f63722g; i10++) {
            ((I[]) this.f63720e)[i10] = c();
        }
        this.f63721f = oArr;
        this.f63723h = oArr.length;
        for (int i11 = 0; i11 < this.f63723h; i11++) {
            ((O[]) this.f63721f)[i11] = d();
        }
        a aVar = new a();
        this.f63716a = aVar;
        aVar.start();
    }

    public final boolean b() {
        return !this.f63718c.isEmpty() && this.f63723h > 0;
    }

    public abstract I c();

    public abstract O d();

    public abstract E e(Throwable th2);

    @Nullable
    public abstract E f(I i10, O o10, boolean z10);

    @Override // i4.c
    public final void flush() {
        synchronized (this.f63717b) {
            this.f63726k = true;
            this.f63728m = 0;
            I i10 = this.f63724i;
            if (i10 != null) {
                m(i10);
                this.f63724i = null;
            }
            while (!this.f63718c.isEmpty()) {
                m(this.f63718c.removeFirst());
            }
            while (!this.f63719d.isEmpty()) {
                this.f63719d.removeFirst().release();
            }
            this.f63725j = null;
        }
    }

    public final boolean g() throws InterruptedException {
        E e10;
        synchronized (this.f63717b) {
            while (!this.f63727l && !b()) {
                this.f63717b.wait();
            }
            if (this.f63727l) {
                return false;
            }
            I iRemoveFirst = this.f63718c.removeFirst();
            O[] oArr = this.f63721f;
            int i10 = this.f63723h - 1;
            this.f63723h = i10;
            O o10 = oArr[i10];
            boolean z10 = this.f63726k;
            this.f63726k = false;
            if (iRemoveFirst.isEndOfStream()) {
                o10.addFlag(4);
            } else {
                if (iRemoveFirst.isDecodeOnly()) {
                    o10.addFlag(Integer.MIN_VALUE);
                }
                try {
                    e10 = (E) f(iRemoveFirst, o10, z10);
                } catch (OutOfMemoryError e11) {
                    e10 = (E) e(e11);
                } catch (RuntimeException e12) {
                    e10 = (E) e(e12);
                }
                if (e10 != null) {
                    synchronized (this.f63717b) {
                        this.f63725j = e10;
                    }
                    return false;
                }
            }
            synchronized (this.f63717b) {
                if (this.f63726k) {
                    o10.release();
                } else if (o10.isDecodeOnly()) {
                    this.f63728m++;
                    o10.release();
                } else {
                    o10.skippedOutputBufferCount = this.f63728m;
                    this.f63728m = 0;
                    this.f63719d.addLast(o10);
                }
                m(iRemoveFirst);
            }
            return true;
        }
    }

    @Override // i4.c
    @Nullable
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final I dequeueInputBuffer() throws Exception {
        I i10;
        synchronized (this.f63717b) {
            k();
            a6.a.f(this.f63724i == null);
            int i11 = this.f63722g;
            if (i11 == 0) {
                i10 = null;
            } else {
                I[] iArr = this.f63720e;
                int i12 = i11 - 1;
                this.f63722g = i12;
                i10 = iArr[i12];
            }
            this.f63724i = i10;
        }
        return i10;
    }

    @Override // i4.c
    @Nullable
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final O dequeueOutputBuffer() throws Exception {
        synchronized (this.f63717b) {
            k();
            if (this.f63719d.isEmpty()) {
                return null;
            }
            return this.f63719d.removeFirst();
        }
    }

    public final void j() {
        if (b()) {
            this.f63717b.notify();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: E extends java.lang.Exception */
    public final void k() throws Exception {
        E e10 = this.f63725j;
        if (e10 != null) {
            throw e10;
        }
    }

    @Override // i4.c
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final void queueInputBuffer(I i10) throws Exception {
        synchronized (this.f63717b) {
            k();
            a6.a.a(i10 == this.f63724i);
            this.f63718c.addLast(i10);
            j();
            this.f63724i = null;
        }
    }

    public final void m(I i10) {
        i10.clear();
        I[] iArr = this.f63720e;
        int i11 = this.f63722g;
        this.f63722g = i11 + 1;
        iArr[i11] = i10;
    }

    @CallSuper
    public void n(O o10) {
        synchronized (this.f63717b) {
            o(o10);
            j();
        }
    }

    public final void o(O o10) {
        o10.clear();
        O[] oArr = this.f63721f;
        int i10 = this.f63723h;
        this.f63723h = i10 + 1;
        oArr[i10] = o10;
    }

    public final void p() {
        do {
            try {
            } catch (InterruptedException e10) {
                throw new IllegalStateException(e10);
            }
        } while (g());
    }

    public final void q(int i10) {
        a6.a.f(this.f63722g == this.f63720e.length);
        for (I i11 : this.f63720e) {
            i11.b(i10);
        }
    }

    @Override // i4.c
    @CallSuper
    public void release() {
        synchronized (this.f63717b) {
            this.f63727l = true;
            this.f63717b.notify();
        }
        try {
            this.f63716a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
