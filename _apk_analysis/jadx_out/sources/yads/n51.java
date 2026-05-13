package yads;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class n51 implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f92743b;

    public n51(Object[] objArr) {
        this.f92743b = objArr;
    }

    public Object readResolve() {
        return p51.b(this.f92743b);
    }
}
