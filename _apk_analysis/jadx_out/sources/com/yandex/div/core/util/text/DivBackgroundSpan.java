package com.yandex.div.core.util.text;

import android.text.TextPaint;
import android.text.style.UnderlineSpan;
import com.yandex.div2.DivTextRangeBackground;
import com.yandex.div2.DivTextRangeBorder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DivBackgroundSpan.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class DivBackgroundSpan extends UnderlineSpan {

    @Nullable
    private final DivTextRangeBackground background;

    @Nullable
    private final DivTextRangeBorder border;

    public DivBackgroundSpan(@Nullable DivTextRangeBorder divTextRangeBorder, @Nullable DivTextRangeBackground divTextRangeBackground) {
        this.border = divTextRangeBorder;
        this.background = divTextRangeBackground;
    }

    @Nullable
    public final DivTextRangeBackground getBackground() {
        return this.background;
    }

    @Nullable
    public final DivTextRangeBorder getBorder() {
        return this.border;
    }

    @Override // android.text.style.UnderlineSpan, android.text.style.CharacterStyle
    public void updateDrawState(@NotNull TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
