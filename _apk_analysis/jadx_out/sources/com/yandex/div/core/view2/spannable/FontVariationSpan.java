package com.yandex.div.core.view2.spannable;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import androidx.annotation.RequiresApi;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FontVariationSpan.kt */
/* JADX INFO: loaded from: classes4.dex */
@RequiresApi(26)
public final class FontVariationSpan extends MetricAffectingSpan {

    @Nullable
    private final String settings;

    public FontVariationSpan(@Nullable String str) {
        this.settings = str;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(@NotNull TextPaint textPaint) {
        textPaint.setFontVariationSettings(this.settings);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(@NotNull TextPaint textPaint) {
        textPaint.setFontVariationSettings(this.settings);
    }
}
