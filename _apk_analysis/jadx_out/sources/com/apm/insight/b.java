package com.apm.insight;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.C4336xa;
import org.json.JSONArray;

/* JADX INFO: compiled from: CrashCallbackWrapper.java */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements ICrashCallback, IOOMCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IOOMCallback f7037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ICrashCallback f7038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f7039c;

    public b(String str, ICrashCallback iCrashCallback) {
        this.f7039c = str;
        this.f7038b = iCrashCallback;
    }

    public b(String str, IOOMCallback iOOMCallback) {
        this.f7039c = str;
        this.f7037a = iOOMCallback;
    }

    public final void a(@NonNull CrashType crashType, @Nullable String str, @Nullable String str2, String str3) {
        d dVarA;
        if (this.f7038b == null || (dVarA = d.a(this.f7039c)) == null || !dVarA.a(str3, str2)) {
            return;
        }
        this.f7038b.onCrash(crashType, str, null);
    }

    public final void a(@NonNull CrashType crashType, @Nullable String str, @Nullable Thread thread, JSONArray jSONArray) {
        if (this.f7038b == null || jSONArray == null) {
            return;
        }
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            if (TextUtils.equals(a.a(jSONArray.optJSONObject(i10), "header", C4336xa.f34377b), this.f7039c)) {
                this.f7038b.onCrash(crashType, str, thread);
            }
        }
    }

    public final void a(@NonNull CrashType crashType, @Nullable Throwable th2, @Nullable Thread thread, long j10, JSONArray jSONArray) {
        if (this.f7037a == null || jSONArray == null) {
            return;
        }
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            if (TextUtils.equals(a.a(jSONArray.optJSONObject(i10), "header", C4336xa.f34377b), this.f7039c)) {
                this.f7037a.onCrash(crashType, th2, thread, j10);
            }
        }
    }

    @Override // com.apm.insight.ICrashCallback
    public final void onCrash(@NonNull CrashType crashType, @Nullable String str, @Nullable Thread thread) {
    }

    @Override // com.apm.insight.IOOMCallback
    public final void onCrash(@NonNull CrashType crashType, @Nullable Throwable th2, @Nullable Thread thread, long j10) {
    }
}
