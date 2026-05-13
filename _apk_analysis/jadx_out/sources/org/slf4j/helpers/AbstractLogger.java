package org.slf4j.helpers;

import java.io.ObjectStreamException;
import java.io.Serializable;
import org.slf4j.Marker;
import org.slf4j.event.Level;
import rs.c;
import rs.e;
import us.b;

/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractLogger implements c, Serializable {
    private static final long serialVersionUID = -2529255052481744503L;
    public String name;

    public final void a(Level level, Marker marker, String str, Object obj, Object obj2) {
        if (obj2 instanceof Throwable) {
            handleNormalizedLoggingCall(level, marker, str, new Object[]{obj}, (Throwable) obj2);
        } else {
            handleNormalizedLoggingCall(level, marker, str, new Object[]{obj, obj2}, null);
        }
    }

    @Override // rs.c
    public /* bridge */ /* synthetic */ b atDebug() {
        return super.atDebug();
    }

    @Override // rs.c
    public /* bridge */ /* synthetic */ b atError() {
        return super.atError();
    }

    @Override // rs.c
    public /* bridge */ /* synthetic */ b atInfo() {
        return super.atInfo();
    }

    @Override // rs.c
    public /* bridge */ /* synthetic */ b atLevel(Level level) {
        return super.atLevel(level);
    }

    @Override // rs.c
    public /* bridge */ /* synthetic */ b atTrace() {
        return super.atTrace();
    }

    @Override // rs.c
    public /* bridge */ /* synthetic */ b atWarn() {
        return super.atWarn();
    }

    public final void b(Level level, Marker marker, String str, Object[] objArr) {
        Throwable thA = ts.c.a(objArr);
        if (thA != null) {
            handleNormalizedLoggingCall(level, marker, str, ts.c.b(objArr), thA);
        } else {
            handleNormalizedLoggingCall(level, marker, str, objArr, null);
        }
    }

    public final void c(Level level, Marker marker, String str, Throwable th2) {
        handleNormalizedLoggingCall(level, marker, str, null, th2);
    }

    public final void d(Level level, Marker marker, String str, Object obj) {
        handleNormalizedLoggingCall(level, marker, str, new Object[]{obj}, null);
    }

    public void debug(String str) {
        if (isDebugEnabled()) {
            c(Level.DEBUG, null, str, null);
        }
    }

    public void debug(String str, Object obj) {
        if (isDebugEnabled()) {
            d(Level.DEBUG, null, str, obj);
        }
    }

    public void debug(String str, Object obj, Object obj2) {
        if (isDebugEnabled()) {
            a(Level.DEBUG, null, str, obj, obj2);
        }
    }

    @Override // rs.c
    public void debug(String str, Throwable th2) {
        if (isDebugEnabled()) {
            c(Level.DEBUG, null, str, th2);
        }
    }

    public void debug(String str, Object... objArr) {
        if (isDebugEnabled()) {
            b(Level.DEBUG, null, str, objArr);
        }
    }

    public void debug(Marker marker, String str) {
        if (isDebugEnabled(marker)) {
            c(Level.DEBUG, marker, str, null);
        }
    }

    public void debug(Marker marker, String str, Object obj) {
        if (isDebugEnabled(marker)) {
            d(Level.DEBUG, marker, str, obj);
        }
    }

    public void debug(Marker marker, String str, Object obj, Object obj2) {
        if (isDebugEnabled(marker)) {
            a(Level.DEBUG, marker, str, obj, obj2);
        }
    }

    public void debug(Marker marker, String str, Throwable th2) {
        if (isDebugEnabled(marker)) {
            c(Level.DEBUG, marker, str, th2);
        }
    }

    public void debug(Marker marker, String str, Object... objArr) {
        if (isDebugEnabled(marker)) {
            b(Level.DEBUG, marker, str, objArr);
        }
    }

    public void error(String str) {
        if (isErrorEnabled()) {
            c(Level.ERROR, null, str, null);
        }
    }

    public void error(String str, Object obj) {
        if (isErrorEnabled()) {
            d(Level.ERROR, null, str, obj);
        }
    }

    public void error(String str, Object obj, Object obj2) {
        if (isErrorEnabled()) {
            a(Level.ERROR, null, str, obj, obj2);
        }
    }

    public void error(String str, Throwable th2) {
        if (isErrorEnabled()) {
            c(Level.ERROR, null, str, th2);
        }
    }

    public void error(String str, Object... objArr) {
        if (isErrorEnabled()) {
            b(Level.ERROR, null, str, objArr);
        }
    }

    public void error(Marker marker, String str) {
        if (isErrorEnabled(marker)) {
            c(Level.ERROR, marker, str, null);
        }
    }

    public void error(Marker marker, String str, Object obj) {
        if (isErrorEnabled(marker)) {
            d(Level.ERROR, marker, str, obj);
        }
    }

    public void error(Marker marker, String str, Object obj, Object obj2) {
        if (isErrorEnabled(marker)) {
            a(Level.ERROR, marker, str, obj, obj2);
        }
    }

    public void error(Marker marker, String str, Throwable th2) {
        if (isErrorEnabled(marker)) {
            c(Level.ERROR, marker, str, th2);
        }
    }

    public void error(Marker marker, String str, Object... objArr) {
        if (isErrorEnabled(marker)) {
            b(Level.ERROR, marker, str, objArr);
        }
    }

    public abstract String getFullyQualifiedCallerName();

    public String getName() {
        return this.name;
    }

    public abstract void handleNormalizedLoggingCall(Level level, Marker marker, String str, Object[] objArr, Throwable th2);

    public void info(String str) {
        if (isInfoEnabled()) {
            c(Level.INFO, null, str, null);
        }
    }

    public void info(String str, Object obj) {
        if (isInfoEnabled()) {
            d(Level.INFO, null, str, obj);
        }
    }

    public void info(String str, Object obj, Object obj2) {
        if (isInfoEnabled()) {
            a(Level.INFO, null, str, obj, obj2);
        }
    }

    public void info(String str, Throwable th2) {
        if (isInfoEnabled()) {
            c(Level.INFO, null, str, th2);
        }
    }

    public void info(String str, Object... objArr) {
        if (isInfoEnabled()) {
            b(Level.INFO, null, str, objArr);
        }
    }

    public void info(Marker marker, String str) {
        if (isInfoEnabled(marker)) {
            c(Level.INFO, marker, str, null);
        }
    }

    public void info(Marker marker, String str, Object obj) {
        if (isInfoEnabled(marker)) {
            d(Level.INFO, marker, str, obj);
        }
    }

    public void info(Marker marker, String str, Object obj, Object obj2) {
        if (isInfoEnabled(marker)) {
            a(Level.INFO, marker, str, obj, obj2);
        }
    }

    public void info(Marker marker, String str, Throwable th2) {
        if (isInfoEnabled(marker)) {
            c(Level.INFO, marker, str, th2);
        }
    }

    public void info(Marker marker, String str, Object... objArr) {
        if (isInfoEnabled(marker)) {
            b(Level.INFO, marker, str, objArr);
        }
    }

    @Override // rs.c
    public abstract /* synthetic */ boolean isDebugEnabled();

    public abstract /* synthetic */ boolean isDebugEnabled(Marker marker);

    @Override // rs.c
    public /* bridge */ /* synthetic */ boolean isEnabledForLevel(Level level) {
        return super.isEnabledForLevel(level);
    }

    @Override // rs.c
    public abstract /* synthetic */ boolean isErrorEnabled();

    public abstract /* synthetic */ boolean isErrorEnabled(Marker marker);

    @Override // rs.c
    public abstract /* synthetic */ boolean isInfoEnabled();

    public abstract /* synthetic */ boolean isInfoEnabled(Marker marker);

    @Override // rs.c
    public abstract /* synthetic */ boolean isTraceEnabled();

    public abstract /* synthetic */ boolean isTraceEnabled(Marker marker);

    @Override // rs.c
    public abstract /* synthetic */ boolean isWarnEnabled();

    public abstract /* synthetic */ boolean isWarnEnabled(Marker marker);

    @Override // rs.c
    public /* bridge */ /* synthetic */ b makeLoggingEventBuilder(Level level) {
        return super.makeLoggingEventBuilder(level);
    }

    public Object readResolve() throws ObjectStreamException {
        return e.k(getName());
    }

    @Override // rs.c
    public void trace(String str) {
        if (isTraceEnabled()) {
            c(Level.TRACE, null, str, null);
        }
    }

    public void trace(String str, Object obj) {
        if (isTraceEnabled()) {
            d(Level.TRACE, null, str, obj);
        }
    }

    public void trace(String str, Object obj, Object obj2) {
        if (isTraceEnabled()) {
            a(Level.TRACE, null, str, obj, obj2);
        }
    }

    public void trace(String str, Throwable th2) {
        if (isTraceEnabled()) {
            c(Level.TRACE, null, str, th2);
        }
    }

    public void trace(String str, Object... objArr) {
        if (isTraceEnabled()) {
            b(Level.TRACE, null, str, objArr);
        }
    }

    public void trace(Marker marker, String str) {
        if (isTraceEnabled(marker)) {
            c(Level.TRACE, marker, str, null);
        }
    }

    public void trace(Marker marker, String str, Object obj) {
        if (isTraceEnabled(marker)) {
            d(Level.TRACE, marker, str, obj);
        }
    }

    public void trace(Marker marker, String str, Object obj, Object obj2) {
        if (isTraceEnabled(marker)) {
            a(Level.TRACE, marker, str, obj, obj2);
        }
    }

    public void trace(Marker marker, String str, Throwable th2) {
        if (isTraceEnabled(marker)) {
            c(Level.TRACE, marker, str, th2);
        }
    }

    public void trace(Marker marker, String str, Object... objArr) {
        if (isTraceEnabled(marker)) {
            b(Level.TRACE, marker, str, objArr);
        }
    }

    @Override // rs.c
    public void warn(String str) {
        if (isWarnEnabled()) {
            c(Level.WARN, null, str, null);
        }
    }

    public void warn(String str, Object obj) {
        if (isWarnEnabled()) {
            d(Level.WARN, null, str, obj);
        }
    }

    public void warn(String str, Object obj, Object obj2) {
        if (isWarnEnabled()) {
            a(Level.WARN, null, str, obj, obj2);
        }
    }

    public void warn(String str, Throwable th2) {
        if (isWarnEnabled()) {
            c(Level.WARN, null, str, th2);
        }
    }

    public void warn(String str, Object... objArr) {
        if (isWarnEnabled()) {
            b(Level.WARN, null, str, objArr);
        }
    }

    public void warn(Marker marker, String str) {
        if (isWarnEnabled(marker)) {
            c(Level.WARN, marker, str, null);
        }
    }

    public void warn(Marker marker, String str, Object obj) {
        if (isWarnEnabled(marker)) {
            d(Level.WARN, marker, str, obj);
        }
    }

    public void warn(Marker marker, String str, Object obj, Object obj2) {
        if (isWarnEnabled(marker)) {
            a(Level.WARN, marker, str, obj, obj2);
        }
    }

    public void warn(Marker marker, String str, Throwable th2) {
        if (isWarnEnabled(marker)) {
            c(Level.WARN, marker, str, th2);
        }
    }

    public void warn(Marker marker, String str, Object... objArr) {
        if (isWarnEnabled(marker)) {
            b(Level.WARN, marker, str, objArr);
        }
    }
}
