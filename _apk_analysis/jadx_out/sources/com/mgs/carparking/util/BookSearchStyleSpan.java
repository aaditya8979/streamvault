package com.mgs.carparking.util;

import android.text.TextPaint;
import android.text.style.StyleSpan;
import androidx.core.content.ContextCompat;
import com.dramarush.shortin.R;
import me.goldze.mvvmhabit.base.BaseApplication;

/* JADX INFO: loaded from: classes11.dex */
public class BookSearchStyleSpan extends StyleSpan {
    public BookSearchStyleSpan(int i10) {
        super(i10);
    }

    @Override // android.text.style.StyleSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        textPaint.setFakeBoldText(true);
        textPaint.setColor(ContextCompat.getColor(BaseApplication.getInstance(), R.color.color_commen));
        super.updateDrawState(textPaint);
    }

    @Override // android.text.style.StyleSpan, android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        textPaint.setFakeBoldText(true);
        super.updateMeasureState(textPaint);
    }
}
