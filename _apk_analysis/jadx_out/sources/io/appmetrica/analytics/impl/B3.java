package io.appmetrica.analytics.impl;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class B3 extends S7 {
    @Override // io.appmetrica.analytics.impl.S7
    public final boolean a(@NotNull C5101s3 c5101s3, @NotNull C5101s3 c5101s32) {
        if (!mo.a(c5101s32.f67660a)) {
            if (mo.a(c5101s3.f67660a)) {
                return false;
            }
            T7 t72 = c5101s3.f67661b;
            if (t72 == T7.f65926c) {
                if (((Number) this.f65869a.a(t72)).intValue() < ((Number) this.f65869a.a(c5101s32.f67661b)).intValue()) {
                    return false;
                }
            } else if (((Number) this.f65869a.a(t72)).intValue() <= ((Number) this.f65869a.a(c5101s32.f67661b)).intValue()) {
                return false;
            }
        }
        return true;
    }
}
