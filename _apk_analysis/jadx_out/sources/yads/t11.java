package yads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class t11 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f95041a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map f95042b;

    public final synchronized Map a() {
        if (this.f95042b == null) {
            this.f95042b = Collections.unmodifiableMap(new HashMap(this.f95041a));
        }
        return this.f95042b;
    }
}
