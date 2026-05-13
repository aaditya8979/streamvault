package com.ironsource;

import java.util.Date;

/* JADX INFO: renamed from: com.ironsource.l5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C4122l5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f32196a = new Date().getTime();

    public static long a(C4122l5 c4122l5) {
        if (c4122l5 == null) {
            return 0L;
        }
        return new Date().getTime() - c4122l5.f32196a;
    }
}
