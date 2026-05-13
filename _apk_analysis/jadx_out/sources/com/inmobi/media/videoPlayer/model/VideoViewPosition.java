package com.inmobi.media.videoPlayer.model;

import androidx.annotation.Keep;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Keep
public final class VideoViewPosition {
    private int height;

    @Nullable
    private String orientation;
    private int width;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f28378x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f28379y;

    public final int getHeight() {
        return this.height;
    }

    @Nullable
    public final String getOrientation() {
        return this.orientation;
    }

    public final int getWidth() {
        return this.width;
    }

    public final int getX() {
        return this.f28378x;
    }

    public final int getY() {
        return this.f28379y;
    }

    public final void setHeight(int i10) {
        this.height = i10;
    }

    public final void setOrientation(@Nullable String str) {
        this.orientation = str;
    }

    public final void setWidth(int i10) {
        this.width = i10;
    }

    public final void setX(int i10) {
        this.f28378x = i10;
    }

    public final void setY(int i10) {
        this.f28379y = i10;
    }
}
