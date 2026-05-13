package androidx.compose.ui.input.pointer;

import androidx.compose.ui.geometry.Offset;
import com.ironsource.C3978d4;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: InternalPointerInput.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\b\u0080\b\u0018\u00002\u00020\u0001B^\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0006\u0012\u0006\u0010\u001b\u001a\u00020\b\u0012\u0006\u0010\u001c\u001a\u00020\b\u0012\u0006\u0010\u001d\u001a\u00020\r\u0012\u0006\u0010\u001e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u001f\u001a\u00020\r\u0012\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\b\b\u0002\u0010!\u001a\u00020\bø\u0001\u0000¢\u0006\u0004\b:\u0010;J\u0019\u0010\u0005\u001a\u00020\u0002HÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\u0019\u0010\n\u001a\u00020\bHÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\t\u0010\u0004J\u0019\u0010\f\u001a\u00020\bHÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000b\u0010\u0004J\t\u0010\u000e\u001a\u00020\rHÆ\u0003J\u0019\u0010\u0012\u001a\u00020\u000fHÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0013\u001a\u00020\rHÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014HÆ\u0003J\u0019\u0010\u0018\u001a\u00020\bHÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0017\u0010\u0004Jv\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\u001b\u001a\u00020\b2\b\b\u0002\u0010\u001c\u001a\u00020\b2\b\b\u0002\u0010\u001d\u001a\u00020\r2\b\b\u0002\u0010\u001e\u001a\u00020\u000f2\b\b\u0002\u0010\u001f\u001a\u00020\r2\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\b\b\u0002\u0010!\u001a\u00020\bHÆ\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b\"\u0010#J\t\u0010&\u001a\u00020%HÖ\u0001J\t\u0010(\u001a\u00020'HÖ\u0001J\u0013\u0010*\u001a\u00020\r2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003R \u0010\u0019\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\f\n\u0004\b\u0019\u0010+\u001a\u0004\b,\u0010\u0004R\u0017\u0010\u001a\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010+\u001a\u0004\b-\u0010\u0004R \u0010\u001b\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\f\n\u0004\b\u001b\u0010+\u001a\u0004\b.\u0010\u0004R \u0010\u001c\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\f\n\u0004\b\u001c\u0010+\u001a\u0004\b/\u0010\u0004R\u0017\u0010\u001d\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u001d\u00100\u001a\u0004\b1\u00102R \u0010\u001e\u001a\u00020\u000f8\u0006ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\f\n\u0004\b\u001e\u00103\u001a\u0004\b4\u0010\u0011R\u0017\u0010\u001f\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u001f\u00100\u001a\u0004\b5\u00102R\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006¢\u0006\f\n\u0004\b \u00106\u001a\u0004\b7\u00108R \u0010!\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\f\n\u0004\b!\u0010+\u001a\u0004\b9\u0010\u0004\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006<"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputEventData;", "", "Landroidx/compose/ui/input/pointer/PointerId;", "component1-J3iCeTQ", "()J", "component1", "", "component2", "Landroidx/compose/ui/geometry/Offset;", "component3-F1C5BW0", "component3", "component4-F1C5BW0", "component4", "", "component5", "Landroidx/compose/ui/input/pointer/PointerType;", "component6-T8wyACA", "()I", "component6", "component7", "", "Landroidx/compose/ui/input/pointer/HistoricalChange;", "component8", "component9-F1C5BW0", "component9", "id", "uptime", "positionOnScreen", C3978d4.i.L, "down", "type", "issuesEnterExit", "historical", "scrollDelta", "copy-JzxSYW4", "(JJJJZIZLjava/util/List;J)Landroidx/compose/ui/input/pointer/PointerInputEventData;", "copy", "", "toString", "", "hashCode", "other", "equals", "J", "getId-J3iCeTQ", "getUptime", "getPositionOnScreen-F1C5BW0", "getPosition-F1C5BW0", "Z", "getDown", "()Z", "I", "getType-T8wyACA", "getIssuesEnterExit", "Ljava/util/List;", "getHistorical", "()Ljava/util/List;", "getScrollDelta-F1C5BW0", "<init>", "(JJJJZIZLjava/util/List;JLtn/i;)V", "ui_release"}, k = 1, mv = {1, 6, 0})
public final /* data */ class PointerInputEventData {
    private final boolean down;

    @NotNull
    private final List<HistoricalChange> historical;
    private final long id;
    private final boolean issuesEnterExit;
    private final long position;
    private final long positionOnScreen;
    private final long scrollDelta;
    private final int type;
    private final long uptime;

    private PointerInputEventData(long j10, long j11, long j12, long j13, boolean z10, int i10, boolean z11, List<HistoricalChange> list, long j14) {
        this.id = j10;
        this.uptime = j11;
        this.positionOnScreen = j12;
        this.position = j13;
        this.down = z10;
        this.type = i10;
        this.issuesEnterExit = z11;
        this.historical = list;
        this.scrollDelta = j14;
    }

    public /* synthetic */ PointerInputEventData(long j10, long j11, long j12, long j13, boolean z10, int i10, boolean z11, List list, long j14, int i11, i iVar) {
        this(j10, j11, j12, j13, z10, i10, (i11 & 64) != 0 ? false : z11, (i11 & 128) != 0 ? new ArrayList() : list, (i11 & 256) != 0 ? Offset.INSTANCE.m1399getZeroF1C5BW0() : j14, null);
    }

    public /* synthetic */ PointerInputEventData(long j10, long j11, long j12, long j13, boolean z10, int i10, boolean z11, List list, long j14, i iVar) {
        this(j10, j11, j12, j13, z10, i10, z11, list, j14);
    }

    /* JADX INFO: renamed from: component1-J3iCeTQ, reason: not valid java name and from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getUptime() {
        return this.uptime;
    }

    /* JADX INFO: renamed from: component3-F1C5BW0, reason: not valid java name and from getter */
    public final long getPositionOnScreen() {
        return this.positionOnScreen;
    }

    /* JADX INFO: renamed from: component4-F1C5BW0, reason: not valid java name and from getter */
    public final long getPosition() {
        return this.position;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getDown() {
        return this.down;
    }

    /* JADX INFO: renamed from: component6-T8wyACA, reason: not valid java name and from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getIssuesEnterExit() {
        return this.issuesEnterExit;
    }

    @NotNull
    public final List<HistoricalChange> component8() {
        return this.historical;
    }

    /* JADX INFO: renamed from: component9-F1C5BW0, reason: not valid java name and from getter */
    public final long getScrollDelta() {
        return this.scrollDelta;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-JzxSYW4, reason: not valid java name */
    public final PointerInputEventData m2997copyJzxSYW4(long id2, long uptime, long positionOnScreen, long position, boolean down, int type, boolean issuesEnterExit, @NotNull List<HistoricalChange> historical, long scrollDelta) {
        p.k(historical, "historical");
        return new PointerInputEventData(id2, uptime, positionOnScreen, position, down, type, issuesEnterExit, historical, scrollDelta, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PointerInputEventData)) {
            return false;
        }
        PointerInputEventData pointerInputEventData = (PointerInputEventData) other;
        return PointerId.m2972equalsimpl0(this.id, pointerInputEventData.id) && this.uptime == pointerInputEventData.uptime && Offset.m1380equalsimpl0(this.positionOnScreen, pointerInputEventData.positionOnScreen) && Offset.m1380equalsimpl0(this.position, pointerInputEventData.position) && this.down == pointerInputEventData.down && PointerType.m3056equalsimpl0(this.type, pointerInputEventData.type) && this.issuesEnterExit == pointerInputEventData.issuesEnterExit && p.f(this.historical, pointerInputEventData.historical) && Offset.m1380equalsimpl0(this.scrollDelta, pointerInputEventData.scrollDelta);
    }

    public final boolean getDown() {
        return this.down;
    }

    @NotNull
    public final List<HistoricalChange> getHistorical() {
        return this.historical;
    }

    /* JADX INFO: renamed from: getId-J3iCeTQ, reason: not valid java name */
    public final long m2998getIdJ3iCeTQ() {
        return this.id;
    }

    public final boolean getIssuesEnterExit() {
        return this.issuesEnterExit;
    }

    /* JADX INFO: renamed from: getPosition-F1C5BW0, reason: not valid java name */
    public final long m2999getPositionF1C5BW0() {
        return this.position;
    }

    /* JADX INFO: renamed from: getPositionOnScreen-F1C5BW0, reason: not valid java name */
    public final long m3000getPositionOnScreenF1C5BW0() {
        return this.positionOnScreen;
    }

    /* JADX INFO: renamed from: getScrollDelta-F1C5BW0, reason: not valid java name */
    public final long m3001getScrollDeltaF1C5BW0() {
        return this.scrollDelta;
    }

    /* JADX INFO: renamed from: getType-T8wyACA, reason: not valid java name */
    public final int m3002getTypeT8wyACA() {
        return this.type;
    }

    public final long getUptime() {
        return this.uptime;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iM2973hashCodeimpl = ((((((PointerId.m2973hashCodeimpl(this.id) * 31) + Long.hashCode(this.uptime)) * 31) + Offset.m1385hashCodeimpl(this.positionOnScreen)) * 31) + Offset.m1385hashCodeimpl(this.position)) * 31;
        boolean z10 = this.down;
        ?? r12 = z10;
        if (z10) {
            r12 = 1;
        }
        int iM3057hashCodeimpl = (((iM2973hashCodeimpl + r12) * 31) + PointerType.m3057hashCodeimpl(this.type)) * 31;
        boolean z11 = this.issuesEnterExit;
        return ((((iM3057hashCodeimpl + (z11 ? 1 : z11)) * 31) + this.historical.hashCode()) * 31) + Offset.m1385hashCodeimpl(this.scrollDelta);
    }

    @NotNull
    public String toString() {
        return "PointerInputEventData(id=" + ((Object) PointerId.m2974toStringimpl(this.id)) + ", uptime=" + this.uptime + ", positionOnScreen=" + ((Object) Offset.m1391toStringimpl(this.positionOnScreen)) + ", position=" + ((Object) Offset.m1391toStringimpl(this.position)) + ", down=" + this.down + ", type=" + ((Object) PointerType.m3058toStringimpl(this.type)) + ", issuesEnterExit=" + this.issuesEnterExit + ", historical=" + this.historical + ", scrollDelta=" + ((Object) Offset.m1391toStringimpl(this.scrollDelta)) + ')';
    }
}
