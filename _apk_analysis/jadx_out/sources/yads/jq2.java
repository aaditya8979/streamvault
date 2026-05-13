package yads;

import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class jq2 extends sa2 implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final jq2 f91329b = new jq2();
    private static final long serialVersionUID = 0;

    private Object readResolve() {
        return f91329b;
    }

    @Override // yads.sa2
    public final sa2 a() {
        return y72.f97019b;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}
