package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist;

import com.fyber.inneractive.sdk.player.exoplayer2.o;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f17574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f17575c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f17576d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o f17577e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f17578f;

    public b(String str, List list, List list2, List list3, o oVar, List list4) {
        super(str);
        this.f17574b = Collections.unmodifiableList(list);
        this.f17575c = Collections.unmodifiableList(list2);
        this.f17576d = Collections.unmodifiableList(list3);
        this.f17577e = oVar;
        this.f17578f = list4 != null ? Collections.unmodifiableList(list4) : null;
    }
}
