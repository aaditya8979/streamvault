package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import bn.r;
import hn.c;
import in.a;
import java.util.List;
import jn.d;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.p;

/* JADX INFO: compiled from: TransformGestureDetector.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u001aJ\u0010\b\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012$\u0010\u0007\u001a \u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0003H\u0086@ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a\n\u0010\u000b\u001a\u00020\u0005*\u00020\n\u001a\u0019\u0010\u000e\u001a\u00020\u0005*\u00020\u0004H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\r\u001a\n\u0010\u000f\u001a\u00020\u0005*\u00020\n\u001a\u0014\u0010\u0010\u001a\u00020\u0004*\u00020\nø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0014\u0010\u0013\u001a\u00020\u0005*\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\u0001\u001a\u001e\u0010\u0014\u001a\u00020\u0004*\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\u0001ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "", "panZoomLock", "Lkotlin/Function4;", "Landroidx/compose/ui/geometry/Offset;", "", "Lbn/r;", "onGesture", "detectTransformGestures", "(Landroidx/compose/ui/input/pointer/PointerInputScope;ZLsn/r;Lhn/c;)Ljava/lang/Object;", "Landroidx/compose/ui/input/pointer/PointerEvent;", "calculateRotation", "angle-k-4lQ0M", "(J)F", "angle", "calculateZoom", "calculatePan", "(Landroidx/compose/ui/input/pointer/PointerEvent;)J", "useCurrent", "calculateCentroidSize", "calculateCentroid", "(Landroidx/compose/ui/input/pointer/PointerEvent;Z)J", "foundation_release"}, k = 2, mv = {1, 6, 0})
public final class TransformGestureDetectorKt {

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TransformGestureDetectorKt$detectTransformGestures$2, reason: invalid class name */
    /* JADX INFO: compiled from: TransformGestureDetector.kt */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "Lbn/r;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @d(c = "androidx.compose.foundation.gestures.TransformGestureDetectorKt$detectTransformGestures$2", f = "TransformGestureDetector.kt", l = {52}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements p<PointerInputScope, c<? super r>, Object> {
        public final /* synthetic */ sn.r<Offset, Offset, Float, Float, r> $onGesture;
        public final /* synthetic */ boolean $panZoomLock;
        private /* synthetic */ Object L$0;
        public int label;

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TransformGestureDetectorKt$detectTransformGestures$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: TransformGestureDetector.kt */
        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Lbn/r;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @d(c = "androidx.compose.foundation.gestures.TransformGestureDetectorKt$detectTransformGestures$2$1", f = "TransformGestureDetector.kt", l = {60, 62}, m = "invokeSuspend")
        public static final class AnonymousClass1 extends RestrictedSuspendLambda implements p<AwaitPointerEventScope, c<? super r>, Object> {
            public final /* synthetic */ sn.r<Offset, Offset, Float, Float, r> $onGesture;
            public final /* synthetic */ boolean $panZoomLock;
            public float F$0;
            public float F$1;
            public float F$2;
            public int I$0;
            public int I$1;
            public long J$0;
            private /* synthetic */ Object L$0;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(boolean z10, sn.r<? super Offset, ? super Offset, ? super Float, ? super Float, r> rVar, c<? super AnonymousClass1> cVar) {
                super(2, cVar);
                this.$panZoomLock = z10;
                this.$onGesture = rVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$panZoomLock, this.$onGesture, cVar);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // sn.p
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final Object mo2invoke(@NotNull AwaitPointerEventScope awaitPointerEventScope, @Nullable c<? super r> cVar) {
                return ((AnonymousClass1) create(awaitPointerEventScope, cVar)).invokeSuspend(r.f5635a);
            }

            /* JADX WARN: Path cross not found for [B:60:0x013c, B:53:0x0125], limit reached: 88 */
            /* JADX WARN: Removed duplicated region for block: B:17:0x0090 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:20:0x009e  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x00b2  */
            /* JADX WARN: Removed duplicated region for block: B:63:0x015c  */
            /* JADX WARN: Removed duplicated region for block: B:67:0x016e  */
            /* JADX WARN: Removed duplicated region for block: B:70:0x0176  */
            /* JADX WARN: Removed duplicated region for block: B:82:0x00af A[SYNTHETIC] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x008e -> B:18:0x0091). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @org.jetbrains.annotations.Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r24) {
                /*
                    Method dump skipped, instruction units count: 422
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformGestureDetectorKt.AnonymousClass2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(boolean z10, sn.r<? super Offset, ? super Offset, ? super Float, ? super Float, r> rVar, c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$panZoomLock = z10;
            this.$onGesture = rVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$panZoomLock, this.$onGesture, cVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull PointerInputScope pointerInputScope, @Nullable c<? super r> cVar) {
            return ((AnonymousClass2) create(pointerInputScope, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = a.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.c.b(obj);
                PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$panZoomLock, this.$onGesture, null);
                this.label = 1;
                if (pointerInputScope.awaitPointerEventScope(anonymousClass1, this) == objG) {
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

    /* JADX INFO: renamed from: angle-k-4lQ0M, reason: not valid java name */
    private static final float m324anglek4lQ0M(long j10) {
        if (Offset.m1383getXimpl(j10) == 0.0f) {
            if (Offset.m1384getYimpl(j10) == 0.0f) {
                return 0.0f;
            }
        }
        return ((-((float) Math.atan2(Offset.m1383getXimpl(j10), Offset.m1384getYimpl(j10)))) * 180.0f) / 3.1415927f;
    }

    public static final long calculateCentroid(@NotNull PointerEvent pointerEvent, boolean z10) {
        tn.p.k(pointerEvent, "<this>");
        long jM1399getZeroF1C5BW0 = Offset.INSTANCE.m1399getZeroF1C5BW0();
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            PointerInputChange pointerInputChange = changes.get(i11);
            if (pointerInputChange.getPressed() && pointerInputChange.getPreviousPressed()) {
                jM1399getZeroF1C5BW0 = Offset.m1388plusMKHz9U(jM1399getZeroF1C5BW0, z10 ? pointerInputChange.getPosition() : pointerInputChange.getPreviousPosition());
                i10++;
            }
        }
        return i10 == 0 ? Offset.INSTANCE.m1398getUnspecifiedF1C5BW0() : Offset.m1378divtuRUvjQ(jM1399getZeroF1C5BW0, i10);
    }

    public static /* synthetic */ long calculateCentroid$default(PointerEvent pointerEvent, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return calculateCentroid(pointerEvent, z10);
    }

    public static final float calculateCentroidSize(@NotNull PointerEvent pointerEvent, boolean z10) {
        tn.p.k(pointerEvent, "<this>");
        long jCalculateCentroid = calculateCentroid(pointerEvent, z10);
        float fM1381getDistanceimpl = 0.0f;
        if (Offset.m1380equalsimpl0(jCalculateCentroid, Offset.INSTANCE.m1398getUnspecifiedF1C5BW0())) {
            return 0.0f;
        }
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            PointerInputChange pointerInputChange = changes.get(i11);
            if (pointerInputChange.getPressed() && pointerInputChange.getPreviousPressed()) {
                fM1381getDistanceimpl += Offset.m1381getDistanceimpl(Offset.m1387minusMKHz9U(z10 ? pointerInputChange.getPosition() : pointerInputChange.getPreviousPosition(), jCalculateCentroid));
                i10++;
            }
        }
        return fM1381getDistanceimpl / i10;
    }

    public static /* synthetic */ float calculateCentroidSize$default(PointerEvent pointerEvent, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return calculateCentroidSize(pointerEvent, z10);
    }

    public static final long calculatePan(@NotNull PointerEvent pointerEvent) {
        tn.p.k(pointerEvent, "<this>");
        long jCalculateCentroid = calculateCentroid(pointerEvent, true);
        Offset.Companion companion = Offset.INSTANCE;
        return Offset.m1380equalsimpl0(jCalculateCentroid, companion.m1398getUnspecifiedF1C5BW0()) ? companion.m1399getZeroF1C5BW0() : Offset.m1387minusMKHz9U(jCalculateCentroid, calculateCentroid(pointerEvent, false));
    }

    public static final float calculateRotation(@NotNull PointerEvent pointerEvent) {
        tn.p.k(pointerEvent, "<this>");
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int i12 = 1;
            if (i10 >= size) {
                break;
            }
            PointerInputChange pointerInputChange = changes.get(i10);
            if (!pointerInputChange.getPreviousPressed() || !pointerInputChange.getPressed()) {
                i12 = 0;
            }
            i11 += i12;
            i10++;
        }
        float f10 = 0.0f;
        if (i11 < 2) {
            return 0.0f;
        }
        long jCalculateCentroid = calculateCentroid(pointerEvent, true);
        long jCalculateCentroid2 = calculateCentroid(pointerEvent, false);
        List<PointerInputChange> changes2 = pointerEvent.getChanges();
        int size2 = changes2.size();
        float f11 = 0.0f;
        float f12 = 0.0f;
        int i13 = 0;
        while (i13 < size2) {
            PointerInputChange pointerInputChange2 = changes2.get(i13);
            if (pointerInputChange2.getPressed() && pointerInputChange2.getPreviousPressed()) {
                long position = pointerInputChange2.getPosition();
                long jM1387minusMKHz9U = Offset.m1387minusMKHz9U(pointerInputChange2.getPreviousPosition(), jCalculateCentroid2);
                long jM1387minusMKHz9U2 = Offset.m1387minusMKHz9U(position, jCalculateCentroid);
                float fM324anglek4lQ0M = m324anglek4lQ0M(jM1387minusMKHz9U2) - m324anglek4lQ0M(jM1387minusMKHz9U);
                float fM1381getDistanceimpl = Offset.m1381getDistanceimpl(Offset.m1388plusMKHz9U(jM1387minusMKHz9U2, jM1387minusMKHz9U)) / 2.0f;
                if (fM324anglek4lQ0M > 180.0f) {
                    fM324anglek4lQ0M -= 360.0f;
                } else if (fM324anglek4lQ0M < -180.0f) {
                    fM324anglek4lQ0M += 360.0f;
                }
                f12 += fM324anglek4lQ0M * fM1381getDistanceimpl;
                f11 += fM1381getDistanceimpl;
            }
            i13++;
            f10 = 0.0f;
        }
        return (f11 > f10 ? 1 : (f11 == f10 ? 0 : -1)) == 0 ? f10 : f12 / f11;
    }

    public static final float calculateZoom(@NotNull PointerEvent pointerEvent) {
        tn.p.k(pointerEvent, "<this>");
        float fCalculateCentroidSize = calculateCentroidSize(pointerEvent, true);
        float fCalculateCentroidSize2 = calculateCentroidSize(pointerEvent, false);
        if (fCalculateCentroidSize == 0.0f) {
            return 1.0f;
        }
        if (fCalculateCentroidSize2 == 0.0f) {
            return 1.0f;
        }
        return fCalculateCentroidSize / fCalculateCentroidSize2;
    }

    @Nullable
    public static final Object detectTransformGestures(@NotNull PointerInputScope pointerInputScope, boolean z10, @NotNull sn.r<? super Offset, ? super Offset, ? super Float, ? super Float, r> rVar, @NotNull c<? super r> cVar) {
        Object objForEachGesture = ForEachGestureKt.forEachGesture(pointerInputScope, new AnonymousClass2(z10, rVar, null), cVar);
        return objForEachGesture == a.g() ? objForEachGesture : r.f5635a;
    }

    public static /* synthetic */ Object detectTransformGestures$default(PointerInputScope pointerInputScope, boolean z10, sn.r rVar, c cVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return detectTransformGestures(pointerInputScope, z10, rVar, cVar);
    }
}
