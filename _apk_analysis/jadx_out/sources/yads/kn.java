package yads;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class kn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f91661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f91662b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kn(Map map) {
        this(t01.a(map, u11.U), t01.a(map, u11.V));
        t01.a(map, u11.T);
    }

    public kn(boolean z10, boolean z11) {
        this.f91661a = z10;
        this.f91662b = z11;
    }

    public final boolean a() {
        return this.f91661a;
    }
}
