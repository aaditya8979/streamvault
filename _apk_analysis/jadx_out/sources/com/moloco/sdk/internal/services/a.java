package com.moloco.sdk.internal.services;

import androidx.compose.runtime.internal.StabilityInferred;
import com.ironsource.Q6;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@StabilityInferred(parameters = 1)
public abstract class a {

    /* JADX INFO: renamed from: com.moloco.sdk.internal.services.a$a, reason: collision with other inner class name */
    @StabilityInferred(parameters = 1)
    public static final class C0580a extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f47110a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0580a(@NotNull String str) {
            super(null);
            tn.p.k(str, Q6.Q0);
            this.f47110a = str;
        }

        @NotNull
        public final String a() {
            return this.f47110a;
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class b extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f47111a = new b();

        public b() {
            super(null);
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class c extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final c f47112a = new c();

        public c() {
            super(null);
        }
    }

    public a() {
    }

    public /* synthetic */ a(tn.i iVar) {
        this();
    }
}
