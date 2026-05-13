package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Bd implements InterfaceC4793fo, InterfaceC4874j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f65037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f65038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final to f65039c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final K2 f65040d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public PublicLogger f65041e = PublicLogger.getAnonymousInstance();

    public Bd(int i10, String str, to toVar, K2 k22) {
        this.f65038b = i10;
        this.f65037a = str;
        this.f65039c = toVar;
        this.f65040d = k22;
    }

    @NonNull
    public final C4819go a() {
        C4819go c4819go = new C4819go();
        c4819go.f66881b = this.f65038b;
        c4819go.f66880a = this.f65037a.getBytes();
        c4819go.f66883d = new C4870io();
        c4819go.f66882c = new C4845ho();
        return c4819go;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4793fo
    public abstract /* synthetic */ void a(@NonNull C4767eo c4767eo);

    @Override // io.appmetrica.analytics.impl.InterfaceC4793fo
    public final void a(@NonNull PublicLogger publicLogger) {
        this.f65041e = publicLogger;
    }

    @NonNull
    public final K2 b() {
        return this.f65040d;
    }

    @NonNull
    public final String c() {
        return this.f65037a;
    }

    @NonNull
    @VisibleForTesting
    public final to d() {
        return this.f65039c;
    }

    public final int e() {
        return this.f65038b;
    }

    public final boolean f() {
        ro roVarA = this.f65039c.a(this.f65037a);
        if (roVarA.f67631a) {
            return true;
        }
        this.f65041e.warning("Attribute " + this.f65037a + " of type " + ((String) Pn.f65775a.get(this.f65038b)) + " is skipped because " + roVarA.f67632b, new Object[0]);
        return false;
    }
}
