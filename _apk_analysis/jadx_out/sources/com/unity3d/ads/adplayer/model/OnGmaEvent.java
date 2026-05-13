package com.unity3d.ads.adplayer.model;

import com.unity3d.scar.adapter.common.GMAEvent;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: WebViewEvent.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class OnGmaEvent implements WebViewEvent {

    @NotNull
    private final String category;

    @NotNull
    private final String name;

    @NotNull
    private final Object[] parameters;

    public OnGmaEvent(@NotNull GMAEvent gMAEvent) {
        p.k(gMAEvent, "gmaEvent");
        this.category = "GMA";
        this.name = gMAEvent.name();
        this.parameters = new Object[0];
    }

    @Override // com.unity3d.ads.adplayer.model.WebViewEvent
    @NotNull
    public String getCategory() {
        return this.category;
    }

    @Override // com.unity3d.ads.adplayer.model.WebViewEvent
    @NotNull
    public String getName() {
        return this.name;
    }

    @Override // com.unity3d.ads.adplayer.model.WebViewEvent
    @NotNull
    public Object[] getParameters() {
        return this.parameters;
    }
}
