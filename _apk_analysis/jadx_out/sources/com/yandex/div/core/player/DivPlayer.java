package com.yandex.div.core.player;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DivPlayer.kt */
/* JADX INFO: loaded from: classes11.dex */
public interface DivPlayer {

    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: DivPlayer.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: DivPlayer.kt */
    public interface Observer {
    }

    default void addObserver(@NotNull Observer observer) {
    }

    default void pause() {
    }

    default void play() {
    }

    default void release() {
    }

    default void seek(long j10) {
    }

    default void setMuted(boolean z10) {
    }
}
