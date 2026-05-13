package com.ironsource;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.xc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C4338xc implements InterfaceC4305vd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f34390a;

    /* JADX INFO: renamed from: com.ironsource.xc$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f34391a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final String f34392b = "IronSource";

        private a() {
        }
    }

    public C4338xc(@NotNull String str) {
        tn.p.k(str, "networkInstanceId");
        this.f34390a = str;
    }

    @Override // com.ironsource.InterfaceC4305vd
    @NotNull
    public String value() {
        if (this.f34390a.length() == 0) {
            return "";
        }
        if (tn.p.f(this.f34390a, "0") || tn.p.f(this.f34390a, "IronSource")) {
            return "IronSource";
        }
        return "IronSource_" + this.f34390a;
    }
}
