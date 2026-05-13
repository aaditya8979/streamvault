package com.ironsource;

import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public interface F4 {
    static /* synthetic */ String a(F4 f42, String str, String str2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getString");
        }
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return f42.a(str, str2);
    }

    @Nullable
    String a(@NotNull String str, @Nullable String str2);

    void a(@NotNull String str);

    @NotNull
    Map<String, ?> allData();

    void b(@NotNull String str, @NotNull String str2);
}
