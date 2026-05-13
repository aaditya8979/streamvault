package androidx.compose.runtime.saveable;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import com.ironsource.C3978d4;
import java.util.Arrays;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.a;
import sn.l;
import sn.p;

/* JADX INFO: compiled from: RememberSaveable.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001ac\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0016\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00000\u0002\"\u0004\u0018\u00010\u00002\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00020\u00000\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001ai\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u0010\u00012\u0016\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00000\u0002\"\u0004\u0018\u00010\u00002\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00020\u00000\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r0\bH\u0007¢\u0006\u0004\b\n\u0010\u000e\u001a>\u0010\u0010\u001a\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\r0\u0004\"\u0004\b\u0000\u0010\u00012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00020\u00000\u0004H\u0002\u001a\u0016\u0010\u0014\u001a\u00020\u0013*\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0000H\u0002\"\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"", "T", "", "inputs", "Landroidx/compose/runtime/saveable/Saver;", "saver", "", "key", "Lkotlin/Function0;", C3978d4.a.f31210f, "rememberSaveable", "([Ljava/lang/Object;Landroidx/compose/runtime/saveable/Saver;Ljava/lang/String;Lsn/a;Landroidx/compose/runtime/Composer;II)Ljava/lang/Object;", "stateSaver", "Landroidx/compose/runtime/MutableState;", "([Ljava/lang/Object;Landroidx/compose/runtime/saveable/Saver;Ljava/lang/String;Lsn/a;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/MutableState;", "inner", "mutableStateSaver", "Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "value", "Lbn/r;", "requireCanBeSaved", "", "MaxSupportedRadix", "I", "runtime-saveable_release"}, k = 2, mv = {1, 6, 0})
public final class RememberSaveableKt {
    private static final int MaxSupportedRadix = 36;

    private static final <T> Saver<MutableState<T>, MutableState<Object>> mutableStateSaver(final Saver<T, ? extends Object> saver) {
        return SaverKt.Saver(new p<SaverScope, MutableState<T>, MutableState<Object>>() { // from class: androidx.compose.runtime.saveable.RememberSaveableKt$mutableStateSaver$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // sn.p
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final MutableState<Object> mo2invoke(@NotNull SaverScope saverScope, @NotNull MutableState<T> mutableState) {
                tn.p.k(saverScope, "$this$Saver");
                tn.p.k(mutableState, "state");
                if (mutableState instanceof SnapshotMutableState) {
                    return SnapshotStateKt.mutableStateOf(saver.save(saverScope, mutableState.getValue()), ((SnapshotMutableState) mutableState).getPolicy());
                }
                throw new IllegalArgumentException("If you use a custom MutableState implementation you have to write a custom Saver and pass it as a saver param to rememberSaveable()".toString());
            }
        }, new l<MutableState<Object>, MutableState<T>>() { // from class: androidx.compose.runtime.saveable.RememberSaveableKt$mutableStateSaver$1$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // sn.l
            @Nullable
            public final MutableState<T> invoke(@NotNull MutableState<Object> mutableState) {
                T tRestore;
                tn.p.k(mutableState, "it");
                if (!(mutableState instanceof SnapshotMutableState)) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                if (mutableState.getValue() != null) {
                    Saver<T, Object> saver2 = saver;
                    Object value = mutableState.getValue();
                    tn.p.h(value);
                    tRestore = saver2.restore(value);
                } else {
                    tRestore = null;
                }
                return SnapshotStateKt.mutableStateOf(tRestore, ((SnapshotMutableState) mutableState).getPolicy());
            }
        });
    }

    @Composable
    @NotNull
    public static final <T> MutableState<T> rememberSaveable(@NotNull Object[] objArr, @NotNull Saver<T, ? extends Object> saver, @Nullable String str, @NotNull a<? extends MutableState<T>> aVar, @Nullable Composer composer, int i10, int i11) {
        tn.p.k(objArr, "inputs");
        tn.p.k(saver, "stateSaver");
        tn.p.k(aVar, C3978d4.a.f31210f);
        composer.startReplaceableGroup(-202053668);
        if ((i11 & 4) != 0) {
            str = null;
        }
        MutableState<T> mutableState = (MutableState) m1287rememberSaveable(Arrays.copyOf(objArr, objArr.length), mutableStateSaver(saver), str, (a) aVar, composer, (i10 & 896) | 8 | (i10 & 7168), 0);
        composer.endReplaceableGroup();
        return mutableState;
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: rememberSaveable, reason: collision with other method in class */
    public static final <T> T m1287rememberSaveable(@NotNull Object[] objArr, @Nullable Saver<T, ? extends Object> saver, @Nullable final String str, @NotNull a<? extends T> aVar, @Nullable Composer composer, int i10, int i11) {
        Object objConsumeRestored;
        tn.p.k(objArr, "inputs");
        tn.p.k(aVar, C3978d4.a.f31210f);
        composer.startReplaceableGroup(441892779);
        if ((i11 & 2) != 0) {
            saver = SaverKt.autoSaver();
        }
        int i12 = i11 & 4;
        T tRestore = null;
        if (i12 != 0) {
            str = null;
        }
        composer.startReplaceableGroup(1059366469);
        if (str == null || str.length() == 0) {
            str = Integer.toString(ComposablesKt.getCurrentCompositeKeyHash(composer, 0), bo.a.a(MaxSupportedRadix));
            tn.p.j(str, "toString(this, checkRadix(radix))");
        }
        composer.endReplaceableGroup();
        if (saver == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable, kotlin.Any>");
        }
        final SaveableStateRegistry saveableStateRegistry = (SaveableStateRegistry) composer.consume(SaveableStateRegistryKt.getLocalSaveableStateRegistry());
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        composer.startReplaceableGroup(-568225417);
        boolean zChanged = false;
        for (Object obj : objArrCopyOf) {
            zChanged |= composer.changed(obj);
        }
        T tInvoke = (T) composer.rememberedValue();
        if (zChanged || tInvoke == Composer.INSTANCE.getEmpty()) {
            if (saveableStateRegistry != null && (objConsumeRestored = saveableStateRegistry.consumeRestored(str)) != null) {
                tRestore = saver.restore(objConsumeRestored);
            }
            tInvoke = tRestore == null ? aVar.invoke() : tRestore;
            composer.updateRememberedValue(tInvoke);
        }
        composer.endReplaceableGroup();
        if (saveableStateRegistry != null) {
            final State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(saver, composer, 0);
            final State stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(tInvoke, composer, 0);
            EffectsKt.DisposableEffect(saveableStateRegistry, str, new l<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // sn.l
                @NotNull
                public final DisposableEffectResult invoke(@NotNull DisposableEffectScope disposableEffectScope) {
                    tn.p.k(disposableEffectScope, "$this$DisposableEffect");
                    final State<Saver<T, Object>> state = stateRememberUpdatedState;
                    final State<T> state2 = stateRememberUpdatedState2;
                    final SaveableStateRegistry saveableStateRegistry2 = saveableStateRegistry;
                    a<? extends Object> aVar2 = new a<Object>() { // from class: androidx.compose.runtime.saveable.RememberSaveableKt$rememberSaveable$1$valueProvider$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(0);
                        }

                        @Override // sn.a
                        @Nullable
                        public final Object invoke() {
                            Object value = state.getValue();
                            State<T> state3 = state2;
                            final SaveableStateRegistry saveableStateRegistry3 = saveableStateRegistry2;
                            return ((Saver) value).save(new SaverScope() { // from class: androidx.compose.runtime.saveable.RememberSaveableKt$rememberSaveable$1$valueProvider$1$1$1
                                @Override // androidx.compose.runtime.saveable.SaverScope
                                public final boolean canBeSaved(@NotNull Object obj2) {
                                    tn.p.k(obj2, "it");
                                    return saveableStateRegistry3.canBeSaved(obj2);
                                }
                            }, state3.getValue());
                        }
                    };
                    RememberSaveableKt.requireCanBeSaved(saveableStateRegistry, aVar2.invoke());
                    final SaveableStateRegistry.Entry entryRegisterProvider = saveableStateRegistry.registerProvider(str, aVar2);
                    return new DisposableEffectResult() { // from class: androidx.compose.runtime.saveable.RememberSaveableKt$rememberSaveable$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            entryRegisterProvider.unregister();
                        }
                    };
                }
            }, composer, 0);
        }
        composer.endReplaceableGroup();
        return tInvoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requireCanBeSaved(SaveableStateRegistry saveableStateRegistry, Object obj) {
        String str;
        if (obj == null || saveableStateRegistry.canBeSaved(obj)) {
            return;
        }
        if (obj instanceof SnapshotMutableState) {
            SnapshotMutableState snapshotMutableState = (SnapshotMutableState) obj;
            if (snapshotMutableState.getPolicy() == SnapshotStateKt.neverEqualPolicy() || snapshotMutableState.getPolicy() == SnapshotStateKt.structuralEqualityPolicy() || snapshotMutableState.getPolicy() == SnapshotStateKt.referentialEqualityPolicy()) {
                str = "MutableState containing " + snapshotMutableState.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
            } else {
                str = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
            }
        } else {
            str = obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
        }
        throw new IllegalArgumentException(str);
    }
}
