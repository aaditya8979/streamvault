package com.unity3d.ironsourceads.internal.services;

import android.content.Context;
import com.ironsource.C4108k9;
import com.ironsource.EnumC4144m9;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: loaded from: classes8.dex */
public interface a {

    /* JADX INFO: renamed from: com.unity3d.ironsourceads.internal.services.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0711a {

        /* JADX INFO: renamed from: com.unity3d.ironsourceads.internal.services.a$a$a, reason: collision with other inner class name */
        public static final class C0712a extends AbstractC0711a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            private final String f53437a;

            /* JADX WARN: Multi-variable type inference failed */
            public C0712a() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0712a(@NotNull String str) {
                super(null);
                p.k(str, "errorMessage");
                this.f53437a = str;
            }

            public /* synthetic */ C0712a(String str, int i10, i iVar) {
                this((i10 & 1) != 0 ? "" : str);
            }

            public static /* synthetic */ C0712a a(C0712a c0712a, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = c0712a.f53437a;
                }
                return c0712a.a(str);
            }

            @NotNull
            public final C0712a a(@NotNull String str) {
                p.k(str, "errorMessage");
                return new C0712a(str);
            }

            @NotNull
            public final String a() {
                return this.f53437a;
            }

            @NotNull
            public final String b() {
                return this.f53437a;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0712a) && p.f(this.f53437a, ((C0712a) obj).f53437a);
            }

            public int hashCode() {
                return this.f53437a.hashCode();
            }

            @NotNull
            public String toString() {
                return "Error(errorMessage=" + this.f53437a + ")";
            }
        }

        /* JADX INFO: renamed from: com.unity3d.ironsourceads.internal.services.a$a$b */
        public static final class b extends AbstractC0711a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final b f53438a = new b();

            private b() {
                super(null);
            }
        }

        private AbstractC0711a() {
        }

        public /* synthetic */ AbstractC0711a(i iVar) {
            this();
        }
    }

    static /* synthetic */ AbstractC0711a a(a aVar, Context context, EnumC4144m9 enumC4144m9, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: destroy");
        }
        if ((i10 & 2) != 0) {
            enumC4144m9 = EnumC4144m9.APP_ACTIVITY;
        }
        return aVar.a(context, enumC4144m9);
    }

    @NotNull
    AbstractC0711a a(@NotNull Context context, @NotNull C4108k9 c4108k9);

    @NotNull
    AbstractC0711a a(@NotNull Context context, @NotNull EnumC4144m9 enumC4144m9);
}
