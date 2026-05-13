package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class Rn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Hn f65845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final V f65846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f65847c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f65848d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f65849e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f65850f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f65851g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Boolean f65852h;

    public Rn(Hn hn2, V v10, ArrayList arrayList, String str, String str2, Map map, String str3, Boolean bool) {
        this.f65845a = hn2;
        this.f65846b = v10;
        this.f65847c = arrayList;
        this.f65848d = str;
        this.f65849e = str2;
        this.f65850f = map;
        this.f65851g = str3;
        this.f65852h = bool;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        Hn hn2 = this.f65845a;
        if (hn2 != null) {
            for (El el2 : hn2.f65342c) {
                sb2.append("at " + el2.f65216a + "." + el2.f65220e + "(" + el2.f65217b + StringUtils.PROCESS_POSTFIX_DELIMITER + el2.f65218c + StringUtils.PROCESS_POSTFIX_DELIMITER + el2.f65219d + ")\n");
            }
        }
        return "UnhandledException{exception=" + this.f65845a + "\n" + sb2.toString() + '}';
    }
}
