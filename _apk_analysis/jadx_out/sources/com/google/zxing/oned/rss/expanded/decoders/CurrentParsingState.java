package com.google.zxing.oned.rss.expanded.decoders;

/* JADX INFO: loaded from: classes10.dex */
public final class CurrentParsingState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f23669a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public State f23670b = State.NUMERIC;

    public enum State {
        NUMERIC,
        ALPHA,
        ISO_IEC_646
    }

    public int a() {
        return this.f23669a;
    }

    public void b(int i10) {
        this.f23669a += i10;
    }

    public boolean c() {
        return this.f23670b == State.ALPHA;
    }

    public boolean d() {
        return this.f23670b == State.ISO_IEC_646;
    }

    public void e() {
        this.f23670b = State.ALPHA;
    }

    public void f() {
        this.f23670b = State.ISO_IEC_646;
    }

    public void g() {
        this.f23670b = State.NUMERIC;
    }

    public void h(int i10) {
        this.f23669a = i10;
    }
}
