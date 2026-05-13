package com.yandex.div.internal.spannable;

import android.text.TextPaint;
import android.text.style.UnderlineSpan;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: NoUnderlineSpan.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class NoUnderlineSpan extends UnderlineSpan {
    @Override // android.text.style.UnderlineSpan, android.text.style.CharacterStyle
    public void updateDrawState(@NotNull TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
