package kotlinx.coroutines.internal;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CoroutineExceptionHandlerImpl.common.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ExceptionSuccessfullyProcessed extends Exception {

    @NotNull
    public static final ExceptionSuccessfullyProcessed INSTANCE = new ExceptionSuccessfullyProcessed();

    private ExceptionSuccessfullyProcessed() {
    }
}
