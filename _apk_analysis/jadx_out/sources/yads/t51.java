package yads;

import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
public final class t51 implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f95068b;

    public t51(Object[] objArr) {
        this.f95068b = objArr;
    }

    public Object readResolve() {
        Object[] objArr = this.f95068b;
        int length = objArr.length;
        return length != 0 ? length != 1 ? u51.b(objArr.length, (Object[]) objArr.clone()) : new xz2(objArr[0]) : ym2.f97232j;
    }
}
