package yads;

import java.util.HashSet;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ho0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashSet f90472a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f90473b = "goog.exo.core";

    public static synchronized void a(String str) {
        if (f90472a.add(str)) {
            f90473b += ", " + str;
        }
    }
}
