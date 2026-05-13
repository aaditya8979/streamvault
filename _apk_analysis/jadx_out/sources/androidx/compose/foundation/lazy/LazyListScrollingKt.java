package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.ui.unit.Dp;
import bn.r;
import hn.c;
import java.util.List;
import jn.d;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.a;
import sn.p;

/* JADX INFO: compiled from: LazyListScrolling.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0017\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0082\b\u001a'\u0010\t\u001a\u00020\u0003*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0080@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\"\u0017\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\f\u0010\r\"\u0017\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u000e\u0010\r\"\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lkotlin/Function0;", "", "generateMsg", "Lbn/r;", "debugLog", "Landroidx/compose/foundation/lazy/LazyListState;", "", "index", "scrollOffset", "doSmoothScrollToItem", "(Landroidx/compose/foundation/lazy/LazyListState;IILhn/c;)Ljava/lang/Object;", "Landroidx/compose/ui/unit/Dp;", "TargetDistance", "F", "BoundDistance", "", "DEBUG", "Z", "foundation_release"}, k = 2, mv = {1, 6, 0})
public final class LazyListScrollingKt {
    private static final boolean DEBUG = false;
    private static final float TargetDistance = Dp.m3826constructorimpl(2500);
    private static final float BoundDistance = Dp.m3826constructorimpl(1500);

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyListScrollingKt$doSmoothScrollToItem$3, reason: invalid class name */
    /* JADX INFO: compiled from: LazyListScrolling.kt */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollScope;", "Lbn/r;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @d(c = "androidx.compose.foundation.lazy.LazyListScrollingKt$doSmoothScrollToItem$3", f = "LazyListScrolling.kt", l = {114, 205}, m = "invokeSuspend")
    public static final class AnonymousClass3 extends SuspendLambda implements p<ScrollScope, c<? super r>, Object> {
        public final /* synthetic */ int $index;
        public final /* synthetic */ int $scrollOffset;
        public final /* synthetic */ LazyListState $this_doSmoothScrollToItem;
        public float F$0;
        public float F$1;
        public int I$0;
        private /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(LazyListState lazyListState, int i10, int i11, c<? super AnonymousClass3> cVar) {
            super(2, cVar);
            this.$this_doSmoothScrollToItem = lazyListState;
            this.$index = i10;
            this.$scrollOffset = i11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invokeSuspend$isOvershot(boolean z10, LazyListState lazyListState, int i10, int i11) {
            if (z10) {
                if (lazyListState.getFirstVisibleItemIndex() <= i10 && (lazyListState.getFirstVisibleItemIndex() != i10 || lazyListState.getFirstVisibleItemScrollOffset() <= i11)) {
                    return false;
                }
            } else if (lazyListState.getFirstVisibleItemIndex() >= i10 && (lazyListState.getFirstVisibleItemIndex() != i10 || lazyListState.getFirstVisibleItemScrollOffset() >= i11)) {
                return false;
            }
            return true;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$this_doSmoothScrollToItem, this.$index, this.$scrollOffset, cVar);
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
        /* JADX WARN: Path cross not found for [B:35:0x0107, B:34:0x0105], limit reached: 92 */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00b1 A[Catch: ItemFoundInScroll -> 0x01d8, TryCatch #1 {ItemFoundInScroll -> 0x01d8, blocks: (B:23:0x00ad, B:25:0x00b1, B:27:0x00bd, B:32:0x00df, B:38:0x010d, B:45:0x0154, B:49:0x015d), top: B:84:0x00ad }] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00d0 A[Catch: ItemFoundInScroll -> 0x01ce, TRY_ENTER, TRY_LEAVE, TryCatch #0 {ItemFoundInScroll -> 0x01ce, blocks: (B:57:0x01c1, B:30:0x00d0), top: B:82:0x01c1 }] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0107  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x014a  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x014c  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x014f  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0152  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0158  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x015b  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x01b6 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:56:0x01b7  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x0223  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x0226  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x0249 A[RETURN] */
        /* JADX WARN: Type inference failed for: r10v0, types: [T, androidx.compose.animation.core.AnimationState] */
        /* JADX WARN: Type inference failed for: r5v15, types: [T, androidx.compose.animation.core.AnimationState] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x01b7 -> B:82:0x01c1). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r37) {
            /*
                Method dump skipped, instruction units count: 598
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyListScrollingKt.AnonymousClass3.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    private static final void debugLog(a<String> aVar) {
    }

    @Nullable
    public static final Object doSmoothScrollToItem(@NotNull LazyListState lazyListState, int i10, int i11, @NotNull c<? super r> cVar) {
        if (((float) i10) >= 0.0f) {
            Object objScroll$default = ScrollableState.scroll$default(lazyListState, null, new AnonymousClass3(lazyListState, i10, i11, null), cVar, 1, null);
            return objScroll$default == in.a.g() ? objScroll$default : r.f5635a;
        }
        throw new IllegalArgumentException(("Index should be non-negative (" + i10 + ')').toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LazyListItemInfo doSmoothScrollToItem$getTargetItem(LazyListState lazyListState, int i10) {
        LazyListItemInfo lazyListItemInfo;
        List<LazyListItemInfo> visibleItemsInfo = lazyListState.getLayoutInfo().getVisibleItemsInfo();
        int size = visibleItemsInfo.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                lazyListItemInfo = null;
                break;
            }
            lazyListItemInfo = visibleItemsInfo.get(i11);
            if (lazyListItemInfo.getIndex() == i10) {
                break;
            }
            i11++;
        }
        return lazyListItemInfo;
    }
}
