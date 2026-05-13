package androidx.compose.runtime;

import cn.f0;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: SlotTable.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\b\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\u0002J\u0006\u0010\n\u001a\u00020\u0002J\u0006\u0010\u000b\u001a\u00020\u0004R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Landroidx/compose/runtime/PrioritySet;", "", "", "value", "Lbn/r;", ImpressionLog.f51742l, "", "isEmpty", "isNotEmpty", "peek", "takeMax", "validateHeap", "", "list", "Ljava/util/List;", "<init>", "(Ljava/util/List;)V", "runtime_release"}, k = 1, mv = {1, 6, 0})
public final class PrioritySet {

    @NotNull
    private final List<Integer> list;

    /* JADX WARN: Multi-variable type inference failed */
    public PrioritySet() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public PrioritySet(@NotNull List<Integer> list) {
        p.k(list, "list");
        this.list = list;
    }

    public /* synthetic */ PrioritySet(List list, int i10, i iVar) {
        this((i10 & 1) != 0 ? new ArrayList() : list);
    }

    public final void add(int i10) {
        if (!this.list.isEmpty()) {
            if (this.list.get(0).intValue() == i10) {
                return;
            }
            if (this.list.get(r0.size() - 1).intValue() == i10) {
                return;
            }
        }
        int size = this.list.size();
        this.list.add(Integer.valueOf(i10));
        while (size > 0) {
            int i11 = ((size + 1) >>> 1) - 1;
            int iIntValue = this.list.get(i11).intValue();
            if (i10 <= iIntValue) {
                break;
            }
            this.list.set(size, Integer.valueOf(iIntValue));
            size = i11;
        }
        this.list.set(size, Integer.valueOf(i10));
    }

    public final boolean isEmpty() {
        return this.list.isEmpty();
    }

    public final boolean isNotEmpty() {
        return !this.list.isEmpty();
    }

    public final int peek() {
        return ((Number) f0.t0(this.list)).intValue();
    }

    public final int takeMax() {
        int iIntValue;
        if (!(this.list.size() > 0)) {
            ComposerKt.composeRuntimeError("Set is empty".toString());
            throw new KotlinNothingValueException();
        }
        int iIntValue2 = this.list.get(0).intValue();
        while ((!this.list.isEmpty()) && this.list.get(0).intValue() == iIntValue2) {
            List<Integer> list = this.list;
            list.set(0, (Integer) f0.F0(list));
            List<Integer> list2 = this.list;
            list2.remove(list2.size() - 1);
            int size = this.list.size();
            int size2 = this.list.size() >>> 1;
            int i10 = 0;
            while (i10 < size2) {
                int iIntValue3 = this.list.get(i10).intValue();
                int i11 = (i10 + 1) * 2;
                int i12 = i11 - 1;
                int iIntValue4 = this.list.get(i12).intValue();
                if (i11 >= size || (iIntValue = this.list.get(i11).intValue()) <= iIntValue4) {
                    if (iIntValue4 > iIntValue3) {
                        this.list.set(i10, Integer.valueOf(iIntValue4));
                        this.list.set(i12, Integer.valueOf(iIntValue3));
                        i10 = i12;
                    }
                } else if (iIntValue > iIntValue3) {
                    this.list.set(i10, Integer.valueOf(iIntValue));
                    this.list.set(i11, Integer.valueOf(iIntValue3));
                    i10 = i11;
                }
            }
        }
        return iIntValue2;
    }

    public final void validateHeap() {
        int size = this.list.size();
        int i10 = size / 2;
        int i11 = 0;
        while (i11 < i10) {
            int i12 = i11 + 1;
            int i13 = i12 * 2;
            boolean z10 = true;
            if (!(this.list.get(i11).intValue() >= this.list.get(i13 + (-1)).intValue())) {
                throw new IllegalStateException("Check failed.".toString());
            }
            if (i13 < size && this.list.get(i11).intValue() < this.list.get(i13).intValue()) {
                z10 = false;
            }
            if (!z10) {
                throw new IllegalStateException("Check failed.".toString());
            }
            i11 = i12;
        }
    }
}
