package r7;

import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: HttpDataSource.java */
/* JADX INFO: loaded from: classes5.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, String> f78849a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Map<String, String> f78850b;

    public synchronized Map<String, String> a() {
        if (this.f78850b == null) {
            this.f78850b = Collections.unmodifiableMap(new HashMap(this.f78849a));
        }
        return this.f78850b;
    }
}
