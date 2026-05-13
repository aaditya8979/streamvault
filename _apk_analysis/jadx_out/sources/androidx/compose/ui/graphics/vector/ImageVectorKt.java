package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.vector.ImageVector;
import bn.r;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: ImageVector.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0099\u0001\u0010\u0017\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011H\u0086\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0084\u0001\u0010#\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0018\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u001b\u001a\u00020\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u00052\b\b\u0002\u0010\u001d\u001a\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\u00052\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00130\u0011H\u0086\bø\u0001\u0001\u0082\u0002\u0012\n\u0002\b\u0019\n\u0005\b\u009920\u0001\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector$Builder;", "", "name", "Landroidx/compose/ui/graphics/Brush;", VastAttributes.FILL_COLOR, "", "fillAlpha", VastAttributes.STROKE_COLOR, "strokeAlpha", "strokeLineWidth", "Landroidx/compose/ui/graphics/StrokeCap;", "strokeLineCap", "Landroidx/compose/ui/graphics/StrokeJoin;", "strokeLineJoin", "strokeLineMiter", "Landroidx/compose/ui/graphics/PathFillType;", "pathFillType", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/vector/PathBuilder;", "Lbn/r;", "pathBuilder", "path-R_LF-3I", "(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFILsn/l;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;", "path", "rotate", "pivotX", "pivotY", "scaleX", "scaleY", "translationX", "translationY", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "clipPathData", "block", "group", "ui_release"}, k = 2, mv = {1, 6, 0})
public final class ImageVectorKt {
    @NotNull
    public static final ImageVector.Builder group(@NotNull ImageVector.Builder builder, @NotNull String str, float f10, float f11, float f12, float f13, float f14, float f15, float f16, @NotNull List<? extends PathNode> list, @NotNull l<? super ImageVector.Builder, r> lVar) {
        p.k(builder, "<this>");
        p.k(str, "name");
        p.k(list, "clipPathData");
        p.k(lVar, "block");
        builder.addGroup(str, f10, f11, f12, f13, f14, f15, f16, list);
        lVar.invoke(builder);
        builder.clearGroup();
        return builder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ImageVector.Builder group$default(ImageVector.Builder builder, String str, float f10, float f11, float f12, float f13, float f14, float f15, float f16, List list, l lVar, int i10, Object obj) {
        String str2 = (i10 & 1) != 0 ? "" : str;
        float f17 = (i10 & 2) != 0 ? 0.0f : f10;
        float f18 = (i10 & 4) != 0 ? 0.0f : f11;
        float f19 = (i10 & 8) != 0 ? 0.0f : f12;
        float f20 = (i10 & 16) != 0 ? 1.0f : f13;
        float f21 = (i10 & 32) == 0 ? f14 : 1.0f;
        float f22 = (i10 & 64) != 0 ? 0.0f : f15;
        float f23 = (i10 & 128) != 0 ? 0.0f : f16;
        List emptyPath = (i10 & 256) != 0 ? VectorKt.getEmptyPath() : list;
        p.k(builder, "<this>");
        p.k(str2, "name");
        p.k(emptyPath, "clipPathData");
        p.k(lVar, "block");
        builder.addGroup(str2, f17, f18, f19, f20, f21, f22, f23, emptyPath);
        lVar.invoke(builder);
        builder.clearGroup();
        return builder;
    }

    @NotNull
    /* JADX INFO: renamed from: path-R_LF-3I, reason: not valid java name */
    public static final ImageVector.Builder m2196pathR_LF3I(@NotNull ImageVector.Builder builder, @NotNull String str, @Nullable Brush brush, float f10, @Nullable Brush brush2, float f11, float f12, int i10, int i11, float f13, int i12, @NotNull l<? super PathBuilder, r> lVar) {
        p.k(builder, "$this$path");
        p.k(str, "name");
        p.k(lVar, "pathBuilder");
        PathBuilder pathBuilder = new PathBuilder();
        lVar.invoke(pathBuilder);
        return builder.m2195addPathoIyEayM(pathBuilder.getNodes(), (14336 & 2) != 0 ? VectorKt.getDefaultFillType() : i12, (14336 & 4) != 0 ? "" : str, (14336 & 8) != 0 ? null : brush, (14336 & 16) != 0 ? 1.0f : f10, (14336 & 32) == 0 ? brush2 : null, (14336 & 64) != 0 ? 1.0f : f11, (14336 & 128) != 0 ? 0.0f : f12, (14336 & 256) != 0 ? VectorKt.getDefaultStrokeLineCap() : i10, (14336 & 512) != 0 ? VectorKt.getDefaultStrokeLineJoin() : i11, (14336 & 1024) != 0 ? 4.0f : f13, (14336 & 2048) != 0 ? 0.0f : 0.0f, (14336 & 4096) == 0 ? 0.0f : 1.0f, (14336 & 8192) == 0 ? 0.0f : 0.0f);
    }

    /* JADX INFO: renamed from: path-R_LF-3I$default, reason: not valid java name */
    public static /* synthetic */ ImageVector.Builder m2197pathR_LF3I$default(ImageVector.Builder builder, String str, Brush brush, float f10, Brush brush2, float f11, float f12, int i10, int i11, float f13, int i12, l lVar, int i13, Object obj) {
        String str2 = (i13 & 1) != 0 ? "" : str;
        Brush brush3 = (i13 & 2) != 0 ? null : brush;
        float f14 = (i13 & 4) != 0 ? 1.0f : f10;
        Brush brush4 = (i13 & 8) != 0 ? null : brush2;
        float f15 = (i13 & 16) != 0 ? 1.0f : f11;
        float f16 = (i13 & 32) != 0 ? 0.0f : f12;
        int defaultStrokeLineCap = (i13 & 64) != 0 ? VectorKt.getDefaultStrokeLineCap() : i10;
        int defaultStrokeLineJoin = (i13 & 128) != 0 ? VectorKt.getDefaultStrokeLineJoin() : i11;
        float f17 = (i13 & 256) != 0 ? 4.0f : f13;
        int defaultFillType = (i13 & 512) != 0 ? VectorKt.getDefaultFillType() : i12;
        p.k(builder, "$this$path");
        p.k(str2, "name");
        p.k(lVar, "pathBuilder");
        PathBuilder pathBuilder = new PathBuilder();
        lVar.invoke(pathBuilder);
        return builder.m2195addPathoIyEayM(pathBuilder.getNodes(), (14336 & 2) != 0 ? VectorKt.getDefaultFillType() : defaultFillType, (14336 & 4) != 0 ? "" : str2, (14336 & 8) != 0 ? null : brush3, (14336 & 16) != 0 ? 1.0f : f14, (14336 & 32) == 0 ? brush4 : null, (14336 & 64) != 0 ? 1.0f : f15, (14336 & 128) != 0 ? 0.0f : f16, (14336 & 256) != 0 ? VectorKt.getDefaultStrokeLineCap() : defaultStrokeLineCap, (14336 & 512) != 0 ? VectorKt.getDefaultStrokeLineJoin() : defaultStrokeLineJoin, (14336 & 1024) != 0 ? 4.0f : f17, (14336 & 2048) != 0 ? 0.0f : 0.0f, (14336 & 4096) == 0 ? 0.0f : 1.0f, (14336 & 8192) == 0 ? 0.0f : 0.0f);
    }
}
