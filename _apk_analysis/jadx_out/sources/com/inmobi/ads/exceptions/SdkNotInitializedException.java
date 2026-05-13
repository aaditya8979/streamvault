package com.inmobi.ads.exceptions;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: loaded from: classes4.dex */
@Keep
public final class SdkNotInitializedException extends IllegalStateException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SdkNotInitializedException(@NotNull String str) {
        super("Please initialize the SDK before creating " + str + " ad");
        p.k(str, "adType");
    }
}
