package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import bn.r;
import hn.c;
import in.a;
import jn.d;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.p;

/* JADX INFO: compiled from: Draggable.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b!\u0010\"J%\u0010\n\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ?\u0010\u0011\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\"\u0010\u0010\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\rH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0003H\u0016R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R$\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 \u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006#"}, d2 = {"Landroidx/compose/foundation/gestures/IgnorePointerDraggableState;", "Landroidx/compose/foundation/gestures/PointerAwareDraggableState;", "Landroidx/compose/foundation/gestures/PointerAwareDragScope;", "", "pixels", "Landroidx/compose/ui/geometry/Offset;", "pointerPosition", "Lbn/r;", "dragBy-Uv8p0NA", "(FJ)V", "dragBy", "Landroidx/compose/foundation/MutatePriority;", "dragPriority", "Lkotlin/Function2;", "Lhn/c;", "", "block", "drag", "(Landroidx/compose/foundation/MutatePriority;Lsn/p;Lhn/c;)Ljava/lang/Object;", "delta", "dispatchRawDelta", "Landroidx/compose/foundation/gestures/DraggableState;", "origin", "Landroidx/compose/foundation/gestures/DraggableState;", "getOrigin", "()Landroidx/compose/foundation/gestures/DraggableState;", "Landroidx/compose/foundation/gestures/DragScope;", "latestConsumptionScope", "Landroidx/compose/foundation/gestures/DragScope;", "getLatestConsumptionScope", "()Landroidx/compose/foundation/gestures/DragScope;", "setLatestConsumptionScope", "(Landroidx/compose/foundation/gestures/DragScope;)V", "<init>", "(Landroidx/compose/foundation/gestures/DraggableState;)V", "foundation_release"}, k = 1, mv = {1, 6, 0})
final class IgnorePointerDraggableState implements PointerAwareDraggableState, PointerAwareDragScope {

    @Nullable
    private DragScope latestConsumptionScope;

    @NotNull
    private final DraggableState origin;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.IgnorePointerDraggableState$drag$2, reason: invalid class name */
    /* JADX INFO: compiled from: Draggable.kt */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/foundation/gestures/DragScope;", "Lbn/r;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @d(c = "androidx.compose.foundation.gestures.IgnorePointerDraggableState$drag$2", f = "Draggable.kt", l = {478}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements p<DragScope, c<? super r>, Object> {
        public final /* synthetic */ p<PointerAwareDragScope, c<? super r>, Object> $block;
        private /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(p<? super PointerAwareDragScope, ? super c<? super r>, ? extends Object> pVar, c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$block = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
            AnonymousClass2 anonymousClass2 = IgnorePointerDraggableState.this.new AnonymousClass2(this.$block, cVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull DragScope dragScope, @Nullable c<? super r> cVar) {
            return ((AnonymousClass2) create(dragScope, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = a.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.c.b(obj);
                IgnorePointerDraggableState.this.setLatestConsumptionScope((DragScope) this.L$0);
                p<PointerAwareDragScope, c<? super r>, Object> pVar = this.$block;
                IgnorePointerDraggableState ignorePointerDraggableState = IgnorePointerDraggableState.this;
                this.label = 1;
                if (pVar.mo2invoke(ignorePointerDraggableState, this) == objG) {
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

    public IgnorePointerDraggableState(@NotNull DraggableState draggableState) {
        tn.p.k(draggableState, "origin");
        this.origin = draggableState;
    }

    @Override // androidx.compose.foundation.gestures.PointerAwareDraggableState
    public void dispatchRawDelta(float f10) {
        this.origin.dispatchRawDelta(f10);
    }

    @Override // androidx.compose.foundation.gestures.PointerAwareDraggableState
    @Nullable
    public Object drag(@NotNull MutatePriority mutatePriority, @NotNull p<? super PointerAwareDragScope, ? super c<? super r>, ? extends Object> pVar, @NotNull c<? super r> cVar) {
        Object objDrag = this.origin.drag(mutatePriority, new AnonymousClass2(pVar, null), cVar);
        return objDrag == a.g() ? objDrag : r.f5635a;
    }

    @Override // androidx.compose.foundation.gestures.PointerAwareDragScope
    /* JADX INFO: renamed from: dragBy-Uv8p0NA, reason: not valid java name */
    public void mo274dragByUv8p0NA(float pixels, long pointerPosition) {
        DragScope dragScope = this.latestConsumptionScope;
        if (dragScope != null) {
            dragScope.dragBy(pixels);
        }
    }

    @Nullable
    public final DragScope getLatestConsumptionScope() {
        return this.latestConsumptionScope;
    }

    @NotNull
    public final DraggableState getOrigin() {
        return this.origin;
    }

    public final void setLatestConsumptionScope(@Nullable DragScope dragScope) {
        this.latestConsumptionScope = dragScope;
    }
}
