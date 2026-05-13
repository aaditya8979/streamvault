package com.unity3d.services.core.fid;

import org.jetbrains.annotations.NotNull;
import tn.i;

/* JADX INFO: compiled from: Constants.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class Constants {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final String FID_CLASS = "com.google.firebase.analytics.FirebaseAnalytics";

    @NotNull
    public static final String GET_APP_INSTANCE_ID = "getAppInstanceId";

    @NotNull
    public static final String GET_INSTANCE = "getInstance";

    /* JADX INFO: compiled from: Constants.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        @NotNull
        public final String getClassName() {
            return Constants.FID_CLASS;
        }
    }
}
