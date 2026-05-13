package com.yandex.div.core.player;

import android.net.Uri;
import com.yandex.div.core.DivPreloader;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DivPlayerPreloader.kt */
/* JADX INFO: loaded from: classes6.dex */
public interface DivPlayerPreloader {

    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    @NotNull
    public static final DivPlayerPreloader STUB = new DivPlayerPreloader() { // from class: com.yandex.div.core.player.DivPlayerPreloader$Companion$STUB$1
        @Override // com.yandex.div.core.player.DivPlayerPreloader
        @NotNull
        public DivPreloader.PreloadReference preloadVideo(@NotNull List<? extends Uri> list) {
            return DivPreloader.PreloadReference.Companion.getEMPTY();
        }
    };

    /* JADX INFO: compiled from: DivPlayerPreloader.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    @NotNull
    DivPreloader.PreloadReference preloadVideo(@NotNull List<? extends Uri> list);
}
