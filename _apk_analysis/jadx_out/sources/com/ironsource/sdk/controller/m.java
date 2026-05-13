package com.ironsource.sdk.controller;

import com.ironsource.C4266t8;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public interface m {

    public static final class a implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f33761a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private final String f33762b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private final String f33763c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        private final String f33764d;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(@NotNull String str) {
            this(str, null, null, null, 14, null);
            tn.p.k(str, "funToCall");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(@NotNull String str, @Nullable String str2) {
            this(str, str2, null, null, 12, null);
            tn.p.k(str, "funToCall");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(@NotNull String str, @Nullable String str2, @Nullable String str3) {
            this(str, str2, str3, null, 8, null);
            tn.p.k(str, "funToCall");
        }

        public a(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
            tn.p.k(str, "funToCall");
            this.f33761a = str;
            this.f33762b = str2;
            this.f33763c = str3;
            this.f33764d = str4;
        }

        public /* synthetic */ a(String str, String str2, String str3, String str4, int i10, tn.i iVar) {
            this(str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? "" : str3, (i10 & 8) != 0 ? "" : str4);
        }

        @Override // com.ironsource.sdk.controller.m
        @NotNull
        public String a() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("SSA_CORE.SDKController.runFunction('" + this.f33761a);
            String str = this.f33762b;
            if (str != null && str.length() != 0) {
                sb2.append("?parameters=" + this.f33762b);
            }
            String str2 = this.f33763c;
            if (str2 != null && str2.length() != 0) {
                sb2.append("','" + this.f33763c);
            }
            String str3 = this.f33764d;
            if (str3 != null && str3.length() != 0) {
                sb2.append("','" + this.f33764d);
            }
            sb2.append("');");
            String string = sb2.toString();
            tn.p.j(string, "StringBuilder().apply(builderAction).toString()");
            return string;
        }
    }

    public static final class b implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f33765a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private String f33766b;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public b(@NotNull m mVar, int i10) {
            this(mVar.a(), i10);
            tn.p.k(mVar, "jsMethod");
        }

        public b(@NotNull String str, int i10) {
            tn.p.k(str, "script");
            this.f33766b = str;
            this.f33765a = i10;
        }

        @Override // com.ironsource.sdk.controller.m
        @NotNull
        public String a() {
            String str = "console.log(\"JS exception: \" + JSON.stringify(e));";
            if (this.f33765a != C4266t8.d.MODE_0.b() && (this.f33765a < C4266t8.d.MODE_1.b() || this.f33765a > C4266t8.d.MODE_3.b())) {
                str = "empty";
            }
            String str2 = "try{" + this.f33766b + "}catch(e){" + str + com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f52302e;
            tn.p.j(str2, "StringBuilder()\n        …}\")\n          .toString()");
            return str2;
        }
    }

    @NotNull
    String a();
}
