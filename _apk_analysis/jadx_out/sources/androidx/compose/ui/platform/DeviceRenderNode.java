package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RenderEffect;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DeviceRenderNode.android.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b5\n\u0002\u0018\u0002\n\u0002\b\b\b`\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J(\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H&J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0006H&J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0006H&J.\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00040\u0014H&J\u0010\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018H&J\u0010\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018H&J\u0010\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001cH&J\u0010\u0010 \u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u000bH&J\b\u0010\"\u001a\u00020!H&J\b\u0010#\u001a\u00020\u0004H&R\u0014\u0010'\u001a\u00020$8&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010\b\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b*\u0010)R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b+\u0010)R\u0014\u0010\n\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b,\u0010)R\u0014\u0010.\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b-\u0010)R\u0014\u00100\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b/\u0010)R\u001c\u00106\u001a\u0002018&@&X¦\u000e¢\u0006\f\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001c\u00109\u001a\u0002018&@&X¦\u000e¢\u0006\f\u001a\u0004\b7\u00103\"\u0004\b8\u00105R\u001c\u0010<\u001a\u0002018&@&X¦\u000e¢\u0006\f\u001a\u0004\b:\u00103\"\u0004\b;\u00105R\u001c\u0010?\u001a\u0002018&@&X¦\u000e¢\u0006\f\u001a\u0004\b=\u00103\"\u0004\b>\u00105R\u001c\u0010B\u001a\u0002018&@&X¦\u000e¢\u0006\f\u001a\u0004\b@\u00103\"\u0004\bA\u00105R\u001c\u0010F\u001a\u00020\u00068&@&X¦\u000e¢\u0006\f\u001a\u0004\bC\u0010)\"\u0004\bD\u0010ER\u001c\u0010I\u001a\u00020\u00068&@&X¦\u000e¢\u0006\f\u001a\u0004\bG\u0010)\"\u0004\bH\u0010ER\u001c\u0010L\u001a\u0002018&@&X¦\u000e¢\u0006\f\u001a\u0004\bJ\u00103\"\u0004\bK\u00105R\u001c\u0010O\u001a\u0002018&@&X¦\u000e¢\u0006\f\u001a\u0004\bM\u00103\"\u0004\bN\u00105R\u001c\u0010R\u001a\u0002018&@&X¦\u000e¢\u0006\f\u001a\u0004\bP\u00103\"\u0004\bQ\u00105R\u001c\u0010U\u001a\u0002018&@&X¦\u000e¢\u0006\f\u001a\u0004\bS\u00103\"\u0004\bT\u00105R\u001c\u0010X\u001a\u0002018&@&X¦\u000e¢\u0006\f\u001a\u0004\bV\u00103\"\u0004\bW\u00105R\u001c\u0010[\u001a\u0002018&@&X¦\u000e¢\u0006\f\u001a\u0004\bY\u00103\"\u0004\bZ\u00105R\u001c\u0010`\u001a\u00020\u000b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\u001c\u0010c\u001a\u00020\u000b8&@&X¦\u000e¢\u0006\f\u001a\u0004\ba\u0010]\"\u0004\bb\u0010_R\u001c\u0010f\u001a\u0002018&@&X¦\u000e¢\u0006\f\u001a\u0004\bd\u00103\"\u0004\be\u00105R\u001e\u0010l\u001a\u0004\u0018\u00010g8&@&X¦\u000e¢\u0006\f\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\u0014\u0010n\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\bm\u0010]ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006oÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/platform/DeviceRenderNode;", "", "Landroid/graphics/Outline;", "outline", "Lbn/r;", "setOutline", "", "left", "top", "right", "bottom", "", "setPosition", TypedValues.CycleType.S_WAVE_OFFSET, "offsetLeftAndRight", "offsetTopAndBottom", "Landroidx/compose/ui/graphics/CanvasHolder;", "canvasHolder", "Landroidx/compose/ui/graphics/Path;", "clipPath", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/Canvas;", "drawBlock", "record", "Landroid/graphics/Matrix;", "matrix", "getMatrix", "getInverseMatrix", "Landroid/graphics/Canvas;", "canvas", "drawInto", "hasOverlappingRendering", "setHasOverlappingRendering", "Landroidx/compose/ui/platform/DeviceRenderNodeData;", "dumpRenderNodeData", "discardDisplayList", "", "getUniqueId", "()J", "uniqueId", "getLeft", "()I", "getTop", "getRight", "getBottom", "getWidth", "width", "getHeight", "height", "", "getScaleX", "()F", "setScaleX", "(F)V", "scaleX", "getScaleY", "setScaleY", "scaleY", "getTranslationX", "setTranslationX", "translationX", "getTranslationY", "setTranslationY", "translationY", "getElevation", "setElevation", "elevation", "getAmbientShadowColor", "setAmbientShadowColor", "(I)V", "ambientShadowColor", "getSpotShadowColor", "setSpotShadowColor", "spotShadowColor", "getRotationZ", "setRotationZ", "rotationZ", "getRotationX", "setRotationX", "rotationX", "getRotationY", "setRotationY", "rotationY", "getCameraDistance", "setCameraDistance", "cameraDistance", "getPivotX", "setPivotX", "pivotX", "getPivotY", "setPivotY", "pivotY", "getClipToOutline", "()Z", "setClipToOutline", "(Z)V", "clipToOutline", "getClipToBounds", "setClipToBounds", "clipToBounds", "getAlpha", "setAlpha", "alpha", "Landroidx/compose/ui/graphics/RenderEffect;", "getRenderEffect", "()Landroidx/compose/ui/graphics/RenderEffect;", "setRenderEffect", "(Landroidx/compose/ui/graphics/RenderEffect;)V", "renderEffect", "getHasDisplayList", "hasDisplayList", "ui_release"}, k = 1, mv = {1, 6, 0})
public interface DeviceRenderNode {
    void discardDisplayList();

