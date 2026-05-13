package com.ironsource;

import com.ironsource.C3978d4;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.b7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public interface InterfaceC3945b7 {

    /* JADX INFO: renamed from: com.ironsource.b7$a */
    public static final class a implements InterfaceC3945b7 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final EnumC3981d7 f31014a;

        public a(@NotNull EnumC3981d7 enumC3981d7) {
            tn.p.k(enumC3981d7, C3978d4.f.f31283e);
            this.f31014a = enumC3981d7;
        }

        @Override // com.ironsource.InterfaceC3945b7
        @NotNull
        public String a() {
            return "WebView is unavailable";
        }

        @Override // com.ironsource.InterfaceC3945b7
        @NotNull
        public EnumC3981d7 b() {
            return this.f31014a;
        }

        @NotNull
        public final EnumC3981d7 c() {
            return this.f31014a;
        }
    }

    @NotNull
    String a();

    @NotNull
    EnumC3981d7 b();
}
