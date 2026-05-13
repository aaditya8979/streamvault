package df;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: SignalsResult.java */
/* JADX INFO: loaded from: classes6.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map<String, String> f59773a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f59774b = null;

    public void a(String str, String str2) {
        this.f59773a.put(str, str2);
    }

    public String b() {
        return this.f59774b;
    }

    public Map<String, String> c() {
        return this.f59773a;
    }

    public void d(String str) {
        this.f59774b = str;
    }
}
