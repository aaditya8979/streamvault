package androidx.compose.foundation;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.EdgeEffect;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.Velocity;
import bn.r;
import cn.w;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: AndroidOverscroll.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010f\u001a\u00020e\u0012\u0006\u0010:\u001a\u000209¢\u0006\u0004\bg\u0010hJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J \u0010\n\u001a\u00020\u0002*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\n\u0010\t\u001a\u00060\u0007j\u0002`\bH\u0002J \u0010\f\u001a\u00020\u0002*\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00052\n\u0010\t\u001a\u00060\u0007j\u0002`\bH\u0002J \u0010\u000e\u001a\u00020\u0002*\u00020\u00042\u0006\u0010\r\u001a\u00020\u00052\n\u0010\t\u001a\u00060\u0007j\u0002`\bH\u0002J \u0010\u0010\u001a\u00020\u0002*\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00052\n\u0010\t\u001a\u00060\u0007j\u0002`\bH\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0002J\b\u0010\u0013\u001a\u00020\u0011H\u0002J\u001d\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0014H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010 \u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0014H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010\u001dJ%\u0010\"\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0014H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\u001dJ%\u0010$\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0014H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010\u001dJ/\u0010+\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u00142\b\u0010&\u001a\u0004\u0018\u00010\u00142\u0006\u0010(\u001a\u00020'H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b)\u0010*J7\u00100\u001a\u00020\u00112\u0006\u0010,\u001a\u00020\u00142\u0006\u0010-\u001a\u00020\u00142\b\u0010&\u001a\u0004\u0018\u00010\u00142\u0006\u0010(\u001a\u00020'H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b.\u0010/J!\u00105\u001a\u0002012\u0006\u00102\u001a\u000201H\u0096@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b3\u00104J!\u00107\u001a\u00020\u00112\u0006\u00102\u001a\u000201H\u0096@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b6\u00104J\n\u00108\u001a\u00020\u0011*\u00020\u0004R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010<\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010>\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010=R\u0014\u0010?\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010=R\u0014\u0010@\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010=R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00050A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010D\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010=R\u0014\u0010E\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010=R\u0014\u0010F\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010=R\u0014\u0010G\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010=R\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00110H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR(\u0010K\u001a\u00020\u00028\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bK\u0010L\u0012\u0004\bQ\u0010R\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u0016\u0010S\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010LR\u001f\u0010U\u001a\u00020T8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\bU\u0010VR\u001a\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010JR*\u0010Y\u001a\u00020\u00022\u0006\u0010X\u001a\u00020\u00028V@VX\u0096\u000e¢\u0006\u0012\n\u0004\bY\u0010L\u001a\u0004\bY\u0010N\"\u0004\bZ\u0010PR#\u0010]\u001a\u000e\u0012\u0004\u0012\u00020\\\u0012\u0004\u0012\u00020\u00110[8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b]\u0010^R\u001a\u0010`\u001a\u00020_8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\bb\u0010cR\u0014\u0010d\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bd\u0010N\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006i"}, d2 = {"Landroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect;", "Landroidx/compose/foundation/OverscrollEffect;", "", "stopOverscrollAnimation", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroid/widget/EdgeEffect;", "left", "Landroid/graphics/Canvas;", "Landroidx/compose/ui/graphics/NativeCanvas;", "canvas", "drawLeft", "top", "drawTop", "right", "drawRight", "bottom", "drawBottom", "Lbn/r;", "invalidateOverscroll", "animateToRelease", "Landroidx/compose/ui/geometry/Offset;", "delta", "releaseOppositeOverscroll-k-4lQ0M", "(J)Z", "releaseOppositeOverscroll", "scroll", "displacement", "", "pullTop-0a9Yr6o", "(JJ)F", "pullTop", "pullBottom-0a9Yr6o", "pullBottom", "pullLeft-0a9Yr6o", "pullLeft", "pullRight-0a9Yr6o", "pullRight", "scrollDelta", "pointerPosition", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "source", "consumePreScroll-A0NYTsA", "(JLandroidx/compose/ui/geometry/Offset;I)J", "consumePreScroll", "initialDragDelta", "overscrollDelta", "consumePostScroll-l7mfB5k", "(JJLandroidx/compose/ui/geometry/Offset;I)V", "consumePostScroll", "Landroidx/compose/ui/unit/Velocity;", "velocity", "consumePreFling-QWom1Mo", "(JLhn/c;)Ljava/lang/Object;", "consumePreFling", "consumePostFling-sF-c-tU", "consumePostFling", "drawOverscroll", "Landroidx/compose/foundation/OverscrollConfiguration;", "overscrollConfig", "Landroidx/compose/foundation/OverscrollConfiguration;", "topEffect", "Landroid/widget/EdgeEffect;", "bottomEffect", "leftEffect", "rightEffect", "", "allEffects", "Ljava/util/List;", "topEffectNegation", "bottomEffectNegation", "leftEffectNegation", "rightEffectNegation", "Landroidx/compose/runtime/MutableState;", "redrawSignal", "Landroidx/compose/runtime/MutableState;", "invalidationEnabled", "Z", "getInvalidationEnabled$foundation_release", "()Z", "setInvalidationEnabled$foundation_release", "(Z)V", "getInvalidationEnabled$foundation_release$annotations", "()V", "scrollCycleInProgress", "Landroidx/compose/ui/geometry/Size;", "containerSize", "J", "isEnabledState", "value", "isEnabled", "setEnabled", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/IntSize;", "onNewSize", "Lsn/l;", "Landroidx/compose/ui/Modifier;", "effectModifier", "Landroidx/compose/ui/Modifier;", "getEffectModifier", "()Landroidx/compose/ui/Modifier;", "isInProgress", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "<init>", "(Landroid/content/Context;Landroidx/compose/foundation/OverscrollConfiguration;)V", "foundation_release"}, k = 1, mv = {1, 6, 0})
public final class AndroidEdgeEffectOverscrollEffect implements OverscrollEffect {

