package io.bidmachine.utils.time;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface TimeManagerInstance {
    long currentTimeMillis();

    @Nullable
    String getTimeZoneId();
}
