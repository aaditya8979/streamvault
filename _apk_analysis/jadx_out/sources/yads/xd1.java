package yads;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes11.dex */
public final class xd1 extends ja3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f96718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f96719c;

    public xd1(Object obj) {
        this.f96719c = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f96718b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f96718b) {
            throw new NoSuchElementException();
        }
        this.f96718b = true;
        return this.f96719c;
    }
}
