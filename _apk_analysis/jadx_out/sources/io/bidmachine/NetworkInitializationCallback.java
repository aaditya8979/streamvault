package io.bidmachine;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public interface NetworkInitializationCallback {
    void onFail(@NonNull String str);

    void onSuccess();
}
