package com.moloco.sdk.xenoss.sdkdevkit.android.core.services;

import androidx.compose.runtime.internal.StabilityInferred;
import cn.w;
import com.ironsource.C3978d4;
import hn.c;
import java.util.List;
import org.eclipse.jetty.util.security.Constraint;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: loaded from: classes6.dex */
public interface a {

    /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a$a, reason: collision with other inner class name */
    @StabilityInferred(parameters = 1)
    public static abstract class AbstractC0696a {

        /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a$a$a, reason: collision with other inner class name */
        @StabilityInferred(parameters = 1)
        public static final class C0697a extends AbstractC0696a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0697a f50938a = new C0697a();

            public C0697a() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a$a$b */
        @StabilityInferred(parameters = 1)
        public static final class b extends AbstractC0696a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final long f50939a;

            public b(long j10) {
                super(null);
                this.f50939a = j10;
            }

            public final long a() {
                return this.f50939a;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.f50939a == ((b) obj).f50939a;
            }

            public int hashCode() {
                return Long.hashCode(this.f50939a);
            }

            @NotNull
            public String toString() {
                return "AppForeground(lastBgTimestamp=" + this.f50939a + ')';
            }
        }

        /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a$a$c */
        @StabilityInferred(parameters = 1)
        public static final class c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final EnumC0698a f50940a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public final f f50941b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @NotNull
            public final g f50942c;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a$a$c$a, reason: collision with other inner class name */
            public static final class EnumC0698a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final EnumC0698a f50943a = new EnumC0698a(Constraint.NONE, 0);

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public static final EnumC0698a f50944b = new EnumC0698a("CLOSE", 1);

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public static final EnumC0698a f50945c = new EnumC0698a("SKIP", 2);

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public static final EnumC0698a f50946d = new EnumC0698a("SKIP_DEC", 3);

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public static final EnumC0698a f50947e = new EnumC0698a("MUTE", 4);

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public static final EnumC0698a f50948f = new EnumC0698a("UNMUTE", 5);

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public static final EnumC0698a f50949g = new EnumC0698a("CTA", 6);

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public static final EnumC0698a f50950h = new EnumC0698a("REPLAY", 7);

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                public static final EnumC0698a f50951i = new EnumC0698a("AD_BADGE", 8);

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                public static final /* synthetic */ EnumC0698a[] f50952j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                public static final /* synthetic */ kn.a f50953k;

                static {
                    EnumC0698a[] enumC0698aArrA = a();
                    f50952j = enumC0698aArrA;
                    f50953k = kotlin.enums.a.a(enumC0698aArrA);
                }

                public EnumC0698a(String str, int i10) {
                }

                public static final /* synthetic */ EnumC0698a[] a() {
                    return new EnumC0698a[]{f50943a, f50944b, f50945c, f50946d, f50947e, f50948f, f50949g, f50950h, f50951i};
                }

                @NotNull
                public static kn.a<EnumC0698a> b() {
                    return f50953k;
                }

                public static EnumC0698a valueOf(String str) {
                    return (EnumC0698a) Enum.valueOf(EnumC0698a.class, str);
                }

