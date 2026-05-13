package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import bn.r;
import com.vungle.ads.internal.protos.Sdk;
import hn.c;
import java.util.List;
import jn.d;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.a;
import sn.l;
import sn.p;

/* JADX INFO: compiled from: LazyGridScrolling.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0017\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0082\b\u001a/\u0010\n\u001a\u00020\u0003*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0080@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001e\u0010\u0011\u001a\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002\"\u0017\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014\"\u0017\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014\"\u0014\u0010\u0016\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lkotlin/Function0;", "", "generateMsg", "Lbn/r;", "debugLog", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "", "index", "scrollOffset", "slotsPerLine", "doSmoothScrollToItem", "(Landroidx/compose/foundation/lazy/grid/LazyGridState;IIILhn/c;)Ljava/lang/Object;", "", "Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo;", "visibleItems", "", "isVertical", "calculateLineAverageMainAxisSize", "Landroidx/compose/ui/unit/Dp;", "TargetDistance", "F", "BoundDistance", "DEBUG", "Z", "foundation_release"}, k = 2, mv = {1, 6, 0})
public final class LazyGridScrollingKt {
    private static final boolean DEBUG = false;
    private static final float TargetDistance = Dp.m3826constructorimpl(2500);
    private static final float BoundDistance = Dp.m3826constructorimpl(1500);

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridScrollingKt$doSmoothScrollToItem$3, reason: invalid class name */
    /* JADX INFO: compiled from: LazyGridScrolling.kt */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollScope;", "Lbn/r;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @d(c = "androidx.compose.foundation.lazy.grid.LazyGridScrollingKt$doSmoothScrollToItem$3", f = "LazyGridScrolling.kt", l = {128, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "invokeSuspend")
    public static final class AnonymousClass3 extends SuspendLambda implements p<ScrollScope, c<? super r>, Object> {
        public final /* synthetic */ int $index;
        public final /* synthetic */ int $scrollOffset;
        public final /* synthetic */ int $slotsPerLine;
        public final /* synthetic */ LazyGridState $this_doSmoothScrollToItem;
        public float F$0;
        public float F$1;
        public int I$0;
        private /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(LazyGridState lazyGridState, int i10, int i11, int i12, c<? super AnonymousClass3> cVar) {
            super(2, cVar);
            this.$this_doSmoothScrollToItem = lazyGridState;
            this.$index = i10;
            this.$slotsPerLine = i11;
            this.$scrollOffset = i12;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invokeSuspend$isOvershot(boolean z10, LazyGridState lazyGridState, int i10, int i11) {
            if (z10) {
                if (lazyGridState.getFirstVisibleItemIndex() <= i10 && (lazyGridState.getFirstVisibleItemIndex() != i10 || lazyGridState.getFirstVisibleItemScrollOffset() <= i11)) {
                    return false;
                }
            } else if (lazyGridState.getFirstVisibleItemIndex() >= i10 && (lazyGridState.getFirstVisibleItemIndex() != i10 || lazyGridState.getFirstVisibleItemScrollOffset() >= i11)) {
                return false;
            }
            return true;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$this_doSmoothScrollToItem, this.$index, this.$slotsPerLine, this.$scrollOffset, cVar);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull ScrollScope scrollScope, @Nullable c<? super r> cVar) {
            return ((AnonymousClass3) create(scrollScope, cVar)).invokeSuspend(r.f5635a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Path cross not found for [B:38:0x0107, B:37:0x0105], limit reached: 95 */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00b1 A[Catch: ItemFoundInScroll -> 0x01de, TryCatch #1 {ItemFoundInScroll -> 0x01de, blocks: (B:23:0x00ad, B:25:0x00b1, B:27:0x00bd, B:31:0x00d8, B:35:0x00ea, B:41:0x010d, B:48:0x0152, B:52:0x015b), top: B:87:0x00ad }] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00d5  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00d7  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00e7  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00e9  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0107  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0148  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x014a  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x014d  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0150  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0156  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0159  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x01b7 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:60:0x01b8  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x022e  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x0231  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x0254 A[RETURN] */
        /* JADX WARN: Type inference failed for: r10v0, types: [T, androidx.compose.animation.core.AnimationState] */
        /* JADX WARN: Type inference failed for: r4v15, types: [T, androidx.compose.animation.core.AnimationState] */
        /* JADX WARN: Type inference failed for: r5v20 */
        /* JADX WARN: Type inference failed for: r5v7 */
        /* JADX WARN: Type inference failed for: r5v8, types: [int] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x01b8 -> B:95:0x01c3). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r37) {
            /*
                Method dump skipped, instruction units count: 609
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridScrollingKt.AnonymousClass3.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int calculateLineAverageMainAxisSize(final List<? extends LazyGridItemInfo> list, final boolean z10) {
        l<Integer, Integer> lVar = new l<Integer, Integer>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridScrollingKt$calculateLineAverageMainAxisSize$lineOf$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @NotNull
            public final Integer invoke(int i10) {
                return Integer.valueOf(z10 ? list.get(i10).getRow() : list.get(i10).getColumn());
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                return invoke(num.intValue());
            }
        };
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < list.size()) {
            int iIntValue = lVar.invoke(Integer.valueOf(i10)).intValue();
            if (iIntValue == -1) {
                i10++;
            } else {
                int iMax = 0;
                while (i10 < list.size() && lVar.invoke(Integer.valueOf(i10)).intValue() == iIntValue) {
                    iMax = Math.max(iMax, z10 ? IntSize.m3985getHeightimpl(list.get(i10).getSize()) : IntSize.m3986getWidthimpl(list.get(i10).getSize()));
                    i10++;
                }
                i11 += iMax;
                i12++;
            }
        }
        return i11 / i12;
    }

    private static final void debugLog(a<String> aVar) {
    }

    @Nullable
    public static final Object doSmoothScrollToItem(@NotNull LazyGridState lazyGridState, int i10, int i11, int i12, @NotNull c<? super r> cVar) {
        if (((float) i10) >= 0.0f) {
            Object objScroll$default = ScrollableState.scroll$default(lazyGridState, null, new AnonymousClass3(lazyGridState, i10, i12, i11, null), cVar, 1, null);
            return objScroll$default == in.a.g() ? objScroll$default : r.f5635a;
        }
        throw new IllegalArgumentException(("Index should be non-negative (" + i10 + ')').toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LazyGridItemInfo doSmoothScrollToItem$getTargetItem(LazyGridState lazyGridState, int i10) {
        LazyGridItemInfo lazyGridItemInfo;
        List<LazyGridItemInfo> visibleItemsInfo = lazyGridState.getLayoutInfo().getVisibleItemsInfo();
        int size = visibleItemsInfo.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                lazyGridItemInfo = null;
                break;
            }
            lazyGridItemInfo = visibleItemsInfo.get(i11);
            if (lazyGridItemInfo.getIndex() == i10) {
                break;
            }
            i11++;
        }
        return lazyGridItemInfo;
    }
}
