package com.google.common.collect;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractIterator<T> extends r2<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public State f23058b = State.NOT_READY;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public T f23059c;

    public enum State {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f23061a;

        static {
            int[] iArr = new int[State.values().length];
            f23061a = iArr;
            try {
                iArr[State.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23061a[State.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public abstract T a();

    public final T b() {
        this.f23058b = State.DONE;
        return null;
    }

    public final boolean c() {
        this.f23058b = State.FAILED;
        this.f23059c = a();
        if (this.f23058b == State.DONE) {
            return false;
        }
        this.f23058b = State.READY;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        y7.l.r(this.f23058b != State.FAILED);
        int i10 = a.f23061a[this.f23058b.ordinal()];
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
        this.f23058b = State.NOT_READY;
        T t10 = (T) c2.a(this.f23059c);
        this.f23059c = null;
        return t10;
    }
}
