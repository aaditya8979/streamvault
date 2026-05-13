package com.yandex.div.core.view2.divs.pager;

import com.yandex.div2.DivPager;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PercentagePageSizeProvider.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class PercentagePageSizeProvider extends DivPagerPageSizeProvider implements FixedPageSizeProvider {
    private final boolean hasOffScreenPages;
    private final float itemSize;
    private final float neighbourSize;
    private final double pageWidthPercentage;

    /* JADX INFO: compiled from: PercentagePageSizeProvider.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DivPager.ItemAlignment.values().length];
            try {
                iArr[DivPager.ItemAlignment.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DivPager.ItemAlignment.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DivPager.ItemAlignment.END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public PercentagePageSizeProvider(@org.jetbrains.annotations.NotNull com.yandex.div2.DivPageSize r5, @org.jetbrains.annotations.NotNull com.yandex.div.json.expressions.ExpressionResolver r6, int r7, @org.jetbrains.annotations.NotNull com.yandex.div.core.view2.divs.pager.DivPagerPaddingsHolder r8, @org.jetbrains.annotations.NotNull com.yandex.div2.DivPager.ItemAlignment r9) {
        /*
            r4 = this;
            r4.<init>(r7, r8, r9)
            com.yandex.div2.DivPercentageSize r5 = r5.f56283a
            com.yandex.div.json.expressions.Expression<java.lang.Double> r5 = r5.f56516a
            java.lang.Object r5 = r5.evaluate(r6)
            java.lang.Number r5 = (java.lang.Number) r5
            double r5 = r5.doubleValue()
            r4.pageWidthPercentage = r5
            double r0 = (double) r7
            double r0 = r0 * r5
            r2 = 100
            double r2 = (double) r2
            double r0 = r0 / r2
            float r0 = (float) r0
            r4.itemSize = r0
            int[] r0 = com.yandex.div.core.view2.divs.pager.PercentagePageSizeProvider.WhenMappings.$EnumSwitchMapping$0
            int r9 = r9.ordinal()
            r9 = r0[r9]
            r0 = 1
            if (r9 == r0) goto L47
            r1 = 2
            if (r9 == r1) goto L3e
            r1 = 3
            if (r9 != r1) goto L38
            float r7 = (float) r7
            float r8 = r8.getEnd()
            float r7 = r7 - r8
            float r8 = r4.getItemSize()
            goto L51
        L38:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L3e:
            float r7 = (float) r7
            float r8 = r4.getItemSize()
            float r7 = r7 - r8
            float r8 = (float) r1
            float r7 = r7 / r8
            goto L52
        L47:
            float r7 = (float) r7
            float r8 = r8.getStart()
            float r7 = r7 - r8
            float r8 = r4.getItemSize()
        L51:
            float r7 = r7 - r8
        L52:
            r4.neighbourSize = r7
            r7 = 4636737291354636288(0x4059000000000000, double:100.0)
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 >= 0) goto L5b
            goto L5c
        L5b:
            r0 = 0
        L5c:
            r4.hasOffScreenPages = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.divs.pager.PercentagePageSizeProvider.<init>(com.yandex.div2.DivPageSize, com.yandex.div.json.expressions.ExpressionResolver, int, com.yandex.div.core.view2.divs.pager.DivPagerPaddingsHolder, com.yandex.div2.DivPager$ItemAlignment):void");
    }

    @Override // com.yandex.div.core.view2.divs.pager.FixedPageSizeProvider
    public boolean getHasOffScreenPages() {
        return this.hasOffScreenPages;
    }

    @Override // com.yandex.div.core.view2.divs.pager.FixedPageSizeProvider
    public float getItemSize() {
        return this.itemSize;
    }

    @Override // com.yandex.div.core.view2.divs.pager.DivPagerPageSizeProvider
    @NotNull
    public Float getItemSize(int i10) {
        return Float.valueOf(getItemSize());
    }

    @Override // com.yandex.div.core.view2.divs.pager.FixedPageSizeProvider
    public float getNeighbourSize() {
        return this.neighbourSize;
    }
}
