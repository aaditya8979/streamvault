package androidx.compose.ui.input.pointer.util;

import io.bidmachine.iab.vast.tags.VastAttributes;
import kotlin.Metadata;

/* JADX INFO: compiled from: VelocityTracker.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u0006\u0010\t\u001a\u00020\u0007R\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/input/pointer/util/ImpulseCalculator;", "", "", "getVelocity", "", "timeMillis", VastAttributes.HORIZONTAL_POSITION, "Lbn/r;", "addPosition", "reset", "work", "F", "previousT", "J", "previousX", "", "initialCondition", "Z", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 6, 0})
final class ImpulseCalculator {
    private float work;
    private long previousT = Long.MAX_VALUE;
    private float previousX = Float.NaN;
    private boolean initialCondition = true;

    public final void addPosition(long j10, float f10) {
        if (this.previousT == Long.MAX_VALUE || Float.isNaN(this.previousX)) {
            this.previousT = j10;
            this.previousX = f10;
            return;
        }
        if (j10 == this.previousT) {
            this.previousX = f10;
            return;
        }
        float fKineticEnergyToVelocity = VelocityTrackerKt.kineticEnergyToVelocity(this.work);
        float f11 = (f10 - this.previousX) / ((j10 - this.previousT) * 0.001f);
        float fAbs = this.work + ((f11 - fKineticEnergyToVelocity) * Math.abs(f11));
        this.work = fAbs;
        if (this.initialCondition) {
            this.work = fAbs * 0.5f;
            this.initialCondition = false;
        }
        this.previousT = j10;
        this.previousX = f10;
    }

    public final float getVelocity() {
        return VelocityTrackerKt.kineticEnergyToVelocity(this.work);
    }

    public final void reset() {
        this.work = 0.0f;
        this.previousT = Long.MAX_VALUE;
        this.previousX = Float.NaN;
        this.initialCondition = true;
    }
}
