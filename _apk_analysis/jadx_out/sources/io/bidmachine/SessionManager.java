package io.bidmachine;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import io.bidmachine.core.Logger;
import io.bidmachine.core.TimeManager;
import io.bidmachine.core.Utils;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes10.dex */
public class SessionManager {

    @NonNull
    public static final String SESSION_ID_EMPTY = "";

    @NonNull
    private static final String TAG = "SessionManager";

    @Nullable
    private static volatile SessionManager instance;

    @Nullable
    private volatile Context applicationContext;
    private long pauseTime;
    private long resumeTime;
    private long sessionDuration;
    private long sessionResetAfterSec;

    @NonNull
    private final EnumMap<AdsType, SessionAdParams> sessionAdParamsMap = new EnumMap<>(AdsType.class);

    @NonNull
    private String sessionId = "";

    @NonNull
    private final CopyOnWriteArraySet<a> observers = new CopyOnWriteArraySet<>();

    public enum Status {
        START,
        RESUME,
        PAUSE
    }

    public interface a {
        void onSessionEvent(@NonNull Status status);
    }

    private SessionManager() {
        startNewSession();
    }

    @NonNull
    public static SessionManager get() {
        SessionManager sessionManager = instance;
        if (sessionManager == null) {
            synchronized (SessionManager.class) {
                sessionManager = instance;
                if (sessionManager == null) {
                    sessionManager = new SessionManager();
                    instance = sessionManager;
                }
            }
        }
        return sessionManager;
    }

    private void incrementSessionCounter() {
        Utils.ifNotNull(this.applicationContext, new Executable() { // from class: io.bidmachine.e5
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                SessionManager.lambda$incrementSessionCounter$1((Context) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$incrementSessionCounter$1(final Context context) {
        Utils.onBackgroundThread(new Runnable() { // from class: io.bidmachine.d5
            @Override // java.lang.Runnable
            public final void run() {
                o2.incrementSessionCount(context);
            }
        });
    }

    private void notifyObservers(@NonNull Status status) {
        Iterator<a> it = this.observers.iterator();
        while (it.hasNext()) {
            it.next().onSessionEvent(status);
        }
    }

    private void onContextAttached() {
        incrementSessionCounter();
    }

    public void addObserver(@NonNull a aVar) {
        this.observers.add(aVar);
    }

    public synchronized void attachContext(@NonNull Context context) {
        boolean z10 = this.applicationContext == null;
        this.applicationContext = context.getApplicationContext();
        if (z10) {
            onContextAttached();
        }
    }

    @NonNull
    public synchronized SessionAdParams getSessionAdParams(@NonNull AdsType adsType) {
        SessionAdParams sessionAdParams;
        sessionAdParams = this.sessionAdParamsMap.get(adsType);
        if (sessionAdParams == null) {
            sessionAdParams = new SessionAdParams();
            this.sessionAdParamsMap.put(adsType, sessionAdParams);
        }
        return sessionAdParams;
    }

    @WorkerThread
    public int getSessionCount() {
        Context context = this.applicationContext;
        if (context != null) {
            return o2.getSessionCount(context);
        }
        Logger.w(TAG, "Context not attached");
        return 0;
    }

    public int getSessionDuration() {
        if (this.resumeTime == 0) {
            return 0;
        }
        return (int) ((this.sessionDuration + (TimeManager.currentTimeMillis() - this.resumeTime)) / 1000);
    }

    @NonNull
    public String getSessionId() {
        return this.sessionId;
    }

    public void pause() {
        if (this.resumeTime == 0) {
            return;
        }
        long jCurrentTimeMillis = TimeManager.currentTimeMillis();
        this.pauseTime = jCurrentTimeMillis;
        this.sessionDuration += jCurrentTimeMillis - this.resumeTime;
        notifyObservers(Status.PAUSE);
        Logger.d(TAG, "Session paused");
    }

    public void removeObserver(@NonNull a aVar) {
        this.observers.remove(aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void resume() {
        /*
            r8 = this;
            long r0 = io.bidmachine.core.TimeManager.currentTimeMillis()
            long r2 = r8.sessionResetAfterSec
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L1f
            long r6 = r8.pauseTime
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 <= 0) goto L1f
            long r4 = r0 - r6
            r6 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r6
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 < 0) goto L1f
            r8.startNewSession()
            goto L2b
        L1f:
            io.bidmachine.SessionManager$Status r2 = io.bidmachine.SessionManager.Status.RESUME
            r8.notifyObservers(r2)
            java.lang.String r2 = "SessionManager"
            java.lang.String r3 = "Session resumed"
            io.bidmachine.core.Logger.d(r2, r3)
        L2b:
            r8.resumeTime = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.SessionManager.resume():void");
    }

    public void setSessionResetAfter(long j10) {
        this.sessionResetAfterSec = j10;
    }

    @VisibleForTesting
    public void startNewSession() {
        this.sessionId = UUID.randomUUID().toString();
        this.sessionDuration = 0L;
        this.pauseTime = 0L;
        this.resumeTime = 0L;
        for (AdsType adsType : AdsType.values()) {
            getSessionAdParams(adsType).clear();
        }
        notifyObservers(Status.START);
        incrementSessionCounter();
        Logger.d(TAG, "New session started");
    }
}
