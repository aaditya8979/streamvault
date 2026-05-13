package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;

/* JADX INFO: loaded from: classes7.dex */
public abstract class H4 extends AbstractC5029p5 {
    public H4(@NonNull BaseRequestConfig.ComponentLoader<Object, Object, M5> componentLoader, @NonNull C4817gm c4817gm, @NonNull BaseRequestConfig.BaseRequestArguments<C5028p4, Object> baseRequestArguments) {
        super(componentLoader, c4817gm, baseRequestArguments);
    }

    public final synchronized void a(@NonNull C5028p4 c5028p4) {
        super.a((Object) c5028p4);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC5029p5
    public final void a(@NonNull Object obj) {
        C5028p4 c5028p4 = (C5028p4) obj;
        synchronized (this) {
            super.a((Object) c5028p4);
        }
    }
}
