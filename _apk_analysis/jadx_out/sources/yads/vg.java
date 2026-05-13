package yads;

import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class vg extends Lambda implements sn.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wg f96083b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vg(wg wgVar) {
        super(0);
        this.f96083b = wgVar;
    }

    @Override // sn.a
    public final Object invoke() {
        this.f96083b.c();
        this.f96083b.f96376d.getClass();
        rg.a("Connection timeout");
        this.f96083b.a();
        return bn.r.f5635a;
    }
}
