package io.appmetrica.analytics.coreutils.internal.logger;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public abstract class LoggerStorage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static HashMap f64748a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f64749b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile PublicLogger f64750c = PublicLogger.getAnonymousInstance();

    @NonNull
    public static PublicLogger getMainPublicOrAnonymousLogger() {
        return f64750c;
    }

    @NonNull
    public static PublicLogger getOrCreateMainPublicLogger(@NonNull String str) {
        f64750c = getOrCreatePublicLogger(str);
        return f64750c;
    }

    @NonNull
    public static PublicLogger getOrCreatePublicLogger(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return PublicLogger.getAnonymousInstance();
        }
        PublicLogger publicLogger = (PublicLogger) f64748a.get(str);
        if (publicLogger == null) {
            synchronized (f64749b) {
                publicLogger = (PublicLogger) f64748a.get(str);
                if (publicLogger == null) {
                    publicLogger = new PublicLogger(ApiKeyUtils.createPartialApiKey(str));
                    f64748a.put(str, publicLogger);
                }
            }
        }
        return publicLogger;
    }

    @VisibleForTesting(otherwise = 5)
    public static void unsetPublicLoggers() {
        f64748a = new HashMap();
        f64750c = PublicLogger.getAnonymousInstance();
    }
}
