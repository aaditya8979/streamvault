package io.appmetrica.analytics;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public interface ICrashTransformer {
    @Nullable
    Throwable process(@NonNull Throwable th2);
}
