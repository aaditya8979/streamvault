package yads;

import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class ah2 implements wa3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lv f87699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o53 f87700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final be0 f87701c;

    public ah2(lv lvVar, o53 o53Var, be0 be0Var) {
        this.f87699a = lvVar;
        this.f87700b = o53Var;
        this.f87701c = be0Var;
    }

    @Override // yads.wa3
    public final void a(String str, Map map) {
        String strA = this.f87701c.a(str, map);
        if (strA.length() == 0) {
            boolean z10 = ad1.f87661a;
        } else {
            this.f87700b.a(this.f87699a, strA);
        }
    }
}
