package yads;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import com.ironsource.Z7;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.sequences.SequencesKt___SequencesKt;

/* JADX INFO: loaded from: classes3.dex */
public final class ei {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f89259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bn.g f89260b = kotlin.b.b(new zh(this));

    public ei(Context context) {
        this.f89259a = context;
    }

    public static final lf a(ei eiVar, ApplicationExitInfo applicationExitInfo) {
        eiVar.getClass();
        try {
            InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
            if (traceInputStream == null) {
                return null;
            }
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(traceInputStream));
                try {
                    String strE = on.k.e(bufferedReader);
                    on.b.a(bufferedReader, null);
                    on.b.a(traceInputStream, null);
                    if (strE == null) {
                        return null;
                    }
                    long timestamp = applicationExitInfo.getTimestamp();
                    String description = applicationExitInfo.getDescription();
                    if (description == null) {
                        description = Z7.f30787k;
                    }
                    int importance = applicationExitInfo.getImportance();
                    int pid = applicationExitInfo.getPid();
                    long pss = applicationExitInfo.getPss();
                    long rss = applicationExitInfo.getRss();
                    String processName = applicationExitInfo.getProcessName();
                    applicationExitInfo.getReason();
                    return new lf(timestamp, description, strE, importance, pid, pss, rss, processName, applicationExitInfo.getStatus(), applicationExitInfo.getRealUid());
                } finally {
                }
            } finally {
            }
        } catch (Throwable unused) {
            return null;
        }
    }

    public final List a(int i10, int i11, long j10) {
        ActivityManager activityManager = (ActivityManager) this.f89260b.getValue();
        if (activityManager == null) {
            return cn.w.m();
        }
        return SequencesKt___SequencesKt.U(SequencesKt___SequencesKt.L(SequencesKt___SequencesKt.z(SequencesKt___SequencesKt.z(SequencesKt___SequencesKt.z(cn.f0.g0(activityManager.getHistoricalProcessExitReasons(this.f89259a.getPackageName(), 0, i10)), ai.f87705b), new bi(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(i11))), new ci(j10)), new di(this)));
    }
}
