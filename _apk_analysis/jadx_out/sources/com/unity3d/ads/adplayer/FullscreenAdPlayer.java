package com.unity3d.ads.adplayer;

import androidx.annotation.CallSuper;
import bn.r;
import com.unity3d.ads.adplayer.AdPlayer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: FullscreenAdPlayer.kt */
/* JADX INFO: loaded from: classes9.dex */
public interface FullscreenAdPlayer extends AdPlayer {

    /* JADX INFO: compiled from: FullscreenAdPlayer.kt */
    public static final class DefaultImpls {
        @CallSuper
        @Nullable
        public static Object destroy(@NotNull FullscreenAdPlayer fullscreenAdPlayer, @NotNull hn.c<? super r> cVar) {
            Object objDestroy = AdPlayer.DefaultImpls.destroy(fullscreenAdPlayer, cVar);
            return objDestroy == in.a.g() ? objDestroy : r.f5635a;
        }

        public static void show(@NotNull FullscreenAdPlayer fullscreenAdPlayer, @NotNull ShowOptions showOptions) {
            p.k(showOptions, "showOptions");
            AdPlayer.DefaultImpls.show(fullscreenAdPlayer, showOptions);
        }
    }
}
