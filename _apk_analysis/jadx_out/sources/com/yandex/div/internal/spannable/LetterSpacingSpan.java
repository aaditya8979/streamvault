package com.yandex.div.internal.spannable;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LetterSpacingSpan.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class LetterSpacingSpan extends MetricAffectingSpan {
    private final float letterSpacing;

    public LetterSpacingSpan(float f10) {
        this.letterSpacing = f10;
    }

    private final void apply(TextPaint textPaint) {
        textPaint.setLetterSpacing(this.letterSpacing);
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(@NotNull TextPaint textPaint) {
        apply(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(@NotNull TextPaint textPaint) {
        apply(textPaint);
    }
}
