package yads;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class yd1 implements Iterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final yd1 f97088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ yd1[] f97089c;

    static {
        yd1 yd1Var = new yd1();
        f97088b = yd1Var;
        f97089c = new yd1[]{yd1Var};
    }

    public static yd1 valueOf(String str) {
        return (yd1) Enum.valueOf(yd1.class, str);
    }

    public static yd1[] values() {
        return (yd1[]) f97089c.clone();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new IllegalStateException("no calls to next() since the last call to remove()");
    }
}
