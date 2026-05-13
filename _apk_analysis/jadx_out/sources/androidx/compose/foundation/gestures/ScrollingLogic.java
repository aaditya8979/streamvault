package androidx.compose.foundation.gestures;

import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import hn.c;
import jn.d;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: Scrollable.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010/\u001a\u00020(\u0012\f\u00105\u001a\b\u0012\u0004\u0012\u00020403\u0012\u0006\u0010:\u001a\u000209\u0012\u0006\u0010?\u001a\u00020>\u0012\b\u0010D\u001a\u0004\u0018\u00010C¢\u0006\u0004\bH\u0010IJ\u001a\u0010\u0006\u001a\u00020\u0003*\u00020\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\u0007*\u00020\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\b\u0010\u0005J\u0017\u0010\f\u001a\u00020\u0002*\u00020\u0003ø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u0002*\u00020\u0007ø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b\r\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\n\u0010\u0012\u001a\u00020\u0002*\u00020\u0002J\u0017\u0010\u0012\u001a\u00020\u0003*\u00020\u0003ø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b\u0013\u0010\u0014J1\u0010\u001c\u001a\u00020\u0003*\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0019\u001a\u00020\u0018ø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b\u001e\u0010\u0014J\u001b\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J!\u0010'\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u0007H\u0086@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b%\u0010&J\u0006\u0010)\u001a\u00020(R\u0017\u0010+\u001a\u00020*8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010/\u001a\u00020(8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001d\u00105\u001a\b\u0012\u0004\u0012\u000204038\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0017\u0010:\u001a\u0002098\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010?\u001a\u00020>8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0019\u0010D\u001a\u0004\u0018\u00010C8\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006J"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollingLogic;", "", "", "Landroidx/compose/ui/geometry/Offset;", "toOffset-tuRUvjQ", "(F)J", "toOffset", "Landroidx/compose/ui/unit/Velocity;", "toVelocity-adjELrA", "toVelocity", "toFloat-k-4lQ0M", "(J)F", "toFloat", "toFloat-TH1AsA0", "newValue", "update-QWom1Mo", "(JF)J", "update", "reverseIfNeeded", "reverseIfNeeded-MK-Hz9U", "(J)J", "Landroidx/compose/foundation/gestures/ScrollScope;", "scrollDelta", "pointerPosition", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "source", "dispatchScroll-f0eR0lY", "(Landroidx/compose/foundation/gestures/ScrollScope;JLandroidx/compose/ui/geometry/Offset;I)J", "dispatchScroll", "scroll", "performRawScroll-MK-Hz9U", "performRawScroll", "axisVelocity", "Lbn/r;", "onDragStopped", "(FLhn/c;)Ljava/lang/Object;", "available", "doFlingAnimation-QWom1Mo", "(JLhn/c;)Ljava/lang/Object;", "doFlingAnimation", "", "shouldScrollImmediately", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "getOrientation", "()Landroidx/compose/foundation/gestures/Orientation;", "reverseDirection", "Z", "getReverseDirection", "()Z", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "nestedScrollDispatcher", "Landroidx/compose/runtime/State;", "getNestedScrollDispatcher", "()Landroidx/compose/runtime/State;", "Landroidx/compose/foundation/gestures/ScrollableState;", "scrollableState", "Landroidx/compose/foundation/gestures/ScrollableState;", "getScrollableState", "()Landroidx/compose/foundation/gestures/ScrollableState;", "Landroidx/compose/foundation/gestures/FlingBehavior;", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "getFlingBehavior", "()Landroidx/compose/foundation/gestures/FlingBehavior;", "Landroidx/compose/foundation/OverscrollEffect;", "overscrollEffect", "Landroidx/compose/foundation/OverscrollEffect;", "getOverscrollEffect", "()Landroidx/compose/foundation/OverscrollEffect;", "<init>", "(Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/runtime/State;Landroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/foundation/gestures/FlingBehavior;Landroidx/compose/foundation/OverscrollEffect;)V", "foundation_release"}, k = 1, mv = {1, 6, 0})
final class ScrollingLogic {

    @NotNull
    private final FlingBehavior flingBehavior;

    @NotNull
    private final State<NestedScrollDispatcher> nestedScrollDispatcher;

    @NotNull
    private final Orientation orientation;

    @Nullable
    private final OverscrollEffect overscrollEffect;
    private final boolean reverseDirection;

    @NotNull
    private final ScrollableState scrollableState;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$1, reason: invalid class name */
    /* JADX INFO: compiled from: Scrollable.kt */
    @d(c = "androidx.compose.foundation.gestures.ScrollingLogic", f = "Scrollable.kt", l = {378, 383, 385, 387, 393}, m = "onDragStopped")
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class AnonymousClass1 extends ContinuationImpl {
        public float F$0;
        public long J$0;
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ScrollingLogic.this.onDragStopped(0.0f, this);
        }
    }

    public ScrollingLogic(@NotNull Orientation orientation, boolean z10, @NotNull State<NestedScrollDispatcher> state, @NotNull ScrollableState scrollableState, @NotNull FlingBehavior flingBehavior, @Nullable OverscrollEffect overscrollEffect) {
        p.k(orientation, "orientation");
        p.k(state, "nestedScrollDispatcher");
        p.k(scrollableState, "scrollableState");
        p.k(flingBehavior, "flingBehavior");
        this.orientation = orientation;
        this.reverseDirection = z10;
        this.nestedScrollDispatcher = state;
        this.scrollableState = scrollableState;
        this.flingBehavior = flingBehavior;
        this.overscrollEffect = overscrollEffect;
    }

    /* JADX INFO: renamed from: dispatchScroll-f0eR0lY, reason: not valid java name */
    public final long m313dispatchScrollf0eR0lY(@NotNull ScrollScope scrollScope, long j10, @Nullable Offset offset, int i10) {
        p.k(scrollScope, "$this$dispatchScroll");
        OverscrollEffect overscrollEffect = this.overscrollEffect;
        long jM1387minusMKHz9U = Offset.m1387minusMKHz9U(j10, (overscrollEffect == null || !overscrollEffect.isEnabled()) ? Offset.INSTANCE.m1399getZeroF1C5BW0() : this.overscrollEffect.mo159consumePreScrollA0NYTsA(j10, offset, i10));
        NestedScrollDispatcher value = this.nestedScrollDispatcher.getValue();
        long jM1387minusMKHz9U2 = Offset.m1387minusMKHz9U(jM1387minusMKHz9U, value.m2877dispatchPreScrollOzD1aCk(jM1387minusMKHz9U, i10));
        long jM316reverseIfNeededMKHz9U = m316reverseIfNeededMKHz9U(m319toOffsettuRUvjQ(scrollScope.scrollBy(m318toFloatk4lQ0M(m316reverseIfNeededMKHz9U(jM1387minusMKHz9U2)))));
        long jM1387minusMKHz9U3 = Offset.m1387minusMKHz9U(jM1387minusMKHz9U2, jM316reverseIfNeededMKHz9U);
        long jM2875dispatchPostScrollDzOQY0M = value.m2875dispatchPostScrollDzOQY0M(jM316reverseIfNeededMKHz9U, jM1387minusMKHz9U3, i10);
        OverscrollEffect overscrollEffect2 = this.overscrollEffect;
        if (overscrollEffect2 != null && overscrollEffect2.isEnabled()) {
            this.overscrollEffect.mo157consumePostScrolll7mfB5k(jM1387minusMKHz9U2, Offset.m1387minusMKHz9U(jM1387minusMKHz9U3, jM2875dispatchPostScrollDzOQY0M), offset, i10);
        }
        return jM1387minusMKHz9U3;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: doFlingAnimation-QWom1Mo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m314doFlingAnimationQWom1Mo(long r13, @org.jetbrains.annotations.NotNull hn.c<? super androidx.compose.ui.unit.Velocity> r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1
            if (r0 == 0) goto L13
            r0 = r15
            androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1 r0 = (androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1 r0 = new androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1
            r0.<init>(r12, r15)
        L18:
            r4 = r0
            java.lang.Object r15 = r4.result
            java.lang.Object r0 = in.a.g()
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2e
            java.lang.Object r13 = r4.L$0
            kotlin.jvm.internal.Ref$LongRef r13 = (kotlin.jvm.internal.Ref$LongRef) r13
            kotlin.c.b(r15)
            goto L5d
        L2e:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L36:
            kotlin.c.b(r15)
            kotlin.jvm.internal.Ref$LongRef r15 = new kotlin.jvm.internal.Ref$LongRef
            r15.<init>()
            r15.element = r13
            androidx.compose.foundation.gestures.ScrollableState r1 = r12.scrollableState
            r3 = 0
            androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2 r11 = new androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2
            r10 = 0
            r5 = r11
            r6 = r12
            r7 = r15
            r8 = r13
            r5.<init>(r6, r7, r8, r10)
            r5 = 1
            r6 = 0
            r4.L$0 = r15
            r4.label = r2
            r2 = r3
            r3 = r11
            java.lang.Object r13 = androidx.compose.foundation.gestures.ScrollableState.scroll$default(r1, r2, r3, r4, r5, r6)
            if (r13 != r0) goto L5c
            return r0
        L5c:
            r13 = r15
        L5d:
            long r13 = r13.element
            androidx.compose.ui.unit.Velocity r13 = androidx.compose.ui.unit.Velocity.m4042boximpl(r13)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollingLogic.m314doFlingAnimationQWom1Mo(long, hn.c):java.lang.Object");
    }

    @NotNull
    public final FlingBehavior getFlingBehavior() {
        return this.flingBehavior;
    }

    @NotNull
    public final State<NestedScrollDispatcher> getNestedScrollDispatcher() {
        return this.nestedScrollDispatcher;
    }

    @NotNull
    public final Orientation getOrientation() {
        return this.orientation;
    }

    @Nullable
    public final OverscrollEffect getOverscrollEffect() {
        return this.overscrollEffect;
    }

    public final boolean getReverseDirection() {
        return this.reverseDirection;
    }

    @NotNull
    public final ScrollableState getScrollableState() {
        return this.scrollableState;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00be A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onDragStopped(float r13, @org.jetbrains.annotations.NotNull hn.c<? super bn.r> r14) {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollingLogic.onDragStopped(float, hn.c):java.lang.Object");
    }

    /* JADX INFO: renamed from: performRawScroll-MK-Hz9U, reason: not valid java name */
    public final long m315performRawScrollMKHz9U(long scroll) {
        return this.scrollableState.isScrollInProgress() ? Offset.INSTANCE.m1399getZeroF1C5BW0() : m319toOffsettuRUvjQ(reverseIfNeeded(this.scrollableState.dispatchRawDelta(reverseIfNeeded(m318toFloatk4lQ0M(scroll)))));
    }

    public final float reverseIfNeeded(float f10) {
        return this.reverseDirection ? f10 * (-1) : f10;
    }

    /* JADX INFO: renamed from: reverseIfNeeded-MK-Hz9U, reason: not valid java name */
    public final long m316reverseIfNeededMKHz9U(long j10) {
        return this.reverseDirection ? Offset.m1390timestuRUvjQ(j10, -1.0f) : j10;
    }

    public final boolean shouldScrollImmediately() {
        if (!this.scrollableState.isScrollInProgress()) {
            OverscrollEffect overscrollEffect = this.overscrollEffect;
            if (!(overscrollEffect != null ? overscrollEffect.isInProgress() : false)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: toFloat-TH1AsA0, reason: not valid java name */
    public final float m317toFloatTH1AsA0(long j10) {
        return this.orientation == Orientation.Horizontal ? Velocity.m4051getXimpl(j10) : Velocity.m4052getYimpl(j10);
    }

    /* JADX INFO: renamed from: toFloat-k-4lQ0M, reason: not valid java name */
    public final float m318toFloatk4lQ0M(long j10) {
        return this.orientation == Orientation.Horizontal ? Offset.m1383getXimpl(j10) : Offset.m1384getYimpl(j10);
    }

    /* JADX INFO: renamed from: toOffset-tuRUvjQ, reason: not valid java name */
    public final long m319toOffsettuRUvjQ(float f10) {
        return (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1)) == 0 ? Offset.INSTANCE.m1399getZeroF1C5BW0() : this.orientation == Orientation.Horizontal ? OffsetKt.Offset(f10, 0.0f) : OffsetKt.Offset(0.0f, f10);
    }

    /* JADX INFO: renamed from: toVelocity-adjELrA, reason: not valid java name */
    public final long m320toVelocityadjELrA(float f10) {
        return this.orientation == Orientation.Horizontal ? VelocityKt.Velocity(f10, 0.0f) : VelocityKt.Velocity(0.0f, f10);
    }

    /* JADX INFO: renamed from: update-QWom1Mo, reason: not valid java name */
    public final long m321updateQWom1Mo(long j10, float f10) {
        return this.orientation == Orientation.Horizontal ? Velocity.m4047copyOhffZ5M$default(j10, f10, 0.0f, 2, null) : Velocity.m4047copyOhffZ5M$default(j10, 0.0f, f10, 1, null);
    }
}
