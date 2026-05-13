package com.yandex.div.core.view2.spannable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.Px;
import com.yandex.div.internal.spannable.PositionAwareReplacementSpan;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;
import vn.c;

/* JADX INFO: compiled from: ImageSpan.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class ImageSpan extends PositionAwareReplacementSpan {

    @Nullable
    private final Accessibility accessibility;

    @NotNull
    private final TextVerticalAlignment alignment;

    @NotNull
    private final RectF boundsInText = new RectF();
    private final int height;

    @Nullable
    private Drawable image;
    private final int lineHeight;
    private final int width;

    /* JADX INFO: compiled from: ImageSpan.kt */
    public static final class Accessibility {

        @Nullable
        private final String accessibilityType;

        @Nullable
        private final String contentDescription;

        @Nullable
        private final OnAccessibilityClickAction onClickAction;

        public Accessibility(@Nullable String str, @Nullable String str2, @Nullable OnAccessibilityClickAction onAccessibilityClickAction) {
            this.accessibilityType = str;
            this.contentDescription = str2;
            this.onClickAction = onAccessibilityClickAction;
        }

        @Nullable
        public final String getAccessibilityType() {
            return this.accessibilityType;
        }

        @Nullable
        public final String getContentDescription() {
            return this.contentDescription;
        }

        @Nullable
        public final OnAccessibilityClickAction getOnClickAction() {
            return this.onClickAction;
        }
    }

    /* JADX INFO: compiled from: ImageSpan.kt */
    public interface OnAccessibilityClickAction {
        void perform();
    }

    /* JADX INFO: compiled from: ImageSpan.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TextVerticalAlignment.values().length];
            try {
                iArr[TextVerticalAlignment.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextVerticalAlignment.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TextVerticalAlignment.BASELINE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TextVerticalAlignment.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ImageSpan(@Nullable Drawable drawable, @Px int i10, @Px int i11, @Px int i12, @NotNull TextVerticalAlignment textVerticalAlignment, @Nullable Accessibility accessibility) {
        this.width = i10;
        this.height = i11;
        this.lineHeight = i12;
        this.alignment = textVerticalAlignment;
        this.accessibility = accessibility;
        this.image = drawable;
    }

    @Override // com.yandex.div.internal.spannable.PositionAwareReplacementSpan
    public int adjustSize(@NotNull Paint paint, @NotNull CharSequence charSequence, int i10, int i11, @Nullable Paint.FontMetricsInt fontMetricsInt) {
        Rect bounds;
        Rect bounds2;
        if (fontMetricsInt == null || this.lineHeight > 0) {
            return this.width;
        }
        int iD = c.d(paint.ascent());
        int iD2 = c.d(paint.descent());
        Drawable drawable = this.image;
        int iHeight = (drawable == null || (bounds2 = drawable.getBounds()) == null) ? this.height : bounds2.height();
        int i12 = WhenMappings.$EnumSwitchMapping$0[this.alignment.ordinal()];
        if (i12 == 1) {
            iD2 = iD + iHeight;
        } else if (i12 == 2) {
            iD2 = ((iD + iD2) + iHeight) / 2;
        } else if (i12 == 3) {
            iD2 = 0;
        } else if (i12 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        int i13 = iD2 - iHeight;
        int i14 = fontMetricsInt.top;
        int i15 = fontMetricsInt.ascent;
        int i16 = fontMetricsInt.bottom - fontMetricsInt.descent;
        fontMetricsInt.ascent = Math.min(i13, i15);
        int iMax = Math.max(iD2, fontMetricsInt.descent);
        fontMetricsInt.descent = iMax;
        fontMetricsInt.top = fontMetricsInt.ascent + (i14 - i15);
        fontMetricsInt.bottom = iMax + i16;
        Drawable drawable2 = this.image;
        return (drawable2 == null || (bounds = drawable2.getBounds()) == null) ? this.width : bounds.width();
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(@NotNull Canvas canvas, @NotNull CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, @NotNull Paint paint) {
        Drawable drawable = this.image;
        if (drawable == null) {
            return;
        }
        canvas.save();
        int iHeight = drawable.getBounds().height();
        int i15 = WhenMappings.$EnumSwitchMapping$0[this.alignment.ordinal()];
        if (i15 == 1) {
            i13 = i12 + iHeight;
        } else if (i15 == 2) {
            i13 = ((i12 + i14) + iHeight) / 2;
        } else if (i15 != 3) {
            if (i15 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            i13 = i14;
        }
        float f11 = i13 - iHeight;
        this.boundsInText.set(drawable.getBounds());
        this.boundsInText.offset(f10, f11);
        canvas.translate(f10, f11);
        drawable.draw(canvas);
        canvas.restore();
    }

    @Nullable
    public final Accessibility getAccessibility$div_release() {
        return this.accessibility;
    }

    @NotNull
    public final Rect getBoundsInText(@NotNull Rect rect) {
        rect.set(c.d(this.boundsInText.left), c.d(this.boundsInText.top), c.d(this.boundsInText.right), c.d(this.boundsInText.bottom));
        return rect;
    }

    @NotNull
    public final RectF getBoundsInText(@NotNull RectF rectF) {
        rectF.set(this.boundsInText);
        return rectF;
    }

    public final void setImage(@Nullable Drawable drawable) {
        if (p.f(this.image, drawable)) {
            return;
        }
        this.image = drawable;
        if (drawable != null) {
            drawable.setBounds(0, 0, this.width, this.height);
        }
        this.boundsInText.setEmpty();
    }
}
