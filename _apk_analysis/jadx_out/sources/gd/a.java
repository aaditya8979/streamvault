package gd;

import java.util.Map;

/* JADX INFO: compiled from: FloatWindow.java */
/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Map<String, b> f62369a;

    public static void a() {
        b("default_float_window_tag");
    }

    public static void b(String str) {
        Map<String, b> map = f62369a;
        if (map == null || !map.containsKey(str)) {
            return;
        }
        f62369a.get(str).a();
        f62369a.remove(str);
    }
}
