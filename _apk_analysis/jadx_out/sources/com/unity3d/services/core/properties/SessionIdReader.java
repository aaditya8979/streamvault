package com.unity3d.services.core.properties;

import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: SessionIdReader.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class SessionIdReader {

    @NotNull
    public static final SessionIdReader INSTANCE = new SessionIdReader();

    @NotNull
    private static final String sessionId;

    static {
        String string = UUID.randomUUID().toString();
        p.j(string, "randomUUID().toString()");
        sessionId = string;
    }

    private SessionIdReader() {
    }

    @NotNull
    public final String getSessionId() {
        return sessionId;
    }
}
