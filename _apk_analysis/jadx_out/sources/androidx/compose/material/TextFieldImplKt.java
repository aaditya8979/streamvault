package androidx.compose.material;

import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.LayoutIdParentData;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import bn.r;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.p;
import sn.q;
import sn.t;

/* JADX INFO: compiled from: TextFieldImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {}, d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001aá\u0001\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0011\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u00062\u0006\u0010\t\u001a\u00020\b2\u0013\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0002\b\u00062\u0015\b\u0002\u0010\u000b\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0002\b\u00062\u0015\b\u0002\u0010\f\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0002\b\u00062\u0015\b\u0002\u0010\r\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0002\b\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0015\b\u0002\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0002\b\u0006H\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u001aW\u0010&\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2 \u0010#\u001a\u001c\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\u0003\u0010\u0000H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010%\u001a\u0012\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'H\u0000\u001a\u0012\u0010+\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'H\u0000\"\u0014\u0010,\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b,\u0010-\"\u0014\u0010.\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b.\u0010-\"\u0014\u0010/\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b/\u0010-\"\u0014\u00100\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b0\u0010-\"\u0014\u00101\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b1\u0010-\"\u001d\u00103\u001a\u0002028\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0014\u00107\u001a\u00020)8\u0000X\u0080T¢\u0006\u0006\n\u0004\b7\u00108\"\u0014\u00109\u001a\u00020)8\u0002X\u0082T¢\u0006\u0006\n\u0004\b9\u00108\"\u0014\u0010:\u001a\u00020)8\u0002X\u0082T¢\u0006\u0006\n\u0004\b:\u00108\"\u001d\u0010<\u001a\u00020;8\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u001d\u0010@\u001a\u00020;8\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b@\u0010=\u001a\u0004\bA\u0010?\"\u001a\u0010C\u001a\u00020B8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u001a\u0010K\u001a\u0004\u0018\u00010H*\u00020G8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bI\u0010J\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006L"}, d2 = {"Landroidx/compose/material/TextFieldType;", "type", "", "value", "Lkotlin/Function0;", "Lbn/r;", "Landroidx/compose/runtime/Composable;", "innerTextField", "Landroidx/compose/ui/text/input/VisualTransformation;", "visualTransformation", "label", "placeholder", "leadingIcon", "trailingIcon", "", "singleLine", "enabled", "isError", "Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "Landroidx/compose/material/TextFieldColors;", "colors", OutlinedTextFieldKt.BorderId, "CommonDecorationBox", "(Landroidx/compose/material/TextFieldType;Ljava/lang/String;Lsn/p;Landroidx/compose/ui/text/input/VisualTransformation;Lsn/p;Lsn/p;Lsn/p;Lsn/p;ZZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/material/TextFieldColors;Lsn/p;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/ui/graphics/Color;", "contentColor", "Landroidx/compose/ui/text/TextStyle;", "typography", "", "contentAlpha", "Landroidx/compose/runtime/ComposableOpenTarget;", "index", "content", "Decoration-euL9pac", "(JLandroidx/compose/ui/text/TextStyle;Ljava/lang/Float;Lsn/p;Landroidx/compose/runtime/Composer;II)V", "Decoration", "Landroidx/compose/ui/layout/Placeable;", "placeable", "", "widthOrZero", "heightOrZero", "TextFieldId", "Ljava/lang/String;", "PlaceholderId", "LabelId", "LeadingId", "TrailingId", "Landroidx/compose/ui/unit/Constraints;", "ZeroConstraints", "J", "getZeroConstraints", "()J", "AnimationDuration", "I", "PlaceholderAnimationDuration", "PlaceholderAnimationDelayOrDuration", "Landroidx/compose/ui/unit/Dp;", "TextFieldPadding", "F", "getTextFieldPadding", "()F", "HorizontalIconPadding", "getHorizontalIconPadding", "Landroidx/compose/ui/Modifier;", "IconDefaultSizeModifier", "Landroidx/compose/ui/Modifier;", "getIconDefaultSizeModifier", "()Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "getLayoutId", "(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Ljava/lang/Object;", "layoutId", "material_release"}, k = 2, mv = {1, 6, 0})
public final class TextFieldImplKt {
    public static final int AnimationDuration = 150;

    @NotNull
    private static final Modifier IconDefaultSizeModifier;

    @NotNull
    public static final String LabelId = "Label";

    @NotNull
    public static final String LeadingId = "Leading";
    private static final int PlaceholderAnimationDelayOrDuration = 67;
    private static final int PlaceholderAnimationDuration = 83;

    @NotNull
    public static final String PlaceholderId = "Hint";

    @NotNull
    public static final String TextFieldId = "TextField";

    @NotNull
    public static final String TrailingId = "Trailing";
    private static final long ZeroConstraints = ConstraintsKt.Constraints(0, 0, 0, 0);
    private static final float TextFieldPadding = Dp.m3826constructorimpl(16);
    private static final float HorizontalIconPadding = Dp.m3826constructorimpl(12);

    static {
        float f10 = 48;
        IconDefaultSizeModifier = SizeKt.m436defaultMinSizeVpY3zN4(Modifier.INSTANCE, Dp.m3826constructorimpl(f10), Dp.m3826constructorimpl(f10));
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void CommonDecorationBox(@NotNull final TextFieldType textFieldType, @NotNull final String str, @NotNull final p<? super Composer, ? super Integer, r> pVar, @NotNull final VisualTransformation visualTransformation, @Nullable final p<? super Composer, ? super Integer, r> pVar2, @Nullable p<? super Composer, ? super Integer, r> pVar3, @Nullable p<? super Composer, ? super Integer, r> pVar4, @Nullable p<? super Composer, ? super Integer, r> pVar5, boolean z10, boolean z11, boolean z12, @NotNull final InteractionSource interactionSource, @NotNull final PaddingValues paddingValues, @NotNull final TextFieldColors textFieldColors, @Nullable p<? super Composer, ? super Integer, r> pVar6, @Nullable Composer composer, final int i10, final int i11, final int i12) {
        int i13;
        int i14;
        InputPhase inputPhase;
        Composer composer2;
        final p<? super Composer, ? super Integer, r> pVar7;
        final p<? super Composer, ? super Integer, r> pVar8;
        final p<? super Composer, ? super Integer, r> pVar9;
        final boolean z13;
        final boolean z14;
        final boolean z15;
        final p<? super Composer, ? super Integer, r> pVar10;
        tn.p.k(textFieldType, "type");
        tn.p.k(str, "value");
        tn.p.k(pVar, "innerTextField");
        tn.p.k(visualTransformation, "visualTransformation");
        tn.p.k(interactionSource, "interactionSource");
        tn.p.k(paddingValues, "contentPadding");
        tn.p.k(textFieldColors, "colors");
        Composer composerStartRestartGroup = composer.startRestartGroup(-712568069);
        if ((i12 & 1) != 0) {
            i13 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i13 = (composerStartRestartGroup.changed(textFieldType) ? 4 : 2) | i10;
        } else {
            i13 = i10;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i10 & 112) == 0) {
            i13 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= 384;
        } else if ((i10 & 896) == 0) {
            i13 |= composerStartRestartGroup.changed(pVar) ? 256 : 128;
        }
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i10 & 7168) == 0) {
            i13 |= composerStartRestartGroup.changed(visualTransformation) ? 2048 : 1024;
        }
        if ((i12 & 16) != 0) {
            i13 |= 24576;
        } else if ((i10 & 57344) == 0) {
            i13 |= composerStartRestartGroup.changed(pVar2) ? 16384 : 8192;
        }
        int i15 = i12 & 32;
        if (i15 != 0) {
            i13 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i10 & 458752) == 0) {
            i13 |= composerStartRestartGroup.changed(pVar3) ? 131072 : 65536;
        }
        int i16 = i12 & 64;
        if (i16 != 0) {
            i13 |= 1572864;
        } else if ((i10 & 3670016) == 0) {
            i13 |= composerStartRestartGroup.changed(pVar4) ? 1048576 : 524288;
        }
        int i17 = i12 & 128;
        if (i17 != 0) {
            i13 |= 12582912;
        } else if ((i10 & 29360128) == 0) {
            i13 |= composerStartRestartGroup.changed(pVar5) ? 8388608 : 4194304;
        }
        int i18 = i12 & 256;
        if (i18 != 0) {
            i13 |= 100663296;
        } else if ((i10 & 234881024) == 0) {
            i13 |= composerStartRestartGroup.changed(z10) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        int i19 = i12 & 512;
        if (i19 != 0) {
            i13 |= 805306368;
        } else if ((i10 & 1879048192) == 0) {
            i13 |= composerStartRestartGroup.changed(z11) ? 536870912 : 268435456;
        }
        final int i20 = i13;
        int i21 = i12 & 1024;
        if (i21 != 0) {
            i14 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            i14 = i11 | (composerStartRestartGroup.changed(z12) ? 4 : 2);
        } else {
            i14 = i11;
        }
        if ((i12 & 2048) != 0) {
            i14 |= 48;
        } else if ((i11 & 112) == 0) {
            i14 |= composerStartRestartGroup.changed(interactionSource) ? 32 : 16;
        }
        int i22 = i14;
        if ((i12 & 4096) != 0) {
            i22 |= 384;
        } else if ((i11 & 896) == 0) {
            i22 |= composerStartRestartGroup.changed(paddingValues) ? 256 : 128;
        }
        if ((i12 & 8192) != 0) {
            i22 |= 3072;
        } else if ((i11 & 7168) == 0) {
            i22 |= composerStartRestartGroup.changed(textFieldColors) ? 2048 : 1024;
        }
        int i23 = i12 & 16384;
        if (i23 != 0) {
            i22 |= 24576;
        } else if ((i11 & 57344) == 0) {
            i22 |= composerStartRestartGroup.changed(pVar6) ? 16384 : 8192;
        }
        if ((i20 & 1533916891) == 306783378 && (46811 & i22) == 9362 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            pVar7 = pVar3;
            pVar8 = pVar4;
            pVar9 = pVar5;
            z13 = z10;
            z14 = z11;
            z15 = z12;
            pVar10 = pVar6;
            composer2 = composerStartRestartGroup;
        } else {
            p<? super Composer, ? super Integer, r> pVar11 = i15 != 0 ? null : pVar3;
            p<? super Composer, ? super Integer, r> pVar12 = i16 != 0 ? null : pVar4;
            p<? super Composer, ? super Integer, r> pVar13 = i17 != 0 ? null : pVar5;
            boolean z16 = i18 != 0 ? false : z10;
            boolean z17 = i19 != 0 ? true : z11;
            boolean z18 = i21 != 0 ? false : z12;
            p<? super Composer, ? super Integer, r> pVar14 = i23 != 0 ? null : pVar6;
            composerStartRestartGroup.startReplaceableGroup(511388516);
            boolean zChanged = composerStartRestartGroup.changed(str) | composerStartRestartGroup.changed(visualTransformation);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = visualTransformation.filter(new AnnotatedString(str, null, null, 6, null));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            final String text = ((TransformedText) objRememberedValue).getText().getText();
            if (FocusInteractionKt.collectIsFocusedAsState(interactionSource, composerStartRestartGroup, (i22 >> 3) & 14).getValue().booleanValue()) {
                inputPhase = InputPhase.Focused;
            } else {
                inputPhase = text.length() == 0 ? InputPhase.UnfocusedEmpty : InputPhase.UnfocusedNotEmpty;
            }
            InputPhase inputPhase2 = inputPhase;
            final boolean z19 = z17;
            final boolean z20 = z18;
            final int i24 = i22;
            q<InputPhase, Composer, Integer, Color> qVar = new q<InputPhase, Composer, Integer, Color>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$labelColor$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // sn.q
                public /* bridge */ /* synthetic */ Color invoke(InputPhase inputPhase3, Composer composer3, Integer num) {
                    return Color.m1609boximpl(m1223invokeXeAY9LY(inputPhase3, composer3, num.intValue()));
                }

                @Composable
                /* JADX INFO: renamed from: invoke-XeAY9LY, reason: not valid java name */
                public final long m1223invokeXeAY9LY(@NotNull InputPhase inputPhase3, @Nullable Composer composer3, int i25) {
                    tn.p.k(inputPhase3, "it");
                    composer3.startReplaceableGroup(697243846);
                    TextFieldColors textFieldColors2 = textFieldColors;
                    boolean z21 = z19;
                    boolean z22 = inputPhase3 == InputPhase.UnfocusedEmpty ? false : z20;
                    InteractionSource interactionSource2 = interactionSource;
                    int i26 = (i20 >> 27) & 14;
                    int i27 = i24;
                    long jM1629unboximpl = textFieldColors2.labelColor(z21, z22, interactionSource2, composer3, i26 | ((i27 << 3) & 896) | (i27 & 7168)).getValue().m1629unboximpl();
                    composer3.endReplaceableGroup();
                    return jM1629unboximpl;
                }
            };
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            Typography typography = materialTheme.getTypography(composerStartRestartGroup, 6);
            TextStyle subtitle1 = typography.getSubtitle1();
            TextStyle caption = typography.getCaption();
            long jM3490getColor0d7_KjU = subtitle1.m3490getColor0d7_KjU();
            Color.Companion companion = Color.INSTANCE;
            boolean z21 = (Color.m1620equalsimpl0(jM3490getColor0d7_KjU, companion.m1655getUnspecified0d7_KjU()) && !Color.m1620equalsimpl0(caption.m3490getColor0d7_KjU(), companion.m1655getUnspecified0d7_KjU())) || (!Color.m1620equalsimpl0(subtitle1.m3490getColor0d7_KjU(), companion.m1655getUnspecified0d7_KjU()) && Color.m1620equalsimpl0(caption.m3490getColor0d7_KjU(), companion.m1655getUnspecified0d7_KjU()));
            TextFieldTransitionScope textFieldTransitionScope = TextFieldTransitionScope.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(2129141006);
            long jM3490getColor0d7_KjU2 = materialTheme.getTypography(composerStartRestartGroup, 6).getCaption().m3490getColor0d7_KjU();
            if (z21) {
                if (!(jM3490getColor0d7_KjU2 != companion.m1655getUnspecified0d7_KjU())) {
                    jM3490getColor0d7_KjU2 = qVar.invoke(inputPhase2, composerStartRestartGroup, 0).m1629unboximpl();
                }
            }
            long j10 = jM3490getColor0d7_KjU2;
            composerStartRestartGroup.endReplaceableGroup();
            long jM3490getColor0d7_KjU3 = materialTheme.getTypography(composerStartRestartGroup, 6).getSubtitle1().m3490getColor0d7_KjU();
            if (z21) {
                if (!(jM3490getColor0d7_KjU3 != companion.m1655getUnspecified0d7_KjU())) {
                    jM3490getColor0d7_KjU3 = qVar.invoke(inputPhase2, composerStartRestartGroup, 0).m1629unboximpl();
                }
            }
            long j11 = jM3490getColor0d7_KjU3;
            final p<? super Composer, ? super Integer, r> pVar15 = pVar11;
            final boolean z22 = z18;
            final int i25 = i22;
            final boolean z23 = z17;
            final p<? super Composer, ? super Integer, r> pVar16 = pVar12;
            final p<? super Composer, ? super Integer, r> pVar17 = pVar13;
            final boolean z24 = z16;
            final boolean z25 = z21;
            final p<? super Composer, ? super Integer, r> pVar18 = pVar14;
            composer2 = composerStartRestartGroup;
            textFieldTransitionScope.m1232TransitionDTcfvLk(inputPhase2, j10, j11, qVar, pVar2 != null, ComposableLambdaKt.composableLambda(composer2, 341865432, true, new t<Float, Color, Color, Float, Composer, Integer, r>() { // from class: androidx.compose.material.TextFieldImplKt.CommonDecorationBox.3

                /* JADX INFO: renamed from: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$WhenMappings */
                /* JADX INFO: compiled from: TextFieldImpl.kt */
                @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[TextFieldType.values().length];
                        iArr[TextFieldType.Filled.ordinal()] = 1;
                        iArr[TextFieldType.Outlined.ordinal()] = 2;
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(6);
                }

                @Override // sn.t
                public /* bridge */ /* synthetic */ r invoke(Float f10, Color color, Color color2, Float f11, Composer composer3, Integer num) {
                    m1221invokeRIQooxk(f10.floatValue(), color.m1629unboximpl(), color2.m1629unboximpl(), f11.floatValue(), composer3, num.intValue());
                    return r.f5635a;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:50:0x00be  */
                /* JADX WARN: Type inference failed for: r14v0 */
                /* JADX WARN: Type inference failed for: r14v1, types: [boolean, int] */
                /* JADX WARN: Type inference failed for: r14v4 */
                /* JADX WARN: Type inference failed for: r27v0, types: [androidx.compose.runtime.Composer] */
                /* JADX WARN: Type inference failed for: r7v5 */
                /* JADX WARN: Type inference failed for: r7v6 */
                /* JADX WARN: Type inference failed for: r7v9 */
                @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @androidx.compose.runtime.Composable
                /* JADX INFO: renamed from: invoke-RIQooxk, reason: not valid java name */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void m1221invokeRIQooxk(final float r21, final long r22, final long r24, final float r26, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r27, int r28) {
                    /*
                        Method dump skipped, instruction units count: 770
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldImplKt.AnonymousClass3.m1221invokeRIQooxk(float, long, long, float, androidx.compose.runtime.Composer, int):void");
                }
            }), composer2, 1769472);
            pVar7 = pVar11;
            pVar8 = pVar12;
            pVar9 = pVar13;
            z13 = z16;
            z14 = z17;
            z15 = z18;
            pVar10 = pVar14;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new p<Composer, Integer, r>() { // from class: androidx.compose.material.TextFieldImplKt.CommonDecorationBox.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // sn.p
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ r mo2invoke(Composer composer3, Integer num) {
                invoke(composer3, num.intValue());
                return r.f5635a;
            }

            public final void invoke(@Nullable Composer composer3, int i26) {
                TextFieldImplKt.CommonDecorationBox(textFieldType, str, pVar, visualTransformation, pVar2, pVar7, pVar8, pVar9, z13, z14, z15, interactionSource, paddingValues, textFieldColors, pVar10, composer3, i10 | 1, i11, i12);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableOpenTarget(index = 0)
    /* JADX INFO: renamed from: Decoration-euL9pac, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1220DecorationeuL9pac(final long r16, @org.jetbrains.annotations.Nullable androidx.compose.ui.text.TextStyle r18, @org.jetbrains.annotations.Nullable java.lang.Float r19, @org.jetbrains.annotations.NotNull final sn.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, bn.r> r20, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r21, final int r22, final int r23) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldImplKt.m1220DecorationeuL9pac(long, androidx.compose.ui.text.TextStyle, java.lang.Float, sn.p, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final float getHorizontalIconPadding() {
        return HorizontalIconPadding;
    }

    @NotNull
    public static final Modifier getIconDefaultSizeModifier() {
        return IconDefaultSizeModifier;
    }

    @Nullable
    public static final Object getLayoutId(@NotNull IntrinsicMeasurable intrinsicMeasurable) {
        tn.p.k(intrinsicMeasurable, "<this>");
        Object parentData = intrinsicMeasurable.getParentData();
        LayoutIdParentData layoutIdParentData = parentData instanceof LayoutIdParentData ? (LayoutIdParentData) parentData : null;
        if (layoutIdParentData != null) {
            return layoutIdParentData.getLayoutId();
        }
        return null;
    }

    public static final float getTextFieldPadding() {
        return TextFieldPadding;
    }

    public static final long getZeroConstraints() {
        return ZeroConstraints;
    }

    public static final int heightOrZero(@Nullable Placeable placeable) {
        if (placeable != null) {
            return placeable.getHeight();
        }
        return 0;
    }

    public static final int widthOrZero(@Nullable Placeable placeable) {
        if (placeable != null) {
            return placeable.getWidth();
        }
        return 0;
    }
}
