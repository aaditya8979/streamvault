package com.unity3d.ads.core.domain.work;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import org.jetbrains.annotations.NotNull;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: BackgroundWorker.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class BackgroundWorker {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final String TAG = "UnityAdsBackgroundWorker";

    @NotNull
    private final WorkManager workManager;

    /* JADX INFO: compiled from: BackgroundWorker.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    public BackgroundWorker(@NotNull Context context) {
        p.k(context, "applicationContext");
        WorkManager workManager = WorkManager.getInstance(context);
        p.j(workManager, "getInstance(applicationContext)");
        this.workManager = workManager;
    }

    @NotNull
    public final WorkManager getWorkManager() {
        return this.workManager;
    }

    public final /* synthetic */ <T extends UniversalRequestJob> void invoke(UniversalRequestWorkerData universalRequestWorkerData) {
        p.k(universalRequestWorkerData, "universalRequestWorkerData");
        p.q(4, "T");
        OneTimeWorkRequest oneTimeWorkRequestBuild = new OneTimeWorkRequest.Builder(ListenableWorker.class).setInputData(universalRequestWorkerData.invoke()).addTag(TAG).build();
        p.j(oneTimeWorkRequestBuild, "OneTimeWorkRequestBuilde…TAG)\n            .build()");
        getWorkManager().enqueue(oneTimeWorkRequestBuild);
    }
}
