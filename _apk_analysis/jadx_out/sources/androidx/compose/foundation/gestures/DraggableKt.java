package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.util.VelocityTracker;
import androidx.compose.ui.input.pointer.util.VelocityTrackerKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Velocity;
import bn.r;
import fo.g;
import hn.c;
import in.a;
import jn.d;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;
import sn.l;
import sn.q;
import tn.p;

/* JADX INFO: compiled from: Draggable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000\u001a#\u0010\u0006\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a©\u0001\u0010\u0019\u001a\u00020\b*\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\f2*\b\u0002\u0010\u0016\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00112*\b\u0002\u0010\u0017\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00112\b\b\u0002\u0010\u0018\u001a\u00020\fø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001aÎ\u0001\u0010\u0019\u001a\u00020\b*\u00020\b2\u0011\u0010\u001e\u001a\r\u0012\u0004\u0012\u00020\u001c0\u001b¢\u0006\u0002\b\u001d2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\f0\u00002\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u001b2*\b\u0002\u0010\u0016\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00112*\b\u0002\u0010\u0017\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00112\b\b\u0002\u0010\u0018\u001a\u00020\fH\u0000ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010!\u001ac\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u0001\u0018\u00010&*\u00020\"2\u0018\u0010 \u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\f0\u00000#2\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u001b0#2\u0006\u0010%\u001a\u00020$2\u0006\u0010\u000b\u001a\u00020\nH\u0082@ø\u0001\u0000¢\u0006\u0004\b'\u0010(\u001aQ\u0010-\u001a\u00020\f*\u00020\"2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00010&2\u0006\u0010%\u001a\u00020$2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020+0*2\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0082@ø\u0001\u0000¢\u0006\u0004\b-\u0010.\u001a\u001e\u0010/\u001a\u00020\u0013*\u00020\u00012\u0006\u0010\u000b\u001a\u00020\nH\u0002ø\u0001\u0000¢\u0006\u0004\b/\u00100\u001a!\u00103\u001a\u00020\u0001*\u00020\u00132\u0006\u0010\u000b\u001a\u00020\nH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b1\u00102\u001a!\u00103\u001a\u00020\u0001*\u0002042\u0006\u0010\u000b\u001a\u00020\nH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b5\u00102\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00066"}, d2 = {"Lkotlin/Function1;", "", "Lbn/r;", "onDelta", "Landroidx/compose/foundation/gestures/DraggableState;", "DraggableState", "rememberDraggableState", "(Lsn/l;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/gestures/DraggableState;", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "", "enabled", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "startDragImmediately", "Lkotlin/Function3;", "Ldo/l0;", "Landroidx/compose/ui/geometry/Offset;", "Lhn/c;", "", "onDragStarted", "onDragStopped", "reverseDirection", "draggable", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/DraggableState;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;ZLsn/q;Lsn/q;Z)Landroidx/compose/ui/Modifier;", "Lkotlin/Function0;", "Landroidx/compose/foundation/gestures/PointerAwareDraggableState;", "Landroidx/compose/runtime/Composable;", "stateFactory", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "canDrag", "(Landroidx/compose/ui/Modifier;Lsn/p;Lsn/l;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lsn/a;Lsn/q;Lsn/q;Z)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/input/pointer/util/VelocityTracker;", "velocityTracker", "Lkotlin/Pair;", "awaitDownAndSlop", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/ui/input/pointer/util/VelocityTracker;Landroidx/compose/foundation/gestures/Orientation;Lhn/c;)Ljava/lang/Object;", "dragStart", "Lfo/p;", "Landroidx/compose/foundation/gestures/DragEvent;", "channel", "awaitDrag", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lkotlin/Pair;Landroidx/compose/ui/input/pointer/util/VelocityTracker;Lfo/p;ZLandroidx/compose/foundation/gestures/Orientation;Lhn/c;)Ljava/lang/Object;", "toOffset", "(FLandroidx/compose/foundation/gestures/Orientation;)J", "toFloat-3MmeM6k", "(JLandroidx/compose/foundation/gestures/Orientation;)F", "toFloat", "Landroidx/compose/ui/unit/Velocity;", "toFloat-sF-c-tU", "foundation_release"}, k = 2, mv = {1, 6, 0})
public final class DraggableKt {

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DraggableKt$awaitDownAndSlop$1, reason: invalid class name */
    /* JADX INFO: compiled from: Draggable.kt */
    @d(c = "androidx.compose.foundation.gestures.DraggableKt", f = "Draggable.kt", l = {315, 324, 333, 335}, m = "awaitDownAndSlop")
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class AnonymousClass1 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
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
            return DraggableKt.awaitDownAndSlop(null, null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DraggableKt$draggable$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Draggable.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"Ldo/l0;", "Landroidx/compose/ui/geometry/Offset;", "it", "Lbn/r;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @d(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$1", f = "Draggable.kt", l = {}, m = "invokeSuspend")
    public static final class C11921 extends SuspendLambda implements q<l0, Offset, c<? super r>, Object> {
        public int label;

        public C11921(c<? super C11921> cVar) {
            super(3, cVar);
        }

        @Override // sn.q
        public /* bridge */ /* synthetic */ Object invoke(l0 l0Var, Offset offset, c<? super r> cVar) {
            return m270invoked4ec7I(l0Var, offset.getPackedValue(), cVar);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke-d-4ec7I, reason: not valid java name */
        public final Object m270invoked4ec7I(@NotNull l0 l0Var, long j10, @Nullable c<? super r> cVar) {
            return new C11921(cVar).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            a.g();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            return r.f5635a;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DraggableKt$draggable$2, reason: invalid class name */
    /* JADX INFO: compiled from: Draggable.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"Ldo/l0;", "", "it", "Lbn/r;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @d(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$2", f = "Draggable.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements q<l0, Float, c<? super r>, Object> {
        public int label;

        public AnonymousClass2(c<? super AnonymousClass2> cVar) {
            super(3, cVar);
        }

        @Nullable
        public final Object invoke(@NotNull l0 l0Var, float f10, @Nullable c<? super r> cVar) {
            return new AnonymousClass2(cVar).invokeSuspend(r.f5635a);
        }

        @Override // sn.q
        public /* bridge */ /* synthetic */ Object invoke(l0 l0Var, Float f10, c<? super r> cVar) {
            return invoke(l0Var, f10.floatValue(), cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            a.g();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            return r.f5635a;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DraggableKt$draggable$6, reason: invalid class name */
    /* JADX INFO: compiled from: Draggable.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"Ldo/l0;", "Landroidx/compose/ui/geometry/Offset;", "it", "Lbn/r;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @d(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$6", f = "Draggable.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass6 extends SuspendLambda implements q<l0, Offset, c<? super r>, Object> {
        public int label;

        public AnonymousClass6(c<? super AnonymousClass6> cVar) {
            super(3, cVar);
        }

        @Override // sn.q
        public /* bridge */ /* synthetic */ Object invoke(l0 l0Var, Offset offset, c<? super r> cVar) {
            return m271invoked4ec7I(l0Var, offset.getPackedValue(), cVar);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke-d-4ec7I, reason: not valid java name */
        public final Object m271invoked4ec7I(@NotNull l0 l0Var, long j10, @Nullable c<? super r> cVar) {
            return new AnonymousClass6(cVar).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            a.g();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            return r.f5635a;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DraggableKt$draggable$7, reason: invalid class name */
    /* JADX INFO: compiled from: Draggable.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"Ldo/l0;", "", "it", "Lbn/r;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @d(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$7", f = "Draggable.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass7 extends SuspendLambda implements q<l0, Float, c<? super r>, Object> {
        public int label;

        public AnonymousClass7(c<? super AnonymousClass7> cVar) {
            super(3, cVar);
        }

        @Nullable
        public final Object invoke(@NotNull l0 l0Var, float f10, @Nullable c<? super r> cVar) {
            return new AnonymousClass7(cVar).invokeSuspend(r.f5635a);
        }

        @Override // sn.q
        public /* bridge */ /* synthetic */ Object invoke(l0 l0Var, Float f10, c<? super r> cVar) {
            return invoke(l0Var, f10.floatValue(), cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            a.g();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            return r.f5635a;
        }
    }

    @NotNull
    public static final DraggableState DraggableState(@NotNull l<? super Float, r> lVar) {
        p.k(lVar, "onDelta");
        return new DefaultDraggableState(lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object awaitDownAndSlop(androidx.compose.ui.input.pointer.AwaitPointerEventScope r9, androidx.compose.runtime.State<? extends sn.l<? super androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Boolean>> r10, androidx.compose.runtime.State<? extends sn.a<java.lang.Boolean>> r11, androidx.compose.ui.input.pointer.util.VelocityTracker r12, androidx.compose.foundation.gestures.Orientation r13, hn.c<? super kotlin.Pair<androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Float>> r14) {
        /*
            Method dump skipped, instruction units count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DraggableKt.awaitDownAndSlop(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.runtime.State, androidx.compose.runtime.State, androidx.compose.ui.input.pointer.util.VelocityTracker, androidx.compose.foundation.gestures.Orientation, hn.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object awaitDrag(AwaitPointerEventScope awaitPointerEventScope, Pair<PointerInputChange, Float> pair, final VelocityTracker velocityTracker, final fo.p<? super DragEvent> pVar, final boolean z10, final Orientation orientation, c<? super Boolean> cVar) {
        float fFloatValue = pair.getSecond().floatValue();
        PointerInputChange first = pair.getFirst();
        long jM1387minusMKHz9U = Offset.m1387minusMKHz9U(first.getPosition(), Offset.m1390timestuRUvjQ(toOffset(fFloatValue, orientation), Math.signum(m268toFloat3MmeM6k(first.getPosition(), orientation))));
        pVar.i(new DragEvent.DragStarted(jM1387minusMKHz9U, null));
        if (z10) {
            fFloatValue *= -1;
        }
        pVar.i(new DragEvent.DragDelta(fFloatValue, jM1387minusMKHz9U, null));
        l<PointerInputChange, r> lVar = new l<PointerInputChange, r>() { // from class: androidx.compose.foundation.gestures.DraggableKt$awaitDrag$dragTick$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(PointerInputChange pointerInputChange) {
                invoke2(pointerInputChange);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull PointerInputChange pointerInputChange) {
                p.k(pointerInputChange, "event");
                VelocityTrackerKt.addPointerInputChange(velocityTracker, pointerInputChange);
                float fM268toFloat3MmeM6k = DraggableKt.m268toFloat3MmeM6k(PointerEventKt.positionChange(pointerInputChange), orientation);
                pointerInputChange.consume();
                fo.p<DragEvent> pVar2 = pVar;
                if (z10) {
                    fM268toFloat3MmeM6k *= -1;
                }
                pVar2.i(new DragEvent.DragDelta(fM268toFloat3MmeM6k, pointerInputChange.getPosition(), null));
            }
        };
        return orientation == Orientation.Vertical ? DragGestureDetectorKt.m260verticalDragjO51t88(awaitPointerEventScope, first.getId(), lVar, cVar) : DragGestureDetectorKt.m257horizontalDragjO51t88(awaitPointerEventScope, first.getId(), lVar, cVar);
    }

    @NotNull
    public static final Modifier draggable(@NotNull Modifier modifier, @NotNull final DraggableState draggableState, @NotNull Orientation orientation, boolean z10, @Nullable MutableInteractionSource mutableInteractionSource, final boolean z11, @NotNull q<? super l0, ? super Offset, ? super c<? super r>, ? extends Object> qVar, @NotNull q<? super l0, ? super Float, ? super c<? super r>, ? extends Object> qVar2, boolean z12) {
        p.k(modifier, "<this>");
        p.k(draggableState, "state");
        p.k(orientation, "orientation");
        p.k(qVar, "onDragStarted");
        p.k(qVar2, "onDragStopped");
        return draggable(modifier, new sn.p<Composer, Integer, PointerAwareDraggableState>() { // from class: androidx.compose.foundation.gestures.DraggableKt.draggable.3
            {
                super(2);
            }

            @Composable
            @NotNull
            public final PointerAwareDraggableState invoke(@Nullable Composer composer, int i10) {
                composer.startReplaceableGroup(830271906);
                DraggableState draggableState2 = draggableState;
                composer.startReplaceableGroup(1157296644);
                boolean zChanged = composer.changed(draggableState2);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new IgnorePointerDraggableState(draggableState2);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                IgnorePointerDraggableState ignorePointerDraggableState = (IgnorePointerDraggableState) objRememberedValue;
                composer.endReplaceableGroup();
                return ignorePointerDraggableState;
            }

            @Override // sn.p
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ PointerAwareDraggableState mo2invoke(Composer composer, Integer num) {
                return invoke(composer, num.intValue());
            }
        }, new l<PointerInputChange, Boolean>() { // from class: androidx.compose.foundation.gestures.DraggableKt.draggable.4
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull PointerInputChange pointerInputChange) {
                p.k(pointerInputChange, "it");
                return Boolean.TRUE;
            }
        }, orientation, z10, mutableInteractionSource, new sn.a<Boolean>() { // from class: androidx.compose.foundation.gestures.DraggableKt.draggable.5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.a
            @NotNull
            public final Boolean invoke() {
                return Boolean.valueOf(z11);
            }
        }, qVar, qVar2, z12);
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    @NotNull
    public static final Modifier draggable(@NotNull Modifier modifier, @NotNull final sn.p<? super Composer, ? super Integer, ? extends PointerAwareDraggableState> pVar, @NotNull final l<? super PointerInputChange, Boolean> lVar, @NotNull final Orientation orientation, final boolean z10, @Nullable final MutableInteractionSource mutableInteractionSource, @NotNull final sn.a<Boolean> aVar, @NotNull final q<? super l0, ? super Offset, ? super c<? super r>, ? extends Object> qVar, @NotNull final q<? super l0, ? super Float, ? super c<? super r>, ? extends Object> qVar2, final boolean z11) {
        p.k(modifier, "<this>");
        p.k(pVar, "stateFactory");
        p.k(lVar, "canDrag");
        p.k(orientation, "orientation");
        p.k(aVar, "startDragImmediately");
        p.k(qVar, "onDragStarted");
        p.k(qVar2, "onDragStopped");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new l<InspectorInfo, r>() { // from class: androidx.compose.foundation.gestures.DraggableKt$draggable$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("draggable");
                inspectorInfo.getProperties().set("canDrag", lVar);
                inspectorInfo.getProperties().set("orientation", orientation);
                inspectorInfo.getProperties().set("enabled", Boolean.valueOf(z10));
                inspectorInfo.getProperties().set("reverseDirection", Boolean.valueOf(z11));
                inspectorInfo.getProperties().set("interactionSource", mutableInteractionSource);
                inspectorInfo.getProperties().set("startDragImmediately", aVar);
                inspectorInfo.getProperties().set("onDragStarted", qVar);
                inspectorInfo.getProperties().set("onDragStopped", qVar2);
                inspectorInfo.getProperties().set("stateFactory", pVar);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new q<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.gestures.DraggableKt.draggable.9

            /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DraggableKt$draggable$9$2, reason: invalid class name */
            /* JADX INFO: compiled from: Draggable.kt */
            @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
            @d(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$2", f = "Draggable.kt", l = {237, 239, 241, 251, 253, 257}, m = "invokeSuspend")
            public static final class AnonymousClass2 extends SuspendLambda implements sn.p<l0, c<? super r>, Object> {
                public final /* synthetic */ fo.d<DragEvent> $channel;
                public final /* synthetic */ State<DragLogic> $dragLogic$delegate;
                public final /* synthetic */ PointerAwareDraggableState $state;
                private /* synthetic */ Object L$0;
                public Object L$1;
                public Object L$2;
                public int label;

                /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DraggableKt$draggable$9$2$2, reason: invalid class name and collision with other inner class name */
                /* JADX INFO: compiled from: Draggable.kt */
                @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                @d(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$2$2", f = "Draggable.kt", l = {246}, m = "invokeSuspend")
                public static final class C00202 extends SuspendLambda implements sn.p<PointerAwareDragScope, c<? super r>, Object> {
                    public final /* synthetic */ fo.d<DragEvent> $channel;
                    public final /* synthetic */ Ref$ObjectRef<DragEvent> $event;
                    private /* synthetic */ Object L$0;
                    public Object L$1;
                    public int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C00202(Ref$ObjectRef<DragEvent> ref$ObjectRef, fo.d<DragEvent> dVar, c<? super C00202> cVar) {
                        super(2, cVar);
                        this.$event = ref$ObjectRef;
                        this.$channel = dVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
                        C00202 c00202 = new C00202(this.$event, this.$channel, cVar);
                        c00202.L$0 = obj;
                        return c00202;
                    }

                    @Override // sn.p
                    @Nullable
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                    public final Object mo2invoke(@NotNull PointerAwareDragScope pointerAwareDragScope, @Nullable c<? super r> cVar) {
                        return ((C00202) create(pointerAwareDragScope, cVar)).invokeSuspend(r.f5635a);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x005e -> B:23:0x0064). Please report as a decompilation issue!!! */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @org.jetbrains.annotations.Nullable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r9) {
                        /*
                            r8 = this;
                            java.lang.Object r0 = in.a.g()
                            int r1 = r8.label
                            r2 = 1
                            if (r1 == 0) goto L23
                            if (r1 != r2) goto L1b
                            java.lang.Object r1 = r8.L$1
                            kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref$ObjectRef) r1
                            java.lang.Object r3 = r8.L$0
                            androidx.compose.foundation.gestures.PointerAwareDragScope r3 = (androidx.compose.foundation.gestures.PointerAwareDragScope) r3
                            kotlin.c.b(r9)
                            r4 = r3
                            r3 = r1
                            r1 = r0
                            r0 = r8
                            goto L64
                        L1b:
                            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                            r9.<init>(r0)
                            throw r9
                        L23:
                            kotlin.c.b(r9)
                            java.lang.Object r9 = r8.L$0
                            androidx.compose.foundation.gestures.PointerAwareDragScope r9 = (androidx.compose.foundation.gestures.PointerAwareDragScope) r9
                            r3 = r9
                            r9 = r8
                        L2c:
                            kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.foundation.gestures.DragEvent> r1 = r9.$event
                            T r1 = r1.element
                            boolean r4 = r1 instanceof androidx.compose.foundation.gestures.DragEvent.DragStopped
                            if (r4 != 0) goto L6a
                            boolean r4 = r1 instanceof androidx.compose.foundation.gestures.DragEvent.DragCancelled
                            if (r4 != 0) goto L6a
                            boolean r4 = r1 instanceof androidx.compose.foundation.gestures.DragEvent.DragDelta
                            if (r4 == 0) goto L3f
                            androidx.compose.foundation.gestures.DragEvent$DragDelta r1 = (androidx.compose.foundation.gestures.DragEvent.DragDelta) r1
                            goto L40
                        L3f:
                            r1 = 0
                        L40:
                            if (r1 == 0) goto L4d
                            float r4 = r1.getDelta()
                            long r5 = r1.getPointerPosition()
                            r3.mo274dragByUv8p0NA(r4, r5)
                        L4d:
                            kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.foundation.gestures.DragEvent> r1 = r9.$event
                            fo.d<androidx.compose.foundation.gestures.DragEvent> r4 = r9.$channel
                            r9.L$0 = r3
                            r9.L$1 = r1
                            r9.label = r2
                            java.lang.Object r4 = r4.j(r9)
                            if (r4 != r0) goto L5e
                            return r0
                        L5e:
                            r7 = r0
                            r0 = r9
                            r9 = r4
                            r4 = r3
                            r3 = r1
                            r1 = r7
                        L64:
                            r3.element = r9
                            r9 = r0
                            r0 = r1
                            r3 = r4
                            goto L2c
                        L6a:
                            bn.r r9 = bn.r.f5635a
                            return r9
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DraggableKt.AnonymousClass9.AnonymousClass2.C00202.invokeSuspend(java.lang.Object):java.lang.Object");
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(fo.d<DragEvent> dVar, PointerAwareDraggableState pointerAwareDraggableState, State<DragLogic> state, c<? super AnonymousClass2> cVar) {
                    super(2, cVar);
                    this.$channel = dVar;
                    this.$state = pointerAwareDraggableState;
                    this.$dragLogic$delegate = state;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$channel, this.$state, this.$dragLogic$delegate, cVar);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // sn.p
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                public final Object mo2invoke(@NotNull l0 l0Var, @Nullable c<? super r> cVar) {
                    return ((AnonymousClass2) create(l0Var, cVar)).invokeSuspend(r.f5635a);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:24:0x006d  */
                /* JADX WARN: Removed duplicated region for block: B:30:0x0092  */
                /* JADX WARN: Removed duplicated region for block: B:36:0x00c5 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:37:0x00c6  */
                /* JADX WARN: Removed duplicated region for block: B:40:0x00d4 A[Catch: CancellationException -> 0x0100, TryCatch #0 {CancellationException -> 0x0100, blocks: (B:38:0x00c8, B:40:0x00d4, B:45:0x00ea, B:47:0x00ee), top: B:61:0x00c8 }] */
                /* JADX WARN: Removed duplicated region for block: B:45:0x00ea A[Catch: CancellationException -> 0x0100, TryCatch #0 {CancellationException -> 0x0100, blocks: (B:38:0x00c8, B:40:0x00d4, B:45:0x00ea, B:47:0x00ee), top: B:61:0x00c8 }] */
                /* JADX WARN: Removed duplicated region for block: B:55:0x0117 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:56:0x0118  */
                /* JADX WARN: Removed duplicated region for block: B:57:0x011c  */
                /* JADX WARN: Removed duplicated region for block: B:58:0x0120  */
                /* JADX WARN: Type inference failed for: r10v11, types: [T] */
                /* JADX WARN: Type inference failed for: r10v14 */
                /* JADX WARN: Type inference failed for: r10v16, types: [androidx.compose.foundation.gestures.DragLogic] */
                /* JADX WARN: Type inference failed for: r10v18, types: [do.l0, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r10v2, types: [androidx.compose.foundation.gestures.DragLogic] */
                /* JADX WARN: Type inference failed for: r10v20 */
                /* JADX WARN: Type inference failed for: r10v25 */
                /* JADX WARN: Type inference failed for: r10v26 */
                /* JADX WARN: Type inference failed for: r10v27 */
                /* JADX WARN: Type inference failed for: r10v29 */
                /* JADX WARN: Type inference failed for: r10v30 */
                /* JADX WARN: Type inference failed for: r10v4 */
                /* JADX WARN: Type inference failed for: r10v6 */
                /* JADX WARN: Type inference failed for: r10v7 */
                /* JADX WARN: Type inference failed for: r1v0, types: [int] */
                /* JADX WARN: Type inference failed for: r1v1 */
                /* JADX WARN: Type inference failed for: r1v12 */
                /* JADX WARN: Type inference failed for: r1v17 */
                /* JADX WARN: Type inference failed for: r1v2 */
                /* JADX WARN: Type inference failed for: r1v3, types: [do.l0, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r1v31 */
                /* JADX WARN: Type inference failed for: r1v34 */
                /* JADX WARN: Type inference failed for: r1v41 */
                /* JADX WARN: Type inference failed for: r1v42 */
                /* JADX WARN: Type inference failed for: r1v43 */
                /* JADX WARN: Type inference failed for: r1v6 */
                /* JADX WARN: Type inference failed for: r3v18 */
                /* JADX WARN: Type inference failed for: r3v2, types: [do.l0, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r3v5 */
                /* JADX WARN: Type inference failed for: r4v10 */
                /* JADX WARN: Type inference failed for: r4v11 */
                /* JADX WARN: Type inference failed for: r4v12 */
                /* JADX WARN: Type inference failed for: r4v2, types: [androidx.compose.foundation.gestures.DragLogic] */
                /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r4v4, types: [do.l0, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r4v7 */
                /* JADX WARN: Type inference failed for: r8v2 */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x00fc -> B:22:0x0067). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x0118 -> B:22:0x0067). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x011c -> B:22:0x0067). Please report as a decompilation issue!!! */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @org.jetbrains.annotations.Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r10) {
                    /*
                        Method dump skipped, instruction units count: 310
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DraggableKt.AnonymousClass9.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DraggableKt$draggable$9$3, reason: invalid class name */
            /* JADX INFO: compiled from: Draggable.kt */
            @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
            @d(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$3", f = "Draggable.kt", l = {263}, m = "invokeSuspend")
            public static final class AnonymousClass3 extends SuspendLambda implements sn.p<PointerInputScope, c<? super r>, Object> {
                public final /* synthetic */ State<l<PointerInputChange, Boolean>> $canDragState;
                public final /* synthetic */ fo.d<DragEvent> $channel;
                public final /* synthetic */ boolean $enabled;
                public final /* synthetic */ Orientation $orientation;
                public final /* synthetic */ boolean $reverseDirection;
                public final /* synthetic */ State<sn.a<Boolean>> $startImmediatelyState;
                private /* synthetic */ Object L$0;
                public int label;

                /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DraggableKt$draggable$9$3$1, reason: invalid class name */
                /* JADX INFO: compiled from: Draggable.kt */
                @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                @d(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$3$1", f = "Draggable.kt", l = {265}, m = "invokeSuspend")
                public static final class AnonymousClass1 extends SuspendLambda implements sn.p<l0, c<? super r>, Object> {
                    public final /* synthetic */ PointerInputScope $$this$pointerInput;
                    public final /* synthetic */ State<l<PointerInputChange, Boolean>> $canDragState;
                    public final /* synthetic */ fo.d<DragEvent> $channel;
                    public final /* synthetic */ Orientation $orientation;
                    public final /* synthetic */ boolean $reverseDirection;
                    public final /* synthetic */ State<sn.a<Boolean>> $startImmediatelyState;
                    private /* synthetic */ Object L$0;
                    public int label;

                    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DraggableKt$draggable$9$3$1$1, reason: invalid class name and collision with other inner class name */
                    /* JADX INFO: compiled from: Draggable.kt */
                    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                    @d(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$3$1$1", f = "Draggable.kt", l = {268, 276}, m = "invokeSuspend")
                    public static final class C00211 extends RestrictedSuspendLambda implements sn.p<AwaitPointerEventScope, c<? super r>, Object> {
                        public final /* synthetic */ l0 $$this$coroutineScope;
                        public final /* synthetic */ State<l<PointerInputChange, Boolean>> $canDragState;
                        public final /* synthetic */ fo.d<DragEvent> $channel;
                        public final /* synthetic */ Orientation $orientation;
                        public final /* synthetic */ boolean $reverseDirection;
                        public final /* synthetic */ State<sn.a<Boolean>> $startImmediatelyState;
                        public int I$0;
                        private /* synthetic */ Object L$0;
                        public Object L$1;
                        public Object L$2;
                        public Object L$3;
                        public Object L$4;
                        public boolean Z$0;
                        public int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        public C00211(l0 l0Var, State<? extends l<? super PointerInputChange, Boolean>> state, State<? extends sn.a<Boolean>> state2, Orientation orientation, fo.d<DragEvent> dVar, boolean z10, c<? super C00211> cVar) {
                            super(2, cVar);
                            this.$$this$coroutineScope = l0Var;
                            this.$canDragState = state;
                            this.$startImmediatelyState = state2;
                            this.$orientation = orientation;
                            this.$channel = dVar;
                            this.$reverseDirection = z10;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @NotNull
                        public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
                            C00211 c00211 = new C00211(this.$$this$coroutineScope, this.$canDragState, this.$startImmediatelyState, this.$orientation, this.$channel, this.$reverseDirection, cVar);
                            c00211.L$0 = obj;
                            return c00211;
                        }

                        @Override // sn.p
                        @Nullable
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                        public final Object mo2invoke(@NotNull AwaitPointerEventScope awaitPointerEventScope, @Nullable c<? super r> cVar) {
                            return ((C00211) create(awaitPointerEventScope, cVar)).invokeSuspend(r.f5635a);
                        }

                        /* JADX WARN: Can't wrap try/catch for region: R(8:25|(1:27)(1:28)|81|29|30|79|31|(1:33)(8:34|78|35|(0)(0)|43|59|17|(2:71|72)(0))) */
                        /* JADX WARN: Code restructure failed: missing block: B:46:0x00fc, code lost:
                        
                            r0 = th;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:48:0x00fe, code lost:
                        
                            r0 = e;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:49:0x00ff, code lost:
                        
                            r14 = r2;
                            r11 = r7;
                            r2 = r15;
                            r9 = r10;
                            r10 = r17;
                            r8 = r18;
                            r13 = r19;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:50:0x010b, code lost:
                        
                            r0 = th;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:51:0x010c, code lost:
                        
                            r17 = r11;
                            r18 = r12;
                            r20 = r14;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:52:0x0112, code lost:
                        
                            r11 = r7;
                            r10 = r17;
                            r8 = r18;
                            r12 = r20;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:53:0x011a, code lost:
                        
                            r0 = e;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:54:0x011b, code lost:
                        
                            r20 = r14;
                            r14 = r2;
                            r11 = r7;
                            r2 = r15;
                            r9 = r10;
                            r10 = r11;
                            r8 = r12;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:55:0x012e, code lost:
                        
                            r12 = r20;
                         */
                        /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
                        /* JADX WARN: Removed duplicated region for block: B:25:0x0093  */
                        /* JADX WARN: Removed duplicated region for block: B:37:0x00df  */
                        /* JADX WARN: Removed duplicated region for block: B:42:0x00f4  */
                        /* JADX WARN: Removed duplicated region for block: B:58:0x0136  */
                        /* JADX WARN: Removed duplicated region for block: B:60:0x013f A[Catch: all -> 0x0140, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0140, blocks: (B:56:0x0130, B:60:0x013f), top: B:73:0x0130 }] */
                        /* JADX WARN: Removed duplicated region for block: B:63:0x0143  */
                        /* JADX WARN: Removed duplicated region for block: B:67:0x0156  */
                        /* JADX WARN: Removed duplicated region for block: B:70:0x015c  */
                        /* JADX WARN: Removed duplicated region for block: B:71:0x0162  */
                        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00c9 -> B:78:0x00d7). Please report as a decompilation issue!!! */
                        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x0136 -> B:59:0x013b). Please report as a decompilation issue!!! */
                        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x015c -> B:17:0x0062). Please report as a decompilation issue!!! */
                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @org.jetbrains.annotations.Nullable
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r22) throws java.lang.Throwable {
                            /*
                                Method dump skipped, instruction units count: 357
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DraggableKt.AnonymousClass9.AnonymousClass3.AnonymousClass1.C00211.invokeSuspend(java.lang.Object):java.lang.Object");
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public AnonymousClass1(PointerInputScope pointerInputScope, State<? extends l<? super PointerInputChange, Boolean>> state, State<? extends sn.a<Boolean>> state2, Orientation orientation, fo.d<DragEvent> dVar, boolean z10, c<? super AnonymousClass1> cVar) {
                        super(2, cVar);
                        this.$$this$pointerInput = pointerInputScope;
                        this.$canDragState = state;
                        this.$startImmediatelyState = state2;
                        this.$orientation = orientation;
                        this.$channel = dVar;
                        this.$reverseDirection = z10;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$pointerInput, this.$canDragState, this.$startImmediatelyState, this.$orientation, this.$channel, this.$reverseDirection, cVar);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // sn.p
                    @Nullable
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                    public final Object mo2invoke(@NotNull l0 l0Var, @Nullable c<? super r> cVar) {
                        return ((AnonymousClass1) create(l0Var, cVar)).invokeSuspend(r.f5635a);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:22:0x0050  */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @org.jetbrains.annotations.Nullable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r14) {
                        /*
                            r13 = this;
                            java.lang.Object r0 = in.a.g()
                            int r1 = r13.label
                            r2 = 1
                            if (r1 == 0) goto L1d
                            if (r1 != r2) goto L15
                            java.lang.Object r0 = r13.L$0
                            do.l0 r0 = (p000do.l0) r0
                            kotlin.c.b(r14)     // Catch: java.util.concurrent.CancellationException -> L13
                            goto L4d
                        L13:
                            r14 = move-exception
                            goto L47
                        L15:
                            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                            r14.<init>(r0)
                            throw r14
                        L1d:
                            kotlin.c.b(r14)
                            java.lang.Object r14 = r13.L$0
                            do.l0 r14 = (p000do.l0) r14
                            androidx.compose.ui.input.pointer.PointerInputScope r1 = r13.$$this$pointerInput     // Catch: java.util.concurrent.CancellationException -> L43
                            androidx.compose.foundation.gestures.DraggableKt$draggable$9$3$1$1 r11 = new androidx.compose.foundation.gestures.DraggableKt$draggable$9$3$1$1     // Catch: java.util.concurrent.CancellationException -> L43
                            androidx.compose.runtime.State<sn.l<androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Boolean>> r5 = r13.$canDragState     // Catch: java.util.concurrent.CancellationException -> L43
                            androidx.compose.runtime.State<sn.a<java.lang.Boolean>> r6 = r13.$startImmediatelyState     // Catch: java.util.concurrent.CancellationException -> L43
                            androidx.compose.foundation.gestures.Orientation r7 = r13.$orientation     // Catch: java.util.concurrent.CancellationException -> L43
                            fo.d<androidx.compose.foundation.gestures.DragEvent> r8 = r13.$channel     // Catch: java.util.concurrent.CancellationException -> L43
                            boolean r9 = r13.$reverseDirection     // Catch: java.util.concurrent.CancellationException -> L43
                            r10 = 0
                            r3 = r11
                            r4 = r14
                            r3.<init>(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.util.concurrent.CancellationException -> L43
                            r13.L$0 = r14     // Catch: java.util.concurrent.CancellationException -> L43
                            r13.label = r2     // Catch: java.util.concurrent.CancellationException -> L43
                            java.lang.Object r14 = r1.awaitPointerEventScope(r11, r13)     // Catch: java.util.concurrent.CancellationException -> L43
                            if (r14 != r0) goto L4d
                            return r0
                        L43:
                            r0 = move-exception
                            r12 = r0
                            r0 = r14
                            r14 = r12
                        L47:
                            boolean r0 = kotlinx.coroutines.d.h(r0)
                            if (r0 == 0) goto L50
                        L4d:
                            bn.r r14 = bn.r.f5635a
                            return r14
                        L50:
                            throw r14
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DraggableKt.AnonymousClass9.AnonymousClass3.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public AnonymousClass3(boolean z10, State<? extends l<? super PointerInputChange, Boolean>> state, State<? extends sn.a<Boolean>> state2, Orientation orientation, fo.d<DragEvent> dVar, boolean z11, c<? super AnonymousClass3> cVar) {
                    super(2, cVar);
                    this.$enabled = z10;
                    this.$canDragState = state;
                    this.$startImmediatelyState = state2;
                    this.$orientation = orientation;
                    this.$channel = dVar;
                    this.$reverseDirection = z11;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$enabled, this.$canDragState, this.$startImmediatelyState, this.$orientation, this.$channel, this.$reverseDirection, cVar);
                    anonymousClass3.L$0 = obj;
                    return anonymousClass3;
                }

                @Override // sn.p
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                public final Object mo2invoke(@NotNull PointerInputScope pointerInputScope, @Nullable c<? super r> cVar) {
                    return ((AnonymousClass3) create(pointerInputScope, cVar)).invokeSuspend(r.f5635a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object objG = a.g();
                    int i10 = this.label;
                    if (i10 == 0) {
                        kotlin.c.b(obj);
                        PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
                        if (!this.$enabled) {
                            return r.f5635a;
                        }
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(pointerInputScope, this.$canDragState, this.$startImmediatelyState, this.$orientation, this.$channel, this.$reverseDirection, null);
                        this.label = 1;
                        if (kotlinx.coroutines.d.f(anonymousClass1, this) == objG) {
                            return objG;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.c.b(obj);
                    }
                    return r.f5635a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: invoke$lambda-2, reason: not valid java name */
            public static final DragLogic m273invoke$lambda2(State<DragLogic> state) {
                return state.getValue();
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier modifier2, @Nullable Composer composer, int i10) {
                p.k(modifier2, "$this$composed");
                composer.startReplaceableGroup(-1487259950);
                PointerAwareDraggableState pointerAwareDraggableStateMo2invoke = pVar.mo2invoke(composer, 0);
                composer.startReplaceableGroup(-492369756);
                Object objRememberedValue = composer.rememberedValue();
                Composer.Companion companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                final MutableState mutableState = (MutableState) objRememberedValue;
                final MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
                EffectsKt.DisposableEffect(mutableInteractionSource2, new l<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.gestures.DraggableKt.draggable.9.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // sn.l
                    @NotNull
                    public final DisposableEffectResult invoke(@NotNull DisposableEffectScope disposableEffectScope) {
                        p.k(disposableEffectScope, "$this$DisposableEffect");
                        final MutableState<DragInteraction.Start> mutableState2 = mutableState;
                        final MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource2;
                        return new DisposableEffectResult() { // from class: androidx.compose.foundation.gestures.DraggableKt$draggable$9$1$invoke$$inlined$onDispose$1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void dispose() {
                                DragInteraction.Start start = (DragInteraction.Start) mutableState2.getValue();
                                if (start != null) {
                                    MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource3;
                                    if (mutableInteractionSource4 != null) {
                                        mutableInteractionSource4.tryEmit(new DragInteraction.Cancel(start));
                                    }
                                    mutableState2.setValue(null);
                                }
                            }
                        };
                    }
                }, composer, 0);
                composer.startReplaceableGroup(-492369756);
                Object objRememberedValue2 = composer.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = g.b(Integer.MAX_VALUE, null, null, 6, null);
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceableGroup();
                fo.d dVar = (fo.d) objRememberedValue2;
                State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(aVar, composer, 0);
                State stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(lVar, composer, 0);
                EffectsKt.LaunchedEffect(pointerAwareDraggableStateMo2invoke, new AnonymousClass2(dVar, pointerAwareDraggableStateMo2invoke, SnapshotStateKt.rememberUpdatedState(new DragLogic(qVar, qVar2, mutableState, mutableInteractionSource), composer, 0), null), composer, 0);
                Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput((Modifier) Modifier.INSTANCE, new Object[]{orientation, Boolean.valueOf(z10), Boolean.valueOf(z11)}, (sn.p<? super PointerInputScope, ? super c<? super r>, ? extends Object>) new AnonymousClass3(z10, stateRememberUpdatedState2, stateRememberUpdatedState, orientation, dVar, z11, null));
                composer.endReplaceableGroup();
                return modifierPointerInput;
            }

            @Override // sn.q
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }
        });
    }

    @Composable
    @NotNull
    public static final DraggableState rememberDraggableState(@NotNull l<? super Float, r> lVar, @Nullable Composer composer, int i10) {
        p.k(lVar, "onDelta");
        composer.startReplaceableGroup(-183245213);
        final State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(lVar, composer, i10 & 14);
        composer.startReplaceableGroup(-492369756);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = DraggableState(new l<Float, r>() { // from class: androidx.compose.foundation.gestures.DraggableKt$rememberDraggableState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // sn.l
                public /* bridge */ /* synthetic */ r invoke(Float f10) {
                    invoke(f10.floatValue());
                    return r.f5635a;
                }

                public final void invoke(float f10) {
                    stateRememberUpdatedState.getValue().invoke(Float.valueOf(f10));
                }
            });
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        DraggableState draggableState = (DraggableState) objRememberedValue;
        composer.endReplaceableGroup();
        return draggableState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: toFloat-3MmeM6k, reason: not valid java name */
    public static final float m268toFloat3MmeM6k(long j10, Orientation orientation) {
        return orientation == Orientation.Vertical ? Offset.m1384getYimpl(j10) : Offset.m1383getXimpl(j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: toFloat-sF-c-tU, reason: not valid java name */
    public static final float m269toFloatsFctU(long j10, Orientation orientation) {
        return orientation == Orientation.Vertical ? Velocity.m4052getYimpl(j10) : Velocity.m4051getXimpl(j10);
    }

    private static final long toOffset(float f10, Orientation orientation) {
        return orientation == Orientation.Vertical ? OffsetKt.Offset(0.0f, f10) : OffsetKt.Offset(f10, 0.0f);
    }
}
