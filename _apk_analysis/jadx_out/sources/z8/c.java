package z8;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: ExpandedRow.java */
/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<b> f98251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f98252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f98253c;

    public c(List<b> list, int i10, boolean z10) {
        this.f98251a = new ArrayList(list);
        this.f98252b = i10;
        this.f98253c = z10;
    }

    public List<b> a() {
        return this.f98251a;
    }

    public int b() {
        return this.f98252b;
    }

    public boolean c(List<b> list) {
        return this.f98251a.equals(list);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f98251a.equals(cVar.f98251a) && this.f98253c == cVar.f98253c;
    }

    public int hashCode() {
        return this.f98251a.hashCode() ^ Boolean.valueOf(this.f98253c).hashCode();
    }

    public String toString() {
        return "{ " + this.f98251a + " }";
    }
}
