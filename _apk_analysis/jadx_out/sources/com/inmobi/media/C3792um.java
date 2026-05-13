package com.inmobi.media;

import java.util.Comparator;
import kotlin.Pair;

/* JADX INFO: renamed from: com.inmobi.media.um, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3792um implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Pair pair = (Pair) obj;
        System.out.println((Object) (((C3667pl) pair.getFirst()).f27890c + com.ironsource.Z7.f30794r + pair.getSecond()));
        Double d10 = (Double) pair.getSecond();
        Pair pair2 = (Pair) obj2;
        System.out.println((Object) (((C3667pl) pair2.getFirst()).f27890c + com.ironsource.Z7.f30794r + pair2.getSecond()));
        return fn.b.d(d10, (Double) pair2.getSecond());
    }
}
