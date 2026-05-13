package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes9.dex */
public abstract class Ye {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f66261c = "Ye";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ia f66262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f66263b;

    public Ye(Ia ia2, String str) {
        this.f66262a = ia2;
        this.f66263b = str;
    }

    public final int a(@NonNull String str, int i10) {
        return this.f66262a.getInt(str, i10);
    }

    public final long a(String str, long j10) {
        return this.f66262a.getLong(str, j10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends Ye> T a(String str, float f10) {
        synchronized (this) {
            this.f66262a.a(str, f10);
        }
        return this;
    }

    public final <T extends Ye> T a(String str, List<String> list) {
        return (T) a(str, (String[]) list.toArray(new String[list.size()]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends Ye> T a(String str, String[] strArr) {
        String string;
        try {
            JSONArray jSONArray = new JSONArray();
            for (String str2 : strArr) {
                jSONArray.put(str2);
            }
            string = jSONArray.toString();
        } catch (Throwable unused) {
            string = null;
        }
        this.f66262a.a(str, string);
        return this;
    }

    @Nullable
    public final String a(@NonNull String str, @Nullable String str2) {
        return this.f66262a.getString(str, str2);
    }

    public final boolean a(String str, boolean z10) {
        return this.f66262a.getBoolean(str, z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public final <T extends Ye> T b(String str, int i10) {
        synchronized (this) {
            this.f66262a.a(i10, str);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends Ye> T b(String str, long j10) {
        synchronized (this) {
            this.f66262a.a(str, j10);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends Ye> T b(String str, String str2) {
        synchronized (this) {
            this.f66262a.a(str, str2);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends Ye> T b(String str, boolean z10) {
        synchronized (this) {
            this.f66262a.a(str, z10);
        }
        return this;
    }

    public final void b() {
        synchronized (this) {
            this.f66262a.b();
        }
    }

    public final boolean b(@NonNull String str) {
        return this.f66262a.a(str);
    }

    public final Ze c(String str) {
        return new Ze(str, this.f66263b);
    }

    @NonNull
    public Set<String> c() {
        return this.f66262a.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends Ye> T d(String str) {
        synchronized (this) {
            this.f66262a.remove(str);
        }
        return this;
    }
}
