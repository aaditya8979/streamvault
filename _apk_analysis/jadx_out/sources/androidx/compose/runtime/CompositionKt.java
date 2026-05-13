package androidx.compose.runtime;

import androidx.compose.runtime.collection.IdentityArrayMap;
import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.exifinterface.media.ExifInterface;
import bn.r;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: Composition.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\u001a\u001a\u0010\u0005\u001a\u00020\u00042\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u0002\u001a\u001a\u0010\u0007\u001a\u00020\u00062\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u0002\u001a$\u0010\u0005\u001a\u00020\u00042\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0007\u001a$\u0010\u0007\u001a\u00020\u00062\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0007\u001a\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n\u001a\u000e\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e\u001aK\u0010\u0016\u001a\u00020\f\"\b\b\u0000\u0010\u0011*\u00020\n\"\b\b\u0001\u0010\u0012*\u00020\n*\u0016\u0012\u0004\u0012\u00028\u0000\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00140\u00132\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a7\u0010\u001e\u001a\u00020\f\"\u0004\b\u0000\u0010\u0018*\u0012\u0012\u0004\u0012\u00028\u00000\u0019j\b\u0012\u0004\u0012\u00028\u0000`\u001a2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001c0\u001bH\u0082\b\"\u0014\u0010\u001f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 \"\u001e\u0010\t\u001a\u00020\b*\u00020\u00068GX\u0087\u0004¢\u0006\f\u0012\u0004\b#\u0010$\u001a\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/CompositionContext;", "parent", "Landroidx/compose/runtime/Composition;", "Composition", "Landroidx/compose/runtime/ControlledComposition;", "ControlledComposition", "Lkotlin/coroutines/d;", "recomposeCoroutineContext", "", GAMConfig.KEY_CONTEXT, "Lbn/r;", "simulateHotReload", "", "key", "invalidateGroupsWithKey", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/runtime/collection/IdentityArrayMap;", "Landroidx/compose/runtime/collection/IdentityArraySet;", "value", "addValue", "(Landroidx/compose/runtime/collection/IdentityArrayMap;Ljava/lang/Object;Ljava/lang/Object;)V", ExifInterface.LONGITUDE_EAST, "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "Lkotlin/Function1;", "", "predicate", "removeValueIf", "PendingApplyNoModifications", "Ljava/lang/Object;", "getRecomposeCoroutineContext", "(Landroidx/compose/runtime/ControlledComposition;)Lkotlin/coroutines/d;", "getRecomposeCoroutineContext$annotations", "(Landroidx/compose/runtime/ControlledComposition;)V", "runtime_release"}, k = 2, mv = {1, 6, 0})
public final class CompositionKt {

    @NotNull
    private static final Object PendingApplyNoModifications = new Object();

    @NotNull
    public static final Composition Composition(@NotNull Applier<?> applier, @NotNull CompositionContext compositionContext) {
        p.k(applier, "applier");
        p.k(compositionContext, "parent");
        return new CompositionImpl(compositionContext, applier, null, 4, null);
    }

    @ExperimentalComposeApi
    @NotNull
    public static final Composition Composition(@NotNull Applier<?> applier, @NotNull CompositionContext compositionContext, @NotNull d dVar) {
        p.k(applier, "applier");
        p.k(compositionContext, "parent");
        p.k(dVar, "recomposeCoroutineContext");
        return new CompositionImpl(compositionContext, applier, dVar);
    }

    @NotNull
    public static final ControlledComposition ControlledComposition(@NotNull Applier<?> applier, @NotNull CompositionContext compositionContext) {
        p.k(applier, "applier");
        p.k(compositionContext, "parent");
        return new CompositionImpl(compositionContext, applier, null, 4, null);
    }

    @ExperimentalComposeApi
    @NotNull
    public static final ControlledComposition ControlledComposition(@NotNull Applier<?> applier, @NotNull CompositionContext compositionContext, @NotNull d dVar) {
        p.k(applier, "applier");
        p.k(compositionContext, "parent");
        p.k(dVar, "recomposeCoroutineContext");
        return new CompositionImpl(compositionContext, applier, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <K, V> void addValue(IdentityArrayMap<K, IdentityArraySet<V>> identityArrayMap, K k10, V v10) {
        if (identityArrayMap.contains(k10)) {
            IdentityArraySet<V> identityArraySet = identityArrayMap.get(k10);
            if (identityArraySet != null) {
                identityArraySet.add(v10);
                return;
            }
            return;
        }
        IdentityArraySet<V> identityArraySet2 = new IdentityArraySet<>();
        identityArraySet2.add(v10);
        r rVar = r.f5635a;
        identityArrayMap.set(k10, identityArraySet2);
    }

    @ExperimentalComposeApi
    @NotNull
    public static final d getRecomposeCoroutineContext(@NotNull ControlledComposition controlledComposition) {
        d recomposeContext;
        p.k(controlledComposition, "<this>");
        CompositionImpl compositionImpl = controlledComposition instanceof CompositionImpl ? (CompositionImpl) controlledComposition : null;
        return (compositionImpl == null || (recomposeContext = compositionImpl.getRecomposeContext()) == null) ? EmptyCoroutineContext.INSTANCE : recomposeContext;
    }

    @ExperimentalComposeApi
    public static /* synthetic */ void getRecomposeCoroutineContext$annotations(ControlledComposition controlledComposition) {
    }

    public static final void invalidateGroupsWithKey(int i10) {
        HotReloader.INSTANCE.invalidateGroupsWithKey$runtime_release(i10);
    }

    private static final <E> void removeValueIf(HashSet<E> hashSet, l<? super E, Boolean> lVar) {
        Iterator<E> it = hashSet.iterator();
        p.j(it, "iterator()");
        while (it.hasNext()) {
            if (lVar.invoke(it.next()).booleanValue()) {
                it.remove();
            }
        }
    }

    public static final void simulateHotReload(@NotNull Object obj) {
        p.k(obj, GAMConfig.KEY_CONTEXT);
        HotReloader.INSTANCE.simulateHotReload$runtime_release(obj);
    }
}
