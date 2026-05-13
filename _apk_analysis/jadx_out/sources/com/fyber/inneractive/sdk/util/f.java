package com.fyber.inneractive.sdk.util;

import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f19526b = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentLinkedQueue f19527a = new ConcurrentLinkedQueue();

    public f() {
        for (int i10 = 0; i10 < 2; i10++) {
            this.f19527a.offer(ByteBuffer.allocateDirect(16384));
        }
    }
}
