package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f18749a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map f18750b;

    public final synchronized Map a() {
        if (this.f18750b == null) {
            this.f18750b = Collections.unmodifiableMap(new HashMap(this.f18749a));
        }
        return this.f18750b;
    }
}
