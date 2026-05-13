package androidx.compose.foundation;

import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.lazy.layout.PinnableParent;
import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.foundation.relocation.BringIntoViewRequesterKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusModifierKt;
import androidx.compose.ui.focus.FocusProperties;
import androidx.compose.ui.focus.FocusPropertiesKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.input.InputMode;
import androidx.compose.ui.input.InputModeManager;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableModifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import bn.r;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.i;
import p000do.l0;
import sn.l;
import sn.q;
import tn.p;

/* JADX INFO: compiled from: Focusable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a \u0010\u0005\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u001a\f\u0010\u0006\u001a\u00020\u0000*\u00020\u0000H\u0007\u001a\u001e\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0000\u001a\"\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0014\u0010\u000b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\n0\bH\u0003\"\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/Modifier;", "", "enabled", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "focusable", "focusGroup", "focusableInNonTouchMode", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/layout/PinnableParent;", "Lbn/r;", "onPinnableParentAvailable", "Landroidx/compose/ui/platform/InspectableModifier;", "focusGroupInspectorInfo", "Landroidx/compose/ui/platform/InspectableModifier;", "foundation_release"}, k = 2, mv = {1, 6, 0})
public final class FocusableKt {

    @NotNull
    private static final InspectableModifier focusGroupInspectorInfo;

    /* JADX INFO: renamed from: androidx.compose.foundation.FocusableKt$focusable$2, reason: invalid class name */
    /* JADX INFO: compiled from: Focusable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class AnonymousClass2 extends Lambda implements q<Modifier, Composer, Integer, Modifier> {
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ MutableInteractionSource $interactionSource;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(MutableInteractionSource mutableInteractionSource, boolean z10) {
            super(3);
            this.$interactionSource = mutableInteractionSource;
            this.$enabled = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: invoke$lambda-2, reason: not valid java name */
        public static final PinnableParent m204invoke$lambda2(MutableState<PinnableParent> mutableState) {
            return mutableState.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: invoke$lambda-3, reason: not valid java name */
        public static final void m205invoke$lambda3(MutableState<PinnableParent> mutableState, PinnableParent pinnableParent) {
            mutableState.setValue(pinnableParent);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: invoke$lambda-5, reason: not valid java name */
        public static final boolean m206invoke$lambda5(MutableState<Boolean> mutableState) {
            return mutableState.getValue().booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: invoke$lambda-6, reason: not valid java name */
        public static final void m207invoke$lambda6(MutableState<Boolean> mutableState, boolean z10) {
            mutableState.setValue(Boolean.valueOf(z10));
        }

        @Composable
        @NotNull
        public final Modifier invoke(@NotNull Modifier modifier, @Nullable Composer composer, int i10) {
            Modifier modifierFocusTarget;
            Modifier modifier2;
            p.k(modifier, "$this$composed");
            composer.startReplaceableGroup(1871352361);
            composer.startReplaceableGroup(773894976);
            composer.startReplaceableGroup(-492369756);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer));
                composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                objRememberedValue = compositionScopedCoroutineScopeCanceller;
            }
            composer.endReplaceableGroup();
            final l0 coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
            composer.endReplaceableGroup();
            composer.startReplaceableGroup(-492369756);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceableGroup();
            final MutableState mutableState = (MutableState) objRememberedValue2;
            composer.startReplaceableGroup(-492369756);
            Object objRememberedValue3 = composer.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceableGroup();
            final MutableState mutableState2 = (MutableState) objRememberedValue3;
            composer.startReplaceableGroup(-492369756);
            Object objRememberedValue4 = composer.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composer.updateRememberedValue(objRememberedValue4);
            }
            composer.endReplaceableGroup();
            final MutableState mutableState3 = (MutableState) objRememberedValue4;
            composer.startReplaceableGroup(-492369756);
            Object objRememberedValue5 = composer.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new FocusRequester();
                composer.updateRememberedValue(objRememberedValue5);
            }
            composer.endReplaceableGroup();
            final FocusRequester focusRequester = (FocusRequester) objRememberedValue5;
            composer.startReplaceableGroup(-492369756);
            Object objRememberedValue6 = composer.rememberedValue();
            if (objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = BringIntoViewRequesterKt.BringIntoViewRequester();
                composer.updateRememberedValue(objRememberedValue6);
            }
            composer.endReplaceableGroup();
            final BringIntoViewRequester bringIntoViewRequester = (BringIntoViewRequester) objRememberedValue6;
            final MutableInteractionSource mutableInteractionSource = this.$interactionSource;
            EffectsKt.DisposableEffect(mutableInteractionSource, new l<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.FocusableKt.focusable.2.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // sn.l
                @NotNull
                public final DisposableEffectResult invoke(@NotNull DisposableEffectScope disposableEffectScope) {
                    p.k(disposableEffectScope, "$this$DisposableEffect");
                    final MutableState<FocusInteraction.Focus> mutableState4 = mutableState;
                    final MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
                    return new DisposableEffectResult() { // from class: androidx.compose.foundation.FocusableKt$focusable$2$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            FocusInteraction.Focus focus = (FocusInteraction.Focus) mutableState4.getValue();
                            if (focus != null) {
                                FocusInteraction.Unfocus unfocus = new FocusInteraction.Unfocus(focus);
                                MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource2;
                                if (mutableInteractionSource3 != null) {
                                    mutableInteractionSource3.tryEmit(unfocus);
                                }
                                mutableState4.setValue(null);
                            }
                        }
                    };
                }
            }, composer, 0);
            Boolean boolValueOf = Boolean.valueOf(this.$enabled);
            final boolean z10 = this.$enabled;
            final MutableInteractionSource mutableInteractionSource2 = this.$interactionSource;
            EffectsKt.DisposableEffect(boolValueOf, new l<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.FocusableKt.focusable.2.2

                /* JADX INFO: renamed from: androidx.compose.foundation.FocusableKt$focusable$2$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: Focusable.kt */
                @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                @jn.d(c = "androidx.compose.foundation.FocusableKt$focusable$2$2$1", f = "Focusable.kt", l = {105}, m = "invokeSuspend")
                public static final class AnonymousClass1 extends SuspendLambda implements sn.p<l0, hn.c<? super r>, Object> {
                    public final /* synthetic */ MutableState<FocusInteraction.Focus> $focusedInteraction;
                    public final /* synthetic */ MutableInteractionSource $interactionSource;
                    public Object L$0;
                    public int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(MutableState<FocusInteraction.Focus> mutableState, MutableInteractionSource mutableInteractionSource, hn.c<? super AnonymousClass1> cVar) {
                        super(2, cVar);
                        this.$focusedInteraction = mutableState;
                        this.$interactionSource = mutableInteractionSource;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final hn.c<r> create(@Nullable Object obj, @NotNull hn.c<?> cVar) {
                        return new AnonymousClass1(this.$focusedInteraction, this.$interactionSource, cVar);
                    }

                    @Override // sn.p
                    @Nullable
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                    public final Object mo2invoke(@NotNull l0 l0Var, @Nullable hn.c<? super r> cVar) {
                        return ((AnonymousClass1) create(l0Var, cVar)).invokeSuspend(r.f5635a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        MutableState<FocusInteraction.Focus> mutableState;
                        MutableState<FocusInteraction.Focus> mutableState2;
                        Object objG = in.a.g();
                        int i10 = this.label;
                        if (i10 == 0) {
                            kotlin.c.b(obj);
                            FocusInteraction.Focus value = this.$focusedInteraction.getValue();
                            if (value != null) {
                                MutableInteractionSource mutableInteractionSource = this.$interactionSource;
                                mutableState = this.$focusedInteraction;
                                FocusInteraction.Unfocus unfocus = new FocusInteraction.Unfocus(value);
                                if (mutableInteractionSource != null) {
                                    this.L$0 = mutableState;
                                    this.label = 1;
                                    if (mutableInteractionSource.emit(unfocus, this) == objG) {
                                        return objG;
                                    }
                                    mutableState2 = mutableState;
                                }
                                mutableState.setValue(null);
                            }
                            return r.f5635a;
                        }
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutableState2 = (MutableState) this.L$0;
                        kotlin.c.b(obj);
                        mutableState = mutableState2;
                        mutableState.setValue(null);
                        return r.f5635a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // sn.l
                @NotNull
                public final DisposableEffectResult invoke(@NotNull DisposableEffectScope disposableEffectScope) {
                    p.k(disposableEffectScope, "$this$DisposableEffect");
                    if (!z10) {
                        i.d(coroutineScope, null, null, new AnonymousClass1(mutableState, mutableInteractionSource2, null), 3, null);
                    }
                    return new DisposableEffectResult() { // from class: androidx.compose.foundation.FocusableKt$focusable$2$2$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                        }
                    };
                }
            }, composer, 0);
            if (this.$enabled) {
                if (m206invoke$lambda5(mutableState3)) {
                    composer.startReplaceableGroup(-492369756);
                    Object objRememberedValue7 = composer.rememberedValue();
                    if (objRememberedValue7 == companion.getEmpty()) {
                        objRememberedValue7 = new FocusedBoundsModifier();
                        composer.updateRememberedValue(objRememberedValue7);
                    }
                    composer.endReplaceableGroup();
                    modifier2 = (Modifier) objRememberedValue7;
                } else {
                    modifier2 = Modifier.INSTANCE;
                }
                Modifier modifierThen = FocusRequesterModifierKt.focusRequester(BringIntoViewRequesterKt.bringIntoViewRequester(FocusableKt.onPinnableParentAvailable(SemanticsModifierKt.semantics$default(Modifier.INSTANCE, false, new l<SemanticsPropertyReceiver, r>() { // from class: androidx.compose.foundation.FocusableKt.focusable.2.3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                        SemanticsPropertiesKt.setFocused(semanticsPropertyReceiver, AnonymousClass2.m206invoke$lambda5(mutableState3));
                        final FocusRequester focusRequester2 = focusRequester;
                        final MutableState<Boolean> mutableState4 = mutableState3;
                        SemanticsPropertiesKt.requestFocus$default(semanticsPropertyReceiver, null, new sn.a<Boolean>() { // from class: androidx.compose.foundation.FocusableKt.focusable.2.3.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // sn.a
                            @NotNull
                            public final Boolean invoke() {
                                focusRequester2.requestFocus();
                                return Boolean.valueOf(AnonymousClass2.m206invoke$lambda5(mutableState4));
                            }
                        }, 1, null);
                    }
                }, 1, null), new l<PinnableParent, r>() { // from class: androidx.compose.foundation.FocusableKt.focusable.2.4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // sn.l
                    public /* bridge */ /* synthetic */ r invoke(PinnableParent pinnableParent) {
                        invoke2(pinnableParent);
                        return r.f5635a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@Nullable PinnableParent pinnableParent) {
                        AnonymousClass2.m205invoke$lambda3(mutableState2, pinnableParent);
                    }
                }), bringIntoViewRequester), focusRequester).then(modifier2);
                final MutableInteractionSource mutableInteractionSource3 = this.$interactionSource;
                modifierFocusTarget = FocusModifierKt.focusTarget(FocusChangedModifierKt.onFocusChanged(modifierThen, new l<FocusState, r>() { // from class: androidx.compose.foundation.FocusableKt.focusable.2.5

                    /* JADX INFO: renamed from: androidx.compose.foundation.FocusableKt$focusable$2$5$1, reason: invalid class name */
                    /* JADX INFO: compiled from: Focusable.kt */
                    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                    @jn.d(c = "androidx.compose.foundation.FocusableKt$focusable$2$5$1", f = "Focusable.kt", l = {144}, m = "invokeSuspend")
                    public static final class AnonymousClass1 extends SuspendLambda implements sn.p<l0, hn.c<? super r>, Object> {
                        public final /* synthetic */ BringIntoViewRequester $bringIntoViewRequester;
                        public final /* synthetic */ MutableState<PinnableParent> $pinnableParent$delegate;
                        public Object L$0;
                        public int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(BringIntoViewRequester bringIntoViewRequester, MutableState<PinnableParent> mutableState, hn.c<? super AnonymousClass1> cVar) {
                            super(2, cVar);
                            this.$bringIntoViewRequester = bringIntoViewRequester;
                            this.$pinnableParent$delegate = mutableState;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @NotNull
                        public final hn.c<r> create(@Nullable Object obj, @NotNull hn.c<?> cVar) {
                            return new AnonymousClass1(this.$bringIntoViewRequester, this.$pinnableParent$delegate, cVar);
                        }

                        @Override // sn.p
                        @Nullable
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                        public final Object mo2invoke(@NotNull l0 l0Var, @Nullable hn.c<? super r> cVar) {
                            return ((AnonymousClass1) create(l0Var, cVar)).invokeSuspend(r.f5635a);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @Nullable
                        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                            PinnableParent.PinnedItemsHandle pinnedItemsHandle;
                            Object objG = in.a.g();
                            int i10 = this.label;
                            PinnableParent.PinnedItemsHandle pinnedItemsHandle2 = null;
                            try {
                                if (i10 == 0) {
                                    kotlin.c.b(obj);
                                    PinnableParent pinnableParentM204invoke$lambda2 = AnonymousClass2.m204invoke$lambda2(this.$pinnableParent$delegate);
                                    PinnableParent.PinnedItemsHandle pinnedItemsHandlePinItems = pinnableParentM204invoke$lambda2 != null ? pinnableParentM204invoke$lambda2.pinItems() : null;
                                    try {
                                        BringIntoViewRequester bringIntoViewRequester = this.$bringIntoViewRequester;
                                        this.L$0 = pinnedItemsHandlePinItems;
                                        this.label = 1;
                                        if (BringIntoViewRequester.bringIntoView$default(bringIntoViewRequester, null, this, 1, null) == objG) {
                                            return objG;
                                        }
                                        pinnedItemsHandle = pinnedItemsHandlePinItems;
                                    } catch (Throwable th2) {
                                        pinnedItemsHandle2 = pinnedItemsHandlePinItems;
                                        th = th2;
                                        if (pinnedItemsHandle2 != null) {
                                            pinnedItemsHandle2.unpin();
                                        }
                                        throw th;
                                    }
                                } else {
                                    if (i10 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    pinnedItemsHandle = (PinnableParent.PinnedItemsHandle) this.L$0;
                                    kotlin.c.b(obj);
                                }
                                if (pinnedItemsHandle != null) {
                                    pinnedItemsHandle.unpin();
                                }
                                return r.f5635a;
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        }
                    }

                    /* JADX INFO: renamed from: androidx.compose.foundation.FocusableKt$focusable$2$5$2, reason: invalid class name and collision with other inner class name */
                    /* JADX INFO: compiled from: Focusable.kt */
                    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                    @jn.d(c = "androidx.compose.foundation.FocusableKt$focusable$2$5$2", f = "Focusable.kt", l = {152, 156}, m = "invokeSuspend")
                    public static final class C00092 extends SuspendLambda implements sn.p<l0, hn.c<? super r>, Object> {
                        public final /* synthetic */ MutableState<FocusInteraction.Focus> $focusedInteraction;
                        public final /* synthetic */ MutableInteractionSource $interactionSource;
                        public Object L$0;
                        public int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C00092(MutableState<FocusInteraction.Focus> mutableState, MutableInteractionSource mutableInteractionSource, hn.c<? super C00092> cVar) {
                            super(2, cVar);
                            this.$focusedInteraction = mutableState;
                            this.$interactionSource = mutableInteractionSource;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @NotNull
                        public final hn.c<r> create(@Nullable Object obj, @NotNull hn.c<?> cVar) {
                            return new C00092(this.$focusedInteraction, this.$interactionSource, cVar);
                        }

                        @Override // sn.p
                        @Nullable
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                        public final Object mo2invoke(@NotNull l0 l0Var, @Nullable hn.c<? super r> cVar) {
                            return ((C00092) create(l0Var, cVar)).invokeSuspend(r.f5635a);
                        }

                        /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @org.jetbrains.annotations.Nullable
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r7) {
                            /*
                                r6 = this;
                                java.lang.Object r0 = in.a.g()
                                int r1 = r6.label
                                r2 = 2
                                r3 = 1
                                if (r1 == 0) goto L26
                                if (r1 == r3) goto L1e
                                if (r1 != r2) goto L16
                                java.lang.Object r0 = r6.L$0
                                androidx.compose.foundation.interaction.FocusInteraction$Focus r0 = (androidx.compose.foundation.interaction.FocusInteraction.Focus) r0
                                kotlin.c.b(r7)
                                goto L64
                            L16:
                                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                                r7.<init>(r0)
                                throw r7
                            L1e:
                                java.lang.Object r1 = r6.L$0
                                androidx.compose.runtime.MutableState r1 = (androidx.compose.runtime.MutableState) r1
                                kotlin.c.b(r7)
                                goto L4a
                            L26:
                                kotlin.c.b(r7)
                                androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.FocusInteraction$Focus> r7 = r6.$focusedInteraction
                                java.lang.Object r7 = r7.getValue()
                                androidx.compose.foundation.interaction.FocusInteraction$Focus r7 = (androidx.compose.foundation.interaction.FocusInteraction.Focus) r7
                                if (r7 == 0) goto L4f
                                androidx.compose.foundation.interaction.MutableInteractionSource r1 = r6.$interactionSource
                                androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.FocusInteraction$Focus> r4 = r6.$focusedInteraction
                                androidx.compose.foundation.interaction.FocusInteraction$Unfocus r5 = new androidx.compose.foundation.interaction.FocusInteraction$Unfocus
                                r5.<init>(r7)
                                if (r1 == 0) goto L4b
                                r6.L$0 = r4
                                r6.label = r3
                                java.lang.Object r7 = r1.emit(r5, r6)
                                if (r7 != r0) goto L49
                                return r0
                            L49:
                                r1 = r4
                            L4a:
                                r4 = r1
                            L4b:
                                r7 = 0
                                r4.setValue(r7)
                            L4f:
                                androidx.compose.foundation.interaction.FocusInteraction$Focus r7 = new androidx.compose.foundation.interaction.FocusInteraction$Focus
                                r7.<init>()
                                androidx.compose.foundation.interaction.MutableInteractionSource r1 = r6.$interactionSource
                                if (r1 == 0) goto L65
                                r6.L$0 = r7
                                r6.label = r2
                                java.lang.Object r1 = r1.emit(r7, r6)
                                if (r1 != r0) goto L63
                                return r0
                            L63:
                                r0 = r7
                            L64:
                                r7 = r0
                            L65:
                                androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.FocusInteraction$Focus> r0 = r6.$focusedInteraction
                                r0.setValue(r7)
                                bn.r r7 = bn.r.f5635a
                                return r7
                            */
                            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.FocusableKt.AnonymousClass2.AnonymousClass5.C00092.invokeSuspend(java.lang.Object):java.lang.Object");
                        }
                    }

                    /* JADX INFO: renamed from: androidx.compose.foundation.FocusableKt$focusable$2$5$3, reason: invalid class name */
                    /* JADX INFO: compiled from: Focusable.kt */
                    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                    @jn.d(c = "androidx.compose.foundation.FocusableKt$focusable$2$5$3", f = "Focusable.kt", l = {163}, m = "invokeSuspend")
                    public static final class AnonymousClass3 extends SuspendLambda implements sn.p<l0, hn.c<? super r>, Object> {
                        public final /* synthetic */ MutableState<FocusInteraction.Focus> $focusedInteraction;
                        public final /* synthetic */ MutableInteractionSource $interactionSource;
                        public Object L$0;
                        public int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass3(MutableState<FocusInteraction.Focus> mutableState, MutableInteractionSource mutableInteractionSource, hn.c<? super AnonymousClass3> cVar) {
                            super(2, cVar);
                            this.$focusedInteraction = mutableState;
                            this.$interactionSource = mutableInteractionSource;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @NotNull
                        public final hn.c<r> create(@Nullable Object obj, @NotNull hn.c<?> cVar) {
                            return new AnonymousClass3(this.$focusedInteraction, this.$interactionSource, cVar);
                        }

                        @Override // sn.p
                        @Nullable
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                        public final Object mo2invoke(@NotNull l0 l0Var, @Nullable hn.c<? super r> cVar) {
                            return ((AnonymousClass3) create(l0Var, cVar)).invokeSuspend(r.f5635a);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @Nullable
                        public final Object invokeSuspend(@NotNull Object obj) {
                            MutableState<FocusInteraction.Focus> mutableState;
                            MutableState<FocusInteraction.Focus> mutableState2;
                            Object objG = in.a.g();
                            int i10 = this.label;
                            if (i10 == 0) {
                                kotlin.c.b(obj);
                                FocusInteraction.Focus value = this.$focusedInteraction.getValue();
                                if (value != null) {
                                    MutableInteractionSource mutableInteractionSource = this.$interactionSource;
                                    mutableState = this.$focusedInteraction;
                                    FocusInteraction.Unfocus unfocus = new FocusInteraction.Unfocus(value);
                                    if (mutableInteractionSource != null) {
                                        this.L$0 = mutableState;
                                        this.label = 1;
                                        if (mutableInteractionSource.emit(unfocus, this) == objG) {
                                            return objG;
                                        }
                                        mutableState2 = mutableState;
                                    }
                                    mutableState.setValue(null);
                                }
                                return r.f5635a;
                            }
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            mutableState2 = (MutableState) this.L$0;
                            kotlin.c.b(obj);
                            mutableState = mutableState2;
                            mutableState.setValue(null);
                            return r.f5635a;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // sn.l
                    public /* bridge */ /* synthetic */ r invoke(FocusState focusState) {
                        invoke2(focusState);
                        return r.f5635a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull FocusState focusState) {
                        p.k(focusState, "it");
                        AnonymousClass2.m207invoke$lambda6(mutableState3, focusState.isFocused());
                        if (!AnonymousClass2.m206invoke$lambda5(mutableState3)) {
                            i.d(coroutineScope, null, null, new AnonymousClass3(mutableState, mutableInteractionSource3, null), 3, null);
                        } else {
                            i.d(coroutineScope, null, CoroutineStart.UNDISPATCHED, new AnonymousClass1(bringIntoViewRequester, mutableState2, null), 1, null);
                            i.d(coroutineScope, null, null, new C00092(mutableState, mutableInteractionSource3, null), 3, null);
                        }
                    }
                }));
            } else {
                modifierFocusTarget = Modifier.INSTANCE;
            }
            composer.endReplaceableGroup();
            return modifierFocusTarget;
        }

        @Override // sn.q
        public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            return invoke(modifier, composer, num.intValue());
        }
    }

    static {
        focusGroupInspectorInfo = new InspectableModifier(InspectableValueKt.isDebugInspectorInfoEnabled() ? new l<InspectorInfo, r>() { // from class: androidx.compose.foundation.FocusableKt$special$$inlined$debugInspectorInfo$1
            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                p.k(inspectorInfo, "$this$null");
                inspectorInfo.setName("focusGroup");
            }
        } : InspectableValueKt.getNoInspectorInfo());
    }

    @ExperimentalFoundationApi
    @NotNull
    public static final Modifier focusGroup(@NotNull Modifier modifier) {
        p.k(modifier, "<this>");
        return FocusModifierKt.focusTarget(FocusPropertiesKt.focusProperties(modifier.then(focusGroupInspectorInfo), new l<FocusProperties, r>() { // from class: androidx.compose.foundation.FocusableKt.focusGroup.1
            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(FocusProperties focusProperties) {
                invoke2(focusProperties);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull FocusProperties focusProperties) {
                p.k(focusProperties, "$this$focusProperties");
                focusProperties.setCanFocus(false);
            }
        }));
    }

    @NotNull
    public static final Modifier focusable(@NotNull Modifier modifier, final boolean z10, @Nullable final MutableInteractionSource mutableInteractionSource) {
        p.k(modifier, "<this>");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new l<InspectorInfo, r>() { // from class: androidx.compose.foundation.FocusableKt$focusable$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                p.k(inspectorInfo, "$this$null");
                inspectorInfo.setName("focusable");
                inspectorInfo.getProperties().set("enabled", Boolean.valueOf(z10));
                inspectorInfo.getProperties().set("interactionSource", mutableInteractionSource);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new AnonymousClass2(mutableInteractionSource, z10));
    }

    public static /* synthetic */ Modifier focusable$default(Modifier modifier, boolean z10, MutableInteractionSource mutableInteractionSource, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            mutableInteractionSource = null;
        }
        return focusable(modifier, z10, mutableInteractionSource);
    }

    @NotNull
    public static final Modifier focusableInNonTouchMode(@NotNull Modifier modifier, final boolean z10, @Nullable final MutableInteractionSource mutableInteractionSource) {
        p.k(modifier, "<this>");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new l<InspectorInfo, r>() { // from class: androidx.compose.foundation.FocusableKt$focusableInNonTouchMode$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                p.k(inspectorInfo, "$this$null");
                inspectorInfo.setName("focusableInNonTouchMode");
                inspectorInfo.getProperties().set("enabled", Boolean.valueOf(z10));
                inspectorInfo.getProperties().set("interactionSource", mutableInteractionSource);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new q<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.FocusableKt.focusableInNonTouchMode.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier modifier2, @Nullable Composer composer, int i10) {
                p.k(modifier2, "$this$composed");
                composer.startReplaceableGroup(-618949501);
                final InputModeManager inputModeManager = (InputModeManager) composer.consume(CompositionLocalsKt.getLocalInputModeManager());
                Modifier modifierFocusable = FocusableKt.focusable(FocusPropertiesKt.focusProperties(Modifier.INSTANCE, new l<FocusProperties, r>() { // from class: androidx.compose.foundation.FocusableKt.focusableInNonTouchMode.2.1
                    {
                        super(1);
                    }

                    @Override // sn.l
                    public /* bridge */ /* synthetic */ r invoke(FocusProperties focusProperties) {
                        invoke2(focusProperties);
                        return r.f5635a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull FocusProperties focusProperties) {
                        p.k(focusProperties, "$this$focusProperties");
                        focusProperties.setCanFocus(!InputMode.m2246equalsimpl0(inputModeManager.mo2252getInputModeaOaMEAU(), InputMode.INSTANCE.m2251getTouchaOaMEAU()));
                    }
                }), z10, mutableInteractionSource);
                composer.endReplaceableGroup();
                return modifierFocusable;
            }

            @Override // sn.q
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Stable
    @ExperimentalFoundationApi
    public static final Modifier onPinnableParentAvailable(Modifier modifier, final l<? super PinnableParent, r> lVar) {
        return InspectableValueKt.inspectableWrapper(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new l<InspectorInfo, r>() { // from class: androidx.compose.foundation.FocusableKt$onPinnableParentAvailable$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                p.k(inspectorInfo, "$this$null");
                inspectorInfo.setName("onPinnableParentAvailable");
                inspectorInfo.getProperties().set("onPinnableParentAvailable", lVar);
            }
        } : InspectableValueKt.getNoInspectorInfo(), Modifier.INSTANCE.then(new PinnableParentConsumer(lVar)));
    }
}
