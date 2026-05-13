package io.bidmachine.iab.utils;

import androidx.annotation.NonNull;
import io.bidmachine.iab.utils.Logger;

/* JADX INFO: loaded from: classes12.dex */
public interface LogListener {
    void onLog(@NonNull Logger.LogLevel logLevel, @NonNull String str, @NonNull String str2);
}
