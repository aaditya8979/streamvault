package com.ironsource.mediationsdk.demandOnly;

import com.ironsource.InterfaceC4229r5;
import com.ironsource.Kb;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public interface o extends InterfaceC4229r5<String> {

    public static final class a implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f32563a;

        public a(@NotNull String str) {
            tn.p.k(str, "rowAdm");
            this.f32563a = str;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.o
        public <T> T a(@NotNull Kb<String, T> kb2) {
            tn.p.k(kb2, "mapper");
            return kb2.a(this.f32563a);
        }

        @Override // com.ironsource.InterfaceC4229r5
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public String a() {
            return this.f32563a;
        }
    }

    <T> T a(@NotNull Kb<String, T> kb2);
}
