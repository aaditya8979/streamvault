package androidx.work.impl.constraints;

import androidx.work.impl.model.WorkSpec;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: WorkConstraintsCallback.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u0016\u0010\u0007\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¨\u0006\b"}, d2 = {"Landroidx/work/impl/constraints/WorkConstraintsCallback;", "", "", "Landroidx/work/impl/model/WorkSpec;", "workSpecs", "Lbn/r;", "onAllConstraintsMet", "onAllConstraintsNotMet", "work-runtime_release"}, k = 1, mv = {1, 7, 1})
public interface WorkConstraintsCallback {
    void onAllConstraintsMet(@NotNull List<WorkSpec> list);

    void onAllConstraintsNotMet(@NotNull List<WorkSpec> list);
}
