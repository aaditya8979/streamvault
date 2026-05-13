package com.yandex.div.internal.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.GravityCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.google.android.material.badge.BadgeDrawable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: DivViewGroup.kt */
/* JADX INFO: loaded from: classes10.dex */
public abstract class DivViewGroup extends ViewGroup {

    @NotNull
    public static final Companion Companion = new Companion(null);
    private int gravity;

    /* JADX INFO: compiled from: DivViewGroup.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0037, code lost:
        
            if (r13 == Integer.MAX_VALUE) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
        
            if (r13 == Integer.MAX_VALUE) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
        
            r11 = r9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
        
            r11 = r13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0066, code lost:
        
            if (r13 == Integer.MAX_VALUE) goto L23;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final int getChildMeasureSpec(int r9, int r10, int r11, int r12, int r13) {
            /*
                r8 = this;
                int r0 = android.view.View.MeasureSpec.getMode(r9)
                int r9 = android.view.View.MeasureSpec.getSize(r9)
                int r9 = r9 - r10
                r10 = 0
                int r9 = java.lang.Math.max(r10, r9)
                r1 = -3
                r2 = -2
                r3 = -1
                r4 = 1
                r5 = 2147483647(0x7fffffff, float:NaN)
                r6 = 1073741824(0x40000000, float:2.0)
                r7 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r0 == r7) goto L50
                if (r0 == 0) goto L45
                if (r0 == r6) goto L21
                goto L74
            L21:
                if (r11 < 0) goto L26
                if (r11 > r5) goto L26
                goto L27
            L26:
                r4 = r10
            L27:
                if (r4 == 0) goto L2a
                goto L47
            L2a:
                if (r11 != r3) goto L35
                int r9 = java.lang.Math.max(r9, r12)
                int r11 = java.lang.Math.min(r9, r13)
                goto L47
            L35:
                if (r11 != r2) goto L3a
                if (r13 != r5) goto L4d
                goto L4b
            L3a:
                if (r11 != r1) goto L74
                int r9 = java.lang.Math.max(r9, r12)
                int r11 = java.lang.Math.min(r9, r13)
                goto L4e
            L45:
                if (r11 < 0) goto L49
            L47:
                r10 = r6
                goto L75
            L49:
                if (r13 != r5) goto L4d
            L4b:
                r11 = r9
                goto L75
            L4d:
                r11 = r13
            L4e:
                r10 = r7
                goto L75
            L50:
                if (r11 < 0) goto L55
                if (r11 > r5) goto L55
                goto L56
            L55:
                r4 = r10
            L56:
                if (r4 == 0) goto L59
                goto L47
            L59:
                if (r11 != r3) goto L64
                int r9 = java.lang.Math.max(r9, r12)
                int r11 = java.lang.Math.min(r9, r13)
                goto L4e
            L64:
                if (r11 != r2) goto L69
                if (r13 != r5) goto L4d
                goto L4b
            L69:
                if (r11 != r1) goto L74
                int r9 = java.lang.Math.max(r9, r12)
                int r11 = java.lang.Math.min(r9, r13)
                goto L4e
            L74:
                r11 = r10
            L75:
                int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r11, r10)
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.internal.widget.DivViewGroup.Companion.getChildMeasureSpec(int, int, int, int, int):int");
        }

        public final float getSpaceAroundPart$div_release(float f10, int i10) {
            return f10 / (i10 * 2);
        }

        public final float getSpaceBetweenPart$div_release(float f10, int i10) {
            if (i10 == 1) {
                return 0.0f;
            }
            return f10 / (i10 - 1);
        }

        public final float getSpaceEvenlyPart$div_release(float f10, int i10) {
            return f10 / (i10 + 1);
        }

        @SuppressLint({"WrongConstant"})
        public final int toHorizontalGravity(int i10) {
            return i10 & 125829127;
        }

        @SuppressLint({"WrongConstant"})
        public final int toVerticalGravity(int i10) {
            return i10 & 1879048304;
        }
    }

    /* JADX INFO: compiled from: DivViewGroup.kt */
    public final class OffsetsHolder {
        private int edgeDividerOffset;
        private float firstChildOffset;
        private float spaceBetweenChildren;

        public OffsetsHolder(float f10, float f11, int i10) {
            this.firstChildOffset = f10;
            this.spaceBetweenChildren = f11;
            this.edgeDividerOffset = i10;
        }

        public /* synthetic */ OffsetsHolder(DivViewGroup divViewGroup, float f10, float f11, int i10, int i11, i iVar) {
            this((i11 & 1) != 0 ? 0.0f : f10, (i11 & 2) != 0 ? 0.0f : f11, (i11 & 4) != 0 ? 0 : i10);
        }

        public final int getEdgeDividerOffset() {
            return this.edgeDividerOffset;
        }

        public final float getFirstChildOffset() {
            return this.firstChildOffset;
        }

        public final float getSpaceBetweenChildren() {
            return this.spaceBetweenChildren;
        }

