package com.inmobi.media;

import java.util.Map;
import kotlin.Result;

/* JADX INFO: loaded from: classes7.dex */
public abstract class H3 {
    public static final Object a(sn.a aVar) {
        tn.p.k(aVar, "block");
        try {
            Result.a aVar2 = Result.Companion;
            return Result.m7534constructorimpl(aVar.invoke());
        } catch (Error e10) {
            Result.a aVar3 = Result.Companion;
            return Result.m7534constructorimpl(kotlin.c.a(e10));
        } catch (Exception e11) {
            Result.a aVar4 = Result.Companion;
            return Result.m7534constructorimpl(kotlin.c.a(e11));
        }
    }

    public static final String a(String str, Map map) {
        tn.p.k(str, "url");
        tn.p.k(map, "macros");
        String strS = str;
        for (Map.Entry entry : map.entrySet()) {
            strS = bo.a0.S(strS, (String) entry.getKey(), (String) entry.getValue(), false, 4, null);
        }
        return strS;
    }
}
