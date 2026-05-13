package io.appmetrica.analytics.impl;

import android.os.Handler;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;

/* JADX INFO: loaded from: classes6.dex */
public final class S3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final R3 f65861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile A9 f65862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile A9 f65863c;

    public S3() {
        this(new R3());
    }

    public S3(R3 r32) {
        this.f65861a = r32;
    }

    public final IHandlerExecutor a() {
        if (this.f65862b == null) {
            synchronized (this) {
                if (this.f65862b == null) {
                    this.f65861a.getClass();
                    HandlerThreadC4729db handlerThreadC4729dbA = A9.a("IAA-CDE");
                    this.f65862b = new A9(handlerThreadC4729dbA, handlerThreadC4729dbA.getLooper(), new Handler(handlerThreadC4729dbA.getLooper()));
                }
            }
        }
        return this.f65862b;
    }

    public final ICommonExecutor b() {
        if (this.f65863c == null) {
            synchronized (this) {
                if (this.f65863c == null) {
                    this.f65861a.getClass();
                    HandlerThreadC4729db handlerThreadC4729dbA = A9.a("IAA-CRS");
                    this.f65863c = new A9(handlerThreadC4729dbA, handlerThreadC4729dbA.getLooper(), new Handler(handlerThreadC4729dbA.getLooper()));
                }
            }
        }
        return this.f65863c;
    }
}
