package androidx.compose.ui.input.pointer;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import bn.r;
import cn.v;
import cn.w;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import sn.q;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: PointerInputTestUtil.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\u001a.\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u0000\u001a(\u0010\b\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u0000\u001a(\u0010\u000b\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003H\u0000\u001a\u0014\u0010\f\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0000H\u0000\u001aG\u0010\u0017\u001a\u00020\u0011*\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\rj\u0002`\u00122\u0006\u0010\u0013\u001a\u00020\u000e2\b\b\u0002\u0010\u0014\u001a\u00020\u0010H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001aO\u0010\u001b\u001a\u00020\u0011*\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\rj\u0002`\u00122\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u000f2\b\b\u0002\u0010\u0014\u001a\u00020\u0010H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u001a[\u0010 \u001a\u00020\u0011*\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\rj\u0002`\u00122\u0006\u0010\u0013\u001a\u00020\u000e2\u0012\u0010\u001d\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u001c\"\u00020\u000f2\b\b\u0002\u0010\u0014\u001a\u00020\u0010H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001f\u001aU\u0010 \u001a\u00020\u0011*\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\rj\u0002`\u00122\u0006\u0010\u0013\u001a\u00020\u000e2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000f0!2\b\b\u0002\u0010\u0014\u001a\u00020\u0010H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\"*<\b\u0000\u0010#\"\u001a\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\r2\u001a\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\r\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"", "id", "durationMillis", "", VastAttributes.HORIZONTAL_POSITION, VastAttributes.VERTICAL_POSITION, "Landroidx/compose/ui/input/pointer/PointerInputChange;", "down", "moveTo", "dx", "dy", "moveBy", "up", "Lkotlin/Function3;", "Landroidx/compose/ui/input/pointer/PointerEvent;", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "Landroidx/compose/ui/unit/IntSize;", "Lbn/r;", "Landroidx/compose/ui/input/pointer/PointerInputHandler;", "pointerEvent", "size", "invokeOverAllPasses-H0pRuoY", "(Lsn/q;Landroidx/compose/ui/input/pointer/PointerEvent;J)V", "invokeOverAllPasses", "pointerEventPass", "invokeOverPass-hUlJWOE", "(Lsn/q;Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "invokeOverPass", "", "pointerEventPasses", "invokeOverPasses-hUlJWOE", "(Lsn/q;Landroidx/compose/ui/input/pointer/PointerEvent;[Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "invokeOverPasses", "", "(Lsn/q;Landroidx/compose/ui/input/pointer/PointerEvent;Ljava/util/List;J)V", "PointerInputHandler", "ui_release"}, k = 2, mv = {1, 6, 0})
public final class PointerInputTestUtilKt {
    @NotNull
    public static final PointerInputChange down(long j10, long j11, float f10, float f11) {
        return new PointerInputChange(PointerId.m2970constructorimpl(j10), j11, OffsetKt.Offset(f10, f11), true, j11, OffsetKt.Offset(f10, f11), false, false, 0, 0L, 768, (i) null);
    }

    public static /* synthetic */ PointerInputChange down$default(long j10, long j11, float f10, float f11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j11 = 0;
        }
        return down(j10, j11, (i10 & 4) != 0 ? 0.0f : f10, (i10 & 8) != 0 ? 0.0f : f11);
    }

    /* JADX INFO: renamed from: invokeOverAllPasses-H0pRuoY, reason: not valid java name */
    public static final void m3035invokeOverAllPassesH0pRuoY(@NotNull q<? super PointerEvent, ? super PointerEventPass, ? super IntSize, r> qVar, @NotNull PointerEvent pointerEvent, long j10) {
        p.k(qVar, "$this$invokeOverAllPasses");
        p.k(pointerEvent, "pointerEvent");
        m3039invokeOverPasseshUlJWOE(qVar, pointerEvent, (List<? extends PointerEventPass>) w.p(PointerEventPass.Initial, PointerEventPass.Main, PointerEventPass.Final), j10);
    }

    /* JADX INFO: renamed from: invokeOverAllPasses-H0pRuoY$default, reason: not valid java name */
    public static /* synthetic */ void m3036invokeOverAllPassesH0pRuoY$default(q qVar, PointerEvent pointerEvent, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = IntSizeKt.IntSize(Integer.MAX_VALUE, Integer.MAX_VALUE);
        }
        m3035invokeOverAllPassesH0pRuoY(qVar, pointerEvent, j10);
    }

    /* JADX INFO: renamed from: invokeOverPass-hUlJWOE, reason: not valid java name */
    public static final void m3037invokeOverPasshUlJWOE(@NotNull q<? super PointerEvent, ? super PointerEventPass, ? super IntSize, r> qVar, @NotNull PointerEvent pointerEvent, @NotNull PointerEventPass pointerEventPass, long j10) {
        p.k(qVar, "$this$invokeOverPass");
        p.k(pointerEvent, "pointerEvent");
        p.k(pointerEventPass, "pointerEventPass");
        m3039invokeOverPasseshUlJWOE(qVar, pointerEvent, (List<? extends PointerEventPass>) v.e(pointerEventPass), j10);
    }

    /* JADX INFO: renamed from: invokeOverPass-hUlJWOE$default, reason: not valid java name */
    public static /* synthetic */ void m3038invokeOverPasshUlJWOE$default(q qVar, PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            j10 = IntSizeKt.IntSize(Integer.MAX_VALUE, Integer.MAX_VALUE);
        }
        m3037invokeOverPasshUlJWOE(qVar, pointerEvent, pointerEventPass, j10);
    }

    /* JADX INFO: renamed from: invokeOverPasses-hUlJWOE, reason: not valid java name */
    public static final void m3039invokeOverPasseshUlJWOE(@NotNull q<? super PointerEvent, ? super PointerEventPass, ? super IntSize, r> qVar, @NotNull PointerEvent pointerEvent, @NotNull List<? extends PointerEventPass> list, long j10) {
        p.k(qVar, "$this$invokeOverPasses");
        p.k(pointerEvent, "pointerEvent");
        p.k(list, "pointerEventPasses");
        if (!(!pointerEvent.getChanges().isEmpty())) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(!list.isEmpty())) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            qVar.invoke(pointerEvent, list.get(i10), IntSize.m3978boximpl(j10));
        }
    }

    /* JADX INFO: renamed from: invokeOverPasses-hUlJWOE, reason: not valid java name */
    public static final void m3040invokeOverPasseshUlJWOE(@NotNull q<? super PointerEvent, ? super PointerEventPass, ? super IntSize, r> qVar, @NotNull PointerEvent pointerEvent, @NotNull PointerEventPass[] pointerEventPassArr, long j10) {
        p.k(qVar, "$this$invokeOverPasses");
        p.k(pointerEvent, "pointerEvent");
        p.k(pointerEventPassArr, "pointerEventPasses");
        m3039invokeOverPasseshUlJWOE(qVar, pointerEvent, (List<? extends PointerEventPass>) cn.r.G0(pointerEventPassArr), j10);
    }

    /* JADX INFO: renamed from: invokeOverPasses-hUlJWOE$default, reason: not valid java name */
    public static /* synthetic */ void m3041invokeOverPasseshUlJWOE$default(q qVar, PointerEvent pointerEvent, List list, long j10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            j10 = IntSizeKt.IntSize(Integer.MAX_VALUE, Integer.MAX_VALUE);
        }
        m3039invokeOverPasseshUlJWOE((q<? super PointerEvent, ? super PointerEventPass, ? super IntSize, r>) qVar, pointerEvent, (List<? extends PointerEventPass>) list, j10);
    }

    /* JADX INFO: renamed from: invokeOverPasses-hUlJWOE$default, reason: not valid java name */
    public static /* synthetic */ void m3042invokeOverPasseshUlJWOE$default(q qVar, PointerEvent pointerEvent, PointerEventPass[] pointerEventPassArr, long j10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            j10 = IntSizeKt.IntSize(Integer.MAX_VALUE, Integer.MAX_VALUE);
        }
        m3040invokeOverPasseshUlJWOE((q<? super PointerEvent, ? super PointerEventPass, ? super IntSize, r>) qVar, pointerEvent, pointerEventPassArr, j10);
    }

    @NotNull
    public static final PointerInputChange moveBy(@NotNull PointerInputChange pointerInputChange, long j10, float f10, float f11) {
        p.k(pointerInputChange, "<this>");
        long id2 = pointerInputChange.getId();
        long uptimeMillis = pointerInputChange.getUptimeMillis();
        boolean pressed = pointerInputChange.getPressed();
        return new PointerInputChange(id2, pointerInputChange.getUptimeMillis() + j10, OffsetKt.Offset(Offset.m1383getXimpl(pointerInputChange.getPosition()) + f10, Offset.m1384getYimpl(pointerInputChange.getPosition()) + f11), true, uptimeMillis, pointerInputChange.getPosition(), pressed, false, 0, 0L, 768, (i) null);
    }

    public static /* synthetic */ PointerInputChange moveBy$default(PointerInputChange pointerInputChange, long j10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 4) != 0) {
            f11 = 0.0f;
        }
        return moveBy(pointerInputChange, j10, f10, f11);
    }

    @NotNull
    public static final PointerInputChange moveTo(@NotNull PointerInputChange pointerInputChange, long j10, float f10, float f11) {
        p.k(pointerInputChange, "<this>");
        long id2 = pointerInputChange.getId();
        long uptimeMillis = pointerInputChange.getUptimeMillis();
        boolean pressed = pointerInputChange.getPressed();
        return new PointerInputChange(id2, j10, OffsetKt.Offset(f10, f11), true, uptimeMillis, pointerInputChange.getPosition(), pressed, false, 0, 0L, 768, (i) null);
    }

    public static /* synthetic */ PointerInputChange moveTo$default(PointerInputChange pointerInputChange, long j10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 4) != 0) {
            f11 = 0.0f;
        }
        return moveTo(pointerInputChange, j10, f10, f11);
    }

    @NotNull
    public static final PointerInputChange up(@NotNull PointerInputChange pointerInputChange, long j10) {
        p.k(pointerInputChange, "<this>");
        long id2 = pointerInputChange.getId();
        long uptimeMillis = pointerInputChange.getUptimeMillis();
        boolean pressed = pointerInputChange.getPressed();
        return new PointerInputChange(id2, j10, pointerInputChange.getPosition(), false, uptimeMillis, pointerInputChange.getPosition(), pressed, false, 0, 0L, 768, (i) null);
    }
}
