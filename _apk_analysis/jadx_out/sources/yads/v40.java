package yads;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class v40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f95917a;

    public v40(ArrayList arrayList) {
        this.f95917a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v40) && tn.p.f(this.f95917a, ((v40) obj).f95917a);
    }

    public final int hashCode() {
        return this.f95917a.hashCode();
    }

    public final String toString() {
        return "DebugPanelAdUnitsData(adUnits=" + this.f95917a + ")";
    }
}
