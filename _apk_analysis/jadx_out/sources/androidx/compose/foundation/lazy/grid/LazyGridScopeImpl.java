package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.MutableIntervalList;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import bn.r;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import sn.p;
import sn.q;

/* JADX INFO: compiled from: LazyGridScopeImpl.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b$\u0010%JU\u0010\r\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00022\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0004¢\u0006\u0002\b\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0081\u0001\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\u001a\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00112\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00042\u001d\u0010\u0012\u001a\u0019\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\n0\u0011¢\u0006\u0002\b\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\"\u0010\u001c\u001a\u00020\u001b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R)\u0010\"\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00060\u00118\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\"\u0010#\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006&"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridScopeImpl;", "Landroidx/compose/foundation/lazy/grid/LazyGridScope;", "", "key", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "span", "contentType", "Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;", "Lbn/r;", "Landroidx/compose/runtime/Composable;", "content", "item", "(Ljava/lang/Object;Lsn/l;Ljava/lang/Object;Lsn/q;)V", "", "count", "Lkotlin/Function2;", "itemContent", "items", "(ILsn/l;Lsn/p;Lsn/l;Lsn/r;)V", "Landroidx/compose/foundation/lazy/layout/MutableIntervalList;", "Landroidx/compose/foundation/lazy/grid/LazyGridIntervalContent;", "intervals", "Landroidx/compose/foundation/lazy/layout/MutableIntervalList;", "getIntervals$foundation_release", "()Landroidx/compose/foundation/lazy/layout/MutableIntervalList;", "", "hasCustomSpans", "Z", "getHasCustomSpans$foundation_release", "()Z", "setHasCustomSpans$foundation_release", "(Z)V", "DefaultSpan", "Lsn/p;", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 6, 0})
public final class LazyGridScopeImpl implements LazyGridScope {
    private boolean hasCustomSpans;

    @NotNull
    private final MutableIntervalList<LazyGridIntervalContent> intervals = new MutableIntervalList<>();

    @NotNull
    private final p<LazyGridItemSpanScope, Integer, GridItemSpan> DefaultSpan = new p<LazyGridItemSpanScope, Integer, GridItemSpan>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridScopeImpl$DefaultSpan$1
        @Override // sn.p
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ GridItemSpan mo2invoke(LazyGridItemSpanScope lazyGridItemSpanScope, Integer num) {
            return GridItemSpan.m546boximpl(m590invoke_orMbw(lazyGridItemSpanScope, num.intValue()));
        }

        /* JADX INFO: renamed from: invoke-_-orMbw, reason: not valid java name */
        public final long m590invoke_orMbw(@NotNull LazyGridItemSpanScope lazyGridItemSpanScope, int i10) {
            tn.p.k(lazyGridItemSpanScope, "$this$null");
            return LazyGridSpanKt.GridItemSpan(1);
        }
    };

    /* JADX INFO: renamed from: getHasCustomSpans$foundation_release, reason: from getter */
    public final boolean getHasCustomSpans() {
        return this.hasCustomSpans;
    }

    @NotNull
    public final MutableIntervalList<LazyGridIntervalContent> getIntervals$foundation_release() {
        return this.intervals;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridScope
    public void item(@Nullable final Object key, @Nullable final l<? super LazyGridItemSpanScope, GridItemSpan> span, @Nullable final Object contentType, @NotNull final q<? super LazyGridItemScope, ? super Composer, ? super Integer, r> content) {
        tn.p.k(content, "content");
        this.intervals.addInterval(1, new LazyGridIntervalContent(key != null ? new l<Integer, Object>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridScopeImpl$item$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @NotNull
            public final Object invoke(int i10) {
                return key;
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }
        } : null, span != null ? new p<LazyGridItemSpanScope, Integer, GridItemSpan>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridScopeImpl$item$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // sn.p
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ GridItemSpan mo2invoke(LazyGridItemSpanScope lazyGridItemSpanScope, Integer num) {
                return GridItemSpan.m546boximpl(m591invoke_orMbw(lazyGridItemSpanScope, num.intValue()));
            }

            /* JADX INFO: renamed from: invoke-_-orMbw, reason: not valid java name */
            public final long m591invoke_orMbw(@NotNull LazyGridItemSpanScope lazyGridItemSpanScope, int i10) {
                tn.p.k(lazyGridItemSpanScope, "$this$null");
                return span.invoke(lazyGridItemSpanScope).getPackedValue();
            }
        } : this.DefaultSpan, new l<Integer, Object>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridScopeImpl.item.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Nullable
            public final Object invoke(int i10) {
                return contentType;
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }
        }, ComposableLambdaKt.composableLambdaInstance(-1504808184, true, new sn.r<LazyGridItemScope, Integer, Composer, Integer, r>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridScopeImpl.item.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(4);
            }

            @Override // sn.r
            public /* bridge */ /* synthetic */ r invoke(LazyGridItemScope lazyGridItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyGridItemScope, num.intValue(), composer, num2.intValue());
                return r.f5635a;
            }

            @Composable
            public final void invoke(@NotNull LazyGridItemScope lazyGridItemScope, int i10, @Nullable Composer composer, int i11) {
                tn.p.k(lazyGridItemScope, "$this$$receiver");
                if ((i11 & 14) == 0) {
                    i11 |= composer.changed(lazyGridItemScope) ? 4 : 2;
                }
                if ((i11 & 651) == 130 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                } else {
                    content.invoke(lazyGridItemScope, composer, Integer.valueOf(i11 & 14));
                }
            }
        })));
        if (span != null) {
            this.hasCustomSpans = true;
        }
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridScope
    public void items(int count, @Nullable l<? super Integer, ? extends Object> key, @Nullable p<? super LazyGridItemSpanScope, ? super Integer, GridItemSpan> span, @NotNull l<? super Integer, ? extends Object> contentType, @NotNull sn.r<? super LazyGridItemScope, ? super Integer, ? super Composer, ? super Integer, r> itemContent) {
        tn.p.k(contentType, "contentType");
        tn.p.k(itemContent, "itemContent");
        this.intervals.addInterval(count, new LazyGridIntervalContent(key, span == null ? this.DefaultSpan : span, contentType, itemContent));
        if (span != null) {
            this.hasCustomSpans = true;
        }
    }

    public final void setHasCustomSpans$foundation_release(boolean z10) {
        this.hasCustomSpans = z10;
    }
}
