package com.google.common.base;

import java.util.Iterator;
import java.util.NoSuchElementException;
import y7.h;
import y7.l;

/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractIterator<T> implements Iterator<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public State f23048b = State.NOT_READY;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public T f23049c;

    public enum State {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f23051a;

        static {
            int[] iArr = new int[State.values().length];
            f23051a = iArr;
            try {
                iArr[State.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23051a[State.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public abstract T a();

    public final T b() {
        this.f23048b = State.DONE;
        return null;
    }

    public final boolean c() {
        this.f23048b = State.FAILED;
        this.f23049c = a();
        if (this.f23048b == State.DONE) {
            return false;
        }
        this.f23048b = State.READY;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        l.r(this.f23048b != State.FAILED);
        int i10 = a.f23051a[this.f23048b.ordinal()];
        if (i10 == 1) {
            return false;
        }
        if (i10 != 2) {
            return c();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f23048b = State.NOT_READY;
        T t10 = (T) h.a(this.f23049c);
        this.f23049c = null;
        return t10;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
