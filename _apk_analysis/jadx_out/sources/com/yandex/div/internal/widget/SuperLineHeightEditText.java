package com.yandex.div.internal.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatEditText;
import com.yandex.div.core.widget.FixedLineHeightHelper;
import com.yandex.div.core.widget.FixedLineHeightView;
import com.yandex.div.core.widget.ViewsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import zn.n;

/* JADX INFO: compiled from: SuperLineHeightEditText.kt */
/* JADX INFO: loaded from: classes11.dex */
public class SuperLineHeightEditText extends AppCompatEditText implements FixedLineHeightView {
    private int currentLineCount;

    @NotNull
    private final FixedLineHeightHelper fixedLineHeightHelper;
    private boolean horizontalScrollingEnabled;
    private boolean isDisallowInterceptTouchEvent;
    private boolean isTextFitting;

    public SuperLineHeightEditText(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public SuperLineHeightEditText(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.isTextFitting = true;
        this.fixedLineHeightHelper = new FixedLineHeightHelper(this);
    }

    public /* synthetic */ SuperLineHeightEditText(Context context, AttributeSet attributeSet, int i10, int i11, i iVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    private final boolean getInterceptTouchEventNeeded() {
        return (this.horizontalScrollingEnabled || this.isTextFitting) ? false : true;
    }

    private final int getVisibleLineCount() {
        if (getLineCount() == 0) {
            return 1;
        }
        return getLineCount() > getMaxLines() ? getMaxLines() : getLineCount();
    }

    private final void remeasureWrapContentConstrained() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        boolean z10 = false;
        if (layoutParams != null && layoutParams.height == -3) {
            z10 = true;
        }
        if (!z10) {
            this.currentLineCount = getLineCount() != 0 ? getLineCount() > getMaxLines() ? getMaxLines() : getLineCount() : 1;
            return;
        }
        if (this.currentLineCount != (getLineCount() == 0 ? 1 : getLineCount() > getMaxLines() ? getMaxLines() : getLineCount())) {
            this.currentLineCount = getLineCount() != 0 ? getLineCount() > getMaxLines() ? getMaxLines() : getLineCount() : 1;
            requestLayout();
        }
    }

    private final void requestDisallowInterceptTouchEvent(boolean z10) {
        this.isDisallowInterceptTouchEvent = z10;
        getParent().requestDisallowInterceptTouchEvent(z10);
    }

    private final void updateFittingText(int i10) {
        if (getLayout() == null || i10 == 0) {
            return;
        }
        this.isTextFitting = (i10 - getCompoundPaddingTop()) - getCompoundPaddingBottom() >= TextViewsKt.textHeight(this, getLayout().getLineCount());
    }

    public static /* synthetic */ void updateFittingText$default(SuperLineHeightEditText superLineHeightEditText, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateFittingText");
        }
        if ((i11 & 1) != 0) {
            i10 = superLineHeightEditText.getHeight();
        }
        superLineHeightEditText.updateFittingText(i10);
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

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        FixedLineHeightHelper fixedLineHeightHelper = this.fixedLineHeightHelper;
        int maxLines = getLineCount() == 0 ? 1 : getLineCount() > getMaxLines() ? getMaxLines() : getLineCount();
        if (fixedLineHeightHelper.getLineHeight() == -1 || ViewsKt.isExact(i11)) {
            return;
        }
        int iE = n.e(TextViewsKt.textHeight(fixedLineHeightHelper.view, maxLines) + (maxLines >= fixedLineHeightHelper.view.getLineCount() ? fixedLineHeightHelper.textPaddingTop + fixedLineHeightHelper.textPaddingBottom : 0) + fixedLineHeightHelper.view.getPaddingTop() + fixedLineHeightHelper.view.getPaddingBottom(), fixedLineHeightHelper.view.getMinimumHeight());
        super.setMeasuredDimension(getMeasuredWidthAndState(), View.MeasureSpec.getMode(i11) == Integer.MIN_VALUE ? ViewsKt.makeAtMostSpec(Math.min(iE, View.MeasureSpec.getSize(i11))) : ViewsKt.makeExactSpec(iE));
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        updateFittingText(i11);
    }

    @Override // android.widget.TextView
    public void onTextChanged(@Nullable CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        if (Build.VERSION.SDK_INT < 28) {
            remeasureWrapContentConstrained();
        }
        updateFittingText$default(this, 0, 1, null);
    }

    @Override // android.widget.TextView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@NotNull MotionEvent motionEvent) {
        if (!getInterceptTouchEventNeeded()) {
            if (this.isDisallowInterceptTouchEvent) {
                requestDisallowInterceptTouchEvent(false);
            }
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            requestDisallowInterceptTouchEvent(true);
        } else if (action == 1 || action == 3) {
            requestDisallowInterceptTouchEvent(false);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.yandex.div.core.widget.FixedLineHeightView
    public void setFixedLineHeight(int i10) {
        this.fixedLineHeightHelper.setLineHeight(i10);
    }

    @Override // android.widget.TextView
    public void setHorizontallyScrolling(boolean z10) {
        this.horizontalScrollingEnabled = z10;
        super.setHorizontallyScrolling(z10);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i10, float f10) {
        super.setTextSize(i10, f10);
        this.fixedLineHeightHelper.onFontSizeChanged();
    }
}
