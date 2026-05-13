package com.yandex.div.core.image;

import android.content.Context;
import bo.a0;
import bo.d0;
import cn.v;
import com.yandex.div.core.images.DivImageDownloadCallback;
import com.yandex.div.core.images.DivImageLoader;
import com.yandex.div.core.images.LoadReference;
import com.yandex.div.svg.SvgDivImageLoader;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: DivImageLoaderWrapper.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class DivImageLoaderWrapper implements DivImageLoader {

    @NotNull
    private final List<DivImageUrlModifier> modifiers = v.e(new DivImageAssetUrlModifier());

    @NotNull
    private final DivImageLoader providedImageLoader;

    @Nullable
    private final SvgDivImageLoader svgImageLoader;

    public DivImageLoaderWrapper(@NotNull DivImageLoader divImageLoader, @NotNull Context context) {
        this.providedImageLoader = divImageLoader;
        this.svgImageLoader = divImageLoader.hasSvgSupport().booleanValue() ^ true ? new SvgDivImageLoader(context) : null;
    }

    private final String getModifiedUrl(String str) {
        Iterator<T> it = this.modifiers.iterator();
        while (it.hasNext()) {
            str = ((DivImageUrlModifier) it.next()).modifyImageUrl(str);
        }
        return str;
    }

    private final DivImageLoader getProperLoader(String str) {
        return (this.svgImageLoader == null || !isSvg(str)) ? this.providedImageLoader : this.svgImageLoader;
    }

    private final boolean isSvg(String str) {
        int iQ0 = d0.q0(str, '?', 0, false, 6, null);
        if (iQ0 < 0) {
            iQ0 = str.length();
        }
        String strSubstring = str.substring(0, iQ0);
        p.j(strSubstring, "substring(...)");
        return a0.I(strSubstring, ".svg", false, 2, null);
    }

    @Override // com.yandex.div.core.images.DivImageLoader
    @NotNull
    public LoadReference loadImage(@NotNull String str, @NotNull DivImageDownloadCallback divImageDownloadCallback) {
        String modifiedUrl = getModifiedUrl(str);
        return getProperLoader(modifiedUrl).loadImage(modifiedUrl, divImageDownloadCallback);
    }

    @Override // com.yandex.div.core.images.DivImageLoader
    @NotNull
    public LoadReference loadImageBytes(@NotNull String str, @NotNull DivImageDownloadCallback divImageDownloadCallback) {
        String modifiedUrl = getModifiedUrl(str);
        return getProperLoader(modifiedUrl).loadImageBytes(modifiedUrl, divImageDownloadCallback);
    }
}
