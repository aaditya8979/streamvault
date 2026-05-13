package com.unity3d.services.core.properties;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Session.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface Session {

    @NotNull
    public static final Default Default = Default.$$INSTANCE;

    /* JADX INFO: compiled from: Session.kt */
    public static final class Default implements Session {
        public static final /* synthetic */ Default $$INSTANCE = new Default();

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        @NotNull
        private static final String f53571id = SessionIdReader.INSTANCE.getSessionId();

        private Default() {
        }

        @Override // com.unity3d.services.core.properties.Session
        @NotNull
        public String getId() {
            return f53571id;
        }
    }

    @NotNull
    String getId();
}
