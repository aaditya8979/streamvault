package com.facebook.ads.redexgen.core;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC2441bu {
    public static String[] A00 = {"M7M7680JiQXMJzeuHBUdBK3CqcsunIE3", "7YJQc0MEUr6fNb1HoLhvfznehf2fNPi1", "fqXve0BGHc", "EJDyhBK8ScH8NN0H4G45MCvGKFSIU6i3", "lE5hsHUrpnTpaSUAUiDOdKdDJm2EXpBt", "fXhWa5fzMs", "jGMjXmbPjJmsUXbAj46daPhZmilD9JtA", "gy7nSuWAyo"};
    public static final Map<String, WeakReference<C2440bt>> A01 = new HashMap();

    public static int A00() {
        Map<String, WeakReference<C2440bt>> map = A01;
        if (A00[4].charAt(3) != 'h') {
            throw new RuntimeException();
        }
        String[] strArr = A00;
        strArr[3] = "KcOG1rzwVGm5OqslsWQoAqhkYEC7FRij";
        strArr[1] = "Dhj4Lprngz6YVn4AutwbBiUWJOZdaDii";
        return map.size();
    }

    public static C2440bt A01(C2529dL c2529dL, AbstractC2804hy abstractC2804hy, int i10, InterfaceC2438br interfaceC2438br) {
        C2440bt c2440bt = new C2440bt(c2529dL, abstractC2804hy, c2529dL.A02().A0A(), i10);
        c2440bt.A0b(interfaceC2438br);
        c2440bt.A0X();
        A01.put(abstractC2804hy.A17(), new WeakReference<>(c2440bt));
        return c2440bt;
    }

    public static C2440bt A02(String str) {
        WeakReference<C2440bt> weakReference = A01.get(str);
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public static void A03(AbstractC2804hy abstractC2804hy, C2440bt c2440bt) {
        A01.put(abstractC2804hy.A17(), new WeakReference<>(c2440bt));
    }

    public static void A04(String str) {
        A01.remove(str);
    }
}
