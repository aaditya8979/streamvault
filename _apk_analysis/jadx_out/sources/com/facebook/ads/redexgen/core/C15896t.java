package com.facebook.ads.redexgen.core;

import java.util.Random;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C15896t {
    public static String[] A04 = {"IlrXm3tezuWbVMaXPLi828ioISQJgCfS", "NAwIzBHR00ZPv9WHAooSWGmMQnQsAYk8", "eu5lMmt7ol9PqHL84pZymZquGRu6o", "m2SAqTjU3gSqVMchVgPXeZMw5JHzzeRQ", "AbCmeSj5KlQ54JssPMwwYJBwucQ6C", "RqAiTasO9D9HsUdBZKTQCzdghtQ9E0yV", "WIBemWRSgRuyaEIJ1sL2dCgMu2IibJ9f", "z026p7uIfXqhY1JlsQjMBKUP7isQ63Up"};
    public int A00;
    public int A01;
    public int A02;
    public final /* synthetic */ C15906u A03;

    public C15896t(C15906u c15906u, int i10, int i11, int i12) {
        this.A03 = c15906u;
        this.A00 = i10;
        this.A01 = i11;
        this.A02 = i12;
    }

    public final int A00() {
        Random random = new Random();
        if (random.nextInt(this.A02) != 0) {
            return 0;
        }
        if (this.A01 <= 0) {
            return this.A00;
        }
        int iNextInt = random.nextInt() % this.A01;
        int i10 = this.A00;
        String[] strArr = A04;
        if (strArr[4].length() != strArr[2].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[4] = "t99WXaELTOA6CPYhlrJz9JZjCbRHN";
        strArr2[2] = "SwFbG7SpSQOHKIZQBIcFbwrWU2Enz";
        return i10 + iNextInt;
    }
}
