package d6;

import java.util.HashSet;

/* JADX INFO: compiled from: ExoPlayerLibraryInfo.java */
/* JADX INFO: loaded from: classes7.dex */
public final class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashSet<String> f59712a = new HashSet<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f59713b = "goog.exo.core";

    public static synchronized void a(String str) {
        if (f59712a.add(str)) {
            f59713b += ", " + str;
        }
    }

    public static synchronized String b() {
        return f59713b;
    }
}
