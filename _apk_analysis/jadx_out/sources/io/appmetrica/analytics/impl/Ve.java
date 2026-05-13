package io.appmetrica.analytics.impl;

import android.content.Context;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public final class Ve implements Sc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f66038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f66039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f66040c;

    public Ve(@NotNull Context context, @NotNull String str, @NotNull String str2) {
        this.f66038a = context;
        this.f66039b = str;
        this.f66040c = str2;
    }

    public static Ve a(Ve ve2, Context context, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            context = ve2.f66038a;
        }
        if ((i10 & 2) != 0) {
            str = ve2.f66039b;
        }
        if ((i10 & 4) != 0) {
            str2 = ve2.f66040c;
        }
        ve2.getClass();
        return new Ve(context, str, str2);
    }

    @NotNull
    public final Ve a(@NotNull Context context, @NotNull String str, @NotNull String str2) {
        return new Ve(context, str, str2);
    }

    @Override // io.appmetrica.analytics.impl.Sc
    @NotNull
    public final String a() {
        String string = this.f66038a.getSharedPreferences(this.f66039b, 0).getString(this.f66040c, "");
        return string == null ? "" : string;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ve)) {
            return false;
        }
        Ve ve2 = (Ve) obj;
        return tn.p.f(this.f66038a, ve2.f66038a) && tn.p.f(this.f66039b, ve2.f66039b) && tn.p.f(this.f66040c, ve2.f66040c);
    }

    public final int hashCode() {
        return this.f66040c.hashCode() + ((this.f66039b.hashCode() + (this.f66038a.hashCode() * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "PreferencesBasedModuleEntryPoint(context=" + this.f66038a + ", prefName=" + this.f66039b + ", prefValueName=" + this.f66040c + ')';
    }
}
