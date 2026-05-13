package com.ironsource;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.e7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC3999e7 {

    /* JADX INFO: renamed from: com.ironsource.e7$a */
    public static final class a implements InterfaceC3999e7 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final InterfaceC3945b7 f31538a;

        public a(@NotNull InterfaceC3945b7 interfaceC3945b7) {
            tn.p.k(interfaceC3945b7, "failure");
            this.f31538a = interfaceC3945b7;
        }

        public static /* synthetic */ a a(a aVar, InterfaceC3945b7 interfaceC3945b7, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                interfaceC3945b7 = aVar.f31538a;
            }
            return aVar.a(interfaceC3945b7);
        }

        @NotNull
        public final InterfaceC3945b7 a() {
            return this.f31538a;
        }

        @NotNull
        public final a a(@NotNull InterfaceC3945b7 interfaceC3945b7) {
            tn.p.k(interfaceC3945b7, "failure");
            return new a(interfaceC3945b7);
        }

        @Override // com.ironsource.InterfaceC3999e7
        public void a(@NotNull InterfaceC4017f7 interfaceC4017f7) {
            tn.p.k(interfaceC4017f7, "handler");
            interfaceC4017f7.a(this.f31538a);
        }

        @NotNull
        public final InterfaceC3945b7 b() {
            return this.f31538a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && tn.p.f(this.f31538a, ((a) obj).f31538a);
        }

        public int hashCode() {
            return this.f31538a.hashCode();
        }

        @NotNull
        public String toString() {
            return "Failure(failure=" + this.f31538a + ")";
        }
    }

    default void a(@NotNull InterfaceC4017f7 interfaceC4017f7) {
        tn.p.k(interfaceC4017f7, "handler");
    }
}
