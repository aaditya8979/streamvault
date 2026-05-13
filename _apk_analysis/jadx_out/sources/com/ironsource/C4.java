package com.ironsource;

import android.content.Context;
import android.content.SharedPreferences;
import com.ironsource.Y5;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public final class C4 implements F4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SharedPreferences f28870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SharedPreferences.Editor f28871b;

    public C4(@NotNull Context context, @NotNull String str) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(str, Y5.c.f30724b);
        SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
        this.f28870a = sharedPreferences;
        this.f28871b = sharedPreferences.edit();
    }

    @Override // com.ironsource.F4
    @Nullable
    public String a(@NotNull String str, @Nullable String str2) {
        tn.p.k(str, "key");
        try {
            return this.f28870a.getString(str, str2);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.ironsource.F4
    public void a(@NotNull String str) {
        tn.p.k(str, "key");
        this.f28871b.remove(str).apply();
    }

    @Override // com.ironsource.F4
    @NotNull
    public Map<String, ?> allData() {
        Map<String, ?> all = this.f28870a.getAll();
        tn.p.j(all, "sharedPreferences.all");
        return all;
    }

    @Override // com.ironsource.F4
    public void b(@NotNull String str, @NotNull String str2) {
        tn.p.k(str, "key");
        tn.p.k(str2, "value");
        this.f28871b.putString(str, str2).apply();
    }
}
