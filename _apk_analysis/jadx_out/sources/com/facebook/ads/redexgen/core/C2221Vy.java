package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2221Vy {
    public static String[] A01 = {"0TBfSTrFZZIPTbjcv3YvZ5KQe5wh6M4Z", "Y", "skEIHJjGP8F0E9LHs3c03M6jOmkdnZrb", "lNiM6G1VkMzjPhI0VWbHd", "xoZoqEy9j11lJxTnOEXOmkmQN9dBXrj3", "0lNV7cA9G3CxYQK", "ZSiJ5Be21P36sCEypxWEkyax05PjjigP", "3dFveWP5h629GmfNhsyVO5v38YfKmNKK"};
    public static final ThreadLocal<C2221Vy> A02 = new ThreadLocal<>();
    public final C2204Vh A00 = new C2204Vh();

    public static C2204Vh A00() {
        return A02().A00;
    }

    public static C2204Vh A01(C2220Vx c2220Vx) {
        C2204Vh c2204Vh = new C2204Vh(A00());
        c2204Vh.add(c2220Vx);
        return c2204Vh;
    }

    public static C2221Vy A02() {
        C2221Vy c2221Vy = A02.get();
        if (c2221Vy != null) {
            return c2221Vy;
        }
        C2221Vy c2221Vy2 = new C2221Vy();
        A02.set(c2221Vy2);
        return c2221Vy2;
    }

    public static void A03(AbstractRunnableC2216Vt abstractRunnableC2216Vt) {
        C2204Vh c2204VhA06 = abstractRunnableC2216Vt.A06();
        if (c2204VhA06 != null) {
            A02().A00.addAll(c2204VhA06);
        }
    }

    public static void A04(AbstractRunnableC2216Vt abstractRunnableC2216Vt) {
        C2204Vh c2204VhA06 = abstractRunnableC2216Vt.A06();
        if (c2204VhA06 != null) {
            C2204Vh c2204Vh = A02().A00;
            String[] strArr = A01;
            if (strArr[1].length() == strArr[5].length()) {
                throw new RuntimeException();
            }
            A01[0] = "6tfOksRsBjIBNQljvPHCCYkD1Hr87lb7";
            c2204Vh.removeAll(c2204VhA06);
        }
    }
}
