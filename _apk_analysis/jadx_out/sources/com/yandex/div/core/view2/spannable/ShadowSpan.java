package com.yandex.div.core.view2.spannable;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ShadowSpan.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class ShadowSpan extends CharacterStyle {

    @NotNull
    private final ShadowData shadow;

    public ShadowSpan(@NotNull ShadowData shadowData) {
        this.shadow = shadowData;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(@Nullable TextPaint textPaint) {
        ShadowData shadowData = this.shadow;
        if (textPaint != null) {
            textPaint.setShadowLayer(shadowData.getRadius(), shadowData.getOffsetX(), shadowData.getOffsetY(), shadowData.getColor());
        }
    }
}
