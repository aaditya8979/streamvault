package com.moloco.sdk.internal.error.crash.filters;

import androidx.compose.runtime.internal.StabilityInferred;
import bo.d0;
import com.moloco.sdk.BuildConfig;
import com.moloco.sdk.internal.MolocoLogger;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 1)
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f46031a = "MolocoSDKExceptionFilter";

    @Override // com.moloco.sdk.internal.error.crash.filters.a
    public boolean a(@NotNull Throwable th2) {
        p.k(th2, "crash");
        StackTraceElement[] stackTrace = th2.getStackTrace();
        p.j(stackTrace, "getStackTrace(...)");
        for (StackTraceElement stackTraceElement : stackTrace) {
            String className = stackTraceElement.getClassName();
            p.j(className, "getClassName(...)");
            if (d0.c0(className, BuildConfig.LIBRARY_PACKAGE_NAME, false, 2, null)) {
                MolocoLogger.error$default(MolocoLogger.INSTANCE, this.f46031a, "SDK detected in stacktrace", null, false, 12, null);
                return true;
            }
        }
        Throwable cause = th2.getCause();
        if (cause == null) {
            return false;
        }
        StackTraceElement[] stackTrace2 = cause.getStackTrace();
        p.j(stackTrace2, "getStackTrace(...)");
        for (StackTraceElement stackTraceElement2 : stackTrace2) {
            String className2 = stackTraceElement2.getClassName();
            p.j(className2, "getClassName(...)");
            if (d0.c0(className2, BuildConfig.LIBRARY_PACKAGE_NAME, false, 2, null)) {
                MolocoLogger.error$default(MolocoLogger.INSTANCE, this.f46031a, "SDK detected in stacktrace", null, false, 12, null);
                return true;
            }
        }
        return false;
    }
}