                public static EnumC0698a[] values() {
                    return (EnumC0698a[]) f50952j.clone();
                }
            }

            public c(@NotNull EnumC0698a enumC0698a, @NotNull f fVar, @NotNull g gVar) {
                p.k(enumC0698a, "buttonType");
                p.k(fVar, C3978d4.i.L);
                p.k(gVar, "size");
                this.f50940a = enumC0698a;
                this.f50941b = fVar;
                this.f50942c = gVar;
            }

            public static /* synthetic */ c b(c cVar, EnumC0698a enumC0698a, f fVar, g gVar, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    enumC0698a = cVar.f50940a;
                }
                if ((i10 & 2) != 0) {
                    fVar = cVar.f50941b;
                }
                if ((i10 & 4) != 0) {
                    gVar = cVar.f50942c;
                }
                return cVar.a(enumC0698a, fVar, gVar);
            }

            @NotNull
            public final c a(@NotNull EnumC0698a enumC0698a, @NotNull f fVar, @NotNull g gVar) {
                p.k(enumC0698a, "buttonType");
                p.k(fVar, C3978d4.i.L);
                p.k(gVar, "size");
                return new c(enumC0698a, fVar, gVar);
            }

            @NotNull
            public final EnumC0698a c() {
                return this.f50940a;
            }

            @NotNull
            public final f d() {
                return this.f50941b;
            }

            @NotNull
            public final g e() {
                return this.f50942c;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return this.f50940a == cVar.f50940a && p.f(this.f50941b, cVar.f50941b) && p.f(this.f50942c, cVar.f50942c);
            }

            public int hashCode() {
                return (((this.f50940a.hashCode() * 31) + this.f50941b.hashCode()) * 31) + this.f50942c.hashCode();
            }

            @NotNull
            public String toString() {
                return "Button(buttonType=" + this.f50940a + ", position=" + this.f50941b + ", size=" + this.f50942c + ')';
            }
        }

        /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a$a$d */
        @StabilityInferred(parameters = 0)
        public static final class d extends AbstractC0696a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final f f50954a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @Nullable
            public final f f50955b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @Nullable
            public final g f50956c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            @NotNull
            public final List<c> f50957d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(@NotNull f fVar, @Nullable f fVar2, @Nullable g gVar, @NotNull List<c> list) {
                super(null);
                p.k(fVar, "clickPosition");
                p.k(list, "buttonLayout");
                this.f50954a = fVar;
                this.f50955b = fVar2;
                this.f50956c = gVar;
                this.f50957d = list;
            }

            public /* synthetic */ d(f fVar, f fVar2, g gVar, List list, int i10, i iVar) {
                this(fVar, (i10 & 2) != 0 ? null : fVar2, (i10 & 4) != 0 ? null : gVar, (i10 & 8) != 0 ? w.m() : list);
            }

            @NotNull
            public final List<c> a() {
                return this.f50957d;
            }

            @NotNull
            public final f b() {
                return this.f50954a;
            }

            @Nullable
            public final f c() {
                return this.f50955b;
            }

            @Nullable
            public final g d() {
                return this.f50956c;
            }
        }

        /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a$a$e */
        @StabilityInferred(parameters = 1)
        public static final class e extends AbstractC0696a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final e f50958a = new e();

            public e() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a$a$f */
        @StabilityInferred(parameters = 1)
        public static final class f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final float f50959a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final float f50960b;

            public f(float f10, float f11) {
                this.f50959a = f10;
                this.f50960b = f11;
            }

            public final float a() {
                return this.f50959a;
            }

            public final float b() {
                return this.f50960b;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof f)) {
                    return false;
                }
                f fVar = (f) obj;
                return Float.compare(this.f50959a, fVar.f50959a) == 0 && Float.compare(this.f50960b, fVar.f50960b) == 0;
            }

            public int hashCode() {
                return (Float.hashCode(this.f50959a) * 31) + Float.hashCode(this.f50960b);
            }

            @NotNull
            public String toString() {
                return "Position(topLeftXDp=" + this.f50959a + ", topLeftYDp=" + this.f50960b + ')';
            }
        }

        /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a$a$g */
        @StabilityInferred(parameters = 1)
        public static final class g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final float f50961a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final float f50962b;

            public g(float f10, float f11) {
                this.f50961a = f10;
                this.f50962b = f11;
            }

            public final float a() {
                return this.f50962b;
            }

            public final float b() {
                return this.f50961a;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof g)) {
                    return false;
                }
                g gVar = (g) obj;
                return Float.compare(this.f50961a, gVar.f50961a) == 0 && Float.compare(this.f50962b, gVar.f50962b) == 0;
            }

            public int hashCode() {
                return (Float.hashCode(this.f50961a) * 31) + Float.hashCode(this.f50962b);
            }

            @NotNull
            public String toString() {
                return "Size(widthDp=" + this.f50961a + ", heightDp=" + this.f50962b + ')';
            }
        }

        public AbstractC0696a() {
        }

        public /* synthetic */ AbstractC0696a(i iVar) {
            this();
        }
    }

    @Nullable
    Object a(long j10, @NotNull AbstractC0696a abstractC0696a, @NotNull String str, @NotNull c<? super String> cVar);
}
