package androidx.compose.runtime;

import bn.r;
import hn.c;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.d;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;
import p000do.t1;
import p000do.w;
import sn.a;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: Effects.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u001d\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a#\u0010\b\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0007¢\u0006\u0004\b\b\u0010\t\u001a-\u0010\b\u001a\u00020\u00012\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0007¢\u0006\u0004\b\b\u0010\f\u001a7\u0010\b\u001a\u00020\u00012\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\n2\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0007¢\u0006\u0004\b\b\u0010\u000e\u001aA\u0010\b\u001a\u00020\u00012\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\n2\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0007¢\u0006\u0004\b\b\u0010\u0010\u001a;\u0010\b\u001a\u00020\u00012\u0016\u0010\u0012\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\n0\u0011\"\u0004\u0018\u00010\n2\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0007¢\u0006\u0004\b\b\u0010\u0013\u001a6\u0010\u0018\u001a\u00020\u00012\"\u0010\u0017\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0016\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0014H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a@\u0010\u0018\u001a\u00020\u00012\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\"\u0010\u0017\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0016\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0014H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u001a\u001aJ\u0010\u0018\u001a\u00020\u00012\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\n2\"\u0010\u0017\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0016\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0014H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u001b\u001aT\u0010\u0018\u001a\u00020\u00012\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\n2\"\u0010\u0017\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0016\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0014H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u001c\u001aN\u0010\u0018\u001a\u00020\u00012\u0016\u0010\u0012\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\n0\u0011\"\u0004\u0018\u00010\n2\"\u0010\u0017\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0016\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0014H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u001d\u001a\u0018\u0010\"\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0001\u001a(\u0010%\u001a\u00020\u00152\u0013\b\u0002\u0010$\u001a\r\u0012\u0004\u0012\u00020\u001e0\u0000¢\u0006\u0002\b#H\u0087\bø\u0001\u0001¢\u0006\u0004\b%\u0010&\"\u0014\u0010'\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(\"\u0014\u0010*\u001a\u00020)8\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010+\"\u0014\u0010,\u001a\u00020)8\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010+\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b\u009920\u0001¨\u0006-"}, d2 = {"Lkotlin/Function0;", "Lbn/r;", "effect", "SideEffect", "(Lsn/a;Landroidx/compose/runtime/Composer;I)V", "Lkotlin/Function1;", "Landroidx/compose/runtime/DisposableEffectScope;", "Landroidx/compose/runtime/DisposableEffectResult;", "DisposableEffect", "(Lsn/l;Landroidx/compose/runtime/Composer;I)V", "", "key1", "(Ljava/lang/Object;Lsn/l;Landroidx/compose/runtime/Composer;I)V", "key2", "(Ljava/lang/Object;Ljava/lang/Object;Lsn/l;Landroidx/compose/runtime/Composer;I)V", "key3", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lsn/l;Landroidx/compose/runtime/Composer;I)V", "", "keys", "([Ljava/lang/Object;Lsn/l;Landroidx/compose/runtime/Composer;I)V", "Lkotlin/Function2;", "Ldo/l0;", "Lhn/c;", "block", "LaunchedEffect", "(Lsn/p;Landroidx/compose/runtime/Composer;I)V", "(Ljava/lang/Object;Lsn/p;Landroidx/compose/runtime/Composer;I)V", "(Ljava/lang/Object;Ljava/lang/Object;Lsn/p;Landroidx/compose/runtime/Composer;I)V", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lsn/p;Landroidx/compose/runtime/Composer;I)V", "([Ljava/lang/Object;Lsn/p;Landroidx/compose/runtime/Composer;I)V", "Lkotlin/coroutines/d;", "coroutineContext", "Landroidx/compose/runtime/Composer;", "composer", "createCompositionCoroutineScope", "Landroidx/compose/runtime/DisallowComposableCalls;", "getContext", "rememberCoroutineScope", "(Lsn/a;Landroidx/compose/runtime/Composer;II)Ldo/l0;", "InternalDisposableEffectScope", "Landroidx/compose/runtime/DisposableEffectScope;", "", "DisposableEffectNoParamError", "Ljava/lang/String;", "LaunchedEffectNoParamError", "runtime_release"}, k = 2, mv = {1, 6, 0})
public final class EffectsKt {

