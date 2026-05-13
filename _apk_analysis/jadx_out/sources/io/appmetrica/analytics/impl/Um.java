package io.appmetrica.analytics.impl;

import android.content.Context;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class Um extends Di {
    public Um(@NotNull Context context, @NotNull String str) {
        super(context, str, "array");
    }

    @Override // io.appmetrica.analytics.impl.Di
    public final Object a(int i10) {
        return this.f65158a.getResources().getStringArray(i10);
    }

    @Nullable
    public final String[] b(int i10) {
        return this.f65158a.getResources().getStringArray(i10);
    }
}
