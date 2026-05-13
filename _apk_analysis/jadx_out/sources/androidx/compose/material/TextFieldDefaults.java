package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.CornerSizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import bn.r;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import sn.q;
import tn.p;

/* JADX INFO: compiled from: TextFieldDefaults.kt */
/* JADX INFO: loaded from: classes5.dex */
@Immutable
@Metadata(bv = {}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0007\n\u0002\b\u000f\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bh\u0010iJM\u0010\u000f\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\nH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJS\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\nH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016J=\u0010\u001f\u001a\u00020\u001c2\b\b\u0002\u0010\u0018\u001a\u00020\n2\b\b\u0002\u0010\u0019\u001a\u00020\n2\b\b\u0002\u0010\u001a\u001a\u00020\n2\b\b\u0002\u0010\u001b\u001a\u00020\nH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ=\u0010!\u001a\u00020\u001c2\b\b\u0002\u0010\u0018\u001a\u00020\n2\b\b\u0002\u0010\u001a\u001a\u00020\n2\b\b\u0002\u0010\u0019\u001a\u00020\n2\b\b\u0002\u0010\u001b\u001a\u00020\nH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010\u001eJ=\u0010#\u001a\u00020\u001c2\b\b\u0002\u0010\u0018\u001a\u00020\n2\b\b\u0002\u0010\u001a\u001a\u00020\n2\b\b\u0002\u0010\u0019\u001a\u00020\n2\b\b\u0002\u0010\u001b\u001a\u00020\nH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010\u001eJç\u0001\u0010<\u001a\u00020\b2\b\b\u0002\u0010%\u001a\u00020$2\b\b\u0002\u0010&\u001a\u00020$2\b\b\u0002\u0010'\u001a\u00020$2\b\b\u0002\u0010(\u001a\u00020$2\b\b\u0002\u0010)\u001a\u00020$2\b\b\u0002\u0010*\u001a\u00020$2\b\b\u0002\u0010+\u001a\u00020$2\b\b\u0002\u0010,\u001a\u00020$2\b\b\u0002\u0010-\u001a\u00020$2\b\b\u0002\u0010.\u001a\u00020$2\b\b\u0002\u0010/\u001a\u00020$2\b\b\u0002\u00100\u001a\u00020$2\b\b\u0002\u00101\u001a\u00020$2\b\b\u0002\u00102\u001a\u00020$2\b\b\u0002\u00103\u001a\u00020$2\b\b\u0002\u00104\u001a\u00020$2\b\b\u0002\u00105\u001a\u00020$2\b\b\u0002\u00106\u001a\u00020$2\b\b\u0002\u00107\u001a\u00020$2\b\b\u0002\u00108\u001a\u00020$2\b\b\u0002\u00109\u001a\u00020$H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b:\u0010;Jç\u0001\u0010B\u001a\u00020\b2\b\b\u0002\u0010%\u001a\u00020$2\b\b\u0002\u0010&\u001a\u00020$2\b\b\u0002\u0010'\u001a\u00020$2\b\b\u0002\u0010(\u001a\u00020$2\b\b\u0002\u0010)\u001a\u00020$2\b\b\u0002\u0010=\u001a\u00020$2\b\b\u0002\u0010>\u001a\u00020$2\b\b\u0002\u0010?\u001a\u00020$2\b\b\u0002\u0010@\u001a\u00020$2\b\b\u0002\u0010.\u001a\u00020$2\b\b\u0002\u0010/\u001a\u00020$2\b\b\u0002\u00100\u001a\u00020$2\b\b\u0002\u00101\u001a\u00020$2\b\b\u0002\u00102\u001a\u00020$2\b\b\u0002\u00103\u001a\u00020$2\b\b\u0002\u00104\u001a\u00020$2\b\b\u0002\u00105\u001a\u00020$2\b\b\u0002\u00106\u001a\u00020$2\b\b\u0002\u00107\u001a\u00020$2\b\b\u0002\u00108\u001a\u00020$2\b\b\u0002\u00109\u001a\u00020$H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bA\u0010;JÄ\u0001\u0010P\u001a\u00020\u00142\u0006\u0010D\u001a\u00020C2\u0011\u0010G\u001a\r\u0012\u0004\u0012\u00020\u00140E¢\u0006\u0002\bF2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010H\u001a\u00020\u00032\u0006\u0010J\u001a\u00020I2\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0015\b\u0002\u0010K\u001a\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010E¢\u0006\u0002\bF2\u0015\b\u0002\u0010L\u001a\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010E¢\u0006\u0002\bF2\u0015\b\u0002\u0010M\u001a\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010E¢\u0006\u0002\bF2\u0015\b\u0002\u0010N\u001a\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010E¢\u0006\u0002\bF2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010O\u001a\u00020\u001cH\u0007¢\u0006\u0004\bP\u0010QJÙ\u0001\u0010S\u001a\u00020\u00142\u0006\u0010D\u001a\u00020C2\u0011\u0010G\u001a\r\u0012\u0004\u0012\u00020\u00140E¢\u0006\u0002\bF2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010H\u001a\u00020\u00032\u0006\u0010J\u001a\u00020I2\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0015\b\u0002\u0010K\u001a\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010E¢\u0006\u0002\bF2\u0015\b\u0002\u0010L\u001a\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010E¢\u0006\u0002\bF2\u0015\b\u0002\u0010M\u001a\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010E¢\u0006\u0002\bF2\u0015\b\u0002\u0010N\u001a\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010E¢\u0006\u0002\bF2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010O\u001a\u00020\u001c2\u0013\b\u0002\u0010R\u001a\r\u0012\u0004\u0012\u00020\u00140E¢\u0006\u0002\bFH\u0007¢\u0006\u0004\bS\u0010TR \u0010U\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010XR \u0010Y\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bY\u0010V\u001a\u0004\bZ\u0010XR\u0014\u0010\\\u001a\u00020[8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\\\u0010VR \u0010]\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b]\u0010V\u001a\u0004\b^\u0010XR \u0010_\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b_\u0010V\u001a\u0004\b`\u0010XR\u0014\u0010a\u001a\u00020[8\u0006X\u0086T¢\u0006\u0006\n\u0004\ba\u0010VR\u0014\u0010b\u001a\u00020[8\u0006X\u0086T¢\u0006\u0006\n\u0004\bb\u0010VR\u0011\u0010e\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\bc\u0010dR\u0011\u0010g\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\bf\u0010d\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006j"}, d2 = {"Landroidx/compose/material/TextFieldDefaults;", "", "Landroidx/compose/ui/Modifier;", "", "enabled", "isError", "Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "Landroidx/compose/material/TextFieldColors;", "colors", "Landroidx/compose/ui/unit/Dp;", "focusedIndicatorLineThickness", "unfocusedIndicatorLineThickness", "indicatorLine-gv0btCI", "(Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material/TextFieldColors;FF)Landroidx/compose/ui/Modifier;", "indicatorLine", "Landroidx/compose/ui/graphics/Shape;", "shape", "focusedBorderThickness", "unfocusedBorderThickness", "Lbn/r;", "BorderBox-nbWgWpA", "(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material/TextFieldColors;Landroidx/compose/ui/graphics/Shape;FFLandroidx/compose/runtime/Composer;II)V", "BorderBox", "start", "end", "top", "bottom", "Landroidx/compose/foundation/layout/PaddingValues;", "textFieldWithLabelPadding-a9UjIt4", "(FFFF)Landroidx/compose/foundation/layout/PaddingValues;", "textFieldWithLabelPadding", "textFieldWithoutLabelPadding-a9UjIt4", "textFieldWithoutLabelPadding", "outlinedTextFieldPadding-a9UjIt4", "outlinedTextFieldPadding", "Landroidx/compose/ui/graphics/Color;", "textColor", "disabledTextColor", "backgroundColor", "cursorColor", "errorCursorColor", "focusedIndicatorColor", "unfocusedIndicatorColor", "disabledIndicatorColor", "errorIndicatorColor", "leadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "trailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "placeholderColor", "disabledPlaceholderColor", "textFieldColors-dx8h9Zs", "(JJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIII)Landroidx/compose/material/TextFieldColors;", "textFieldColors", "focusedBorderColor", "unfocusedBorderColor", "disabledBorderColor", "errorBorderColor", "outlinedTextFieldColors-dx8h9Zs", "outlinedTextFieldColors", "", "value", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "innerTextField", "singleLine", "Landroidx/compose/ui/text/input/VisualTransformation;", "visualTransformation", "label", "placeholder", "leadingIcon", "trailingIcon", "contentPadding", "TextFieldDecorationBox", "(Ljava/lang/String;Lsn/p;ZZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/InteractionSource;ZLsn/p;Lsn/p;Lsn/p;Lsn/p;Landroidx/compose/material/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;III)V", OutlinedTextFieldKt.BorderId, "OutlinedTextFieldDecorationBox", "(Ljava/lang/String;Lsn/p;ZZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/InteractionSource;ZLsn/p;Lsn/p;Lsn/p;Lsn/p;Landroidx/compose/material/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Lsn/p;Landroidx/compose/runtime/Composer;III)V", "MinHeight", "F", "getMinHeight-D9Ej5fM", "()F", "MinWidth", "getMinWidth-D9Ej5fM", "", "IconOpacity", "UnfocusedBorderThickness", "getUnfocusedBorderThickness-D9Ej5fM", "FocusedBorderThickness", "getFocusedBorderThickness-D9Ej5fM", "BackgroundOpacity", "UnfocusedIndicatorLineOpacity", "getTextFieldShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "TextFieldShape", "getOutlinedTextFieldShape", "OutlinedTextFieldShape", "<init>", "()V", "material_release"}, k = 1, mv = {1, 6, 0})
public final class TextFieldDefaults {
    public static final float BackgroundOpacity = 0.12f;
    public static final float IconOpacity = 0.54f;
    public static final float UnfocusedIndicatorLineOpacity = 0.42f;

    @NotNull
    public static final TextFieldDefaults INSTANCE = new TextFieldDefaults();
    private static final float MinHeight = Dp.m3826constructorimpl(56);
    private static final float MinWidth = Dp.m3826constructorimpl(280);
    private static final float UnfocusedBorderThickness = Dp.m3826constructorimpl(1);
    private static final float FocusedBorderThickness = Dp.m3826constructorimpl(2);

    private TextFieldDefaults() {
    }

    /* JADX INFO: renamed from: outlinedTextFieldPadding-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m1203outlinedTextFieldPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i10 & 2) != 0) {
            f11 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i10 & 4) != 0) {
            f12 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i10 & 8) != 0) {
            f13 = TextFieldImplKt.getTextFieldPadding();
        }
        return textFieldDefaults.m1213outlinedTextFieldPaddinga9UjIt4(f10, f11, f12, f13);
    }

    /* JADX INFO: renamed from: textFieldWithLabelPadding-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m1204textFieldWithLabelPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i10 & 2) != 0) {
            f11 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i10 & 4) != 0) {
            f12 = TextFieldKt.getFirstBaselineOffset();
        }
        if ((i10 & 8) != 0) {
            f13 = TextFieldKt.getTextFieldBottomPadding();
        }
        return textFieldDefaults.m1215textFieldWithLabelPaddinga9UjIt4(f10, f11, f12, f13);
    }

    /* JADX INFO: renamed from: textFieldWithoutLabelPadding-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m1205textFieldWithoutLabelPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i10 & 2) != 0) {
            f11 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i10 & 4) != 0) {
            f12 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i10 & 8) != 0) {
            f13 = TextFieldImplKt.getTextFieldPadding();
        }
        return textFieldDefaults.m1216textFieldWithoutLabelPaddinga9UjIt4(f10, f11, f12, f13);
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0109  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @androidx.compose.material.ExperimentalMaterialApi
    /* JADX INFO: renamed from: BorderBox-nbWgWpA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1206BorderBoxnbWgWpA(final boolean r20, final boolean r21, @org.jetbrains.annotations.NotNull final androidx.compose.foundation.interaction.InteractionSource r22, @org.jetbrains.annotations.NotNull final androidx.compose.material.TextFieldColors r23, @org.jetbrains.annotations.Nullable androidx.compose.ui.graphics.Shape r24, float r25, float r26, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r27, final int r28, final int r29) {
        /*
            Method dump skipped, instruction units count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldDefaults.m1206BorderBoxnbWgWpA(boolean, boolean, androidx.compose.foundation.interaction.InteractionSource, androidx.compose.material.TextFieldColors, androidx.compose.ui.graphics.Shape, float, float, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:213:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x013e  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material.ExperimentalMaterialApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OutlinedTextFieldDecorationBox(@org.jetbrains.annotations.NotNull final java.lang.String r69, @org.jetbrains.annotations.NotNull final sn.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, bn.r> r70, final boolean r71, final boolean r72, @org.jetbrains.annotations.NotNull final androidx.compose.ui.text.input.VisualTransformation r73, @org.jetbrains.annotations.NotNull final androidx.compose.foundation.interaction.InteractionSource r74, boolean r75, @org.jetbrains.annotations.Nullable sn.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, bn.r> r76, @org.jetbrains.annotations.Nullable sn.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, bn.r> r77, @org.jetbrains.annotations.Nullable sn.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, bn.r> r78, @org.jetbrains.annotations.Nullable sn.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, bn.r> r79, @org.jetbrains.annotations.Nullable androidx.compose.material.TextFieldColors r80, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.PaddingValues r81, @org.jetbrains.annotations.Nullable sn.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, bn.r> r82, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r83, final int r84, final int r85, final int r86) {
        /*
            Method dump skipped, instruction units count: 950
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox(java.lang.String, sn.p, boolean, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.interaction.InteractionSource, boolean, sn.p, sn.p, sn.p, sn.p, androidx.compose.material.TextFieldColors, androidx.compose.foundation.layout.PaddingValues, sn.p, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:201:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x013a  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material.ExperimentalMaterialApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void TextFieldDecorationBox(@org.jetbrains.annotations.NotNull final java.lang.String r72, @org.jetbrains.annotations.NotNull final sn.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, bn.r> r73, final boolean r74, final boolean r75, @org.jetbrains.annotations.NotNull final androidx.compose.ui.text.input.VisualTransformation r76, @org.jetbrains.annotations.NotNull final androidx.compose.foundation.interaction.InteractionSource r77, boolean r78, @org.jetbrains.annotations.Nullable sn.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, bn.r> r79, @org.jetbrains.annotations.Nullable sn.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, bn.r> r80, @org.jetbrains.annotations.Nullable sn.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, bn.r> r81, @org.jetbrains.annotations.Nullable sn.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, bn.r> r82, @org.jetbrains.annotations.Nullable androidx.compose.material.TextFieldColors r83, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.PaddingValues r84, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r85, final int r86, final int r87, final int r88) {
        /*
            Method dump skipped, instruction units count: 891
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldDefaults.TextFieldDecorationBox(java.lang.String, sn.p, boolean, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.interaction.InteractionSource, boolean, sn.p, sn.p, sn.p, sn.p, androidx.compose.material.TextFieldColors, androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: renamed from: getFocusedBorderThickness-D9Ej5fM, reason: not valid java name */
    public final float m1207getFocusedBorderThicknessD9Ej5fM() {
        return FocusedBorderThickness;
    }

    /* JADX INFO: renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m1208getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    /* JADX INFO: renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    public final float m1209getMinWidthD9Ej5fM() {
        return MinWidth;
    }

    @Composable
    @ReadOnlyComposable
    @NotNull
    public final Shape getOutlinedTextFieldShape(@Nullable Composer composer, int i10) {
        return MaterialTheme.INSTANCE.getShapes(composer, 6).getSmall();
    }

    @Composable
    @ReadOnlyComposable
    @NotNull
    public final Shape getTextFieldShape(@Nullable Composer composer, int i10) {
        return CornerBasedShape.copy$default(MaterialTheme.INSTANCE.getShapes(composer, 6).getSmall(), null, null, CornerSizeKt.getZeroCornerSize(), CornerSizeKt.getZeroCornerSize(), 3, null);
    }

    /* JADX INFO: renamed from: getUnfocusedBorderThickness-D9Ej5fM, reason: not valid java name */
    public final float m1210getUnfocusedBorderThicknessD9Ej5fM() {
        return UnfocusedBorderThickness;
    }

    @ExperimentalMaterialApi
    @NotNull
    /* JADX INFO: renamed from: indicatorLine-gv0btCI, reason: not valid java name */
    public final Modifier m1211indicatorLinegv0btCI(@NotNull Modifier modifier, final boolean z10, final boolean z11, @NotNull final InteractionSource interactionSource, @NotNull final TextFieldColors textFieldColors, final float f10, final float f11) {
        p.k(modifier, "$this$indicatorLine");
        p.k(interactionSource, "interactionSource");
        p.k(textFieldColors, "colors");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new l<InspectorInfo, r>() { // from class: androidx.compose.material.TextFieldDefaults$indicatorLine-gv0btCI$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("indicatorLine");
                inspectorInfo.getProperties().set("enabled", Boolean.valueOf(z10));
                inspectorInfo.getProperties().set("isError", Boolean.valueOf(z11));
                inspectorInfo.getProperties().set("interactionSource", interactionSource);
                inspectorInfo.getProperties().set("colors", textFieldColors);
                inspectorInfo.getProperties().set("focusedIndicatorLineThickness", Dp.m3824boximpl(f10));
                inspectorInfo.getProperties().set("unfocusedIndicatorLineThickness", Dp.m3824boximpl(f11));
            }
        } : InspectableValueKt.getNoInspectorInfo(), new q<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.material.TextFieldDefaults$indicatorLine$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier modifier2, @Nullable Composer composer, int i10) {
                p.k(modifier2, "$this$composed");
                composer.startReplaceableGroup(1398930845);
                Modifier modifierDrawIndicatorLine = TextFieldKt.drawIndicatorLine(Modifier.INSTANCE, (BorderStroke) TextFieldDefaultsKt.m1218animateBorderStrokeAsStateNuRrP5Q(z10, z11, interactionSource, textFieldColors, f10, f11, composer, 0).getValue());
                composer.endReplaceableGroup();
                return modifierDrawIndicatorLine;
            }

            @Override // sn.q
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }
        });
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: outlinedTextFieldColors-dx8h9Zs, reason: not valid java name */
    public final TextFieldColors m1212outlinedTextFieldColorsdx8h9Zs(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, @Nullable Composer composer, int i10, int i11, int i12, int i13) {
        composer.startReplaceableGroup(1762667317);
        long jM1618copywmQWz5c$default = (i13 & 1) != 0 ? Color.m1618copywmQWz5c$default(((Color) composer.consume(ContentColorKt.getLocalContentColor())).m1629unboximpl(), ((Number) composer.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null) : j10;
        long jM1618copywmQWz5c$default2 = (i13 & 2) != 0 ? Color.m1618copywmQWz5c$default(jM1618copywmQWz5c$default, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j11;
        long jM1654getTransparent0d7_KjU = (i13 & 4) != 0 ? Color.INSTANCE.m1654getTransparent0d7_KjU() : j12;
        long jM967getPrimary0d7_KjU = (i13 & 8) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m967getPrimary0d7_KjU() : j13;
        long jM961getError0d7_KjU = (i13 & 16) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m961getError0d7_KjU() : j14;
        long jM1618copywmQWz5c$default3 = (i13 & 32) != 0 ? Color.m1618copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m967getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j15;
        long jM1618copywmQWz5c$default4 = (i13 & 64) != 0 ? Color.m1618copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m966getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j16;
        long jM1618copywmQWz5c$default5 = (i13 & 128) != 0 ? Color.m1618copywmQWz5c$default(jM1618copywmQWz5c$default4, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j17;
        long jM961getError0d7_KjU2 = (i13 & 256) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m961getError0d7_KjU() : j18;
        long jM1618copywmQWz5c$default6 = (i13 & 512) != 0 ? Color.m1618copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m966getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j19;
        long jM1618copywmQWz5c$default7 = (i13 & 1024) != 0 ? Color.m1618copywmQWz5c$default(jM1618copywmQWz5c$default6, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j20;
        long j31 = (i13 & 2048) != 0 ? jM1618copywmQWz5c$default6 : j21;
        long jM1618copywmQWz5c$default8 = (i13 & 4096) != 0 ? Color.m1618copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m966getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j22;
        long jM1618copywmQWz5c$default9 = (i13 & 8192) != 0 ? Color.m1618copywmQWz5c$default(jM1618copywmQWz5c$default8, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j23;
        long jM961getError0d7_KjU3 = (i13 & 16384) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m961getError0d7_KjU() : j24;
        long jM1618copywmQWz5c$default10 = (32768 & i13) != 0 ? Color.m1618copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m967getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j25;
        long jM1618copywmQWz5c$default11 = (65536 & i13) != 0 ? Color.m1618copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m966getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j26;
        long jM1618copywmQWz5c$default12 = (131072 & i13) != 0 ? Color.m1618copywmQWz5c$default(jM1618copywmQWz5c$default11, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j27;
        long jM961getError0d7_KjU4 = (262144 & i13) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m961getError0d7_KjU() : j28;
        long jM1618copywmQWz5c$default13 = (524288 & i13) != 0 ? Color.m1618copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m966getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j29;
        DefaultTextFieldColors defaultTextFieldColors = new DefaultTextFieldColors(jM1618copywmQWz5c$default, jM1618copywmQWz5c$default2, jM967getPrimary0d7_KjU, jM961getError0d7_KjU, jM1618copywmQWz5c$default3, jM1618copywmQWz5c$default4, jM961getError0d7_KjU2, jM1618copywmQWz5c$default5, jM1618copywmQWz5c$default6, jM1618copywmQWz5c$default7, j31, jM1618copywmQWz5c$default8, jM1618copywmQWz5c$default9, jM961getError0d7_KjU3, jM1654getTransparent0d7_KjU, jM1618copywmQWz5c$default10, jM1618copywmQWz5c$default11, jM1618copywmQWz5c$default12, jM961getError0d7_KjU4, jM1618copywmQWz5c$default13, (i13 & 1048576) != 0 ? Color.m1618copywmQWz5c$default(jM1618copywmQWz5c$default13, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j30, null);
        composer.endReplaceableGroup();
        return defaultTextFieldColors;
    }

    @ExperimentalMaterialApi
    @NotNull
    /* JADX INFO: renamed from: outlinedTextFieldPadding-a9UjIt4, reason: not valid java name */
    public final PaddingValues m1213outlinedTextFieldPaddinga9UjIt4(float start, float top2, float end, float bottom) {
        return PaddingKt.m407PaddingValuesa9UjIt4(start, top2, end, bottom);
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: textFieldColors-dx8h9Zs, reason: not valid java name */
    public final TextFieldColors m1214textFieldColorsdx8h9Zs(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, @Nullable Composer composer, int i10, int i11, int i12, int i13) {
        composer.startReplaceableGroup(231892599);
        long jM1618copywmQWz5c$default = (i13 & 1) != 0 ? Color.m1618copywmQWz5c$default(((Color) composer.consume(ContentColorKt.getLocalContentColor())).m1629unboximpl(), ((Number) composer.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null) : j10;
        long jM1618copywmQWz5c$default2 = (i13 & 2) != 0 ? Color.m1618copywmQWz5c$default(jM1618copywmQWz5c$default, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j11;
        long jM1618copywmQWz5c$default3 = (i13 & 4) != 0 ? Color.m1618copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m966getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j12;
        long jM967getPrimary0d7_KjU = (i13 & 8) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m967getPrimary0d7_KjU() : j13;
        long jM961getError0d7_KjU = (i13 & 16) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m961getError0d7_KjU() : j14;
        long jM1618copywmQWz5c$default4 = (i13 & 32) != 0 ? Color.m1618copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m967getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j15;
        long jM1618copywmQWz5c$default5 = (i13 & 64) != 0 ? Color.m1618copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m966getOnSurface0d7_KjU(), 0.42f, 0.0f, 0.0f, 0.0f, 14, null) : j16;
        long jM1618copywmQWz5c$default6 = (i13 & 128) != 0 ? Color.m1618copywmQWz5c$default(jM1618copywmQWz5c$default5, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j17;
        long jM961getError0d7_KjU2 = (i13 & 256) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m961getError0d7_KjU() : j18;
        long jM1618copywmQWz5c$default7 = (i13 & 512) != 0 ? Color.m1618copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m966getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j19;
        long jM1618copywmQWz5c$default8 = (i13 & 1024) != 0 ? Color.m1618copywmQWz5c$default(jM1618copywmQWz5c$default7, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j20;
        long j31 = (i13 & 2048) != 0 ? jM1618copywmQWz5c$default7 : j21;
        long jM1618copywmQWz5c$default9 = (i13 & 4096) != 0 ? Color.m1618copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m966getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j22;
        long jM1618copywmQWz5c$default10 = (i13 & 8192) != 0 ? Color.m1618copywmQWz5c$default(jM1618copywmQWz5c$default9, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j23;
        long jM961getError0d7_KjU3 = (i13 & 16384) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m961getError0d7_KjU() : j24;
        long jM1618copywmQWz5c$default11 = (32768 & i13) != 0 ? Color.m1618copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m967getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j25;
        long jM1618copywmQWz5c$default12 = (65536 & i13) != 0 ? Color.m1618copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m966getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j26;
        long jM1618copywmQWz5c$default13 = (131072 & i13) != 0 ? Color.m1618copywmQWz5c$default(jM1618copywmQWz5c$default12, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j27;
        long jM961getError0d7_KjU4 = (262144 & i13) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m961getError0d7_KjU() : j28;
        long jM1618copywmQWz5c$default14 = (524288 & i13) != 0 ? Color.m1618copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m966getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j29;
        DefaultTextFieldColors defaultTextFieldColors = new DefaultTextFieldColors(jM1618copywmQWz5c$default, jM1618copywmQWz5c$default2, jM967getPrimary0d7_KjU, jM961getError0d7_KjU, jM1618copywmQWz5c$default4, jM1618copywmQWz5c$default5, jM961getError0d7_KjU2, jM1618copywmQWz5c$default6, jM1618copywmQWz5c$default7, jM1618copywmQWz5c$default8, j31, jM1618copywmQWz5c$default9, jM1618copywmQWz5c$default10, jM961getError0d7_KjU3, jM1618copywmQWz5c$default3, jM1618copywmQWz5c$default11, jM1618copywmQWz5c$default12, jM1618copywmQWz5c$default13, jM961getError0d7_KjU4, jM1618copywmQWz5c$default14, (i13 & 1048576) != 0 ? Color.m1618copywmQWz5c$default(jM1618copywmQWz5c$default14, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j30, null);
        composer.endReplaceableGroup();
        return defaultTextFieldColors;
    }

    @ExperimentalMaterialApi
    @NotNull
    /* JADX INFO: renamed from: textFieldWithLabelPadding-a9UjIt4, reason: not valid java name */
    public final PaddingValues m1215textFieldWithLabelPaddinga9UjIt4(float start, float end, float top2, float bottom) {
        return PaddingKt.m407PaddingValuesa9UjIt4(start, top2, end, bottom);
    }

    @ExperimentalMaterialApi
    @NotNull
    /* JADX INFO: renamed from: textFieldWithoutLabelPadding-a9UjIt4, reason: not valid java name */
    public final PaddingValues m1216textFieldWithoutLabelPaddinga9UjIt4(float start, float top2, float end, float bottom) {
        return PaddingKt.m407PaddingValuesa9UjIt4(start, top2, end, bottom);
    }
}
