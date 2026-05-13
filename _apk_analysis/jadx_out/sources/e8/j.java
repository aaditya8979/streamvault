package e8;

import com.google.gson.internal.LinkedTreeMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: JsonObject.java */
/* JADX INFO: loaded from: classes2.dex */
public final class j extends h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedTreeMap<String, h> f60936b = new LinkedTreeMap<>();

    public Set<Map.Entry<String, h>> entrySet() {
        return this.f60936b.entrySet();
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof j) && ((j) obj).f60936b.equals(this.f60936b));
    }

    public int hashCode() {
        return this.f60936b.hashCode();
    }

    public void m(String str, h hVar) {
        if (hVar == null) {
            hVar = i.f60935b;
        }
        this.f60936b.put(str, hVar);
    }
}
