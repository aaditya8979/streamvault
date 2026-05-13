package io.appmetrica.analytics.impl;

import android.os.Process;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.nb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4985nb implements InterfaceC4687bl {
    @Override // io.appmetrica.analytics.impl.InterfaceC4687bl
    public final boolean a(@NotNull C4909kb c4909kb) {
        Integer num = c4909kb.f67114f;
        return num == null || num.intValue() != Process.myPid();
    }
}
