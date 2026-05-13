package com.bytedance.adsdk.ouw.vt.yu;

import com.safedk.android.analytics.brandsafety.ImpressionLog;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public enum lh implements fkw {
    QUESTION("?", 0),
    COLON(StringUtils.PROCESS_POSTFIX_DELIMITER, 0),
    DOUBLE_AMP("&&", 1),
    DOUBLE_BAR(ImpressionLog.P, 1),
    EQ("==", 2),
    GT(">", 2),
    LT("<", 2),
    LT_EQ("<=", 2),
    GT_EQ(">=", 2),
    NOT_EQ("!=", 2),
    PLUS("+", 3),
    MINUS("-", 3),
    MULTI("*", 4),
    DIVISION("/", 4),
    MOD("%", 4);


    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    public final String f11586rn;
    public final int zih;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    private static final Map<String, lh> f11585vm = new HashMap(128);

    /* JADX INFO: renamed from: th, reason: collision with root package name */
    private static final Set<lh> f11584th = new HashSet();

    static {
        for (lh lhVar : values()) {
            f11585vm.put(lhVar.f11586rn, lhVar);
            f11584th.add(lhVar);
        }
    }

    lh(String str, int i10) {
        this.f11586rn = str;
        this.zih = i10;
    }

    public static lh ouw(String str) {
        return f11585vm.get(str);
    }

    public static boolean ouw(fkw fkwVar) {
        return fkwVar instanceof lh;
    }
}