    @NotNull
    private final List<EdgeEffect> allEffects;

    @NotNull
    private final EdgeEffect bottomEffect;

    @NotNull
    private final EdgeEffect bottomEffectNegation;
    private long containerSize;

    @NotNull
    private final Modifier effectModifier;
    private boolean invalidationEnabled;
    private boolean isEnabled;

    @NotNull
    private final MutableState<Boolean> isEnabledState;

    @NotNull
    private final EdgeEffect leftEffect;

    @NotNull
    private final EdgeEffect leftEffectNegation;

    @NotNull
    private final l<IntSize, r> onNewSize;

    @NotNull
    private final OverscrollConfiguration overscrollConfig;

    @NotNull
    private final MutableState<r> redrawSignal;

    @NotNull
    private final EdgeEffect rightEffect;

    @NotNull
    private final EdgeEffect rightEffectNegation;
    private boolean scrollCycleInProgress;

    @NotNull
    private final EdgeEffect topEffect;

    @NotNull
    private final EdgeEffect topEffectNegation;

    public AndroidEdgeEffectOverscrollEffect(@NotNull Context context, @NotNull OverscrollConfiguration overscrollConfiguration) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        p.k(overscrollConfiguration, "overscrollConfig");
        this.overscrollConfig = overscrollConfiguration;
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
        EdgeEffect edgeEffectCreate = edgeEffectCompat.create(context, null);
        this.topEffect = edgeEffectCreate;
        EdgeEffect edgeEffectCreate2 = edgeEffectCompat.create(context, null);
        this.bottomEffect = edgeEffectCreate2;
        EdgeEffect edgeEffectCreate3 = edgeEffectCompat.create(context, null);
        this.leftEffect = edgeEffectCreate3;
        EdgeEffect edgeEffectCreate4 = edgeEffectCompat.create(context, null);
        this.rightEffect = edgeEffectCreate4;
        List<EdgeEffect> listP = w.p(edgeEffectCreate3, edgeEffectCreate, edgeEffectCreate4, edgeEffectCreate2);
        this.allEffects = listP;
        this.topEffectNegation = edgeEffectCompat.create(context, null);
        this.bottomEffectNegation = edgeEffectCompat.create(context, null);
        this.leftEffectNegation = edgeEffectCompat.create(context, null);
        this.rightEffectNegation = edgeEffectCompat.create(context, null);
        int size = listP.size();
        for (int i10 = 0; i10 < size; i10++) {
            listP.get(i10).setColor(ColorKt.m1674toArgb8_81llA(this.overscrollConfig.getGlowColor()));
        }
        this.redrawSignal = SnapshotStateKt.mutableStateOf(r.f5635a, SnapshotStateKt.neverEqualPolicy());
        this.invalidationEnabled = true;
        this.containerSize = Size.INSTANCE.m1461getZeroNHjbRc();
        this.isEnabledState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        l<IntSize, r> lVar = new l<IntSize, r>() { // from class: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$onNewSize$1
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(IntSize intSize) {
                m160invokeozmzZPI(intSize.getPackedValue());
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke-ozmzZPI, reason: not valid java name */
            public final void m160invokeozmzZPI(long j10) {
                boolean z10 = !Size.m1448equalsimpl0(IntSizeKt.m3996toSizeozmzZPI(j10), this.this$0.containerSize);
                this.this$0.containerSize = IntSizeKt.m3996toSizeozmzZPI(j10);
                if (z10) {
                    this.this$0.topEffect.setSize(IntSize.m3986getWidthimpl(j10), IntSize.m3985getHeightimpl(j10));
                    this.this$0.bottomEffect.setSize(IntSize.m3986getWidthimpl(j10), IntSize.m3985getHeightimpl(j10));
                    this.this$0.leftEffect.setSize(IntSize.m3985getHeightimpl(j10), IntSize.m3986getWidthimpl(j10));
                    this.this$0.rightEffect.setSize(IntSize.m3985getHeightimpl(j10), IntSize.m3986getWidthimpl(j10));
                    this.this$0.topEffectNegation.setSize(IntSize.m3986getWidthimpl(j10), IntSize.m3985getHeightimpl(j10));
                    this.this$0.bottomEffectNegation.setSize(IntSize.m3986getWidthimpl(j10), IntSize.m3985getHeightimpl(j10));
                    this.this$0.leftEffectNegation.setSize(IntSize.m3985getHeightimpl(j10), IntSize.m3986getWidthimpl(j10));
                    this.this$0.rightEffectNegation.setSize(IntSize.m3985getHeightimpl(j10), IntSize.m3986getWidthimpl(j10));
                }
                if (z10) {
                    this.this$0.invalidateOverscroll();
                    this.this$0.animateToRelease();
                }
            }
        };
        this.onNewSize = lVar;
        this.effectModifier = OnRemeasuredModifierKt.onSizeChanged(Modifier.INSTANCE.then(AndroidOverscrollKt.StretchOverscrollNonClippingLayer), lVar).then(new DrawOverscrollModifier(this, InspectableValueKt.isDebugInspectorInfoEnabled() ? new l<InspectorInfo, r>() { // from class: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$special$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("overscroll");
                inspectorInfo.setValue(this.this$0);
            }
        } : InspectableValueKt.getNoInspectorInfo()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void animateToRelease() {
        List<EdgeEffect> list = this.allEffects;
        int size = list.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            EdgeEffect edgeEffect = list.get(i10);
            edgeEffect.onRelease();
            z10 = edgeEffect.isFinished() || z10;
        }
        if (z10) {
            invalidateOverscroll();
        }
    }

    private final boolean drawBottom(DrawScope drawScope, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(180.0f);
        canvas.translate(-Size.m1452getWidthimpl(this.containerSize), (-Size.m1449getHeightimpl(this.containerSize)) + drawScope.mo306toPx0680j_4(this.overscrollConfig.getDrawPadding().getBottom()));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    private final boolean drawLeft(DrawScope drawScope, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(270.0f);
        canvas.translate(-Size.m1449getHeightimpl(this.containerSize), drawScope.mo306toPx0680j_4(this.overscrollConfig.getDrawPadding().mo392calculateLeftPaddingu2uoSUM(drawScope.getLayoutDirection())));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    private final boolean drawRight(DrawScope drawScope, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        int iD = vn.c.d(Size.m1452getWidthimpl(this.containerSize));
        float fMo393calculateRightPaddingu2uoSUM = this.overscrollConfig.getDrawPadding().mo393calculateRightPaddingu2uoSUM(drawScope.getLayoutDirection());
        canvas.rotate(90.0f);
        canvas.translate(0.0f, (-iD) + drawScope.mo306toPx0680j_4(fMo393calculateRightPaddingu2uoSUM));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    private final boolean drawTop(DrawScope drawScope, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.translate(0.0f, drawScope.mo306toPx0680j_4(this.overscrollConfig.getDrawPadding().getTop()));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    @VisibleForTesting
    public static /* synthetic */ void getInvalidationEnabled$foundation_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void invalidateOverscroll() {
        if (this.invalidationEnabled) {
            this.redrawSignal.setValue(r.f5635a);
        }
    }

    /* JADX INFO: renamed from: pullBottom-0a9Yr6o, reason: not valid java name */
    private final float m151pullBottom0a9Yr6o(long scroll, long displacement) {
        return (-EdgeEffectCompat.INSTANCE.onPullDistanceCompat(this.bottomEffect, -(Offset.m1384getYimpl(scroll) / Size.m1449getHeightimpl(this.containerSize)), 1 - (Offset.m1383getXimpl(displacement) / Size.m1452getWidthimpl(this.containerSize)))) * Size.m1449getHeightimpl(this.containerSize);
    }

    /* JADX INFO: renamed from: pullLeft-0a9Yr6o, reason: not valid java name */
    private final float m152pullLeft0a9Yr6o(long scroll, long displacement) {
        return EdgeEffectCompat.INSTANCE.onPullDistanceCompat(this.leftEffect, Offset.m1383getXimpl(scroll) / Size.m1452getWidthimpl(this.containerSize), 1 - (Offset.m1384getYimpl(displacement) / Size.m1449getHeightimpl(this.containerSize))) * Size.m1452getWidthimpl(this.containerSize);
    }

    /* JADX INFO: renamed from: pullRight-0a9Yr6o, reason: not valid java name */
    private final float m153pullRight0a9Yr6o(long scroll, long displacement) {
        return (-EdgeEffectCompat.INSTANCE.onPullDistanceCompat(this.rightEffect, -(Offset.m1383getXimpl(scroll) / Size.m1452getWidthimpl(this.containerSize)), Offset.m1384getYimpl(displacement) / Size.m1449getHeightimpl(this.containerSize))) * Size.m1452getWidthimpl(this.containerSize);
    }

    /* JADX INFO: renamed from: pullTop-0a9Yr6o, reason: not valid java name */
    private final float m154pullTop0a9Yr6o(long scroll, long displacement) {
        float fM1383getXimpl = Offset.m1383getXimpl(displacement) / Size.m1452getWidthimpl(this.containerSize);
        return EdgeEffectCompat.INSTANCE.onPullDistanceCompat(this.topEffect, Offset.m1384getYimpl(scroll) / Size.m1449getHeightimpl(this.containerSize), fM1383getXimpl) * Size.m1449getHeightimpl(this.containerSize);
    }

    /* JADX INFO: renamed from: releaseOppositeOverscroll-k-4lQ0M, reason: not valid java name */
    private final boolean m155releaseOppositeOverscrollk4lQ0M(long delta) {
        boolean zIsFinished;
        if (this.leftEffect.isFinished() || Offset.m1383getXimpl(delta) >= 0.0f) {
            zIsFinished = false;
        } else {
            this.leftEffect.onRelease();
            zIsFinished = this.leftEffect.isFinished();
        }
        if (!this.rightEffect.isFinished() && Offset.m1383getXimpl(delta) > 0.0f) {
            this.rightEffect.onRelease();
            zIsFinished = zIsFinished || this.rightEffect.isFinished();
        }
        if (!this.topEffect.isFinished() && Offset.m1384getYimpl(delta) < 0.0f) {
            this.topEffect.onRelease();
            zIsFinished = zIsFinished || this.topEffect.isFinished();
        }
        if (this.bottomEffect.isFinished() || Offset.m1384getYimpl(delta) <= 0.0f) {
            return zIsFinished;
        }
        this.bottomEffect.onRelease();
        return zIsFinished || this.bottomEffect.isFinished();
    }

    private final boolean stopOverscrollAnimation() {
        boolean z10;
        long jM1462getCenteruvyYCjk = SizeKt.m1462getCenteruvyYCjk(this.containerSize);
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
        if (edgeEffectCompat.getDistanceCompat(this.leftEffect) == 0.0f) {
            z10 = false;
        } else {
            m152pullLeft0a9Yr6o(Offset.INSTANCE.m1399getZeroF1C5BW0(), jM1462getCenteruvyYCjk);
            z10 = true;
        }
        if (!(edgeEffectCompat.getDistanceCompat(this.rightEffect) == 0.0f)) {
            m153pullRight0a9Yr6o(Offset.INSTANCE.m1399getZeroF1C5BW0(), jM1462getCenteruvyYCjk);
            z10 = true;
        }
        if (!(edgeEffectCompat.getDistanceCompat(this.topEffect) == 0.0f)) {
            m154pullTop0a9Yr6o(Offset.INSTANCE.m1399getZeroF1C5BW0(), jM1462getCenteruvyYCjk);
            z10 = true;
        }
        if (edgeEffectCompat.getDistanceCompat(this.bottomEffect) == 0.0f) {
            return z10;
        }
        m151pullBottom0a9Yr6o(Offset.INSTANCE.m1399getZeroF1C5BW0(), jM1462getCenteruvyYCjk);
        return true;
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    @Nullable
    /* JADX INFO: renamed from: consumePostFling-sF-c-tU, reason: not valid java name */
    public Object mo156consumePostFlingsFctU(long j10, @NotNull hn.c<? super r> cVar) {
        this.scrollCycleInProgress = false;
        if (Velocity.m4051getXimpl(j10) > 0.0f) {
            EdgeEffectCompat.INSTANCE.onAbsorbCompat(this.leftEffect, vn.c.d(Velocity.m4051getXimpl(j10)));
        } else if (Velocity.m4051getXimpl(j10) < 0.0f) {
            EdgeEffectCompat.INSTANCE.onAbsorbCompat(this.rightEffect, -vn.c.d(Velocity.m4051getXimpl(j10)));
        }
        if (Velocity.m4052getYimpl(j10) > 0.0f) {
            EdgeEffectCompat.INSTANCE.onAbsorbCompat(this.topEffect, vn.c.d(Velocity.m4052getYimpl(j10)));
        } else if (Velocity.m4052getYimpl(j10) < 0.0f) {
            EdgeEffectCompat.INSTANCE.onAbsorbCompat(this.bottomEffect, -vn.c.d(Velocity.m4052getYimpl(j10)));
        }
        if (!Velocity.m4050equalsimpl0(j10, Velocity.INSTANCE.m4062getZero9UxMQ8M())) {
            invalidateOverscroll();
        }
        animateToRelease();
        return r.f5635a;
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    /* JADX INFO: renamed from: consumePostScroll-l7mfB5k, reason: not valid java name */
    public void mo157consumePostScrolll7mfB5k(long initialDragDelta, long overscrollDelta, @Nullable Offset pointerPosition, int source) {
        boolean z10;
        boolean z11 = true;
        if (NestedScrollSource.m2881equalsimpl0(source, NestedScrollSource.INSTANCE.m2886getDragWNlRxjI())) {
            long packedValue = pointerPosition != null ? pointerPosition.getPackedValue() : SizeKt.m1462getCenteruvyYCjk(this.containerSize);
            if (Offset.m1383getXimpl(overscrollDelta) > 0.0f) {
                m152pullLeft0a9Yr6o(overscrollDelta, packedValue);
            } else if (Offset.m1383getXimpl(overscrollDelta) < 0.0f) {
                m153pullRight0a9Yr6o(overscrollDelta, packedValue);
            }
            if (Offset.m1384getYimpl(overscrollDelta) > 0.0f) {
                m154pullTop0a9Yr6o(overscrollDelta, packedValue);
            } else if (Offset.m1384getYimpl(overscrollDelta) < 0.0f) {
                m151pullBottom0a9Yr6o(overscrollDelta, packedValue);
            }
            z10 = !Offset.m1380equalsimpl0(overscrollDelta, Offset.INSTANCE.m1399getZeroF1C5BW0());
        } else {
            z10 = false;
        }
        if (!m155releaseOppositeOverscrollk4lQ0M(initialDragDelta) && !z10) {
            z11 = false;
        }
        if (z11) {
            invalidateOverscroll();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    @Override // androidx.compose.foundation.OverscrollEffect
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: consumePreFling-QWom1Mo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo158consumePreFlingQWom1Mo(long r6, @org.jetbrains.annotations.NotNull hn.c<? super androidx.compose.ui.unit.Velocity> r8) {
        /*
            r5 = this;
            float r8 = androidx.compose.ui.unit.Velocity.m4051getXimpl(r6)
            r0 = 0
            int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            r1 = 1
            r2 = 0
            if (r8 <= 0) goto L2e
            androidx.compose.foundation.EdgeEffectCompat r8 = androidx.compose.foundation.EdgeEffectCompat.INSTANCE
            android.widget.EdgeEffect r3 = r5.leftEffect
            float r3 = r8.getDistanceCompat(r3)
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 != 0) goto L19
            r3 = r1
            goto L1a
        L19:
            r3 = r2
        L1a:
            if (r3 != 0) goto L2e
            android.widget.EdgeEffect r3 = r5.leftEffect
            float r4 = androidx.compose.ui.unit.Velocity.m4051getXimpl(r6)
            int r4 = vn.c.d(r4)
            r8.onAbsorbCompat(r3, r4)
            float r8 = androidx.compose.ui.unit.Velocity.m4051getXimpl(r6)
            goto L5b
        L2e:
            float r8 = androidx.compose.ui.unit.Velocity.m4051getXimpl(r6)
            int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r8 >= 0) goto L5a
            androidx.compose.foundation.EdgeEffectCompat r8 = androidx.compose.foundation.EdgeEffectCompat.INSTANCE
            android.widget.EdgeEffect r3 = r5.rightEffect
            float r3 = r8.getDistanceCompat(r3)
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 != 0) goto L44
            r3 = r1
            goto L45
        L44:
            r3 = r2
        L45:
            if (r3 != 0) goto L5a
            android.widget.EdgeEffect r3 = r5.rightEffect
            float r4 = androidx.compose.ui.unit.Velocity.m4051getXimpl(r6)
            int r4 = vn.c.d(r4)
            int r4 = -r4
            r8.onAbsorbCompat(r3, r4)
            float r8 = androidx.compose.ui.unit.Velocity.m4051getXimpl(r6)
            goto L5b
        L5a:
            r8 = r0
        L5b:
            float r3 = androidx.compose.ui.unit.Velocity.m4052getYimpl(r6)
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 <= 0) goto L86
            androidx.compose.foundation.EdgeEffectCompat r3 = androidx.compose.foundation.EdgeEffectCompat.INSTANCE
            android.widget.EdgeEffect r4 = r5.topEffect
            float r4 = r3.getDistanceCompat(r4)
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 != 0) goto L71
            r4 = r1
            goto L72
        L71:
            r4 = r2
        L72:
            if (r4 != 0) goto L86
            android.widget.EdgeEffect r0 = r5.topEffect
            float r1 = androidx.compose.ui.unit.Velocity.m4052getYimpl(r6)
            int r1 = vn.c.d(r1)
            r3.onAbsorbCompat(r0, r1)
            float r0 = androidx.compose.ui.unit.Velocity.m4052getYimpl(r6)
            goto Lb0
        L86:
            float r3 = androidx.compose.ui.unit.Velocity.m4052getYimpl(r6)
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 >= 0) goto Lb0
            androidx.compose.foundation.EdgeEffectCompat r3 = androidx.compose.foundation.EdgeEffectCompat.INSTANCE
            android.widget.EdgeEffect r4 = r5.bottomEffect
            float r4 = r3.getDistanceCompat(r4)
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 != 0) goto L9b
            goto L9c
        L9b:
            r1 = r2
        L9c:
            if (r1 != 0) goto Lb0
            android.widget.EdgeEffect r0 = r5.bottomEffect
            float r1 = androidx.compose.ui.unit.Velocity.m4052getYimpl(r6)
            int r1 = vn.c.d(r1)
            int r1 = -r1
            r3.onAbsorbCompat(r0, r1)
            float r0 = androidx.compose.ui.unit.Velocity.m4052getYimpl(r6)
        Lb0:
            long r6 = androidx.compose.ui.unit.VelocityKt.Velocity(r8, r0)
            androidx.compose.ui.unit.Velocity$Companion r8 = androidx.compose.ui.unit.Velocity.INSTANCE
            long r0 = r8.m4062getZero9UxMQ8M()
            boolean r8 = androidx.compose.ui.unit.Velocity.m4050equalsimpl0(r6, r0)
            if (r8 != 0) goto Lc3
            r5.invalidateOverscroll()
        Lc3:
            androidx.compose.ui.unit.Velocity r6 = androidx.compose.ui.unit.Velocity.m4042boximpl(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.mo158consumePreFlingQWom1Mo(long, hn.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0026  */
    @Override // androidx.compose.foundation.OverscrollEffect
    /* JADX INFO: renamed from: consumePreScroll-A0NYTsA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long mo159consumePreScrollA0NYTsA(long r7, @org.jetbrains.annotations.Nullable androidx.compose.ui.geometry.Offset r9, int r10) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.mo159consumePreScrollA0NYTsA(long, androidx.compose.ui.geometry.Offset, int):long");
    }

    public final void drawOverscroll(@NotNull DrawScope drawScope) {
        boolean zDrawLeft;
        p.k(drawScope, "<this>");
        androidx.compose.ui.graphics.Canvas canvas = drawScope.getDrawContext().getCanvas();
        this.redrawSignal.getValue();
        Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(canvas);
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
        boolean z10 = true;
        if (!(edgeEffectCompat.getDistanceCompat(this.leftEffectNegation) == 0.0f)) {
            drawRight(drawScope, this.leftEffectNegation, nativeCanvas);
            this.leftEffectNegation.finish();
        }
        if (this.leftEffect.isFinished()) {
            zDrawLeft = false;
        } else {
            zDrawLeft = drawLeft(drawScope, this.leftEffect, nativeCanvas);
            edgeEffectCompat.onPullDistanceCompat(this.leftEffectNegation, edgeEffectCompat.getDistanceCompat(this.leftEffect), 0.0f);
        }
        if (!(edgeEffectCompat.getDistanceCompat(this.topEffectNegation) == 0.0f)) {
            drawBottom(drawScope, this.topEffectNegation, nativeCanvas);
            this.topEffectNegation.finish();
        }
        if (!this.topEffect.isFinished()) {
            zDrawLeft = drawTop(drawScope, this.topEffect, nativeCanvas) || zDrawLeft;
            edgeEffectCompat.onPullDistanceCompat(this.topEffectNegation, edgeEffectCompat.getDistanceCompat(this.topEffect), 0.0f);
        }
        if (!(edgeEffectCompat.getDistanceCompat(this.rightEffectNegation) == 0.0f)) {
            drawLeft(drawScope, this.rightEffectNegation, nativeCanvas);
            this.rightEffectNegation.finish();
        }
        if (!this.rightEffect.isFinished()) {
            zDrawLeft = drawRight(drawScope, this.rightEffect, nativeCanvas) || zDrawLeft;
            edgeEffectCompat.onPullDistanceCompat(this.rightEffectNegation, edgeEffectCompat.getDistanceCompat(this.rightEffect), 0.0f);
        }
        if (!(edgeEffectCompat.getDistanceCompat(this.bottomEffectNegation) == 0.0f)) {
            drawTop(drawScope, this.bottomEffectNegation, nativeCanvas);
            this.bottomEffectNegation.finish();
        }
        if (!this.bottomEffect.isFinished()) {
            if (!drawBottom(drawScope, this.bottomEffect, nativeCanvas) && !zDrawLeft) {
                z10 = false;
            }
            edgeEffectCompat.onPullDistanceCompat(this.bottomEffectNegation, edgeEffectCompat.getDistanceCompat(this.bottomEffect), 0.0f);
            zDrawLeft = z10;
        }
        if (zDrawLeft) {
            invalidateOverscroll();
        }
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    @NotNull
    public Modifier getEffectModifier() {
        return this.effectModifier;
    }

    /* JADX INFO: renamed from: getInvalidationEnabled$foundation_release, reason: from getter */
    public final boolean getInvalidationEnabled() {
        return this.invalidationEnabled;
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    /* JADX INFO: renamed from: isEnabled */
    public boolean getIsEnabled() {
        return this.isEnabledState.getValue().booleanValue();
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    public boolean isInProgress() {
        List<EdgeEffect> list = this.allEffects;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!(EdgeEffectCompat.INSTANCE.getDistanceCompat(list.get(i10)) == 0.0f)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    public void setEnabled(boolean z10) {
        boolean z11 = this.isEnabled != z10;
        this.isEnabledState.setValue(Boolean.valueOf(z10));
        this.isEnabled = z10;
        if (z11) {
            this.scrollCycleInProgress = false;
            animateToRelease();
        }
    }

    public final void setInvalidationEnabled$foundation_release(boolean z10) {
        this.invalidationEnabled = z10;
    }
}
