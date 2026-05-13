package com.ironsource;

import java.util.HashMap;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final M f29819a = new M();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final HashMap<String, Long> f29820b = new HashMap<>();

    private M() {
    }

    @NotNull
    public final HashMap<String, Long> a() {
        return f29820b;
    }

    public final boolean a(@NotNull String str) {
        tn.p.k(str, C4157n2.f33007p);
        HashMap<String, Long> map = f29820b;
        if (map.get(str) == null) {
            return false;
        }
        map.remove(str);
        return true;
    }

    public final boolean a(@NotNull String str, long j10) {
        tn.p.k(str, C4157n2.f33007p);
        if (str.length() == 0) {
            return false;
        }
        HashMap<String, Long> map = f29820b;
        if (map.containsKey(str)) {
            return false;
        }
        map.put(str, Long.valueOf(j10));
        return true;
    }

    public final long b(@NotNull String str) {
        tn.p.k(str, C4157n2.f33007p);
        Long l10 = f29820b.get(str);
        if (l10 != null) {
            return System.currentTimeMillis() - l10.longValue();
        }
        return -1L;
    }

    public final long c(@NotNull String str) {
        tn.p.k(str, C4157n2.f33007p);
        Long l10 = f29820b.get(str);
        if (l10 != null) {
            return l10.longValue();
        }
        return -1L;
    }
}
