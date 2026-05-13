package androidx.work.impl.constraints.controllers;

import androidx.work.impl.constraints.ConstraintListener;
import androidx.work.impl.constraints.trackers.ConstraintTracker;
import androidx.work.impl.model.WorkSpec;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: ConstraintController.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u001c\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\r\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001)B\u0017\b\u0000\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a¢\u0006\u0004\b'\u0010(J#\u0010\u0007\u001a\u00020\u00062\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH&J\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00028\u0000H&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0014\u0010\u0012\u001a\u00020\u00062\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u0010J\u0006\u0010\u0013\u001a\u00020\u0006J\u000e\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0014J\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00140\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001fR\u0018\u0010\u0005\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010!R.\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006*"}, d2 = {"Landroidx/work/impl/constraints/controllers/ConstraintController;", "T", "Landroidx/work/impl/constraints/ConstraintListener;", "Landroidx/work/impl/constraints/controllers/ConstraintController$OnConstraintUpdatedCallback;", "callback", "currentValue", "Lbn/r;", "updateCallback", "(Landroidx/work/impl/constraints/controllers/ConstraintController$OnConstraintUpdatedCallback;Ljava/lang/Object;)V", "Landroidx/work/impl/model/WorkSpec;", "workSpec", "", "hasConstraint", "value", "isConstrained", "(Ljava/lang/Object;)Z", "", "workSpecs", "replace", "reset", "", "workSpecId", "isWorkSpecConstrained", "newValue", "onConstraintChanged", "(Ljava/lang/Object;)V", "Landroidx/work/impl/constraints/trackers/ConstraintTracker;", "tracker", "Landroidx/work/impl/constraints/trackers/ConstraintTracker;", "", "matchingWorkSpecs", "Ljava/util/List;", "matchingWorkSpecIds", "Ljava/lang/Object;", "Landroidx/work/impl/constraints/controllers/ConstraintController$OnConstraintUpdatedCallback;", "getCallback", "()Landroidx/work/impl/constraints/controllers/ConstraintController$OnConstraintUpdatedCallback;", "setCallback", "(Landroidx/work/impl/constraints/controllers/ConstraintController$OnConstraintUpdatedCallback;)V", "<init>", "(Landroidx/work/impl/constraints/trackers/ConstraintTracker;)V", "OnConstraintUpdatedCallback", "work-runtime_release"}, k = 1, mv = {1, 7, 1})
public abstract class ConstraintController<T> implements ConstraintListener<T> {

    @Nullable
    private OnConstraintUpdatedCallback callback;

    @Nullable
    private T currentValue;

    @NotNull
    private final List<String> matchingWorkSpecIds;

    @NotNull
    private final List<WorkSpec> matchingWorkSpecs;

    @NotNull
    private final ConstraintTracker<T> tracker;

    /* JADX INFO: compiled from: ConstraintController.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u0016\u0010\u0007\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¨\u0006\b"}, d2 = {"Landroidx/work/impl/constraints/controllers/ConstraintController$OnConstraintUpdatedCallback;", "", "", "Landroidx/work/impl/model/WorkSpec;", "workSpecs", "Lbn/r;", "onConstraintMet", "onConstraintNotMet", "work-runtime_release"}, k = 1, mv = {1, 7, 1})
    public interface OnConstraintUpdatedCallback {
        void onConstraintMet(@NotNull List<WorkSpec> list);

        void onConstraintNotMet(@NotNull List<WorkSpec> list);
    }

    public ConstraintController(@NotNull ConstraintTracker<T> constraintTracker) {
        p.k(constraintTracker, "tracker");
        this.tracker = constraintTracker;
        this.matchingWorkSpecs = new ArrayList();
        this.matchingWorkSpecIds = new ArrayList();
    }

    private final void updateCallback(OnConstraintUpdatedCallback callback, T currentValue) {
        if (this.matchingWorkSpecs.isEmpty() || callback == null) {
            return;
        }
        if (currentValue == null || isConstrained(currentValue)) {
            callback.onConstraintNotMet(this.matchingWorkSpecs);
        } else {
            callback.onConstraintMet(this.matchingWorkSpecs);
        }
    }

    @Nullable
    public final OnConstraintUpdatedCallback getCallback() {
        return this.callback;
    }

    public abstract boolean hasConstraint(@NotNull WorkSpec workSpec);

    public abstract boolean isConstrained(T value);

    public final boolean isWorkSpecConstrained(@NotNull String workSpecId) {
        p.k(workSpecId, "workSpecId");
        T t10 = this.currentValue;
        return t10 != null && isConstrained(t10) && this.matchingWorkSpecIds.contains(workSpecId);
    }

    @Override // androidx.work.impl.constraints.ConstraintListener
    public void onConstraintChanged(T newValue) {
        this.currentValue = newValue;
        updateCallback(this.callback, newValue);
    }

    public final void replace(@NotNull Iterable<WorkSpec> iterable) {
        p.k(iterable, "workSpecs");
        this.matchingWorkSpecs.clear();
        this.matchingWorkSpecIds.clear();
        List<WorkSpec> list = this.matchingWorkSpecs;
        for (WorkSpec workSpec : iterable) {
            if (hasConstraint(workSpec)) {
                list.add(workSpec);
            }
        }
        List<WorkSpec> list2 = this.matchingWorkSpecs;
        List<String> list3 = this.matchingWorkSpecIds;
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            list3.add(((WorkSpec) it.next()).id);
        }
        if (this.matchingWorkSpecs.isEmpty()) {
            this.tracker.removeListener(this);
        } else {
            this.tracker.addListener(this);
        }
        updateCallback(this.callback, this.currentValue);
    }

    public final void reset() {
        if (!this.matchingWorkSpecs.isEmpty()) {
            this.matchingWorkSpecs.clear();
            this.tracker.removeListener(this);
        }
    }

    public final void setCallback(@Nullable OnConstraintUpdatedCallback onConstraintUpdatedCallback) {
        if (this.callback != onConstraintUpdatedCallback) {
            this.callback = onConstraintUpdatedCallback;
            updateCallback(onConstraintUpdatedCallback, this.currentValue);
        }
    }
}
