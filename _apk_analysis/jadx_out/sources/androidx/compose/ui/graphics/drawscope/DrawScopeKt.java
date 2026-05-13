package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.DegreesKt;
import androidx.compose.ui.graphics.Path;
import bn.r;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: DrawScope.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aD\u0010\t\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\bø\u0001\u0000\u001a,\u0010\t\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\t\u001a\u00020\u00012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\bø\u0001\u0000\u001a8\u0010\t\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\u00012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\bø\u0001\u0000\u001a8\u0010\f\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\bø\u0001\u0000\u001aC\u0010\u0012\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\r\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\bø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001aC\u0010\u0015\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\bø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b\u0014\u0010\u0011\u001aK\u0010\u001a\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\bø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001aC\u0010\u001a\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\bø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b\u001b\u0010\u0011\u001ac\u0010 \u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\bø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001aC\u0010%\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\"\u001a\u00020!2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\bø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b#\u0010$\u001a$\u0010'\u001a\u00020\u0007*\u00020\u00002\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\bø\u0001\u0000\u001a8\u0010+\u001a\u00020\u0007*\u00020\u00002\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\bø\u0001\u0000\u0082\u0002\u0012\n\u0005\b\u009920\u0001\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006,"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "left", "top", "right", "bottom", "Lkotlin/Function1;", "Lbn/r;", "block", "inset", "horizontal", "vertical", "translate", "degrees", "Landroidx/compose/ui/geometry/Offset;", "pivot", "rotate-Rg1IO4c", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FJLsn/l;)V", "rotate", "radians", "rotateRad-Rg1IO4c", "rotateRad", "scaleX", "scaleY", "scale-Fgt4K4Q", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFJLsn/l;)V", "scale", "scale-Rg1IO4c", "Landroidx/compose/ui/graphics/ClipOp;", "clipOp", "clipRect-rOu3jXo", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFFFILsn/l;)V", "clipRect", "Landroidx/compose/ui/graphics/Path;", "path", "clipPath-KD09W0M", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/Path;ILsn/l;)V", "clipPath", "Landroidx/compose/ui/graphics/Canvas;", "drawIntoCanvas", "Landroidx/compose/ui/graphics/drawscope/DrawTransform;", "transformBlock", "drawBlock", "withTransform", "ui-graphics_release"}, k = 2, mv = {1, 6, 0})
public final class DrawScopeKt {
    /* JADX INFO: renamed from: clipPath-KD09W0M, reason: not valid java name */
    public static final void m2150clipPathKD09W0M(@NotNull DrawScope drawScope, @NotNull Path path, int i10, @NotNull l<? super DrawScope, r> lVar) {
        p.k(drawScope, "$this$clipPath");
        p.k(path, "path");
        p.k(lVar, "block");
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo2038getSizeNHjbRc = drawContext.mo2038getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo2040clipPathmtrdDE(path, i10);
        lVar.invoke(drawScope);
        drawContext.getCanvas().restore();
        drawContext.mo2039setSizeuvyYCjk(jMo2038getSizeNHjbRc);
    }

