package androidx.compose.runtime;

import androidx.compose.runtime.collection.IdentityArrayIntMap;
import androidx.compose.runtime.collection.IdentityArrayMap;
import bn.r;
import com.ironsource.C4157n2;
import com.ironsource.mediationsdk.d;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import sn.p;

/* JADX INFO: compiled from: RecomposeScopeImpl.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\bP\u0010QJ\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\u0010\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007J\u0006\u0010\u000b\u001a\u00020\u0005J\u000e\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fJ\b\u0010\u000f\u001a\u00020\u0005H\u0016J\"\u0010\u0013\u001a\u00020\u00052\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00050\u0010H\u0016J\u000e\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0011J\u0006\u0010\u0016\u001a\u00020\u0005J\u000e\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0007J\u0016\u0010\u001c\u001a\u00020\u001b2\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0019J\u0006\u0010\u001d\u001a\u00020\u0005J\u001c\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001e2\u0006\u0010\u0014\u001a\u00020\u0011R\u0016\u0010!\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R(\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010#\u001a\u0004\u0018\u00010\f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\r\u0010$\u001a\u0004\b%\u0010&R$\u0010(\u001a\u0004\u0018\u00010'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R*\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010.R\u0016\u0010/\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010\"R\u0018\u00101\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R*\u00105\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u000304\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R$\u0010;\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u001b8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R$\u0010>\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u001b8@@BX\u0080\u000e¢\u0006\f\u001a\u0004\b<\u00108\"\u0004\b=\u0010:R\u0011\u0010@\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b?\u00108R\u0011\u0010B\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\bA\u00108R$\u0010E\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bC\u00108\"\u0004\bD\u0010:R$\u0010H\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bF\u00108\"\u0004\bG\u0010:R$\u0010K\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bI\u00108\"\u0004\bJ\u0010:R$\u0010N\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bL\u00108\"\u0004\bM\u0010:R\u0011\u0010O\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\bO\u00108¨\u0006R"}, d2 = {"Landroidx/compose/runtime/RecomposeScopeImpl;", "Landroidx/compose/runtime/ScopeUpdateScope;", "Landroidx/compose/runtime/RecomposeScope;", "Landroidx/compose/runtime/Composer;", "composer", "Lbn/r;", "compose", "", "value", "Landroidx/compose/runtime/InvalidationResult;", "invalidateForResult", "release", "Landroidx/compose/runtime/CompositionImpl;", "composition", "adoptedBy", "invalidate", "Lkotlin/Function2;", "", "block", "updateScope", "token", "start", "scopeSkipped", C4157n2.f33007p, "recordRead", "Landroidx/compose/runtime/collection/IdentityArraySet;", d.f32396k, "", "isInvalidFor", "rereadTrackedInstances", "Lkotlin/Function1;", "Landroidx/compose/runtime/Composition;", "end", "flags", "I", "<set-?>", "Landroidx/compose/runtime/CompositionImpl;", "getComposition", "()Landroidx/compose/runtime/CompositionImpl;", "Landroidx/compose/runtime/Anchor;", "anchor", "Landroidx/compose/runtime/Anchor;", "getAnchor", "()Landroidx/compose/runtime/Anchor;", "setAnchor", "(Landroidx/compose/runtime/Anchor;)V", "Lsn/p;", "currentToken", "Landroidx/compose/runtime/collection/IdentityArrayIntMap;", "trackedInstances", "Landroidx/compose/runtime/collection/IdentityArrayIntMap;", "Landroidx/compose/runtime/collection/IdentityArrayMap;", "Landroidx/compose/runtime/DerivedState;", "trackedDependencies", "Landroidx/compose/runtime/collection/IdentityArrayMap;", "getRereading", "()Z", "setRereading", "(Z)V", "rereading", "getSkipped$runtime_release", "setSkipped", "skipped", "getValid", "valid", "getCanRecompose", "canRecompose", "getUsed", "setUsed", "used", "getDefaultsInScope", "setDefaultsInScope", "defaultsInScope", "getDefaultsInvalid", "setDefaultsInvalid", "defaultsInvalid", "getRequiresRecompose", "setRequiresRecompose", "requiresRecompose", "isConditional", "<init>", "(Landroidx/compose/runtime/CompositionImpl;)V", "runtime_release"}, k = 1, mv = {1, 6, 0})
public final class RecomposeScopeImpl implements ScopeUpdateScope, RecomposeScope {

    @Nullable
    private Anchor anchor;

    @Nullable
    private p<? super Composer, ? super Integer, r> block;

    @Nullable
    private CompositionImpl composition;
    private int currentToken;
    private int flags;

    @Nullable
    private IdentityArrayMap<DerivedState<?>, Object> trackedDependencies;

    @Nullable
    private IdentityArrayIntMap trackedInstances;

    public RecomposeScopeImpl(@Nullable CompositionImpl compositionImpl) {
        this.composition = compositionImpl;
    }

    private final boolean getRereading() {
        return (this.flags & 32) != 0;
    }

    private final void setRereading(boolean z10) {
        if (z10) {
            this.flags |= 32;
        } else {
            this.flags &= -33;
        }
    }

    private final void setSkipped(boolean z10) {
        if (z10) {
            this.flags |= 16;
        } else {
            this.flags &= -17;
        }
    }

    public final void adoptedBy(@NotNull CompositionImpl compositionImpl) {
        tn.p.k(compositionImpl, "composition");
        this.composition = compositionImpl;
    }

    public final void compose(@NotNull Composer composer) {
        r rVar;
        tn.p.k(composer, "composer");
        p<? super Composer, ? super Integer, r> pVar = this.block;
        if (pVar != null) {
            pVar.mo2invoke(composer, 1);
            rVar = r.f5635a;
        } else {
            rVar = null;
        }
        if (rVar == null) {
            throw new IllegalStateException("Invalid restart scope".toString());
        }
    }

    @Nullable
    public final l<Composition, r> end(final int i10) {
        final IdentityArrayIntMap identityArrayIntMap = this.trackedInstances;
        if (identityArrayIntMap == null || getSkipped$runtime_release()) {
            return null;
        }
        int size = identityArrayIntMap.getSize();
        boolean z10 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                break;
            }
            if (identityArrayIntMap.getKeys()[i11] == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
            }
            if (identityArrayIntMap.getValues()[i11] != i10) {
                z10 = true;
                break;
            }
            i11++;
        }
        if (z10) {
            return new l<Composition, r>() { // from class: androidx.compose.runtime.RecomposeScopeImpl$end$1$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // sn.l
                public /* bridge */ /* synthetic */ r invoke(Composition composition) {
                    invoke2(composition);
                    return r.f5635a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Composition composition) {
                    tn.p.k(composition, "composition");
                    if (this.this$0.currentToken == i10 && tn.p.f(identityArrayIntMap, this.this$0.trackedInstances) && (composition instanceof CompositionImpl)) {
                        IdentityArrayIntMap identityArrayIntMap2 = identityArrayIntMap;
                        int i12 = i10;
                        RecomposeScopeImpl recomposeScopeImpl = this.this$0;
                        int size2 = identityArrayIntMap2.getSize();
                        int i13 = 0;
                        for (int i14 = 0; i14 < size2; i14++) {
                            Object obj = identityArrayIntMap2.getKeys()[i14];
                            if (obj == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                            }
                            int i15 = identityArrayIntMap2.getValues()[i14];
                            boolean z11 = i15 != i12;
                            if (z11) {
                                CompositionImpl compositionImpl = (CompositionImpl) composition;
                                compositionImpl.removeObservation$runtime_release(obj, recomposeScopeImpl);
                                DerivedState<?> derivedState = obj instanceof DerivedState ? (DerivedState) obj : null;
                                if (derivedState != null) {
                                    compositionImpl.removeDerivedStateObservation$runtime_release(derivedState);
                                    IdentityArrayMap identityArrayMap = recomposeScopeImpl.trackedDependencies;
                                    if (identityArrayMap != null) {
                                        identityArrayMap.remove(derivedState);
                                        if (identityArrayMap.getSize() == 0) {
                                            recomposeScopeImpl.trackedDependencies = null;
                                        }
                                    }
                                }
                            }
                            if (!z11) {
                                if (i13 != i14) {
                                    identityArrayIntMap2.getKeys()[i13] = obj;
                                    identityArrayIntMap2.getValues()[i13] = i15;
                                }
                                i13++;
                            }
                        }
                        int size3 = identityArrayIntMap2.getSize();
                        for (int i16 = i13; i16 < size3; i16++) {
                            identityArrayIntMap2.getKeys()[i16] = null;
                        }
                        identityArrayIntMap2.setSize(i13);
                        if (identityArrayIntMap.getSize() == 0) {
                            this.this$0.trackedInstances = null;
                        }
                    }
                }
            };
        }
        return null;
    }

    @Nullable
    public final Anchor getAnchor() {
        return this.anchor;
    }

    public final boolean getCanRecompose() {
        return this.block != null;
    }

    @Nullable
    public final CompositionImpl getComposition() {
        return this.composition;
    }

    public final boolean getDefaultsInScope() {
        return (this.flags & 2) != 0;
    }

    public final boolean getDefaultsInvalid() {
        return (this.flags & 4) != 0;
    }

    public final boolean getRequiresRecompose() {
        return (this.flags & 8) != 0;
    }

    public final boolean getSkipped$runtime_release() {
        return (this.flags & 16) != 0;
    }

    public final boolean getUsed() {
        return (this.flags & 1) != 0;
    }

    public final boolean getValid() {
        if (this.composition == null) {
            return false;
        }
        Anchor anchor = this.anchor;
        return anchor != null ? anchor.getValid() : false;
    }

    @Override // androidx.compose.runtime.RecomposeScope
    public void invalidate() {
        CompositionImpl compositionImpl = this.composition;
        if (compositionImpl != null) {
            compositionImpl.invalidate(this, null);
        }
    }

    @NotNull
    public final InvalidationResult invalidateForResult(@Nullable Object value) {
        InvalidationResult invalidationResultInvalidate;
        CompositionImpl compositionImpl = this.composition;
        return (compositionImpl == null || (invalidationResultInvalidate = compositionImpl.invalidate(this, value)) == null) ? InvalidationResult.IGNORED : invalidationResultInvalidate;
    }

    public final boolean isConditional() {
        return this.trackedDependencies != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0042 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean isInvalidFor(@org.jetbrains.annotations.Nullable androidx.compose.runtime.collection.IdentityArraySet<java.lang.Object> r6) {
        /*
            r5 = this;
            r0 = 1
            if (r6 != 0) goto L4
            return r0
        L4:
            androidx.compose.runtime.collection.IdentityArrayMap<androidx.compose.runtime.DerivedState<?>, java.lang.Object> r1 = r5.trackedDependencies
            if (r1 != 0) goto L9
            return r0
        L9:
            boolean r2 = r6.isNotEmpty()
            if (r2 == 0) goto L43
            boolean r2 = r6.isEmpty()
            r3 = 0
            if (r2 == 0) goto L18
        L16:
            r6 = r0
            goto L40
        L18:
            java.util.Iterator r6 = r6.iterator()
        L1c:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L16
            java.lang.Object r2 = r6.next()
            boolean r4 = r2 instanceof androidx.compose.runtime.DerivedState
            if (r4 == 0) goto L3c
            java.lang.Object r4 = r1.get(r2)
            androidx.compose.runtime.DerivedState r2 = (androidx.compose.runtime.DerivedState) r2
            java.lang.Object r2 = r2.getCurrentValue()
            boolean r2 = tn.p.f(r4, r2)
            if (r2 == 0) goto L3c
            r2 = r0
            goto L3d
        L3c:
            r2 = r3
        L3d:
            if (r2 != 0) goto L1c
            r6 = r3
        L40:
            if (r6 == 0) goto L43
            return r3
        L43:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.RecomposeScopeImpl.isInvalidFor(androidx.compose.runtime.collection.IdentityArraySet):boolean");
    }

    public final void recordRead(@NotNull Object obj) {
        tn.p.k(obj, C4157n2.f33007p);
        if (getRereading()) {
            return;
        }
        IdentityArrayIntMap identityArrayIntMap = this.trackedInstances;
        if (identityArrayIntMap == null) {
            identityArrayIntMap = new IdentityArrayIntMap();
            this.trackedInstances = identityArrayIntMap;
        }
        identityArrayIntMap.add(obj, this.currentToken);
        if (obj instanceof DerivedState) {
            IdentityArrayMap<DerivedState<?>, Object> identityArrayMap = this.trackedDependencies;
            if (identityArrayMap == null) {
                identityArrayMap = new IdentityArrayMap<>(0, 1, null);
                this.trackedDependencies = identityArrayMap;
            }
            identityArrayMap.set(obj, ((DerivedState) obj).getCurrentValue());
        }
    }

    public final void release() {
        this.composition = null;
        this.trackedInstances = null;
        this.trackedDependencies = null;
    }

    public final void rereadTrackedInstances() {
        IdentityArrayIntMap identityArrayIntMap;
        CompositionImpl compositionImpl = this.composition;
        if (compositionImpl == null || (identityArrayIntMap = this.trackedInstances) == null) {
            return;
        }
        setRereading(true);
        try {
            int size = identityArrayIntMap.getSize();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj = identityArrayIntMap.getKeys()[i10];
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                }
                int i11 = identityArrayIntMap.getValues()[i10];
                compositionImpl.recordReadOf(obj);
            }
        } finally {
            setRereading(false);
        }
    }

    public final void scopeSkipped() {
        setSkipped(true);
    }

    public final void setAnchor(@Nullable Anchor anchor) {
        this.anchor = anchor;
    }

    public final void setDefaultsInScope(boolean z10) {
        if (z10) {
            this.flags |= 2;
        } else {
            this.flags &= -3;
        }
    }

    public final void setDefaultsInvalid(boolean z10) {
        if (z10) {
            this.flags |= 4;
        } else {
            this.flags &= -5;
        }
    }

    public final void setRequiresRecompose(boolean z10) {
        if (z10) {
            this.flags |= 8;
        } else {
            this.flags &= -9;
        }
    }

    public final void setUsed(boolean z10) {
        if (z10) {
            this.flags |= 1;
        } else {
            this.flags &= -2;
        }
    }

    public final void start(int i10) {
        this.currentToken = i10;
        setSkipped(false);
    }

    @Override // androidx.compose.runtime.ScopeUpdateScope
    public void updateScope(@NotNull p<? super Composer, ? super Integer, r> pVar) {
        tn.p.k(pVar, "block");
        this.block = pVar;
    }
}
