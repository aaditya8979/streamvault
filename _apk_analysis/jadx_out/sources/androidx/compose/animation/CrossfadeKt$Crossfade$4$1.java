package androidx.compose.animation;

import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import bn.r;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.a;
import sn.l;
import sn.p;
import sn.q;
import tn.k;

/* JADX INFO: compiled from: Crossfade.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
public final class CrossfadeKt$Crossfade$4$1 extends Lambda implements p<Composer, Integer, r> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ FiniteAnimationSpec<Float> $animationSpec;
    public final /* synthetic */ q<T, Composer, Integer, r> $content;
    public final /* synthetic */ T $stateForContent;
    public final /* synthetic */ Transition<T> $this_Crossfade;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CrossfadeKt$Crossfade$4$1(Transition<T> transition, int i10, FiniteAnimationSpec<Float> finiteAnimationSpec, T t10, q<? super T, ? super Composer, ? super Integer, r> qVar) {
        super(2);
        this.$this_Crossfade = transition;
        this.$$dirty = i10;
        this.$animationSpec = finiteAnimationSpec;
        this.$stateForContent = t10;
        this.$content = qVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: invoke$lambda-1, reason: not valid java name */
    public static final float m40invoke$lambda1(State<Float> state) {
        return state.getValue().floatValue();
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public /* bridge */ /* synthetic */ r mo2invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r.f5635a;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Composable
    public final void invoke(@Nullable Composer composer, int i10) {
        if ((i10 & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        Transition<T> transition = this.$this_Crossfade;
        final FiniteAnimationSpec<Float> finiteAnimationSpec = this.$animationSpec;
        q<Transition.Segment<T>, Composer, Integer, FiniteAnimationSpec<Float>> qVar = new q<Transition.Segment<T>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$4$1$alpha$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Composable
            @NotNull
            public final FiniteAnimationSpec<Float> invoke(@NotNull Transition.Segment<T> segment, @Nullable Composer composer2, int i11) {
                tn.p.k(segment, "$this$animateFloat");
                composer2.startReplaceableGroup(438406499);
                FiniteAnimationSpec<Float> finiteAnimationSpec2 = finiteAnimationSpec;
                composer2.endReplaceableGroup();
                return finiteAnimationSpec2;
            }

            @Override // sn.q
            public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Object obj, Composer composer2, Integer num) {
                return invoke((Transition.Segment) obj, composer2, num.intValue());
            }
        };
        T t10 = this.$stateForContent;
        int i11 = this.$$dirty & 14;
        composer.startReplaceableGroup(-1338768149);
        TwoWayConverter<Float, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(k.f85359a);
        int i12 = i11 & 14;
        int i13 = i11 << 3;
        int i14 = (i13 & 57344) | i12 | (i13 & 896) | (i13 & 7168);
        composer.startReplaceableGroup(-142660079);
        Object currentState = transition.getCurrentState();
        composer.startReplaceableGroup(-438678252);
        float f10 = tn.p.f(currentState, t10) ? 1.0f : 0.0f;
        composer.endReplaceableGroup();
        Float fValueOf = Float.valueOf(f10);
        Object targetState = transition.getTargetState();
        composer.startReplaceableGroup(-438678252);
        float f11 = tn.p.f(targetState, t10) ? 1.0f : 0.0f;
        composer.endReplaceableGroup();
        final State stateCreateTransitionAnimation = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(transition, fValueOf, Float.valueOf(f11), qVar.invoke(transition.getSegment(), composer, Integer.valueOf((i14 >> 3) & 112)), vectorConverter, "FloatAnimation", composer, (i14 & 14) | (57344 & (i14 << 9)) | ((i14 << 6) & 458752));
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        Modifier.Companion companion = Modifier.INSTANCE;
        composer.startReplaceableGroup(1157296644);
        boolean zChanged = composer.changed(stateCreateTransitionAnimation);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new l<GraphicsLayerScope, r>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$4$1$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // sn.l
                public /* bridge */ /* synthetic */ r invoke(GraphicsLayerScope graphicsLayerScope) {
                    invoke2(graphicsLayerScope);
                    return r.f5635a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull GraphicsLayerScope graphicsLayerScope) {
                    tn.p.k(graphicsLayerScope, "$this$graphicsLayer");
                    graphicsLayerScope.setAlpha(CrossfadeKt$Crossfade$4$1.m40invoke$lambda1(stateCreateTransitionAnimation));
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        Modifier modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(companion, (l) objRememberedValue);
        q<T, Composer, Integer, r> qVar2 = this.$content;
        T t11 = this.$stateForContent;
        int i15 = this.$$dirty;
        composer.startReplaceableGroup(-1990474327);
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer, 0);
        composer.startReplaceableGroup(1376089335);
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
        a<ComposeUiNode> constructor = companion2.getConstructor();
        q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r> qVarMaterializerOf = LayoutKt.materializerOf(modifierGraphicsLayer);
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        composer.disableReusing();
        Composer composerM1274constructorimpl = Updater.m1274constructorimpl(composer);
        Updater.m1281setimpl(composerM1274constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m1281setimpl(composerM1274constructorimpl, density, companion2.getSetDensity());
        Updater.m1281setimpl(composerM1274constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
        composer.enableReusing();
        qVarMaterializerOf.invoke(SkippableUpdater.m1264boximpl(SkippableUpdater.m1265constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        composer.startReplaceableGroup(-1253629305);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        composer.startReplaceableGroup(-222715758);
        qVar2.invoke(t11, composer, Integer.valueOf((i15 >> 9) & 112));
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }
}
