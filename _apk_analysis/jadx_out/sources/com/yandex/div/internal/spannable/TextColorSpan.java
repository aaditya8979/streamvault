package com.yandex.div.internal.spannable;

import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TextColorSpan.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class TextColorSpan extends ForegroundColorSpan {
    public TextColorSpan(int i10) {
        super(i10);
    }

    @Override // android.text.style.ForegroundColorSpan, android.text.style.CharacterStyle
    public void updateDrawState(@NotNull TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setShader(null);
    }
}
