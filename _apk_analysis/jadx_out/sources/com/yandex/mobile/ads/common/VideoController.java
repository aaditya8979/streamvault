package com.yandex.mobile.ads.common;

import androidx.annotation.MainThread;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yads.jv3;
import yads.lh3;

/* JADX INFO: loaded from: classes12.dex */
@MainThread
public final class VideoController {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lh3 f59181a;

    public VideoController(@NotNull lh3 lh3Var) {
        this.f59181a = lh3Var;
    }

    public final void setVideoEventListener(@Nullable VideoEventListener videoEventListener) {
        if (videoEventListener != null) {
            this.f59181a.f91969b = new jv3(videoEventListener);
        } else {
            this.f59181a.f91969b = null;
        }
    }
}
