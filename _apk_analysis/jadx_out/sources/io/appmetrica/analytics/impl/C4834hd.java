package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleServiceEventHandler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.hd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4834hd extends Sg {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f66916b;

    public C4834hd(@NotNull Y4 y42) {
        super(y42);
        String strB = y42.b().b();
        strB = strB == null ? "empty" : strB;
        tn.x xVar = tn.x.f85368a;
        String.format("[ModulesEventHandler-%s]", Arrays.copyOf(new Object[]{strB}, 1));
        LinkedHashMap linkedHashMapA = C5009oa.k().o().a(strB);
        ArrayList arrayList = new ArrayList(linkedHashMapA.size());
        for (Map.Entry entry : linkedHashMapA.entrySet()) {
            arrayList.add(bn.h.a(entry.getValue(), new Uc(y42, (String) entry.getKey())));
        }
        this.f66916b = arrayList;
    }

    @Override // io.appmetrica.analytics.impl.Sg
    public final boolean a(@NotNull Q5 q52) {
        if (!this.f65880a.f66233t.c()) {
            return false;
        }
        ArrayList<Pair> arrayList = this.f66916b;
        if ((arrayList instanceof Collection) && arrayList.isEmpty()) {
            return false;
        }
        for (Pair pair : arrayList) {
            ModuleServiceEventHandler moduleServiceEventHandler = (ModuleServiceEventHandler) pair.component1();
            Uc uc2 = (Uc) pair.component2();
            if (moduleServiceEventHandler.handle(new Xc(uc2.f65992b, uc2.f65991a, new Wc(uc2.f65994d, uc2.f65993c, q52)), q52)) {
                return true;
            }
        }
        return false;
    }
}
