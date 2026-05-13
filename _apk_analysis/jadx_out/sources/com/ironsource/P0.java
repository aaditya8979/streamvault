package com.ironsource;

/* JADX INFO: loaded from: classes7.dex */
public class P0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f30094e = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f30095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f30096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f30097c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f30098d;

    public enum a {
        MANUAL,
        MANUAL_WITH_AUTOMATIC_RELOAD,
        AUTOMATIC_LOAD_AFTER_CLOSE,
        AUTOMATIC_LOAD_WHILE_SHOW
    }

    public P0(a aVar, long j10, long j11, long j12) {
        this.f30095a = aVar;
        this.f30096b = j10;
        this.f30097c = j11;
        this.f30098d = j12;
    }

    public a a() {
        return this.f30095a;
    }

    public long b() {
        return this.f30098d;
    }

    public long c() {
        return this.f30097c;
    }

    public long d() {
        return this.f30096b;
    }

    public boolean e() {
        a aVar = this.f30095a;
        return aVar == a.AUTOMATIC_LOAD_AFTER_CLOSE || aVar == a.AUTOMATIC_LOAD_WHILE_SHOW;
    }

    public boolean f() {
        a aVar = this.f30095a;
        return aVar == a.MANUAL || aVar == a.MANUAL_WITH_AUTOMATIC_RELOAD;
    }
}
