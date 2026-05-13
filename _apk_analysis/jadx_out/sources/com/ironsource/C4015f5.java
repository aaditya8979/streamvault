package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.f5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C4015f5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C4015f5 f31688a = new C4015f5();

    private C4015f5() {
    }

    public final boolean a(@Nullable IronSourceError ironSourceError) {
        if (ironSourceError == null) {
            return false;
        }
        int errorCode = ironSourceError.getErrorCode();
        return errorCode == 524 || errorCode == 530;
    }
}
