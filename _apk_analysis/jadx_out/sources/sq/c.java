package sq;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: AttributesMap.java */
/* JADX INFO: loaded from: classes9.dex */
public class c implements b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<String, Object> f84468b = new HashMap();

    @Override // sq.b
    public void a(String str, Object obj) {
        if (obj == null) {
            this.f84468b.remove(str);
        } else {
            this.f84468b.put(str, obj);
        }
    }

    public Set<Map.Entry<String, Object>> b() {
        return this.f84468b.entrySet();
    }

    public Enumeration<String> c() {
        return Collections.enumeration(this.f84468b.keySet());
    }

    @Override // sq.b
    public Object getAttribute(String str) {
        return this.f84468b.get(str);
    }

    @Override // sq.b
    public void removeAttribute(String str) {
        this.f84468b.remove(str);
    }

    public String toString() {
        return this.f84468b.toString();
    }

    @Override // sq.b
    public void u() {
        this.f84468b.clear();
    }
}
