package g6;

import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.decoder.DecoderException;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import g6.f;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: SimpleDecoder.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class h<I extends DecoderInputBuffer, O extends f, E extends DecoderException> implements d<I, O, E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Thread f62115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f62116b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayDeque<I> f62117c = new ArrayDeque<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayDeque<O> f62118d = new ArrayDeque<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final I[] f62119e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final O[] f62120f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f62121g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f62122h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public I f62123i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public E f62124j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f62125k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f62126l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f62127m;

    /* JADX INFO: compiled from: SimpleDecoder.java */
    public class a extends Thread {
        public a(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            h.this.p();
        }
    }

    public h(I[] iArr, O[] oArr) {
        this.f62119e = iArr;
        this.f62121g = iArr.length;
        for (int i10 = 0; i10 < this.f62121g; i10++) {
            ((I[]) this.f62119e)[i10] = c();
        }
        this.f62120f = oArr;
        this.f62122h = oArr.length;
        for (int i11 = 0; i11 < this.f62122h; i11++) {
            ((O[]) this.f62120f)[i11] = d();
        }
        a aVar = new a("ExoPlayer:SimpleDecoder");
        this.f62115a = aVar;
        aVar.start();
    }

    public final boolean b() {
        return !this.f62117c.isEmpty() && this.f62122h > 0;
    }

    public abstract I c();

    public abstract O d();

    public abstract E e(Throwable th2);

    @Nullable
    public abstract E f(I i10, O o10, boolean z10);

    @Override // g6.d
    public final void flush() {
        synchronized (this.f62116b) {
            this.f62125k = true;
            this.f62127m = 0;
            I i10 = this.f62123i;
            if (i10 != null) {
                m(i10);
                this.f62123i = null;
            }
            while (!this.f62117c.isEmpty()) {
                m(this.f62117c.removeFirst());
            }
            while (!this.f62118d.isEmpty()) {
                this.f62118d.removeFirst().l();
            }
        }
    }

    public final boolean g() throws InterruptedException {
        E e10;
        synchronized (this.f62116b) {
            while (!this.f62126l && !b()) {
                this.f62116b.wait();
            }
            if (this.f62126l) {
                return false;
            }
            I iRemoveFirst = this.f62117c.removeFirst();
            O[] oArr = this.f62120f;
            int i10 = this.f62122h - 1;
            this.f62122h = i10;
            O o10 = oArr[i10];
            boolean z10 = this.f62125k;
            this.f62125k = false;
            if (iRemoveFirst.g()) {
                o10.a(4);
            } else {
                if (iRemoveFirst.f()) {
                    o10.a(Integer.MIN_VALUE);
                }
                if (iRemoveFirst.i()) {
                    o10.a(134217728);
                }
                try {
                    e10 = (E) f(iRemoveFirst, o10, z10);
                } catch (OutOfMemoryError e11) {
                    e10 = (E) e(e11);
                } catch (RuntimeException e12) {
                    e10 = (E) e(e12);
                }
                if (e10 != null) {
                    synchronized (this.f62116b) {
                        this.f62124j = e10;
                    }
                    return false;
                }
            }
            synchronized (this.f62116b) {
                if (this.f62125k) {
                    o10.l();
                } else if (o10.f()) {
                    this.f62127m++;
                    o10.l();
                } else {
                    o10.f62109d = this.f62127m;
                    this.f62127m = 0;
                    this.f62118d.addLast(o10);
                }
                m(iRemoveFirst);
            }
            return true;
        }
    }

    @Override // g6.d
    @Nullable
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final I dequeueInputBuffer() throws DecoderException {
        I i10;
        synchronized (this.f62116b) {
            k();
            s7.a.g(this.f62123i == null);
            int i11 = this.f62121g;
            if (i11 == 0) {
                i10 = null;
            } else {
                I[] iArr = this.f62119e;
                int i12 = i11 - 1;
                this.f62121g = i12;
                i10 = iArr[i12];
            }
            this.f62123i = i10;
        }
        return i10;
    }

    @Override // g6.d
    @Nullable
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final O dequeueOutputBuffer() throws DecoderException {
        synchronized (this.f62116b) {
            k();
            if (this.f62118d.isEmpty()) {
                return null;
            }
            return this.f62118d.removeFirst();
        }
    }

    public final void j() {
        if (b()) {
            this.f62116b.notify();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: E extends com.google.android.exoplayer2.decoder.DecoderException */
    public final void k() throws E, DecoderException {
        E e10 = this.f62124j;
        if (e10 != null) {
            throw e10;
        }
    }

    @Override // g6.d
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final void queueInputBuffer(I i10) throws DecoderException {
        synchronized (this.f62116b) {
            k();
            s7.a.a(i10 == this.f62123i);
            this.f62117c.addLast(i10);
            j();
            this.f62123i = null;
        }
    }

    public final void m(I i10) {
        i10.b();
        I[] iArr = this.f62119e;
        int i11 = this.f62121g;
        this.f62121g = i11 + 1;
        iArr[i11] = i10;
    }

    @CallSuper
    public void n(O o10) {
        synchronized (this.f62116b) {
            o(o10);
            j();
        }
    }

    public final void o(O o10) {
        o10.b();
        O[] oArr = this.f62120f;
        int i10 = this.f62122h;
        this.f62122h = i10 + 1;
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
        s7.a.g(this.f62121g == this.f62119e.length);
        for (I i11 : this.f62119e) {
            i11.m(i10);
        }
    }

    @Override // g6.d
    @CallSuper
    public void release() {
        synchronized (this.f62116b) {
            this.f62126l = true;
            this.f62116b.notify();
        }
        try {
            this.f62115a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
