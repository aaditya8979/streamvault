package yads;

import java.io.Serializable;

/* JADX INFO: loaded from: classes6.dex */
public final class k51 extends b0 implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f91490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f91491c;

    public k51(Object obj, Object obj2) {
        this.f91490b = obj;
        this.f91491c = obj2;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f91490b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f91491c;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
