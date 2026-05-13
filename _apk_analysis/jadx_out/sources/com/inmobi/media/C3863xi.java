package com.inmobi.media;

import com.inmobi.media.ads.network.inmobiJson.model.MainLink;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: com.inmobi.media.xi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3863xi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f28529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MainLink f28530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f28531c;

    public C3863xi(LinkedHashMap linkedHashMap, MainLink mainLink, List list) {
        tn.p.k(linkedHashMap, "assetIdToLinkMap");
        tn.p.k(list, "responseClickTrackers");
        this.f28529a = linkedHashMap;
        this.f28530b = mainLink;
        this.f28531c = list;
    }
}
