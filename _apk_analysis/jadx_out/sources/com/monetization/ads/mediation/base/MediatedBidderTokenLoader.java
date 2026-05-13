package com.monetization.ads.mediation.base;

import android.content.Context;
import androidx.annotation.WorkerThread;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public interface MediatedBidderTokenLoader {
    @WorkerThread
    void loadBidderToken(@NotNull Context context, @NotNull Map<String, String> map, @NotNull MediatedBidderTokenLoadListener mediatedBidderTokenLoadListener);
}
