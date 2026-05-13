package com.yandex.div.core.util.text;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.text.Layout;
import android.util.DisplayMetrics;
import androidx.annotation.ColorInt;
import cn.r;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivCloudBackground;
import com.yandex.div2.DivEdgeInsets;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.DivTextRangeBackground;
import com.yandex.div2.DivTextRangeBorder;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;
import vn.c;
import zn.g;
import zn.n;

/* JADX INFO: compiled from: CloudTextRangeBackgroundRenderer.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class CloudTextRangeBackgroundRenderer extends DivTextRangesBackgroundRenderer {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final Context context;

    @NotNull
    private final ExpressionResolver expressionResolver;

    @NotNull
    private final Path path = new Path();

    @NotNull
    private final Paint paint = new Paint();

    /* JADX INFO: compiled from: CloudTextRangeBackgroundRenderer.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    public CloudTextRangeBackgroundRenderer(@NotNull Context context, @NotNull ExpressionResolver expressionResolver) {
        this.context = context;
        this.expressionResolver = expressionResolver;
    }

    private final int[] buildLeftSegments(Rect[] rectArr, int i10, int i11) {
        int i12 = (i10 + i11) - 1;
        if (i11 == 1) {
            return new int[]{rectArr[i12].width(), -rectArr[i12].height()};
        }
        Rect rect = rectArr[i12];
        int i13 = rect.left;
        int i14 = rect.bottom;
        int[] iArr = new int[i11 * 2];
        int i15 = 0;
        if (i10 <= i12) {
            while (true) {
                Rect rect2 = rectArr[i12];
                int i16 = rect2.left;
                if (i16 != i13) {
                    iArr[(i15 * 2) + 0] = i16 - i13;
                    i15++;
                    i13 = i16;
                }
                int i17 = rect2.top - i14;
                int i18 = i12 - 1;
                while (true) {
                    if (i18 < i10) {
                        break;
                    }
                    Rect rect3 = rectArr[i18];
                    int i19 = rect3.bottom;
                    int i20 = rect2.top;
                    if (i19 <= i20) {
                        break;
                    }
                    if (rect3.left <= rect2.left) {
                        i17 -= i20 - i19;
                        break;
                    }
                    i18--;
                }
                int iJ = n.j(i17, 0);
                int i21 = (i15 * 2) + 1;
                iArr[i21] = iArr[i21] + iJ;
                i14 += iJ;
                if (i12 == i10) {
                    break;
                }
                i12--;
            }
        }
        iArr[(i15 * 2) + 0] = rectArr[i10].width();
        int[] iArrCopyOf = Arrays.copyOf(iArr, (i15 + 1) * 2);
        p.j(iArrCopyOf, "copyOf(...)");
        return iArrCopyOf;
    }

    private final Rect[] buildLines(Layout layout, int i10, int i11, int i12, int i13, int i14, Rect rect) {
        int i15 = i11 - i10;
        int i16 = i15 + 1;
        if (i16 == 0) {
            return new Rect[0];
        }
        Rect[] rectArr = new Rect[i16];
        int i17 = 0;
        while (i17 < i16) {
            int i18 = i10 + i17;
            rectArr[i17] = new Rect((i17 == 0 ? i12 : c.d(layout.getLineLeft(i10 + i17))) - rect.left, layout.getLineTop(i18) - rect.top, (i17 == i15 ? i13 : c.d(layout.getLineRight(i18))) + rect.right, layout.getLineBottom(i18) + rect.bottom);
            i17++;
        }
        coalesceInvisibleLeftBounds(rectArr);
        coalesceInvisibleRightBounds(rectArr);
        int[] iArr = new int[i16];
        int[] iArr2 = new int[i16];
        for (int i19 = 0; i19 < i16; i19++) {
            Rect rect2 = rectArr[i19];
            iArr[i19] = -rect2.left;
            iArr2[i19] = rect2.right;
        }
        int i20 = i14 * 2;
        coalesceCloseBounds(iArr, i20);
        coalesceCloseBounds(iArr2, i20);
        for (int i21 = 0; i21 < i16; i21++) {
            Rect rect3 = rectArr[i21];
            rect3.left = -iArr[i21];
            rect3.right = iArr2[i21];
        }
        return rectArr;
    }

    private final int[] buildRightSegments(Rect[] rectArr, int i10, int i11) {
        int i12 = i10;
        int i13 = (i12 + i11) - 1;
        if (i11 == 1) {
            return new int[]{-rectArr[i12].width(), rectArr[i12].height()};
        }
        Rect rect = rectArr[i12];
        int i14 = rect.right;
        int i15 = rect.top;
        int[] iArr = new int[i11 * 2];
        int i16 = 0;
        if (i12 <= i13) {
            while (true) {
                Rect rect2 = rectArr[i12];
                int i17 = rect2.right;
                if (i17 != i14) {
                    iArr[(i16 * 2) + 0] = i17 - i14;
                    i16++;
                    i14 = i17;
                }
                int i18 = rect2.bottom - i15;
                int i19 = i12 + 1;
                int i20 = i19;
                while (true) {
                    if (i20 > i13) {
                        break;
                    }
                    Rect rect3 = rectArr[i20];
                    int i21 = rect3.top;
                    int i22 = rect2.bottom;
                    if (i21 >= i22) {
                        break;
                    }
                    if (rect3.right >= rect2.right) {
                        i18 -= i22 - i21;
                        break;
                    }
                    i20++;
                }
                int iE = n.e(i18, 0);
                int i23 = (i16 * 2) + 1;
                iArr[i23] = iArr[i23] + iE;
                i15 += iE;
                if (i12 == i13) {
                    break;
                }
                i12 = i19;
            }
        }
        iArr[(i16 * 2) + 0] = -rectArr[i13].width();
        int[] iArrCopyOf = Arrays.copyOf(iArr, (i16 + 1) * 2);
        p.j(iArrCopyOf, "copyOf(...)");
        return iArrCopyOf;
    }

    private final void coalesceCloseBounds(int[] iArr, int i10) {
        boolean z10;
        int i11 = 0;
        do {
            g gVarY = i11 % 2 == 0 ? r.Y(iArr) : n.t(r.Y(iArr));
            int iF = gVarY.f();
            int iG = gVarY.g();
            int iH = gVarY.h();
            if ((iH > 0 && iF <= iG) || (iH < 0 && iG <= iF)) {
                z10 = false;
                while (true) {
                    int i12 = iF == 0 ? 0 : iArr[iF - 1] - iArr[iF];
                    int i13 = iF == r.a0(iArr) ? 0 : iArr[iF + 1] - iArr[iF];
                    if ((i12 <= 0 || i12 >= i10) && (i13 <= 0 || i13 >= i10)) {
                        if (iF != 0 && i12 < 0 && Math.abs(i12) < i10) {
                            iArr[iF - 1] = iArr[iF];
                            z10 = true;
                        }
                        if (iF != r.a0(iArr) && i13 < 0 && Math.abs(i13) < i10) {
                            iArr[iF + 1] = iArr[iF];
                            z10 = true;
                        }
                    }
                    if (iF == iG) {
                        break;
                    } else {
                        iF += iH;
                    }
                }
            } else {
                z10 = false;
            }
            i11++;
        } while (z10);
    }

    private final void coalesceInvisibleLeftBounds(Rect[] rectArr) {
        int length = rectArr.length;
        int i10 = ((Rect) r.W(rectArr)).left;
        int i11 = ((Rect) r.W(rectArr)).top;
        int length2 = rectArr.length;
        int i12 = 0;
        while (i12 < length2) {
            Rect rect = rectArr[i12];
            int i13 = rect.bottom - i11;
            i12++;
            int i14 = Integer.MIN_VALUE;
            int i15 = i12;
            while (true) {
                if (i15 >= length) {
                    break;
                }
                Rect rect2 = rectArr[i15];
                int i16 = rect2.top;
                int i17 = rect.bottom;
                if (i16 >= i17) {
                    break;
                }
                int i18 = rect2.left;
                if (i18 <= rect.left) {
                    i13 -= i17 - i16;
                    i14 = i18;
                    break;
                }
                i15++;
            }
            if (i13 <= 0) {
                rect.left = Math.max(i10, i14);
                i13 = 0;
            } else {
                i10 = rect.left;
            }
            i11 += i13;
        }
    }

    private final void coalesceInvisibleRightBounds(Rect[] rectArr) {
        int length = rectArr.length;
        int i10 = ((Rect) r.W(rectArr)).right;
        int i11 = ((Rect) r.W(rectArr)).top;
        int length2 = rectArr.length;
        int i12 = 0;
        while (i12 < length2) {
            Rect rect = rectArr[i12];
            int i13 = rect.bottom - i11;
            i12++;
            int i14 = Integer.MAX_VALUE;
            int i15 = i12;
            while (true) {
                if (i15 >= length) {
                    break;
                }
                Rect rect2 = rectArr[i15];
                int i16 = rect2.top;
                int i17 = rect.bottom;
                if (i16 >= i17) {
                    break;
                }
                int i18 = rect2.right;
                if (i18 >= rect.right) {
                    i13 -= i17 - i16;
                    i14 = i18;
                    break;
                }
                i15++;
            }
            if (i13 <= 0) {
                rect.right = Math.min(i10, i14);
                i13 = 0;
            } else {
                i10 = rect.right;
            }
            i11 += i13;
        }
    }

    private final void draw(Canvas canvas, Layout layout, int i10, int i11, int i12, int i13, DivCloudBackground divCloudBackground) {
        DivSizeUnit divSizeUnitEvaluate;
        Expression<Long> expression;
        Expression<Long> expression2;
        Expression<Long> expression3;
        Expression<Long> expression4;
        Expression<DivSizeUnit> expression5;
        DisplayMetrics displayMetrics = getDisplayMetrics();
        int iIntValue = divCloudBackground.f54755a.evaluate(this.expressionResolver).intValue();
        int iDpToPx = BaseDivViewExtensionsKt.dpToPx(divCloudBackground.f54756b.evaluate(this.expressionResolver), displayMetrics);
        DivEdgeInsets divEdgeInsets = divCloudBackground.f54757c;
        if (divEdgeInsets == null || (expression5 = divEdgeInsets.f55205g) == null || (divSizeUnitEvaluate = expression5.evaluate(this.expressionResolver)) == null) {
            divSizeUnitEvaluate = DivSizeUnit.DP;
        }
        DivEdgeInsets divEdgeInsets2 = divCloudBackground.f54757c;
        int iUnitToPx = (divEdgeInsets2 == null || (expression4 = divEdgeInsets2.f55201c) == null) ? 0 : BaseDivViewExtensionsKt.unitToPx(Long.valueOf(expression4.evaluate(this.expressionResolver).longValue()), displayMetrics, divSizeUnitEvaluate);
        DivEdgeInsets divEdgeInsets3 = divCloudBackground.f54757c;
        int iUnitToPx2 = (divEdgeInsets3 == null || (expression3 = divEdgeInsets3.f55204f) == null) ? 0 : BaseDivViewExtensionsKt.unitToPx(Long.valueOf(expression3.evaluate(this.expressionResolver).longValue()), displayMetrics, divSizeUnitEvaluate);
        DivEdgeInsets divEdgeInsets4 = divCloudBackground.f54757c;
        int iUnitToPx3 = (divEdgeInsets4 == null || (expression2 = divEdgeInsets4.f55202d) == null) ? 0 : BaseDivViewExtensionsKt.unitToPx(Long.valueOf(expression2.evaluate(this.expressionResolver).longValue()), displayMetrics, divSizeUnitEvaluate);
        DivEdgeInsets divEdgeInsets5 = divCloudBackground.f54757c;
        Rect[] rectArrBuildLines = buildLines(layout, i10, i11, i12, i13, iDpToPx, new Rect(iUnitToPx, iUnitToPx2, iUnitToPx3, (divEdgeInsets5 == null || (expression = divEdgeInsets5.f55199a) == null) ? 0 : BaseDivViewExtensionsKt.unitToPx(Long.valueOf(expression.evaluate(this.expressionResolver).longValue()), displayMetrics, divSizeUnitEvaluate)));
        if (rectArrBuildLines.length < 2) {
            drawLines(canvas, rectArrBuildLines, 0, rectArrBuildLines.length, iDpToPx, iIntValue);
            return;
        }
        int length = rectArrBuildLines.length - 1;
        int i14 = 0;
        int i15 = 0;
        int i16 = 1;
        while (i14 < length) {
            int i17 = i14 + 1;
            if (rectArrBuildLines[i14].left > rectArrBuildLines[i17].right) {
                drawLines(canvas, rectArrBuildLines, i15, i16, iDpToPx, iIntValue);
                i16 = 0;
                i15 = i17;
            }
            i16++;
            i14 = i17;
        }
        drawLines(canvas, rectArrBuildLines, i15, i16, iDpToPx, iIntValue);
    }

    private final void drawLines(Canvas canvas, Rect[] rectArr, int i10, int i11, int i12, @ColorInt int i13) {
        float fMin;
        boolean z10 = true;
        if (i11 < 1) {
            return;
        }
        Rect rect = rectArr[i10];
        Rect rect2 = rectArr[(i10 + i11) - 1];
        int[] iArrBuildLeftSegments = buildLeftSegments(rectArr, i10, i11);
        int[] iArrBuildRightSegments = buildRightSegments(rectArr, i10, i11);
        this.path.reset();
        float f10 = i12;
        float f11 = 2.0f;
        float fMin2 = Math.min(f10, Math.min(rect.width() / 2.0f, iArrBuildRightSegments[1] / 2.0f));
        this.path.moveTo(rect.right - fMin2, rect.top);
        this.path.rQuadTo(fMin2 * 0.9f, fMin2 * 0.1f, fMin2, fMin2);
        boolean z11 = false;
        int i14 = 2;
        int iC = ln.c.c(0, iArrBuildRightSegments.length - 1, 2);
        float f12 = 0.0f;
        if (iC >= 0) {
            int i15 = 0;
            while (true) {
                boolean z12 = i15 >= iArrBuildRightSegments.length - i14 ? z10 : z11;
                float f13 = iArrBuildRightSegments[i15 + 0];
                float f14 = iArrBuildRightSegments[i15 + 1];
                float f15 = z12 ? f12 : iArrBuildRightSegments[i15 + 2 + 1];
                fMin = Math.min(f10, Math.min(Math.abs(f13) / f11, f14 / f11));
                this.path.rLineTo(f12, (f14 - fMin2) - fMin);
                this.path.rQuadTo(Math.signum(f13) * fMin2 * 0.1f, fMin * 0.9f, fMin * Math.signum(f13), fMin);
                if (!z12) {
                    fMin2 = Math.min(f10, Math.min(Math.abs(f13) / 2.0f, f15 / 2.0f));
                    this.path.rLineTo(f13 - ((fMin2 + fMin) * Math.signum(f13)), 0.0f);
                    this.path.rQuadTo(fMin2 * 0.9f * Math.signum(f13), fMin2 * 0.1f, Math.signum(f13) * fMin2, fMin2);
                }
                if (i15 == iC) {
                    break;
                }
                i15 += 2;
                z10 = true;
                f11 = 2.0f;
                z11 = false;
                i14 = 2;
                f12 = 0.0f;
            }
        } else {
            fMin = 0.0f;
        }
        float fMin3 = Math.min(f10, Math.min(rect2.width() / 2.0f, (-iArrBuildLeftSegments[1]) / 2.0f));
        this.path.rLineTo((-rect2.width()) + fMin + fMin3, 0.0f);
        float f16 = -0.9f;
        float f17 = -fMin3;
        this.path.rQuadTo(fMin3 * (-0.9f), fMin3 * (-0.1f), f17, f17);
        boolean z13 = false;
        int i16 = 2;
        int iC2 = ln.c.c(0, iArrBuildLeftSegments.length - 1, 2);
        if (iC2 >= 0) {
            int i17 = 0;
            while (true) {
                boolean z14 = i17 >= iArrBuildLeftSegments.length - i16 ? true : z13;
                float f18 = iArrBuildLeftSegments[i17 + 0];
                float f19 = iArrBuildLeftSegments[i17 + 1];
                float f20 = z14 ? 0.0f : iArrBuildLeftSegments[i17 + 2 + 1];
                float fMin4 = Math.min(f10, Math.min(Math.abs(f18) / 2.0f, (-f19) / 2.0f));
                this.path.rLineTo(0.0f, f19 + fMin3 + fMin4);
                this.path.rQuadTo(fMin4 * 0.1f * Math.signum(f18), fMin4 * f16, fMin4 * Math.signum(f18), -fMin4);
                if (!z14) {
                    fMin3 = Math.min(f10, Math.min(Math.abs(f18) / 2.0f, (-f20) / 2.0f));
                    this.path.rLineTo(f18 - ((fMin4 + fMin3) * Math.signum(f18)), 0.0f);
                    this.path.rQuadTo(fMin3 * 0.9f * Math.signum(f18), fMin3 * (-0.1f), Math.signum(f18) * fMin3, -fMin3);
                }
                if (i17 == iC2) {
                    break;
                }
                i17 += 2;
                f16 = -0.9f;
                z13 = false;
                i16 = 2;
            }
        }
        this.path.close();
        this.paint.setColor(i13);
        canvas.drawPath(this.path, this.paint);
    }

    private final DisplayMetrics getDisplayMetrics() {
        return this.context.getResources().getDisplayMetrics();
    }

    @Override // com.yandex.div.core.util.text.DivTextRangesBackgroundRenderer
    public void draw(@NotNull Canvas canvas, @NotNull Layout layout, int i10, int i11, int i12, int i13, @Nullable DivTextRangeBorder divTextRangeBorder, @Nullable DivTextRangeBackground divTextRangeBackground) {
        Object objB = divTextRangeBackground != null ? divTextRangeBackground.b() : null;
        DivCloudBackground divCloudBackground = objB instanceof DivCloudBackground ? (DivCloudBackground) objB : null;
        if (divCloudBackground == null) {
            return;
        }
        draw(canvas, layout, i10, i11, i12, i13, divCloudBackground);
    }
}
