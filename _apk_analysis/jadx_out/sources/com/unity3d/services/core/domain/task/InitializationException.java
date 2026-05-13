package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.ErrorState;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: InitializationException.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class InitializationException extends Exception {

    @NotNull
    private final Configuration config;

    @NotNull
    private final ErrorState errorState;

    @NotNull
    private final Exception originalException;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializationException(@NotNull ErrorState errorState, @NotNull Exception exc, @NotNull Configuration configuration) {
        super(exc);
        p.k(errorState, "errorState");
        p.k(exc, "originalException");
        p.k(configuration, "config");
        this.errorState = errorState;
        this.originalException = exc;
        this.config = configuration;
    }

    public static /* synthetic */ InitializationException copy$default(InitializationException initializationException, ErrorState errorState, Exception exc, Configuration configuration, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            errorState = initializationException.errorState;
        }
        if ((i10 & 2) != 0) {
            exc = initializationException.originalException;
        }
        if ((i10 & 4) != 0) {
            configuration = initializationException.config;
        }
        return initializationException.copy(errorState, exc, configuration);
    }

    @NotNull
    public final ErrorState component1() {
        return this.errorState;
    }

    @NotNull
    public final Exception component2() {
        return this.originalException;
    }

    @NotNull
    public final Configuration component3() {
        return this.config;
    }

    @NotNull
    public final InitializationException copy(@NotNull ErrorState errorState, @NotNull Exception exc, @NotNull Configuration configuration) {
        p.k(errorState, "errorState");
        p.k(exc, "originalException");
        p.k(configuration, "config");
        return new InitializationException(errorState, exc, configuration);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InitializationException)) {
            return false;
        }
        InitializationException initializationException = (InitializationException) obj;
        return this.errorState == initializationException.errorState && p.f(this.originalException, initializationException.originalException) && p.f(this.config, initializationException.config);
    }

    @NotNull
    public final Configuration getConfig() {
        return this.config;
    }

    @NotNull
    public final ErrorState getErrorState() {
        return this.errorState;
    }

    @NotNull
    public final Exception getOriginalException() {
        return this.originalException;
    }

    public int hashCode() {
        return (((this.errorState.hashCode() * 31) + this.originalException.hashCode()) * 31) + this.config.hashCode();
    }

    @Override // java.lang.Throwable
    @NotNull
    public String toString() {
        return "InitializationException(errorState=" + this.errorState + ", originalException=" + this.originalException + ", config=" + this.config + ')';
    }
}
