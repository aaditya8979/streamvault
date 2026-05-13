package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer;

import android.view.View;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r;
import go.u;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public interface h extends r {
    @Nullable
    View N();

    @Nullable
    Object a(@NotNull hn.c<? super bn.r> cVar);

    void a(@Nullable String str);

    void b(boolean z10);

    @NotNull
    u<l> f();

    @NotNull
    u<a> isPlaying();

    @NotNull
    u<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i> o();

    void pause();

    void play();

    void seekTo(long j10);
}
