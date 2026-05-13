package com.yandex.div.core.dagger;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;

/* JADX INFO: compiled from: ExternalOptional.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class ExternalOptional<T> {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final ch.b<T> optional;

    /* JADX INFO: compiled from: ExternalOptional.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        @NotNull
        public final <T> ExternalOptional<T> empty() {
            return new ExternalOptional<>(ch.b.f6566b.a());
        }

        @NotNull
        public final <T> ExternalOptional<T> of(@NotNull T t10) {
            return new ExternalOptional<>(ch.b.f6566b.b(t10));
        }

        @NotNull
        public final <T> ExternalOptional<T> ofNullable(@Nullable T t10) {
            return t10 != null ? of(t10) : empty();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ExternalOptional(@NotNull ch.b<? extends T> bVar) {
        this.optional = bVar;
    }

    @NotNull
    public static final <T> ExternalOptional<T> empty() {
        return Companion.empty();
    }

    @NotNull
    public static final <T> ExternalOptional<T> of(@NotNull T t10) {
        return Companion.of(t10);
    }

    @NotNull
    public final ch.b<T> getOptional() {
        return this.optional;
    }
}
