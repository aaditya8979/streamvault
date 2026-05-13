package com.yandex.div.core.view2.divs.pager;

import android.util.DisplayMetrics;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DivPagerPaddingsHolder.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DivPagerPaddingsHolder {

    @Nullable
    private final Integer alignedBottom;

    @Nullable
    private final Integer alignedLeft;

    @Nullable
    private final Integer alignedRight;

    @Nullable
    private final Integer alignedTop;
    private final float bottom;
    private final float end;
    private final boolean hasRelativePaddings;
    private final float left;

    @NotNull
    private final DisplayMetrics metrics;

    @NotNull
    private final ExpressionResolver resolver;
    private final float right;
    private final float start;

    /* JADX INFO: renamed from: top, reason: collision with root package name */
    private final float f53982top;

    /* JADX WARN: Removed duplicated region for block: B:13:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DivPagerPaddingsHolder(@org.jetbrains.annotations.Nullable com.yandex.div2.DivEdgeInsets r4, @org.jetbrains.annotations.NotNull com.yandex.div.json.expressions.ExpressionResolver r5, @org.jetbrains.annotations.NotNull android.view.View r6, @org.jetbrains.annotations.NotNull android.util.DisplayMetrics r7, boolean r8, @org.jetbrains.annotations.NotNull com.yandex.div2.DivPager.ItemAlignment r9) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.divs.pager.DivPagerPaddingsHolder.<init>(com.yandex.div2.DivEdgeInsets, com.yandex.div.json.expressions.ExpressionResolver, android.view.View, android.util.DisplayMetrics, boolean, com.yandex.div2.DivPager$ItemAlignment):void");
    }

    private final float toPadding(Expression<Long> expression) {
        if (expression != null) {
            return BaseDivViewExtensionsKt.dpToPxF(Long.valueOf(expression.evaluate(this.resolver).longValue()), this.metrics);
        }
        return 0.0f;
    }

    @Nullable
    public final Integer getAlignedBottom() {
        return this.alignedBottom;
    }

    @Nullable
    public final Integer getAlignedLeft() {
        return this.alignedLeft;
    }

    @Nullable
    public final Integer getAlignedRight() {
        return this.alignedRight;
    }

    @Nullable
    public final Integer getAlignedTop() {
        return this.alignedTop;
    }

    public final float getBottom() {
        return this.bottom;
    }

    public final float getEnd() {
        return this.end;
    }

    public final float getLeft() {
        return this.left;
    }

    public final float getRight() {
        return this.right;
    }

    public final float getStart() {
        return this.start;
    }

    public final float getTop() {
        return this.f53982top;
    }
}
