package io.appmetrica.analytics.impl;

import android.os.Handler;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import java.util.HashMap;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.lk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4944lk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4918kk f67240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile A9 f67241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile A9 f67242c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile A9 f67243d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile A9 f67244e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile A9 f67245f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile A9 f67246g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile ExecutorC4892jk f67247h;

    public C4944lk() {
        this(new C4918kk());
    }

    public C4944lk(C4918kk c4918kk) {
        new HashMap();
        this.f67240a = c4918kk;
    }

    public final IHandlerExecutor a() {
        if (this.f67246g == null) {
            synchronized (this) {
                if (this.f67246g == null) {
                    this.f67240a.getClass();
                    HandlerThreadC4729db handlerThreadC4729dbA = A9.a("IAA-SDE");
                    this.f67246g = new A9(handlerThreadC4729dbA, handlerThreadC4729dbA.getLooper(), new Handler(handlerThreadC4729dbA.getLooper()));
                }
            }
        }
        return this.f67246g;
    }

    public final IHandlerExecutor b() {
        if (this.f67243d == null) {
            synchronized (this) {
                if (this.f67243d == null) {
                    this.f67240a.getClass();
                    HandlerThreadC4729db handlerThreadC4729dbA = A9.a("IAA-SMH-1");
                    this.f67243d = new A9(handlerThreadC4729dbA, handlerThreadC4729dbA.getLooper(), new Handler(handlerThreadC4729dbA.getLooper()));
                }
            }
        }
        return this.f67243d;
    }

    public final IHandlerExecutor c() {
        if (this.f67244e == null) {
            synchronized (this) {
                if (this.f67244e == null) {
                    this.f67240a.getClass();
                    HandlerThreadC4729db handlerThreadC4729dbA = A9.a("IAA-SNTPE");
                    this.f67244e = new A9(handlerThreadC4729dbA, handlerThreadC4729dbA.getLooper(), new Handler(handlerThreadC4729dbA.getLooper()));
                }
            }
        }
        return this.f67244e;
    }

    public final IHandlerExecutor d() {
        if (this.f67242c == null) {
            synchronized (this) {
                if (this.f67242c == null) {
                    this.f67240a.getClass();
                    HandlerThreadC4729db handlerThreadC4729dbA = A9.a("IAA-STE");
                    this.f67242c = new A9(handlerThreadC4729dbA, handlerThreadC4729dbA.getLooper(), new Handler(handlerThreadC4729dbA.getLooper()));
                }
            }
        }
        return this.f67242c;
    }
}
