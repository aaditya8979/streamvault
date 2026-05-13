package com.yandex.div.core.player;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DivVideoResolution.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class DivVideoResolution {
    private final int height;
    private final int width;

    public DivVideoResolution(int i10, int i11) {
        this.width = i10;
        this.height = i11;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DivVideoResolution)) {
            return false;
        }
        DivVideoResolution divVideoResolution = (DivVideoResolution) obj;
        return this.width == divVideoResolution.width && this.height == divVideoResolution.height;
    }

    public int hashCode() {
        return (Integer.hashCode(this.width) * 31) + Integer.hashCode(this.height);
    }

    @NotNull
    public String toString() {
        return "DivVideoResolution(width=" + this.width + ", height=" + this.height + ')';
    }
}
