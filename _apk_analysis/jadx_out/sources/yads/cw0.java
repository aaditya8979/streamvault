package yads;

import android.util.SparseBooleanArray;

/* JADX INFO: loaded from: classes4.dex */
public final class cw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseBooleanArray f88631a = new SparseBooleanArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f88632b;

    public final cw0 a(int i10) {
        if (!(!this.f88632b)) {
            throw new IllegalStateException();
        }
        this.f88631a.append(i10, true);
        return this;
    }

    public final dw0 a() {
        if (!(!this.f88632b)) {
            throw new IllegalStateException();
        }
        this.f88632b = true;
        return new dw0(this.f88631a);
    }
}
