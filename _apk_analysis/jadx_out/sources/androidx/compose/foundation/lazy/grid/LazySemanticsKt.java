package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.CollectionInfo;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import bn.r;
import hn.c;
import jn.d;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.i;
import p000do.l0;
import sn.a;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: LazySemantics.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u001aC\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;", "itemProvider", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "state", "Ldo/l0;", "coroutineScope", "", "isVertical", "reverseScrolling", "userScrollEnabled", "lazyGridSemantics", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;Landroidx/compose/foundation/lazy/grid/LazyGridState;Ldo/l0;ZZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "foundation_release"}, k = 2, mv = {1, 6, 0})
public final class LazySemanticsKt {
    @Composable
    @NotNull
    public static final Modifier lazyGridSemantics(@NotNull Modifier modifier, @NotNull final LazyGridItemProvider lazyGridItemProvider, @NotNull final LazyGridState lazyGridState, @NotNull final l0 l0Var, final boolean z10, boolean z11, boolean z12, @Nullable Composer composer, int i10) {
        p.k(modifier, "<this>");
        p.k(lazyGridItemProvider, "itemProvider");
        p.k(lazyGridState, "state");
        p.k(l0Var, "coroutineScope");
        composer.startReplaceableGroup(1364424801);
        Object[] objArr = {lazyGridItemProvider, lazyGridState, Boolean.valueOf(z10), Boolean.valueOf(z11), Boolean.valueOf(z12)};
        composer.startReplaceableGroup(-568225417);
        boolean zChanged = false;
        for (int i11 = 0; i11 < 5; i11++) {
            zChanged |= composer.changed(objArr[i11]);
        }
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            final l<Object, Integer> lVar = new l<Object, Integer>() { // from class: androidx.compose.foundation.lazy.grid.LazySemanticsKt$lazyGridSemantics$1$indexForKeyMapping$1
                {
                    super(1);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // sn.l
                @NotNull
                public final Integer invoke(@NotNull Object obj) {
                    p.k(obj, "needle");
                    LazySemanticsKt$lazyGridSemantics$1$indexForKeyMapping$1$key$1 lazySemanticsKt$lazyGridSemantics$1$indexForKeyMapping$1$key$1 = new LazySemanticsKt$lazyGridSemantics$1$indexForKeyMapping$1$key$1(lazyGridItemProvider);
                    int itemCount = lazyGridItemProvider.getItemCount();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= itemCount) {
                            i12 = -1;
                            break;
                        }
                        if (p.f(lazySemanticsKt$lazyGridSemantics$1$indexForKeyMapping$1$key$1.invoke(Integer.valueOf(i12)), obj)) {
                            break;
                        }
                        i12++;
                    }
                    return Integer.valueOf(i12);
                }
            };
            final ScrollAxisRange scrollAxisRange = new ScrollAxisRange(new a<Float>() { // from class: androidx.compose.foundation.lazy.grid.LazySemanticsKt$lazyGridSemantics$1$accessibilityScrollState$1
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // sn.a
                @NotNull
                public final Float invoke() {
                    return Float.valueOf(lazyGridState.getFirstVisibleItemIndex() + (lazyGridState.getFirstVisibleItemScrollOffset() / 100000.0f));
                }
            }, new a<Float>() { // from class: androidx.compose.foundation.lazy.grid.LazySemanticsKt$lazyGridSemantics$1$accessibilityScrollState$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // sn.a
                @NotNull
                public final Float invoke() {
                    float firstVisibleItemIndex;
                    float firstVisibleItemScrollOffset;
                    if (lazyGridState.getCanScrollForward()) {
                        firstVisibleItemIndex = lazyGridItemProvider.getItemCount();
                        firstVisibleItemScrollOffset = 1.0f;
                    } else {
                        firstVisibleItemIndex = lazyGridState.getFirstVisibleItemIndex();
                        firstVisibleItemScrollOffset = lazyGridState.getFirstVisibleItemScrollOffset() / 100000.0f;
                    }
                    return Float.valueOf(firstVisibleItemIndex + firstVisibleItemScrollOffset);
                }
            }, z11);
            final sn.p<Float, Float, Boolean> pVar = z12 ? new sn.p<Float, Float, Boolean>() { // from class: androidx.compose.foundation.lazy.grid.LazySemanticsKt$lazyGridSemantics$1$scrollByAction$1

                /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazySemanticsKt$lazyGridSemantics$1$scrollByAction$1$1, reason: invalid class name */
                /* JADX INFO: compiled from: LazySemantics.kt */
                @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                @d(c = "androidx.compose.foundation.lazy.grid.LazySemanticsKt$lazyGridSemantics$1$scrollByAction$1$1", f = "LazySemantics.kt", l = {96}, m = "invokeSuspend")
                public static final class AnonymousClass1 extends SuspendLambda implements sn.p<l0, c<? super r>, Object> {
                    public final /* synthetic */ float $delta;
                    public final /* synthetic */ LazyGridState $state;
                    public int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(LazyGridState lazyGridState, float f10, c<? super AnonymousClass1> cVar) {
                        super(2, cVar);
                        this.$state = lazyGridState;
                        this.$delta = f10;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
                        return new AnonymousClass1(this.$state, this.$delta, cVar);
                    }

                    @Override // sn.p
                    @Nullable
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                    public final Object mo2invoke(@NotNull l0 l0Var, @Nullable c<? super r> cVar) {
                        return ((AnonymousClass1) create(l0Var, cVar)).invokeSuspend(r.f5635a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        Object objG = in.a.g();
                        int i10 = this.label;
                        if (i10 == 0) {
                            kotlin.c.b(obj);
                            LazyGridState lazyGridState = this.$state;
                            float f10 = this.$delta;
                            this.label = 1;
                            if (ScrollExtensionsKt.animateScrollBy$default(lazyGridState, f10, null, this, 2, null) == objG) {
                                return objG;
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.c.b(obj);
                        }
                        return r.f5635a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @NotNull
                public final Boolean invoke(float f10, float f11) {
                    if (z10) {
                        f10 = f11;
                    }
                    i.d(l0Var, null, null, new AnonymousClass1(lazyGridState, f10, null), 3, null);
                    return Boolean.TRUE;
                }

                @Override // sn.p
                /* JADX INFO: renamed from: invoke */
                public /* bridge */ /* synthetic */ Boolean mo2invoke(Float f10, Float f11) {
                    return invoke(f10.floatValue(), f11.floatValue());
                }
            } : null;
            final l<Integer, Boolean> lVar2 = z12 ? new l<Integer, Boolean>() { // from class: androidx.compose.foundation.lazy.grid.LazySemanticsKt$lazyGridSemantics$1$scrollToIndexAction$1

                /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazySemanticsKt$lazyGridSemantics$1$scrollToIndexAction$1$2, reason: invalid class name */
                /* JADX INFO: compiled from: LazySemantics.kt */
                @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                @d(c = "androidx.compose.foundation.lazy.grid.LazySemanticsKt$lazyGridSemantics$1$scrollToIndexAction$1$2", f = "LazySemantics.kt", l = {112}, m = "invokeSuspend")
                public static final class AnonymousClass2 extends SuspendLambda implements sn.p<l0, c<? super r>, Object> {
                    public final /* synthetic */ int $index;
                    public final /* synthetic */ LazyGridState $state;
                    public int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass2(LazyGridState lazyGridState, int i10, c<? super AnonymousClass2> cVar) {
                        super(2, cVar);
                        this.$state = lazyGridState;
                        this.$index = i10;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
                        return new AnonymousClass2(this.$state, this.$index, cVar);
                    }

                    @Override // sn.p
                    @Nullable
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                    public final Object mo2invoke(@NotNull l0 l0Var, @Nullable c<? super r> cVar) {
                        return ((AnonymousClass2) create(l0Var, cVar)).invokeSuspend(r.f5635a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        Object objG = in.a.g();
                        int i10 = this.label;
                        if (i10 == 0) {
                            kotlin.c.b(obj);
                            LazyGridState lazyGridState = this.$state;
                            int i11 = this.$index;
                            this.label = 1;
                            if (LazyGridState.scrollToItem$default(lazyGridState, i11, 0, this, 2, null) == objG) {
                                return objG;
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.c.b(obj);
                        }
                        return r.f5635a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @NotNull
                public final Boolean invoke(int i12) {
                    boolean z13 = i12 >= 0 && i12 < lazyGridState.getLayoutInfo().getTotalItemsCount();
                    LazyGridState lazyGridState2 = lazyGridState;
                    if (z13) {
                        i.d(l0Var, null, null, new AnonymousClass2(lazyGridState2, i12, null), 3, null);
                        return Boolean.TRUE;
                    }
                    throw new IllegalArgumentException(("Can't scroll to index " + i12 + ", it is out of bounds [0, " + lazyGridState2.getLayoutInfo().getTotalItemsCount() + ')').toString());
                }

                @Override // sn.l
                public /* bridge */ /* synthetic */ Boolean invoke(Integer num) {
                    return invoke(num.intValue());
                }
            } : null;
            final CollectionInfo collectionInfo = new CollectionInfo(-1, -1);
            objRememberedValue = SemanticsModifierKt.semantics$default(Modifier.INSTANCE, false, new l<SemanticsPropertyReceiver, r>() { // from class: androidx.compose.foundation.lazy.grid.LazySemanticsKt$lazyGridSemantics$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // sn.l
                public /* bridge */ /* synthetic */ r invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    invoke2(semanticsPropertyReceiver);
                    return r.f5635a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    p.k(semanticsPropertyReceiver, "$this$semantics");
                    SemanticsPropertiesKt.indexForKey(semanticsPropertyReceiver, lVar);
                    if (z10) {
                        SemanticsPropertiesKt.setVerticalScrollAxisRange(semanticsPropertyReceiver, scrollAxisRange);
                    } else {
                        SemanticsPropertiesKt.setHorizontalScrollAxisRange(semanticsPropertyReceiver, scrollAxisRange);
                    }
                    sn.p<Float, Float, Boolean> pVar2 = pVar;
                    if (pVar2 != null) {
                        SemanticsPropertiesKt.scrollBy$default(semanticsPropertyReceiver, null, pVar2, 1, null);
                    }
                    l<Integer, Boolean> lVar3 = lVar2;
                    if (lVar3 != null) {
                        SemanticsPropertiesKt.scrollToIndex$default(semanticsPropertyReceiver, null, lVar3, 1, null);
                    }
                    SemanticsPropertiesKt.setCollectionInfo(semanticsPropertyReceiver, collectionInfo);
                }
            }, 1, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        Modifier modifierThen = modifier.then((Modifier) objRememberedValue);
        composer.endReplaceableGroup();
        return modifierThen;
    }
}