    @NotNull
    private static final String DisposableEffectNoParamError = "DisposableEffect must provide one or more 'key' parameters that define the identity of the DisposableEffect and determine when its previous effect should be disposed and a new effect started for the new key.";

    @NotNull
    private static final DisposableEffectScope InternalDisposableEffectScope = new DisposableEffectScope();

    @NotNull
    private static final String LaunchedEffectNoParamError = "LaunchedEffect must provide one or more 'key' parameters that define the identity of the LaunchedEffect and determine when its previous effect coroutine should be cancelled and a new effect launched for the new key.";

    @Composable
    public static final void DisposableEffect(@Nullable Object obj, @Nullable Object obj2, @Nullable Object obj3, @NotNull l<? super DisposableEffectScope, ? extends DisposableEffectResult> lVar, @Nullable Composer composer, int i10) {
        p.k(lVar, "effect");
        composer.startReplaceableGroup(-1239538271);
        composer.startReplaceableGroup(1618982084);
        boolean zChanged = composer.changed(obj) | composer.changed(obj2) | composer.changed(obj3);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            composer.updateRememberedValue(new DisposableEffectImpl(lVar));
        }
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }

    @Composable
    public static final void DisposableEffect(@Nullable Object obj, @Nullable Object obj2, @NotNull l<? super DisposableEffectScope, ? extends DisposableEffectResult> lVar, @Nullable Composer composer, int i10) {
        p.k(lVar, "effect");
        composer.startReplaceableGroup(1429097729);
        composer.startReplaceableGroup(511388516);
        boolean zChanged = composer.changed(obj) | composer.changed(obj2);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            composer.updateRememberedValue(new DisposableEffectImpl(lVar));
        }
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }

    @Composable
    public static final void DisposableEffect(@Nullable Object obj, @NotNull l<? super DisposableEffectScope, ? extends DisposableEffectResult> lVar, @Nullable Composer composer, int i10) {
        p.k(lVar, "effect");
        composer.startReplaceableGroup(-1371986847);
        composer.startReplaceableGroup(1157296644);
        boolean zChanged = composer.changed(obj);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            composer.updateRememberedValue(new DisposableEffectImpl(lVar));
        }
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }

    @Composable
    public static final void DisposableEffect(@NotNull l<? super DisposableEffectScope, ? extends DisposableEffectResult> lVar, @Nullable Composer composer, int i10) {
        p.k(lVar, "effect");
        composer.startReplaceableGroup(-904483903);
        throw new IllegalStateException(DisposableEffectNoParamError.toString());
    }

    @Composable
    public static final void DisposableEffect(@NotNull Object[] objArr, @NotNull l<? super DisposableEffectScope, ? extends DisposableEffectResult> lVar, @Nullable Composer composer, int i10) {
        p.k(objArr, "keys");
        p.k(lVar, "effect");
        composer.startReplaceableGroup(-1307627122);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        composer.startReplaceableGroup(-568225417);
        boolean zChanged = false;
        for (Object obj : objArrCopyOf) {
            zChanged |= composer.changed(obj);
        }
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            composer.updateRememberedValue(new DisposableEffectImpl(lVar));
        }
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }

    @Composable
    public static final void LaunchedEffect(@Nullable Object obj, @Nullable Object obj2, @Nullable Object obj3, @NotNull sn.p<? super l0, ? super c<? super r>, ? extends Object> pVar, @Nullable Composer composer, int i10) {
        p.k(pVar, "block");
        composer.startReplaceableGroup(-54093371);
        d applyCoroutineContext = composer.getApplyCoroutineContext();
        composer.startReplaceableGroup(1618982084);
        boolean zChanged = composer.changed(obj) | composer.changed(obj2) | composer.changed(obj3);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            composer.updateRememberedValue(new LaunchedEffectImpl(applyCoroutineContext, pVar));
        }
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }

    @Composable
    public static final void LaunchedEffect(@Nullable Object obj, @Nullable Object obj2, @NotNull sn.p<? super l0, ? super c<? super r>, ? extends Object> pVar, @Nullable Composer composer, int i10) {
        p.k(pVar, "block");
        composer.startReplaceableGroup(590241125);
        d applyCoroutineContext = composer.getApplyCoroutineContext();
        composer.startReplaceableGroup(511388516);
        boolean zChanged = composer.changed(obj) | composer.changed(obj2);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            composer.updateRememberedValue(new LaunchedEffectImpl(applyCoroutineContext, pVar));
        }
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }

    @Composable
    public static final void LaunchedEffect(@Nullable Object obj, @NotNull sn.p<? super l0, ? super c<? super r>, ? extends Object> pVar, @Nullable Composer composer, int i10) {
        p.k(pVar, "block");
        composer.startReplaceableGroup(1179185413);
        d applyCoroutineContext = composer.getApplyCoroutineContext();
        composer.startReplaceableGroup(1157296644);
        boolean zChanged = composer.changed(obj);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            composer.updateRememberedValue(new LaunchedEffectImpl(applyCoroutineContext, pVar));
        }
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }

    @Composable
    public static final void LaunchedEffect(@NotNull final sn.p<? super l0, ? super c<? super r>, ? extends Object> pVar, @Nullable Composer composer, final int i10) {
        p.k(pVar, "block");
        Composer composerStartRestartGroup = composer.startRestartGroup(-805415771);
        if ((i10 & 1) != 0 || !composerStartRestartGroup.getSkipping()) {
            throw new IllegalStateException(LaunchedEffectNoParamError.toString());
        }
        composerStartRestartGroup.skipToGroupEnd();
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new sn.p<Composer, Integer, r>() { // from class: androidx.compose.runtime.EffectsKt.LaunchedEffect.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // sn.p
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ r mo2invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return r.f5635a;
            }

            public final void invoke(@Nullable Composer composer2, int i11) {
                EffectsKt.LaunchedEffect(pVar, composer2, i10 | 1);
            }
        });
    }

    @Composable
    public static final void LaunchedEffect(@NotNull Object[] objArr, @NotNull sn.p<? super l0, ? super c<? super r>, ? extends Object> pVar, @Nullable Composer composer, int i10) {
        p.k(objArr, "keys");
        p.k(pVar, "block");
        composer.startReplaceableGroup(-139560008);
        d applyCoroutineContext = composer.getApplyCoroutineContext();
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        composer.startReplaceableGroup(-568225417);
        boolean zChanged = false;
        for (Object obj : objArrCopyOf) {
            zChanged |= composer.changed(obj);
        }
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            composer.updateRememberedValue(new LaunchedEffectImpl(applyCoroutineContext, pVar));
        }
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }

    @Composable
    public static final void SideEffect(@NotNull a<r> aVar, @Nullable Composer composer, int i10) {
        p.k(aVar, "effect");
        composer.startReplaceableGroup(-1288466761);
        composer.recordSideEffect(aVar);
        composer.endReplaceableGroup();
    }

    @NotNull
    public static final l0 createCompositionCoroutineScope(@NotNull d dVar, @NotNull Composer composer) {
        p.k(dVar, "coroutineContext");
        p.k(composer, "composer");
        g.b bVar = g.H8;
        if (dVar.get(bVar) == null) {
            d applyCoroutineContext = composer.getApplyCoroutineContext();
            return kotlinx.coroutines.d.a(applyCoroutineContext.plus(t1.a((g) applyCoroutineContext.get(bVar))).plus(dVar));
        }
        w wVarB = JobKt__JobKt.b(null, 1, null);
        wVarB.b(new IllegalArgumentException("CoroutineContext supplied to rememberCoroutineScope may not include a parent job"));
        return kotlinx.coroutines.d.a(wVarB);
    }

    @Composable
    @NotNull
    public static final l0 rememberCoroutineScope(@Nullable a<? extends d> aVar, @Nullable Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(773894976);
        if ((i11 & 1) != 0) {
            aVar = new a<EmptyCoroutineContext>() { // from class: androidx.compose.runtime.EffectsKt.rememberCoroutineScope.1
                @Override // sn.a
                @NotNull
                public final EmptyCoroutineContext invoke() {
                    return EmptyCoroutineContext.INSTANCE;
                }
            };
        }
        composer.startReplaceableGroup(-492369756);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new CompositionScopedCoroutineScopeCanceller(createCompositionCoroutineScope(aVar.invoke(), composer));
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        l0 coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
        composer.endReplaceableGroup();
        return coroutineScope;
    }
}
