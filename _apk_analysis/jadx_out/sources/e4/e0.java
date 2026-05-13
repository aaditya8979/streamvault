package e4;

import java.util.HashSet;

/* JADX INFO: compiled from: ExoPlayerLibraryInfo.java */
/* JADX INFO: loaded from: classes11.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashSet<String> f60103a = new HashSet<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f60104b = "goog.exo.core";

    public static synchronized void a(String str) {
        if (f60103a.add(str)) {
            f60104b += ", " + str;
        }
    }

    public static synchronized String b() {
        return f60104b;
    }
}
