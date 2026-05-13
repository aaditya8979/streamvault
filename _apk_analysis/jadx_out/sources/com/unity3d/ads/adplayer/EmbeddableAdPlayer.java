package com.unity3d.ads.adplayer;

import androidx.annotation.CallSuper;
import bn.r;
import com.unity3d.ads.adplayer.AdPlayer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: EmbeddableAdPlayer.kt */
/* JADX INFO: loaded from: classes11.dex */
public interface EmbeddableAdPlayer extends AdPlayer {

    /* JADX INFO: compiled from: EmbeddableAdPlayer.kt */
    public static final class DefaultImpls {
        @CallSuper
        @Nullable
        public static Object destroy(@NotNull EmbeddableAdPlayer embeddableAdPlayer, @NotNull hn.c<? super r> cVar) {
            Object objDestroy = AdPlayer.DefaultImpls.destroy(embeddableAdPlayer, cVar);
            return objDestroy == in.a.g() ? objDestroy : r.f5635a;
        }

        public static void show(@NotNull EmbeddableAdPlayer embeddableAdPlayer, @NotNull ShowOptions showOptions) {
            p.k(showOptions, "showOptions");
            AdPlayer.DefaultImpls.show(embeddableAdPlayer, showOptions);
        }
    }
}
