package gl;

import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: HttpHeaderValueParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f62546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<j> f62547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f62548c;

    public i(@NotNull String str, @NotNull List<j> list) {
        Object next;
        String strD;
        Double dO;
        tn.p.k(str, "value");
        tn.p.k(list, "params");
        this.f62546a = str;
        this.f62547b = list;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (tn.p.f(((j) next).c(), "q")) {
                    break;
                }
            }
        }
        j jVar = (j) next;
        double dDoubleValue = 1.0d;
        if (jVar != null && (strD = jVar.d()) != null && (dO = bo.y.o(strD)) != null) {
            double dDoubleValue2 = dO.doubleValue();
            boolean z10 = false;
            if (0.0d <= dDoubleValue2 && dDoubleValue2 <= 1.0d) {
                z10 = true;
            }
            Double d10 = z10 ? dO : null;
            if (d10 != null) {
                dDoubleValue = d10.doubleValue();
            }
        }
        this.f62548c = dDoubleValue;
    }

    @NotNull
    public final List<j> a() {
        return this.f62547b;
    }

    @NotNull
    public final String b() {
        return this.f62546a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return tn.p.f(this.f62546a, iVar.f62546a) && tn.p.f(this.f62547b, iVar.f62547b);
    }

    public int hashCode() {
        return (this.f62546a.hashCode() * 31) + this.f62547b.hashCode();
    }

    @NotNull
    public String toString() {
        return "HeaderValue(value=" + this.f62546a + ", params=" + this.f62547b + ')';
    }
}
