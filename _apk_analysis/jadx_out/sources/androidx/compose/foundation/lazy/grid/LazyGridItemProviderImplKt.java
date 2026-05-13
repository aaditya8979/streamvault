package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.Snapshot;
import bn.r;
import go.e;
import hn.c;
import in.a;
import java.util.HashMap;
import java.util.Map;
import jn.d;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;
import sn.l;
import sn.p;
import zn.i;
import zn.n;

/* JADX INFO: compiled from: LazyGridItemProviderImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u001a+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a*\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0001\u001a\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0010H\u0002\"\u0014\u0010\u0014\u001a\u00020\u00108\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\"\u0014\u0010\u0016\u001a\u00020\u00108\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridState;", "state", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/grid/LazyGridScope;", "Lbn/r;", "content", "Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;", "rememberItemProvider", "(Landroidx/compose/foundation/lazy/grid/LazyGridState;Lsn/l;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;", "Lzn/i;", "range", "Landroidx/compose/foundation/lazy/layout/IntervalList;", "Landroidx/compose/foundation/lazy/grid/LazyGridIntervalContent;", "list", "", "", "", "generateKeyToIndexMap", "firstVisibleItem", "calculateNearestItemsRange", "VisibleItemsSlidingWindowSize", "I", "ExtraItemsNearTheSlidingWindow", "foundation_release"}, k = 2, mv = {1, 6, 0})
public final class LazyGridItemProviderImplKt {
    private static final int ExtraItemsNearTheSlidingWindow = 200;
    private static final int VisibleItemsSlidingWindowSize = 90;

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridItemProviderImplKt$rememberItemProvider$1, reason: invalid class name */
    /* JADX INFO: compiled from: LazyGridItemProviderImpl.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    @d(c = "androidx.compose.foundation.lazy.grid.LazyGridItemProviderImplKt$rememberItemProvider$1", f = "LazyGridItemProviderImpl.kt", l = {53}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements p<l0, c<? super r>, Object> {
        public final /* synthetic */ MutableState<i> $nearestItemsRangeState;
        public final /* synthetic */ LazyGridState $state;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(LazyGridState lazyGridState, MutableState<i> mutableState, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$state = lazyGridState;
            this.$nearestItemsRangeState = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
            return new AnonymousClass1(this.$state, this.$nearestItemsRangeState, cVar);
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
            Object objG = a.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.c.b(obj);
                final LazyGridState lazyGridState = this.$state;
                go.d dVarSnapshotFlow = SnapshotStateKt.snapshotFlow(new sn.a<i>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridItemProviderImplKt.rememberItemProvider.1.1
                    {
                        super(0);
                    }

                    @Override // sn.a
                    @NotNull
                    public final i invoke() {
                        return LazyGridItemProviderImplKt.calculateNearestItemsRange(lazyGridState.getFirstVisibleItemIndex());
                    }
                });
                final MutableState<i> mutableState = this.$nearestItemsRangeState;
                e<i> eVar = new e<i>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridItemProviderImplKt.rememberItemProvider.1.2
                    @Override // go.e
                    public /* bridge */ /* synthetic */ Object emit(i iVar, c cVar) {
                        return emit2(iVar, (c<? super r>) cVar);
                    }

                    @Nullable
                    /* JADX INFO: renamed from: emit, reason: avoid collision after fix types in other method */
                    public final Object emit2(@NotNull i iVar, @NotNull c<? super r> cVar) {
                        mutableState.setValue(iVar);
                        return r.f5635a;
                    }
                };
                this.label = 1;
                if (dVarSnapshotFlow.collect(eVar, this) == objG) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final i calculateNearestItemsRange(int i10) {
        int i11 = VisibleItemsSlidingWindowSize;
        int i12 = (i10 / i11) * i11;
        int i13 = ExtraItemsNearTheSlidingWindow;
        return n.v(Math.max(i12 - i13, 0), i12 + i11 + i13);
    }

    @ExperimentalFoundationApi
    @NotNull
    public static final Map<Object, Integer> generateKeyToIndexMap(@NotNull i iVar, @NotNull IntervalList<LazyGridIntervalContent> intervalList) {
        tn.p.k(iVar, "range");
        tn.p.k(intervalList, "list");
        final int iF = iVar.f();
        if (!(iF >= 0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        final int iMin = Math.min(iVar.g(), intervalList.getSize() - 1);
        if (iMin < iF) {
            return kotlin.collections.a.j();
        }
        final HashMap map = new HashMap();
        intervalList.forEach(iF, iMin, new l<IntervalList.Interval<LazyGridIntervalContent>, r>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridItemProviderImplKt$generateKeyToIndexMap$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(IntervalList.Interval<LazyGridIntervalContent> interval) {
                invoke2(interval);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull IntervalList.Interval<LazyGridIntervalContent> interval) {
                tn.p.k(interval, "it");
                if (interval.getValue().getKey() == null) {
                    return;
                }
                l<Integer, Object> key = interval.getValue().getKey();
                if (key == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                int iMax = Math.max(iF, interval.getStartIndex());
                int iMin2 = Math.min(iMin, (interval.getStartIndex() + interval.getSize()) - 1);
                if (iMax > iMin2) {
                    return;
                }
                while (true) {
                    map.put(key.invoke(Integer.valueOf(iMax - interval.getStartIndex())), Integer.valueOf(iMax));
                    if (iMax == iMin2) {
                        return;
                    } else {
                        iMax++;
                    }
                }
            }
        });
        return map;
    }

    @Composable
    @ExperimentalFoundationApi
    @NotNull
    public static final LazyGridItemProvider rememberItemProvider(@NotNull LazyGridState lazyGridState, @NotNull l<? super LazyGridScope, r> lVar, @Nullable Composer composer, int i10) {
        tn.p.k(lazyGridState, "state");
        tn.p.k(lVar, "content");
        composer.startReplaceableGroup(1895482293);
        final State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(lVar, composer, (i10 >> 3) & 14);
        composer.startReplaceableGroup(1157296644);
        boolean zChanged = composer.changed(lazyGridState);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            Snapshot snapshotCreateNonObservableSnapshot = Snapshot.INSTANCE.createNonObservableSnapshot();
            try {
                Snapshot snapshotMakeCurrent = snapshotCreateNonObservableSnapshot.makeCurrent();
                try {
                    i iVarCalculateNearestItemsRange = calculateNearestItemsRange(lazyGridState.getFirstVisibleItemIndex());
                    snapshotCreateNonObservableSnapshot.dispose();
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(iVarCalculateNearestItemsRange, null, 2, null);
                    composer.updateRememberedValue(objRememberedValue);
                } finally {
                    snapshotCreateNonObservableSnapshot.restoreCurrent(snapshotMakeCurrent);
                }
            } catch (Throwable th2) {
                snapshotCreateNonObservableSnapshot.dispose();
                throw th2;
            }
        }
        composer.endReplaceableGroup();
        final MutableState mutableState = (MutableState) objRememberedValue;
        EffectsKt.LaunchedEffect(mutableState, new AnonymousClass1(lazyGridState, mutableState, null), composer, 0);
        composer.startReplaceableGroup(1157296644);
        boolean zChanged2 = composer.changed(mutableState);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new LazyGridItemProviderImpl(SnapshotStateKt.derivedStateOf(new sn.a<LazyGridItemsSnapshot>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridItemProviderImplKt$rememberItemProvider$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // sn.a
                @NotNull
                public final LazyGridItemsSnapshot invoke() {
                    LazyGridScopeImpl lazyGridScopeImpl = new LazyGridScopeImpl();
                    stateRememberUpdatedState.getValue().invoke(lazyGridScopeImpl);
                    return new LazyGridItemsSnapshot(lazyGridScopeImpl.getIntervals$foundation_release(), lazyGridScopeImpl.getHasCustomSpans(), mutableState.getValue());
                }
            }));
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceableGroup();
        LazyGridItemProviderImpl lazyGridItemProviderImpl = (LazyGridItemProviderImpl) objRememberedValue2;
        composer.endReplaceableGroup();
        return lazyGridItemProviderImpl;
    }
}
