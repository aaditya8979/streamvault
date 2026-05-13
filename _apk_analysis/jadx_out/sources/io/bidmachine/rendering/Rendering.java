package io.bidmachine.rendering;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.iab.mraid.MraidLog;
import io.bidmachine.iab.utils.Logger;
import io.bidmachine.rendering.internal.o;
import io.bidmachine.rendering.utils.UserAgentProvider;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes7.dex */
public class Rendering {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicBoolean f70008a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static UserAgentProvider f70009b;

    @Nullable
    public static String getUserAgent() {
        UserAgentProvider userAgentProvider = f70009b;
        if (userAgentProvider != null) {
            return userAgentProvider.getUserAgent();
        }
        return null;
    }

    public static void initialize(@NonNull Context context) {
        f70008a.compareAndSet(false, true);
    }

    public static void setLoggingEnabled(boolean z10) {
        o.a(z10);
        MraidLog.setLoggingLevel(z10 ? Logger.LogLevel.debug : Logger.LogLevel.none);
    }

    public static void setUserAgentProvider(@Nullable UserAgentProvider userAgentProvider) {
        f70009b = userAgentProvider;
    }
}
