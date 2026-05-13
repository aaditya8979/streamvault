package io.appmetrica.analytics.impl;

import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class V4 extends U4 {
    public V4(@NotNull Y4 y42) {
        super(y42);
    }

    @Override // io.appmetrica.analytics.impl.U4
    public final boolean b(int i10) {
        return i10 < 113;
    }

    @Override // io.appmetrica.analytics.impl.U4
    public final void c() {
        Xe xe2 = this.f65977a.f66216c;
        try {
            Vk vk2 = new Vk(xe2, A2.f64965g);
            Long lA = vk2.f66058c.a(Vk.f66050d);
            if (lA != null) {
                vk2.a(Vk.f66050d, Long.valueOf(TimeUnit.SECONDS.toMillis(lA.longValue())));
            }
            Long lA2 = vk2.f66058c.a(Vk.f66051e);
            if (lA2 != null) {
                vk2.a(Vk.f66051e, Long.valueOf(TimeUnit.SECONDS.toMillis(lA2.longValue())));
            }
        } catch (Throwable unused) {
        }
        try {
            Vk vk3 = new Vk(xe2, "foreground");
            Long lA3 = vk3.f66058c.a(Vk.f66050d);
            if (lA3 != null) {
                vk3.a(Vk.f66050d, Long.valueOf(TimeUnit.SECONDS.toMillis(lA3.longValue())));
            }
            Long lA4 = vk3.f66058c.a(Vk.f66051e);
            if (lA4 != null) {
                vk3.a(Vk.f66051e, Long.valueOf(TimeUnit.SECONDS.toMillis(lA4.longValue())));
            }
        } catch (Throwable unused2) {
        }
    }
}
