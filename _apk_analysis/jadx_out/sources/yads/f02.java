package yads;

import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class f02 extends Lambda implements sn.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mi2 f89437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u41 f89438c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f02(mi2 mi2Var, u41 u41Var) {
        super(0);
        this.f89437b = mi2Var;
        this.f89438c = u41Var;
    }

    @Override // sn.a
    public final Object invoke() {
        return this.f89437b.a(this.f89438c);
    }
}
