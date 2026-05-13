package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import bn.r;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.a;
import sn.l;
import sn.p;

/* JADX INFO: compiled from: LazyLayoutItemContentFactory.kt */
/* JADX INFO: loaded from: classes8.dex */
@ExperimentalFoundationApi
@Metadata(bv = {}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001:\u0001$B\u001d\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u000e¢\u0006\u0004\b\"\u0010#J#\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00012\b\u0010\n\u001a\u0004\u0018\u00010\u0001J(\u0010\u0010\u001a\r\u0012\u0004\u0012\u00020\u00060\u000e¢\u0006\u0002\b\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u000e8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R$\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u0001\u0012\b\u0012\u00060\u001bR\u00020\u00000\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001e\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001f\u0010 \u001a\u00020\u00048\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b \u0010!\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006%"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;", "", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Lbn/r;", "onBeforeMeasure-0kLqBqw", "(Landroidx/compose/ui/unit/Density;J)V", "onBeforeMeasure", "key", "getContentType", "", "index", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "getContent", "(ILjava/lang/Object;)Lsn/p;", "Landroidx/compose/runtime/saveable/SaveableStateHolder;", "saveableStateHolder", "Landroidx/compose/runtime/saveable/SaveableStateHolder;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "itemProvider", "Lsn/a;", "getItemProvider", "()Lsn/a;", "", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory$CachedItemContent;", "lambdasCache", "Ljava/util/Map;", "densityOfCachedLambdas", "Landroidx/compose/ui/unit/Density;", "constraintsOfCachedLambdas", "J", "<init>", "(Landroidx/compose/runtime/saveable/SaveableStateHolder;Lsn/a;)V", "CachedItemContent", "foundation_release"}, k = 1, mv = {1, 6, 0})
public final class LazyLayoutItemContentFactory {
    private long constraintsOfCachedLambdas;

    @NotNull
    private Density densityOfCachedLambdas;

    @NotNull
    private final a<LazyLayoutItemProvider> itemProvider;

    @NotNull
    private final Map<Object, CachedItemContent> lambdasCache;

    @NotNull
    private final SaveableStateHolder saveableStateHolder;

    /* JADX INFO: compiled from: LazyLayoutItemContentFactory.kt */
    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0010\b\u0082\u0004\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u001a\u001a\u00020\r\u0012\u0006\u0010\u0007\u001a\u00020\u0001\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\f\u0010\nR+\u0010\u0015\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R#\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00048F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0006¨\u0006\u001d"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory$CachedItemContent;", "", "Lkotlin/Function0;", "Lbn/r;", "Landroidx/compose/runtime/Composable;", "createContentLambda", "()Lsn/p;", "key", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "type", "getType", "", "<set-?>", "lastKnownIndex$delegate", "Landroidx/compose/runtime/MutableState;", "getLastKnownIndex", "()I", "setLastKnownIndex", "(I)V", "lastKnownIndex", "_content", "Lsn/p;", "getContent", "content", "initialIndex", "<init>", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;ILjava/lang/Object;Ljava/lang/Object;)V", "foundation_release"}, k = 1, mv = {1, 6, 0})
    public final class CachedItemContent {

        @Nullable
        private p<? super Composer, ? super Integer, r> _content;

        @NotNull
        private final Object key;

        /* JADX INFO: renamed from: lastKnownIndex$delegate, reason: from kotlin metadata */
        @NotNull
        private final MutableState lastKnownIndex;
        public final /* synthetic */ LazyLayoutItemContentFactory this$0;

        @Nullable
        private final Object type;

        public CachedItemContent(LazyLayoutItemContentFactory lazyLayoutItemContentFactory, @NotNull int i10, @Nullable Object obj, Object obj2) {
            tn.p.k(obj, "key");
            this.this$0 = lazyLayoutItemContentFactory;
            this.key = obj;
            this.type = obj2;
            this.lastKnownIndex = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Integer.valueOf(i10), null, 2, null);
        }

