package androidx.compose.material;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import bn.r;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.a;
import sn.l;
import sn.p;
import sn.q;
import vn.c;
import zn.n;

/* JADX INFO: compiled from: OutlinedTextField.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u0000¤\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0089\u0002\u0010\"\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\b\b\u0002\u0010\u0012\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00072\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010!\u001a\u00020 H\u0007¢\u0006\u0004\b\"\u0010#\u001a\u0089\u0002\u0010\"\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020$2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\b\b\u0002\u0010\u0012\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00072\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010!\u001a\u00020 H\u0007¢\u0006\u0004\b\"\u0010%\u001aÆ\u0001\u00100\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0011\u0010&\u001a\r\u0012\u0004\u0012\u00020\u00030\f¢\u0006\u0002\b\r2\u0019\u0010\u000f\u001a\u0015\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\r2\u0013\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0013\u0010'\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0013\u0010(\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010*\u001a\u00020)2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u00030\u00022\u0011\u0010-\u001a\r\u0012\u0004\u0012\u00020\u00030\f¢\u0006\u0002\b\r2\u0006\u0010/\u001a\u00020.H\u0001ø\u0001\u0000¢\u0006\u0004\b0\u00101\u001aE\u0010;\u001a\u00020\u001a2\u0006\u00102\u001a\u00020\u001a2\u0006\u00103\u001a\u00020\u001a2\u0006\u00104\u001a\u00020\u001a2\u0006\u00105\u001a\u00020\u001a2\u0006\u00106\u001a\u00020\u001a2\u0006\u00108\u001a\u000207H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b9\u0010:\u001aU\u0010D\u001a\u00020\u001a2\u0006\u0010<\u001a\u00020\u001a2\u0006\u0010=\u001a\u00020\u001a2\u0006\u0010>\u001a\u00020\u001a2\u0006\u0010?\u001a\u00020\u001a2\u0006\u0010@\u001a\u00020\u001a2\u0006\u00108\u001a\u0002072\u0006\u0010A\u001a\u00020)2\u0006\u0010/\u001a\u00020.H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bB\u0010C\u001a|\u0010Q\u001a\u00020\u0003*\u00020E2\u0006\u0010F\u001a\u00020\u001a2\u0006\u0010G\u001a\u00020\u001a2\b\u0010I\u001a\u0004\u0018\u00010H2\b\u0010J\u001a\u0004\u0018\u00010H2\u0006\u0010K\u001a\u00020H2\b\u0010L\u001a\u0004\u0018\u00010H2\b\u0010M\u001a\u0004\u0018\u00010H2\u0006\u0010N\u001a\u00020H2\u0006\u0010*\u001a\u00020)2\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010A\u001a\u00020)2\u0006\u0010P\u001a\u00020O2\u0006\u0010/\u001a\u00020.H\u0002\u001a)\u0010U\u001a\u00020\u0005*\u00020\u00052\u0006\u0010R\u001a\u00020+2\u0006\u0010/\u001a\u00020.H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bS\u0010T\"\u0017\u0010W\u001a\u00020V8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\bW\u0010X\"\u001d\u0010Y\u001a\u00020V8\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\bY\u0010X\u001a\u0004\bZ\u0010[\"\u0014\u0010\\\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\\\u0010]\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006^"}, d2 = {"", "value", "Lkotlin/Function1;", "Lbn/r;", "onValueChange", "Landroidx/compose/ui/Modifier;", "modifier", "", "enabled", "readOnly", "Landroidx/compose/ui/text/TextStyle;", "textStyle", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "label", "placeholder", "leadingIcon", "trailingIcon", "isError", "Landroidx/compose/ui/text/input/VisualTransformation;", "visualTransformation", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardActions;", "keyboardActions", "singleLine", "", "maxLines", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/material/TextFieldColors;", "colors", "OutlinedTextField", "(Ljava/lang/String;Lsn/l;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lsn/p;Lsn/p;Lsn/p;Lsn/p;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/ui/text/input/TextFieldValue;", "(Landroidx/compose/ui/text/input/TextFieldValue;Lsn/l;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lsn/p;Lsn/p;Lsn/p;Lsn/p;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "textField", "leading", "trailing", "", "animationProgress", "Landroidx/compose/ui/geometry/Size;", "onLabelMeasured", OutlinedTextFieldKt.BorderId, "Landroidx/compose/foundation/layout/PaddingValues;", "paddingValues", "OutlinedTextFieldLayout", "(Landroidx/compose/ui/Modifier;Lsn/p;Lsn/q;Lsn/p;Lsn/p;Lsn/p;ZFLsn/l;Lsn/p;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;II)V", "leadingPlaceableWidth", "trailingPlaceableWidth", "textFieldPlaceableWidth", "labelPlaceableWidth", "placeholderPlaceableWidth", "Landroidx/compose/ui/unit/Constraints;", "constraints", "calculateWidth-VsPV1Ek", "(IIIIIJ)I", "calculateWidth", "leadingPlaceableHeight", "trailingPlaceableHeight", "textFieldPlaceableHeight", "labelPlaceableHeight", "placeholderPlaceableHeight", "density", "calculateHeight-zUg2_y0", "(IIIIIJFLandroidx/compose/foundation/layout/PaddingValues;)I", "calculateHeight", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "height", "width", "Landroidx/compose/ui/layout/Placeable;", "leadingPlaceable", "trailingPlaceable", "textFieldPlaceable", "labelPlaceable", "placeholderPlaceable", "borderPlaceable", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "place", "labelSize", "outlineCutout-12SF9DM", "(Landroidx/compose/ui/Modifier;JLandroidx/compose/foundation/layout/PaddingValues;)Landroidx/compose/ui/Modifier;", "outlineCutout", "Landroidx/compose/ui/unit/Dp;", "OutlinedTextFieldInnerPadding", "F", "OutlinedTextFieldTopPadding", "getOutlinedTextFieldTopPadding", "()F", "BorderId", "Ljava/lang/String;", "material_release"}, k = 2, mv = {1, 6, 0})
public final class OutlinedTextFieldKt {

    @NotNull
    public static final String BorderId = "border";
    private static final float OutlinedTextFieldInnerPadding = Dp.m3826constructorimpl(4);
    private static final float OutlinedTextFieldTopPadding = Dp.m3826constructorimpl(8);

    /* JADX WARN: Removed duplicated region for block: B:107:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x05ca  */
    /* JADX WARN: Removed duplicated region for block: B:305:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0135  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void OutlinedTextField(@org.jetbrains.annotations.NotNull final androidx.compose.ui.text.input.TextFieldValue r70, @org.jetbrains.annotations.NotNull final sn.l<? super androidx.compose.ui.text.input.TextFieldValue, bn.r> r71, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r72, boolean r73, boolean r74, @org.jetbrains.annotations.Nullable androidx.compose.ui.text.TextStyle r75, @org.jetbrains.annotations.Nullable sn.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, bn.r> r76, @org.jetbrains.annotations.Nullable sn.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, bn.r> r77, @org.jetbrains.annotations.Nullable sn.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, bn.r> r78, @org.jetbrains.annotations.Nullable sn.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, bn.r> r79, boolean r80, @org.jetbrains.annotations.Nullable androidx.compose.ui.text.input.VisualTransformation r81, @org.jetbrains.annotations.Nullable androidx.compose.foundation.text.KeyboardOptions r82, @org.jetbrains.annotations.Nullable androidx.compose.foundation.text.KeyboardActions r83, boolean r84, int r85, @org.jetbrains.annotations.Nullable androidx.compose.foundation.interaction.MutableInteractionSource r86, @org.jetbrains.annotations.Nullable androidx.compose.ui.graphics.Shape r87, @org.jetbrains.annotations.Nullable androidx.compose.material.TextFieldColors r88, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r89, final int r90, final int r91, final int r92) {
        /*
            Method dump skipped, instruction units count: 1510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.OutlinedTextFieldKt.OutlinedTextField(androidx.compose.ui.text.input.TextFieldValue, sn.l, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, sn.p, sn.p, sn.p, sn.p, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material.TextFieldColors, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:305:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0135  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void OutlinedTextField(@org.jetbrains.annotations.NotNull final java.lang.String r70, @org.jetbrains.annotations.NotNull final sn.l<? super java.lang.String, bn.r> r71, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r72, boolean r73, boolean r74, @org.jetbrains.annotations.Nullable androidx.compose.ui.text.TextStyle r75, @org.jetbrains.annotations.Nullable sn.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, bn.r> r76, @org.jetbrains.annotations.Nullable sn.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, bn.r> r77, @org.jetbrains.annotations.Nullable sn.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, bn.r> r78, @org.jetbrains.annotations.Nullable sn.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, bn.r> r79, boolean r80, @org.jetbrains.annotations.Nullable androidx.compose.ui.text.input.VisualTransformation r81, @org.jetbrains.annotations.Nullable androidx.compose.foundation.text.KeyboardOptions r82, @org.jetbrains.annotations.Nullable androidx.compose.foundation.text.KeyboardActions r83, boolean r84, int r85, @org.jetbrains.annotations.Nullable androidx.compose.foundation.interaction.MutableInteractionSource r86, @org.jetbrains.annotations.Nullable androidx.compose.ui.graphics.Shape r87, @org.jetbrains.annotations.Nullable androidx.compose.material.TextFieldColors r88, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r89, final int r90, final int r91, final int r92) {
        /*
            Method dump skipped, instruction units count: 1481
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.OutlinedTextFieldKt.OutlinedTextField(java.lang.String, sn.l, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, sn.p, sn.p, sn.p, sn.p, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material.TextFieldColors, androidx.compose.runtime.Composer, int, int, int):void");
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void OutlinedTextFieldLayout(@NotNull final Modifier modifier, @NotNull final p<? super Composer, ? super Integer, r> pVar, @Nullable final q<? super Modifier, ? super Composer, ? super Integer, r> qVar, @Nullable final p<? super Composer, ? super Integer, r> pVar2, @Nullable final p<? super Composer, ? super Integer, r> pVar3, @Nullable final p<? super Composer, ? super Integer, r> pVar4, final boolean z10, final float f10, @NotNull final l<? super Size, r> lVar, @NotNull final p<? super Composer, ? super Integer, r> pVar5, @NotNull final PaddingValues paddingValues, @Nullable Composer composer, final int i10, final int i11) {
        int i12;
        tn.p.k(modifier, "modifier");
        tn.p.k(pVar, "textField");
        tn.p.k(lVar, "onLabelMeasured");
        tn.p.k(pVar5, BorderId);
        tn.p.k(paddingValues, "paddingValues");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2049536174);
        int i13 = (i10 & 14) == 0 ? (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i10 : i10;
        if ((i10 & 112) == 0) {
            i13 |= composerStartRestartGroup.changed(pVar) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i13 |= composerStartRestartGroup.changed(qVar) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i13 |= composerStartRestartGroup.changed(pVar2) ? 2048 : 1024;
        }
        if ((57344 & i10) == 0) {
            i13 |= composerStartRestartGroup.changed(pVar3) ? 16384 : 8192;
        }
        if ((458752 & i10) == 0) {
            i13 |= composerStartRestartGroup.changed(pVar4) ? 131072 : 65536;
        }
        if ((3670016 & i10) == 0) {
            i13 |= composerStartRestartGroup.changed(z10) ? 1048576 : 524288;
        }
        if ((29360128 & i10) == 0) {
            i13 |= composerStartRestartGroup.changed(f10) ? 8388608 : 4194304;
        }
        if ((234881024 & i10) == 0) {
            i13 |= composerStartRestartGroup.changed(lVar) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((1879048192 & i10) == 0) {
            i13 |= composerStartRestartGroup.changed(pVar5) ? 536870912 : 268435456;
        }
        int i14 = (i11 & 14) == 0 ? i11 | (composerStartRestartGroup.changed(paddingValues) ? 4 : 2) : i11;
        if ((i13 & 1533916891) == 306783378 && (i14 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            Object[] objArr = {lVar, Boolean.valueOf(z10), Float.valueOf(f10), paddingValues};
            composerStartRestartGroup.startReplaceableGroup(-568225417);
            int i15 = 0;
            boolean zChanged = false;
            for (int i16 = 4; i15 < i16; i16 = 4) {
                zChanged |= composerStartRestartGroup.changed(objArr[i15]);
                i15++;
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new OutlinedTextFieldMeasurePolicy(lVar, z10, f10, paddingValues);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            OutlinedTextFieldMeasurePolicy outlinedTextFieldMeasurePolicy = (OutlinedTextFieldMeasurePolicy) objRememberedValue;
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            a<ComposeUiNode> constructor = companion.getConstructor();
            q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r> qVarMaterializerOf = LayoutKt.materializerOf(modifier);
            int i17 = ((((i13 << 3) & 112) << 9) & 7168) | 6;
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM1274constructorimpl = Updater.m1274constructorimpl(composerStartRestartGroup);
            Updater.m1281setimpl(composerM1274constructorimpl, outlinedTextFieldMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m1281setimpl(composerM1274constructorimpl, density, companion.getSetDensity());
            Updater.m1281setimpl(composerM1274constructorimpl, layoutDirection2, companion.getSetLayoutDirection());
            Updater.m1281setimpl(composerM1274constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            qVarMaterializerOf.invoke(SkippableUpdater.m1264boximpl(SkippableUpdater.m1265constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i17 >> 3) & 112));
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            composerStartRestartGroup.startReplaceableGroup(118153609);
            if (((i17 >> 9) & 14 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
            } else {
                pVar5.mo2invoke(composerStartRestartGroup, Integer.valueOf((i13 >> 27) & 14));
                composerStartRestartGroup.startReplaceableGroup(1169914108);
                if (pVar3 != null) {
                    Modifier modifierThen = LayoutIdKt.layoutId(Modifier.INSTANCE, TextFieldImplKt.LeadingId).then(TextFieldImplKt.getIconDefaultSizeModifier());
                    Alignment center = Alignment.INSTANCE.getCenter();
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection3 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration2 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    a<ComposeUiNode> constructor2 = companion.getConstructor();
                    q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r> qVarMaterializerOf2 = LayoutKt.materializerOf(modifierThen);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerStartRestartGroup.disableReusing();
                    Composer composerM1274constructorimpl2 = Updater.m1274constructorimpl(composerStartRestartGroup);
                    Updater.m1281setimpl(composerM1274constructorimpl2, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m1281setimpl(composerM1274constructorimpl2, density2, companion.getSetDensity());
                    Updater.m1281setimpl(composerM1274constructorimpl2, layoutDirection3, companion.getSetLayoutDirection());
                    Updater.m1281setimpl(composerM1274constructorimpl2, viewConfiguration2, companion.getSetViewConfiguration());
                    composerStartRestartGroup.enableReusing();
                    qVarMaterializerOf2.invoke(SkippableUpdater.m1264boximpl(SkippableUpdater.m1265constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    composerStartRestartGroup.startReplaceableGroup(-2137368960);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(1691709354);
                    pVar3.mo2invoke(composerStartRestartGroup, Integer.valueOf((i13 >> 12) & 14));
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(1169914393);
                if (pVar4 != null) {
                    Modifier modifierThen2 = LayoutIdKt.layoutId(Modifier.INSTANCE, TextFieldImplKt.TrailingId).then(TextFieldImplKt.getIconDefaultSizeModifier());
                    Alignment center2 = Alignment.INSTANCE.getCenter();
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    Density density3 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection4 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration3 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    a<ComposeUiNode> constructor3 = companion.getConstructor();
                    q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r> qVarMaterializerOf3 = LayoutKt.materializerOf(modifierThen2);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor3);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerStartRestartGroup.disableReusing();
                    Composer composerM1274constructorimpl3 = Updater.m1274constructorimpl(composerStartRestartGroup);
                    Updater.m1281setimpl(composerM1274constructorimpl3, measurePolicyRememberBoxMeasurePolicy2, companion.getSetMeasurePolicy());
                    Updater.m1281setimpl(composerM1274constructorimpl3, density3, companion.getSetDensity());
                    Updater.m1281setimpl(composerM1274constructorimpl3, layoutDirection4, companion.getSetLayoutDirection());
                    Updater.m1281setimpl(composerM1274constructorimpl3, viewConfiguration3, companion.getSetViewConfiguration());
                    composerStartRestartGroup.enableReusing();
                    qVarMaterializerOf3.invoke(SkippableUpdater.m1264boximpl(SkippableUpdater.m1265constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    composerStartRestartGroup.startReplaceableGroup(-2137368960);
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(-1351586719);
                    pVar4.mo2invoke(composerStartRestartGroup, Integer.valueOf((i13 >> 15) & 14));
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                }
                composerStartRestartGroup.endReplaceableGroup();
                float fCalculateStartPadding = PaddingKt.calculateStartPadding(paddingValues, layoutDirection);
                float fCalculateEndPadding = PaddingKt.calculateEndPadding(paddingValues, layoutDirection);
                Modifier.Companion companion2 = Modifier.INSTANCE;
                if (pVar3 != null) {
                    i12 = 0;
                    fCalculateStartPadding = Dp.m3826constructorimpl(n.d(Dp.m3826constructorimpl(fCalculateStartPadding - TextFieldImplKt.getHorizontalIconPadding()), Dp.m3826constructorimpl(0)));
                } else {
                    i12 = 0;
                }
                float f11 = fCalculateStartPadding;
                if (pVar4 != null) {
                    fCalculateEndPadding = Dp.m3826constructorimpl(n.d(Dp.m3826constructorimpl(fCalculateEndPadding - TextFieldImplKt.getHorizontalIconPadding()), Dp.m3826constructorimpl(i12)));
                }
                Modifier modifierM415paddingqDBjuR0$default = PaddingKt.m415paddingqDBjuR0$default(companion2, f11, 0.0f, fCalculateEndPadding, 0.0f, 10, null);
                composerStartRestartGroup.startReplaceableGroup(1169915404);
                if (qVar != null) {
                    qVar.invoke(LayoutIdKt.layoutId(companion2, TextFieldImplKt.PlaceholderId).then(modifierM415paddingqDBjuR0$default), composerStartRestartGroup, Integer.valueOf((i13 >> 3) & 112));
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierThen3 = LayoutIdKt.layoutId(companion2, TextFieldImplKt.TextFieldId).then(modifierM415paddingqDBjuR0$default);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                Alignment.Companion companion3 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), true, composerStartRestartGroup, 48);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density4 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection5 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration4 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                a<ComposeUiNode> constructor4 = companion.getConstructor();
                q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r> qVarMaterializerOf4 = LayoutKt.materializerOf(modifierThen3);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor4);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM1274constructorimpl4 = Updater.m1274constructorimpl(composerStartRestartGroup);
                Updater.m1281setimpl(composerM1274constructorimpl4, measurePolicyRememberBoxMeasurePolicy3, companion.getSetMeasurePolicy());
                Updater.m1281setimpl(composerM1274constructorimpl4, density4, companion.getSetDensity());
                Updater.m1281setimpl(composerM1274constructorimpl4, layoutDirection5, companion.getSetLayoutDirection());
                Updater.m1281setimpl(composerM1274constructorimpl4, viewConfiguration4, companion.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                qVarMaterializerOf4.invoke(SkippableUpdater.m1264boximpl(SkippableUpdater.m1265constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                composerStartRestartGroup.startReplaceableGroup(-2137368960);
                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(-1205597937);
                pVar.mo2invoke(composerStartRestartGroup, Integer.valueOf((i13 >> 3) & 14));
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (pVar2 != null) {
                    Modifier modifierLayoutId = LayoutIdKt.layoutId(companion2, TextFieldImplKt.LabelId);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    Density density5 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection6 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration5 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    a<ComposeUiNode> constructor5 = companion.getConstructor();
                    q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r> qVarMaterializerOf5 = LayoutKt.materializerOf(modifierLayoutId);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor5);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerStartRestartGroup.disableReusing();
                    Composer composerM1274constructorimpl5 = Updater.m1274constructorimpl(composerStartRestartGroup);
                    Updater.m1281setimpl(composerM1274constructorimpl5, measurePolicyRememberBoxMeasurePolicy4, companion.getSetMeasurePolicy());
                    Updater.m1281setimpl(composerM1274constructorimpl5, density5, companion.getSetDensity());
                    Updater.m1281setimpl(composerM1274constructorimpl5, layoutDirection6, companion.getSetLayoutDirection());
                    Updater.m1281setimpl(composerM1274constructorimpl5, viewConfiguration5, companion.getSetViewConfiguration());
                    composerStartRestartGroup.enableReusing();
                    qVarMaterializerOf5.invoke(SkippableUpdater.m1264boximpl(SkippableUpdater.m1265constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    composerStartRestartGroup.startReplaceableGroup(-2137368960);
                    composerStartRestartGroup.startReplaceableGroup(-55131805);
                    pVar2.mo2invoke(composerStartRestartGroup, Integer.valueOf((i13 >> 9) & 14));
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                }
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new p<Composer, Integer, r>() { // from class: androidx.compose.material.OutlinedTextFieldKt.OutlinedTextFieldLayout.2
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

            public final void invoke(@Nullable Composer composer2, int i18) {
                OutlinedTextFieldKt.OutlinedTextFieldLayout(modifier, pVar, qVar, pVar2, pVar3, pVar4, z10, f10, lVar, pVar5, paddingValues, composer2, i10 | 1, i11);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: calculateHeight-zUg2_y0, reason: not valid java name */
    public static final int m1100calculateHeightzUg2_y0(int i10, int i11, int i12, int i13, int i14, long j10, float f10, PaddingValues paddingValues) {
        return Math.max(Constraints.m3783getMinHeightimpl(j10), Math.max(i10, Math.max(i11, c.d(Math.max(i12, i14) + (paddingValues.getBottom() * f10) + Math.max(paddingValues.getTop() * f10, i13 / 2.0f)))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: calculateWidth-VsPV1Ek, reason: not valid java name */
    public static final int m1101calculateWidthVsPV1Ek(int i10, int i11, int i12, int i13, int i14, long j10) {
        return Math.max(i10 + Math.max(i12, Math.max(i13, i14)) + i11, Constraints.m3784getMinWidthimpl(j10));
    }

    public static final float getOutlinedTextFieldTopPadding() {
        return OutlinedTextFieldTopPadding;
    }

    @NotNull
    /* JADX INFO: renamed from: outlineCutout-12SF9DM, reason: not valid java name */
    public static final Modifier m1102outlineCutout12SF9DM(@NotNull Modifier modifier, final long j10, @NotNull final PaddingValues paddingValues) {
        tn.p.k(modifier, "$this$outlineCutout");
        tn.p.k(paddingValues, "paddingValues");
        return DrawModifierKt.drawWithContent(modifier, new l<ContentDrawScope, r>() { // from class: androidx.compose.material.OutlinedTextFieldKt$outlineCutout$1

            /* JADX INFO: compiled from: OutlinedTextField.kt */
            @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[LayoutDirection.values().length];
                    iArr[LayoutDirection.Rtl.ordinal()] = 1;
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(ContentDrawScope contentDrawScope) {
                invoke2(contentDrawScope);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull ContentDrawScope contentDrawScope) {
                tn.p.k(contentDrawScope, "$this$drawWithContent");
                float fM1452getWidthimpl = Size.m1452getWidthimpl(j10);
                if (fM1452getWidthimpl <= 0.0f) {
                    contentDrawScope.drawContent();
                    return;
                }
                float fMo306toPx0680j_4 = contentDrawScope.mo306toPx0680j_4(OutlinedTextFieldKt.OutlinedTextFieldInnerPadding);
                float fMo306toPx0680j_42 = contentDrawScope.mo306toPx0680j_4(paddingValues.mo392calculateLeftPaddingu2uoSUM(contentDrawScope.getLayoutDirection())) - fMo306toPx0680j_4;
                float f10 = 2;
                float fM1452getWidthimpl2 = fM1452getWidthimpl + fMo306toPx0680j_42 + (fMo306toPx0680j_4 * f10);
                LayoutDirection layoutDirection = contentDrawScope.getLayoutDirection();
                int[] iArr = WhenMappings.$EnumSwitchMapping$0;
                float fM1452getWidthimpl3 = iArr[layoutDirection.ordinal()] == 1 ? Size.m1452getWidthimpl(contentDrawScope.mo2113getSizeNHjbRc()) - fM1452getWidthimpl2 : n.d(fMo306toPx0680j_42, 0.0f);
                if (iArr[contentDrawScope.getLayoutDirection().ordinal()] == 1) {
                    fM1452getWidthimpl2 = Size.m1452getWidthimpl(contentDrawScope.mo2113getSizeNHjbRc()) - n.d(fMo306toPx0680j_42, 0.0f);
                }
                float f11 = fM1452getWidthimpl2;
                float fM1449getHeightimpl = Size.m1449getHeightimpl(j10);
                float f12 = (-fM1449getHeightimpl) / f10;
                float f13 = fM1449getHeightimpl / f10;
                int iM1607getDifferencertfAjoo = ClipOp.INSTANCE.m1607getDifferencertfAjoo();
                DrawContext drawContext = contentDrawScope.getDrawContext();
                long jMo2038getSizeNHjbRc = drawContext.mo2038getSizeNHjbRc();
                drawContext.getCanvas().save();
                drawContext.getTransform().mo2041clipRectN_I0leg(fM1452getWidthimpl3, f12, f11, f13, iM1607getDifferencertfAjoo);
                contentDrawScope.drawContent();
                drawContext.getCanvas().restore();
                drawContext.mo2039setSizeuvyYCjk(jMo2038getSizeNHjbRc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void place(Placeable.PlacementScope placementScope, int i10, int i11, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, float f10, boolean z10, float f11, LayoutDirection layoutDirection, PaddingValues paddingValues) {
        int iD = c.d(paddingValues.getTop() * f11);
        int iD2 = c.d(PaddingKt.calculateStartPadding(paddingValues, layoutDirection) * f11);
        float horizontalIconPadding = TextFieldImplKt.getHorizontalIconPadding() * f11;
        if (placeable != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, Alignment.INSTANCE.getCenterVertically().align(placeable.getHeight(), i10), 0.0f, 4, null);
        }
        if (placeable2 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, i11 - placeable2.getWidth(), Alignment.INSTANCE.getCenterVertically().align(placeable2.getHeight(), i10), 0.0f, 4, null);
        }
        if (placeable4 != null) {
            float f12 = 1 - f10;
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, c.d(placeable == null ? 0.0f : f12 * (TextFieldImplKt.widthOrZero(placeable) - horizontalIconPadding)) + iD2, c.d(((z10 ? Alignment.INSTANCE.getCenterVertically().align(placeable4.getHeight(), i10) : iD) * f12) - ((placeable4.getHeight() / 2) * f10)), 0.0f, 4, null);
        }
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, TextFieldImplKt.widthOrZero(placeable), Math.max(z10 ? Alignment.INSTANCE.getCenterVertically().align(placeable3.getHeight(), i10) : iD, TextFieldImplKt.heightOrZero(placeable4) / 2), 0.0f, 4, null);
        if (placeable5 != null) {
            if (z10) {
                iD = Alignment.INSTANCE.getCenterVertically().align(placeable5.getHeight(), i10);
            }
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable5, TextFieldImplKt.widthOrZero(placeable), iD, 0.0f, 4, null);
        }
        Placeable.PlacementScope.m3154place70tqf50$default(placementScope, placeable6, IntOffset.INSTANCE.m3954getZeronOccac(), 0.0f, 2, null);
    }
}
