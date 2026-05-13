package com.yandex.div.core.view2.divs.pager;

import com.yandex.div2.DivPager;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DivPagerPageSizeProvider.kt */
/* JADX INFO: loaded from: classes3.dex */
public abstract class DivPagerPageSizeProvider {

    @NotNull
    private final DivPager.ItemAlignment alignment;

    @NotNull
    private final DivPagerPaddingsHolder paddings;
    private final int parentSize;

    /* JADX INFO: compiled from: DivPagerPageSizeProvider.kt */
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

    public DivPagerPageSizeProvider(int i10, @NotNull DivPagerPaddingsHolder divPagerPaddingsHolder, @NotNull DivPager.ItemAlignment itemAlignment) {
        this.parentSize = i10;
        this.paddings = divPagerPaddingsHolder;
        this.alignment = itemAlignment;
    }

    private final Float getCenteredNeighbourSize(int i10) {
        Float itemSize = getItemSize(i10);
        if (itemSize == null) {
            return null;
        }
        return Float.valueOf((this.parentSize - itemSize.floatValue()) / 2.0f);
    }

    @Nullable
    public abstract Float getItemSize(int i10);

    @Nullable
    public final Float getNextNeighbourSize(int i10) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[this.alignment.ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                return getCenteredNeighbourSize(i10);
            }
            if (i11 == 3) {
                return Float.valueOf(this.paddings.getEnd());
            }
            throw new NoWhenBranchMatchedException();
        }
        Float itemSize = getItemSize(i10);
        if (itemSize == null) {
            return null;
        }
        return Float.valueOf((this.parentSize - this.paddings.getStart()) - itemSize.floatValue());
    }

    @Nullable
    public final Float getPrevNeighbourSize(int i10) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[this.alignment.ordinal()];
        if (i11 == 1) {
            return Float.valueOf(this.paddings.getStart());
        }
        if (i11 == 2) {
            return getCenteredNeighbourSize(i10);
        }
        if (i11 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        Float itemSize = getItemSize(i10);
        if (itemSize == null) {
            return null;
        }
        return Float.valueOf((this.parentSize - this.paddings.getEnd()) - itemSize.floatValue());
    }
}
