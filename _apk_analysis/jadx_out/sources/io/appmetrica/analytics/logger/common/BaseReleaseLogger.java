package io.appmetrica.analytics.logger.common;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.C3978d4;
import io.appmetrica.analytics.logger.common.impl.a;
import io.appmetrica.analytics.logger.common.impl.b;
import io.appmetrica.analytics.logger.common.impl.c;
import io.appmetrica.analytics.logger.common.impl.d;

/* JADX INFO: loaded from: classes8.dex */
public abstract class BaseReleaseLogger {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile String f68170d = "";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f68171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile boolean f68172b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f68173c;

    public BaseReleaseLogger(@NonNull String str, @NonNull String str2) {
        this.f68173c = new c(new d(str), new a(), new b());
        this.f68171a = str2;
    }

    public static void init(@NonNull Context context) {
        f68170d = C3978d4.j.f31383d + context.getPackageName() + "] : ";
    }

    public void error(@Nullable String str, @Nullable Object... objArr) {
        if (this.f68172b) {
            c cVar = this.f68173c;
            String prefix = getPrefix();
            cVar.f68176b.getClass();
            for (String str2 : cVar.f68177c.a(a.a(prefix, str, objArr))) {
                String str3 = cVar.f68175a.f68178a;
                if (str2 == null) {
                    str2 = "";
                }
                Log.println(6, str3, str2);
            }
        }
    }

    public void error(@Nullable Throwable th2, @Nullable String str, @Nullable Object... objArr) {
        if (this.f68172b) {
            c cVar = this.f68173c;
            String prefix = getPrefix();
            cVar.f68176b.getClass();
            StringBuilder sb2 = new StringBuilder();
            if (str == null) {
                str = "";
            }
            sb2.append(str);
            sb2.append("\n");
            sb2.append(Log.getStackTraceString(th2));
            for (String str2 : cVar.f68177c.a(a.a(prefix, sb2.toString(), objArr))) {
                String str3 = cVar.f68175a.f68178a;
                if (str2 == null) {
                    str2 = "";
                }
                Log.println(6, str3, str2);
            }
        }
    }

    @NonNull
    public String getPrefix() {
        return f68170d + this.f68171a;
    }

    public void info(@Nullable String str, @Nullable Object... objArr) {
        if (this.f68172b) {
            c cVar = this.f68173c;
            String prefix = getPrefix();
            cVar.f68176b.getClass();
            for (String str2 : cVar.f68177c.a(a.a(prefix, str, objArr))) {
                String str3 = cVar.f68175a.f68178a;
                if (str2 == null) {
                    str2 = "";
                }
                Log.println(4, str3, str2);
            }
        }
    }

    public void setEnabled(boolean z10) {
        this.f68172b = z10;
    }

    public void warning(@Nullable String str, @Nullable Object... objArr) {
        if (this.f68172b) {
            c cVar = this.f68173c;
            String prefix = getPrefix();
            cVar.f68176b.getClass();
            for (String str2 : cVar.f68177c.a(a.a(prefix, str, objArr))) {
                String str3 = cVar.f68175a.f68178a;
                if (str2 == null) {
                    str2 = "";
                }
                Log.println(5, str3, str2);
            }
        }
    }
}
