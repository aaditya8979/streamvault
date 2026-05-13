package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.HashSet;

/* JADX INFO: loaded from: classes4.dex */
public final class F6 implements DataSendingRestrictionController {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D6 f65238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Boolean f65239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashSet f65240c = new HashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashSet f65241d = new HashSet();

    public F6(@NonNull D6 d62) {
        this.f65238a = d62;
        this.f65239b = ((E6) d62).a();
    }

    public final synchronized void a(@Nullable Boolean bool) {
        if (mo.a(bool) || this.f65239b == null) {
            Boolean boolValueOf = Boolean.valueOf(Boolean.FALSE.equals(bool));
            this.f65239b = boolValueOf;
            D6 d62 = this.f65238a;
            ((E6) d62).f65175a.c(boolValueOf.booleanValue()).b();
        }
    }

    public final synchronized void a(@NonNull String str, @Nullable Boolean bool) {
        if (mo.a(bool) || (!this.f65241d.contains(str) && !this.f65240c.contains(str))) {
            if (((Boolean) WrapUtils.getOrDefault(bool, Boolean.TRUE)).booleanValue()) {
                this.f65241d.add(str);
                this.f65240c.remove(str);
            } else {
                this.f65240c.add(str);
                this.f65241d.remove(str);
            }
        }
    }

    public final synchronized void b(@Nullable Boolean bool) {
        if (this.f65239b == null) {
            a(bool);
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController
    public final synchronized boolean isRestrictedForMainReporter() {
        return Boolean.TRUE.equals(this.f65239b);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0016  */
    @Override // io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean isRestrictedForReporter(@androidx.annotation.NonNull java.lang.String r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.HashSet r0 = r1.f65240c     // Catch: java.lang.Throwable -> L19
            boolean r2 = r0.contains(r2)     // Catch: java.lang.Throwable -> L19
            if (r2 != 0) goto L16
            java.lang.Boolean r2 = r1.f65239b     // Catch: java.lang.Throwable -> L19
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L19
            boolean r2 = r0.equals(r2)     // Catch: java.lang.Throwable -> L19
            if (r2 == 0) goto L14
            goto L16
        L14:
            r2 = 0
            goto L17
        L16:
            r2 = 1
        L17:
            monitor-exit(r1)
            return r2
        L19:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.F6.isRestrictedForReporter(java.lang.String):boolean");
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController
    public final synchronized boolean isRestrictedForSdk() {
        Boolean bool;
        bool = this.f65239b;
        return bool == null ? this.f65241d.isEmpty() : bool.booleanValue();
    }
}
