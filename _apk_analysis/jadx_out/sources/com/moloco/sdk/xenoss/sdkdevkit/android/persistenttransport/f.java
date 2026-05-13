package com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public interface f {

    public static final class a {
        public static /* synthetic */ void a(f fVar, String str, byte[] bArr, gl.f fVar2, String str2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendPost");
            }
            if ((i10 & 8) != 0) {
                str2 = null;
            }
            fVar.a(str, bArr, fVar2, str2);
        }
    }

    void a(@NotNull String str);

    void a(@NotNull String str, @NotNull byte[] bArr, @NotNull gl.f fVar, @Nullable String str2);
}
