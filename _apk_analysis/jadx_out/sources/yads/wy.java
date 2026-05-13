package yads;

import com.ironsource.C3978d4;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class wy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xa2 f96559a;

    public /* synthetic */ wy() {
        this(new xa2());
    }

    public wy(xa2 xa2Var) {
        this.f96559a = xa2Var;
    }

    public final fo2 a(d4 d4Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!tn.y.m(linkedHashMap)) {
            linkedHashMap = null;
        }
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
        }
        xa2 xa2Var = this.f96559a;
        int i10 = d4Var.f88753n;
        xa2Var.getClass();
        linkedHashMap.put("orientation", i10 != 1 ? i10 != 2 ? "undefined" : C3978d4.i.C : C3978d4.i.D);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (!tn.y.m(linkedHashMap2)) {
            linkedHashMap2 = null;
        }
        if (linkedHashMap2 == null) {
            linkedHashMap2 = new LinkedHashMap();
        }
        linkedHashMap2.put("image_loading_automatically", Boolean.valueOf(d4Var.f88752m));
        return new fo2(kotlin.collections.a.q(linkedHashMap, linkedHashMap2), (c) null);
    }
}
