package com.ironsource;

/* JADX INFO: loaded from: classes8.dex */
public class O0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f30017e = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f30018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f30019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f30020c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f30021d;

    public enum a {
        MANUAL,
        MANUAL_WITH_AUTOMATIC_RELOAD,
        MANUAL_WITH_LOAD_ON_SHOW,
        AUTOMATIC_LOAD_AFTER_CLOSE,
        AUTOMATIC_LOAD_WHILE_SHOW
    }

    public O0(a aVar, long j10, long j11, long j12) {
        this.f30018a = aVar;
        this.f30019b = j10;
        this.f30020c = j11;
        this.f30021d = j12;
    }

    public a a() {
        return this.f30018a;
    }

    public long b() {
        return this.f30021d;
    }

    public long c() {
        return this.f30020c;
    }

    public long d() {
        return this.f30019b;
    }

    public boolean e() {
        a aVar = this.f30018a;
        return aVar == a.AUTOMATIC_LOAD_AFTER_CLOSE || aVar == a.AUTOMATIC_LOAD_WHILE_SHOW;
    }

    public boolean f() {
        a aVar = this.f30018a;
        return aVar == a.MANUAL || aVar == a.MANUAL_WITH_AUTOMATIC_RELOAD || aVar == a.MANUAL_WITH_LOAD_ON_SHOW;
    }
}
