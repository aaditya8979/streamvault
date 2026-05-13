package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.RenderEffect;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.layout.GraphicLayerInfo;
import androidx.compose.ui.node.OwnedLayer;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import com.ironsource.C3978d4;
import com.mbridge.msdk.MBridgeConstans;
import io.bidmachine.iab.vast.tags.VastTagName;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RenderNodeLayer.android.kt */
/* JADX INFO: loaded from: classes11.dex */
@RequiresApi(23)
@Metadata(bv = {}, d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\n\b\u0001\u0018\u0000 i2\u00020\u00012\u00020\u0002:\u0002ijB1\u0012\u0006\u0010D\u001a\u00020C\u0012\u0012\u0010?\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030>\u0012\f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00030@¢\u0006\u0004\bg\u0010hJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J§\u0001\u0010$\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010#J\u001d\u0010)\u001a\u00020\u00172\u0006\u0010&\u001a\u00020%H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010(J\u001d\u0010.\u001a\u00020\u00032\u0006\u0010+\u001a\u00020*H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b,\u0010-J\u001d\u00101\u001a\u00020\u00032\u0006\u0010&\u001a\u00020/H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b0\u0010-J\b\u00102\u001a\u00020\u0003H\u0016J\u0010\u00103\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u00104\u001a\u00020\u0003H\u0016J\b\u00105\u001a\u00020\u0003H\u0016J%\u0010:\u001a\u00020%2\u0006\u00106\u001a\u00020%2\u0006\u00107\u001a\u00020\u0017H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b8\u00109J\u0018\u0010=\u001a\u00020\u00032\u0006\u0010<\u001a\u00020;2\u0006\u00107\u001a\u00020\u0017H\u0016J*\u0010B\u001a\u00020\u00032\u0012\u0010?\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030>2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00030@H\u0016R\u0017\u0010D\u001a\u00020C8\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR$\u0010?\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0003\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010HR\u001e\u0010A\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010IR$\u0010K\u001a\u00020\u00172\u0006\u0010J\u001a\u00020\u00178\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bK\u0010L\"\u0004\bM\u0010NR\u0014\u0010P\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010R\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010LR\u0016\u0010S\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010LR\u0018\u0010U\u001a\u0004\u0018\u00010T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u001a\u0010Y\u001a\b\u0012\u0004\u0012\u00020X0W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010\\\u001a\u00020[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u001f\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0014\u0010^R\u0014\u0010_\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u0014\u0010d\u001a\u00020a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bb\u0010cR\u0014\u0010f\u001a\u00020a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\be\u0010c\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006k"}, d2 = {"Landroidx/compose/ui/platform/RenderNodeLayer;", "Landroidx/compose/ui/node/OwnedLayer;", "Landroidx/compose/ui/layout/GraphicLayerInfo;", "Lbn/r;", "triggerRepaint", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "clipRenderNode", "", "scaleX", "scaleY", "alpha", "translationX", "translationY", "shadowElevation", "rotationX", "rotationY", "rotationZ", "cameraDistance", "Landroidx/compose/ui/graphics/TransformOrigin;", "transformOrigin", "Landroidx/compose/ui/graphics/Shape;", "shape", "", "clip", "Landroidx/compose/ui/graphics/RenderEffect;", "renderEffect", "Landroidx/compose/ui/graphics/Color;", "ambientShadowColor", "spotShadowColor", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/unit/Density;", "density", "updateLayerProperties-NHXXZp8", "(FFFFFFFFFFJLandroidx/compose/ui/graphics/Shape;ZLandroidx/compose/ui/graphics/RenderEffect;JJLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;)V", "updateLayerProperties", "Landroidx/compose/ui/geometry/Offset;", C3978d4.i.L, "isInLayer-k-4lQ0M", "(J)Z", "isInLayer", "Landroidx/compose/ui/unit/IntSize;", "size", "resize-ozmzZPI", "(J)V", "resize", "Landroidx/compose/ui/unit/IntOffset;", "move--gyyYBs", "move", "invalidate", "drawLayer", "updateDisplayList", "destroy", "point", "inverse", "mapOffset-8S9VItk", "(JZ)J", "mapOffset", "Landroidx/compose/ui/geometry/MutableRect;", "rect", "mapBounds", "Lkotlin/Function1;", "drawBlock", "Lkotlin/Function0;", "invalidateParentLayer", "reuseLayer", "Landroidx/compose/ui/platform/AndroidComposeView;", "ownerView", "Landroidx/compose/ui/platform/AndroidComposeView;", "getOwnerView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "Lsn/l;", "Lsn/a;", "value", "isDirty", "Z", "setDirty", "(Z)V", "Landroidx/compose/ui/platform/OutlineResolver;", "outlineResolver", "Landroidx/compose/ui/platform/OutlineResolver;", "isDestroyed", "drawnWithZ", "Landroidx/compose/ui/graphics/Paint;", "softwareLayerPaint", "Landroidx/compose/ui/graphics/Paint;", "Landroidx/compose/ui/platform/LayerMatrixCache;", "Landroidx/compose/ui/platform/DeviceRenderNode;", "matrixCache", "Landroidx/compose/ui/platform/LayerMatrixCache;", "Landroidx/compose/ui/graphics/CanvasHolder;", "canvasHolder", "Landroidx/compose/ui/graphics/CanvasHolder;", "J", "renderNode", "Landroidx/compose/ui/platform/DeviceRenderNode;", "", "getLayerId", "()J", "layerId", "getOwnerViewId", "ownerViewId", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;Lsn/l;Lsn/a;)V", VastTagName.COMPANION, "UniqueDrawingIdApi29", "ui_release"}, k = 1, mv = {1, 6, 0})
public final class RenderNodeLayer implements OwnedLayer, GraphicLayerInfo {

    @NotNull
    private static final sn.p<DeviceRenderNode, Matrix, bn.r> getMatrix = new sn.p<DeviceRenderNode, Matrix, bn.r>() { // from class: androidx.compose.ui.platform.RenderNodeLayer$Companion$getMatrix$1
        @Override // sn.p
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ bn.r mo2invoke(DeviceRenderNode deviceRenderNode, Matrix matrix) {
            invoke2(deviceRenderNode, matrix);
            return bn.r.f5635a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull DeviceRenderNode deviceRenderNode, @NotNull Matrix matrix) {
            tn.p.k(deviceRenderNode, "rn");
            tn.p.k(matrix, "matrix");
            deviceRenderNode.getMatrix(matrix);
        }
    };

    @NotNull
    private final CanvasHolder canvasHolder;

    @Nullable
    private sn.l<? super Canvas, bn.r> drawBlock;
    private boolean drawnWithZ;

    @Nullable
    private sn.a<bn.r> invalidateParentLayer;
    private boolean isDestroyed;
    private boolean isDirty;

    @NotNull
    private final LayerMatrixCache<DeviceRenderNode> matrixCache;

    @NotNull
    private final OutlineResolver outlineResolver;

    @NotNull
    private final AndroidComposeView ownerView;

    @NotNull
    private final DeviceRenderNode renderNode;

    @Nullable
    private Paint softwareLayerPaint;
    private long transformOrigin;

    /* JADX INFO: compiled from: RenderNodeLayer.android.kt */
    @RequiresApi(29)
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/platform/RenderNodeLayer$UniqueDrawingIdApi29;", "", "()V", "getUniqueDrawingId", "", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/view/View;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class UniqueDrawingIdApi29 {

        @NotNull
        public static final UniqueDrawingIdApi29 INSTANCE = new UniqueDrawingIdApi29();

        private UniqueDrawingIdApi29() {
        }

        @DoNotInline
        public static final long getUniqueDrawingId(@NotNull View view) {
            tn.p.k(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
            return view.getUniqueDrawingId();
        }
    }

    public RenderNodeLayer(@NotNull AndroidComposeView androidComposeView, @NotNull sn.l<? super Canvas, bn.r> lVar, @NotNull sn.a<bn.r> aVar) {
        tn.p.k(androidComposeView, "ownerView");
        tn.p.k(lVar, "drawBlock");
        tn.p.k(aVar, "invalidateParentLayer");
        this.ownerView = androidComposeView;
        this.drawBlock = lVar;
        this.invalidateParentLayer = aVar;
        this.outlineResolver = new OutlineResolver(androidComposeView.getDensity());
        this.matrixCache = new LayerMatrixCache<>(getMatrix);
        this.canvasHolder = new CanvasHolder();
        this.transformOrigin = TransformOrigin.INSTANCE.m1961getCenterSzJe1aQ();
        DeviceRenderNode renderNodeApi29 = Build.VERSION.SDK_INT >= 29 ? new RenderNodeApi29(androidComposeView) : new RenderNodeApi23(androidComposeView);
        renderNodeApi29.setHasOverlappingRendering(true);
        this.renderNode = renderNodeApi29;
    }

    private final void clipRenderNode(Canvas canvas) {
        if (this.renderNode.getClipToOutline() || this.renderNode.getClipToBounds()) {
            this.outlineResolver.clipToOutline(canvas);
        }
    }

    private final void setDirty(boolean z10) {
        if (z10 != this.isDirty) {
            this.isDirty = z10;
            this.ownerView.notifyLayerIsDirty$ui_release(this, z10);
        }
    }

    private final void triggerRepaint() {
        if (Build.VERSION.SDK_INT >= 26) {
            WrapperRenderNodeLayerHelperMethods.INSTANCE.onDescendantInvalidated(this.ownerView);
        } else {
            this.ownerView.invalidate();
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void destroy() {
        if (this.renderNode.getHasDisplayList()) {
            this.renderNode.discardDisplayList();
        }
        this.drawBlock = null;
        this.invalidateParentLayer = null;
        this.isDestroyed = true;
        setDirty(false);
        this.ownerView.requestClearInvalidObservations();
        this.ownerView.recycle$ui_release(this);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void drawLayer(@NotNull Canvas canvas) {
        tn.p.k(canvas, "canvas");
        android.graphics.Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(canvas);
        if (nativeCanvas.isHardwareAccelerated()) {
            updateDisplayList();
            boolean z10 = this.renderNode.getElevation() > 0.0f;
            this.drawnWithZ = z10;
            if (z10) {
                canvas.enableZ();
            }
            this.renderNode.drawInto(nativeCanvas);
            if (this.drawnWithZ) {
                canvas.disableZ();
                return;
            }
            return;
        }
        float left = this.renderNode.getLeft();
        float top2 = this.renderNode.getTop();
        float right = this.renderNode.getRight();
        float bottom = this.renderNode.getBottom();
        if (this.renderNode.getAlpha() < 1.0f) {
            Paint Paint = this.softwareLayerPaint;
            if (Paint == null) {
                Paint = AndroidPaint_androidKt.Paint();
                this.softwareLayerPaint = Paint;
            }
            Paint.setAlpha(this.renderNode.getAlpha());
            nativeCanvas.saveLayer(left, top2, right, bottom, Paint.getInternalPaint());
        } else {
            canvas.save();
        }
        canvas.translate(left, top2);
        canvas.mo1479concat58bKbWc(this.matrixCache.m3327calculateMatrixGrdbGEg(this.renderNode));
        clipRenderNode(canvas);
        sn.l<? super Canvas, bn.r> lVar = this.drawBlock;
        if (lVar != null) {
            lVar.invoke(canvas);
        }
        canvas.restore();
        setDirty(false);
    }

    @Override // androidx.compose.ui.layout.GraphicLayerInfo
    public long getLayerId() {
        return this.renderNode.getUniqueId();
    }

    @NotNull
    public final AndroidComposeView getOwnerView() {
        return this.ownerView;
    }

    @Override // androidx.compose.ui.layout.GraphicLayerInfo
    public long getOwnerViewId() {
        if (Build.VERSION.SDK_INT >= 29) {
            return UniqueDrawingIdApi29.getUniqueDrawingId(this.ownerView);
        }
        return -1L;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void invalidate() {
        if (this.isDirty || this.isDestroyed) {
            return;
        }
        this.ownerView.invalidate();
        setDirty(true);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* JADX INFO: renamed from: isInLayer-k-4lQ0M */
    public boolean mo3279isInLayerk4lQ0M(long position) {
        float fM1383getXimpl = Offset.m1383getXimpl(position);
        float fM1384getYimpl = Offset.m1384getYimpl(position);
        if (this.renderNode.getClipToBounds()) {
            return 0.0f <= fM1383getXimpl && fM1383getXimpl < ((float) this.renderNode.getWidth()) && 0.0f <= fM1384getYimpl && fM1384getYimpl < ((float) this.renderNode.getHeight());
        }
        if (this.renderNode.getClipToOutline()) {
            return this.outlineResolver.m3349isInOutlinek4lQ0M(position);
        }
        return true;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void mapBounds(@NotNull MutableRect mutableRect, boolean z10) {
        tn.p.k(mutableRect, "rect");
        if (!z10) {
            androidx.compose.ui.graphics.Matrix.m1821mapimpl(this.matrixCache.m3327calculateMatrixGrdbGEg(this.renderNode), mutableRect);
            return;
        }
        float[] fArrM3326calculateInverseMatrixbWbORWo = this.matrixCache.m3326calculateInverseMatrixbWbORWo(this.renderNode);
        if (fArrM3326calculateInverseMatrixbWbORWo == null) {
            mutableRect.set(0.0f, 0.0f, 0.0f, 0.0f);
        } else {
            androidx.compose.ui.graphics.Matrix.m1821mapimpl(fArrM3326calculateInverseMatrixbWbORWo, mutableRect);
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* JADX INFO: renamed from: mapOffset-8S9VItk */
    public long mo3280mapOffset8S9VItk(long point, boolean inverse) {
        if (!inverse) {
            return androidx.compose.ui.graphics.Matrix.m1819mapMKHz9U(this.matrixCache.m3327calculateMatrixGrdbGEg(this.renderNode), point);
        }
        float[] fArrM3326calculateInverseMatrixbWbORWo = this.matrixCache.m3326calculateInverseMatrixbWbORWo(this.renderNode);
        return fArrM3326calculateInverseMatrixbWbORWo != null ? androidx.compose.ui.graphics.Matrix.m1819mapMKHz9U(fArrM3326calculateInverseMatrixbWbORWo, point) : Offset.INSTANCE.m1397getInfiniteF1C5BW0();
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* JADX INFO: renamed from: move--gyyYBs */
    public void mo3281movegyyYBs(long position) {
        int left = this.renderNode.getLeft();
        int top2 = this.renderNode.getTop();
        int iM3944getXimpl = IntOffset.m3944getXimpl(position);
        int iM3945getYimpl = IntOffset.m3945getYimpl(position);
        if (left == iM3944getXimpl && top2 == iM3945getYimpl) {
            return;
        }
        this.renderNode.offsetLeftAndRight(iM3944getXimpl - left);
        this.renderNode.offsetTopAndBottom(iM3945getYimpl - top2);
        triggerRepaint();
        this.matrixCache.invalidate();
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* JADX INFO: renamed from: resize-ozmzZPI */
    public void mo3282resizeozmzZPI(long size) {
        int iM3986getWidthimpl = IntSize.m3986getWidthimpl(size);
        int iM3985getHeightimpl = IntSize.m3985getHeightimpl(size);
        float f10 = iM3986getWidthimpl;
        this.renderNode.setPivotX(TransformOrigin.m1956getPivotFractionXimpl(this.transformOrigin) * f10);
        float f11 = iM3985getHeightimpl;
        this.renderNode.setPivotY(TransformOrigin.m1957getPivotFractionYimpl(this.transformOrigin) * f11);
        DeviceRenderNode deviceRenderNode = this.renderNode;
        if (deviceRenderNode.setPosition(deviceRenderNode.getLeft(), this.renderNode.getTop(), this.renderNode.getLeft() + iM3986getWidthimpl, this.renderNode.getTop() + iM3985getHeightimpl)) {
            this.outlineResolver.m3350updateuvyYCjk(SizeKt.Size(f10, f11));
            this.renderNode.setOutline(this.outlineResolver.getOutline());
            invalidate();
            this.matrixCache.invalidate();
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void reuseLayer(@NotNull sn.l<? super Canvas, bn.r> lVar, @NotNull sn.a<bn.r> aVar) {
        tn.p.k(lVar, "drawBlock");
        tn.p.k(aVar, "invalidateParentLayer");
        setDirty(false);
        this.isDestroyed = false;
        this.drawnWithZ = false;
        this.transformOrigin = TransformOrigin.INSTANCE.m1961getCenterSzJe1aQ();
        this.drawBlock = lVar;
        this.invalidateParentLayer = aVar;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void updateDisplayList() {
        if (this.isDirty || !this.renderNode.getHasDisplayList()) {
            setDirty(false);
            Path clipPath = (!this.renderNode.getClipToOutline() || this.outlineResolver.getOutlineClipSupported()) ? null : this.outlineResolver.getClipPath();
            sn.l<? super Canvas, bn.r> lVar = this.drawBlock;
            if (lVar != null) {
                this.renderNode.record(this.canvasHolder, clipPath, lVar);
            }
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* JADX INFO: renamed from: updateLayerProperties-NHXXZp8 */
    public void mo3283updateLayerPropertiesNHXXZp8(float scaleX, float scaleY, float alpha, float translationX, float translationY, float shadowElevation, float rotationX, float rotationY, float rotationZ, float cameraDistance, long transformOrigin, @NotNull Shape shape, boolean clip, @Nullable RenderEffect renderEffect, long ambientShadowColor, long spotShadowColor, @NotNull LayoutDirection layoutDirection, @NotNull Density density) {
        sn.a<bn.r> aVar;
        tn.p.k(shape, "shape");
        tn.p.k(layoutDirection, "layoutDirection");
        tn.p.k(density, "density");
        this.transformOrigin = transformOrigin;
        boolean z10 = this.renderNode.getClipToOutline() && !this.outlineResolver.getOutlineClipSupported();
        this.renderNode.setScaleX(scaleX);
        this.renderNode.setScaleY(scaleY);
        this.renderNode.setAlpha(alpha);
        this.renderNode.setTranslationX(translationX);
        this.renderNode.setTranslationY(translationY);
        this.renderNode.setElevation(shadowElevation);
        this.renderNode.setAmbientShadowColor(ColorKt.m1674toArgb8_81llA(ambientShadowColor));
        this.renderNode.setSpotShadowColor(ColorKt.m1674toArgb8_81llA(spotShadowColor));
        this.renderNode.setRotationZ(rotationZ);
        this.renderNode.setRotationX(rotationX);
        this.renderNode.setRotationY(rotationY);
        this.renderNode.setCameraDistance(cameraDistance);
        this.renderNode.setPivotX(TransformOrigin.m1956getPivotFractionXimpl(transformOrigin) * this.renderNode.getWidth());
        this.renderNode.setPivotY(TransformOrigin.m1957getPivotFractionYimpl(transformOrigin) * this.renderNode.getHeight());
        this.renderNode.setClipToOutline(clip && shape != RectangleShapeKt.getRectangleShape());
        this.renderNode.setClipToBounds(clip && shape == RectangleShapeKt.getRectangleShape());
        this.renderNode.setRenderEffect(renderEffect);
        boolean zUpdate = this.outlineResolver.update(shape, this.renderNode.getAlpha(), this.renderNode.getClipToOutline(), this.renderNode.getElevation(), layoutDirection, density);
        this.renderNode.setOutline(this.outlineResolver.getOutline());
        boolean z11 = this.renderNode.getClipToOutline() && !this.outlineResolver.getOutlineClipSupported();
        if (z10 != z11 || (z11 && zUpdate)) {
            invalidate();
        } else {
            triggerRepaint();
        }
        if (!this.drawnWithZ && this.renderNode.getElevation() > 0.0f && (aVar = this.invalidateParentLayer) != null) {
            aVar.invoke();
        }
        this.matrixCache.invalidate();
    }
}
