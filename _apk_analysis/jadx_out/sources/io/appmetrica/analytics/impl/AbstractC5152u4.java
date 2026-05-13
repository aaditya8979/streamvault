package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.HashMap;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.u4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC5152u4 extends Bd {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f67768f;

    public AbstractC5152u4(int i10, String str, Object obj, to toVar, K2 k22) {
        super(i10, str, toVar, k22);
        this.f67768f = obj;
    }

    @Override // io.appmetrica.analytics.impl.Bd, io.appmetrica.analytics.impl.InterfaceC4793fo
    public final void a(@NonNull C4767eo c4767eo) {
        if (f()) {
            K2 k22 = this.f65040d;
            int i10 = this.f65038b;
            C4819go c4819goA = k22.a(c4767eo, (C4819go) ((HashMap) c4767eo.f66715a.get(i10)).get(this.f65037a), this);
            if (c4819goA != null) {
                a(c4819goA);
            }
        }
    }

    public abstract void a(@NonNull C4819go c4819go);

    @NonNull
    public final Object g() {
        return this.f67768f;
    }
}
