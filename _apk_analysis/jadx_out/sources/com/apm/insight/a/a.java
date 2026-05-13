package com.apm.insight.a;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.b.i;
import com.apm.insight.runtime.m;

/* JADX INFO: compiled from: AlogUploadManager.java */
/* JADX INFO: loaded from: classes8.dex */
public class a implements ICrashCallback {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile a f7031d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile String f7032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile i.a f7033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile i.a f7034c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile boolean f7035e = false;

    private a() {
    }

    public static a a() {
        if (f7031d == null) {
            synchronized (a.class) {
                if (f7031d == null) {
                    f7031d = new a();
                }
            }
        }
        return f7031d;
    }

    public final void a(String str, i.a aVar, i.a aVar2) {
        this.f7032a = str;
        this.f7033b = aVar;
        this.f7034c = aVar2;
        if (this.f7035e) {
            return;
        }
        this.f7035e = true;
        m.a().a(new Runnable() { // from class: com.apm.insight.a.a.1
            @Override // java.lang.Runnable
            public final void run() {
            }
        });
    }

    @Override // com.apm.insight.ICrashCallback
    public void onCrash(@NonNull CrashType crashType, @Nullable String str, @Nullable Thread thread) {
        crashType.equals(CrashType.NATIVE);
    }
}
