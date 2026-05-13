package com.yandex.div.core.image;

import bo.a0;
import bo.d0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DivImageAssetUrlModifier.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class DivImageAssetUrlModifier implements DivImageUrlModifier {
    @Override // com.yandex.div.core.image.DivImageUrlModifier
    @NotNull
    public String modifyImageUrl(@NotNull String str) {
        if (!a0.W(str, "divkit-asset", false, 2, null)) {
            return str;
        }
        return "file:///android_asset/divkit/" + d0.L0(str, "divkit-asset://");
    }
}
