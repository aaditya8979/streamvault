package yads;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class jc0 implements qz {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final jc0 f91151c = new jc0(Collections.emptyMap());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f91152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f91153b;

    public jc0(Map map) {
        this.f91153b = Collections.unmodifiableMap(map);
    }

    public final String a() {
        byte[] bArr = (byte[]) this.f91153b.get("exo_redir");
        if (bArr != null) {
            return new String(bArr, bu.f88145c);
        }
        return null;
    }

    public final jc0 a(rz rzVar) {
        byte[] bytes;
        HashMap map = new HashMap(this.f91153b);
        List listUnmodifiableList = Collections.unmodifiableList(new ArrayList(rzVar.f94651b));
        for (int i10 = 0; i10 < listUnmodifiableList.size(); i10++) {
            map.remove(listUnmodifiableList.get(i10));
        }
        for (Map.Entry entry : rzVar.a().entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Long) {
                bytes = ByteBuffer.allocate(8).putLong(((Long) value).longValue()).array();
            } else if (value instanceof String) {
                bytes = ((String) value).getBytes(bu.f88145c);
            } else {
                if (!(value instanceof byte[])) {
                    throw new IllegalArgumentException();
                }
                bytes = (byte[]) value;
            }
            map.put(str, bytes);
        }
        Map map2 = this.f91153b;
        if (map2.size() == map.size()) {
            for (Map.Entry entry2 : map2.entrySet()) {
                if (!Arrays.equals((byte[]) entry2.getValue(), (byte[]) map.get(entry2.getKey()))) {
                }
            }
            return this;
        }
        return new jc0(map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || jc0.class != obj.getClass()) {
            return false;
        }
        Map map = this.f91153b;
        Map map2 = ((jc0) obj).f91153b;
        if (map.size() == map2.size()) {
            for (Map.Entry entry : map.entrySet()) {
                if (!Arrays.equals((byte[]) entry.getValue(), (byte[]) map2.get(entry.getKey()))) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f91152a == 0) {
            int iHashCode = 0;
            for (Map.Entry entry : this.f91153b.entrySet()) {
                iHashCode += Arrays.hashCode((byte[]) entry.getValue()) ^ ((String) entry.getKey()).hashCode();
            }
            this.f91152a = iHashCode;
        }
        return this.f91152a;
    }
}
