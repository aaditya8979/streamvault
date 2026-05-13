package com.ironsource;

import android.app.Activity;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.y6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public interface InterfaceC4349y6 {

    /* JADX INFO: renamed from: com.ironsource.y6$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final c f34418a;

        public a(@NotNull c cVar) {
            tn.p.k(cVar, "strategyType");
            this.f34418a = cVar;
        }

        public static /* synthetic */ a a(a aVar, c cVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                cVar = aVar.f34418a;
            }
            return aVar.a(cVar);
        }

        @NotNull
        public final a a(@NotNull c cVar) {
            tn.p.k(cVar, "strategyType");
            return new a(cVar);
        }

        @NotNull
        public final c a() {
            return this.f34418a;
        }

        @NotNull
        public final c b() {
            return this.f34418a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f34418a == ((a) obj).f34418a;
        }

        public int hashCode() {
            return this.f34418a.hashCode();
        }

        @NotNull
        public String toString() {
            return "Config(strategyType=" + this.f34418a + ")";
        }
    }

    /* JADX INFO: renamed from: com.ironsource.y6$b */
    public static final class b {

        /* JADX INFO: renamed from: com.ironsource.y6$b$a */
        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f34419a;

            static {
                int[] iArr = new int[c.values().length];
                try {
                    iArr[c.SINGLE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[c.PROGRESSIVE_ON_SHOW_SUCCESS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[c.PROGRESSIVE_ON_LOAD_SUCCESS.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f34419a = iArr;
            }
        }

        @NotNull
        public final InterfaceC4349y6 a(@NotNull C4173o0 c4173o0, @NotNull a aVar, @NotNull InterfaceC4281u6 interfaceC4281u6, @NotNull InterfaceC4315w6 interfaceC4315w6, @NotNull InterfaceC4332x6 interfaceC4332x6) {
            tn.p.k(c4173o0, "adTools");
            tn.p.k(aVar, "config");
            tn.p.k(interfaceC4281u6, "fullscreenAdUnitFactory");
            tn.p.k(interfaceC4315w6, "fullscreenAdUnitListener");
            tn.p.k(interfaceC4332x6, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            int i10 = a.f34419a[aVar.b().ordinal()];
            if (i10 == 1) {
                return new M6(c4173o0, aVar, interfaceC4281u6, interfaceC4315w6, interfaceC4332x6);
            }
            if (i10 == 2) {
                return new F6(c4173o0, interfaceC4281u6, interfaceC4315w6, interfaceC4332x6);
            }
            if (i10 == 3) {
                return new C4366z6(c4173o0, interfaceC4281u6, interfaceC4315w6, interfaceC4332x6);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.y6$c */
    public enum c {
        SINGLE("Single"),
        PROGRESSIVE_ON_SHOW_SUCCESS("OnShowSuccess"),
        PROGRESSIVE_ON_LOAD_SUCCESS("OnLoadSuccess");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f34424a;

        c(String str) {
            this.f34424a = str;
        }

        @NotNull
        public final String b() {
            return this.f34424a;
        }
    }

    void a(@NotNull Activity activity);

    void loadAd();
}
