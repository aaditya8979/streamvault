package org.slf4j.event;

import java.util.Queue;
import org.slf4j.Marker;
import org.slf4j.helpers.LegacyAbstractLogger;
import ss.c;
import ts.h;
import us.b;

/* JADX INFO: loaded from: classes3.dex */
public class EventRecordingLogger extends LegacyAbstractLogger {
    public static final boolean RECORD_ALL_EVENTS = true;
    private static final long serialVersionUID = -176083308134819629L;
    public Queue<c> eventQueue;
    public h logger;
    public String name;

    public EventRecordingLogger(h hVar, Queue<c> queue) {
        this.logger = hVar;
        this.name = hVar.c();
        this.eventQueue = queue;
    }

    @Override // org.slf4j.helpers.LegacyAbstractLogger, org.slf4j.helpers.AbstractLogger, rs.c
    public /* bridge */ /* synthetic */ b atDebug() {
        return super.atDebug();
    }

    @Override // org.slf4j.helpers.LegacyAbstractLogger, org.slf4j.helpers.AbstractLogger, rs.c
    public /* bridge */ /* synthetic */ b atError() {
        return super.atError();
    }

    @Override // org.slf4j.helpers.LegacyAbstractLogger, org.slf4j.helpers.AbstractLogger, rs.c
    public /* bridge */ /* synthetic */ b atInfo() {
        return super.atInfo();
    }

    @Override // org.slf4j.helpers.LegacyAbstractLogger, org.slf4j.helpers.AbstractLogger, rs.c
    public /* bridge */ /* synthetic */ b atLevel(Level level) {
        return super.atLevel(level);
    }

    @Override // org.slf4j.helpers.LegacyAbstractLogger, org.slf4j.helpers.AbstractLogger, rs.c
    public /* bridge */ /* synthetic */ b atTrace() {
        return super.atTrace();
    }

    @Override // org.slf4j.helpers.LegacyAbstractLogger, org.slf4j.helpers.AbstractLogger, rs.c
    public /* bridge */ /* synthetic */ b atWarn() {
        return super.atWarn();
    }

    @Override // org.slf4j.helpers.AbstractLogger
    public String getFullyQualifiedCallerName() {
        return null;
    }

    @Override // org.slf4j.helpers.AbstractLogger
    public String getName() {
        return this.name;
    }

    @Override // org.slf4j.helpers.AbstractLogger
    public void handleNormalizedLoggingCall(Level level, Marker marker, String str, Object[] objArr, Throwable th2) {
        c cVar = new c();
        cVar.k(System.currentTimeMillis());
        cVar.e(level);
        cVar.f(this.logger);
        cVar.g(this.name);
        if (marker != null) {
            cVar.a(marker);
        }
        cVar.h(str);
        cVar.i(Thread.currentThread().getName());
        cVar.d(objArr);
        cVar.j(th2);
        this.eventQueue.add(cVar);
    }

    @Override // org.slf4j.helpers.LegacyAbstractLogger, org.slf4j.helpers.AbstractLogger, rs.c
    public boolean isDebugEnabled() {
        return true;
    }

    @Override // org.slf4j.helpers.LegacyAbstractLogger, org.slf4j.helpers.AbstractLogger, rs.c
    public /* bridge */ /* synthetic */ boolean isEnabledForLevel(Level level) {
        return super.isEnabledForLevel(level);
    }

    @Override // org.slf4j.helpers.LegacyAbstractLogger, org.slf4j.helpers.AbstractLogger, rs.c
    public boolean isErrorEnabled() {
        return true;
    }

    @Override // org.slf4j.helpers.LegacyAbstractLogger, org.slf4j.helpers.AbstractLogger, rs.c
    public boolean isInfoEnabled() {
        return true;
    }

    @Override // org.slf4j.helpers.LegacyAbstractLogger, org.slf4j.helpers.AbstractLogger, rs.c
    public boolean isTraceEnabled() {
        return true;
    }

    @Override // org.slf4j.helpers.LegacyAbstractLogger, org.slf4j.helpers.AbstractLogger, rs.c
    public boolean isWarnEnabled() {
        return true;
    }

    @Override // org.slf4j.helpers.LegacyAbstractLogger, org.slf4j.helpers.AbstractLogger, rs.c
    public /* bridge */ /* synthetic */ b makeLoggingEventBuilder(Level level) {
        return super.makeLoggingEventBuilder(level);
    }
}
