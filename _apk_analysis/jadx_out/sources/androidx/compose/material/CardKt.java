package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.unit.Dp;
import bn.r;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.a;
import sn.p;

/* JADX INFO: compiled from: Card.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001af\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0088\u0001\u0010\u0011\u001a\u00020\f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0016\u001a\u00020\u00152\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a¬\u0001\u0010\u0011\u001a\u00020\f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 \u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006!"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/graphics/Color;", "backgroundColor", "contentColor", "Landroidx/compose/foundation/BorderStroke;", OutlinedTextFieldKt.BorderId, "Landroidx/compose/ui/unit/Dp;", "elevation", "Lkotlin/Function0;", "Lbn/r;", "Landroidx/compose/runtime/Composable;", "content", "Card-F-jzlyU", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLsn/p;Landroidx/compose/runtime/Composer;II)V", "Card", "onClick", "", "enabled", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Card-LPr_se0", "(Lsn/a;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Lsn/p;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/Indication;", "indication", "", "onClickLabel", "Landroidx/compose/ui/semantics/Role;", "role", "Card-9VG74zQ", "(Lsn/a;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/Indication;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lsn/p;Landroidx/compose/runtime/Composer;III)V", "material_release"}, k = 2, mv = {1, 6, 0})
public final class CardKt {
    @Composable
    @ExperimentalMaterialApi
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: Card-9VG74zQ, reason: not valid java name */
    public static final void m929Card9VG74zQ(@NotNull a<r> aVar, @Nullable Modifier modifier, @Nullable Shape shape, long j10, long j11, @Nullable BorderStroke borderStroke, float f10, @Nullable MutableInteractionSource mutableInteractionSource, @Nullable Indication indication, boolean z10, @Nullable String str, @Nullable Role role, @NotNull p<? super Composer, ? super Integer, r> pVar, @Nullable Composer composer, int i10, int i11, int i12) {
        MutableInteractionSource mutableInteractionSource2;
        tn.p.k(aVar, "onClick");
        tn.p.k(pVar, "content");
        composer.startReplaceableGroup(1353606722);
        Modifier modifier2 = (i12 & 2) != 0 ? Modifier.INSTANCE : modifier;
        Shape medium = (i12 & 4) != 0 ? MaterialTheme.INSTANCE.getShapes(composer, 6).getMedium() : shape;
        long jM971getSurface0d7_KjU = (i12 & 8) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m971getSurface0d7_KjU() : j10;
        long jM985contentColorForek8zF_U = (i12 & 16) != 0 ? ColorsKt.m985contentColorForek8zF_U(jM971getSurface0d7_KjU, composer, (i10 >> 9) & 14) : j11;
        BorderStroke borderStroke2 = (i12 & 32) != 0 ? null : borderStroke;
        float fM3826constructorimpl = (i12 & 64) != 0 ? Dp.m3826constructorimpl(1) : f10;
        if ((i12 & 128) != 0) {
            composer.startReplaceableGroup(-492369756);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceableGroup();
            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
        } else {
            mutableInteractionSource2 = mutableInteractionSource;
        }
        SurfaceKt.m1162Surface9VG74zQ(aVar, modifier2, medium, jM971getSurface0d7_KjU, jM985contentColorForek8zF_U, borderStroke2, fM3826constructorimpl, mutableInteractionSource2, (i12 & 256) != 0 ? (Indication) composer.consume(IndicationKt.getLocalIndication()) : indication, (i12 & 512) != 0 ? true : z10, (i12 & 1024) != 0 ? null : str, (i12 & 2048) != 0 ? null : role, pVar, composer, (i10 & 14) | (i10 & 112) | (i10 & 896) | (i10 & 7168) | (57344 & i10) | (458752 & i10) | (3670016 & i10) | (29360128 & i10) | (234881024 & i10) | (i10 & 1879048192), (i11 & 14) | (i11 & 112) | (i11 & 896), 0);
        composer.endReplaceableGroup();
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: Card-F-jzlyU, reason: not valid java name */
    public static final void m930CardFjzlyU(@Nullable Modifier modifier, @Nullable Shape shape, long j10, long j11, @Nullable BorderStroke borderStroke, float f10, @NotNull p<? super Composer, ? super Integer, r> pVar, @Nullable Composer composer, int i10, int i11) {
        tn.p.k(pVar, "content");
        composer.startReplaceableGroup(1956755640);
        Modifier modifier2 = (i11 & 1) != 0 ? Modifier.INSTANCE : modifier;
        Shape medium = (i11 & 2) != 0 ? MaterialTheme.INSTANCE.getShapes(composer, 6).getMedium() : shape;
        long jM971getSurface0d7_KjU = (i11 & 4) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m971getSurface0d7_KjU() : j10;
        SurfaceKt.m1163SurfaceFjzlyU(modifier2, medium, jM971getSurface0d7_KjU, (i11 & 8) != 0 ? ColorsKt.m985contentColorForek8zF_U(jM971getSurface0d7_KjU, composer, (i10 >> 6) & 14) : j11, (i11 & 16) != 0 ? null : borderStroke, (i11 & 32) != 0 ? Dp.m3826constructorimpl(1) : f10, pVar, composer, (i10 & 14) | (i10 & 112) | (i10 & 896) | (i10 & 7168) | (57344 & i10) | (458752 & i10) | (i10 & 3670016), 0);
        composer.endReplaceableGroup();
    }

    @Composable
    @ExperimentalMaterialApi
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: Card-LPr_se0, reason: not valid java name */
    public static final void m931CardLPr_se0(@NotNull a<r> aVar, @Nullable Modifier modifier, boolean z10, @Nullable Shape shape, long j10, long j11, @Nullable BorderStroke borderStroke, float f10, @Nullable MutableInteractionSource mutableInteractionSource, @NotNull p<? super Composer, ? super Integer, r> pVar, @Nullable Composer composer, int i10, int i11) {
        MutableInteractionSource mutableInteractionSource2;
        tn.p.k(aVar, "onClick");
        tn.p.k(pVar, "content");
        composer.startReplaceableGroup(778538979);
        Modifier modifier2 = (i11 & 2) != 0 ? Modifier.INSTANCE : modifier;
        boolean z11 = (i11 & 4) != 0 ? true : z10;
        Shape medium = (i11 & 8) != 0 ? MaterialTheme.INSTANCE.getShapes(composer, 6).getMedium() : shape;
        long jM971getSurface0d7_KjU = (i11 & 16) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m971getSurface0d7_KjU() : j10;
        long jM985contentColorForek8zF_U = (i11 & 32) != 0 ? ColorsKt.m985contentColorForek8zF_U(jM971getSurface0d7_KjU, composer, (i10 >> 12) & 14) : j11;
        BorderStroke borderStroke2 = (i11 & 64) != 0 ? null : borderStroke;
        float fM3826constructorimpl = (i11 & 128) != 0 ? Dp.m3826constructorimpl(1) : f10;
        if ((i11 & 256) != 0) {
            composer.startReplaceableGroup(-492369756);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceableGroup();
            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
        } else {
            mutableInteractionSource2 = mutableInteractionSource;
        }
        SurfaceKt.m1164SurfaceLPr_se0(aVar, modifier2, z11, medium, jM971getSurface0d7_KjU, jM985contentColorForek8zF_U, borderStroke2, fM3826constructorimpl, mutableInteractionSource2, pVar, composer, (i10 & 14) | (i10 & 112) | (i10 & 896) | (i10 & 7168) | (57344 & i10) | (458752 & i10) | (3670016 & i10) | (29360128 & i10) | (234881024 & i10) | (i10 & 1879048192), 0);
        composer.endReplaceableGroup();
    }
}
