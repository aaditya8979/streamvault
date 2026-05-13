package com.yandex.div.internal.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import com.yandex.div.core.widget.FixedLineHeightHelper;
import com.yandex.div.core.widget.FixedLineHeightView;
import com.yandex.div.core.widget.ViewsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import zn.n;

/* JADX INFO: compiled from: SuperLineHeightTextView.kt */
/* JADX INFO: loaded from: classes3.dex */
public class SuperLineHeightTextView extends AppCompatTextView implements FixedLineHeightView {

    @NotNull
    private final FixedLineHeightHelper fixedLineHeightHelper;
    private boolean isTightenWidth;

    public SuperLineHeightTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public SuperLineHeightTextView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.fixedLineHeightHelper = new FixedLineHeightHelper(this);
    }

    public /* synthetic */ SuperLineHeightTextView(Context context, AttributeSet attributeSet, int i10, int i11, i iVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    private final int getVisibleLineCount() {
        return Math.min(getLineCount(), getMaxLines());
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingBottom() {
        return super.getCompoundPaddingBottom() + this.fixedLineHeightHelper.getExtraPaddingBottom();
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingTop() {
        return super.getCompoundPaddingTop() + this.fixedLineHeightHelper.getExtraPaddingTop();
    }

    public int getFixedLineHeight() {
        return this.fixedLineHeightHelper.getLineHeight();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        FixedLineHeightHelper fixedLineHeightHelper = this.fixedLineHeightHelper;
        int iMin = Math.min(getLineCount(), getMaxLines());
        if (fixedLineHeightHelper.getLineHeight() != -1 && !ViewsKt.isExact(i11)) {
            int iE = n.e(TextViewsKt.textHeight(fixedLineHeightHelper.view, iMin) + (iMin >= fixedLineHeightHelper.view.getLineCount() ? fixedLineHeightHelper.textPaddingTop + fixedLineHeightHelper.textPaddingBottom : 0) + fixedLineHeightHelper.view.getPaddingTop() + fixedLineHeightHelper.view.getPaddingBottom(), fixedLineHeightHelper.view.getMinimumHeight());
            super.setMeasuredDimension(getMeasuredWidthAndState(), View.MeasureSpec.getMode(i11) == Integer.MIN_VALUE ? ViewsKt.makeAtMostSpec(Math.min(iE, View.MeasureSpec.getSize(i11))) : ViewsKt.makeExactSpec(iE));
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        DivLayoutParams divLayoutParams = layoutParams instanceof DivLayoutParams ? (DivLayoutParams) layoutParams : null;
        if (divLayoutParams != null && this.isTightenWidth && ((ViewGroup.MarginLayoutParams) divLayoutParams).width == -3 && divLayoutParams.getMaxWidth() != Integer.MAX_VALUE) {
            int lineCount = getLayout().getLineCount();
            float fMax = 0.0f;
            for (int i12 = 0; i12 < lineCount; i12++) {
                fMax = Math.max(fMax, getLayout().getLineWidth(i12));
            }
            int iCeil = (int) Math.ceil(fMax + getCompoundPaddingLeft() + getCompoundPaddingRight());
            if (iCeil < getMeasuredWidth()) {
                super.setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(iCeil, View.MeasureSpec.getMode(getMeasuredWidthAndState())), getMeasuredHeightAndState());
            }
        }
    }

    @Override // com.yandex.div.core.widget.FixedLineHeightView
    public void setFixedLineHeight(int i10) {
        this.fixedLineHeightHelper.setLineHeight(i10);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setTextSize(int i10, float f10) {
        super.setTextSize(i10, f10);
        this.fixedLineHeightHelper.onFontSizeChanged();
    }

    public final void setTightenWidth(boolean z10) {
        boolean z11 = this.isTightenWidth;
        this.isTightenWidth = z10;
        if (z11 != z10) {
            requestLayout();
        }
    }
}