    /* JADX INFO: renamed from: clipPath-KD09W0M$default, reason: not valid java name */
    public static /* synthetic */ void m2151clipPathKD09W0M$default(DrawScope drawScope, Path path, int i10, l lVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = ClipOp.INSTANCE.m1608getIntersectrtfAjoo();
        }
        p.k(drawScope, "$this$clipPath");
        p.k(path, "path");
        p.k(lVar, "block");
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo2038getSizeNHjbRc = drawContext.mo2038getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo2040clipPathmtrdDE(path, i10);
        lVar.invoke(drawScope);
        drawContext.getCanvas().restore();
        drawContext.mo2039setSizeuvyYCjk(jMo2038getSizeNHjbRc);
    }

    /* JADX INFO: renamed from: clipRect-rOu3jXo, reason: not valid java name */
    public static final void m2152clipRectrOu3jXo(@NotNull DrawScope drawScope, float f10, float f11, float f12, float f13, int i10, @NotNull l<? super DrawScope, r> lVar) {
        p.k(drawScope, "$this$clipRect");
        p.k(lVar, "block");
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo2038getSizeNHjbRc = drawContext.mo2038getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo2041clipRectN_I0leg(f10, f11, f12, f13, i10);
        lVar.invoke(drawScope);
        drawContext.getCanvas().restore();
        drawContext.mo2039setSizeuvyYCjk(jMo2038getSizeNHjbRc);
    }

    /* JADX INFO: renamed from: clipRect-rOu3jXo$default, reason: not valid java name */
    public static /* synthetic */ void m2153clipRectrOu3jXo$default(DrawScope drawScope, float f10, float f11, float f12, float f13, int i10, l lVar, int i11, Object obj) {
        float f14 = (i11 & 1) != 0 ? 0.0f : f10;
        float f15 = (i11 & 2) != 0 ? 0.0f : f11;
        if ((i11 & 4) != 0) {
            f12 = Size.m1452getWidthimpl(drawScope.mo2113getSizeNHjbRc());
        }
        float f16 = f12;
        if ((i11 & 8) != 0) {
            f13 = Size.m1449getHeightimpl(drawScope.mo2113getSizeNHjbRc());
        }
        float f17 = f13;
        if ((i11 & 16) != 0) {
            i10 = ClipOp.INSTANCE.m1608getIntersectrtfAjoo();
        }
        p.k(drawScope, "$this$clipRect");
        p.k(lVar, "block");
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo2038getSizeNHjbRc = drawContext.mo2038getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo2041clipRectN_I0leg(f14, f15, f16, f17, i10);
        lVar.invoke(drawScope);
        drawContext.getCanvas().restore();
        drawContext.mo2039setSizeuvyYCjk(jMo2038getSizeNHjbRc);
    }

    public static final void drawIntoCanvas(@NotNull DrawScope drawScope, @NotNull l<? super Canvas, r> lVar) {
        p.k(drawScope, "<this>");
        p.k(lVar, "block");
        lVar.invoke(drawScope.getDrawContext().getCanvas());
    }

    public static final void inset(@NotNull DrawScope drawScope, float f10, float f11, float f12, float f13, @NotNull l<? super DrawScope, r> lVar) {
        p.k(drawScope, "<this>");
        p.k(lVar, "block");
        drawScope.getDrawContext().getTransform().inset(f10, f11, f12, f13);
        lVar.invoke(drawScope);
        drawScope.getDrawContext().getTransform().inset(-f10, -f11, -f12, -f13);
    }

    public static final void inset(@NotNull DrawScope drawScope, float f10, float f11, @NotNull l<? super DrawScope, r> lVar) {
        p.k(drawScope, "<this>");
        p.k(lVar, "block");
        drawScope.getDrawContext().getTransform().inset(f10, f11, f10, f11);
        lVar.invoke(drawScope);
        float f12 = -f10;
        float f13 = -f11;
        drawScope.getDrawContext().getTransform().inset(f12, f13, f12, f13);
    }

    public static final void inset(@NotNull DrawScope drawScope, float f10, @NotNull l<? super DrawScope, r> lVar) {
        p.k(drawScope, "<this>");
        p.k(lVar, "block");
        drawScope.getDrawContext().getTransform().inset(f10, f10, f10, f10);
        lVar.invoke(drawScope);
        float f11 = -f10;
        drawScope.getDrawContext().getTransform().inset(f11, f11, f11, f11);
    }

    public static /* synthetic */ void inset$default(DrawScope drawScope, float f10, float f11, l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        p.k(drawScope, "<this>");
        p.k(lVar, "block");
        drawScope.getDrawContext().getTransform().inset(f10, f11, f10, f11);
        lVar.invoke(drawScope);
        float f12 = -f10;
        float f13 = -f11;
        drawScope.getDrawContext().getTransform().inset(f12, f13, f12, f13);
    }

    /* JADX INFO: renamed from: rotate-Rg1IO4c, reason: not valid java name */
    public static final void m2154rotateRg1IO4c(@NotNull DrawScope drawScope, float f10, long j10, @NotNull l<? super DrawScope, r> lVar) {
        p.k(drawScope, "$this$rotate");
        p.k(lVar, "block");
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo2038getSizeNHjbRc = drawContext.mo2038getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo2044rotateUv8p0NA(f10, j10);
        lVar.invoke(drawScope);
        drawContext.getCanvas().restore();
        drawContext.mo2039setSizeuvyYCjk(jMo2038getSizeNHjbRc);
    }

    /* JADX INFO: renamed from: rotate-Rg1IO4c$default, reason: not valid java name */
    public static /* synthetic */ void m2155rotateRg1IO4c$default(DrawScope drawScope, float f10, long j10, l lVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = drawScope.mo2112getCenterF1C5BW0();
        }
        p.k(drawScope, "$this$rotate");
        p.k(lVar, "block");
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo2038getSizeNHjbRc = drawContext.mo2038getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo2044rotateUv8p0NA(f10, j10);
        lVar.invoke(drawScope);
        drawContext.getCanvas().restore();
        drawContext.mo2039setSizeuvyYCjk(jMo2038getSizeNHjbRc);
    }

    /* JADX INFO: renamed from: rotateRad-Rg1IO4c, reason: not valid java name */
    public static final void m2156rotateRadRg1IO4c(@NotNull DrawScope drawScope, float f10, long j10, @NotNull l<? super DrawScope, r> lVar) {
        p.k(drawScope, "$this$rotateRad");
        p.k(lVar, "block");
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo2038getSizeNHjbRc = drawContext.mo2038getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo2044rotateUv8p0NA(DegreesKt.degrees(f10), j10);
        lVar.invoke(drawScope);
        drawContext.getCanvas().restore();
        drawContext.mo2039setSizeuvyYCjk(jMo2038getSizeNHjbRc);
    }

    /* JADX INFO: renamed from: rotateRad-Rg1IO4c$default, reason: not valid java name */
    public static /* synthetic */ void m2157rotateRadRg1IO4c$default(DrawScope drawScope, float f10, long j10, l lVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = drawScope.mo2112getCenterF1C5BW0();
        }
        p.k(drawScope, "$this$rotateRad");
        p.k(lVar, "block");
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo2038getSizeNHjbRc = drawContext.mo2038getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo2044rotateUv8p0NA(DegreesKt.degrees(f10), j10);
        lVar.invoke(drawScope);
        drawContext.getCanvas().restore();
        drawContext.mo2039setSizeuvyYCjk(jMo2038getSizeNHjbRc);
    }

    /* JADX INFO: renamed from: scale-Fgt4K4Q, reason: not valid java name */
    public static final void m2158scaleFgt4K4Q(@NotNull DrawScope drawScope, float f10, float f11, long j10, @NotNull l<? super DrawScope, r> lVar) {
        p.k(drawScope, "$this$scale");
        p.k(lVar, "block");
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo2038getSizeNHjbRc = drawContext.mo2038getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo2045scale0AR0LA0(f10, f11, j10);
        lVar.invoke(drawScope);
        drawContext.getCanvas().restore();
        drawContext.mo2039setSizeuvyYCjk(jMo2038getSizeNHjbRc);
    }

    /* JADX INFO: renamed from: scale-Fgt4K4Q$default, reason: not valid java name */
    public static /* synthetic */ void m2159scaleFgt4K4Q$default(DrawScope drawScope, float f10, float f11, long j10, l lVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            j10 = drawScope.mo2112getCenterF1C5BW0();
        }
        p.k(drawScope, "$this$scale");
        p.k(lVar, "block");
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo2038getSizeNHjbRc = drawContext.mo2038getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo2045scale0AR0LA0(f10, f11, j10);
        lVar.invoke(drawScope);
        drawContext.getCanvas().restore();
        drawContext.mo2039setSizeuvyYCjk(jMo2038getSizeNHjbRc);
    }

    /* JADX INFO: renamed from: scale-Rg1IO4c, reason: not valid java name */
    public static final void m2160scaleRg1IO4c(@NotNull DrawScope drawScope, float f10, long j10, @NotNull l<? super DrawScope, r> lVar) {
        p.k(drawScope, "$this$scale");
        p.k(lVar, "block");
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo2038getSizeNHjbRc = drawContext.mo2038getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo2045scale0AR0LA0(f10, f10, j10);
        lVar.invoke(drawScope);
        drawContext.getCanvas().restore();
        drawContext.mo2039setSizeuvyYCjk(jMo2038getSizeNHjbRc);
    }

    /* JADX INFO: renamed from: scale-Rg1IO4c$default, reason: not valid java name */
    public static /* synthetic */ void m2161scaleRg1IO4c$default(DrawScope drawScope, float f10, long j10, l lVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = drawScope.mo2112getCenterF1C5BW0();
        }
        p.k(drawScope, "$this$scale");
        p.k(lVar, "block");
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo2038getSizeNHjbRc = drawContext.mo2038getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo2045scale0AR0LA0(f10, f10, j10);
        lVar.invoke(drawScope);
        drawContext.getCanvas().restore();
        drawContext.mo2039setSizeuvyYCjk(jMo2038getSizeNHjbRc);
    }

    public static final void translate(@NotNull DrawScope drawScope, float f10, float f11, @NotNull l<? super DrawScope, r> lVar) {
        p.k(drawScope, "<this>");
        p.k(lVar, "block");
        drawScope.getDrawContext().getTransform().translate(f10, f11);
        lVar.invoke(drawScope);
        drawScope.getDrawContext().getTransform().translate(-f10, -f11);
    }

    public static /* synthetic */ void translate$default(DrawScope drawScope, float f10, float f11, l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        p.k(drawScope, "<this>");
        p.k(lVar, "block");
        drawScope.getDrawContext().getTransform().translate(f10, f11);
        lVar.invoke(drawScope);
        drawScope.getDrawContext().getTransform().translate(-f10, -f11);
    }

    public static final void withTransform(@NotNull DrawScope drawScope, @NotNull l<? super DrawTransform, r> lVar, @NotNull l<? super DrawScope, r> lVar2) {
        p.k(drawScope, "<this>");
        p.k(lVar, "transformBlock");
        p.k(lVar2, "drawBlock");
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo2038getSizeNHjbRc = drawContext.mo2038getSizeNHjbRc();
        drawContext.getCanvas().save();
        lVar.invoke(drawContext.getTransform());
        lVar2.invoke(drawScope);
        drawContext.getCanvas().restore();
        drawContext.mo2039setSizeuvyYCjk(jMo2038getSizeNHjbRc);
    }
}
