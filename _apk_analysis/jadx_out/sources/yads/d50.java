package yads;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class d50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f88759a;

    public d50(ArrayList arrayList) {
        this.f88759a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d50) && tn.p.f(this.f88759a, ((d50) obj).f88759a);
    }

    public final int hashCode() {
        return this.f88759a.hashCode();
    }

    public final String toString() {
        return "DebugPanelAdaptersData(adapters=" + this.f88759a + ")";
    }
}
