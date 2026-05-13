package com.yandex.div.internal.spannable;

import android.text.TextPaint;
import android.text.style.StrikethroughSpan;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: NoStrikethroughSpan.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class NoStrikethroughSpan extends StrikethroughSpan {
    @Override // android.text.style.StrikethroughSpan, android.text.style.CharacterStyle
    public void updateDrawState(@NotNull TextPaint textPaint) {
        textPaint.setStrikeThruText(false);
    }
}
