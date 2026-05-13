package androidx.compose.ui.node;

import androidx.compose.ui.draw.BuildDrawCacheParams;
import androidx.compose.ui.draw.DrawCacheModifier;
import androidx.compose.ui.draw.DrawModifier;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import bn.r;
import io.bidmachine.iab.vast.tags.VastTagName;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: DrawEntity.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u001eB\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001b\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0006\u0010\b\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/node/DrawEntity;", "Landroidx/compose/ui/node/LayoutNodeEntity;", "Landroidx/compose/ui/draw/DrawModifier;", "Landroidx/compose/ui/node/OwnerScope;", "Landroidx/compose/ui/draw/DrawCacheModifier;", "updateCacheDrawModifier", "Lbn/r;", "onAttach", "onMeasureResultChanged", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "draw", "cacheDrawModifier", "Landroidx/compose/ui/draw/DrawCacheModifier;", "Landroidx/compose/ui/draw/BuildDrawCacheParams;", "buildCacheParams", "Landroidx/compose/ui/draw/BuildDrawCacheParams;", "", "invalidateCache", "Z", "Lkotlin/Function0;", "updateCache", "Lsn/a;", "isValid", "()Z", "Landroidx/compose/ui/node/LayoutNodeWrapper;", "layoutNodeWrapper", "modifier", "<init>", "(Landroidx/compose/ui/node/LayoutNodeWrapper;Landroidx/compose/ui/draw/DrawModifier;)V", VastTagName.COMPANION, "ui_release"}, k = 1, mv = {1, 6, 0})
public final class DrawEntity extends LayoutNodeEntity<DrawEntity, DrawModifier> implements OwnerScope {

    @NotNull
    private static final l<DrawEntity, r> onCommitAffectingDrawEntity = new l<DrawEntity, r>() { // from class: androidx.compose.ui.node.DrawEntity$Companion$onCommitAffectingDrawEntity$1
        @Override // sn.l
        public /* bridge */ /* synthetic */ r invoke(DrawEntity drawEntity) {
            invoke2(drawEntity);
            return r.f5635a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull DrawEntity drawEntity) {
            p.k(drawEntity, "drawEntity");
            if (drawEntity.isValid()) {
                drawEntity.invalidateCache = true;
                drawEntity.getLayoutNodeWrapper().invalidateLayer();
            }
        }
    };

    @NotNull
    private final BuildDrawCacheParams buildCacheParams;

    @Nullable
    private DrawCacheModifier cacheDrawModifier;
    private boolean invalidateCache;

    @NotNull
    private final sn.a<r> updateCache;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawEntity(@NotNull final LayoutNodeWrapper layoutNodeWrapper, @NotNull DrawModifier drawModifier) {
        super(layoutNodeWrapper, drawModifier);
        p.k(layoutNodeWrapper, "layoutNodeWrapper");
        p.k(drawModifier, "modifier");
        this.cacheDrawModifier = updateCacheDrawModifier();
        this.buildCacheParams = new BuildDrawCacheParams() { // from class: androidx.compose.ui.node.DrawEntity$buildCacheParams$1

            @NotNull
            private final Density density;

            {
                this.density = this.this$0.getLayoutNode().getDensity();
            }

            @Override // androidx.compose.ui.draw.BuildDrawCacheParams
            @NotNull
            public Density getDensity() {
                return this.density;
            }

            @Override // androidx.compose.ui.draw.BuildDrawCacheParams
            @NotNull
            public LayoutDirection getLayoutDirection() {
                return this.this$0.getLayoutNode().getLayoutDirection();
            }

            @Override // androidx.compose.ui.draw.BuildDrawCacheParams
            /* JADX INFO: renamed from: getSize-NH-jbRc */
            public long mo1305getSizeNHjbRc() {
                return IntSizeKt.m3996toSizeozmzZPI(layoutNodeWrapper.mo3114getSizeYbymL2g());
            }
        };
        this.invalidateCache = true;
        this.updateCache = new sn.a<r>() { // from class: androidx.compose.ui.node.DrawEntity$updateCache$1
            {
                super(0);
            }

            @Override // sn.a
            public /* bridge */ /* synthetic */ r invoke() {
                invoke2();
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                DrawCacheModifier drawCacheModifier = this.this$0.cacheDrawModifier;
                if (drawCacheModifier != null) {
                    drawCacheModifier.onBuildCache(this.this$0.buildCacheParams);
                }
                this.this$0.invalidateCache = false;
            }
        };
    }

    private final DrawCacheModifier updateCacheDrawModifier() {
        DrawModifier modifier = getModifier();
        if (modifier instanceof DrawCacheModifier) {
            return (DrawCacheModifier) modifier;
        }
        return null;
    }

    public final void draw(@NotNull Canvas canvas) {
        p.k(canvas, "canvas");
        long jM3996toSizeozmzZPI = IntSizeKt.m3996toSizeozmzZPI(m3248getSizeYbymL2g());
        if (this.cacheDrawModifier != null && this.invalidateCache) {
            LayoutNodeKt.requireOwner(getLayoutNode()).getSnapshotObserver().observeReads$ui_release(this, onCommitAffectingDrawEntity, this.updateCache);
        }
        LayoutNodeDrawScope mDrawScope$ui_release = getLayoutNode().getMDrawScope$ui_release();
        LayoutNodeWrapper layoutNodeWrapper = getLayoutNodeWrapper();
        DrawEntity drawEntity = mDrawScope$ui_release.drawEntity;
        mDrawScope$ui_release.drawEntity = this;
        CanvasDrawScope canvasDrawScope = mDrawScope$ui_release.canvasDrawScope;
        MeasureScope measureScope = layoutNodeWrapper.getMeasureScope();
        LayoutDirection layoutDirection = layoutNodeWrapper.getMeasureScope().getLayoutDirection();
        CanvasDrawScope.DrawParams drawParams = canvasDrawScope.getDrawParams();
        Density density = drawParams.getDensity();
        LayoutDirection layoutDirection2 = drawParams.getLayoutDirection();
        Canvas canvas2 = drawParams.getCanvas();
        long size = drawParams.getSize();
        CanvasDrawScope.DrawParams drawParams2 = canvasDrawScope.getDrawParams();
        drawParams2.setDensity(measureScope);
        drawParams2.setLayoutDirection(layoutDirection);
        drawParams2.setCanvas(canvas);
        drawParams2.m2037setSizeuvyYCjk(jM3996toSizeozmzZPI);
        canvas.save();
        getModifier().draw(mDrawScope$ui_release);
        canvas.restore();
        CanvasDrawScope.DrawParams drawParams3 = canvasDrawScope.getDrawParams();
        drawParams3.setDensity(density);
        drawParams3.setLayoutDirection(layoutDirection2);
        drawParams3.setCanvas(canvas2);
        drawParams3.m2037setSizeuvyYCjk(size);
        mDrawScope$ui_release.drawEntity = drawEntity;
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public boolean isValid() {
        return getLayoutNodeWrapper().isAttached();
    }

    @Override // androidx.compose.ui.node.LayoutNodeEntity
    public void onAttach() {
        this.cacheDrawModifier = updateCacheDrawModifier();
        this.invalidateCache = true;
        super.onAttach();
    }

    public final void onMeasureResultChanged() {
        this.invalidateCache = true;
    }
}
