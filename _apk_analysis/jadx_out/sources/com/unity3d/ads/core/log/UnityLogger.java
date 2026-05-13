package com.unity3d.ads.core.log;

import android.util.Log;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.CreateFile;
import java.io.File;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.a;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: UnityLogger.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class UnityLogger implements Logger {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final String LOG_TAG = "UnityAds";
    private final boolean isForced;

    @NotNull
    private LogLevel logLevel;

    /* JADX INFO: compiled from: UnityLogger.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    public UnityLogger(@NotNull SessionRepository sessionRepository, @NotNull CreateFile createFile) {
        p.k(sessionRepository, "sessionRepository");
        p.k(createFile, "createFile");
        this.logLevel = LogLevel.INFO;
        File fileInvoke = createFile.invoke("/data/local/tmp/UnityAdsForceDebugMode");
        try {
            try {
                boolean enableTracing = sessionRepository.getNativeConfiguration().getDebugSettings().getEnableTracing();
                if (fileInvoke.exists() || enableTracing) {
                    setLogLevel(LogLevel.TRACE);
                    debug("Unity logger initialized in TRACE mode");
                }
            } catch (Throwable unused) {
                Log.w("UnityAds", "An issue occurred while initializing the logger");
                if (getLogLevel() != LogLevel.TRACE) {
                }
            }
        } finally {
            this.isForced = getLogLevel() == LogLevel.TRACE;
        }
    }

    private final boolean canLog(int i10) {
        return i10 >= getLogLevel().toAndroidLogLevel();
    }

    @Override // com.unity3d.ads.core.log.Logger
    public void debug(@NotNull String str) {
        p.k(str, "message");
        if (canLog(3)) {
            Log.d("UnityAds", str);
        }
    }

    @Override // com.unity3d.ads.core.log.Logger
    public void debug(@NotNull a<String> aVar) {
        p.k(aVar, "fb");
        if (canLog(3)) {
            debug(aVar.invoke());
        }
    }

    @Override // com.unity3d.ads.core.log.Logger
    public void error(@NotNull String str, @Nullable Throwable th2) {
        p.k(str, "message");
        if (canLog(6)) {
            Log.e("UnityAds", str, th2);
        }
    }

    @Override // com.unity3d.ads.core.log.Logger
    @NotNull
    public LogLevel getLogLevel() {
        return this.logLevel;
    }

    @Override // com.unity3d.ads.core.log.Logger
    public void info(@NotNull String str) {
        p.k(str, "message");
        if (canLog(4)) {
            Log.i("UnityAds", str);
        }
    }

    @Override // com.unity3d.ads.core.log.Logger
    public void setLogLevel(@NotNull LogLevel logLevel) {
        p.k(logLevel, "value");
        if (this.isForced) {
            return;
        }
        this.logLevel = logLevel;
    }

    @Override // com.unity3d.ads.core.log.Logger
    public void trace(@NotNull String str, @Nullable Throwable th2) {
        p.k(str, "message");
        if (canLog(2)) {
            Log.v("UnityAds", str, th2);
        }
    }
}
