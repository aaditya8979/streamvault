package com.inmobi.media;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.z9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class RunnableC3904z9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ JSONObject f28628a;

    public RunnableC3904z9(JSONObject jSONObject) {
        this.f28628a = jSONObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (Ok.c()) {
            return;
        }
        F9.a(this.f28628a);
    }
}
