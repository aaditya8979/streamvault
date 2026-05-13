package io.appmetrica.analytics.impl;

import android.content.Context;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.bc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4678bc implements InterfaceC4825h4 {
    @Override // io.appmetrica.analytics.impl.InterfaceC4825h4
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C5177v4 a(@NotNull Context context, @NotNull C4748e5 c4748e5, @NotNull Q3 q32, @NotNull C5053q4 c5053q4) {
        C5252y4 c5252y4;
        C5202w4 c5202w4 = new C5202w4(q32.f65784b);
        C5277z4 c5277z4 = new C5277z4();
        synchronized (c4748e5) {
            c5252y4 = (C5252y4) c4748e5.a(c5202w4, c5053q4, c5277z4, c4748e5.f66652b);
        }
        return new C5177v4(context, c5252y4, c5053q4);
    }
}
