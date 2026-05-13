package yads;

import yads.s61;

/* JADX INFO: loaded from: classes3.dex */
public final class s61 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nt1 f94712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l00 f94713b;

    public s61(nt1 nt1Var, l00 l00Var) {
        this.f94712a = nt1Var;
        this.f94713b = l00Var;
    }

    public static final void a(s61 s61Var) {
        s61Var.f94713b.onInitializationCompleted();
    }

    public final void a() {
        nt1 nt1Var = this.f94712a;
        nt1Var.f92935a.f93322a.execute(new Runnable() { // from class: bt.t9
            @Override // java.lang.Runnable
            public final void run() {
                s61.a(this.f6309b);
            }
        });
    }
}
