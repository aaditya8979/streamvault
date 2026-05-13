package com.ironsource;

import com.ironsource.O8;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class Te implements O8, O8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<String, Integer> f30514a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Map<String, Integer> f30515b = new HashMap();

    @Override // com.ironsource.O8.a
    public void a(@NotNull O8.b bVar) {
        tn.p.k(bVar, "smash");
        synchronized (this) {
            String strC = bVar.c();
            if (this.f30514a.containsKey(strC)) {
                Map<String, Integer> map = this.f30514a;
                Integer num = map.get(strC);
                tn.p.h(num);
                map.put(strC, Integer.valueOf(num.intValue() + 1));
            }
            bn.r rVar = bn.r.f5635a;
        }
    }

    @Override // com.ironsource.O8.a
    public void a(@NotNull List<? extends O8.b> list) {
        tn.p.k(list, "smashes");
        for (O8.b bVar : list) {
            this.f30514a.put(bVar.c(), 0);
            this.f30515b.put(bVar.c(), Integer.valueOf(bVar.b()));
        }
    }

    @Override // com.ironsource.O8
    public boolean a() {
        for (String str : this.f30515b.keySet()) {
            Integer num = this.f30514a.get(str);
            tn.p.h(num);
            int iIntValue = num.intValue();
            Integer num2 = this.f30515b.get(str);
            tn.p.h(num2);
            if (iIntValue < num2.intValue()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    @Override // com.ironsource.O8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean b(@org.jetbrains.annotations.NotNull com.ironsource.O8.b r3) {
        /*
            r2 = this;
            java.lang.String r0 = "smash"
            tn.p.k(r3, r0)
            monitor-enter(r2)
            java.lang.String r0 = r3.c()     // Catch: java.lang.Throwable -> L2c
            java.util.Map<java.lang.String, java.lang.Integer> r1 = r2.f30514a     // Catch: java.lang.Throwable -> L2c
            boolean r1 = r1.containsKey(r0)     // Catch: java.lang.Throwable -> L2c
            if (r1 == 0) goto L29
            java.util.Map<java.lang.String, java.lang.Integer> r1 = r2.f30514a     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r0 = r1.get(r0)     // Catch: java.lang.Throwable -> L2c
            tn.p.h(r0)     // Catch: java.lang.Throwable -> L2c
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.Throwable -> L2c
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L2c
            int r3 = r3.b()     // Catch: java.lang.Throwable -> L2c
            if (r0 < r3) goto L29
            r3 = 1
            goto L2a
        L29:
            r3 = 0
        L2a:
            monitor-exit(r2)
            return r3
        L2c:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.Te.b(com.ironsource.O8$b):boolean");
    }
}
