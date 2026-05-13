package io.bidmachine.iab.vast.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import io.bidmachine.iab.utils.Assets;
import io.bidmachine.iab.utils.IabElement;
import io.bidmachine.iab.utils.IabElementStyle;

/* JADX INFO: loaded from: classes5.dex */
public class IabTextView extends TextView implements IabElement {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final RectF f69746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private GradientDrawable f69747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Paint f69748c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f69749d;

    public IabTextView(@NonNull Context context) {
        super(context);
        this.f69746a = new RectF();
        this.f69749d = false;
        a(context);
    }

    public IabTextView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f69746a = new RectF();
        this.f69749d = false;
        a(context);
    }

    public void a(Context context) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.f69747b = gradientDrawable;
        gradientDrawable.setColor(Assets.BACKGROUND_COLOR);
        this.f69747b.setShape(0);
        setBackgroundDrawable(this.f69747b);
        setGravity(17);
        setMaxLines(1);
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch("io.bidmachine", this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f69749d || this.f69748c == null) {
            return;
        }
        float height = getHeight() / 2.0f;
        canvas.drawRoundRect(this.f69746a, height, height, this.f69748c);
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        if (View.MeasureSpec.getMode(i11) == 1073741824) {
            float size = (View.MeasureSpec.getSize(i11) - getCompoundPaddingTop()) - getCompoundPaddingRight();
            if (getTextSize() != size) {
                setTextSize(0, size);
            }
        }
        if (mode == 1073741824 && getText() != null) {
            int size2 = (View.MeasureSpec.getSize(i10) - getCompoundPaddingLeft()) - getCompoundPaddingRight();
            float fMeasureText = getPaint().measureText(getText(), 0, getText().length());
            float f10 = size2;
            if (f10 < fMeasureText) {
                float textSize = (int) (getTextSize() * (f10 / fMeasureText));
                if (getTextSize() != textSize) {
                    setTextSize(0, textSize);
                }
            }
        }
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        Paint paint;
        super.onSizeChanged(i10, i11, i12, i13);
        GradientDrawable gradientDrawable = this.f69747b;
        if (gradientDrawable != null) {
            gradientDrawable.setCornerRadius(i11 / 2.0f);
        }
        if (!this.f69749d || (paint = this.f69748c) == null) {
            return;
        }
        float strokeWidth = paint.getStrokeWidth() / 2.0f;
        float f10 = 0.0f + strokeWidth;
        this.f69746a.set(f10, f10, i10 - strokeWidth, i11 - strokeWidth);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        GradientDrawable gradientDrawable = this.f69747b;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(i10);
        }
    }

    @Override // io.bidmachine.iab.utils.IabElement
    public void setStyle(@NonNull IabElementStyle iabElementStyle) {
        boolean zBooleanValue = iabElementStyle.isOutlined().booleanValue();
        this.f69749d = zBooleanValue;
        if (zBooleanValue) {
            Paint paint = new Paint(1);
            this.f69748c = paint;
            paint.setStyle(Paint.Style.STROKE);
            this.f69748c.setColor(iabElementStyle.getStrokeColor().intValue());
            this.f69748c.setStrokeWidth(iabElementStyle.getStrokeWidth(getContext()).floatValue());
        }
        setTextColor(iabElementStyle.getStrokeColor().intValue());
        setBackgroundColor(iabElementStyle.getFillColor().intValue());
        setTextSize(0, iabElementStyle.getFontSize(getContext()).floatValue());
        setTypeface(Typeface.create(Typeface.DEFAULT, iabElementStyle.getFontStyle().intValue()));
        setAlpha(iabElementStyle.getOpacity().floatValue());
        setPadding(iabElementStyle.getPaddingLeft(getContext()).intValue(), iabElementStyle.getPaddingTop(getContext()).intValue(), iabElementStyle.getPaddingRight(getContext()).intValue(), iabElementStyle.getPaddingBottom(getContext()).intValue());
    }
}
