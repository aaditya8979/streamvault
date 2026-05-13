package androidx.compose.foundation.text;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.KeyframesSpec;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.unit.Dp;
import bn.r;
import hn.c;
import in.a;
import jn.d;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;
import sn.l;
import sn.q;
import tn.p;

/* JADX INFO: compiled from: TextFieldCursor.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a4\u0010\n\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0000\"\u0019\u0010\u0000\u001a\u00020\u0001X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0002\u0010\u0003\"\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"DefaultCursorThickness", "Landroidx/compose/ui/unit/Dp;", "getDefaultCursorThickness", "()F", "F", "cursorAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "getCursorAnimationSpec", "()Landroidx/compose/animation/core/AnimationSpec;", "cursor", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/text/TextFieldState;", "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "offsetMapping", "Landroidx/compose/ui/text/input/OffsetMapping;", "cursorBrush", "Landroidx/compose/ui/graphics/Brush;", "enabled", "", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class TextFieldCursorKt {
    private static final float DefaultCursorThickness = Dp.m3826constructorimpl(2);

    @NotNull
    public static final Modifier cursor(@NotNull Modifier modifier, @NotNull final TextFieldState textFieldState, @NotNull final TextFieldValue textFieldValue, @NotNull final OffsetMapping offsetMapping, @NotNull final Brush brush, boolean z10) {
        p.k(modifier, "<this>");
        p.k(textFieldState, "state");
        p.k(textFieldValue, "value");
        p.k(offsetMapping, "offsetMapping");
        p.k(brush, "cursorBrush");
        return z10 ? ComposedModifierKt.composed$default(modifier, null, new q<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.text.TextFieldCursorKt.cursor.1

            /* JADX INFO: renamed from: androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: TextFieldCursor.kt */
            @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
            @d(c = "androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$1", f = "TextFieldCursor.kt", l = {49}, m = "invokeSuspend")
            public static final class C00411 extends SuspendLambda implements sn.p<l0, c<? super r>, Object> {
                public final /* synthetic */ Animatable<Float, AnimationVector1D> $cursorAlpha;
                public int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C00411(Animatable<Float, AnimationVector1D> animatable, c<? super C00411> cVar) {
                    super(2, cVar);
                    this.$cursorAlpha = animatable;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
                    return new C00411(this.$cursorAlpha, cVar);
                }

                @Override // sn.p
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                public final Object mo2invoke(@NotNull l0 l0Var, @Nullable c<? super r> cVar) {
                    return ((C00411) create(l0Var, cVar)).invokeSuspend(r.f5635a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object objG = a.g();
                    int i10 = this.label;
                    if (i10 == 0) {
                        kotlin.c.b(obj);
                        Animatable<Float, AnimationVector1D> animatable = this.$cursorAlpha;
                        Float fC = jn.a.c(0.0f);
                        AnimationSpec cursorAnimationSpec = TextFieldCursorKt.getCursorAnimationSpec();
                        this.label = 1;
                        if (Animatable.animateTo$default(animatable, fC, cursorAnimationSpec, null, null, this, 12, null) == objG) {
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
            @androidx.compose.runtime.Composable
            @org.jetbrains.annotations.NotNull
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final androidx.compose.ui.Modifier invoke(@org.jetbrains.annotations.NotNull androidx.compose.ui.Modifier r11, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r12, int r13) {
                /*
                    r10 = this;
                    java.lang.String r13 = "$this$composed"
                    tn.p.k(r11, r13)
                    r13 = 1634330012(0x6169e59c, float:2.6966478E20)
                    r12.startReplaceableGroup(r13)
                    r13 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
                    r12.startReplaceableGroup(r13)
                    java.lang.Object r13 = r12.rememberedValue()
                    androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.INSTANCE
                    java.lang.Object r0 = r0.getEmpty()
                    r1 = 0
                    if (r13 != r0) goto L29
                    r13 = 1065353216(0x3f800000, float:1.0)
                    r0 = 0
                    r2 = 2
                    androidx.compose.animation.core.Animatable r13 = androidx.compose.animation.core.AnimatableKt.Animatable$default(r13, r0, r2, r1)
                    r12.updateRememberedValue(r13)
                L29:
                    r12.endReplaceableGroup()
                    r3 = r13
                    androidx.compose.animation.core.Animatable r3 = (androidx.compose.animation.core.Animatable) r3
                    androidx.compose.ui.graphics.Brush r13 = r1
                    boolean r0 = r13 instanceof androidx.compose.ui.graphics.SolidColor
                    r2 = 0
                    r4 = 1
                    if (r0 == 0) goto L4c
                    androidx.compose.ui.graphics.SolidColor r13 = (androidx.compose.ui.graphics.SolidColor) r13
                    long r5 = r13.getValue()
                    androidx.compose.ui.graphics.Color$Companion r13 = androidx.compose.ui.graphics.Color.INSTANCE
                    long r7 = r13.m1655getUnspecified0d7_KjU()
                    int r13 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                    if (r13 != 0) goto L49
                    r13 = r4
                    goto L4a
                L49:
                    r13 = r2
                L4a:
                    if (r13 != 0) goto L4d
                L4c:
                    r2 = r4
                L4d:
                    androidx.compose.foundation.text.TextFieldState r13 = r2
                    boolean r13 = r13.getHasFocus()
                    if (r13 == 0) goto L92
                    androidx.compose.ui.text.input.TextFieldValue r13 = r3
                    long r4 = r13.getSelection()
                    boolean r13 = androidx.compose.ui.text.TextRange.m3468getCollapsedimpl(r4)
                    if (r13 == 0) goto L92
                    if (r2 == 0) goto L92
                    androidx.compose.ui.graphics.Brush r4 = r1
                    androidx.compose.ui.text.input.TextFieldValue r13 = r3
                    androidx.compose.ui.text.AnnotatedString r5 = r13.getText()
                    androidx.compose.ui.text.input.TextFieldValue r13 = r3
                    long r6 = r13.getSelection()
                    androidx.compose.ui.text.TextRange r6 = androidx.compose.ui.text.TextRange.m3462boximpl(r6)
                    androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$1 r7 = new androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$1
                    r7.<init>(r3, r1)
                    r9 = 0
                    r8 = r12
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(r4, r5, r6, r7, r8, r9)
                    androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$2 r13 = new androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$2
                    androidx.compose.ui.text.input.OffsetMapping r4 = r4
                    androidx.compose.ui.text.input.TextFieldValue r5 = r3
                    androidx.compose.foundation.text.TextFieldState r6 = r2
                    androidx.compose.ui.graphics.Brush r7 = r1
                    r2 = r13
                    r2.<init>()
                    androidx.compose.ui.Modifier r11 = androidx.compose.ui.draw.DrawModifierKt.drawWithContent(r11, r13)
                    goto L94
                L92:
                    androidx.compose.ui.Modifier$Companion r11 = androidx.compose.ui.Modifier.INSTANCE
                L94:
                    r12.endReplaceableGroup()
                    return r11
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.TextFieldCursorKt.AnonymousClass1.invoke(androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int):androidx.compose.ui.Modifier");
            }

            @Override // sn.q
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }
        }, 1, null) : modifier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnimationSpec<Float> getCursorAnimationSpec() {
        return AnimationSpecKt.m101infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new l<KeyframesSpec.KeyframesSpecConfig<Float>, r>() { // from class: androidx.compose.foundation.text.TextFieldCursorKt$cursorAnimationSpec$1
            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                invoke2(keyframesSpecConfig);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                p.k(keyframesSpecConfig, "$this$keyframes");
                keyframesSpecConfig.setDurationMillis(1000);
                Float fValueOf = Float.valueOf(1.0f);
                keyframesSpecConfig.at(fValueOf, 0);
                keyframesSpecConfig.at(fValueOf, 499);
                Float fValueOf2 = Float.valueOf(0.0f);
                keyframesSpecConfig.at(fValueOf2, 500);
                keyframesSpecConfig.at(fValueOf2, 999);
            }
        }), null, 0L, 6, null);
    }

    public static final float getDefaultCursorThickness() {
        return DefaultCursorThickness;
    }
}
