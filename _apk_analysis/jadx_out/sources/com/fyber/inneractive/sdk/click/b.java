package com.fyber.inneractive.sdk.click;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f15909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Throwable f15910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f15911c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f15912d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f15913e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f15914f = new ArrayList();

    public b(String str, q qVar, String str2, Exception exc) {
        this.f15912d = str;
        this.f15909a = qVar;
        this.f15911c = str2;
        this.f15910b = exc;
    }

    public final String toString() {
        q qVar = this.f15909a;
        if (qVar == q.FAILED) {
            Throwable th2 = this.f15910b;
            return "Open result: Failed! error: " + (th2 != null ? th2.getMessage() : "none");
        }
        return "Open result: Success! target: " + qVar + " method: " + this.f15911c;
    }
}
