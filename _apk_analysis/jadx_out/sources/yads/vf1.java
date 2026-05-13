package yads;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public final class vf1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicLong f96078a = new AtomicLong();

    public static long a() {
        return f96078a.getAndIncrement();
    }
}