        private final p<Composer, Integer, r> createContentLambda() {
            final LazyLayoutItemContentFactory lazyLayoutItemContentFactory = this.this$0;
            return ComposableLambdaKt.composableLambdaInstance(1403994769, true, new p<Composer, Integer, r>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // sn.p
                /* JADX INFO: renamed from: invoke */
                public /* bridge */ /* synthetic */ r mo2invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return r.f5635a;
                }

                @Composable
                public final void invoke(@Nullable Composer composer, int i10) {
                    final int lastKnownIndex;
                    if ((i10 & 11) == 2 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    final LazyLayoutItemProvider lazyLayoutItemProviderInvoke = lazyLayoutItemContentFactory.getItemProvider().invoke();
                    Integer num = lazyLayoutItemProviderInvoke.getKeyToIndexMap().get(this.getKey());
                    if (num != null) {
                        this.setLastKnownIndex(num.intValue());
                        lastKnownIndex = num.intValue();
                    } else {
                        lastKnownIndex = this.getLastKnownIndex();
                    }
                    composer.startReplaceableGroup(-715769699);
                    if (lastKnownIndex < lazyLayoutItemProviderInvoke.getItemCount()) {
                        Object key = lazyLayoutItemProviderInvoke.getKey(lastKnownIndex);
                        if (tn.p.f(key, this.getKey())) {
                            lazyLayoutItemContentFactory.saveableStateHolder.SaveableStateProvider(key, ComposableLambdaKt.composableLambda(composer, -1238863364, true, new p<Composer, Integer, r>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // sn.p
                                /* JADX INFO: renamed from: invoke */
                                public /* bridge */ /* synthetic */ r mo2invoke(Composer composer2, Integer num2) {
                                    invoke(composer2, num2.intValue());
                                    return r.f5635a;
                                }

                                @Composable
                                public final void invoke(@Nullable Composer composer2, int i11) {
                                    if ((i11 & 11) == 2 && composer2.getSkipping()) {
                                        composer2.skipToGroupEnd();
                                    } else {
                                        lazyLayoutItemProviderInvoke.Item(lastKnownIndex, composer2, 0);
                                    }
                                }
                            }), composer, 568);
                        }
                    }
                    composer.endReplaceableGroup();
                    Object key2 = this.getKey();
                    final LazyLayoutItemContentFactory.CachedItemContent cachedItemContent = this;
                    EffectsKt.DisposableEffect(key2, new l<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1.2
                        {
                            super(1);
                        }

                        @Override // sn.l
                        @NotNull
                        public final DisposableEffectResult invoke(@NotNull DisposableEffectScope disposableEffectScope) {
                            tn.p.k(disposableEffectScope, "$this$DisposableEffect");
                            final LazyLayoutItemContentFactory.CachedItemContent cachedItemContent2 = cachedItemContent;
                            return new DisposableEffectResult() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1$2$invoke$$inlined$onDispose$1
                                @Override // androidx.compose.runtime.DisposableEffectResult
                                public void dispose() {
                                    cachedItemContent2._content = null;
                                }
                            };
                        }
                    }, composer, 8);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void setLastKnownIndex(int i10) {
            this.lastKnownIndex.setValue(Integer.valueOf(i10));
        }

        @NotNull
        public final p<Composer, Integer, r> getContent() {
            p pVar = this._content;
            if (pVar != null) {
                return pVar;
            }
            p<Composer, Integer, r> pVarCreateContentLambda = createContentLambda();
            this._content = pVarCreateContentLambda;
            return pVarCreateContentLambda;
        }

        @NotNull
        public final Object getKey() {
            return this.key;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final int getLastKnownIndex() {
            return ((Number) this.lastKnownIndex.getValue()).intValue();
        }

        @Nullable
        public final Object getType() {
            return this.type;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LazyLayoutItemContentFactory(@NotNull SaveableStateHolder saveableStateHolder, @NotNull a<? extends LazyLayoutItemProvider> aVar) {
        tn.p.k(saveableStateHolder, "saveableStateHolder");
        tn.p.k(aVar, "itemProvider");
        this.saveableStateHolder = saveableStateHolder;
        this.itemProvider = aVar;
        this.lambdasCache = new LinkedHashMap();
        this.densityOfCachedLambdas = DensityKt.Density(0.0f, 0.0f);
        this.constraintsOfCachedLambdas = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
    }

    @NotNull
    public final p<Composer, Integer, r> getContent(int index, @NotNull Object key) {
        tn.p.k(key, "key");
        CachedItemContent cachedItemContent = this.lambdasCache.get(key);
        Object contentType = this.itemProvider.invoke().getContentType(index);
        if (cachedItemContent != null && cachedItemContent.getLastKnownIndex() == index && tn.p.f(cachedItemContent.getType(), contentType)) {
            return cachedItemContent.getContent();
        }
        CachedItemContent cachedItemContent2 = new CachedItemContent(this, index, key, contentType);
        this.lambdasCache.put(key, cachedItemContent2);
        return cachedItemContent2.getContent();
    }

    @Nullable
    public final Object getContentType(@Nullable Object key) {
        CachedItemContent cachedItemContent = this.lambdasCache.get(key);
        if (cachedItemContent != null) {
            return cachedItemContent.getType();
        }
        LazyLayoutItemProvider lazyLayoutItemProviderInvoke = this.itemProvider.invoke();
        Integer num = lazyLayoutItemProviderInvoke.getKeyToIndexMap().get(key);
        if (num != null) {
            return lazyLayoutItemProviderInvoke.getContentType(num.intValue());
        }
        return null;
    }

    @NotNull
    public final a<LazyLayoutItemProvider> getItemProvider() {
        return this.itemProvider;
    }

    /* JADX INFO: renamed from: onBeforeMeasure-0kLqBqw, reason: not valid java name */
    public final void m621onBeforeMeasure0kLqBqw(@NotNull Density density, long constraints) {
        tn.p.k(density, "density");
        if (tn.p.f(density, this.densityOfCachedLambdas) && Constraints.m3775equalsimpl0(constraints, this.constraintsOfCachedLambdas)) {
            return;
        }
        this.densityOfCachedLambdas = density;
        this.constraintsOfCachedLambdas = constraints;
        this.lambdasCache.clear();
    }
}
