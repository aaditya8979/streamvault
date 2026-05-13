package com.ironsource.mediationsdk.logger;

import com.ironsource.C4075ib;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes11.dex */
public class IronSourceLoggerManager extends IronSourceLogger {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile IronSourceLoggerManager f32660d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<IronSourceLogger> f32661c;

    private IronSourceLoggerManager(String str) {
        super(str);
        this.f32661c = new CopyOnWriteArrayList();
        c();
    }

    private IronSourceLoggerManager(String str, int i10) {
        super(str, i10);
        this.f32661c = new CopyOnWriteArrayList();
        c();
    }

    private IronSourceLogger a(String str) {
        for (IronSourceLogger ironSourceLogger : this.f32661c) {
            if (ironSourceLogger.b().equals(str)) {
                return ironSourceLogger;
            }
        }
        return null;
    }

    private boolean a(int i10) {
        return i10 < this.f32656a;
    }

    private void c() {
        this.f32661c.add(new a(0));
    }

    public static IronSourceLoggerManager getLogger() {
        if (f32660d == null) {
            synchronized (IronSourceLoggerManager.class) {
                if (f32660d == null) {
                    f32660d = new IronSourceLoggerManager(IronSourceLoggerManager.class.getSimpleName());
                }
            }
        }
        return f32660d;
    }

    public static IronSourceLoggerManager getLogger(int i10) {
        IronSourceLoggerManager logger = getLogger();
        logger.f32656a = i10;
        return logger;
    }

    public void a(IronSourceLogger.IronSourceTag ironSourceTag, C4075ib c4075ib) {
        if (a(c4075ib.a())) {
            return;
        }
        a(ironSourceTag, c4075ib.c(), c4075ib.a());
    }

    public void a(IronSourceLogger.IronSourceTag ironSourceTag, C4075ib c4075ib, Throwable th2) {
        if (a(c4075ib.a())) {
            return;
        }
        logException(ironSourceTag, c4075ib.c(), th2);
    }

    public void a(IronSourceLogger.IronSourceTag ironSourceTag, String str, int i10) {
        for (IronSourceLogger ironSourceLogger : this.f32661c) {
            if (ironSourceLogger.a() <= i10) {
                ironSourceLogger.log(ironSourceTag, str, i10);
            }
        }
    }

    public void addLogger(IronSourceLogger ironSourceLogger) {
        this.f32661c.add(ironSourceLogger);
    }

    @Override // com.ironsource.mediationsdk.logger.IronSourceLogger
    @Deprecated(forRemoval = true, since = "8.3.0")
    public void log(IronSourceLogger.IronSourceTag ironSourceTag, String str, int i10) {
        if (a(i10)) {
            return;
        }
        a(ironSourceTag, str, i10);
    }

    @Override // com.ironsource.mediationsdk.logger.IronSourceLogger
    public void logException(IronSourceLogger.IronSourceTag ironSourceTag, String str, Throwable th2) {
        if (th2 == null) {
            Iterator<IronSourceLogger> it = this.f32661c.iterator();
            while (it.hasNext()) {
                it.next().log(ironSourceTag, str, 3);
            }
        } else {
            Iterator<IronSourceLogger> it2 = this.f32661c.iterator();
            while (it2.hasNext()) {
                it2.next().logException(ironSourceTag, str, th2);
            }
        }
    }

    public void onLog(IronSourceLogger.IronSourceTag ironSourceTag, String str, int i10) {
        log(ironSourceTag, str, i10);
    }

    public void setLoggerDebugLevel(String str, int i10) {
        if (str == null) {
            return;
        }
        IronSourceLogger ironSourceLoggerA = a(str);
        if (ironSourceLoggerA == null) {
            log(IronSourceLogger.IronSourceTag.NATIVE, "Failed to find logger:setLoggerDebugLevel(loggerName:" + str + " ,debugLevel:" + i10 + ")", 0);
            return;
        }
        if (i10 < 0 || i10 > 3) {
            this.f32661c.remove(ironSourceLoggerA);
            return;
        }
        log(IronSourceLogger.IronSourceTag.NATIVE, "setLoggerDebugLevel(loggerName:" + str + " ,debugLevel:" + i10 + ")", 0);
        ironSourceLoggerA.setDebugLevel(i10);
    }
}
