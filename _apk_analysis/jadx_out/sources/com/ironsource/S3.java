package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes7.dex */
public class S3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f30366a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IronSourceError f30367b = null;

    public IronSourceError a() {
        return this.f30367b;
    }

    public void a(IronSourceError ironSourceError) {
        this.f30366a = false;
        this.f30367b = ironSourceError;
    }

    public boolean b() {
        return this.f30366a;
    }

    public void c() {
        this.f30366a = true;
        this.f30367b = null;
    }

    public String toString() {
        if (b()) {
            return "valid:" + this.f30366a;
        }
        return "valid:" + this.f30366a + ", IronSourceError:" + this.f30367b;
    }
}
