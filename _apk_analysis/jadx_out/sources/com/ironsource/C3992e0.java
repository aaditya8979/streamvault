package com.ironsource;

import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3992e0 implements InterfaceC4010f0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f31515b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final String f31516c = "ext_";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<String, String> f31517a = new HashMap();

    /* JADX INFO: renamed from: com.ironsource.e0$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    @Override // com.ironsource.InterfaceC4010f0
    @NotNull
    public Map<String, String> a() {
        return this.f31517a;
    }

    @Override // com.ironsource.InterfaceC4010f0
    public void a(@NotNull String str, @NotNull String str2) {
        tn.p.k(str, "key");
        tn.p.k(str2, "value");
        this.f31517a.put(str, str2);
    }

    @Override // com.ironsource.InterfaceC4010f0
    public void a(@NotNull HashMap<String, String> map) {
        tn.p.k(map, "params");
        this.f31517a.putAll(map);
    }

    @Override // com.ironsource.InterfaceC4010f0
    public void b(@NotNull String str, @NotNull String str2) {
        tn.p.k(str, "key");
        tn.p.k(str2, "value");
        this.f31517a.put("ext_" + str, str2);
    }
}
