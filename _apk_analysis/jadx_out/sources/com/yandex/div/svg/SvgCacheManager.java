package com.yandex.div.svg;

import android.graphics.drawable.PictureDrawable;
import java.util.WeakHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SvgCacheManager.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class SvgCacheManager {

    @NotNull
    private final WeakHashMap<String, PictureDrawable> cache = new WeakHashMap<>();

    @Nullable
    public final PictureDrawable get(@NotNull String str) {
        return this.cache.get(str);
    }

    public final void set(@NotNull String str, @NotNull PictureDrawable pictureDrawable) {
        this.cache.put(str, pictureDrawable);
    }
}
