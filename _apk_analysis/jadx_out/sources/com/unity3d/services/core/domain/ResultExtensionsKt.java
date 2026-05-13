package com.unity3d.services.core.domain;

import androidx.exifinterface.media.ExifInterface;
import com.unity3d.services.core.domain.task.InitializationException;
import kotlin.Result;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: ResultExtensions.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class ResultExtensionsKt {
    public static final /* synthetic */ <E extends Exception> E getCustomExceptionOrNull(Object obj) {
        Throwable thM7537exceptionOrNullimpl = Result.m7537exceptionOrNullimpl(obj);
        p.q(3, ExifInterface.LONGITUDE_EAST);
        if (thM7537exceptionOrNullimpl instanceof Exception) {
            return (E) thM7537exceptionOrNullimpl;
        }
        return null;
    }

    public static final /* synthetic */ <E extends Exception> E getCustomExceptionOrThrow(Object obj) {
        Throwable thM7537exceptionOrNullimpl = Result.m7537exceptionOrNullimpl(obj);
        p.q(3, ExifInterface.LONGITUDE_EAST);
        if (thM7537exceptionOrNullimpl instanceof Exception) {
            return (E) thM7537exceptionOrNullimpl;
        }
        throw new IllegalArgumentException("Wrong Exception type found");
    }

    @Nullable
    public static final InitializationException getInitializationExceptionOrNull(@NotNull Object obj) {
        Throwable thM7537exceptionOrNullimpl = Result.m7537exceptionOrNullimpl(obj);
        if (thM7537exceptionOrNullimpl instanceof InitializationException) {
            return (InitializationException) thM7537exceptionOrNullimpl;
        }
        return null;
    }

    @NotNull
    public static final InitializationException getInitializationExceptionOrThrow(@NotNull Object obj) {
        Throwable thM7537exceptionOrNullimpl = Result.m7537exceptionOrNullimpl(obj);
        if (thM7537exceptionOrNullimpl instanceof InitializationException) {
            return (InitializationException) thM7537exceptionOrNullimpl;
        }
        throw new IllegalArgumentException("Wrong Exception type found");
    }
}
