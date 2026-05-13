package z5;

import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: DefaultContentMetadata.java */
/* JADX INFO: loaded from: classes12.dex */
public final class k implements i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k f98236c = new k(Collections.emptyMap());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f98237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<String, byte[]> f98238b;

    public k() {
        this(Collections.emptyMap());
    }

    public k(Map<String, byte[]> map) {
        this.f98238b = Collections.unmodifiableMap(map);
    }

    public static void c(HashMap<String, byte[]> map, Map<String, Object> map2) {
        for (String str : map2.keySet()) {
            map.put(str, g(map2.get(str)));
        }
    }

    public static Map<String, byte[]> d(Map<String, byte[]> map, j jVar) {
        HashMap map2 = new HashMap(map);
        i(map2, jVar.c());
        c(map2, jVar.b());
        return map2;
    }

    public static byte[] g(Object obj) {
        if (obj instanceof Long) {
            return ByteBuffer.allocate(8).putLong(((Long) obj).longValue()).array();
        }
        if (obj instanceof String) {
            return ((String) obj).getBytes(Charset.forName("UTF-8"));
        }
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        throw new IllegalArgumentException();
    }

    public static boolean h(Map<String, byte[]> map, Map<String, byte[]> map2) {
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry<String, byte[]> entry : map.entrySet()) {
            if (!Arrays.equals(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public static void i(HashMap<String, byte[]> map, List<String> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            map.remove(list.get(i10));
        }
    }

    public k e(j jVar) {
        Map<String, byte[]> mapD = d(this.f98238b, jVar);
        return h(this.f98238b, mapD) ? this : new k(mapD);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        return h(this.f98238b, ((k) obj).f98238b);
    }

    public Set<Map.Entry<String, byte[]>> f() {
        return this.f98238b.entrySet();
    }

    @Override // z5.i
    public final long get(String str, long j10) {
        return this.f98238b.containsKey(str) ? ByteBuffer.wrap(this.f98238b.get(str)).getLong() : j10;
    }

    @Override // z5.i
    @Nullable
    public final String get(String str, @Nullable String str2) {
        return this.f98238b.containsKey(str) ? new String(this.f98238b.get(str), Charset.forName("UTF-8")) : str2;
    }

    public int hashCode() {
        if (this.f98237a == 0) {
            int iHashCode = 0;
            for (Map.Entry<String, byte[]> entry : this.f98238b.entrySet()) {
                iHashCode += Arrays.hashCode(entry.getValue()) ^ entry.getKey().hashCode();
            }
            this.f98237a = iHashCode;
        }
        return this.f98237a;
    }
}
