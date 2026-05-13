package yads;

import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class ox1 implements y43, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f93353b;

    public ox1(int i10) {
        this.f93353b = kx.a(i10, "expectedValuesPerKey");
    }

    @Override // yads.y43
    public final Object get() {
        return new ArrayList(this.f93353b);
    }
}