    void drawInto(@NotNull Canvas canvas);

    @NotNull
    DeviceRenderNodeData dumpRenderNodeData();

    float getAlpha();

    int getAmbientShadowColor();

    int getBottom();

    float getCameraDistance();

    boolean getClipToBounds();

    boolean getClipToOutline();

    float getElevation();

    boolean getHasDisplayList();

    int getHeight();

    void getInverseMatrix(@NotNull Matrix matrix);

    int getLeft();

    void getMatrix(@NotNull Matrix matrix);

    float getPivotX();

    float getPivotY();

    @Nullable
    RenderEffect getRenderEffect();

    int getRight();

    float getRotationX();

    float getRotationY();

    float getRotationZ();

    float getScaleX();

    float getScaleY();

    int getSpotShadowColor();

    int getTop();

    float getTranslationX();

    float getTranslationY();

    long getUniqueId();

    int getWidth();

    void offsetLeftAndRight(int i10);

    void offsetTopAndBottom(int i10);

    void record(@NotNull CanvasHolder canvasHolder, @Nullable Path path, @NotNull sn.l<? super androidx.compose.ui.graphics.Canvas, bn.r> lVar);

    void setAlpha(float f10);

    void setAmbientShadowColor(int i10);

    void setCameraDistance(float f10);

    void setClipToBounds(boolean z10);

    void setClipToOutline(boolean z10);

    void setElevation(float f10);

    boolean setHasOverlappingRendering(boolean hasOverlappingRendering);

    void setOutline(@Nullable Outline outline);

    void setPivotX(float f10);

    void setPivotY(float f10);

    boolean setPosition(int left, int top2, int right, int bottom);

    void setRenderEffect(@Nullable RenderEffect renderEffect);

    void setRotationX(float f10);

    void setRotationY(float f10);

    void setRotationZ(float f10);

    void setScaleX(float f10);

    void setScaleY(float f10);

    void setSpotShadowColor(int i10);

    void setTranslationX(float f10);

    void setTranslationY(float f10);
}