        public final void update(float f10, int i10, int i11) {
            this.firstChildOffset = 0.0f;
            this.spaceBetweenChildren = 0.0f;
            this.edgeDividerOffset = 0;
            switch (i10) {
                case 1:
                case 16:
                    this.firstChildOffset = f10 / 2;
                    return;
                case 3:
                case 48:
                    return;
                case 5:
                case 80:
                    this.firstChildOffset = f10;
                    return;
                case 16777216:
                case 268435456:
                    float spaceAroundPart$div_release = DivViewGroup.Companion.getSpaceAroundPart$div_release(f10, i11);
                    this.firstChildOffset = spaceAroundPart$div_release;
                    float f11 = 2;
                    this.spaceBetweenChildren = spaceAroundPart$div_release * f11;
                    this.edgeDividerOffset = (int) (spaceAroundPart$div_release / f11);
                    return;
                case 33554432:
                case 536870912:
                    this.spaceBetweenChildren = DivViewGroup.Companion.getSpaceBetweenPart$div_release(f10, i11);
                    return;
                case AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL /* 67108864 */:
                case 1073741824:
                    float spaceEvenlyPart$div_release = DivViewGroup.Companion.getSpaceEvenlyPart$div_release(f10, i11);
                    this.firstChildOffset = spaceEvenlyPart$div_release;
                    this.spaceBetweenChildren = spaceEvenlyPart$div_release;
                    this.edgeDividerOffset = (int) (spaceEvenlyPart$div_release / 2);
                    return;
                default:
                    throw new IllegalStateException("Invalid gravity is set: " + i10);
            }
        }
    }

    public DivViewGroup(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public DivViewGroup(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.gravity = BadgeDrawable.TOP_START;
        setClipToPadding(false);
    }

    public /* synthetic */ DivViewGroup(Context context, AttributeSet attributeSet, int i10, int i11, i iVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public static /* synthetic */ void getGravity$annotations() {
    }

    public final void baseMeasureChild(@NotNull View view, int i10, int i11) {
        super.measureChild(view, i10, i11);
    }

    public final void baseMeasureChildWithMargins(@NotNull View view, int i10, int i11, int i12, int i13) {
        super.measureChildWithMargins(view, i10, i11, i12, i13);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(@Nullable ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof DivLayoutParams;
    }

    @Override // android.view.ViewGroup
    @NotNull
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new DivLayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    @NotNull
    public ViewGroup.LayoutParams generateLayoutParams(@Nullable AttributeSet attributeSet) {
        return new DivLayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    @NotNull
    public ViewGroup.LayoutParams generateLayoutParams(@Nullable ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof DivLayoutParams ? new DivLayoutParams((DivLayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new DivLayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new DivLayoutParams(layoutParams);
    }

    public final int getGravity() {
        return this.gravity;
    }

    public final int getHorizontalGravity$div_release() {
        return Companion.toHorizontalGravity(this.gravity);
    }

    public final int getHorizontalPaddings$div_release() {
        return getPaddingLeft() + getPaddingRight();
    }

    public final int getVerticalGravity$div_release() {
        return Companion.toVerticalGravity(this.gravity);
    }

    public final int getVerticalPaddings$div_release() {
        return getPaddingTop() + getPaddingBottom();
    }

    @Override // android.view.ViewGroup
    public void measureChild(@NotNull View view, int i10, int i11) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        p.i(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
        Companion companion = Companion;
        view.measure(companion.getChildMeasureSpec(i10, getHorizontalPaddings$div_release(), ((ViewGroup.MarginLayoutParams) divLayoutParams).width, view.getMinimumWidth(), divLayoutParams.getMaxWidth()), companion.getChildMeasureSpec(i11, getVerticalPaddings$div_release(), ((ViewGroup.MarginLayoutParams) divLayoutParams).height, view.getMinimumHeight(), divLayoutParams.getMaxHeight()));
    }

    @Override // android.view.ViewGroup
    public void measureChildWithMargins(@NotNull View view, int i10, int i11, int i12, int i13) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        p.i(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
        Companion companion = Companion;
        view.measure(companion.getChildMeasureSpec(i10, getHorizontalPaddings$div_release() + divLayoutParams.getHorizontalMargins$div_release() + i11, ((ViewGroup.MarginLayoutParams) divLayoutParams).width, view.getMinimumWidth(), divLayoutParams.getMaxWidth()), companion.getChildMeasureSpec(i12, getVerticalPaddings$div_release() + divLayoutParams.getVerticalMargins$div_release() + i13, ((ViewGroup.MarginLayoutParams) divLayoutParams).height, view.getMinimumHeight(), divLayoutParams.getMaxHeight()));
    }

    public final void setGravity(int i10) {
        if (this.gravity == i10) {
            return;
        }
        Companion companion = Companion;
        if (companion.toHorizontalGravity(i10) == 0) {
            i10 |= GravityCompat.START;
        }
        if (companion.toVerticalGravity(i10) == 0) {
            i10 |= 48;
        }
        this.gravity = i10;
        requestLayout();
    }
}
