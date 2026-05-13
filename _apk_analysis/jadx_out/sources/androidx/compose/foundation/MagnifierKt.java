package androidx.compose.foundation;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.RequiresApi;
import androidx.compose.foundation.MagnifierKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import bn.r;
import go.k;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$LongRef;
import kotlinx.coroutines.channels.BufferOverflow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;
import sn.l;
import sn.p;
import sn.q;

/* JADX INFO: compiled from: Magnifier.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001ae\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0001H\u0007ø\u0001\u0000\u001ae\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00012\u0006\u0010\u000f\u001a\u00020\u000eH\u0001ø\u0001\u0000\u001a\u0012\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0001\")\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00150\u00148\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/geometry/Offset;", "sourceCenter", "magnifierCenter", "", "zoom", "Landroidx/compose/foundation/MagnifierStyle;", "style", "Landroidx/compose/ui/unit/DpSize;", "Lbn/r;", "onSizeChanged", "magnifier", "Landroidx/compose/foundation/PlatformMagnifierFactory;", "platformMagnifierFactory", "", "sdkVersion", "", "isPlatformMagnifierSupported", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "Lkotlin/Function0;", "MagnifierPositionInRoot", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "getMagnifierPositionInRoot", "()Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "foundation_release"}, k = 2, mv = {1, 6, 0})
public final class MagnifierKt {

    @NotNull
    private static final SemanticsPropertyKey<sn.a<Offset>> MagnifierPositionInRoot = new SemanticsPropertyKey<>("MagnifierPositionInRoot", null, 2, null);

    /* JADX INFO: renamed from: androidx.compose.foundation.MagnifierKt$magnifier$4, reason: invalid class name */
    /* JADX INFO: compiled from: Magnifier.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class AnonymousClass4 extends Lambda implements q<Modifier, Composer, Integer, Modifier> {
        public final /* synthetic */ l<Density, Offset> $magnifierCenter;
        public final /* synthetic */ l<DpSize, r> $onSizeChanged;
        public final /* synthetic */ PlatformMagnifierFactory $platformMagnifierFactory;
        public final /* synthetic */ l<Density, Offset> $sourceCenter;
        public final /* synthetic */ MagnifierStyle $style;
        public final /* synthetic */ float $zoom;

        /* JADX INFO: renamed from: androidx.compose.foundation.MagnifierKt$magnifier$4$1, reason: invalid class name */
        /* JADX INFO: compiled from: Magnifier.kt */
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        @jn.d(c = "androidx.compose.foundation.MagnifierKt$magnifier$4$1", f = "Magnifier.kt", l = {365}, m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements p<l0, hn.c<? super r>, Object> {
            public final /* synthetic */ MutableState<Offset> $anchorPositionInRoot$delegate;
            public final /* synthetic */ Density $density;
            public final /* synthetic */ State<Boolean> $isMagnifierShown$delegate;
            public final /* synthetic */ k<r> $onNeedsUpdate;
            public final /* synthetic */ PlatformMagnifierFactory $platformMagnifierFactory;
            public final /* synthetic */ State<Offset> $sourceCenterInRoot$delegate;
            public final /* synthetic */ MagnifierStyle $style;
            public final /* synthetic */ State<l<Density, Offset>> $updatedMagnifierCenter$delegate;
            public final /* synthetic */ State<l<DpSize, r>> $updatedOnSizeChanged$delegate;
            public final /* synthetic */ State<Float> $updatedZoom$delegate;
            public final /* synthetic */ View $view;
            public final /* synthetic */ float $zoom;
            private /* synthetic */ Object L$0;
            public int label;

            /* JADX INFO: renamed from: androidx.compose.foundation.MagnifierKt$magnifier$4$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: Magnifier.kt */
            @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
            @jn.d(c = "androidx.compose.foundation.MagnifierKt$magnifier$4$1$1", f = "Magnifier.kt", l = {}, m = "invokeSuspend")
            public static final class C00131 extends SuspendLambda implements p<r, hn.c<? super r>, Object> {
                public final /* synthetic */ PlatformMagnifier $magnifier;
                public int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C00131(PlatformMagnifier platformMagnifier, hn.c<? super C00131> cVar) {
                    super(2, cVar);
                    this.$magnifier = platformMagnifier;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final hn.c<r> create(@Nullable Object obj, @NotNull hn.c<?> cVar) {
                    return new C00131(this.$magnifier, cVar);
                }

                @Override // sn.p
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                public final Object mo2invoke(@NotNull r rVar, @Nullable hn.c<? super r> cVar) {
                    return ((C00131) create(rVar, cVar)).invokeSuspend(r.f5635a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    in.a.g();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.c.b(obj);
                    this.$magnifier.updateContent();
                    return r.f5635a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(PlatformMagnifierFactory platformMagnifierFactory, MagnifierStyle magnifierStyle, View view, Density density, float f10, k<r> kVar, State<? extends l<? super DpSize, r>> state, State<Boolean> state2, State<Offset> state3, State<? extends l<? super Density, Offset>> state4, MutableState<Offset> mutableState, State<Float> state5, hn.c<? super AnonymousClass1> cVar) {
                super(2, cVar);
                this.$platformMagnifierFactory = platformMagnifierFactory;
                this.$style = magnifierStyle;
                this.$view = view;
                this.$density = density;
                this.$zoom = f10;
                this.$onNeedsUpdate = kVar;
                this.$updatedOnSizeChanged$delegate = state;
                this.$isMagnifierShown$delegate = state2;
                this.$sourceCenterInRoot$delegate = state3;
                this.$updatedMagnifierCenter$delegate = state4;
                this.$anchorPositionInRoot$delegate = mutableState;
                this.$updatedZoom$delegate = state5;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final hn.c<r> create(@Nullable Object obj, @NotNull hn.c<?> cVar) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$platformMagnifierFactory, this.$style, this.$view, this.$density, this.$zoom, this.$onNeedsUpdate, this.$updatedOnSizeChanged$delegate, this.$isMagnifierShown$delegate, this.$sourceCenterInRoot$delegate, this.$updatedMagnifierCenter$delegate, this.$anchorPositionInRoot$delegate, this.$updatedZoom$delegate, cVar);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
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
                PlatformMagnifier platformMagnifier;
                Object objG = in.a.g();
                int i10 = this.label;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    platformMagnifier = (PlatformMagnifier) this.L$0;
                    try {
                        kotlin.c.b(obj);
                        platformMagnifier.dismiss();
                        return r.f5635a;
                    } catch (Throwable th2) {
                        th = th2;
                        platformMagnifier.dismiss();
                        throw th;
                    }
                }
                kotlin.c.b(obj);
                l0 l0Var = (l0) this.L$0;
                final PlatformMagnifier platformMagnifierCreate = this.$platformMagnifierFactory.create(this.$style, this.$view, this.$density, this.$zoom);
                final Ref$LongRef ref$LongRef = new Ref$LongRef();
                long jMo234getSizeYbymL2g = platformMagnifierCreate.mo234getSizeYbymL2g();
                Density density = this.$density;
                l lVarM226invoke$lambda6 = AnonymousClass4.m226invoke$lambda6(this.$updatedOnSizeChanged$delegate);
                if (lVarM226invoke$lambda6 != null) {
                    lVarM226invoke$lambda6.invoke(DpSize.m3912boximpl(density.mo304toDpSizekrfVVM(IntSizeKt.m3996toSizeozmzZPI(jMo234getSizeYbymL2g))));
                }
                ref$LongRef.element = jMo234getSizeYbymL2g;
                go.f.D(go.f.G(this.$onNeedsUpdate, new C00131(platformMagnifierCreate, null)), l0Var);
                try {
                    final Density density2 = this.$density;
                    final State<Boolean> state = this.$isMagnifierShown$delegate;
                    final State<Offset> state2 = this.$sourceCenterInRoot$delegate;
                    final State<l<Density, Offset>> state3 = this.$updatedMagnifierCenter$delegate;
                    final MutableState<Offset> mutableState = this.$anchorPositionInRoot$delegate;
                    final State<Float> state4 = this.$updatedZoom$delegate;
                    final State<l<DpSize, r>> state5 = this.$updatedOnSizeChanged$delegate;
                    go.d dVarSnapshotFlow = SnapshotStateKt.snapshotFlow(new sn.a<r>() { // from class: androidx.compose.foundation.MagnifierKt.magnifier.4.1.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(0);
                        }

                        @Override // sn.a
                        public /* bridge */ /* synthetic */ r invoke() {
                            invoke2();
                            return r.f5635a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            if (!AnonymousClass4.m221invoke$lambda10(state)) {
                                platformMagnifierCreate.dismiss();
                                return;
                            }
                            PlatformMagnifier platformMagnifier2 = platformMagnifierCreate;
                            long jM227invoke$lambda8 = AnonymousClass4.m227invoke$lambda8(state2);
                            Object objInvoke = AnonymousClass4.m224invoke$lambda4(state3).invoke(density2);
                            MutableState<Offset> mutableState2 = mutableState;
                            long packedValue = ((Offset) objInvoke).getPackedValue();
                            platformMagnifier2.mo235updateWko1d7g(jM227invoke$lambda8, OffsetKt.m1402isSpecifiedk4lQ0M(packedValue) ? Offset.m1388plusMKHz9U(AnonymousClass4.m220invoke$lambda1(mutableState2), packedValue) : Offset.INSTANCE.m1398getUnspecifiedF1C5BW0(), AnonymousClass4.m225invoke$lambda5(state4));
                            long jMo234getSizeYbymL2g2 = platformMagnifierCreate.mo234getSizeYbymL2g();
                            Ref$LongRef ref$LongRef2 = ref$LongRef;
                            Density density3 = density2;
                            State<l<DpSize, r>> state6 = state5;
                            if (IntSize.m3984equalsimpl0(jMo234getSizeYbymL2g2, ref$LongRef2.element)) {
                                return;
                            }
                            ref$LongRef2.element = jMo234getSizeYbymL2g2;
                            l lVarM226invoke$lambda62 = AnonymousClass4.m226invoke$lambda6(state6);
                            if (lVarM226invoke$lambda62 != null) {
                                lVarM226invoke$lambda62.invoke(DpSize.m3912boximpl(density3.mo304toDpSizekrfVVM(IntSizeKt.m3996toSizeozmzZPI(jMo234getSizeYbymL2g2))));
                            }
                        }
                    });
                    this.L$0 = platformMagnifierCreate;
                    this.label = 1;
                    if (go.f.k(dVarSnapshotFlow, this) == objG) {
                        return objG;
                    }
                    platformMagnifier = platformMagnifierCreate;
                    platformMagnifier.dismiss();
                    return r.f5635a;
                } catch (Throwable th3) {
                    th = th3;
                    platformMagnifier = platformMagnifierCreate;
                    platformMagnifier.dismiss();
                    throw th;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(l<? super Density, Offset> lVar, l<? super Density, Offset> lVar2, float f10, l<? super DpSize, r> lVar3, PlatformMagnifierFactory platformMagnifierFactory, MagnifierStyle magnifierStyle) {
            super(3);
            this.$sourceCenter = lVar;
            this.$magnifierCenter = lVar2;
            this.$zoom = f10;
            this.$onSizeChanged = lVar3;
            this.$platformMagnifierFactory = platformMagnifierFactory;
            this.$style = magnifierStyle;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: invoke$lambda-1, reason: not valid java name */
        public static final long m220invoke$lambda1(MutableState<Offset> mutableState) {
            return mutableState.getValue().getPackedValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: invoke$lambda-10, reason: not valid java name */
        public static final boolean m221invoke$lambda10(State<Boolean> state) {
            return state.getValue().booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: invoke$lambda-2, reason: not valid java name */
        public static final void m222invoke$lambda2(MutableState<Offset> mutableState, long j10) {
            mutableState.setValue(Offset.m1372boximpl(j10));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: invoke$lambda-3, reason: not valid java name */
        public static final l<Density, Offset> m223invoke$lambda3(State<? extends l<? super Density, Offset>> state) {
            return (l) state.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: invoke$lambda-4, reason: not valid java name */
        public static final l<Density, Offset> m224invoke$lambda4(State<? extends l<? super Density, Offset>> state) {
            return (l) state.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: invoke$lambda-5, reason: not valid java name */
        public static final float m225invoke$lambda5(State<Float> state) {
            return state.getValue().floatValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: invoke$lambda-6, reason: not valid java name */
        public static final l<DpSize, r> m226invoke$lambda6(State<? extends l<? super DpSize, r>> state) {
            return (l) state.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: invoke$lambda-8, reason: not valid java name */
        public static final long m227invoke$lambda8(State<Offset> state) {
            return state.getValue().getPackedValue();
        }

        @Composable
        @NotNull
        public final Modifier invoke(@NotNull Modifier modifier, @Nullable Composer composer, int i10) {
            tn.p.k(modifier, "$this$composed");
            composer.startReplaceableGroup(-454877003);
            View view = (View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView());
            final Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
            composer.startReplaceableGroup(-492369756);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m1372boximpl(Offset.INSTANCE.m1398getUnspecifiedF1C5BW0()), null, 2, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceableGroup();
            final MutableState mutableState = (MutableState) objRememberedValue;
            final State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(this.$sourceCenter, composer, 0);
            State stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(this.$magnifierCenter, composer, 0);
            State stateRememberUpdatedState3 = SnapshotStateKt.rememberUpdatedState(Float.valueOf(this.$zoom), composer, 0);
            State stateRememberUpdatedState4 = SnapshotStateKt.rememberUpdatedState(this.$onSizeChanged, composer, 0);
            composer.startReplaceableGroup(-492369756);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt.derivedStateOf(new sn.a<Offset>() { // from class: androidx.compose.foundation.MagnifierKt$magnifier$4$sourceCenterInRoot$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(0);
                    }

                    @Override // sn.a
                    public /* bridge */ /* synthetic */ Offset invoke() {
                        return Offset.m1372boximpl(m229invokeF1C5BW0());
                    }

                    /* JADX INFO: renamed from: invoke-F1C5BW0, reason: not valid java name */
                    public final long m229invokeF1C5BW0() {
                        long packedValue = ((Offset) MagnifierKt.AnonymousClass4.m223invoke$lambda3(stateRememberUpdatedState).invoke(density)).getPackedValue();
                        return (OffsetKt.m1402isSpecifiedk4lQ0M(MagnifierKt.AnonymousClass4.m220invoke$lambda1(mutableState)) && OffsetKt.m1402isSpecifiedk4lQ0M(packedValue)) ? Offset.m1388plusMKHz9U(MagnifierKt.AnonymousClass4.m220invoke$lambda1(mutableState), packedValue) : Offset.INSTANCE.m1398getUnspecifiedF1C5BW0();
                    }
                });
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceableGroup();
            final State state = (State) objRememberedValue2;
            composer.startReplaceableGroup(-492369756);
            Object objRememberedValue3 = composer.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt.derivedStateOf(new sn.a<Boolean>() { // from class: androidx.compose.foundation.MagnifierKt$magnifier$4$isMagnifierShown$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final Boolean invoke() {
                        return Boolean.valueOf(OffsetKt.m1402isSpecifiedk4lQ0M(MagnifierKt.AnonymousClass4.m227invoke$lambda8(state)));
                    }
                });
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceableGroup();
            State state2 = (State) objRememberedValue3;
            composer.startReplaceableGroup(-492369756);
            Object objRememberedValue4 = composer.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = go.q.b(1, 0, BufferOverflow.DROP_OLDEST, 2, null);
                composer.updateRememberedValue(objRememberedValue4);
            }
            composer.endReplaceableGroup();
            final k kVar = (k) objRememberedValue4;
            float f10 = this.$platformMagnifierFactory.getCanUpdateZoom() ? 0.0f : this.$zoom;
            MagnifierStyle magnifierStyle = this.$style;
            EffectsKt.LaunchedEffect(new Object[]{view, density, Float.valueOf(f10), magnifierStyle, Boolean.valueOf(tn.p.f(magnifierStyle, MagnifierStyle.INSTANCE.getTextDefault()))}, (p<? super l0, ? super hn.c<? super r>, ? extends Object>) new AnonymousClass1(this.$platformMagnifierFactory, this.$style, view, density, this.$zoom, kVar, stateRememberUpdatedState4, state2, state, stateRememberUpdatedState2, mutableState, stateRememberUpdatedState3, null), composer, 8);
            Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(DrawModifierKt.drawBehind(OnGloballyPositionedModifierKt.onGloballyPositioned(modifier, new l<LayoutCoordinates, r>() { // from class: androidx.compose.foundation.MagnifierKt.magnifier.4.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // sn.l
                public /* bridge */ /* synthetic */ r invoke(LayoutCoordinates layoutCoordinates) {
                    invoke2(layoutCoordinates);
                    return r.f5635a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull LayoutCoordinates layoutCoordinates) {
                    tn.p.k(layoutCoordinates, "it");
                    AnonymousClass4.m222invoke$lambda2(mutableState, LayoutCoordinatesKt.positionInRoot(layoutCoordinates));
                }
            }), new l<DrawScope, r>() { // from class: androidx.compose.foundation.MagnifierKt.magnifier.4.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // sn.l
                public /* bridge */ /* synthetic */ r invoke(DrawScope drawScope) {
                    invoke2(drawScope);
                    return r.f5635a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull DrawScope drawScope) {
                    tn.p.k(drawScope, "$this$drawBehind");
                    kVar.h(r.f5635a);
                }
            }), false, new l<SemanticsPropertyReceiver, r>() { // from class: androidx.compose.foundation.MagnifierKt.magnifier.4.4
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
                    tn.p.k(semanticsPropertyReceiver, "$this$semantics");
                    SemanticsPropertyKey<sn.a<Offset>> magnifierPositionInRoot = MagnifierKt.getMagnifierPositionInRoot();
                    final State<Offset> state3 = state;
                    semanticsPropertyReceiver.set(magnifierPositionInRoot, new sn.a<Offset>() { // from class: androidx.compose.foundation.MagnifierKt.magnifier.4.4.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // sn.a
                        public /* bridge */ /* synthetic */ Offset invoke() {
                            return Offset.m1372boximpl(m228invokeF1C5BW0());
                        }

                        /* JADX INFO: renamed from: invoke-F1C5BW0, reason: not valid java name */
                        public final long m228invokeF1C5BW0() {
                            return AnonymousClass4.m227invoke$lambda8(state3);
                        }
                    });
                }
            }, 1, null);
            composer.endReplaceableGroup();
            return modifierSemantics$default;
        }

        @Override // sn.q
        public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            return invoke(modifier, composer, num.intValue());
        }
    }

    @NotNull
    public static final SemanticsPropertyKey<sn.a<Offset>> getMagnifierPositionInRoot() {
        return MagnifierPositionInRoot;
    }

    @ChecksSdkIntAtLeast(api = 28)
    public static final boolean isPlatformMagnifierSupported(int i10) {
        return i10 >= 28;
    }

    public static /* synthetic */ boolean isPlatformMagnifierSupported$default(int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = Build.VERSION.SDK_INT;
        }
        return isPlatformMagnifierSupported(i10);
    }

    @ExperimentalFoundationApi
    @NotNull
    public static final Modifier magnifier(@NotNull Modifier modifier, @NotNull final l<? super Density, Offset> lVar, @NotNull final l<? super Density, Offset> lVar2, final float f10, @NotNull final MagnifierStyle magnifierStyle, @Nullable l<? super DpSize, r> lVar3) {
        tn.p.k(modifier, "<this>");
        tn.p.k(lVar, "sourceCenter");
        tn.p.k(lVar2, "magnifierCenter");
        tn.p.k(magnifierStyle, "style");
        l<InspectorInfo, r> noInspectorInfo = InspectableValueKt.isDebugInspectorInfoEnabled() ? new l<InspectorInfo, r>() { // from class: androidx.compose.foundation.MagnifierKt$magnifier$$inlined$debugInspectorInfo$1
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
                tn.p.k(inspectorInfo, "$this$null");
                inspectorInfo.setName(MagnifierKt.isPlatformMagnifierSupported$default(0, 1, null) ? "magnifier" : "magnifier (not supported)");
                inspectorInfo.getProperties().set("sourceCenter", lVar);
                inspectorInfo.getProperties().set("magnifierCenter", lVar2);
                inspectorInfo.getProperties().set("zoom", Float.valueOf(f10));
                inspectorInfo.getProperties().set("style", magnifierStyle);
            }
        } : InspectableValueKt.getNoInspectorInfo();
        Modifier modifierMagnifier = Modifier.INSTANCE;
        if (isPlatformMagnifierSupported$default(0, 1, null)) {
            modifierMagnifier = magnifier(modifierMagnifier, lVar, lVar2, f10, magnifierStyle, lVar3, PlatformMagnifierFactory.INSTANCE.getForCurrentPlatform());
        }
        return InspectableValueKt.inspectableWrapper(modifier, noInspectorInfo, modifierMagnifier);
    }

    @RequiresApi(28)
    @SuppressLint({"ModifierInspectorInfo"})
    @NotNull
    public static final Modifier magnifier(@NotNull Modifier modifier, @NotNull l<? super Density, Offset> lVar, @NotNull l<? super Density, Offset> lVar2, float f10, @NotNull MagnifierStyle magnifierStyle, @Nullable l<? super DpSize, r> lVar3, @NotNull PlatformMagnifierFactory platformMagnifierFactory) {
        tn.p.k(modifier, "<this>");
        tn.p.k(lVar, "sourceCenter");
        tn.p.k(lVar2, "magnifierCenter");
        tn.p.k(magnifierStyle, "style");
        tn.p.k(platformMagnifierFactory, "platformMagnifierFactory");
        return ComposedModifierKt.composed$default(modifier, null, new AnonymousClass4(lVar, lVar2, f10, lVar3, platformMagnifierFactory, magnifierStyle), 1, null);
    }

    public static /* synthetic */ Modifier magnifier$default(Modifier modifier, l lVar, l lVar2, float f10, MagnifierStyle magnifierStyle, l lVar3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            lVar2 = new l<Density, Offset>() { // from class: androidx.compose.foundation.MagnifierKt.magnifier.1
                @Override // sn.l
                public /* bridge */ /* synthetic */ Offset invoke(Density density) {
                    return Offset.m1372boximpl(m211invoketuRUvjQ(density));
                }

                /* JADX INFO: renamed from: invoke-tuRUvjQ, reason: not valid java name */
                public final long m211invoketuRUvjQ(@NotNull Density density) {
                    tn.p.k(density, "$this$null");
                    return Offset.INSTANCE.m1398getUnspecifiedF1C5BW0();
                }
            };
        }
        l lVar4 = lVar2;
        if ((i10 & 4) != 0) {
            f10 = Float.NaN;
        }
        float f11 = f10;
        if ((i10 & 8) != 0) {
            magnifierStyle = MagnifierStyle.INSTANCE.getDefault();
        }
        MagnifierStyle magnifierStyle2 = magnifierStyle;
        if ((i10 & 16) != 0) {
            lVar3 = null;
        }
        return magnifier(modifier, lVar, lVar4, f11, magnifierStyle2, lVar3);
    }
}
