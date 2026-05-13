package yads;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes12.dex */
public abstract class y21 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicLong f96978a = new AtomicLong();

    public static final long a() {
        return f96978a.getAndIncrement();
    }
}
