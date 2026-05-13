package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class Hb implements InterfaceC4900k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4978n4 f65311a;

    public Hb(@NonNull C4978n4 c4978n4) {
        this.f65311a = c4978n4;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4900k2
    @Nullable
    public final C4819go a(@NonNull C4767eo c4767eo, @NonNull C4819go c4819go) {
        int i10 = c4767eo.f66716b;
        int i11 = this.f65311a.f67324a;
        if (i10 == i11) {
            if (((C4819go) ((HashMap) c4767eo.f66715a.get(c4819go.f66881b)).get(new String(c4819go.f66880a))) != null) {
                ((HashMap) c4767eo.f66715a.get(c4819go.f66881b)).put(new String(c4819go.f66880a), c4819go);
            }
        } else if (i10 < i11) {
            ((HashMap) c4767eo.f66715a.get(c4819go.f66881b)).put(new String(c4819go.f66880a), c4819go);
            c4767eo.f66716b++;
        }
        return c4819go;
    }
}
