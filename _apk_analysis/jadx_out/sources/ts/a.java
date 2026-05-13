package ts;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: BasicMDCAdapter.java */
/* JADX INFO: loaded from: classes12.dex */
public class a implements us.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f85398a = new k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InheritableThreadLocal<Map<String, String>> f85399b = new C1066a();

    /* JADX INFO: renamed from: ts.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BasicMDCAdapter.java */
    public class C1066a extends InheritableThreadLocal<Map<String, String>> {
        public C1066a() {
        }

        @Override // java.lang.InheritableThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map<String, String> childValue(Map<String, String> map) {
            if (map == null) {
                return null;
            }
            return new HashMap(map);
        }
    }
}
