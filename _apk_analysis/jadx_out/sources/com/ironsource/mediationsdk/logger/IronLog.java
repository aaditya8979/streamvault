package com.ironsource.mediationsdk.logger;

import com.ironsource.C4075ib;
import com.ironsource.mediationsdk.logger.IronSourceLogger;

/* JADX INFO: loaded from: classes7.dex */
public enum IronLog {
    API(IronSourceLogger.IronSourceTag.API),
    CALLBACK(IronSourceLogger.IronSourceTag.CALLBACK),
    ADAPTER_API(IronSourceLogger.IronSourceTag.ADAPTER_API),
    ADAPTER_CALLBACK(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK),
    NETWORK(IronSourceLogger.IronSourceTag.NETWORK),
    INTERNAL(IronSourceLogger.IronSourceTag.INTERNAL),
    NATIVE(IronSourceLogger.IronSourceTag.NATIVE),
    EVENT(IronSourceLogger.IronSourceTag.EVENT);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public IronSourceLogger.IronSourceTag f32653a;

    IronLog(IronSourceLogger.IronSourceTag ironSourceTag) {
        this.f32653a = ironSourceTag;
    }

    public void error() {
        IronSourceLoggerManager.getLogger().a(this.f32653a, new C4075ib("", 3));
    }

    public void error(String str) {
        IronSourceLoggerManager.getLogger().a(this.f32653a, new C4075ib(str, 3));
    }

    public void error(String str, Throwable th2) {
        IronSourceLoggerManager.getLogger().a(this.f32653a, new C4075ib(str, 3), th2);
    }

    public void general() {
        IronSourceLoggerManager.getLogger().a(this.f32653a, new C4075ib("", 4));
    }

    public void general(String str) {
        IronSourceLoggerManager.getLogger().a(this.f32653a, new C4075ib(str, 4));
    }

    public void info() {
        IronSourceLoggerManager.getLogger().a(this.f32653a, new C4075ib("", 1));
    }

    public void info(String str) {
        IronSourceLoggerManager.getLogger().a(this.f32653a, new C4075ib(str, 1));
    }

    public void verbose() {
        IronSourceLoggerManager.getLogger().a(this.f32653a, new C4075ib("", 0));
    }

    public void verbose(String str) {
        IronSourceLoggerManager.getLogger().a(this.f32653a, new C4075ib(str, 0));
    }

    public void warning() {
        IronSourceLoggerManager.getLogger().a(this.f32653a, new C4075ib("", 2));
    }

    public void warning(String str) {
        IronSourceLoggerManager.getLogger().a(this.f32653a, new C4075ib(str, 2));
    }
}
